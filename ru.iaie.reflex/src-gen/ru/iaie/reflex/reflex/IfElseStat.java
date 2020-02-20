/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.IfElseStat#getCond <em>Cond</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.IfElseStat#getThen <em>Then</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.IfElseStat#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getIfElseStat()
 * @model
 * @generated
 */
public interface IfElseStat extends Body
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Condition)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getIfElseStat_Cond()
   * @model containment="true"
   * @generated
   */
  Condition getCond();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.IfElseStat#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Condition value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Body)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getIfElseStat_Then()
   * @model containment="true"
   * @generated
   */
  Body getThen();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.IfElseStat#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Body value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Body)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getIfElseStat_Else()
   * @model containment="true"
   * @generated
   */
  Body getElse();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.IfElseStat#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Body value);

} // IfElseStat