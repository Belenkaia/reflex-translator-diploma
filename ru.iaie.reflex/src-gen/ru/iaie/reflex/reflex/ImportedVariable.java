/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.ImportedVariable#getProcId <em>Proc Id</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.ImportedVariable#getVarNames <em>Var Names</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getImportedVariable()
 * @model
 * @generated
 */
public interface ImportedVariable extends Variable
{
  /**
   * Returns the value of the '<em><b>Proc Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc Id</em>' attribute.
   * @see #setProcId(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getImportedVariable_ProcId()
   * @model
   * @generated
   */
  String getProcId();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.ImportedVariable#getProcId <em>Proc Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc Id</em>' attribute.
   * @see #getProcId()
   * @generated
   */
  void setProcId(String value);

  /**
   * Returns the value of the '<em><b>Var Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Names</em>' attribute list.
   * @see ru.iaie.reflex.reflex.ReflexPackage#getImportedVariable_VarNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getVarNames();

} // ImportedVariable
