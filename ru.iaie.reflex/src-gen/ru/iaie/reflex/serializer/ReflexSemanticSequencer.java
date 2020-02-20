/*
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ru.iaie.reflex.reflex.AssignStat;
import ru.iaie.reflex.reflex.Body;
import ru.iaie.reflex.reflex.CType;
import ru.iaie.reflex.reflex.CaseStat;
import ru.iaie.reflex.reflex.Const;
import ru.iaie.reflex.reflex.EnumMember;
import ru.iaie.reflex.reflex.ErrorStat;
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
import ru.iaie.reflex.reflex.TimeoutFunction;
import ru.iaie.reflex.reflex.Visibility;
import ru.iaie.reflex.services.ReflexGrammarAccess;

@SuppressWarnings("all")
public class ReflexSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReflexGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ReflexPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ReflexPackage.ASSIGN_STAT:
				sequence_AssignStat(context, (AssignStat) semanticObject); 
				return; 
			case ReflexPackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case ReflexPackage.CTYPE:
				sequence_CType(context, (CType) semanticObject); 
				return; 
			case ReflexPackage.CASE_STAT:
				sequence_CaseStat(context, (CaseStat) semanticObject); 
				return; 
			case ReflexPackage.CONST:
				sequence_Const(context, (Const) semanticObject); 
				return; 
			case ReflexPackage.ENUM:
				sequence_Enum(context, (ru.iaie.reflex.reflex.Enum) semanticObject); 
				return; 
			case ReflexPackage.ENUM_MEMBER:
				sequence_EnumMember(context, (EnumMember) semanticObject); 
				return; 
			case ReflexPackage.ERROR_STAT:
				sequence_ErrorStat(context, (ErrorStat) semanticObject); 
				return; 
			case ReflexPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case ReflexPackage.IF_ELSE_STAT:
				sequence_IfElseStat(context, (IfElseStat) semanticObject); 
				return; 
			case ReflexPackage.IMPORTED_VARIABLE:
				sequence_ImportedVariable(context, (ImportedVariable) semanticObject); 
				return; 
			case ReflexPackage.INTEGER:
				sequence_Integer(context, (ru.iaie.reflex.reflex.Integer) semanticObject); 
				return; 
			case ReflexPackage.PHYSICAL_VARIABLE:
				if (rule == grammarAccess.getVariableRule()
						|| rule == grammarAccess.getDeclaredVariableRule()) {
					sequence_DeclaredVariable_PhysicalVariable(context, (PhysicalVariable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPhysicalVariableRule()) {
					sequence_PhysicalVariable(context, (PhysicalVariable) semanticObject); 
					return; 
				}
				else break;
			case ReflexPackage.PROCESS:
				sequence_Process(context, (ru.iaie.reflex.reflex.Process) semanticObject); 
				return; 
			case ReflexPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case ReflexPackage.PROGRAM_VARIABLE:
				if (rule == grammarAccess.getVariableRule()
						|| rule == grammarAccess.getDeclaredVariableRule()) {
					sequence_DeclaredVariable_ProgramVariable(context, (ProgramVariable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getProgramVariableRule()) {
					sequence_ProgramVariable(context, (ProgramVariable) semanticObject); 
					return; 
				}
				else break;
			case ReflexPackage.REFLEX_TYPE:
				sequence_ReflexType(context, (ReflexType) semanticObject); 
				return; 
			case ReflexPackage.REGISTER:
				sequence_Register(context, (Register) semanticObject); 
				return; 
			case ReflexPackage.REGISTER_PORT:
				sequence_RegisterPort(context, (RegisterPort) semanticObject); 
				return; 
			case ReflexPackage.SET_STATE_STAT:
				sequence_SetStateStat(context, (SetStateStat) semanticObject); 
				return; 
			case ReflexPackage.START_PROC_STAT:
				sequence_StartProcStat(context, (StartProcStat) semanticObject); 
				return; 
			case ReflexPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case ReflexPackage.STATE_FUNCTION:
				sequence_StateFunction(context, (StateFunction) semanticObject); 
				return; 
			case ReflexPackage.STOP_PROC_STAT:
				sequence_StopProcStat(context, (StopProcStat) semanticObject); 
				return; 
			case ReflexPackage.SWITCH_STAT:
				sequence_SwitchStat(context, (SwitchStat) semanticObject); 
				return; 
			case ReflexPackage.TIMEOUT_FUNCTION:
				sequence_TimeoutFunction(context, (TimeoutFunction) semanticObject); 
				return; 
			case ReflexPackage.VISIBILITY:
				sequence_Visibility(context, (Visibility) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Body returns AssignStat
	 *     AssignStat returns AssignStat
	 *
	 * Constraint:
	 *     (varId=ID expr=Expression)
	 */
	protected void sequence_AssignStat(ISerializationContext context, AssignStat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.ASSIGN_STAT__VAR_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.ASSIGN_STAT__VAR_ID));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.ASSIGN_STAT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.ASSIGN_STAT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignStatAccess().getVarIdIDTerminalRuleCall_0_0(), semanticObject.getVarId());
		feeder.accept(grammarAccess.getAssignStatAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Body returns Body
	 *
	 * Constraint:
	 *     sub+=Body*
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CType returns CType
	 *     ReflexType returns CType
	 *
	 * Constraint:
	 *     signSpec?=CTypeSignSpec?
	 */
	protected void sequence_CType(ISerializationContext context, CType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CaseStat returns CaseStat
	 *
	 * Constraint:
	 *     (option=Integer body=Body)
	 */
	protected void sequence_CaseStat(ISerializationContext context, CaseStat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.CASE_STAT__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.CASE_STAT__OPTION));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.CASE_STAT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.CASE_STAT__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseStatAccess().getOptionIntegerParserRuleCall_1_0(), semanticObject.getOption());
		feeder.accept(grammarAccess.getCaseStatAccess().getBodyBodyParserRuleCall_3_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Const returns Const
	 *
	 * Constraint:
	 *     (constId=ID constValue=Expression)
	 */
	protected void sequence_Const(ISerializationContext context, Const semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.CONST__CONST_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.CONST__CONST_ID));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.CONST__CONST_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.CONST__CONST_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstAccess().getConstIdIDTerminalRuleCall_1_0(), semanticObject.getConstId());
		feeder.accept(grammarAccess.getConstAccess().getConstValueExpressionParserRuleCall_2_0(), semanticObject.getConstValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns PhysicalVariable
	 *     DeclaredVariable returns PhysicalVariable
	 *
	 * Constraint:
	 *     (type=IntegerType name=ID ports+=RegisterPort ports+=RegisterPort* visibility=Visibility)
	 */
	protected void sequence_DeclaredVariable_PhysicalVariable(ISerializationContext context, PhysicalVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns ProgramVariable
	 *     DeclaredVariable returns ProgramVariable
	 *
	 * Constraint:
	 *     (type=ReflexType name=ID visibility=Visibility)
	 */
	protected void sequence_DeclaredVariable_ProgramVariable(ISerializationContext context, ProgramVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.PROGRAM_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.PROGRAM_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.DECLARED_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.DECLARED_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.DECLARED_VARIABLE__VISIBILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.DECLARED_VARIABLE__VISIBILITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramVariableAccess().getTypeReflexTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getProgramVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeclaredVariableAccess().getVisibilityVisibilityParserRuleCall_1_0(), semanticObject.getVisibility());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnumMember returns EnumMember
	 *
	 * Constraint:
	 *     (name=ID value=Expression)
	 */
	protected void sequence_EnumMember(ISerializationContext context, EnumMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.ENUM_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.ENUM_MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.ENUM_MEMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.ENUM_MEMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumMemberAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Enum returns Enum
	 *
	 * Constraint:
	 *     (enumMembers+=EnumMember enumMembers+=EnumMember*)
	 */
	protected void sequence_Enum(ISerializationContext context, ru.iaie.reflex.reflex.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Body returns ErrorStat
	 *     ErrorStat returns ErrorStat
	 *
	 * Constraint:
	 *     procId?=ID?
	 */
	protected void sequence_ErrorStat(ISerializationContext context, ErrorStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (returnType=CType name=ID argTypes+=CType argTypes+=CType*)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Body returns IfElseStat
	 *     IfElseStat returns IfElseStat
	 *
	 * Constraint:
	 *     (cond=Condition then=Body else=Body?)
	 */
	protected void sequence_IfElseStat(ISerializationContext context, IfElseStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns ImportedVariable
	 *     ImportedVariable returns ImportedVariable
	 *
	 * Constraint:
	 *     (procId=ID varNames+=ID*)
	 */
	protected void sequence_ImportedVariable(ISerializationContext context, ImportedVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Integer
	 *     Condition returns Integer
	 *     Time returns Integer
	 *     Integer returns Integer
	 *
	 * Constraint:
	 *     (value=DECIMAL | value=OCTAL | value=HEX)
	 */
	protected void sequence_Integer(ISerializationContext context, ru.iaie.reflex.reflex.Integer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PhysicalVariable returns PhysicalVariable
	 *
	 * Constraint:
	 *     (type=IntegerType name=ID ports+=RegisterPort ports+=RegisterPort*)
	 */
	protected void sequence_PhysicalVariable(ISerializationContext context, PhysicalVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (name=ID variable+=Variable* states+=State*)
	 */
	protected void sequence_Process(ISerializationContext context, ru.iaie.reflex.reflex.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProgramVariable returns ProgramVariable
	 *
	 * Constraint:
	 *     (type=ReflexType name=ID)
	 */
	protected void sequence_ProgramVariable(ISerializationContext context, ProgramVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.PROGRAM_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.PROGRAM_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.DECLARED_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.DECLARED_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramVariableAccess().getTypeReflexTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getProgramVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (name=ID ticks?=TACT? (consts+=Const | enums+=Enum | functions+=Function | registers+=Register | processes+=Process)*)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReflexType returns ReflexType
	 *
	 * Constraint:
	 *     {ReflexType}
	 */
	protected void sequence_ReflexType(ISerializationContext context, ReflexType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RegisterPort returns RegisterPort
	 *
	 * Constraint:
	 *     (regName=ID port=Integer)
	 */
	protected void sequence_RegisterPort(ISerializationContext context, RegisterPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.REGISTER_PORT__REG_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.REGISTER_PORT__REG_NAME));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.REGISTER_PORT__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.REGISTER_PORT__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegisterPortAccess().getRegNameIDTerminalRuleCall_0_0(), semanticObject.getRegName());
		feeder.accept(grammarAccess.getRegisterPortAccess().getPortIntegerParserRuleCall_2_0(), semanticObject.getPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Register returns Register
	 *
	 * Constraint:
	 *     (type=RegisterType name=ID addr1=Integer addr2=Integer regSize=REG_SIZE)
	 */
	protected void sequence_Register(ISerializationContext context, Register semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.REGISTER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.REGISTER__TYPE));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.REGISTER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.REGISTER__NAME));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.REGISTER__ADDR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.REGISTER__ADDR1));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.REGISTER__ADDR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.REGISTER__ADDR2));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.REGISTER__REG_SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.REGISTER__REG_SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegisterAccess().getTypeRegisterTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRegisterAccess().getAddr1IntegerParserRuleCall_2_0(), semanticObject.getAddr1());
		feeder.accept(grammarAccess.getRegisterAccess().getAddr2IntegerParserRuleCall_3_0(), semanticObject.getAddr2());
		feeder.accept(grammarAccess.getRegisterAccess().getRegSizeREG_SIZETerminalRuleCall_4_0(), semanticObject.getRegSize());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Body returns SetStateStat
	 *     SetStateStat returns SetStateStat
	 *
	 * Constraint:
	 *     stateId=ID?
	 */
	protected void sequence_SetStateStat(ISerializationContext context, SetStateStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Body returns StartProcStat
	 *     StartProcStat returns StartProcStat
	 *
	 * Constraint:
	 *     procId=ID
	 */
	protected void sequence_StartProcStat(ISerializationContext context, StartProcStat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.START_PROC_STAT__PROC_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.START_PROC_STAT__PROC_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartProcStatAccess().getProcIdIDTerminalRuleCall_1_0(), semanticObject.getProcId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateFunction returns StateFunction
	 *
	 * Constraint:
	 *     body=Body
	 */
	protected void sequence_StateFunction(ISerializationContext context, StateFunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.STATE_FUNCTION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.STATE_FUNCTION__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateFunctionAccess().getBodyBodyParserRuleCall_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID stateFunction?=StateFunction? timeoutFunction?=TimeoutFunction?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Body returns StopProcStat
	 *     StopProcStat returns StopProcStat
	 *
	 * Constraint:
	 *     procId?=ID?
	 */
	protected void sequence_StopProcStat(ISerializationContext context, StopProcStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Body returns SwitchStat
	 *     SwitchStat returns SwitchStat
	 *
	 * Constraint:
	 *     (expr=Expression options+=CaseStat*)
	 */
	protected void sequence_SwitchStat(ISerializationContext context, SwitchStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeoutFunction returns TimeoutFunction
	 *
	 * Constraint:
	 *     (time=Time body=Body)
	 */
	protected void sequence_TimeoutFunction(ISerializationContext context, TimeoutFunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.TIMEOUT_FUNCTION__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.TIMEOUT_FUNCTION__TIME));
			if (transientValues.isValueTransient(semanticObject, ReflexPackage.Literals.TIMEOUT_FUNCTION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReflexPackage.Literals.TIMEOUT_FUNCTION__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeoutFunctionAccess().getTimeTimeParserRuleCall_1_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getTimeoutFunctionAccess().getBodyBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Visibility returns Visibility
	 *
	 * Constraint:
	 *     (LOCAL='local' | GLOBAL='global' | (SHARED='shared' sharingProcs+=ID*))
	 */
	protected void sequence_Visibility(ISerializationContext context, Visibility semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
