package bag.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import bag.dsl.services.BagDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBagDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "'{'", "'packageName'", "'}'", "'Sensor'", "','", "'MacFilter'", "'NameFilter'", "'Service'", "'uuid'", "'Characteristic'", "'dataType'", "'unit'", "'read'", "'write'", "'notification'", "'UiElement'", "'label'", "'description'", "'true'", "'false'", "'Float'", "'Double'", "'Integer'", "'String'", "'Bytes'", "'Byte'"
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

        public InternalBagDslParser(TokenStream input, BagDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "App";
       	}

       	@Override
       	protected BagDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApp"
    // InternalBagDsl.g:65:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalBagDsl.g:65:44: (iv_ruleApp= ruleApp EOF )
            // InternalBagDsl.g:66:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalBagDsl.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'packageName' ( (lv_packageName_4_0= ruleEString ) ) ( (lv_sensor_5_0= ruleSensor ) ) ( (lv_macfilter_6_0= ruleMacFilter ) )? ( (lv_namefilter_7_0= ruleNameFilter ) )? otherlv_8= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_packageName_4_0 = null;

        EObject lv_sensor_5_0 = null;

        EObject lv_macfilter_6_0 = null;

        EObject lv_namefilter_7_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:78:2: ( (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'packageName' ( (lv_packageName_4_0= ruleEString ) ) ( (lv_sensor_5_0= ruleSensor ) ) ( (lv_macfilter_6_0= ruleMacFilter ) )? ( (lv_namefilter_7_0= ruleNameFilter ) )? otherlv_8= '}' ) )
            // InternalBagDsl.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'packageName' ( (lv_packageName_4_0= ruleEString ) ) ( (lv_sensor_5_0= ruleSensor ) ) ( (lv_macfilter_6_0= ruleMacFilter ) )? ( (lv_namefilter_7_0= ruleNameFilter ) )? otherlv_8= '}' )
            {
            // InternalBagDsl.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'packageName' ( (lv_packageName_4_0= ruleEString ) ) ( (lv_sensor_5_0= ruleSensor ) ) ( (lv_macfilter_6_0= ruleMacFilter ) )? ( (lv_namefilter_7_0= ruleNameFilter ) )? otherlv_8= '}' )
            // InternalBagDsl.g:80:3: otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'packageName' ( (lv_packageName_4_0= ruleEString ) ) ( (lv_sensor_5_0= ruleSensor ) ) ( (lv_macfilter_6_0= ruleMacFilter ) )? ( (lv_namefilter_7_0= ruleNameFilter ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
            		
            // InternalBagDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBagDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalBagDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalBagDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getPackageNameKeyword_3());
            		
            // InternalBagDsl.g:111:3: ( (lv_packageName_4_0= ruleEString ) )
            // InternalBagDsl.g:112:4: (lv_packageName_4_0= ruleEString )
            {
            // InternalBagDsl.g:112:4: (lv_packageName_4_0= ruleEString )
            // InternalBagDsl.g:113:5: lv_packageName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppAccess().getPackageNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_packageName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					set(
            						current,
            						"packageName",
            						lv_packageName_4_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:130:3: ( (lv_sensor_5_0= ruleSensor ) )
            // InternalBagDsl.g:131:4: (lv_sensor_5_0= ruleSensor )
            {
            // InternalBagDsl.g:131:4: (lv_sensor_5_0= ruleSensor )
            // InternalBagDsl.g:132:5: lv_sensor_5_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getAppAccess().getSensorSensorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_sensor_5_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					set(
            						current,
            						"sensor",
            						lv_sensor_5_0,
            						"bag.dsl.BagDsl.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:149:3: ( (lv_macfilter_6_0= ruleMacFilter ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBagDsl.g:150:4: (lv_macfilter_6_0= ruleMacFilter )
                    {
                    // InternalBagDsl.g:150:4: (lv_macfilter_6_0= ruleMacFilter )
                    // InternalBagDsl.g:151:5: lv_macfilter_6_0= ruleMacFilter
                    {

                    					newCompositeNode(grammarAccess.getAppAccess().getMacfilterMacFilterParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_macfilter_6_0=ruleMacFilter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppRule());
                    					}
                    					set(
                    						current,
                    						"macfilter",
                    						lv_macfilter_6_0,
                    						"bag.dsl.BagDsl.MacFilter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBagDsl.g:168:3: ( (lv_namefilter_7_0= ruleNameFilter ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBagDsl.g:169:4: (lv_namefilter_7_0= ruleNameFilter )
                    {
                    // InternalBagDsl.g:169:4: (lv_namefilter_7_0= ruleNameFilter )
                    // InternalBagDsl.g:170:5: lv_namefilter_7_0= ruleNameFilter
                    {

                    					newCompositeNode(grammarAccess.getAppAccess().getNamefilterNameFilterParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_namefilter_7_0=ruleNameFilter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppRule());
                    					}
                    					set(
                    						current,
                    						"namefilter",
                    						lv_namefilter_7_0,
                    						"bag.dsl.BagDsl.NameFilter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleEString"
    // InternalBagDsl.g:195:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBagDsl.g:195:47: (iv_ruleEString= ruleEString EOF )
            // InternalBagDsl.g:196:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBagDsl.g:202:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBagDsl.g:208:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBagDsl.g:209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBagDsl.g:209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBagDsl.g:210:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBagDsl.g:218:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSensor"
    // InternalBagDsl.g:229:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalBagDsl.g:229:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalBagDsl.g:230:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalBagDsl.g:236:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_service_3_0= ruleService ) ) (otherlv_4= ',' ( (lv_service_5_0= ruleService ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_service_3_0 = null;

        EObject lv_service_5_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:242:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_service_3_0= ruleService ) ) (otherlv_4= ',' ( (lv_service_5_0= ruleService ) ) )* otherlv_6= '}' ) )
            // InternalBagDsl.g:243:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_service_3_0= ruleService ) ) (otherlv_4= ',' ( (lv_service_5_0= ruleService ) ) )* otherlv_6= '}' )
            {
            // InternalBagDsl.g:243:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_service_3_0= ruleService ) ) (otherlv_4= ',' ( (lv_service_5_0= ruleService ) ) )* otherlv_6= '}' )
            // InternalBagDsl.g:244:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_service_3_0= ruleService ) ) (otherlv_4= ',' ( (lv_service_5_0= ruleService ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalBagDsl.g:248:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBagDsl.g:249:4: (lv_name_1_0= ruleEString )
            {
            // InternalBagDsl.g:249:4: (lv_name_1_0= ruleEString )
            // InternalBagDsl.g:250:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBagDsl.g:271:3: ( (lv_service_3_0= ruleService ) )
            // InternalBagDsl.g:272:4: (lv_service_3_0= ruleService )
            {
            // InternalBagDsl.g:272:4: (lv_service_3_0= ruleService )
            // InternalBagDsl.g:273:5: lv_service_3_0= ruleService
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getServiceServiceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_service_3_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					add(
            						current,
            						"service",
            						lv_service_3_0,
            						"bag.dsl.BagDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:290:3: (otherlv_4= ',' ( (lv_service_5_0= ruleService ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBagDsl.g:291:4: otherlv_4= ',' ( (lv_service_5_0= ruleService ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalBagDsl.g:295:4: ( (lv_service_5_0= ruleService ) )
            	    // InternalBagDsl.g:296:5: (lv_service_5_0= ruleService )
            	    {
            	    // InternalBagDsl.g:296:5: (lv_service_5_0= ruleService )
            	    // InternalBagDsl.g:297:6: lv_service_5_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getSensorAccess().getServiceServiceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_service_5_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service",
            	    							lv_service_5_0,
            	    							"bag.dsl.BagDsl.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleMacFilter"
    // InternalBagDsl.g:323:1: entryRuleMacFilter returns [EObject current=null] : iv_ruleMacFilter= ruleMacFilter EOF ;
    public final EObject entryRuleMacFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacFilter = null;


        try {
            // InternalBagDsl.g:323:50: (iv_ruleMacFilter= ruleMacFilter EOF )
            // InternalBagDsl.g:324:2: iv_ruleMacFilter= ruleMacFilter EOF
            {
             newCompositeNode(grammarAccess.getMacFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacFilter=ruleMacFilter();

            state._fsp--;

             current =iv_ruleMacFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMacFilter"


    // $ANTLR start "ruleMacFilter"
    // InternalBagDsl.g:330:1: ruleMacFilter returns [EObject current=null] : (otherlv_0= 'MacFilter' otherlv_1= '{' ( (lv_macaddress_2_0= ruleMacAddress ) ) (otherlv_3= ',' ( (lv_macaddress_4_0= ruleMacAddress ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleMacFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_macaddress_2_0 = null;

        EObject lv_macaddress_4_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:336:2: ( (otherlv_0= 'MacFilter' otherlv_1= '{' ( (lv_macaddress_2_0= ruleMacAddress ) ) (otherlv_3= ',' ( (lv_macaddress_4_0= ruleMacAddress ) ) )* otherlv_5= '}' ) )
            // InternalBagDsl.g:337:2: (otherlv_0= 'MacFilter' otherlv_1= '{' ( (lv_macaddress_2_0= ruleMacAddress ) ) (otherlv_3= ',' ( (lv_macaddress_4_0= ruleMacAddress ) ) )* otherlv_5= '}' )
            {
            // InternalBagDsl.g:337:2: (otherlv_0= 'MacFilter' otherlv_1= '{' ( (lv_macaddress_2_0= ruleMacAddress ) ) (otherlv_3= ',' ( (lv_macaddress_4_0= ruleMacAddress ) ) )* otherlv_5= '}' )
            // InternalBagDsl.g:338:3: otherlv_0= 'MacFilter' otherlv_1= '{' ( (lv_macaddress_2_0= ruleMacAddress ) ) (otherlv_3= ',' ( (lv_macaddress_4_0= ruleMacAddress ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMacFilterAccess().getMacFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMacFilterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBagDsl.g:346:3: ( (lv_macaddress_2_0= ruleMacAddress ) )
            // InternalBagDsl.g:347:4: (lv_macaddress_2_0= ruleMacAddress )
            {
            // InternalBagDsl.g:347:4: (lv_macaddress_2_0= ruleMacAddress )
            // InternalBagDsl.g:348:5: lv_macaddress_2_0= ruleMacAddress
            {

            					newCompositeNode(grammarAccess.getMacFilterAccess().getMacaddressMacAddressParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_macaddress_2_0=ruleMacAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMacFilterRule());
            					}
            					add(
            						current,
            						"macaddress",
            						lv_macaddress_2_0,
            						"bag.dsl.BagDsl.MacAddress");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:365:3: (otherlv_3= ',' ( (lv_macaddress_4_0= ruleMacAddress ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBagDsl.g:366:4: otherlv_3= ',' ( (lv_macaddress_4_0= ruleMacAddress ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMacFilterAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBagDsl.g:370:4: ( (lv_macaddress_4_0= ruleMacAddress ) )
            	    // InternalBagDsl.g:371:5: (lv_macaddress_4_0= ruleMacAddress )
            	    {
            	    // InternalBagDsl.g:371:5: (lv_macaddress_4_0= ruleMacAddress )
            	    // InternalBagDsl.g:372:6: lv_macaddress_4_0= ruleMacAddress
            	    {

            	    						newCompositeNode(grammarAccess.getMacFilterAccess().getMacaddressMacAddressParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_macaddress_4_0=ruleMacAddress();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMacFilterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"macaddress",
            	    							lv_macaddress_4_0,
            	    							"bag.dsl.BagDsl.MacAddress");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMacFilterAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMacFilter"


    // $ANTLR start "entryRuleNameFilter"
    // InternalBagDsl.g:398:1: entryRuleNameFilter returns [EObject current=null] : iv_ruleNameFilter= ruleNameFilter EOF ;
    public final EObject entryRuleNameFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameFilter = null;


        try {
            // InternalBagDsl.g:398:51: (iv_ruleNameFilter= ruleNameFilter EOF )
            // InternalBagDsl.g:399:2: iv_ruleNameFilter= ruleNameFilter EOF
            {
             newCompositeNode(grammarAccess.getNameFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameFilter=ruleNameFilter();

            state._fsp--;

             current =iv_ruleNameFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameFilter"


    // $ANTLR start "ruleNameFilter"
    // InternalBagDsl.g:405:1: ruleNameFilter returns [EObject current=null] : (otherlv_0= 'NameFilter' ( (lv_name_1_0= ruleNameExpression ) ) ) ;
    public final EObject ruleNameFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:411:2: ( (otherlv_0= 'NameFilter' ( (lv_name_1_0= ruleNameExpression ) ) ) )
            // InternalBagDsl.g:412:2: (otherlv_0= 'NameFilter' ( (lv_name_1_0= ruleNameExpression ) ) )
            {
            // InternalBagDsl.g:412:2: (otherlv_0= 'NameFilter' ( (lv_name_1_0= ruleNameExpression ) ) )
            // InternalBagDsl.g:413:3: otherlv_0= 'NameFilter' ( (lv_name_1_0= ruleNameExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNameFilterAccess().getNameFilterKeyword_0());
            		
            // InternalBagDsl.g:417:3: ( (lv_name_1_0= ruleNameExpression ) )
            // InternalBagDsl.g:418:4: (lv_name_1_0= ruleNameExpression )
            {
            // InternalBagDsl.g:418:4: (lv_name_1_0= ruleNameExpression )
            // InternalBagDsl.g:419:5: lv_name_1_0= ruleNameExpression
            {

            					newCompositeNode(grammarAccess.getNameFilterAccess().getNameNameExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleNameExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameFilterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bag.dsl.BagDsl.NameExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameFilter"


    // $ANTLR start "entryRuleService"
    // InternalBagDsl.g:440:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalBagDsl.g:440:48: (iv_ruleService= ruleService EOF )
            // InternalBagDsl.g:441:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalBagDsl.g:447:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) ( (lv_characteristic_5_0= ruleCharacteristic ) ) (otherlv_6= ',' ( (lv_characteristic_7_0= ruleCharacteristic ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uuid_4_0 = null;

        EObject lv_characteristic_5_0 = null;

        EObject lv_characteristic_7_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:453:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) ( (lv_characteristic_5_0= ruleCharacteristic ) ) (otherlv_6= ',' ( (lv_characteristic_7_0= ruleCharacteristic ) ) )* otherlv_8= '}' ) )
            // InternalBagDsl.g:454:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) ( (lv_characteristic_5_0= ruleCharacteristic ) ) (otherlv_6= ',' ( (lv_characteristic_7_0= ruleCharacteristic ) ) )* otherlv_8= '}' )
            {
            // InternalBagDsl.g:454:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) ( (lv_characteristic_5_0= ruleCharacteristic ) ) (otherlv_6= ',' ( (lv_characteristic_7_0= ruleCharacteristic ) ) )* otherlv_8= '}' )
            // InternalBagDsl.g:455:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) ( (lv_characteristic_5_0= ruleCharacteristic ) ) (otherlv_6= ',' ( (lv_characteristic_7_0= ruleCharacteristic ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalBagDsl.g:459:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBagDsl.g:460:4: (lv_name_1_0= ruleEString )
            {
            // InternalBagDsl.g:460:4: (lv_name_1_0= ruleEString )
            // InternalBagDsl.g:461:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getUuidKeyword_3());
            		
            // InternalBagDsl.g:486:3: ( (lv_uuid_4_0= ruleEString ) )
            // InternalBagDsl.g:487:4: (lv_uuid_4_0= ruleEString )
            {
            // InternalBagDsl.g:487:4: (lv_uuid_4_0= ruleEString )
            // InternalBagDsl.g:488:5: lv_uuid_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getUuidEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_uuid_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"uuid",
            						lv_uuid_4_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:505:3: ( (lv_characteristic_5_0= ruleCharacteristic ) )
            // InternalBagDsl.g:506:4: (lv_characteristic_5_0= ruleCharacteristic )
            {
            // InternalBagDsl.g:506:4: (lv_characteristic_5_0= ruleCharacteristic )
            // InternalBagDsl.g:507:5: lv_characteristic_5_0= ruleCharacteristic
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getCharacteristicCharacteristicParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_characteristic_5_0=ruleCharacteristic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"characteristic",
            						lv_characteristic_5_0,
            						"bag.dsl.BagDsl.Characteristic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:524:3: (otherlv_6= ',' ( (lv_characteristic_7_0= ruleCharacteristic ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBagDsl.g:525:4: otherlv_6= ',' ( (lv_characteristic_7_0= ruleCharacteristic ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBagDsl.g:529:4: ( (lv_characteristic_7_0= ruleCharacteristic ) )
            	    // InternalBagDsl.g:530:5: (lv_characteristic_7_0= ruleCharacteristic )
            	    {
            	    // InternalBagDsl.g:530:5: (lv_characteristic_7_0= ruleCharacteristic )
            	    // InternalBagDsl.g:531:6: lv_characteristic_7_0= ruleCharacteristic
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getCharacteristicCharacteristicParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_characteristic_7_0=ruleCharacteristic();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"characteristic",
            	    							lv_characteristic_7_0,
            	    							"bag.dsl.BagDsl.Characteristic");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleCharacteristic"
    // InternalBagDsl.g:557:1: entryRuleCharacteristic returns [EObject current=null] : iv_ruleCharacteristic= ruleCharacteristic EOF ;
    public final EObject entryRuleCharacteristic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristic = null;


        try {
            // InternalBagDsl.g:557:55: (iv_ruleCharacteristic= ruleCharacteristic EOF )
            // InternalBagDsl.g:558:2: iv_ruleCharacteristic= ruleCharacteristic EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristic=ruleCharacteristic();

            state._fsp--;

             current =iv_ruleCharacteristic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacteristic"


    // $ANTLR start "ruleCharacteristic"
    // InternalBagDsl.g:564:1: ruleCharacteristic returns [EObject current=null] : (otherlv_0= 'Characteristic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) otherlv_5= 'dataType' ( (lv_dataType_6_0= ruleDataType ) ) (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= 'read' ( (lv_read_10_0= ruleEBoolean ) ) otherlv_11= 'write' ( (lv_write_12_0= ruleEBoolean ) ) otherlv_13= 'notification' ( (lv_notification_14_0= ruleEBoolean ) ) ( (lv_uielement_15_0= ruleUIElement ) )? otherlv_16= '}' ) ;
    public final EObject ruleCharacteristic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uuid_4_0 = null;

        Enumerator lv_dataType_6_0 = null;

        AntlrDatatypeRuleToken lv_unit_8_0 = null;

        AntlrDatatypeRuleToken lv_read_10_0 = null;

        AntlrDatatypeRuleToken lv_write_12_0 = null;

        AntlrDatatypeRuleToken lv_notification_14_0 = null;

        EObject lv_uielement_15_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:570:2: ( (otherlv_0= 'Characteristic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) otherlv_5= 'dataType' ( (lv_dataType_6_0= ruleDataType ) ) (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= 'read' ( (lv_read_10_0= ruleEBoolean ) ) otherlv_11= 'write' ( (lv_write_12_0= ruleEBoolean ) ) otherlv_13= 'notification' ( (lv_notification_14_0= ruleEBoolean ) ) ( (lv_uielement_15_0= ruleUIElement ) )? otherlv_16= '}' ) )
            // InternalBagDsl.g:571:2: (otherlv_0= 'Characteristic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) otherlv_5= 'dataType' ( (lv_dataType_6_0= ruleDataType ) ) (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= 'read' ( (lv_read_10_0= ruleEBoolean ) ) otherlv_11= 'write' ( (lv_write_12_0= ruleEBoolean ) ) otherlv_13= 'notification' ( (lv_notification_14_0= ruleEBoolean ) ) ( (lv_uielement_15_0= ruleUIElement ) )? otherlv_16= '}' )
            {
            // InternalBagDsl.g:571:2: (otherlv_0= 'Characteristic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) otherlv_5= 'dataType' ( (lv_dataType_6_0= ruleDataType ) ) (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= 'read' ( (lv_read_10_0= ruleEBoolean ) ) otherlv_11= 'write' ( (lv_write_12_0= ruleEBoolean ) ) otherlv_13= 'notification' ( (lv_notification_14_0= ruleEBoolean ) ) ( (lv_uielement_15_0= ruleUIElement ) )? otherlv_16= '}' )
            // InternalBagDsl.g:572:3: otherlv_0= 'Characteristic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'uuid' ( (lv_uuid_4_0= ruleEString ) ) otherlv_5= 'dataType' ( (lv_dataType_6_0= ruleDataType ) ) (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= 'read' ( (lv_read_10_0= ruleEBoolean ) ) otherlv_11= 'write' ( (lv_write_12_0= ruleEBoolean ) ) otherlv_13= 'notification' ( (lv_notification_14_0= ruleEBoolean ) ) ( (lv_uielement_15_0= ruleUIElement ) )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacteristicAccess().getCharacteristicKeyword_0());
            		
            // InternalBagDsl.g:576:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBagDsl.g:577:4: (lv_name_1_0= ruleEString )
            {
            // InternalBagDsl.g:577:4: (lv_name_1_0= ruleEString )
            // InternalBagDsl.g:578:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCharacteristicAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacteristicAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacteristicAccess().getUuidKeyword_3());
            		
            // InternalBagDsl.g:603:3: ( (lv_uuid_4_0= ruleEString ) )
            // InternalBagDsl.g:604:4: (lv_uuid_4_0= ruleEString )
            {
            // InternalBagDsl.g:604:4: (lv_uuid_4_0= ruleEString )
            // InternalBagDsl.g:605:5: lv_uuid_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCharacteristicAccess().getUuidEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_uuid_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            					}
            					set(
            						current,
            						"uuid",
            						lv_uuid_4_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getCharacteristicAccess().getDataTypeKeyword_5());
            		
            // InternalBagDsl.g:626:3: ( (lv_dataType_6_0= ruleDataType ) )
            // InternalBagDsl.g:627:4: (lv_dataType_6_0= ruleDataType )
            {
            // InternalBagDsl.g:627:4: (lv_dataType_6_0= ruleDataType )
            // InternalBagDsl.g:628:5: lv_dataType_6_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getCharacteristicAccess().getDataTypeDataTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_dataType_6_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_6_0,
            						"bag.dsl.BagDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:645:3: (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBagDsl.g:646:4: otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCharacteristicAccess().getUnitKeyword_7_0());
                    			
                    // InternalBagDsl.g:650:4: ( (lv_unit_8_0= ruleEString ) )
                    // InternalBagDsl.g:651:5: (lv_unit_8_0= ruleEString )
                    {
                    // InternalBagDsl.g:651:5: (lv_unit_8_0= ruleEString )
                    // InternalBagDsl.g:652:6: lv_unit_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCharacteristicAccess().getUnitEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_unit_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacteristicRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_8_0,
                    							"bag.dsl.BagDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getCharacteristicAccess().getReadKeyword_8());
            		
            // InternalBagDsl.g:674:3: ( (lv_read_10_0= ruleEBoolean ) )
            // InternalBagDsl.g:675:4: (lv_read_10_0= ruleEBoolean )
            {
            // InternalBagDsl.g:675:4: (lv_read_10_0= ruleEBoolean )
            // InternalBagDsl.g:676:5: lv_read_10_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getCharacteristicAccess().getReadEBooleanParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_19);
            lv_read_10_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            					}
            					set(
            						current,
            						"read",
            						lv_read_10_0,
            						"bag.dsl.BagDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getCharacteristicAccess().getWriteKeyword_10());
            		
            // InternalBagDsl.g:697:3: ( (lv_write_12_0= ruleEBoolean ) )
            // InternalBagDsl.g:698:4: (lv_write_12_0= ruleEBoolean )
            {
            // InternalBagDsl.g:698:4: (lv_write_12_0= ruleEBoolean )
            // InternalBagDsl.g:699:5: lv_write_12_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getCharacteristicAccess().getWriteEBooleanParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_20);
            lv_write_12_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            					}
            					set(
            						current,
            						"write",
            						lv_write_12_0,
            						"bag.dsl.BagDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getCharacteristicAccess().getNotificationKeyword_12());
            		
            // InternalBagDsl.g:720:3: ( (lv_notification_14_0= ruleEBoolean ) )
            // InternalBagDsl.g:721:4: (lv_notification_14_0= ruleEBoolean )
            {
            // InternalBagDsl.g:721:4: (lv_notification_14_0= ruleEBoolean )
            // InternalBagDsl.g:722:5: lv_notification_14_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getCharacteristicAccess().getNotificationEBooleanParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_21);
            lv_notification_14_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            					}
            					set(
            						current,
            						"notification",
            						lv_notification_14_0,
            						"bag.dsl.BagDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:739:3: ( (lv_uielement_15_0= ruleUIElement ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBagDsl.g:740:4: (lv_uielement_15_0= ruleUIElement )
                    {
                    // InternalBagDsl.g:740:4: (lv_uielement_15_0= ruleUIElement )
                    // InternalBagDsl.g:741:5: lv_uielement_15_0= ruleUIElement
                    {

                    					newCompositeNode(grammarAccess.getCharacteristicAccess().getUielementUIElementParserRuleCall_14_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_uielement_15_0=ruleUIElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
                    					}
                    					set(
                    						current,
                    						"uielement",
                    						lv_uielement_15_0,
                    						"bag.dsl.BagDsl.UIElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getCharacteristicAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacteristic"


    // $ANTLR start "entryRuleUIElement"
    // InternalBagDsl.g:766:1: entryRuleUIElement returns [EObject current=null] : iv_ruleUIElement= ruleUIElement EOF ;
    public final EObject entryRuleUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIElement = null;


        try {
            // InternalBagDsl.g:766:50: (iv_ruleUIElement= ruleUIElement EOF )
            // InternalBagDsl.g:767:2: iv_ruleUIElement= ruleUIElement EOF
            {
             newCompositeNode(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIElement=ruleUIElement();

            state._fsp--;

             current =iv_ruleUIElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // InternalBagDsl.g:773:1: ruleUIElement returns [EObject current=null] : (otherlv_0= 'UiElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleUIElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_label_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:779:2: ( (otherlv_0= 'UiElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalBagDsl.g:780:2: (otherlv_0= 'UiElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalBagDsl.g:780:2: (otherlv_0= 'UiElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalBagDsl.g:781:3: otherlv_0= 'UiElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUIElementAccess().getUiElementKeyword_0());
            		
            // InternalBagDsl.g:785:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBagDsl.g:786:4: (lv_name_1_0= ruleEString )
            {
            // InternalBagDsl.g:786:4: (lv_name_1_0= ruleEString )
            // InternalBagDsl.g:787:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUIElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUIElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getUIElementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getUIElementAccess().getLabelKeyword_3());
            		
            // InternalBagDsl.g:812:3: ( (lv_label_4_0= ruleEString ) )
            // InternalBagDsl.g:813:4: (lv_label_4_0= ruleEString )
            {
            // InternalBagDsl.g:813:4: (lv_label_4_0= ruleEString )
            // InternalBagDsl.g:814:5: lv_label_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUIElementAccess().getLabelEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_label_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUIElementRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_4_0,
            						"bag.dsl.BagDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBagDsl.g:831:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBagDsl.g:832:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getUIElementAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalBagDsl.g:836:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalBagDsl.g:837:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalBagDsl.g:837:5: (lv_description_6_0= ruleEString )
                    // InternalBagDsl.g:838:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUIElementAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUIElementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"bag.dsl.BagDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getUIElementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBagDsl.g:864:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalBagDsl.g:864:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalBagDsl.g:865:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBagDsl.g:871:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBagDsl.g:877:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalBagDsl.g:878:2: (kw= 'true' | kw= 'false' )
            {
            // InternalBagDsl.g:878:2: (kw= 'true' | kw= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBagDsl.g:879:3: kw= 'true'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBagDsl.g:885:3: kw= 'false'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleMacAddress"
    // InternalBagDsl.g:894:1: entryRuleMacAddress returns [EObject current=null] : iv_ruleMacAddress= ruleMacAddress EOF ;
    public final EObject entryRuleMacAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacAddress = null;


        try {
            // InternalBagDsl.g:894:51: (iv_ruleMacAddress= ruleMacAddress EOF )
            // InternalBagDsl.g:895:2: iv_ruleMacAddress= ruleMacAddress EOF
            {
             newCompositeNode(grammarAccess.getMacAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacAddress=ruleMacAddress();

            state._fsp--;

             current =iv_ruleMacAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMacAddress"


    // $ANTLR start "ruleMacAddress"
    // InternalBagDsl.g:901:1: ruleMacAddress returns [EObject current=null] : ( (lv_address_0_0= ruleEString ) ) ;
    public final EObject ruleMacAddress() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_address_0_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:907:2: ( ( (lv_address_0_0= ruleEString ) ) )
            // InternalBagDsl.g:908:2: ( (lv_address_0_0= ruleEString ) )
            {
            // InternalBagDsl.g:908:2: ( (lv_address_0_0= ruleEString ) )
            // InternalBagDsl.g:909:3: (lv_address_0_0= ruleEString )
            {
            // InternalBagDsl.g:909:3: (lv_address_0_0= ruleEString )
            // InternalBagDsl.g:910:4: lv_address_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getMacAddressAccess().getAddressEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_address_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMacAddressRule());
            				}
            				set(
            					current,
            					"address",
            					lv_address_0_0,
            					"bag.dsl.BagDsl.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMacAddress"


    // $ANTLR start "entryRuleNameExpression"
    // InternalBagDsl.g:930:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalBagDsl.g:930:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalBagDsl.g:931:2: iv_ruleNameExpression= ruleNameExpression EOF
            {
             newCompositeNode(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameExpression=ruleNameExpression();

            state._fsp--;

             current =iv_ruleNameExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // InternalBagDsl.g:937:1: ruleNameExpression returns [EObject current=null] : ( (lv_regEx_0_0= ruleEString ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_regEx_0_0 = null;



        	enterRule();

        try {
            // InternalBagDsl.g:943:2: ( ( (lv_regEx_0_0= ruleEString ) ) )
            // InternalBagDsl.g:944:2: ( (lv_regEx_0_0= ruleEString ) )
            {
            // InternalBagDsl.g:944:2: ( (lv_regEx_0_0= ruleEString ) )
            // InternalBagDsl.g:945:3: (lv_regEx_0_0= ruleEString )
            {
            // InternalBagDsl.g:945:3: (lv_regEx_0_0= ruleEString )
            // InternalBagDsl.g:946:4: lv_regEx_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getNameExpressionAccess().getRegExEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_regEx_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNameExpressionRule());
            				}
            				set(
            					current,
            					"regEx",
            					lv_regEx_0_0,
            					"bag.dsl.BagDsl.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "ruleDataType"
    // InternalBagDsl.g:966:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Float' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Bytes' ) | (enumLiteral_5= 'Byte' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalBagDsl.g:972:2: ( ( (enumLiteral_0= 'Float' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Bytes' ) | (enumLiteral_5= 'Byte' ) ) )
            // InternalBagDsl.g:973:2: ( (enumLiteral_0= 'Float' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Bytes' ) | (enumLiteral_5= 'Byte' ) )
            {
            // InternalBagDsl.g:973:2: ( (enumLiteral_0= 'Float' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'Bytes' ) | (enumLiteral_5= 'Byte' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 35:
                {
                alt11=4;
                }
                break;
            case 36:
                {
                alt11=5;
                }
                break;
            case 37:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBagDsl.g:974:3: (enumLiteral_0= 'Float' )
                    {
                    // InternalBagDsl.g:974:3: (enumLiteral_0= 'Float' )
                    // InternalBagDsl.g:975:4: enumLiteral_0= 'Float'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getFloatEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getFloatEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBagDsl.g:982:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalBagDsl.g:982:3: (enumLiteral_1= 'Double' )
                    // InternalBagDsl.g:983:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBagDsl.g:990:3: (enumLiteral_2= 'Integer' )
                    {
                    // InternalBagDsl.g:990:3: (enumLiteral_2= 'Integer' )
                    // InternalBagDsl.g:991:4: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBagDsl.g:998:3: (enumLiteral_3= 'String' )
                    {
                    // InternalBagDsl.g:998:3: (enumLiteral_3= 'String' )
                    // InternalBagDsl.g:999:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBagDsl.g:1006:3: (enumLiteral_4= 'Bytes' )
                    {
                    // InternalBagDsl.g:1006:3: (enumLiteral_4= 'Bytes' )
                    // InternalBagDsl.g:1007:4: enumLiteral_4= 'Bytes'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBytesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBytesEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBagDsl.g:1014:3: (enumLiteral_5= 'Byte' )
                    {
                    // InternalBagDsl.g:1014:3: (enumLiteral_5= 'Byte' )
                    // InternalBagDsl.g:1015:4: enumLiteral_5= 'Byte'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getByteEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getByteEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003F00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020004000L});

}