/*******************************************************************************
 * Copyright (c) 2009, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.ui.connection;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.scada.core.ui.connection.data.ConnectionHolder;
import org.eclipse.scada.da.ui.connection.internal.FolderEntryWrapper;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin
{

    // The plug-in ID
    public static final String PLUGIN_ID = "org.eclipse.scada.da.ui.connection";

    // The shared instance
    private static Activator plugin;

    private final Map<Class<?>, IAdapterFactory> adaperFactories = new HashMap<Class<?>, IAdapterFactory> ();

    /**
     * The constructor
     */
    public Activator ()
    {
        this.adaperFactories.put ( ConnectionHolder.class, new ConnectionHolderAdapterFactory () );
        this.adaperFactories.put ( FolderEntryWrapper.class, new FolderEntryWrapperAdapterFactory () );
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start ( final BundleContext context ) throws Exception
    {
        super.start ( context );

        for ( final Map.Entry<Class<?>, IAdapterFactory> entry : this.adaperFactories.entrySet () )
        {
            Platform.getAdapterManager ().registerAdapters ( entry.getValue (), entry.getKey () );
        }

        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop ( final BundleContext context ) throws Exception
    {
        plugin = null;

        for ( final Map.Entry<Class<?>, IAdapterFactory> entry : this.adaperFactories.entrySet () )
        {
            Platform.getAdapterManager ().registerAdapters ( entry.getValue (), entry.getKey () );
        }

        super.stop ( context );
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static Activator getDefault ()
    {
        return plugin;
    }

}
