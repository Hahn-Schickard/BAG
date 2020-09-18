package bag.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import bag.dsl.services.BagDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBagDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Float'", "'Double'", "'Integer'", "'String'", "'Bytes'", "'Byte'", "'App'", "'{'", "'packageName'", "'}'", "'Sensor'", "','", "'MacFilter'", "'NameFilter'", "'Service'", "'uuid'", "'Characteristic'", "'dataType'", "'read'", "'write'", "'notification'", "'unit'", "'UiElement'", "'label'", "'description'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBagDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBagDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBagDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBagDsl.g"; }


    	private BagDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(BagDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApp"
    // InternalBagDsl.g:53:1: entryRuleApp : ruleApp EOF ;
    public final void entryRuleApp() throws RecognitionException {
        try {
            // InternalBagDsl.g:54:1: ( ruleApp EOF )
            // InternalBagDsl.g:55:1: ruleApp EOF
            {
             before(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            ruleApp();

            state._fsp--;

             after(grammarAccess.getAppRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalBagDsl.g:62:1: ruleApp : ( ( rule__App__Group__0 ) ) ;
    public final void ruleApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:66:2: ( ( ( rule__App__Group__0 ) ) )
            // InternalBagDsl.g:67:2: ( ( rule__App__Group__0 ) )
            {
            // InternalBagDsl.g:67:2: ( ( rule__App__Group__0 ) )
            // InternalBagDsl.g:68:3: ( rule__App__Group__0 )
            {
             before(grammarAccess.getAppAccess().getGroup()); 
            // InternalBagDsl.g:69:3: ( rule__App__Group__0 )
            // InternalBagDsl.g:69:4: rule__App__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleEString"
    // InternalBagDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBagDsl.g:79:1: ( ruleEString EOF )
            // InternalBagDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBagDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBagDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBagDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalBagDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBagDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalBagDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSensor"
    // InternalBagDsl.g:103:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalBagDsl.g:104:1: ( ruleSensor EOF )
            // InternalBagDsl.g:105:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalBagDsl.g:112:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:116:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalBagDsl.g:117:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalBagDsl.g:117:2: ( ( rule__Sensor__Group__0 ) )
            // InternalBagDsl.g:118:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalBagDsl.g:119:3: ( rule__Sensor__Group__0 )
            // InternalBagDsl.g:119:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleMacFilter"
    // InternalBagDsl.g:128:1: entryRuleMacFilter : ruleMacFilter EOF ;
    public final void entryRuleMacFilter() throws RecognitionException {
        try {
            // InternalBagDsl.g:129:1: ( ruleMacFilter EOF )
            // InternalBagDsl.g:130:1: ruleMacFilter EOF
            {
             before(grammarAccess.getMacFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleMacFilter();

            state._fsp--;

             after(grammarAccess.getMacFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMacFilter"


    // $ANTLR start "ruleMacFilter"
    // InternalBagDsl.g:137:1: ruleMacFilter : ( ( rule__MacFilter__Group__0 ) ) ;
    public final void ruleMacFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:141:2: ( ( ( rule__MacFilter__Group__0 ) ) )
            // InternalBagDsl.g:142:2: ( ( rule__MacFilter__Group__0 ) )
            {
            // InternalBagDsl.g:142:2: ( ( rule__MacFilter__Group__0 ) )
            // InternalBagDsl.g:143:3: ( rule__MacFilter__Group__0 )
            {
             before(grammarAccess.getMacFilterAccess().getGroup()); 
            // InternalBagDsl.g:144:3: ( rule__MacFilter__Group__0 )
            // InternalBagDsl.g:144:4: rule__MacFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MacFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacFilter"


    // $ANTLR start "entryRuleNameFilter"
    // InternalBagDsl.g:153:1: entryRuleNameFilter : ruleNameFilter EOF ;
    public final void entryRuleNameFilter() throws RecognitionException {
        try {
            // InternalBagDsl.g:154:1: ( ruleNameFilter EOF )
            // InternalBagDsl.g:155:1: ruleNameFilter EOF
            {
             before(grammarAccess.getNameFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleNameFilter();

            state._fsp--;

             after(grammarAccess.getNameFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameFilter"


    // $ANTLR start "ruleNameFilter"
    // InternalBagDsl.g:162:1: ruleNameFilter : ( ( rule__NameFilter__Group__0 ) ) ;
    public final void ruleNameFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:166:2: ( ( ( rule__NameFilter__Group__0 ) ) )
            // InternalBagDsl.g:167:2: ( ( rule__NameFilter__Group__0 ) )
            {
            // InternalBagDsl.g:167:2: ( ( rule__NameFilter__Group__0 ) )
            // InternalBagDsl.g:168:3: ( rule__NameFilter__Group__0 )
            {
             before(grammarAccess.getNameFilterAccess().getGroup()); 
            // InternalBagDsl.g:169:3: ( rule__NameFilter__Group__0 )
            // InternalBagDsl.g:169:4: rule__NameFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameFilter"


    // $ANTLR start "entryRuleService"
    // InternalBagDsl.g:178:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalBagDsl.g:179:1: ( ruleService EOF )
            // InternalBagDsl.g:180:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalBagDsl.g:187:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:191:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalBagDsl.g:192:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalBagDsl.g:192:2: ( ( rule__Service__Group__0 ) )
            // InternalBagDsl.g:193:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalBagDsl.g:194:3: ( rule__Service__Group__0 )
            // InternalBagDsl.g:194:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleCharacteristic"
    // InternalBagDsl.g:203:1: entryRuleCharacteristic : ruleCharacteristic EOF ;
    public final void entryRuleCharacteristic() throws RecognitionException {
        try {
            // InternalBagDsl.g:204:1: ( ruleCharacteristic EOF )
            // InternalBagDsl.g:205:1: ruleCharacteristic EOF
            {
             before(grammarAccess.getCharacteristicRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristic();

            state._fsp--;

             after(grammarAccess.getCharacteristicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacteristic"


    // $ANTLR start "ruleCharacteristic"
    // InternalBagDsl.g:212:1: ruleCharacteristic : ( ( rule__Characteristic__Group__0 ) ) ;
    public final void ruleCharacteristic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:216:2: ( ( ( rule__Characteristic__Group__0 ) ) )
            // InternalBagDsl.g:217:2: ( ( rule__Characteristic__Group__0 ) )
            {
            // InternalBagDsl.g:217:2: ( ( rule__Characteristic__Group__0 ) )
            // InternalBagDsl.g:218:3: ( rule__Characteristic__Group__0 )
            {
             before(grammarAccess.getCharacteristicAccess().getGroup()); 
            // InternalBagDsl.g:219:3: ( rule__Characteristic__Group__0 )
            // InternalBagDsl.g:219:4: rule__Characteristic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacteristic"


    // $ANTLR start "entryRuleUIElement"
    // InternalBagDsl.g:228:1: entryRuleUIElement : ruleUIElement EOF ;
    public final void entryRuleUIElement() throws RecognitionException {
        try {
            // InternalBagDsl.g:229:1: ( ruleUIElement EOF )
            // InternalBagDsl.g:230:1: ruleUIElement EOF
            {
             before(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_1);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getUIElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // InternalBagDsl.g:237:1: ruleUIElement : ( ( rule__UIElement__Group__0 ) ) ;
    public final void ruleUIElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:241:2: ( ( ( rule__UIElement__Group__0 ) ) )
            // InternalBagDsl.g:242:2: ( ( rule__UIElement__Group__0 ) )
            {
            // InternalBagDsl.g:242:2: ( ( rule__UIElement__Group__0 ) )
            // InternalBagDsl.g:243:3: ( rule__UIElement__Group__0 )
            {
             before(grammarAccess.getUIElementAccess().getGroup()); 
            // InternalBagDsl.g:244:3: ( rule__UIElement__Group__0 )
            // InternalBagDsl.g:244:4: rule__UIElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UIElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBagDsl.g:253:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalBagDsl.g:254:1: ( ruleEBoolean EOF )
            // InternalBagDsl.g:255:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBagDsl.g:262:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:266:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalBagDsl.g:267:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalBagDsl.g:267:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalBagDsl.g:268:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalBagDsl.g:269:3: ( rule__EBoolean__Alternatives )
            // InternalBagDsl.g:269:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleMacAddress"
    // InternalBagDsl.g:278:1: entryRuleMacAddress : ruleMacAddress EOF ;
    public final void entryRuleMacAddress() throws RecognitionException {
        try {
            // InternalBagDsl.g:279:1: ( ruleMacAddress EOF )
            // InternalBagDsl.g:280:1: ruleMacAddress EOF
            {
             before(grammarAccess.getMacAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleMacAddress();

            state._fsp--;

             after(grammarAccess.getMacAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMacAddress"


    // $ANTLR start "ruleMacAddress"
    // InternalBagDsl.g:287:1: ruleMacAddress : ( ( rule__MacAddress__AddressAssignment ) ) ;
    public final void ruleMacAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:291:2: ( ( ( rule__MacAddress__AddressAssignment ) ) )
            // InternalBagDsl.g:292:2: ( ( rule__MacAddress__AddressAssignment ) )
            {
            // InternalBagDsl.g:292:2: ( ( rule__MacAddress__AddressAssignment ) )
            // InternalBagDsl.g:293:3: ( rule__MacAddress__AddressAssignment )
            {
             before(grammarAccess.getMacAddressAccess().getAddressAssignment()); 
            // InternalBagDsl.g:294:3: ( rule__MacAddress__AddressAssignment )
            // InternalBagDsl.g:294:4: rule__MacAddress__AddressAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MacAddress__AddressAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMacAddressAccess().getAddressAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacAddress"


    // $ANTLR start "entryRuleNameExpression"
    // InternalBagDsl.g:303:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalBagDsl.g:304:1: ( ruleNameExpression EOF )
            // InternalBagDsl.g:305:1: ruleNameExpression EOF
            {
             before(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNameExpression();

            state._fsp--;

             after(grammarAccess.getNameExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // InternalBagDsl.g:312:1: ruleNameExpression : ( ( rule__NameExpression__RegExAssignment ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:316:2: ( ( ( rule__NameExpression__RegExAssignment ) ) )
            // InternalBagDsl.g:317:2: ( ( rule__NameExpression__RegExAssignment ) )
            {
            // InternalBagDsl.g:317:2: ( ( rule__NameExpression__RegExAssignment ) )
            // InternalBagDsl.g:318:3: ( rule__NameExpression__RegExAssignment )
            {
             before(grammarAccess.getNameExpressionAccess().getRegExAssignment()); 
            // InternalBagDsl.g:319:3: ( rule__NameExpression__RegExAssignment )
            // InternalBagDsl.g:319:4: rule__NameExpression__RegExAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NameExpression__RegExAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNameExpressionAccess().getRegExAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "ruleDataType"
    // InternalBagDsl.g:328:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:332:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalBagDsl.g:333:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalBagDsl.g:333:2: ( ( rule__DataType__Alternatives ) )
            // InternalBagDsl.g:334:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalBagDsl.g:335:3: ( rule__DataType__Alternatives )
            // InternalBagDsl.g:335:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBagDsl.g:343:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:347:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBagDsl.g:348:2: ( RULE_STRING )
                    {
                    // InternalBagDsl.g:348:2: ( RULE_STRING )
                    // InternalBagDsl.g:349:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBagDsl.g:354:2: ( RULE_ID )
                    {
                    // InternalBagDsl.g:354:2: ( RULE_ID )
                    // InternalBagDsl.g:355:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalBagDsl.g:364:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:368:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBagDsl.g:369:2: ( 'true' )
                    {
                    // InternalBagDsl.g:369:2: ( 'true' )
                    // InternalBagDsl.g:370:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBagDsl.g:375:2: ( 'false' )
                    {
                    // InternalBagDsl.g:375:2: ( 'false' )
                    // InternalBagDsl.g:376:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalBagDsl.g:385:1: rule__DataType__Alternatives : ( ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) | ( ( 'Bytes' ) ) | ( ( 'Byte' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:389:1: ( ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) | ( ( 'Bytes' ) ) | ( ( 'Byte' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBagDsl.g:390:2: ( ( 'Float' ) )
                    {
                    // InternalBagDsl.g:390:2: ( ( 'Float' ) )
                    // InternalBagDsl.g:391:3: ( 'Float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFloatEnumLiteralDeclaration_0()); 
                    // InternalBagDsl.g:392:3: ( 'Float' )
                    // InternalBagDsl.g:392:4: 'Float'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFloatEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBagDsl.g:396:2: ( ( 'Double' ) )
                    {
                    // InternalBagDsl.g:396:2: ( ( 'Double' ) )
                    // InternalBagDsl.g:397:3: ( 'Double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDoubleEnumLiteralDeclaration_1()); 
                    // InternalBagDsl.g:398:3: ( 'Double' )
                    // InternalBagDsl.g:398:4: 'Double'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDoubleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBagDsl.g:402:2: ( ( 'Integer' ) )
                    {
                    // InternalBagDsl.g:402:2: ( ( 'Integer' ) )
                    // InternalBagDsl.g:403:3: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalBagDsl.g:404:3: ( 'Integer' )
                    // InternalBagDsl.g:404:4: 'Integer'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBagDsl.g:408:2: ( ( 'String' ) )
                    {
                    // InternalBagDsl.g:408:2: ( ( 'String' ) )
                    // InternalBagDsl.g:409:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // InternalBagDsl.g:410:3: ( 'String' )
                    // InternalBagDsl.g:410:4: 'String'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBagDsl.g:414:2: ( ( 'Bytes' ) )
                    {
                    // InternalBagDsl.g:414:2: ( ( 'Bytes' ) )
                    // InternalBagDsl.g:415:3: ( 'Bytes' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBytesEnumLiteralDeclaration_4()); 
                    // InternalBagDsl.g:416:3: ( 'Bytes' )
                    // InternalBagDsl.g:416:4: 'Bytes'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBytesEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBagDsl.g:420:2: ( ( 'Byte' ) )
                    {
                    // InternalBagDsl.g:420:2: ( ( 'Byte' ) )
                    // InternalBagDsl.g:421:3: ( 'Byte' )
                    {
                     before(grammarAccess.getDataTypeAccess().getByteEnumLiteralDeclaration_5()); 
                    // InternalBagDsl.g:422:3: ( 'Byte' )
                    // InternalBagDsl.g:422:4: 'Byte'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getByteEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__App__Group__0"
    // InternalBagDsl.g:430:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:434:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalBagDsl.g:435:2: rule__App__Group__0__Impl rule__App__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0"


    // $ANTLR start "rule__App__Group__0__Impl"
    // InternalBagDsl.g:442:1: rule__App__Group__0__Impl : ( 'App' ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:446:1: ( ( 'App' ) )
            // InternalBagDsl.g:447:1: ( 'App' )
            {
            // InternalBagDsl.g:447:1: ( 'App' )
            // InternalBagDsl.g:448:2: 'App'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0__Impl"


    // $ANTLR start "rule__App__Group__1"
    // InternalBagDsl.g:457:1: rule__App__Group__1 : rule__App__Group__1__Impl rule__App__Group__2 ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:461:1: ( rule__App__Group__1__Impl rule__App__Group__2 )
            // InternalBagDsl.g:462:2: rule__App__Group__1__Impl rule__App__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__App__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1"


    // $ANTLR start "rule__App__Group__1__Impl"
    // InternalBagDsl.g:469:1: rule__App__Group__1__Impl : ( ( rule__App__NameAssignment_1 ) ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:473:1: ( ( ( rule__App__NameAssignment_1 ) ) )
            // InternalBagDsl.g:474:1: ( ( rule__App__NameAssignment_1 ) )
            {
            // InternalBagDsl.g:474:1: ( ( rule__App__NameAssignment_1 ) )
            // InternalBagDsl.g:475:2: ( rule__App__NameAssignment_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1()); 
            // InternalBagDsl.g:476:2: ( rule__App__NameAssignment_1 )
            // InternalBagDsl.g:476:3: rule__App__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__App__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1__Impl"


    // $ANTLR start "rule__App__Group__2"
    // InternalBagDsl.g:484:1: rule__App__Group__2 : rule__App__Group__2__Impl rule__App__Group__3 ;
    public final void rule__App__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:488:1: ( rule__App__Group__2__Impl rule__App__Group__3 )
            // InternalBagDsl.g:489:2: rule__App__Group__2__Impl rule__App__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__App__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2"


    // $ANTLR start "rule__App__Group__2__Impl"
    // InternalBagDsl.g:496:1: rule__App__Group__2__Impl : ( '{' ) ;
    public final void rule__App__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:500:1: ( ( '{' ) )
            // InternalBagDsl.g:501:1: ( '{' )
            {
            // InternalBagDsl.g:501:1: ( '{' )
            // InternalBagDsl.g:502:2: '{'
            {
             before(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2__Impl"


    // $ANTLR start "rule__App__Group__3"
    // InternalBagDsl.g:511:1: rule__App__Group__3 : rule__App__Group__3__Impl rule__App__Group__4 ;
    public final void rule__App__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:515:1: ( rule__App__Group__3__Impl rule__App__Group__4 )
            // InternalBagDsl.g:516:2: rule__App__Group__3__Impl rule__App__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3"


    // $ANTLR start "rule__App__Group__3__Impl"
    // InternalBagDsl.g:523:1: rule__App__Group__3__Impl : ( 'packageName' ) ;
    public final void rule__App__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:527:1: ( ( 'packageName' ) )
            // InternalBagDsl.g:528:1: ( 'packageName' )
            {
            // InternalBagDsl.g:528:1: ( 'packageName' )
            // InternalBagDsl.g:529:2: 'packageName'
            {
             before(grammarAccess.getAppAccess().getPackageNameKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getPackageNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3__Impl"


    // $ANTLR start "rule__App__Group__4"
    // InternalBagDsl.g:538:1: rule__App__Group__4 : rule__App__Group__4__Impl rule__App__Group__5 ;
    public final void rule__App__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:542:1: ( rule__App__Group__4__Impl rule__App__Group__5 )
            // InternalBagDsl.g:543:2: rule__App__Group__4__Impl rule__App__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__App__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4"


    // $ANTLR start "rule__App__Group__4__Impl"
    // InternalBagDsl.g:550:1: rule__App__Group__4__Impl : ( ( rule__App__PackageNameAssignment_4 ) ) ;
    public final void rule__App__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:554:1: ( ( ( rule__App__PackageNameAssignment_4 ) ) )
            // InternalBagDsl.g:555:1: ( ( rule__App__PackageNameAssignment_4 ) )
            {
            // InternalBagDsl.g:555:1: ( ( rule__App__PackageNameAssignment_4 ) )
            // InternalBagDsl.g:556:2: ( rule__App__PackageNameAssignment_4 )
            {
             before(grammarAccess.getAppAccess().getPackageNameAssignment_4()); 
            // InternalBagDsl.g:557:2: ( rule__App__PackageNameAssignment_4 )
            // InternalBagDsl.g:557:3: rule__App__PackageNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__App__PackageNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getPackageNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4__Impl"


    // $ANTLR start "rule__App__Group__5"
    // InternalBagDsl.g:565:1: rule__App__Group__5 : rule__App__Group__5__Impl rule__App__Group__6 ;
    public final void rule__App__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:569:1: ( rule__App__Group__5__Impl rule__App__Group__6 )
            // InternalBagDsl.g:570:2: rule__App__Group__5__Impl rule__App__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__App__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5"


    // $ANTLR start "rule__App__Group__5__Impl"
    // InternalBagDsl.g:577:1: rule__App__Group__5__Impl : ( ( rule__App__SensorAssignment_5 ) ) ;
    public final void rule__App__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:581:1: ( ( ( rule__App__SensorAssignment_5 ) ) )
            // InternalBagDsl.g:582:1: ( ( rule__App__SensorAssignment_5 ) )
            {
            // InternalBagDsl.g:582:1: ( ( rule__App__SensorAssignment_5 ) )
            // InternalBagDsl.g:583:2: ( rule__App__SensorAssignment_5 )
            {
             before(grammarAccess.getAppAccess().getSensorAssignment_5()); 
            // InternalBagDsl.g:584:2: ( rule__App__SensorAssignment_5 )
            // InternalBagDsl.g:584:3: rule__App__SensorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__App__SensorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getSensorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5__Impl"


    // $ANTLR start "rule__App__Group__6"
    // InternalBagDsl.g:592:1: rule__App__Group__6 : rule__App__Group__6__Impl rule__App__Group__7 ;
    public final void rule__App__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:596:1: ( rule__App__Group__6__Impl rule__App__Group__7 )
            // InternalBagDsl.g:597:2: rule__App__Group__6__Impl rule__App__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__App__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6"


    // $ANTLR start "rule__App__Group__6__Impl"
    // InternalBagDsl.g:604:1: rule__App__Group__6__Impl : ( ( rule__App__MacfilterAssignment_6 )? ) ;
    public final void rule__App__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:608:1: ( ( ( rule__App__MacfilterAssignment_6 )? ) )
            // InternalBagDsl.g:609:1: ( ( rule__App__MacfilterAssignment_6 )? )
            {
            // InternalBagDsl.g:609:1: ( ( rule__App__MacfilterAssignment_6 )? )
            // InternalBagDsl.g:610:2: ( rule__App__MacfilterAssignment_6 )?
            {
             before(grammarAccess.getAppAccess().getMacfilterAssignment_6()); 
            // InternalBagDsl.g:611:2: ( rule__App__MacfilterAssignment_6 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBagDsl.g:611:3: rule__App__MacfilterAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__App__MacfilterAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAppAccess().getMacfilterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6__Impl"


    // $ANTLR start "rule__App__Group__7"
    // InternalBagDsl.g:619:1: rule__App__Group__7 : rule__App__Group__7__Impl rule__App__Group__8 ;
    public final void rule__App__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:623:1: ( rule__App__Group__7__Impl rule__App__Group__8 )
            // InternalBagDsl.g:624:2: rule__App__Group__7__Impl rule__App__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__App__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7"


    // $ANTLR start "rule__App__Group__7__Impl"
    // InternalBagDsl.g:631:1: rule__App__Group__7__Impl : ( ( rule__App__NamefilterAssignment_7 )? ) ;
    public final void rule__App__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:635:1: ( ( ( rule__App__NamefilterAssignment_7 )? ) )
            // InternalBagDsl.g:636:1: ( ( rule__App__NamefilterAssignment_7 )? )
            {
            // InternalBagDsl.g:636:1: ( ( rule__App__NamefilterAssignment_7 )? )
            // InternalBagDsl.g:637:2: ( rule__App__NamefilterAssignment_7 )?
            {
             before(grammarAccess.getAppAccess().getNamefilterAssignment_7()); 
            // InternalBagDsl.g:638:2: ( rule__App__NamefilterAssignment_7 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBagDsl.g:638:3: rule__App__NamefilterAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__App__NamefilterAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAppAccess().getNamefilterAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7__Impl"


    // $ANTLR start "rule__App__Group__8"
    // InternalBagDsl.g:646:1: rule__App__Group__8 : rule__App__Group__8__Impl ;
    public final void rule__App__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:650:1: ( rule__App__Group__8__Impl )
            // InternalBagDsl.g:651:2: rule__App__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8"


    // $ANTLR start "rule__App__Group__8__Impl"
    // InternalBagDsl.g:657:1: rule__App__Group__8__Impl : ( '}' ) ;
    public final void rule__App__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:661:1: ( ( '}' ) )
            // InternalBagDsl.g:662:1: ( '}' )
            {
            // InternalBagDsl.g:662:1: ( '}' )
            // InternalBagDsl.g:663:2: '}'
            {
             before(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalBagDsl.g:673:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:677:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalBagDsl.g:678:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalBagDsl.g:685:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:689:1: ( ( 'Sensor' ) )
            // InternalBagDsl.g:690:1: ( 'Sensor' )
            {
            // InternalBagDsl.g:690:1: ( 'Sensor' )
            // InternalBagDsl.g:691:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalBagDsl.g:700:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:704:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalBagDsl.g:705:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalBagDsl.g:712:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:716:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalBagDsl.g:717:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalBagDsl.g:717:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalBagDsl.g:718:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalBagDsl.g:719:2: ( rule__Sensor__NameAssignment_1 )
            // InternalBagDsl.g:719:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalBagDsl.g:727:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:731:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalBagDsl.g:732:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalBagDsl.g:739:1: rule__Sensor__Group__2__Impl : ( '{' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:743:1: ( ( '{' ) )
            // InternalBagDsl.g:744:1: ( '{' )
            {
            // InternalBagDsl.g:744:1: ( '{' )
            // InternalBagDsl.g:745:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalBagDsl.g:754:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:758:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalBagDsl.g:759:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalBagDsl.g:766:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__ServiceAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:770:1: ( ( ( rule__Sensor__ServiceAssignment_3 ) ) )
            // InternalBagDsl.g:771:1: ( ( rule__Sensor__ServiceAssignment_3 ) )
            {
            // InternalBagDsl.g:771:1: ( ( rule__Sensor__ServiceAssignment_3 ) )
            // InternalBagDsl.g:772:2: ( rule__Sensor__ServiceAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getServiceAssignment_3()); 
            // InternalBagDsl.g:773:2: ( rule__Sensor__ServiceAssignment_3 )
            // InternalBagDsl.g:773:3: rule__Sensor__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalBagDsl.g:781:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:785:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalBagDsl.g:786:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalBagDsl.g:793:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__Group_4__0 )* ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:797:1: ( ( ( rule__Sensor__Group_4__0 )* ) )
            // InternalBagDsl.g:798:1: ( ( rule__Sensor__Group_4__0 )* )
            {
            // InternalBagDsl.g:798:1: ( ( rule__Sensor__Group_4__0 )* )
            // InternalBagDsl.g:799:2: ( rule__Sensor__Group_4__0 )*
            {
             before(grammarAccess.getSensorAccess().getGroup_4()); 
            // InternalBagDsl.g:800:2: ( rule__Sensor__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBagDsl.g:800:3: rule__Sensor__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Sensor__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSensorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalBagDsl.g:808:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:812:1: ( rule__Sensor__Group__5__Impl )
            // InternalBagDsl.g:813:2: rule__Sensor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalBagDsl.g:819:1: rule__Sensor__Group__5__Impl : ( '}' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:823:1: ( ( '}' ) )
            // InternalBagDsl.g:824:1: ( '}' )
            {
            // InternalBagDsl.g:824:1: ( '}' )
            // InternalBagDsl.g:825:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group_4__0"
    // InternalBagDsl.g:835:1: rule__Sensor__Group_4__0 : rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 ;
    public final void rule__Sensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:839:1: ( rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 )
            // InternalBagDsl.g:840:2: rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__0"


    // $ANTLR start "rule__Sensor__Group_4__0__Impl"
    // InternalBagDsl.g:847:1: rule__Sensor__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Sensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:851:1: ( ( ',' ) )
            // InternalBagDsl.g:852:1: ( ',' )
            {
            // InternalBagDsl.g:852:1: ( ',' )
            // InternalBagDsl.g:853:2: ','
            {
             before(grammarAccess.getSensorAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__0__Impl"


    // $ANTLR start "rule__Sensor__Group_4__1"
    // InternalBagDsl.g:862:1: rule__Sensor__Group_4__1 : rule__Sensor__Group_4__1__Impl ;
    public final void rule__Sensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:866:1: ( rule__Sensor__Group_4__1__Impl )
            // InternalBagDsl.g:867:2: rule__Sensor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__1"


    // $ANTLR start "rule__Sensor__Group_4__1__Impl"
    // InternalBagDsl.g:873:1: rule__Sensor__Group_4__1__Impl : ( ( rule__Sensor__ServiceAssignment_4_1 ) ) ;
    public final void rule__Sensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:877:1: ( ( ( rule__Sensor__ServiceAssignment_4_1 ) ) )
            // InternalBagDsl.g:878:1: ( ( rule__Sensor__ServiceAssignment_4_1 ) )
            {
            // InternalBagDsl.g:878:1: ( ( rule__Sensor__ServiceAssignment_4_1 ) )
            // InternalBagDsl.g:879:2: ( rule__Sensor__ServiceAssignment_4_1 )
            {
             before(grammarAccess.getSensorAccess().getServiceAssignment_4_1()); 
            // InternalBagDsl.g:880:2: ( rule__Sensor__ServiceAssignment_4_1 )
            // InternalBagDsl.g:880:3: rule__Sensor__ServiceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ServiceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getServiceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__1__Impl"


    // $ANTLR start "rule__MacFilter__Group__0"
    // InternalBagDsl.g:889:1: rule__MacFilter__Group__0 : rule__MacFilter__Group__0__Impl rule__MacFilter__Group__1 ;
    public final void rule__MacFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:893:1: ( rule__MacFilter__Group__0__Impl rule__MacFilter__Group__1 )
            // InternalBagDsl.g:894:2: rule__MacFilter__Group__0__Impl rule__MacFilter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MacFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__0"


    // $ANTLR start "rule__MacFilter__Group__0__Impl"
    // InternalBagDsl.g:901:1: rule__MacFilter__Group__0__Impl : ( 'MacFilter' ) ;
    public final void rule__MacFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:905:1: ( ( 'MacFilter' ) )
            // InternalBagDsl.g:906:1: ( 'MacFilter' )
            {
            // InternalBagDsl.g:906:1: ( 'MacFilter' )
            // InternalBagDsl.g:907:2: 'MacFilter'
            {
             before(grammarAccess.getMacFilterAccess().getMacFilterKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMacFilterAccess().getMacFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__0__Impl"


    // $ANTLR start "rule__MacFilter__Group__1"
    // InternalBagDsl.g:916:1: rule__MacFilter__Group__1 : rule__MacFilter__Group__1__Impl rule__MacFilter__Group__2 ;
    public final void rule__MacFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:920:1: ( rule__MacFilter__Group__1__Impl rule__MacFilter__Group__2 )
            // InternalBagDsl.g:921:2: rule__MacFilter__Group__1__Impl rule__MacFilter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MacFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__1"


    // $ANTLR start "rule__MacFilter__Group__1__Impl"
    // InternalBagDsl.g:928:1: rule__MacFilter__Group__1__Impl : ( '{' ) ;
    public final void rule__MacFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:932:1: ( ( '{' ) )
            // InternalBagDsl.g:933:1: ( '{' )
            {
            // InternalBagDsl.g:933:1: ( '{' )
            // InternalBagDsl.g:934:2: '{'
            {
             before(grammarAccess.getMacFilterAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMacFilterAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__1__Impl"


    // $ANTLR start "rule__MacFilter__Group__2"
    // InternalBagDsl.g:943:1: rule__MacFilter__Group__2 : rule__MacFilter__Group__2__Impl rule__MacFilter__Group__3 ;
    public final void rule__MacFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:947:1: ( rule__MacFilter__Group__2__Impl rule__MacFilter__Group__3 )
            // InternalBagDsl.g:948:2: rule__MacFilter__Group__2__Impl rule__MacFilter__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MacFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacFilter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__2"


    // $ANTLR start "rule__MacFilter__Group__2__Impl"
    // InternalBagDsl.g:955:1: rule__MacFilter__Group__2__Impl : ( ( rule__MacFilter__MacaddressAssignment_2 ) ) ;
    public final void rule__MacFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:959:1: ( ( ( rule__MacFilter__MacaddressAssignment_2 ) ) )
            // InternalBagDsl.g:960:1: ( ( rule__MacFilter__MacaddressAssignment_2 ) )
            {
            // InternalBagDsl.g:960:1: ( ( rule__MacFilter__MacaddressAssignment_2 ) )
            // InternalBagDsl.g:961:2: ( rule__MacFilter__MacaddressAssignment_2 )
            {
             before(grammarAccess.getMacFilterAccess().getMacaddressAssignment_2()); 
            // InternalBagDsl.g:962:2: ( rule__MacFilter__MacaddressAssignment_2 )
            // InternalBagDsl.g:962:3: rule__MacFilter__MacaddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MacFilter__MacaddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMacFilterAccess().getMacaddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__2__Impl"


    // $ANTLR start "rule__MacFilter__Group__3"
    // InternalBagDsl.g:970:1: rule__MacFilter__Group__3 : rule__MacFilter__Group__3__Impl rule__MacFilter__Group__4 ;
    public final void rule__MacFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:974:1: ( rule__MacFilter__Group__3__Impl rule__MacFilter__Group__4 )
            // InternalBagDsl.g:975:2: rule__MacFilter__Group__3__Impl rule__MacFilter__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MacFilter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacFilter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__3"


    // $ANTLR start "rule__MacFilter__Group__3__Impl"
    // InternalBagDsl.g:982:1: rule__MacFilter__Group__3__Impl : ( ( rule__MacFilter__Group_3__0 )* ) ;
    public final void rule__MacFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:986:1: ( ( ( rule__MacFilter__Group_3__0 )* ) )
            // InternalBagDsl.g:987:1: ( ( rule__MacFilter__Group_3__0 )* )
            {
            // InternalBagDsl.g:987:1: ( ( rule__MacFilter__Group_3__0 )* )
            // InternalBagDsl.g:988:2: ( rule__MacFilter__Group_3__0 )*
            {
             before(grammarAccess.getMacFilterAccess().getGroup_3()); 
            // InternalBagDsl.g:989:2: ( rule__MacFilter__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBagDsl.g:989:3: rule__MacFilter__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MacFilter__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMacFilterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__3__Impl"


    // $ANTLR start "rule__MacFilter__Group__4"
    // InternalBagDsl.g:997:1: rule__MacFilter__Group__4 : rule__MacFilter__Group__4__Impl ;
    public final void rule__MacFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1001:1: ( rule__MacFilter__Group__4__Impl )
            // InternalBagDsl.g:1002:2: rule__MacFilter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacFilter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__4"


    // $ANTLR start "rule__MacFilter__Group__4__Impl"
    // InternalBagDsl.g:1008:1: rule__MacFilter__Group__4__Impl : ( '}' ) ;
    public final void rule__MacFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1012:1: ( ( '}' ) )
            // InternalBagDsl.g:1013:1: ( '}' )
            {
            // InternalBagDsl.g:1013:1: ( '}' )
            // InternalBagDsl.g:1014:2: '}'
            {
             before(grammarAccess.getMacFilterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMacFilterAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group__4__Impl"


    // $ANTLR start "rule__MacFilter__Group_3__0"
    // InternalBagDsl.g:1024:1: rule__MacFilter__Group_3__0 : rule__MacFilter__Group_3__0__Impl rule__MacFilter__Group_3__1 ;
    public final void rule__MacFilter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1028:1: ( rule__MacFilter__Group_3__0__Impl rule__MacFilter__Group_3__1 )
            // InternalBagDsl.g:1029:2: rule__MacFilter__Group_3__0__Impl rule__MacFilter__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__MacFilter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacFilter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group_3__0"


    // $ANTLR start "rule__MacFilter__Group_3__0__Impl"
    // InternalBagDsl.g:1036:1: rule__MacFilter__Group_3__0__Impl : ( ',' ) ;
    public final void rule__MacFilter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1040:1: ( ( ',' ) )
            // InternalBagDsl.g:1041:1: ( ',' )
            {
            // InternalBagDsl.g:1041:1: ( ',' )
            // InternalBagDsl.g:1042:2: ','
            {
             before(grammarAccess.getMacFilterAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMacFilterAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group_3__0__Impl"


    // $ANTLR start "rule__MacFilter__Group_3__1"
    // InternalBagDsl.g:1051:1: rule__MacFilter__Group_3__1 : rule__MacFilter__Group_3__1__Impl ;
    public final void rule__MacFilter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1055:1: ( rule__MacFilter__Group_3__1__Impl )
            // InternalBagDsl.g:1056:2: rule__MacFilter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacFilter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group_3__1"


    // $ANTLR start "rule__MacFilter__Group_3__1__Impl"
    // InternalBagDsl.g:1062:1: rule__MacFilter__Group_3__1__Impl : ( ( rule__MacFilter__MacaddressAssignment_3_1 ) ) ;
    public final void rule__MacFilter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1066:1: ( ( ( rule__MacFilter__MacaddressAssignment_3_1 ) ) )
            // InternalBagDsl.g:1067:1: ( ( rule__MacFilter__MacaddressAssignment_3_1 ) )
            {
            // InternalBagDsl.g:1067:1: ( ( rule__MacFilter__MacaddressAssignment_3_1 ) )
            // InternalBagDsl.g:1068:2: ( rule__MacFilter__MacaddressAssignment_3_1 )
            {
             before(grammarAccess.getMacFilterAccess().getMacaddressAssignment_3_1()); 
            // InternalBagDsl.g:1069:2: ( rule__MacFilter__MacaddressAssignment_3_1 )
            // InternalBagDsl.g:1069:3: rule__MacFilter__MacaddressAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MacFilter__MacaddressAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMacFilterAccess().getMacaddressAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__Group_3__1__Impl"


    // $ANTLR start "rule__NameFilter__Group__0"
    // InternalBagDsl.g:1078:1: rule__NameFilter__Group__0 : rule__NameFilter__Group__0__Impl rule__NameFilter__Group__1 ;
    public final void rule__NameFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1082:1: ( rule__NameFilter__Group__0__Impl rule__NameFilter__Group__1 )
            // InternalBagDsl.g:1083:2: rule__NameFilter__Group__0__Impl rule__NameFilter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NameFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameFilter__Group__0"


    // $ANTLR start "rule__NameFilter__Group__0__Impl"
    // InternalBagDsl.g:1090:1: rule__NameFilter__Group__0__Impl : ( 'NameFilter' ) ;
    public final void rule__NameFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1094:1: ( ( 'NameFilter' ) )
            // InternalBagDsl.g:1095:1: ( 'NameFilter' )
            {
            // InternalBagDsl.g:1095:1: ( 'NameFilter' )
            // InternalBagDsl.g:1096:2: 'NameFilter'
            {
             before(grammarAccess.getNameFilterAccess().getNameFilterKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNameFilterAccess().getNameFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameFilter__Group__0__Impl"


    // $ANTLR start "rule__NameFilter__Group__1"
    // InternalBagDsl.g:1105:1: rule__NameFilter__Group__1 : rule__NameFilter__Group__1__Impl ;
    public final void rule__NameFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1109:1: ( rule__NameFilter__Group__1__Impl )
            // InternalBagDsl.g:1110:2: rule__NameFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameFilter__Group__1"


    // $ANTLR start "rule__NameFilter__Group__1__Impl"
    // InternalBagDsl.g:1116:1: rule__NameFilter__Group__1__Impl : ( ( rule__NameFilter__NameAssignment_1 ) ) ;
    public final void rule__NameFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1120:1: ( ( ( rule__NameFilter__NameAssignment_1 ) ) )
            // InternalBagDsl.g:1121:1: ( ( rule__NameFilter__NameAssignment_1 ) )
            {
            // InternalBagDsl.g:1121:1: ( ( rule__NameFilter__NameAssignment_1 ) )
            // InternalBagDsl.g:1122:2: ( rule__NameFilter__NameAssignment_1 )
            {
             before(grammarAccess.getNameFilterAccess().getNameAssignment_1()); 
            // InternalBagDsl.g:1123:2: ( rule__NameFilter__NameAssignment_1 )
            // InternalBagDsl.g:1123:3: rule__NameFilter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NameFilter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameFilterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameFilter__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalBagDsl.g:1132:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1136:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalBagDsl.g:1137:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalBagDsl.g:1144:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1148:1: ( ( 'Service' ) )
            // InternalBagDsl.g:1149:1: ( 'Service' )
            {
            // InternalBagDsl.g:1149:1: ( 'Service' )
            // InternalBagDsl.g:1150:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalBagDsl.g:1159:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1163:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalBagDsl.g:1164:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalBagDsl.g:1171:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1175:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalBagDsl.g:1176:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalBagDsl.g:1176:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalBagDsl.g:1177:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalBagDsl.g:1178:2: ( rule__Service__NameAssignment_1 )
            // InternalBagDsl.g:1178:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalBagDsl.g:1186:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1190:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalBagDsl.g:1191:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalBagDsl.g:1198:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1202:1: ( ( '{' ) )
            // InternalBagDsl.g:1203:1: ( '{' )
            {
            // InternalBagDsl.g:1203:1: ( '{' )
            // InternalBagDsl.g:1204:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalBagDsl.g:1213:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1217:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalBagDsl.g:1218:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalBagDsl.g:1225:1: rule__Service__Group__3__Impl : ( 'uuid' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1229:1: ( ( 'uuid' ) )
            // InternalBagDsl.g:1230:1: ( 'uuid' )
            {
            // InternalBagDsl.g:1230:1: ( 'uuid' )
            // InternalBagDsl.g:1231:2: 'uuid'
            {
             before(grammarAccess.getServiceAccess().getUuidKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getUuidKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalBagDsl.g:1240:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1244:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalBagDsl.g:1245:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalBagDsl.g:1252:1: rule__Service__Group__4__Impl : ( ( rule__Service__UuidAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1256:1: ( ( ( rule__Service__UuidAssignment_4 ) ) )
            // InternalBagDsl.g:1257:1: ( ( rule__Service__UuidAssignment_4 ) )
            {
            // InternalBagDsl.g:1257:1: ( ( rule__Service__UuidAssignment_4 ) )
            // InternalBagDsl.g:1258:2: ( rule__Service__UuidAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getUuidAssignment_4()); 
            // InternalBagDsl.g:1259:2: ( rule__Service__UuidAssignment_4 )
            // InternalBagDsl.g:1259:3: rule__Service__UuidAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Service__UuidAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getUuidAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalBagDsl.g:1267:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1271:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalBagDsl.g:1272:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalBagDsl.g:1279:1: rule__Service__Group__5__Impl : ( ( rule__Service__CharacteristicAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1283:1: ( ( ( rule__Service__CharacteristicAssignment_5 ) ) )
            // InternalBagDsl.g:1284:1: ( ( rule__Service__CharacteristicAssignment_5 ) )
            {
            // InternalBagDsl.g:1284:1: ( ( rule__Service__CharacteristicAssignment_5 ) )
            // InternalBagDsl.g:1285:2: ( rule__Service__CharacteristicAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getCharacteristicAssignment_5()); 
            // InternalBagDsl.g:1286:2: ( rule__Service__CharacteristicAssignment_5 )
            // InternalBagDsl.g:1286:3: rule__Service__CharacteristicAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__CharacteristicAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCharacteristicAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalBagDsl.g:1294:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1298:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalBagDsl.g:1299:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalBagDsl.g:1306:1: rule__Service__Group__6__Impl : ( ( rule__Service__Group_6__0 )* ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1310:1: ( ( ( rule__Service__Group_6__0 )* ) )
            // InternalBagDsl.g:1311:1: ( ( rule__Service__Group_6__0 )* )
            {
            // InternalBagDsl.g:1311:1: ( ( rule__Service__Group_6__0 )* )
            // InternalBagDsl.g:1312:2: ( rule__Service__Group_6__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_6()); 
            // InternalBagDsl.g:1313:2: ( rule__Service__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBagDsl.g:1313:3: rule__Service__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Service__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalBagDsl.g:1321:1: rule__Service__Group__7 : rule__Service__Group__7__Impl ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1325:1: ( rule__Service__Group__7__Impl )
            // InternalBagDsl.g:1326:2: rule__Service__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalBagDsl.g:1332:1: rule__Service__Group__7__Impl : ( '}' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1336:1: ( ( '}' ) )
            // InternalBagDsl.g:1337:1: ( '}' )
            {
            // InternalBagDsl.g:1337:1: ( '}' )
            // InternalBagDsl.g:1338:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group_6__0"
    // InternalBagDsl.g:1348:1: rule__Service__Group_6__0 : rule__Service__Group_6__0__Impl rule__Service__Group_6__1 ;
    public final void rule__Service__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1352:1: ( rule__Service__Group_6__0__Impl rule__Service__Group_6__1 )
            // InternalBagDsl.g:1353:2: rule__Service__Group_6__0__Impl rule__Service__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__0"


    // $ANTLR start "rule__Service__Group_6__0__Impl"
    // InternalBagDsl.g:1360:1: rule__Service__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1364:1: ( ( ',' ) )
            // InternalBagDsl.g:1365:1: ( ',' )
            {
            // InternalBagDsl.g:1365:1: ( ',' )
            // InternalBagDsl.g:1366:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__0__Impl"


    // $ANTLR start "rule__Service__Group_6__1"
    // InternalBagDsl.g:1375:1: rule__Service__Group_6__1 : rule__Service__Group_6__1__Impl ;
    public final void rule__Service__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1379:1: ( rule__Service__Group_6__1__Impl )
            // InternalBagDsl.g:1380:2: rule__Service__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__1"


    // $ANTLR start "rule__Service__Group_6__1__Impl"
    // InternalBagDsl.g:1386:1: rule__Service__Group_6__1__Impl : ( ( rule__Service__CharacteristicAssignment_6_1 ) ) ;
    public final void rule__Service__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1390:1: ( ( ( rule__Service__CharacteristicAssignment_6_1 ) ) )
            // InternalBagDsl.g:1391:1: ( ( rule__Service__CharacteristicAssignment_6_1 ) )
            {
            // InternalBagDsl.g:1391:1: ( ( rule__Service__CharacteristicAssignment_6_1 ) )
            // InternalBagDsl.g:1392:2: ( rule__Service__CharacteristicAssignment_6_1 )
            {
             before(grammarAccess.getServiceAccess().getCharacteristicAssignment_6_1()); 
            // InternalBagDsl.g:1393:2: ( rule__Service__CharacteristicAssignment_6_1 )
            // InternalBagDsl.g:1393:3: rule__Service__CharacteristicAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__CharacteristicAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCharacteristicAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__1__Impl"


    // $ANTLR start "rule__Characteristic__Group__0"
    // InternalBagDsl.g:1402:1: rule__Characteristic__Group__0 : rule__Characteristic__Group__0__Impl rule__Characteristic__Group__1 ;
    public final void rule__Characteristic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1406:1: ( rule__Characteristic__Group__0__Impl rule__Characteristic__Group__1 )
            // InternalBagDsl.g:1407:2: rule__Characteristic__Group__0__Impl rule__Characteristic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Characteristic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__0"


    // $ANTLR start "rule__Characteristic__Group__0__Impl"
    // InternalBagDsl.g:1414:1: rule__Characteristic__Group__0__Impl : ( 'Characteristic' ) ;
    public final void rule__Characteristic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1418:1: ( ( 'Characteristic' ) )
            // InternalBagDsl.g:1419:1: ( 'Characteristic' )
            {
            // InternalBagDsl.g:1419:1: ( 'Characteristic' )
            // InternalBagDsl.g:1420:2: 'Characteristic'
            {
             before(grammarAccess.getCharacteristicAccess().getCharacteristicKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getCharacteristicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__0__Impl"


    // $ANTLR start "rule__Characteristic__Group__1"
    // InternalBagDsl.g:1429:1: rule__Characteristic__Group__1 : rule__Characteristic__Group__1__Impl rule__Characteristic__Group__2 ;
    public final void rule__Characteristic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1433:1: ( rule__Characteristic__Group__1__Impl rule__Characteristic__Group__2 )
            // InternalBagDsl.g:1434:2: rule__Characteristic__Group__1__Impl rule__Characteristic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Characteristic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__1"


    // $ANTLR start "rule__Characteristic__Group__1__Impl"
    // InternalBagDsl.g:1441:1: rule__Characteristic__Group__1__Impl : ( ( rule__Characteristic__NameAssignment_1 ) ) ;
    public final void rule__Characteristic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1445:1: ( ( ( rule__Characteristic__NameAssignment_1 ) ) )
            // InternalBagDsl.g:1446:1: ( ( rule__Characteristic__NameAssignment_1 ) )
            {
            // InternalBagDsl.g:1446:1: ( ( rule__Characteristic__NameAssignment_1 ) )
            // InternalBagDsl.g:1447:2: ( rule__Characteristic__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicAccess().getNameAssignment_1()); 
            // InternalBagDsl.g:1448:2: ( rule__Characteristic__NameAssignment_1 )
            // InternalBagDsl.g:1448:3: rule__Characteristic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__1__Impl"


    // $ANTLR start "rule__Characteristic__Group__2"
    // InternalBagDsl.g:1456:1: rule__Characteristic__Group__2 : rule__Characteristic__Group__2__Impl rule__Characteristic__Group__3 ;
    public final void rule__Characteristic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1460:1: ( rule__Characteristic__Group__2__Impl rule__Characteristic__Group__3 )
            // InternalBagDsl.g:1461:2: rule__Characteristic__Group__2__Impl rule__Characteristic__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Characteristic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__2"


    // $ANTLR start "rule__Characteristic__Group__2__Impl"
    // InternalBagDsl.g:1468:1: rule__Characteristic__Group__2__Impl : ( '{' ) ;
    public final void rule__Characteristic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1472:1: ( ( '{' ) )
            // InternalBagDsl.g:1473:1: ( '{' )
            {
            // InternalBagDsl.g:1473:1: ( '{' )
            // InternalBagDsl.g:1474:2: '{'
            {
             before(grammarAccess.getCharacteristicAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__2__Impl"


    // $ANTLR start "rule__Characteristic__Group__3"
    // InternalBagDsl.g:1483:1: rule__Characteristic__Group__3 : rule__Characteristic__Group__3__Impl rule__Characteristic__Group__4 ;
    public final void rule__Characteristic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1487:1: ( rule__Characteristic__Group__3__Impl rule__Characteristic__Group__4 )
            // InternalBagDsl.g:1488:2: rule__Characteristic__Group__3__Impl rule__Characteristic__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Characteristic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__3"


    // $ANTLR start "rule__Characteristic__Group__3__Impl"
    // InternalBagDsl.g:1495:1: rule__Characteristic__Group__3__Impl : ( 'uuid' ) ;
    public final void rule__Characteristic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1499:1: ( ( 'uuid' ) )
            // InternalBagDsl.g:1500:1: ( 'uuid' )
            {
            // InternalBagDsl.g:1500:1: ( 'uuid' )
            // InternalBagDsl.g:1501:2: 'uuid'
            {
             before(grammarAccess.getCharacteristicAccess().getUuidKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getUuidKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__3__Impl"


    // $ANTLR start "rule__Characteristic__Group__4"
    // InternalBagDsl.g:1510:1: rule__Characteristic__Group__4 : rule__Characteristic__Group__4__Impl rule__Characteristic__Group__5 ;
    public final void rule__Characteristic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1514:1: ( rule__Characteristic__Group__4__Impl rule__Characteristic__Group__5 )
            // InternalBagDsl.g:1515:2: rule__Characteristic__Group__4__Impl rule__Characteristic__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Characteristic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__4"


    // $ANTLR start "rule__Characteristic__Group__4__Impl"
    // InternalBagDsl.g:1522:1: rule__Characteristic__Group__4__Impl : ( ( rule__Characteristic__UuidAssignment_4 ) ) ;
    public final void rule__Characteristic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1526:1: ( ( ( rule__Characteristic__UuidAssignment_4 ) ) )
            // InternalBagDsl.g:1527:1: ( ( rule__Characteristic__UuidAssignment_4 ) )
            {
            // InternalBagDsl.g:1527:1: ( ( rule__Characteristic__UuidAssignment_4 ) )
            // InternalBagDsl.g:1528:2: ( rule__Characteristic__UuidAssignment_4 )
            {
             before(grammarAccess.getCharacteristicAccess().getUuidAssignment_4()); 
            // InternalBagDsl.g:1529:2: ( rule__Characteristic__UuidAssignment_4 )
            // InternalBagDsl.g:1529:3: rule__Characteristic__UuidAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__UuidAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getUuidAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__4__Impl"


    // $ANTLR start "rule__Characteristic__Group__5"
    // InternalBagDsl.g:1537:1: rule__Characteristic__Group__5 : rule__Characteristic__Group__5__Impl rule__Characteristic__Group__6 ;
    public final void rule__Characteristic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1541:1: ( rule__Characteristic__Group__5__Impl rule__Characteristic__Group__6 )
            // InternalBagDsl.g:1542:2: rule__Characteristic__Group__5__Impl rule__Characteristic__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Characteristic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__5"


    // $ANTLR start "rule__Characteristic__Group__5__Impl"
    // InternalBagDsl.g:1549:1: rule__Characteristic__Group__5__Impl : ( 'dataType' ) ;
    public final void rule__Characteristic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1553:1: ( ( 'dataType' ) )
            // InternalBagDsl.g:1554:1: ( 'dataType' )
            {
            // InternalBagDsl.g:1554:1: ( 'dataType' )
            // InternalBagDsl.g:1555:2: 'dataType'
            {
             before(grammarAccess.getCharacteristicAccess().getDataTypeKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getDataTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__5__Impl"


    // $ANTLR start "rule__Characteristic__Group__6"
    // InternalBagDsl.g:1564:1: rule__Characteristic__Group__6 : rule__Characteristic__Group__6__Impl rule__Characteristic__Group__7 ;
    public final void rule__Characteristic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1568:1: ( rule__Characteristic__Group__6__Impl rule__Characteristic__Group__7 )
            // InternalBagDsl.g:1569:2: rule__Characteristic__Group__6__Impl rule__Characteristic__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Characteristic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__6"


    // $ANTLR start "rule__Characteristic__Group__6__Impl"
    // InternalBagDsl.g:1576:1: rule__Characteristic__Group__6__Impl : ( ( rule__Characteristic__DataTypeAssignment_6 ) ) ;
    public final void rule__Characteristic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1580:1: ( ( ( rule__Characteristic__DataTypeAssignment_6 ) ) )
            // InternalBagDsl.g:1581:1: ( ( rule__Characteristic__DataTypeAssignment_6 ) )
            {
            // InternalBagDsl.g:1581:1: ( ( rule__Characteristic__DataTypeAssignment_6 ) )
            // InternalBagDsl.g:1582:2: ( rule__Characteristic__DataTypeAssignment_6 )
            {
             before(grammarAccess.getCharacteristicAccess().getDataTypeAssignment_6()); 
            // InternalBagDsl.g:1583:2: ( rule__Characteristic__DataTypeAssignment_6 )
            // InternalBagDsl.g:1583:3: rule__Characteristic__DataTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__DataTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getDataTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__6__Impl"


    // $ANTLR start "rule__Characteristic__Group__7"
    // InternalBagDsl.g:1591:1: rule__Characteristic__Group__7 : rule__Characteristic__Group__7__Impl rule__Characteristic__Group__8 ;
    public final void rule__Characteristic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1595:1: ( rule__Characteristic__Group__7__Impl rule__Characteristic__Group__8 )
            // InternalBagDsl.g:1596:2: rule__Characteristic__Group__7__Impl rule__Characteristic__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Characteristic__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__7"


    // $ANTLR start "rule__Characteristic__Group__7__Impl"
    // InternalBagDsl.g:1603:1: rule__Characteristic__Group__7__Impl : ( ( rule__Characteristic__Group_7__0 )? ) ;
    public final void rule__Characteristic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1607:1: ( ( ( rule__Characteristic__Group_7__0 )? ) )
            // InternalBagDsl.g:1608:1: ( ( rule__Characteristic__Group_7__0 )? )
            {
            // InternalBagDsl.g:1608:1: ( ( rule__Characteristic__Group_7__0 )? )
            // InternalBagDsl.g:1609:2: ( rule__Characteristic__Group_7__0 )?
            {
             before(grammarAccess.getCharacteristicAccess().getGroup_7()); 
            // InternalBagDsl.g:1610:2: ( rule__Characteristic__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBagDsl.g:1610:3: rule__Characteristic__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Characteristic__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacteristicAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__7__Impl"


    // $ANTLR start "rule__Characteristic__Group__8"
    // InternalBagDsl.g:1618:1: rule__Characteristic__Group__8 : rule__Characteristic__Group__8__Impl rule__Characteristic__Group__9 ;
    public final void rule__Characteristic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1622:1: ( rule__Characteristic__Group__8__Impl rule__Characteristic__Group__9 )
            // InternalBagDsl.g:1623:2: rule__Characteristic__Group__8__Impl rule__Characteristic__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Characteristic__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__8"


    // $ANTLR start "rule__Characteristic__Group__8__Impl"
    // InternalBagDsl.g:1630:1: rule__Characteristic__Group__8__Impl : ( 'read' ) ;
    public final void rule__Characteristic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1634:1: ( ( 'read' ) )
            // InternalBagDsl.g:1635:1: ( 'read' )
            {
            // InternalBagDsl.g:1635:1: ( 'read' )
            // InternalBagDsl.g:1636:2: 'read'
            {
             before(grammarAccess.getCharacteristicAccess().getReadKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getReadKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__8__Impl"


    // $ANTLR start "rule__Characteristic__Group__9"
    // InternalBagDsl.g:1645:1: rule__Characteristic__Group__9 : rule__Characteristic__Group__9__Impl rule__Characteristic__Group__10 ;
    public final void rule__Characteristic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1649:1: ( rule__Characteristic__Group__9__Impl rule__Characteristic__Group__10 )
            // InternalBagDsl.g:1650:2: rule__Characteristic__Group__9__Impl rule__Characteristic__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Characteristic__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__9"


    // $ANTLR start "rule__Characteristic__Group__9__Impl"
    // InternalBagDsl.g:1657:1: rule__Characteristic__Group__9__Impl : ( ( rule__Characteristic__ReadAssignment_9 ) ) ;
    public final void rule__Characteristic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1661:1: ( ( ( rule__Characteristic__ReadAssignment_9 ) ) )
            // InternalBagDsl.g:1662:1: ( ( rule__Characteristic__ReadAssignment_9 ) )
            {
            // InternalBagDsl.g:1662:1: ( ( rule__Characteristic__ReadAssignment_9 ) )
            // InternalBagDsl.g:1663:2: ( rule__Characteristic__ReadAssignment_9 )
            {
             before(grammarAccess.getCharacteristicAccess().getReadAssignment_9()); 
            // InternalBagDsl.g:1664:2: ( rule__Characteristic__ReadAssignment_9 )
            // InternalBagDsl.g:1664:3: rule__Characteristic__ReadAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__ReadAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getReadAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__9__Impl"


    // $ANTLR start "rule__Characteristic__Group__10"
    // InternalBagDsl.g:1672:1: rule__Characteristic__Group__10 : rule__Characteristic__Group__10__Impl rule__Characteristic__Group__11 ;
    public final void rule__Characteristic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1676:1: ( rule__Characteristic__Group__10__Impl rule__Characteristic__Group__11 )
            // InternalBagDsl.g:1677:2: rule__Characteristic__Group__10__Impl rule__Characteristic__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Characteristic__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__10"


    // $ANTLR start "rule__Characteristic__Group__10__Impl"
    // InternalBagDsl.g:1684:1: rule__Characteristic__Group__10__Impl : ( 'write' ) ;
    public final void rule__Characteristic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1688:1: ( ( 'write' ) )
            // InternalBagDsl.g:1689:1: ( 'write' )
            {
            // InternalBagDsl.g:1689:1: ( 'write' )
            // InternalBagDsl.g:1690:2: 'write'
            {
             before(grammarAccess.getCharacteristicAccess().getWriteKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getWriteKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__10__Impl"


    // $ANTLR start "rule__Characteristic__Group__11"
    // InternalBagDsl.g:1699:1: rule__Characteristic__Group__11 : rule__Characteristic__Group__11__Impl rule__Characteristic__Group__12 ;
    public final void rule__Characteristic__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1703:1: ( rule__Characteristic__Group__11__Impl rule__Characteristic__Group__12 )
            // InternalBagDsl.g:1704:2: rule__Characteristic__Group__11__Impl rule__Characteristic__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Characteristic__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__11"


    // $ANTLR start "rule__Characteristic__Group__11__Impl"
    // InternalBagDsl.g:1711:1: rule__Characteristic__Group__11__Impl : ( ( rule__Characteristic__WriteAssignment_11 ) ) ;
    public final void rule__Characteristic__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1715:1: ( ( ( rule__Characteristic__WriteAssignment_11 ) ) )
            // InternalBagDsl.g:1716:1: ( ( rule__Characteristic__WriteAssignment_11 ) )
            {
            // InternalBagDsl.g:1716:1: ( ( rule__Characteristic__WriteAssignment_11 ) )
            // InternalBagDsl.g:1717:2: ( rule__Characteristic__WriteAssignment_11 )
            {
             before(grammarAccess.getCharacteristicAccess().getWriteAssignment_11()); 
            // InternalBagDsl.g:1718:2: ( rule__Characteristic__WriteAssignment_11 )
            // InternalBagDsl.g:1718:3: rule__Characteristic__WriteAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__WriteAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getWriteAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__11__Impl"


    // $ANTLR start "rule__Characteristic__Group__12"
    // InternalBagDsl.g:1726:1: rule__Characteristic__Group__12 : rule__Characteristic__Group__12__Impl rule__Characteristic__Group__13 ;
    public final void rule__Characteristic__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1730:1: ( rule__Characteristic__Group__12__Impl rule__Characteristic__Group__13 )
            // InternalBagDsl.g:1731:2: rule__Characteristic__Group__12__Impl rule__Characteristic__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__Characteristic__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__12"


    // $ANTLR start "rule__Characteristic__Group__12__Impl"
    // InternalBagDsl.g:1738:1: rule__Characteristic__Group__12__Impl : ( 'notification' ) ;
    public final void rule__Characteristic__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1742:1: ( ( 'notification' ) )
            // InternalBagDsl.g:1743:1: ( 'notification' )
            {
            // InternalBagDsl.g:1743:1: ( 'notification' )
            // InternalBagDsl.g:1744:2: 'notification'
            {
             before(grammarAccess.getCharacteristicAccess().getNotificationKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getNotificationKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__12__Impl"


    // $ANTLR start "rule__Characteristic__Group__13"
    // InternalBagDsl.g:1753:1: rule__Characteristic__Group__13 : rule__Characteristic__Group__13__Impl rule__Characteristic__Group__14 ;
    public final void rule__Characteristic__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1757:1: ( rule__Characteristic__Group__13__Impl rule__Characteristic__Group__14 )
            // InternalBagDsl.g:1758:2: rule__Characteristic__Group__13__Impl rule__Characteristic__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Characteristic__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__13"


    // $ANTLR start "rule__Characteristic__Group__13__Impl"
    // InternalBagDsl.g:1765:1: rule__Characteristic__Group__13__Impl : ( ( rule__Characteristic__NotificationAssignment_13 ) ) ;
    public final void rule__Characteristic__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1769:1: ( ( ( rule__Characteristic__NotificationAssignment_13 ) ) )
            // InternalBagDsl.g:1770:1: ( ( rule__Characteristic__NotificationAssignment_13 ) )
            {
            // InternalBagDsl.g:1770:1: ( ( rule__Characteristic__NotificationAssignment_13 ) )
            // InternalBagDsl.g:1771:2: ( rule__Characteristic__NotificationAssignment_13 )
            {
             before(grammarAccess.getCharacteristicAccess().getNotificationAssignment_13()); 
            // InternalBagDsl.g:1772:2: ( rule__Characteristic__NotificationAssignment_13 )
            // InternalBagDsl.g:1772:3: rule__Characteristic__NotificationAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__NotificationAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getNotificationAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__13__Impl"


    // $ANTLR start "rule__Characteristic__Group__14"
    // InternalBagDsl.g:1780:1: rule__Characteristic__Group__14 : rule__Characteristic__Group__14__Impl rule__Characteristic__Group__15 ;
    public final void rule__Characteristic__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1784:1: ( rule__Characteristic__Group__14__Impl rule__Characteristic__Group__15 )
            // InternalBagDsl.g:1785:2: rule__Characteristic__Group__14__Impl rule__Characteristic__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__Characteristic__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__14"


    // $ANTLR start "rule__Characteristic__Group__14__Impl"
    // InternalBagDsl.g:1792:1: rule__Characteristic__Group__14__Impl : ( ( rule__Characteristic__UielementAssignment_14 )? ) ;
    public final void rule__Characteristic__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1796:1: ( ( ( rule__Characteristic__UielementAssignment_14 )? ) )
            // InternalBagDsl.g:1797:1: ( ( rule__Characteristic__UielementAssignment_14 )? )
            {
            // InternalBagDsl.g:1797:1: ( ( rule__Characteristic__UielementAssignment_14 )? )
            // InternalBagDsl.g:1798:2: ( rule__Characteristic__UielementAssignment_14 )?
            {
             before(grammarAccess.getCharacteristicAccess().getUielementAssignment_14()); 
            // InternalBagDsl.g:1799:2: ( rule__Characteristic__UielementAssignment_14 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBagDsl.g:1799:3: rule__Characteristic__UielementAssignment_14
                    {
                    pushFollow(FOLLOW_2);
                    rule__Characteristic__UielementAssignment_14();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacteristicAccess().getUielementAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__14__Impl"


    // $ANTLR start "rule__Characteristic__Group__15"
    // InternalBagDsl.g:1807:1: rule__Characteristic__Group__15 : rule__Characteristic__Group__15__Impl ;
    public final void rule__Characteristic__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1811:1: ( rule__Characteristic__Group__15__Impl )
            // InternalBagDsl.g:1812:2: rule__Characteristic__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__15"


    // $ANTLR start "rule__Characteristic__Group__15__Impl"
    // InternalBagDsl.g:1818:1: rule__Characteristic__Group__15__Impl : ( '}' ) ;
    public final void rule__Characteristic__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1822:1: ( ( '}' ) )
            // InternalBagDsl.g:1823:1: ( '}' )
            {
            // InternalBagDsl.g:1823:1: ( '}' )
            // InternalBagDsl.g:1824:2: '}'
            {
             before(grammarAccess.getCharacteristicAccess().getRightCurlyBracketKeyword_15()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group__15__Impl"


    // $ANTLR start "rule__Characteristic__Group_7__0"
    // InternalBagDsl.g:1834:1: rule__Characteristic__Group_7__0 : rule__Characteristic__Group_7__0__Impl rule__Characteristic__Group_7__1 ;
    public final void rule__Characteristic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1838:1: ( rule__Characteristic__Group_7__0__Impl rule__Characteristic__Group_7__1 )
            // InternalBagDsl.g:1839:2: rule__Characteristic__Group_7__0__Impl rule__Characteristic__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Characteristic__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group_7__0"


    // $ANTLR start "rule__Characteristic__Group_7__0__Impl"
    // InternalBagDsl.g:1846:1: rule__Characteristic__Group_7__0__Impl : ( 'unit' ) ;
    public final void rule__Characteristic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1850:1: ( ( 'unit' ) )
            // InternalBagDsl.g:1851:1: ( 'unit' )
            {
            // InternalBagDsl.g:1851:1: ( 'unit' )
            // InternalBagDsl.g:1852:2: 'unit'
            {
             before(grammarAccess.getCharacteristicAccess().getUnitKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getUnitKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group_7__0__Impl"


    // $ANTLR start "rule__Characteristic__Group_7__1"
    // InternalBagDsl.g:1861:1: rule__Characteristic__Group_7__1 : rule__Characteristic__Group_7__1__Impl ;
    public final void rule__Characteristic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1865:1: ( rule__Characteristic__Group_7__1__Impl )
            // InternalBagDsl.g:1866:2: rule__Characteristic__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group_7__1"


    // $ANTLR start "rule__Characteristic__Group_7__1__Impl"
    // InternalBagDsl.g:1872:1: rule__Characteristic__Group_7__1__Impl : ( ( rule__Characteristic__UnitAssignment_7_1 ) ) ;
    public final void rule__Characteristic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1876:1: ( ( ( rule__Characteristic__UnitAssignment_7_1 ) ) )
            // InternalBagDsl.g:1877:1: ( ( rule__Characteristic__UnitAssignment_7_1 ) )
            {
            // InternalBagDsl.g:1877:1: ( ( rule__Characteristic__UnitAssignment_7_1 ) )
            // InternalBagDsl.g:1878:2: ( rule__Characteristic__UnitAssignment_7_1 )
            {
             before(grammarAccess.getCharacteristicAccess().getUnitAssignment_7_1()); 
            // InternalBagDsl.g:1879:2: ( rule__Characteristic__UnitAssignment_7_1 )
            // InternalBagDsl.g:1879:3: rule__Characteristic__UnitAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__UnitAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getUnitAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__Group_7__1__Impl"


    // $ANTLR start "rule__UIElement__Group__0"
    // InternalBagDsl.g:1888:1: rule__UIElement__Group__0 : rule__UIElement__Group__0__Impl rule__UIElement__Group__1 ;
    public final void rule__UIElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1892:1: ( rule__UIElement__Group__0__Impl rule__UIElement__Group__1 )
            // InternalBagDsl.g:1893:2: rule__UIElement__Group__0__Impl rule__UIElement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UIElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__0"


    // $ANTLR start "rule__UIElement__Group__0__Impl"
    // InternalBagDsl.g:1900:1: rule__UIElement__Group__0__Impl : ( 'UiElement' ) ;
    public final void rule__UIElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1904:1: ( ( 'UiElement' ) )
            // InternalBagDsl.g:1905:1: ( 'UiElement' )
            {
            // InternalBagDsl.g:1905:1: ( 'UiElement' )
            // InternalBagDsl.g:1906:2: 'UiElement'
            {
             before(grammarAccess.getUIElementAccess().getUiElementKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUIElementAccess().getUiElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__0__Impl"


    // $ANTLR start "rule__UIElement__Group__1"
    // InternalBagDsl.g:1915:1: rule__UIElement__Group__1 : rule__UIElement__Group__1__Impl rule__UIElement__Group__2 ;
    public final void rule__UIElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1919:1: ( rule__UIElement__Group__1__Impl rule__UIElement__Group__2 )
            // InternalBagDsl.g:1920:2: rule__UIElement__Group__1__Impl rule__UIElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UIElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__1"


    // $ANTLR start "rule__UIElement__Group__1__Impl"
    // InternalBagDsl.g:1927:1: rule__UIElement__Group__1__Impl : ( ( rule__UIElement__NameAssignment_1 ) ) ;
    public final void rule__UIElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1931:1: ( ( ( rule__UIElement__NameAssignment_1 ) ) )
            // InternalBagDsl.g:1932:1: ( ( rule__UIElement__NameAssignment_1 ) )
            {
            // InternalBagDsl.g:1932:1: ( ( rule__UIElement__NameAssignment_1 ) )
            // InternalBagDsl.g:1933:2: ( rule__UIElement__NameAssignment_1 )
            {
             before(grammarAccess.getUIElementAccess().getNameAssignment_1()); 
            // InternalBagDsl.g:1934:2: ( rule__UIElement__NameAssignment_1 )
            // InternalBagDsl.g:1934:3: rule__UIElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UIElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__1__Impl"


    // $ANTLR start "rule__UIElement__Group__2"
    // InternalBagDsl.g:1942:1: rule__UIElement__Group__2 : rule__UIElement__Group__2__Impl rule__UIElement__Group__3 ;
    public final void rule__UIElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1946:1: ( rule__UIElement__Group__2__Impl rule__UIElement__Group__3 )
            // InternalBagDsl.g:1947:2: rule__UIElement__Group__2__Impl rule__UIElement__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__UIElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__2"


    // $ANTLR start "rule__UIElement__Group__2__Impl"
    // InternalBagDsl.g:1954:1: rule__UIElement__Group__2__Impl : ( '{' ) ;
    public final void rule__UIElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1958:1: ( ( '{' ) )
            // InternalBagDsl.g:1959:1: ( '{' )
            {
            // InternalBagDsl.g:1959:1: ( '{' )
            // InternalBagDsl.g:1960:2: '{'
            {
             before(grammarAccess.getUIElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUIElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__2__Impl"


    // $ANTLR start "rule__UIElement__Group__3"
    // InternalBagDsl.g:1969:1: rule__UIElement__Group__3 : rule__UIElement__Group__3__Impl rule__UIElement__Group__4 ;
    public final void rule__UIElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1973:1: ( rule__UIElement__Group__3__Impl rule__UIElement__Group__4 )
            // InternalBagDsl.g:1974:2: rule__UIElement__Group__3__Impl rule__UIElement__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__UIElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__3"


    // $ANTLR start "rule__UIElement__Group__3__Impl"
    // InternalBagDsl.g:1981:1: rule__UIElement__Group__3__Impl : ( 'label' ) ;
    public final void rule__UIElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:1985:1: ( ( 'label' ) )
            // InternalBagDsl.g:1986:1: ( 'label' )
            {
            // InternalBagDsl.g:1986:1: ( 'label' )
            // InternalBagDsl.g:1987:2: 'label'
            {
             before(grammarAccess.getUIElementAccess().getLabelKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUIElementAccess().getLabelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__3__Impl"


    // $ANTLR start "rule__UIElement__Group__4"
    // InternalBagDsl.g:1996:1: rule__UIElement__Group__4 : rule__UIElement__Group__4__Impl rule__UIElement__Group__5 ;
    public final void rule__UIElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2000:1: ( rule__UIElement__Group__4__Impl rule__UIElement__Group__5 )
            // InternalBagDsl.g:2001:2: rule__UIElement__Group__4__Impl rule__UIElement__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__UIElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__4"


    // $ANTLR start "rule__UIElement__Group__4__Impl"
    // InternalBagDsl.g:2008:1: rule__UIElement__Group__4__Impl : ( ( rule__UIElement__LabelAssignment_4 ) ) ;
    public final void rule__UIElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2012:1: ( ( ( rule__UIElement__LabelAssignment_4 ) ) )
            // InternalBagDsl.g:2013:1: ( ( rule__UIElement__LabelAssignment_4 ) )
            {
            // InternalBagDsl.g:2013:1: ( ( rule__UIElement__LabelAssignment_4 ) )
            // InternalBagDsl.g:2014:2: ( rule__UIElement__LabelAssignment_4 )
            {
             before(grammarAccess.getUIElementAccess().getLabelAssignment_4()); 
            // InternalBagDsl.g:2015:2: ( rule__UIElement__LabelAssignment_4 )
            // InternalBagDsl.g:2015:3: rule__UIElement__LabelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UIElement__LabelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getLabelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__4__Impl"


    // $ANTLR start "rule__UIElement__Group__5"
    // InternalBagDsl.g:2023:1: rule__UIElement__Group__5 : rule__UIElement__Group__5__Impl rule__UIElement__Group__6 ;
    public final void rule__UIElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2027:1: ( rule__UIElement__Group__5__Impl rule__UIElement__Group__6 )
            // InternalBagDsl.g:2028:2: rule__UIElement__Group__5__Impl rule__UIElement__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__UIElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__5"


    // $ANTLR start "rule__UIElement__Group__5__Impl"
    // InternalBagDsl.g:2035:1: rule__UIElement__Group__5__Impl : ( ( rule__UIElement__Group_5__0 )? ) ;
    public final void rule__UIElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2039:1: ( ( ( rule__UIElement__Group_5__0 )? ) )
            // InternalBagDsl.g:2040:1: ( ( rule__UIElement__Group_5__0 )? )
            {
            // InternalBagDsl.g:2040:1: ( ( rule__UIElement__Group_5__0 )? )
            // InternalBagDsl.g:2041:2: ( rule__UIElement__Group_5__0 )?
            {
             before(grammarAccess.getUIElementAccess().getGroup_5()); 
            // InternalBagDsl.g:2042:2: ( rule__UIElement__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBagDsl.g:2042:3: rule__UIElement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UIElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUIElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__5__Impl"


    // $ANTLR start "rule__UIElement__Group__6"
    // InternalBagDsl.g:2050:1: rule__UIElement__Group__6 : rule__UIElement__Group__6__Impl ;
    public final void rule__UIElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2054:1: ( rule__UIElement__Group__6__Impl )
            // InternalBagDsl.g:2055:2: rule__UIElement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UIElement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__6"


    // $ANTLR start "rule__UIElement__Group__6__Impl"
    // InternalBagDsl.g:2061:1: rule__UIElement__Group__6__Impl : ( '}' ) ;
    public final void rule__UIElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2065:1: ( ( '}' ) )
            // InternalBagDsl.g:2066:1: ( '}' )
            {
            // InternalBagDsl.g:2066:1: ( '}' )
            // InternalBagDsl.g:2067:2: '}'
            {
             before(grammarAccess.getUIElementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUIElementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group__6__Impl"


    // $ANTLR start "rule__UIElement__Group_5__0"
    // InternalBagDsl.g:2077:1: rule__UIElement__Group_5__0 : rule__UIElement__Group_5__0__Impl rule__UIElement__Group_5__1 ;
    public final void rule__UIElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2081:1: ( rule__UIElement__Group_5__0__Impl rule__UIElement__Group_5__1 )
            // InternalBagDsl.g:2082:2: rule__UIElement__Group_5__0__Impl rule__UIElement__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__UIElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group_5__0"


    // $ANTLR start "rule__UIElement__Group_5__0__Impl"
    // InternalBagDsl.g:2089:1: rule__UIElement__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__UIElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2093:1: ( ( 'description' ) )
            // InternalBagDsl.g:2094:1: ( 'description' )
            {
            // InternalBagDsl.g:2094:1: ( 'description' )
            // InternalBagDsl.g:2095:2: 'description'
            {
             before(grammarAccess.getUIElementAccess().getDescriptionKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getUIElementAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group_5__0__Impl"


    // $ANTLR start "rule__UIElement__Group_5__1"
    // InternalBagDsl.g:2104:1: rule__UIElement__Group_5__1 : rule__UIElement__Group_5__1__Impl ;
    public final void rule__UIElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2108:1: ( rule__UIElement__Group_5__1__Impl )
            // InternalBagDsl.g:2109:2: rule__UIElement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UIElement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group_5__1"


    // $ANTLR start "rule__UIElement__Group_5__1__Impl"
    // InternalBagDsl.g:2115:1: rule__UIElement__Group_5__1__Impl : ( ( rule__UIElement__DescriptionAssignment_5_1 ) ) ;
    public final void rule__UIElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2119:1: ( ( ( rule__UIElement__DescriptionAssignment_5_1 ) ) )
            // InternalBagDsl.g:2120:1: ( ( rule__UIElement__DescriptionAssignment_5_1 ) )
            {
            // InternalBagDsl.g:2120:1: ( ( rule__UIElement__DescriptionAssignment_5_1 ) )
            // InternalBagDsl.g:2121:2: ( rule__UIElement__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getUIElementAccess().getDescriptionAssignment_5_1()); 
            // InternalBagDsl.g:2122:2: ( rule__UIElement__DescriptionAssignment_5_1 )
            // InternalBagDsl.g:2122:3: rule__UIElement__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UIElement__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Group_5__1__Impl"


    // $ANTLR start "rule__App__NameAssignment_1"
    // InternalBagDsl.g:2131:1: rule__App__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2135:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2136:2: ( ruleEString )
            {
            // InternalBagDsl.g:2136:2: ( ruleEString )
            // InternalBagDsl.g:2137:3: ruleEString
            {
             before(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__NameAssignment_1"


    // $ANTLR start "rule__App__PackageNameAssignment_4"
    // InternalBagDsl.g:2146:1: rule__App__PackageNameAssignment_4 : ( ruleEString ) ;
    public final void rule__App__PackageNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2150:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2151:2: ( ruleEString )
            {
            // InternalBagDsl.g:2151:2: ( ruleEString )
            // InternalBagDsl.g:2152:3: ruleEString
            {
             before(grammarAccess.getAppAccess().getPackageNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getPackageNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__PackageNameAssignment_4"


    // $ANTLR start "rule__App__SensorAssignment_5"
    // InternalBagDsl.g:2161:1: rule__App__SensorAssignment_5 : ( ruleSensor ) ;
    public final void rule__App__SensorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2165:1: ( ( ruleSensor ) )
            // InternalBagDsl.g:2166:2: ( ruleSensor )
            {
            // InternalBagDsl.g:2166:2: ( ruleSensor )
            // InternalBagDsl.g:2167:3: ruleSensor
            {
             before(grammarAccess.getAppAccess().getSensorSensorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getAppAccess().getSensorSensorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__SensorAssignment_5"


    // $ANTLR start "rule__App__MacfilterAssignment_6"
    // InternalBagDsl.g:2176:1: rule__App__MacfilterAssignment_6 : ( ruleMacFilter ) ;
    public final void rule__App__MacfilterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2180:1: ( ( ruleMacFilter ) )
            // InternalBagDsl.g:2181:2: ( ruleMacFilter )
            {
            // InternalBagDsl.g:2181:2: ( ruleMacFilter )
            // InternalBagDsl.g:2182:3: ruleMacFilter
            {
             before(grammarAccess.getAppAccess().getMacfilterMacFilterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMacFilter();

            state._fsp--;

             after(grammarAccess.getAppAccess().getMacfilterMacFilterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__MacfilterAssignment_6"


    // $ANTLR start "rule__App__NamefilterAssignment_7"
    // InternalBagDsl.g:2191:1: rule__App__NamefilterAssignment_7 : ( ruleNameFilter ) ;
    public final void rule__App__NamefilterAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2195:1: ( ( ruleNameFilter ) )
            // InternalBagDsl.g:2196:2: ( ruleNameFilter )
            {
            // InternalBagDsl.g:2196:2: ( ruleNameFilter )
            // InternalBagDsl.g:2197:3: ruleNameFilter
            {
             before(grammarAccess.getAppAccess().getNamefilterNameFilterParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleNameFilter();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNamefilterNameFilterParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__NamefilterAssignment_7"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalBagDsl.g:2206:1: rule__Sensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2210:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2211:2: ( ruleEString )
            {
            // InternalBagDsl.g:2211:2: ( ruleEString )
            // InternalBagDsl.g:2212:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__ServiceAssignment_3"
    // InternalBagDsl.g:2221:1: rule__Sensor__ServiceAssignment_3 : ( ruleService ) ;
    public final void rule__Sensor__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2225:1: ( ( ruleService ) )
            // InternalBagDsl.g:2226:2: ( ruleService )
            {
            // InternalBagDsl.g:2226:2: ( ruleService )
            // InternalBagDsl.g:2227:3: ruleService
            {
             before(grammarAccess.getSensorAccess().getServiceServiceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getServiceServiceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ServiceAssignment_3"


    // $ANTLR start "rule__Sensor__ServiceAssignment_4_1"
    // InternalBagDsl.g:2236:1: rule__Sensor__ServiceAssignment_4_1 : ( ruleService ) ;
    public final void rule__Sensor__ServiceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2240:1: ( ( ruleService ) )
            // InternalBagDsl.g:2241:2: ( ruleService )
            {
            // InternalBagDsl.g:2241:2: ( ruleService )
            // InternalBagDsl.g:2242:3: ruleService
            {
             before(grammarAccess.getSensorAccess().getServiceServiceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getServiceServiceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ServiceAssignment_4_1"


    // $ANTLR start "rule__MacFilter__MacaddressAssignment_2"
    // InternalBagDsl.g:2251:1: rule__MacFilter__MacaddressAssignment_2 : ( ruleMacAddress ) ;
    public final void rule__MacFilter__MacaddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2255:1: ( ( ruleMacAddress ) )
            // InternalBagDsl.g:2256:2: ( ruleMacAddress )
            {
            // InternalBagDsl.g:2256:2: ( ruleMacAddress )
            // InternalBagDsl.g:2257:3: ruleMacAddress
            {
             before(grammarAccess.getMacFilterAccess().getMacaddressMacAddressParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMacAddress();

            state._fsp--;

             after(grammarAccess.getMacFilterAccess().getMacaddressMacAddressParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__MacaddressAssignment_2"


    // $ANTLR start "rule__MacFilter__MacaddressAssignment_3_1"
    // InternalBagDsl.g:2266:1: rule__MacFilter__MacaddressAssignment_3_1 : ( ruleMacAddress ) ;
    public final void rule__MacFilter__MacaddressAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2270:1: ( ( ruleMacAddress ) )
            // InternalBagDsl.g:2271:2: ( ruleMacAddress )
            {
            // InternalBagDsl.g:2271:2: ( ruleMacAddress )
            // InternalBagDsl.g:2272:3: ruleMacAddress
            {
             before(grammarAccess.getMacFilterAccess().getMacaddressMacAddressParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMacAddress();

            state._fsp--;

             after(grammarAccess.getMacFilterAccess().getMacaddressMacAddressParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacFilter__MacaddressAssignment_3_1"


    // $ANTLR start "rule__NameFilter__NameAssignment_1"
    // InternalBagDsl.g:2281:1: rule__NameFilter__NameAssignment_1 : ( ruleNameExpression ) ;
    public final void rule__NameFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2285:1: ( ( ruleNameExpression ) )
            // InternalBagDsl.g:2286:2: ( ruleNameExpression )
            {
            // InternalBagDsl.g:2286:2: ( ruleNameExpression )
            // InternalBagDsl.g:2287:3: ruleNameExpression
            {
             before(grammarAccess.getNameFilterAccess().getNameNameExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameExpression();

            state._fsp--;

             after(grammarAccess.getNameFilterAccess().getNameNameExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameFilter__NameAssignment_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalBagDsl.g:2296:1: rule__Service__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2300:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2301:2: ( ruleEString )
            {
            // InternalBagDsl.g:2301:2: ( ruleEString )
            // InternalBagDsl.g:2302:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__UuidAssignment_4"
    // InternalBagDsl.g:2311:1: rule__Service__UuidAssignment_4 : ( ruleEString ) ;
    public final void rule__Service__UuidAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2315:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2316:2: ( ruleEString )
            {
            // InternalBagDsl.g:2316:2: ( ruleEString )
            // InternalBagDsl.g:2317:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getUuidEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getUuidEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__UuidAssignment_4"


    // $ANTLR start "rule__Service__CharacteristicAssignment_5"
    // InternalBagDsl.g:2326:1: rule__Service__CharacteristicAssignment_5 : ( ruleCharacteristic ) ;
    public final void rule__Service__CharacteristicAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2330:1: ( ( ruleCharacteristic ) )
            // InternalBagDsl.g:2331:2: ( ruleCharacteristic )
            {
            // InternalBagDsl.g:2331:2: ( ruleCharacteristic )
            // InternalBagDsl.g:2332:3: ruleCharacteristic
            {
             before(grammarAccess.getServiceAccess().getCharacteristicCharacteristicParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristic();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCharacteristicCharacteristicParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CharacteristicAssignment_5"


    // $ANTLR start "rule__Service__CharacteristicAssignment_6_1"
    // InternalBagDsl.g:2341:1: rule__Service__CharacteristicAssignment_6_1 : ( ruleCharacteristic ) ;
    public final void rule__Service__CharacteristicAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2345:1: ( ( ruleCharacteristic ) )
            // InternalBagDsl.g:2346:2: ( ruleCharacteristic )
            {
            // InternalBagDsl.g:2346:2: ( ruleCharacteristic )
            // InternalBagDsl.g:2347:3: ruleCharacteristic
            {
             before(grammarAccess.getServiceAccess().getCharacteristicCharacteristicParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristic();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCharacteristicCharacteristicParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CharacteristicAssignment_6_1"


    // $ANTLR start "rule__Characteristic__NameAssignment_1"
    // InternalBagDsl.g:2356:1: rule__Characteristic__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Characteristic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2360:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2361:2: ( ruleEString )
            {
            // InternalBagDsl.g:2361:2: ( ruleEString )
            // InternalBagDsl.g:2362:3: ruleEString
            {
             before(grammarAccess.getCharacteristicAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__NameAssignment_1"


    // $ANTLR start "rule__Characteristic__UuidAssignment_4"
    // InternalBagDsl.g:2371:1: rule__Characteristic__UuidAssignment_4 : ( ruleEString ) ;
    public final void rule__Characteristic__UuidAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2375:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2376:2: ( ruleEString )
            {
            // InternalBagDsl.g:2376:2: ( ruleEString )
            // InternalBagDsl.g:2377:3: ruleEString
            {
             before(grammarAccess.getCharacteristicAccess().getUuidEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getUuidEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__UuidAssignment_4"


    // $ANTLR start "rule__Characteristic__DataTypeAssignment_6"
    // InternalBagDsl.g:2386:1: rule__Characteristic__DataTypeAssignment_6 : ( ruleDataType ) ;
    public final void rule__Characteristic__DataTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2390:1: ( ( ruleDataType ) )
            // InternalBagDsl.g:2391:2: ( ruleDataType )
            {
            // InternalBagDsl.g:2391:2: ( ruleDataType )
            // InternalBagDsl.g:2392:3: ruleDataType
            {
             before(grammarAccess.getCharacteristicAccess().getDataTypeDataTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getDataTypeDataTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__DataTypeAssignment_6"


    // $ANTLR start "rule__Characteristic__UnitAssignment_7_1"
    // InternalBagDsl.g:2401:1: rule__Characteristic__UnitAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Characteristic__UnitAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2405:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2406:2: ( ruleEString )
            {
            // InternalBagDsl.g:2406:2: ( ruleEString )
            // InternalBagDsl.g:2407:3: ruleEString
            {
             before(grammarAccess.getCharacteristicAccess().getUnitEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getUnitEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__UnitAssignment_7_1"


    // $ANTLR start "rule__Characteristic__ReadAssignment_9"
    // InternalBagDsl.g:2416:1: rule__Characteristic__ReadAssignment_9 : ( ruleEBoolean ) ;
    public final void rule__Characteristic__ReadAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2420:1: ( ( ruleEBoolean ) )
            // InternalBagDsl.g:2421:2: ( ruleEBoolean )
            {
            // InternalBagDsl.g:2421:2: ( ruleEBoolean )
            // InternalBagDsl.g:2422:3: ruleEBoolean
            {
             before(grammarAccess.getCharacteristicAccess().getReadEBooleanParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getReadEBooleanParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__ReadAssignment_9"


    // $ANTLR start "rule__Characteristic__WriteAssignment_11"
    // InternalBagDsl.g:2431:1: rule__Characteristic__WriteAssignment_11 : ( ruleEBoolean ) ;
    public final void rule__Characteristic__WriteAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2435:1: ( ( ruleEBoolean ) )
            // InternalBagDsl.g:2436:2: ( ruleEBoolean )
            {
            // InternalBagDsl.g:2436:2: ( ruleEBoolean )
            // InternalBagDsl.g:2437:3: ruleEBoolean
            {
             before(grammarAccess.getCharacteristicAccess().getWriteEBooleanParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getWriteEBooleanParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__WriteAssignment_11"


    // $ANTLR start "rule__Characteristic__NotificationAssignment_13"
    // InternalBagDsl.g:2446:1: rule__Characteristic__NotificationAssignment_13 : ( ruleEBoolean ) ;
    public final void rule__Characteristic__NotificationAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2450:1: ( ( ruleEBoolean ) )
            // InternalBagDsl.g:2451:2: ( ruleEBoolean )
            {
            // InternalBagDsl.g:2451:2: ( ruleEBoolean )
            // InternalBagDsl.g:2452:3: ruleEBoolean
            {
             before(grammarAccess.getCharacteristicAccess().getNotificationEBooleanParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getNotificationEBooleanParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__NotificationAssignment_13"


    // $ANTLR start "rule__Characteristic__UielementAssignment_14"
    // InternalBagDsl.g:2461:1: rule__Characteristic__UielementAssignment_14 : ( ruleUIElement ) ;
    public final void rule__Characteristic__UielementAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2465:1: ( ( ruleUIElement ) )
            // InternalBagDsl.g:2466:2: ( ruleUIElement )
            {
            // InternalBagDsl.g:2466:2: ( ruleUIElement )
            // InternalBagDsl.g:2467:3: ruleUIElement
            {
             before(grammarAccess.getCharacteristicAccess().getUielementUIElementParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getUielementUIElementParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characteristic__UielementAssignment_14"


    // $ANTLR start "rule__UIElement__NameAssignment_1"
    // InternalBagDsl.g:2476:1: rule__UIElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__UIElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2480:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2481:2: ( ruleEString )
            {
            // InternalBagDsl.g:2481:2: ( ruleEString )
            // InternalBagDsl.g:2482:3: ruleEString
            {
             before(grammarAccess.getUIElementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUIElementAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__NameAssignment_1"


    // $ANTLR start "rule__UIElement__LabelAssignment_4"
    // InternalBagDsl.g:2491:1: rule__UIElement__LabelAssignment_4 : ( ruleEString ) ;
    public final void rule__UIElement__LabelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2495:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2496:2: ( ruleEString )
            {
            // InternalBagDsl.g:2496:2: ( ruleEString )
            // InternalBagDsl.g:2497:3: ruleEString
            {
             before(grammarAccess.getUIElementAccess().getLabelEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUIElementAccess().getLabelEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__LabelAssignment_4"


    // $ANTLR start "rule__UIElement__DescriptionAssignment_5_1"
    // InternalBagDsl.g:2506:1: rule__UIElement__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__UIElement__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2510:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2511:2: ( ruleEString )
            {
            // InternalBagDsl.g:2511:2: ( ruleEString )
            // InternalBagDsl.g:2512:3: ruleEString
            {
             before(grammarAccess.getUIElementAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUIElementAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__DescriptionAssignment_5_1"


    // $ANTLR start "rule__MacAddress__AddressAssignment"
    // InternalBagDsl.g:2521:1: rule__MacAddress__AddressAssignment : ( ruleEString ) ;
    public final void rule__MacAddress__AddressAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2525:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2526:2: ( ruleEString )
            {
            // InternalBagDsl.g:2526:2: ( ruleEString )
            // InternalBagDsl.g:2527:3: ruleEString
            {
             before(grammarAccess.getMacAddressAccess().getAddressEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMacAddressAccess().getAddressEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacAddress__AddressAssignment"


    // $ANTLR start "rule__NameExpression__RegExAssignment"
    // InternalBagDsl.g:2536:1: rule__NameExpression__RegExAssignment : ( ruleEString ) ;
    public final void rule__NameExpression__RegExAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBagDsl.g:2540:1: ( ( ruleEString ) )
            // InternalBagDsl.g:2541:2: ( ruleEString )
            {
            // InternalBagDsl.g:2541:2: ( ruleEString )
            // InternalBagDsl.g:2542:3: ruleEString
            {
             before(grammarAccess.getNameExpressionAccess().getRegExEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNameExpressionAccess().getRegExEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameExpression__RegExAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000006400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000400000L});

}