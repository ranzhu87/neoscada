/*******************************************************************************
 * Copyright (c) 2009, 2010 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.server.exec;

import org.eclipse.scada.utils.statuscodes.SeverityLevel;
import org.eclipse.scada.utils.statuscodes.StatusCode;

public class StatusCodes
{
    public final static StatusCode TRIGGER_RUNNING = new StatusCode ( "OSEX", "TRIGGER", 0x00001, SeverityLevel.ERROR );
}
