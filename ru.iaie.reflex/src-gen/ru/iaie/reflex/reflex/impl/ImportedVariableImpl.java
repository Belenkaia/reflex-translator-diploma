/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import ru.iaie.reflex.reflex.ImportedVariable;
import ru.iaie.reflex.reflex.ReflexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ImportedVariableImpl#getProcId <em>Proc Id</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ImportedVariableImpl#getVarNames <em>Var Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportedVariableImpl extends VariableImpl implements ImportedVariable
{
  /**
   * The default value of the '{@link #getProcId() <em>Proc Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcId()
   * @generated
   * @ordered
   */
  protected static final String PROC_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcId() <em>Proc Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcId()
   * @generated
   * @ordered
   */
  protected String procId = PROC_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarNames() <em>Var Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarNames()
   * @generated
   * @ordered
   */
  protected EList<String> varNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportedVariableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReflexPackage.Literals.IMPORTED_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProcId()
  {
    return procId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcId(String newProcId)
  {
    String oldProcId = procId;
    procId = newProcId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.IMPORTED_VARIABLE__PROC_ID, oldProcId, procId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVarNames()
  {
    if (varNames == null)
    {
      varNames = new EDataTypeEList<String>(String.class, this, ReflexPackage.IMPORTED_VARIABLE__VAR_NAMES);
    }
    return varNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReflexPackage.IMPORTED_VARIABLE__PROC_ID:
        return getProcId();
      case ReflexPackage.IMPORTED_VARIABLE__VAR_NAMES:
        return getVarNames();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReflexPackage.IMPORTED_VARIABLE__PROC_ID:
        setProcId((String)newValue);
        return;
      case ReflexPackage.IMPORTED_VARIABLE__VAR_NAMES:
        getVarNames().clear();
        getVarNames().addAll((Collection<? extends String>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReflexPackage.IMPORTED_VARIABLE__PROC_ID:
        setProcId(PROC_ID_EDEFAULT);
        return;
      case ReflexPackage.IMPORTED_VARIABLE__VAR_NAMES:
        getVarNames().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReflexPackage.IMPORTED_VARIABLE__PROC_ID:
        return PROC_ID_EDEFAULT == null ? procId != null : !PROC_ID_EDEFAULT.equals(procId);
      case ReflexPackage.IMPORTED_VARIABLE__VAR_NAMES:
        return varNames != null && !varNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (procId: ");
    result.append(procId);
    result.append(", varNames: ");
    result.append(varNames);
    result.append(')');
    return result.toString();
  }

} //ImportedVariableImpl
