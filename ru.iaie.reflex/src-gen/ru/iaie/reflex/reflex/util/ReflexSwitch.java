/**
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.reflex.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.iaie.reflex.reflex.AssignStat;
import ru.iaie.reflex.reflex.Body;
import ru.iaie.reflex.reflex.CType;
import ru.iaie.reflex.reflex.CaseStat;
import ru.iaie.reflex.reflex.Condition;
import ru.iaie.reflex.reflex.Const;
import ru.iaie.reflex.reflex.DeclaredVariable;
import ru.iaie.reflex.reflex.EnumMember;
import ru.iaie.reflex.reflex.ErrorStat;
import ru.iaie.reflex.reflex.Expression;
import ru.iaie.reflex.reflex.Function;
import ru.iaie.reflex.reflex.IfElseStat;
import ru.iaie.reflex.reflex.ImportedVariable;
import ru.iaie.reflex.reflex.PhysicalVariable;
import ru.iaie.reflex.reflex.Program;
import ru.iaie.reflex.reflex.ProgramVariable;
import ru.iaie.reflex.reflex.ReflexPackage;
import ru.iaie.reflex.reflex.ReflexType;
import ru.iaie.reflex.reflex.Register;
import ru.iaie.reflex.reflex.RegisterPort;
import ru.iaie.reflex.reflex.SetStateStat;
import ru.iaie.reflex.reflex.StartProcStat;
import ru.iaie.reflex.reflex.State;
import ru.iaie.reflex.reflex.StateFunction;
import ru.iaie.reflex.reflex.StopProcStat;
import ru.iaie.reflex.reflex.SwitchStat;
import ru.iaie.reflex.reflex.Time;
import ru.iaie.reflex.reflex.TimeoutFunction;
import ru.iaie.reflex.reflex.Variable;
import ru.iaie.reflex.reflex.Visibility;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.iaie.reflex.reflex.ReflexPackage
 * @generated
 */
public class ReflexSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ReflexPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflexSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ReflexPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ReflexPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.PROCESS:
      {
        ru.iaie.reflex.reflex.Process process = (ru.iaie.reflex.reflex.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.IMPORTED_VARIABLE:
      {
        ImportedVariable importedVariable = (ImportedVariable)theEObject;
        T result = caseImportedVariable(importedVariable);
        if (result == null) result = caseVariable(importedVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.DECLARED_VARIABLE:
      {
        DeclaredVariable declaredVariable = (DeclaredVariable)theEObject;
        T result = caseDeclaredVariable(declaredVariable);
        if (result == null) result = caseVariable(declaredVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.PHYSICAL_VARIABLE:
      {
        PhysicalVariable physicalVariable = (PhysicalVariable)theEObject;
        T result = casePhysicalVariable(physicalVariable);
        if (result == null) result = caseDeclaredVariable(physicalVariable);
        if (result == null) result = caseVariable(physicalVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.REGISTER_PORT:
      {
        RegisterPort registerPort = (RegisterPort)theEObject;
        T result = caseRegisterPort(registerPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.PROGRAM_VARIABLE:
      {
        ProgramVariable programVariable = (ProgramVariable)theEObject;
        T result = caseProgramVariable(programVariable);
        if (result == null) result = caseDeclaredVariable(programVariable);
        if (result == null) result = caseVariable(programVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.VISIBILITY:
      {
        Visibility visibility = (Visibility)theEObject;
        T result = caseVisibility(visibility);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.STATE_FUNCTION:
      {
        StateFunction stateFunction = (StateFunction)theEObject;
        T result = caseStateFunction(stateFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.TIMEOUT_FUNCTION:
      {
        TimeoutFunction timeoutFunction = (TimeoutFunction)theEObject;
        T result = caseTimeoutFunction(timeoutFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.ASSIGN_STAT:
      {
        AssignStat assignStat = (AssignStat)theEObject;
        T result = caseAssignStat(assignStat);
        if (result == null) result = caseBody(assignStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.IF_ELSE_STAT:
      {
        IfElseStat ifElseStat = (IfElseStat)theEObject;
        T result = caseIfElseStat(ifElseStat);
        if (result == null) result = caseBody(ifElseStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.SWITCH_STAT:
      {
        SwitchStat switchStat = (SwitchStat)theEObject;
        T result = caseSwitchStat(switchStat);
        if (result == null) result = caseBody(switchStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.CASE_STAT:
      {
        CaseStat caseStat = (CaseStat)theEObject;
        T result = caseCaseStat(caseStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.START_PROC_STAT:
      {
        StartProcStat startProcStat = (StartProcStat)theEObject;
        T result = caseStartProcStat(startProcStat);
        if (result == null) result = caseBody(startProcStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.STOP_PROC_STAT:
      {
        StopProcStat stopProcStat = (StopProcStat)theEObject;
        T result = caseStopProcStat(stopProcStat);
        if (result == null) result = caseBody(stopProcStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.ERROR_STAT:
      {
        ErrorStat errorStat = (ErrorStat)theEObject;
        T result = caseErrorStat(errorStat);
        if (result == null) result = caseBody(errorStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.SET_STATE_STAT:
      {
        SetStateStat setStateStat = (SetStateStat)theEObject;
        T result = caseSetStateStat(setStateStat);
        if (result == null) result = caseBody(setStateStat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.REGISTER:
      {
        Register register = (Register)theEObject;
        T result = caseRegister(register);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.CONST:
      {
        Const const_ = (Const)theEObject;
        T result = caseConst(const_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.ENUM:
      {
        ru.iaie.reflex.reflex.Enum enum_ = (ru.iaie.reflex.reflex.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.ENUM_MEMBER:
      {
        EnumMember enumMember = (EnumMember)theEObject;
        T result = caseEnumMember(enumMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.CTYPE:
      {
        CType cType = (CType)theEObject;
        T result = caseCType(cType);
        if (result == null) result = caseReflexType(cType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.REFLEX_TYPE:
      {
        ReflexType reflexType = (ReflexType)theEObject;
        T result = caseReflexType(reflexType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.TIME:
      {
        Time time = (Time)theEObject;
        T result = caseTime(time);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReflexPackage.INTEGER:
      {
        ru.iaie.reflex.reflex.Integer integer = (ru.iaie.reflex.reflex.Integer)theEObject;
        T result = caseInteger(integer);
        if (result == null) result = caseExpression(integer);
        if (result == null) result = caseCondition(integer);
        if (result == null) result = caseTime(integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(ru.iaie.reflex.reflex.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedVariable(ImportedVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declared Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declared Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaredVariable(DeclaredVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Physical Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Physical Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhysicalVariable(PhysicalVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Register Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Register Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegisterPort(RegisterPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgramVariable(ProgramVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visibility</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visibility</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisibility(Visibility object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateFunction(StateFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timeout Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timeout Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeoutFunction(TimeoutFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignStat(AssignStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Else Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Else Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfElseStat(IfElseStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchStat(SwitchStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStat(CaseStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Proc Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Proc Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartProcStat(StartProcStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stop Proc Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stop Proc Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStopProcStat(StopProcStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorStat(ErrorStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set State Stat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set State Stat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetStateStat(SetStateStat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Register</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegister(Register object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConst(Const object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(ru.iaie.reflex.reflex.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumMember(EnumMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CType</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCType(CType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReflexType(ReflexType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTime(Time object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger(ru.iaie.reflex.reflex.Integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ReflexSwitch
