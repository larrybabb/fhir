/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.hl7.fhir.definitions.ecore.fhir.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.definitions.ecore.fhir.BindingDefn;
import org.hl7.fhir.definitions.ecore.fhir.CompositeTypeDefn;
import org.hl7.fhir.definitions.ecore.fhir.ConstrainedTypeDefn;
import org.hl7.fhir.definitions.ecore.fhir.Binding;
import org.hl7.fhir.definitions.ecore.fhir.Constraint;
import org.hl7.fhir.definitions.ecore.fhir.Definitions;
import org.hl7.fhir.definitions.ecore.fhir.ElementDefn;
import org.hl7.fhir.definitions.ecore.fhir.EventDefn;
import org.hl7.fhir.definitions.ecore.fhir.FhirFactory;
import org.hl7.fhir.definitions.ecore.fhir.FhirPackage;
import org.hl7.fhir.definitions.ecore.fhir.NameScope;
import org.hl7.fhir.definitions.ecore.fhir.PrimitiveTypeDefn;
import org.hl7.fhir.definitions.ecore.fhir.ProfileDefn;
import org.hl7.fhir.definitions.ecore.fhir.ResourceDefn;
import org.hl7.fhir.definitions.ecore.fhir.TypeDefn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.impl.DefinitionsImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.impl.DefinitionsImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.impl.DefinitionsImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.impl.DefinitionsImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.impl.DefinitionsImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.impl.DefinitionsImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link org.hl7.fhir.definitions.ecore.fhir.impl.DefinitionsImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends EObjectImpl implements Definitions {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingDefn> bindings;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefn> types;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected NameScope parent;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileDefn> profiles;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefn> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.Literals.DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingDefn> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<BindingDefn>(BindingDefn.class, this, FhirPackage.DEFINITIONS__BINDINGS, FhirPackage.BINDING_DEFN__CONTAINER);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEFINITIONS__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEFINITIONS__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefn> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TypeDefn>(TypeDefn.class, this, FhirPackage.DEFINITIONS__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameScope getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (NameScope)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirPackage.DEFINITIONS__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameScope basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NameScope newParent) {
		NameScope oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEFINITIONS__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDefn> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<EventDefn>(EventDefn.class, this, FhirPackage.DEFINITIONS__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileDefn> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentEList<ProfileDefn>(ProfileDefn.class, this, FhirPackage.DEFINITIONS__PROFILES);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefn resolveType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefn> getTypeByName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefn> filterTypes(String name, String scope, String typeKind) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDefn resolveBinding() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDefn getBindingByName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEFINITIONS__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEFINITIONS__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEFINITIONS__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEFINITIONS__PROFILES:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEFINITIONS__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.DEFINITIONS__BINDINGS:
				return getBindings();
			case FhirPackage.DEFINITIONS__TYPES:
				return getTypes();
			case FhirPackage.DEFINITIONS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case FhirPackage.DEFINITIONS__DATE:
				return getDate();
			case FhirPackage.DEFINITIONS__VERSION:
				return getVersion();
			case FhirPackage.DEFINITIONS__PROFILES:
				return getProfiles();
			case FhirPackage.DEFINITIONS__EVENTS:
				return getEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.DEFINITIONS__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends BindingDefn>)newValue);
				return;
			case FhirPackage.DEFINITIONS__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeDefn>)newValue);
				return;
			case FhirPackage.DEFINITIONS__PARENT:
				setParent((NameScope)newValue);
				return;
			case FhirPackage.DEFINITIONS__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.DEFINITIONS__VERSION:
				setVersion((String)newValue);
				return;
			case FhirPackage.DEFINITIONS__PROFILES:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends ProfileDefn>)newValue);
				return;
			case FhirPackage.DEFINITIONS__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EventDefn>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.DEFINITIONS__BINDINGS:
				getBindings().clear();
				return;
			case FhirPackage.DEFINITIONS__TYPES:
				getTypes().clear();
				return;
			case FhirPackage.DEFINITIONS__PARENT:
				setParent((NameScope)null);
				return;
			case FhirPackage.DEFINITIONS__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FhirPackage.DEFINITIONS__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case FhirPackage.DEFINITIONS__PROFILES:
				getProfiles().clear();
				return;
			case FhirPackage.DEFINITIONS__EVENTS:
				getEvents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.DEFINITIONS__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case FhirPackage.DEFINITIONS__TYPES:
				return types != null && !types.isEmpty();
			case FhirPackage.DEFINITIONS__PARENT:
				return parent != null;
			case FhirPackage.DEFINITIONS__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case FhirPackage.DEFINITIONS__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case FhirPackage.DEFINITIONS__PROFILES:
				return profiles != null && !profiles.isEmpty();
			case FhirPackage.DEFINITIONS__EVENTS:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}
	
	
	public static Definitions build( Date date, String version )
	{
		Definitions result = FhirFactory.eINSTANCE.createDefinitions();
		
		result.setDate(date);
		result.setVersion(version);
		
		return result;
	}

} //DefinitionsImpl