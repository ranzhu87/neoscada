/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.world.deployment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.world.deployment.DeploymentFactory;
import org.eclipse.scada.configuration.world.deployment.MsiDeploymentMechanism;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Msi Deployment Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsiDeploymentMechanismTest extends TestCase
{

    /**
     * The fixture for this Msi Deployment Mechanism test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MsiDeploymentMechanism fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( MsiDeploymentMechanismTest.class );
    }

    /**
     * Constructs a new Msi Deployment Mechanism test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MsiDeploymentMechanismTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Msi Deployment Mechanism test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( MsiDeploymentMechanism fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Msi Deployment Mechanism test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MsiDeploymentMechanism getFixture ()
    {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( DeploymentFactory.eINSTANCE.createMsiDeploymentMechanism () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //MsiDeploymentMechanismTest
