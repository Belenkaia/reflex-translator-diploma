/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Proc Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.StopProcStat#isProcId <em>Proc Id</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getStopProcStat()
 * @model
 * @generated
 */
public interface StopProcStat extends Body
{
  /**
   * Returns the value of the '<em><b>Proc Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc Id</em>' attribute.
   * @see #setProcId(boolean)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getStopProcStat_ProcId()
   * @model
   * @generated
   */
  boolean isProcId();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.StopProcStat#isProcId <em>Proc Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc Id</em>' attribute.
   * @see #isProcId()
   * @generated
   */
  void setProcId(boolean value);

} // StopProcStat
