/*
 * generated by Xtext
 */
package org.xtext.example.assignment6.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.assignment6.services.ConfiguratorDSLGrammarAccess;

public class ConfiguratorDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ConfiguratorDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.assignment6.parser.antlr.internal.InternalConfiguratorDSLParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.assignment6.parser.antlr.internal.InternalConfiguratorDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Configurator";
	}
	
	public ConfiguratorDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConfiguratorDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}