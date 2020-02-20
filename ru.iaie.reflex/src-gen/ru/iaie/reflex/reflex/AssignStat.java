/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.AssignStat#getVarId <em>Var Id</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.AssignStat#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getAssignStat()
 * @model
 * @generated
 */
public interface AssignStat extends Body
{
  /**
   * Returns the value of the '<em><b>Var Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Id</em>' attribute.
   * @see #setVarId(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getAssignStat_VarId()
   * @model
   * @generated
   */
  String getVarId();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.AssignStat#getVarId <em>Var Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Id</em>' attribute.
   * @see #getVarId()
   * @generated
   */
  void setVarId(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getAssignStat_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.AssignStat#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // AssignStat
