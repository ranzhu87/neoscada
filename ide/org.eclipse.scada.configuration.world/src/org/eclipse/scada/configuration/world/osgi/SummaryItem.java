/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.osgi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summary Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.SummaryItem#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getSummaryItem()
 * @model
 * @generated
 */
public interface SummaryItem extends Item
{
    /**
     * Returns the value of the '<em><b>Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' reference.
     * @see #setGroup(SummaryGroup)
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getSummaryItem_Group()
     * @model required="true"
     * @generated
     */
    SummaryGroup getGroup ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.world.osgi.SummaryItem#getGroup <em>Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' reference.
     * @see #getGroup()
     * @generated
     */
    void setGroup ( SummaryGroup value );

} // SummaryItem
