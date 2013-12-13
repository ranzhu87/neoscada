/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.component.parts;

// Start of user code for imports



// End of user code

/**
 * @author IBH SYSTEMS GmbH
 * 
 */
public interface SummariesConfigurationPropertiesEditionPart {

	/**
	 * @return the itemThreshold
	 * 
	 */
	public String getItemThreshold();

	/**
	 * Defines a new itemThreshold
	 * @param newValue the new itemThreshold to set
	 * 
	 */
	public void setItemThreshold(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
