/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.Function#getName <em>Name</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.Function#getArgTypes <em>Arg Types</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(CType)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction_ReturnType()
   * @model containment="true"
   * @generated
   */
  CType getReturnType();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.Function#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(CType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arg Types</b></em>' containment reference list.
   * The list contents are of type {@link ru.iaie.reflex.reflex.CType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Types</em>' containment reference list.
   * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction_ArgTypes()
   * @model containment="true"
   * @generated
   */
  EList<CType> getArgTypes();

} // Function
