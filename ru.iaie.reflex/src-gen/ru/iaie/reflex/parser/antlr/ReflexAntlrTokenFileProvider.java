/*
 * generated by Xtext 2.20.0
 */
package ru.iaie.reflex.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ReflexAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ru/iaie/reflex/parser/antlr/internal/InternalReflex.tokens");
	}
}
