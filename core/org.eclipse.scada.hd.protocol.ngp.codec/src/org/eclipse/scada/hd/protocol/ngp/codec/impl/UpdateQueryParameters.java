/*******************************************************************************
 * Copyright (c) 2010, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *     Jens Reimann - implement security callback system
 *******************************************************************************/
package org.eclipse.scada.hd.protocol.ngp.codec.impl;

import org.apache.mina.core.buffer.IoBuffer;
import org.eclipse.scada.core.ngp.common.codec.osbp.BinaryContext;
import org.eclipse.scada.core.ngp.common.codec.osbp.BinaryMessageCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateQueryParameters implements BinaryMessageCodec
{
    private final static Logger logger = LoggerFactory.getLogger ( UpdateQueryParameters.class );

    public static final int MESSAGE_CODE = 12294;

    @Override
    public int getMessageCode ()
    {
        return MESSAGE_CODE;
    }

    @Override
    public Class<?> getMessageClass ()
    {
        return org.eclipse.scada.hd.data.message.UpdateQueryParameters.class;
    }

    @Override
    public org.eclipse.scada.hd.data.message.UpdateQueryParameters decodeMessage ( final BinaryContext _context, final IoBuffer _data ) throws Exception
    {
        // message code
        {
            final int messageCode = _data.getInt ();

            if ( messageCode != MESSAGE_CODE )
            {
                throw new IllegalStateException ( String.format ( "Expected messageCode %s but found %s", MESSAGE_CODE, messageCode ) );
            }
        }

        final byte numberOfFields = _data.get ();

        // decode attributes

        long queryId = 0L;
        org.eclipse.scada.hd.data.QueryParameters queryParameters = null;
        java.util.Set<String> valueTypes = null;

        logger.trace ( "Decoding {} fields", numberOfFields );

        for ( int i = 0; i < numberOfFields; i++ )
        {

            final byte fieldNumber = _data.get ();
            switch ( fieldNumber )
            {
                case 1:
                {
                    queryId = _context.decodePrimitiveLong ( _data );
                }
                    break;
                case 2:
                {
                    queryParameters = org.eclipse.scada.hd.protocol.ngp.codec.Structures.decodeQueryParameters ( _context, _data, false );
                }
                    break;
                case 3:
                {
                    valueTypes = _context.decodeStringSet ( _data );
                }
                    break;
                default:
                    logger.warn ( "Received unknown field number: {}", fieldNumber );
                    break;
            }

        }

        // create object
        return new org.eclipse.scada.hd.data.message.UpdateQueryParameters ( queryId, queryParameters, valueTypes );
    }

    @Override
    public IoBuffer encodeMessage ( final BinaryContext context, final Object objectMessage ) throws Exception
    {
        final org.eclipse.scada.hd.data.message.UpdateQueryParameters value = (org.eclipse.scada.hd.data.message.UpdateQueryParameters)objectMessage;

        final IoBuffer data = IoBuffer.allocate ( 64 );
        data.setAutoExpand ( true );

        // encode message base
        data.putInt ( MESSAGE_CODE );

        // number of fields 
        data.put ( (byte)3 );

        // encode attributes
        context.encodePrimitiveLong ( data, (byte)1, value.getQueryId () );
        org.eclipse.scada.hd.protocol.ngp.codec.Structures.encodeQueryParameters ( context, data, (byte)2, value.getQueryParameters () );
        context.encodeStringCollection ( data, (byte)3, value.getValueTypes () );

        data.flip ();
        return data;
    }

}
