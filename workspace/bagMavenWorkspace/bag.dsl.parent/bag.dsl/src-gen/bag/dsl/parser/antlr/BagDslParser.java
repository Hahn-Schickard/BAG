/*
 * generated by Xtext 2.22.0
 */
package bag.dsl.parser.antlr;

import bag.dsl.parser.antlr.internal.InternalBagDslParser;
import bag.dsl.services.BagDslGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BagDslParser extends AbstractAntlrParser {

	@Inject
	private BagDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBagDslParser createParser(XtextTokenStream stream) {
		return new InternalBagDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "App";
	}

	public BagDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BagDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
