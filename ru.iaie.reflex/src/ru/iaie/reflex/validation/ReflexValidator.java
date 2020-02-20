/*
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.validation;

import org.eclipse.xtext.validation.Check;

import ru.iaie.reflex.reflex.ReflexPackage;
import ru.iaie.reflex.reflex.impl.ProcessImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ReflexValidator extends AbstractReflexValidator {
	private List<String> declaredProcesses = new ArrayList<>();
//	public static final INVALID_NAME = 'invalidName'
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					ReflexPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	@Check
	public void checkIfProcessUnique(ProcessImpl process) {
		if (!declaredProcesses.contains(process.getName())) {
			declaredProcesses.add(process.getName());
		} else {
			error("Process is already declared", ReflexPackage.Literals.PROCESS__NAME, process.getName());
		}
	}
	
}