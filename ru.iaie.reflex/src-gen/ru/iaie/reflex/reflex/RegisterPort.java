/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.RegisterPort#getRegName <em>Reg Name</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.RegisterPort#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getRegisterPort()
 * @model
 * @generated
 */
public interface RegisterPort extends EObject
{
  /**
   * Returns the value of the '<em><b>Reg Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg Name</em>' attribute.
   * @see #setRegName(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getRegisterPort_RegName()
   * @model
   * @generated
   */
  String getRegName();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.RegisterPort#getRegName <em>Reg Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg Name</em>' attribute.
   * @see #getRegName()
   * @generated
   */
  void setRegName(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(ru.iaie.reflex.reflex.Integer)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getRegisterPort_Port()
   * @model containment="true"
   * @generated
   */
  ru.iaie.reflex.reflex.Integer getPort();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.RegisterPort#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(ru.iaie.reflex.reflex.Integer value);

} // RegisterPort
