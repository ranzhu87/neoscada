/*******************************************************************************
 * Copyright (c) 2011, 2012 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.vi.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.scada.vi.model.Position;
import org.eclipse.scada.vi.model.VisualInterfacePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.scada.vi.model.Position} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class PositionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PositionItemProvider ( AdapterFactory adapterFactory )
    {
        super ( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors ( Object object )
    {
        if ( itemPropertyDescriptors == null )
        {
            super.getPropertyDescriptors ( object );

            addXPropertyDescriptor ( object );
            addYPropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Position_x_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_Position_x_feature", "_UI_Position_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                VisualInterfacePackage.Literals.POSITION__X, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Y feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void addYPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Position_y_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_Position_y_feature", "_UI_Position_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                VisualInterfacePackage.Literals.POSITION__Y, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns Position.gif.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/Position" ) ); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    @Override
    public String getText ( final Object object )
    {
        final Position position = (Position)object;
        return getString ( "_UI_Position_type" ) + " " + position.getX () + "x" + position.getY (); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged ( Notification notification )
    {
        updateChildren ( notification );

        switch ( notification.getFeatureID ( Position.class ) )
        {
            case VisualInterfacePackage.POSITION__X:
            case VisualInterfacePackage.POSITION__Y:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
        }
        super.notifyChanged ( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors ( Collection<Object> newChildDescriptors, Object object )
    {
        super.collectNewChildDescriptors ( newChildDescriptors, object );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return ( (IChildCreationExtender)adapterFactory ).getResourceLocator ();
    }

}
