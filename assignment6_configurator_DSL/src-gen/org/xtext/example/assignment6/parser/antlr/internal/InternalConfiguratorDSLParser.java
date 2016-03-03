package org.xtext.example.assignment6.parser.antlr.internal; 

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
import org.xtext.example.assignment6.services.ConfiguratorDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfiguratorDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configurator'", "'{'", "'features'", "','", "'}'", "'groups'", "'mandatory'", "'Feature'", "'dependencies'", "'minValue'", "'maxValue'", "'step'", "'('", "'NOT'", "')'", "'IS'", "'SELECTED'", "'-'", "'AND'", "'OR'", "'Inclusive Group'", "'Exclusive Group'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalConfiguratorDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfiguratorDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfiguratorDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g"; }



     	private ConfiguratorDSLGrammarAccess grammarAccess;
     	
        public InternalConfiguratorDSLParser(TokenStream input, ConfiguratorDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Configurator";	
       	}
       	
       	@Override
       	protected ConfiguratorDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfigurator"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:68:1: entryRuleConfigurator returns [EObject current=null] : iv_ruleConfigurator= ruleConfigurator EOF ;
    public final EObject entryRuleConfigurator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurator = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:69:2: (iv_ruleConfigurator= ruleConfigurator EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:70:2: iv_ruleConfigurator= ruleConfigurator EOF
            {
             newCompositeNode(grammarAccess.getConfiguratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurator_in_entryRuleConfigurator75);
            iv_ruleConfigurator=ruleConfigurator();

            state._fsp--;

             current =iv_ruleConfigurator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurator85); 

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
    // $ANTLR end "entryRuleConfigurator"


    // $ANTLR start "ruleConfigurator"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:77:1: ruleConfigurator returns [EObject current=null] : ( () otherlv_1= 'Configurator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'features' otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'groups' otherlv_11= '{' ( (lv_groups_12_0= ruleGroup ) ) (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleConfigurator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_features_8_0 = null;

        EObject lv_groups_12_0 = null;

        EObject lv_groups_14_0 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:80:28: ( ( () otherlv_1= 'Configurator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'features' otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'groups' otherlv_11= '{' ( (lv_groups_12_0= ruleGroup ) ) (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:81:1: ( () otherlv_1= 'Configurator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'features' otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'groups' otherlv_11= '{' ( (lv_groups_12_0= ruleGroup ) ) (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:81:1: ( () otherlv_1= 'Configurator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'features' otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'groups' otherlv_11= '{' ( (lv_groups_12_0= ruleGroup ) ) (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:81:2: () otherlv_1= 'Configurator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'features' otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )? (otherlv_10= 'groups' otherlv_11= '{' ( (lv_groups_12_0= ruleGroup ) ) (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:81:2: ()
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfiguratorAccess().getConfiguratorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConfigurator131); 

                	newLeafNode(otherlv_1, grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_1());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:92:1: (lv_name_2_0= ruleEString )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConfiguratorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurator152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfiguratorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfigurator164); 

                	newLeafNode(otherlv_3, grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:113:1: (otherlv_4= 'features' otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:113:3: otherlv_4= 'features' otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfigurator177); 

                        	newLeafNode(otherlv_4, grammarAccess.getConfiguratorAccess().getFeaturesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfigurator189); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:121:1: ( (lv_features_6_0= ruleFeature ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:122:1: (lv_features_6_0= ruleFeature )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:122:1: (lv_features_6_0= ruleFeature )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:123:3: lv_features_6_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorAccess().getFeaturesFeatureParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleConfigurator210);
                    lv_features_6_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_6_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:139:2: (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:139:4: otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfigurator223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getConfiguratorAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:143:1: ( (lv_features_8_0= ruleFeature ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:144:1: (lv_features_8_0= ruleFeature )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:144:1: (lv_features_8_0= ruleFeature )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:145:3: lv_features_8_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorAccess().getFeaturesFeatureParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleConfigurator244);
                    	    lv_features_8_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_8_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfigurator258); 

                        	newLeafNode(otherlv_9, grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:165:3: (otherlv_10= 'groups' otherlv_11= '{' ( (lv_groups_12_0= ruleGroup ) ) (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:165:5: otherlv_10= 'groups' otherlv_11= '{' ( (lv_groups_12_0= ruleGroup ) ) (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfigurator273); 

                        	newLeafNode(otherlv_10, grammarAccess.getConfiguratorAccess().getGroupsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfigurator285); 

                        	newLeafNode(otherlv_11, grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:173:1: ( (lv_groups_12_0= ruleGroup ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:174:1: (lv_groups_12_0= ruleGroup )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:174:1: (lv_groups_12_0= ruleGroup )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:175:3: lv_groups_12_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguratorAccess().getGroupsGroupParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleConfigurator306);
                    lv_groups_12_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguratorRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_12_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:191:2: (otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:191:4: otherlv_13= ',' ( (lv_groups_14_0= ruleGroup ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfigurator319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getConfiguratorAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:195:1: ( (lv_groups_14_0= ruleGroup ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:196:1: (lv_groups_14_0= ruleGroup )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:196:1: (lv_groups_14_0= ruleGroup )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:197:3: lv_groups_14_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguratorAccess().getGroupsGroupParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleConfigurator340);
                    	    lv_groups_14_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguratorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_14_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfigurator354); 

                        	newLeafNode(otherlv_15, grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfigurator368); 

                	newLeafNode(otherlv_16, grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleConfigurator"


    // $ANTLR start "entryRuleFeature"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:229:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:230:2: (iv_ruleFeature= ruleFeature EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:231:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature404);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature414); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:238:1: ruleFeature returns [EObject current=null] : (this_SimpleFeature_0= ruleSimpleFeature | this_IntegerFeature_1= ruleIntegerFeature ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleFeature_0 = null;

        EObject this_IntegerFeature_1 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:241:28: ( (this_SimpleFeature_0= ruleSimpleFeature | this_IntegerFeature_1= ruleIntegerFeature ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:242:1: (this_SimpleFeature_0= ruleSimpleFeature | this_IntegerFeature_1= ruleIntegerFeature )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:242:1: (this_SimpleFeature_0= ruleSimpleFeature | this_IntegerFeature_1= ruleIntegerFeature )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==18) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_STRING) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==12) ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5==20) ) {
                                alt5=2;
                            }
                            else if ( (LA5_5==13||(LA5_5>=15 && LA5_5<=16)||LA5_5==19) ) {
                                alt5=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_2==RULE_ID) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==12) ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5==20) ) {
                                alt5=2;
                            }
                            else if ( (LA5_5==13||(LA5_5>=15 && LA5_5<=16)||LA5_5==19) ) {
                                alt5=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==18) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_STRING) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==12) ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==20) ) {
                            alt5=2;
                        }
                        else if ( (LA5_5==13||(LA5_5>=15 && LA5_5<=16)||LA5_5==19) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==RULE_ID) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==12) ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==20) ) {
                            alt5=2;
                        }
                        else if ( (LA5_5==13||(LA5_5>=15 && LA5_5<=16)||LA5_5==19) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:243:5: this_SimpleFeature_0= ruleSimpleFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getSimpleFeatureParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_ruleFeature461);
                    this_SimpleFeature_0=ruleSimpleFeature();

                    state._fsp--;

                     
                            current = this_SimpleFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:253:5: this_IntegerFeature_1= ruleIntegerFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getIntegerFeatureParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerFeature_in_ruleFeature488);
                    this_IntegerFeature_1=ruleIntegerFeature();

                    state._fsp--;

                     
                            current = this_IntegerFeature_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEString"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:269:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:270:2: (iv_ruleEString= ruleEString EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:271:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString524);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString535); 

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
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:278:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:281:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:282:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:282:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:282:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString575); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:290:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString601); 

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


    // $ANTLR start "entryRuleGroup"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:305:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:306:2: (iv_ruleGroup= ruleGroup EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:307:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup646);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup656); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:314:1: ruleGroup returns [EObject current=null] : ( ( (lv_groupType_0_0= ruleGroupType ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_features_3_0= ruleSimpleFeature ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleSimpleFeature ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_groupType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_features_3_0 = null;

        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:317:28: ( ( ( (lv_groupType_0_0= ruleGroupType ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_features_3_0= ruleSimpleFeature ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleSimpleFeature ) ) )* otherlv_6= '}' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:318:1: ( ( (lv_groupType_0_0= ruleGroupType ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_features_3_0= ruleSimpleFeature ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleSimpleFeature ) ) )* otherlv_6= '}' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:318:1: ( ( (lv_groupType_0_0= ruleGroupType ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_features_3_0= ruleSimpleFeature ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleSimpleFeature ) ) )* otherlv_6= '}' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:318:2: ( (lv_groupType_0_0= ruleGroupType ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_features_3_0= ruleSimpleFeature ) ) (otherlv_4= ',' ( (lv_features_5_0= ruleSimpleFeature ) ) )* otherlv_6= '}'
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:318:2: ( (lv_groupType_0_0= ruleGroupType ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:319:1: (lv_groupType_0_0= ruleGroupType )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:319:1: (lv_groupType_0_0= ruleGroupType )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:320:3: lv_groupType_0_0= ruleGroupType
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getGroupTypeGroupTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGroupType_in_ruleGroup702);
            lv_groupType_0_0=ruleGroupType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		set(
                   			current, 
                   			"groupType",
                    		lv_groupType_0_0, 
                    		"GroupType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:336:2: ( (lv_name_1_0= ruleEString ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:337:1: (lv_name_1_0= ruleEString )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:337:1: (lv_name_1_0= ruleEString )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:338:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup723);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup735); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:358:1: ( (lv_features_3_0= ruleSimpleFeature ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:359:1: (lv_features_3_0= ruleSimpleFeature )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:359:1: (lv_features_3_0= ruleSimpleFeature )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:360:3: lv_features_3_0= ruleSimpleFeature
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getFeaturesSimpleFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_ruleGroup756);
            lv_features_3_0=ruleSimpleFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_3_0, 
                    		"SimpleFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:376:2: (otherlv_4= ',' ( (lv_features_5_0= ruleSimpleFeature ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:376:4: otherlv_4= ',' ( (lv_features_5_0= ruleSimpleFeature ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup769); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:380:1: ( (lv_features_5_0= ruleSimpleFeature ) )
            	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:381:1: (lv_features_5_0= ruleSimpleFeature )
            	    {
            	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:381:1: (lv_features_5_0= ruleSimpleFeature )
            	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:382:3: lv_features_5_0= ruleSimpleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getFeaturesSimpleFeatureParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_ruleGroup790);
            	    lv_features_5_0=ruleSimpleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"SimpleFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup804); 

                	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleSimpleFeature"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:412:1: entryRuleSimpleFeature returns [EObject current=null] : iv_ruleSimpleFeature= ruleSimpleFeature EOF ;
    public final EObject entryRuleSimpleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFeature = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:413:2: (iv_ruleSimpleFeature= ruleSimpleFeature EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:414:2: iv_ruleSimpleFeature= ruleSimpleFeature EOF
            {
             newCompositeNode(grammarAccess.getSimpleFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_entryRuleSimpleFeature842);
            iv_ruleSimpleFeature=ruleSimpleFeature();

            state._fsp--;

             current =iv_ruleSimpleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleFeature852); 

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
    // $ANTLR end "entryRuleSimpleFeature"


    // $ANTLR start "ruleSimpleFeature"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:421:1: ruleSimpleFeature returns [EObject current=null] : ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dependencies' otherlv_6= '{' ( (lv_dependencies_7_0= ruleDependency ) ) (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )* otherlv_10= '}' )? (otherlv_11= 'features' otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) ) (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )* otherlv_16= '}' )? (otherlv_17= 'groups' otherlv_18= '{' ( (lv_groups_19_0= ruleGroup ) ) (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleSimpleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_dependencies_7_0 = null;

        EObject lv_dependencies_9_0 = null;

        EObject lv_features_13_0 = null;

        EObject lv_features_15_0 = null;

        EObject lv_groups_19_0 = null;

        EObject lv_groups_21_0 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:424:28: ( ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dependencies' otherlv_6= '{' ( (lv_dependencies_7_0= ruleDependency ) ) (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )* otherlv_10= '}' )? (otherlv_11= 'features' otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) ) (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )* otherlv_16= '}' )? (otherlv_17= 'groups' otherlv_18= '{' ( (lv_groups_19_0= ruleGroup ) ) (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:425:1: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dependencies' otherlv_6= '{' ( (lv_dependencies_7_0= ruleDependency ) ) (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )* otherlv_10= '}' )? (otherlv_11= 'features' otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) ) (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )* otherlv_16= '}' )? (otherlv_17= 'groups' otherlv_18= '{' ( (lv_groups_19_0= ruleGroup ) ) (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:425:1: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dependencies' otherlv_6= '{' ( (lv_dependencies_7_0= ruleDependency ) ) (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )* otherlv_10= '}' )? (otherlv_11= 'features' otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) ) (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )* otherlv_16= '}' )? (otherlv_17= 'groups' otherlv_18= '{' ( (lv_groups_19_0= ruleGroup ) ) (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:425:2: () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dependencies' otherlv_6= '{' ( (lv_dependencies_7_0= ruleDependency ) ) (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )* otherlv_10= '}' )? (otherlv_11= 'features' otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) ) (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )* otherlv_16= '}' )? (otherlv_17= 'groups' otherlv_18= '{' ( (lv_groups_19_0= ruleGroup ) ) (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:425:2: ()
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:426:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleFeatureAccess().getSimpleFeatureAction_0(),
                        current);
                

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:431:2: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:432:1: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:432:1: (lv_mandatory_1_0= 'mandatory' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:433:3: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleFeature904); 

                            newLeafNode(lv_mandatory_1_0, grammarAccess.getSimpleFeatureAccess().getMandatoryMandatoryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "mandatory", true, "mandatory");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSimpleFeature930); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleFeatureAccess().getFeatureKeyword_2());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:450:1: ( (lv_name_3_0= ruleEString ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:451:1: (lv_name_3_0= ruleEString )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:451:1: (lv_name_3_0= ruleEString )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:452:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSimpleFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleFeature951);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSimpleFeature963); 

                	newLeafNode(otherlv_4, grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:472:1: (otherlv_5= 'dependencies' otherlv_6= '{' ( (lv_dependencies_7_0= ruleDependency ) ) (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )* otherlv_10= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:472:3: otherlv_5= 'dependencies' otherlv_6= '{' ( (lv_dependencies_7_0= ruleDependency ) ) (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleFeature976); 

                        	newLeafNode(otherlv_5, grammarAccess.getSimpleFeatureAccess().getDependenciesKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSimpleFeature988); 

                        	newLeafNode(otherlv_6, grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:480:1: ( (lv_dependencies_7_0= ruleDependency ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:481:1: (lv_dependencies_7_0= ruleDependency )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:481:1: (lv_dependencies_7_0= ruleDependency )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:482:3: lv_dependencies_7_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleFeatureAccess().getDependenciesDependencyParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleSimpleFeature1009);
                    lv_dependencies_7_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"dependencies",
                            		lv_dependencies_7_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:498:2: (otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:498:4: otherlv_8= ',' ( (lv_dependencies_9_0= ruleDependency ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSimpleFeature1022); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getSimpleFeatureAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:502:1: ( (lv_dependencies_9_0= ruleDependency ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:503:1: (lv_dependencies_9_0= ruleDependency )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:503:1: (lv_dependencies_9_0= ruleDependency )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:504:3: lv_dependencies_9_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleFeatureAccess().getDependenciesDependencyParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleSimpleFeature1043);
                    	    lv_dependencies_9_0=ruleDependency();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dependencies",
                    	            		lv_dependencies_9_0, 
                    	            		"Dependency");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSimpleFeature1057); 

                        	newLeafNode(otherlv_10, grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:524:3: (otherlv_11= 'features' otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) ) (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )* otherlv_16= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:524:5: otherlv_11= 'features' otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) ) (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSimpleFeature1072); 

                        	newLeafNode(otherlv_11, grammarAccess.getSimpleFeatureAccess().getFeaturesKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSimpleFeature1084); 

                        	newLeafNode(otherlv_12, grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:532:1: ( (lv_features_13_0= ruleFeature ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:533:1: (lv_features_13_0= ruleFeature )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:533:1: (lv_features_13_0= ruleFeature )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:534:3: lv_features_13_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleFeatureAccess().getFeaturesFeatureParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleSimpleFeature1105);
                    lv_features_13_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_13_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:550:2: (otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:550:4: otherlv_14= ',' ( (lv_features_15_0= ruleFeature ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSimpleFeature1118); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSimpleFeatureAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:554:1: ( (lv_features_15_0= ruleFeature ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:555:1: (lv_features_15_0= ruleFeature )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:555:1: (lv_features_15_0= ruleFeature )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:556:3: lv_features_15_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleFeatureAccess().getFeaturesFeatureParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleSimpleFeature1139);
                    	    lv_features_15_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_15_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSimpleFeature1153); 

                        	newLeafNode(otherlv_16, grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:576:3: (otherlv_17= 'groups' otherlv_18= '{' ( (lv_groups_19_0= ruleGroup ) ) (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )* otherlv_22= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:576:5: otherlv_17= 'groups' otherlv_18= '{' ( (lv_groups_19_0= ruleGroup ) ) (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSimpleFeature1168); 

                        	newLeafNode(otherlv_17, grammarAccess.getSimpleFeatureAccess().getGroupsKeyword_7_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSimpleFeature1180); 

                        	newLeafNode(otherlv_18, grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:584:1: ( (lv_groups_19_0= ruleGroup ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:585:1: (lv_groups_19_0= ruleGroup )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:585:1: (lv_groups_19_0= ruleGroup )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:586:3: lv_groups_19_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleFeatureAccess().getGroupsGroupParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSimpleFeature1201);
                    lv_groups_19_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_19_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:602:2: (otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:602:4: otherlv_20= ',' ( (lv_groups_21_0= ruleGroup ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSimpleFeature1214); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getSimpleFeatureAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:606:1: ( (lv_groups_21_0= ruleGroup ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:607:1: (lv_groups_21_0= ruleGroup )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:607:1: (lv_groups_21_0= ruleGroup )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:608:3: lv_groups_21_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleFeatureAccess().getGroupsGroupParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSimpleFeature1235);
                    	    lv_groups_21_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_21_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSimpleFeature1249); 

                        	newLeafNode(otherlv_22, grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSimpleFeature1263); 

                	newLeafNode(otherlv_23, grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSimpleFeature"


    // $ANTLR start "entryRuleIntegerFeature"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:640:1: entryRuleIntegerFeature returns [EObject current=null] : iv_ruleIntegerFeature= ruleIntegerFeature EOF ;
    public final EObject entryRuleIntegerFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerFeature = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:641:2: (iv_ruleIntegerFeature= ruleIntegerFeature EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:642:2: iv_ruleIntegerFeature= ruleIntegerFeature EOF
            {
             newCompositeNode(grammarAccess.getIntegerFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature1299);
            iv_ruleIntegerFeature=ruleIntegerFeature();

            state._fsp--;

             current =iv_ruleIntegerFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerFeature1309); 

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
    // $ANTLR end "entryRuleIntegerFeature"


    // $ANTLR start "ruleIntegerFeature"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:649:1: ruleIntegerFeature returns [EObject current=null] : ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'minValue' ( (lv_minValue_6_0= ruleEInt ) ) ) (otherlv_7= 'maxValue' ( (lv_maxValue_8_0= ruleEInt ) ) ) (otherlv_9= 'step' ( (lv_step_10_0= ruleEInt ) ) ) (otherlv_11= 'dependencies' otherlv_12= '{' ( (lv_dependencies_13_0= ruleDependency ) ) (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )* otherlv_16= '}' )? (otherlv_17= 'features' otherlv_18= '{' ( (lv_features_19_0= ruleFeature ) ) (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? (otherlv_23= 'groups' otherlv_24= '{' ( (lv_groups_25_0= ruleGroup ) ) (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleIntegerFeature() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_minValue_6_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_8_0 = null;

        AntlrDatatypeRuleToken lv_step_10_0 = null;

        EObject lv_dependencies_13_0 = null;

        EObject lv_dependencies_15_0 = null;

        EObject lv_features_19_0 = null;

        EObject lv_features_21_0 = null;

        EObject lv_groups_25_0 = null;

        EObject lv_groups_27_0 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:652:28: ( ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'minValue' ( (lv_minValue_6_0= ruleEInt ) ) ) (otherlv_7= 'maxValue' ( (lv_maxValue_8_0= ruleEInt ) ) ) (otherlv_9= 'step' ( (lv_step_10_0= ruleEInt ) ) ) (otherlv_11= 'dependencies' otherlv_12= '{' ( (lv_dependencies_13_0= ruleDependency ) ) (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )* otherlv_16= '}' )? (otherlv_17= 'features' otherlv_18= '{' ( (lv_features_19_0= ruleFeature ) ) (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? (otherlv_23= 'groups' otherlv_24= '{' ( (lv_groups_25_0= ruleGroup ) ) (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:653:1: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'minValue' ( (lv_minValue_6_0= ruleEInt ) ) ) (otherlv_7= 'maxValue' ( (lv_maxValue_8_0= ruleEInt ) ) ) (otherlv_9= 'step' ( (lv_step_10_0= ruleEInt ) ) ) (otherlv_11= 'dependencies' otherlv_12= '{' ( (lv_dependencies_13_0= ruleDependency ) ) (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )* otherlv_16= '}' )? (otherlv_17= 'features' otherlv_18= '{' ( (lv_features_19_0= ruleFeature ) ) (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? (otherlv_23= 'groups' otherlv_24= '{' ( (lv_groups_25_0= ruleGroup ) ) (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:653:1: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'minValue' ( (lv_minValue_6_0= ruleEInt ) ) ) (otherlv_7= 'maxValue' ( (lv_maxValue_8_0= ruleEInt ) ) ) (otherlv_9= 'step' ( (lv_step_10_0= ruleEInt ) ) ) (otherlv_11= 'dependencies' otherlv_12= '{' ( (lv_dependencies_13_0= ruleDependency ) ) (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )* otherlv_16= '}' )? (otherlv_17= 'features' otherlv_18= '{' ( (lv_features_19_0= ruleFeature ) ) (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? (otherlv_23= 'groups' otherlv_24= '{' ( (lv_groups_25_0= ruleGroup ) ) (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:653:2: () ( (lv_mandatory_1_0= 'mandatory' ) )? otherlv_2= 'Feature' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'minValue' ( (lv_minValue_6_0= ruleEInt ) ) ) (otherlv_7= 'maxValue' ( (lv_maxValue_8_0= ruleEInt ) ) ) (otherlv_9= 'step' ( (lv_step_10_0= ruleEInt ) ) ) (otherlv_11= 'dependencies' otherlv_12= '{' ( (lv_dependencies_13_0= ruleDependency ) ) (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )* otherlv_16= '}' )? (otherlv_17= 'features' otherlv_18= '{' ( (lv_features_19_0= ruleFeature ) ) (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? (otherlv_23= 'groups' otherlv_24= '{' ( (lv_groups_25_0= ruleGroup ) ) (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:653:2: ()
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:654:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerFeatureAccess().getIntegerFeatureAction_0(),
                        current);
                

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:659:2: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:660:1: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:660:1: (lv_mandatory_1_0= 'mandatory' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:661:3: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntegerFeature1361); 

                            newLeafNode(lv_mandatory_1_0, grammarAccess.getIntegerFeatureAccess().getMandatoryMandatoryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "mandatory", true, "mandatory");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIntegerFeature1387); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerFeatureAccess().getFeatureKeyword_2());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:678:1: ( (lv_name_3_0= ruleEString ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:679:1: (lv_name_3_0= ruleEString )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:679:1: (lv_name_3_0= ruleEString )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:680:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerFeature1408);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntegerFeature1420); 

                	newLeafNode(otherlv_4, grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_4());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:700:1: (otherlv_5= 'minValue' ( (lv_minValue_6_0= ruleEInt ) ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:700:3: otherlv_5= 'minValue' ( (lv_minValue_6_0= ruleEInt ) )
            {
            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleIntegerFeature1433); 

                	newLeafNode(otherlv_5, grammarAccess.getIntegerFeatureAccess().getMinValueKeyword_5_0());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:704:1: ( (lv_minValue_6_0= ruleEInt ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:705:1: (lv_minValue_6_0= ruleEInt )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:705:1: (lv_minValue_6_0= ruleEInt )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:706:3: lv_minValue_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getMinValueEIntParserRuleCall_5_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerFeature1454);
            lv_minValue_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"minValue",
                    		lv_minValue_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:722:3: (otherlv_7= 'maxValue' ( (lv_maxValue_8_0= ruleEInt ) ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:722:5: otherlv_7= 'maxValue' ( (lv_maxValue_8_0= ruleEInt ) )
            {
            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleIntegerFeature1468); 

                	newLeafNode(otherlv_7, grammarAccess.getIntegerFeatureAccess().getMaxValueKeyword_6_0());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:726:1: ( (lv_maxValue_8_0= ruleEInt ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:727:1: (lv_maxValue_8_0= ruleEInt )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:727:1: (lv_maxValue_8_0= ruleEInt )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:728:3: lv_maxValue_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getMaxValueEIntParserRuleCall_6_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerFeature1489);
            lv_maxValue_8_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"maxValue",
                    		lv_maxValue_8_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:744:3: (otherlv_9= 'step' ( (lv_step_10_0= ruleEInt ) ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:744:5: otherlv_9= 'step' ( (lv_step_10_0= ruleEInt ) )
            {
            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIntegerFeature1503); 

                	newLeafNode(otherlv_9, grammarAccess.getIntegerFeatureAccess().getStepKeyword_7_0());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:748:1: ( (lv_step_10_0= ruleEInt ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:749:1: (lv_step_10_0= ruleEInt )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:749:1: (lv_step_10_0= ruleEInt )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:750:3: lv_step_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getStepEIntParserRuleCall_7_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerFeature1524);
            lv_step_10_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"step",
                    		lv_step_10_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:766:3: (otherlv_11= 'dependencies' otherlv_12= '{' ( (lv_dependencies_13_0= ruleDependency ) ) (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )* otherlv_16= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:766:5: otherlv_11= 'dependencies' otherlv_12= '{' ( (lv_dependencies_13_0= ruleDependency ) ) (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntegerFeature1538); 

                        	newLeafNode(otherlv_11, grammarAccess.getIntegerFeatureAccess().getDependenciesKeyword_8_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntegerFeature1550); 

                        	newLeafNode(otherlv_12, grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:774:1: ( (lv_dependencies_13_0= ruleDependency ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:775:1: (lv_dependencies_13_0= ruleDependency )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:775:1: (lv_dependencies_13_0= ruleDependency )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:776:3: lv_dependencies_13_0= ruleDependency
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getDependenciesDependencyParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleIntegerFeature1571);
                    lv_dependencies_13_0=ruleDependency();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"dependencies",
                            		lv_dependencies_13_0, 
                            		"Dependency");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:792:2: (otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:792:4: otherlv_14= ',' ( (lv_dependencies_15_0= ruleDependency ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntegerFeature1584); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getIntegerFeatureAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:796:1: ( (lv_dependencies_15_0= ruleDependency ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:797:1: (lv_dependencies_15_0= ruleDependency )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:797:1: (lv_dependencies_15_0= ruleDependency )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:798:3: lv_dependencies_15_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getDependenciesDependencyParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleIntegerFeature1605);
                    	    lv_dependencies_15_0=ruleDependency();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dependencies",
                    	            		lv_dependencies_15_0, 
                    	            		"Dependency");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntegerFeature1619); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:818:3: (otherlv_17= 'features' otherlv_18= '{' ( (lv_features_19_0= ruleFeature ) ) (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:818:5: otherlv_17= 'features' otherlv_18= '{' ( (lv_features_19_0= ruleFeature ) ) (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIntegerFeature1634); 

                        	newLeafNode(otherlv_17, grammarAccess.getIntegerFeatureAccess().getFeaturesKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntegerFeature1646); 

                        	newLeafNode(otherlv_18, grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:826:1: ( (lv_features_19_0= ruleFeature ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:827:1: (lv_features_19_0= ruleFeature )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:827:1: (lv_features_19_0= ruleFeature )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:828:3: lv_features_19_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getFeaturesFeatureParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleIntegerFeature1667);
                    lv_features_19_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_19_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:844:2: (otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:844:4: otherlv_20= ',' ( (lv_features_21_0= ruleFeature ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntegerFeature1680); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getIntegerFeatureAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:848:1: ( (lv_features_21_0= ruleFeature ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:849:1: (lv_features_21_0= ruleFeature )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:849:1: (lv_features_21_0= ruleFeature )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:850:3: lv_features_21_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getFeaturesFeatureParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleIntegerFeature1701);
                    	    lv_features_21_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_21_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntegerFeature1715); 

                        	newLeafNode(otherlv_22, grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:870:3: (otherlv_23= 'groups' otherlv_24= '{' ( (lv_groups_25_0= ruleGroup ) ) (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )* otherlv_28= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:870:5: otherlv_23= 'groups' otherlv_24= '{' ( (lv_groups_25_0= ruleGroup ) ) (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntegerFeature1730); 

                        	newLeafNode(otherlv_23, grammarAccess.getIntegerFeatureAccess().getGroupsKeyword_10_0());
                        
                    otherlv_24=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntegerFeature1742); 

                        	newLeafNode(otherlv_24, grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:878:1: ( (lv_groups_25_0= ruleGroup ) )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:879:1: (lv_groups_25_0= ruleGroup )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:879:1: (lv_groups_25_0= ruleGroup )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:880:3: lv_groups_25_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getGroupsGroupParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleIntegerFeature1763);
                    lv_groups_25_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_25_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:896:2: (otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:896:4: otherlv_26= ',' ( (lv_groups_27_0= ruleGroup ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntegerFeature1776); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getIntegerFeatureAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:900:1: ( (lv_groups_27_0= ruleGroup ) )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:901:1: (lv_groups_27_0= ruleGroup )
                    	    {
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:901:1: (lv_groups_27_0= ruleGroup )
                    	    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:902:3: lv_groups_27_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntegerFeatureAccess().getGroupsGroupParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleIntegerFeature1797);
                    	    lv_groups_27_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntegerFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_27_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntegerFeature1811); 

                        	newLeafNode(otherlv_28, grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntegerFeature1825); 

                	newLeafNode(otherlv_29, grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleIntegerFeature"


    // $ANTLR start "entryRuleDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:934:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:935:2: (iv_ruleDependency= ruleDependency EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:936:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency1861);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency1871); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:943:1: ruleDependency returns [EObject current=null] : (this_BaseBinaryDependency_0= ruleBaseBinaryDependency | this_IsSelectedDependency_1= ruleIsSelectedDependency | this_IntegerValueDependency_2= ruleIntegerValueDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_BaseBinaryDependency_0 = null;

        EObject this_IsSelectedDependency_1 = null;

        EObject this_IntegerValueDependency_2 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:946:28: ( (this_BaseBinaryDependency_0= ruleBaseBinaryDependency | this_IsSelectedDependency_1= ruleIsSelectedDependency | this_IntegerValueDependency_2= ruleIntegerValueDependency ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:947:1: (this_BaseBinaryDependency_0= ruleBaseBinaryDependency | this_IsSelectedDependency_1= ruleIsSelectedDependency | this_IntegerValueDependency_2= ruleIntegerValueDependency )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:947:1: (this_BaseBinaryDependency_0= ruleBaseBinaryDependency | this_IsSelectedDependency_1= ruleIsSelectedDependency | this_IntegerValueDependency_2= ruleIntegerValueDependency )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                switch ( input.LA(2) ) {
                case 23:
                case 24:
                    {
                    alt22=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==26) ) {
                        switch ( input.LA(4) ) {
                        case 24:
                            {
                            int LA22_6 = input.LA(5);

                            if ( (LA22_6==27) ) {
                                alt22=2;
                            }
                            else if ( (LA22_6==RULE_INT||LA22_6==28) ) {
                                alt22=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 27:
                            {
                            alt22=2;
                            }
                            break;
                        case RULE_INT:
                        case 28:
                            {
                            alt22=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA22_4 = input.LA(3);

                    if ( (LA22_4==26) ) {
                        switch ( input.LA(4) ) {
                        case 24:
                            {
                            int LA22_6 = input.LA(5);

                            if ( (LA22_6==27) ) {
                                alt22=2;
                            }
                            else if ( (LA22_6==RULE_INT||LA22_6==28) ) {
                                alt22=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 27:
                            {
                            alt22=2;
                            }
                            break;
                        case RULE_INT:
                        case 28:
                            {
                            alt22=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:948:5: this_BaseBinaryDependency_0= ruleBaseBinaryDependency
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getBaseBinaryDependencyParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBaseBinaryDependency_in_ruleDependency1918);
                    this_BaseBinaryDependency_0=ruleBaseBinaryDependency();

                    state._fsp--;

                     
                            current = this_BaseBinaryDependency_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:958:5: this_IsSelectedDependency_1= ruleIsSelectedDependency
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getIsSelectedDependencyParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsSelectedDependency_in_ruleDependency1945);
                    this_IsSelectedDependency_1=ruleIsSelectedDependency();

                    state._fsp--;

                     
                            current = this_IsSelectedDependency_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:968:5: this_IntegerValueDependency_2= ruleIntegerValueDependency
                    {
                     
                            newCompositeNode(grammarAccess.getDependencyAccess().getIntegerValueDependencyParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerValueDependency_in_ruleDependency1972);
                    this_IntegerValueDependency_2=ruleIntegerValueDependency();

                    state._fsp--;

                     
                            current = this_IntegerValueDependency_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleBaseBinaryDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:984:1: entryRuleBaseBinaryDependency returns [EObject current=null] : iv_ruleBaseBinaryDependency= ruleBaseBinaryDependency EOF ;
    public final EObject entryRuleBaseBinaryDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseBinaryDependency = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:985:2: (iv_ruleBaseBinaryDependency= ruleBaseBinaryDependency EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:986:2: iv_ruleBaseBinaryDependency= ruleBaseBinaryDependency EOF
            {
             newCompositeNode(grammarAccess.getBaseBinaryDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBaseBinaryDependency_in_entryRuleBaseBinaryDependency2007);
            iv_ruleBaseBinaryDependency=ruleBaseBinaryDependency();

            state._fsp--;

             current =iv_ruleBaseBinaryDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBaseBinaryDependency2017); 

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
    // $ANTLR end "entryRuleBaseBinaryDependency"


    // $ANTLR start "ruleBaseBinaryDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:993:1: ruleBaseBinaryDependency returns [EObject current=null] : (this_BinaryNotDependency_0= ruleBinaryNotDependency | this_BinaryDependency_1= ruleBinaryDependency ) ;
    public final EObject ruleBaseBinaryDependency() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryNotDependency_0 = null;

        EObject this_BinaryDependency_1 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:996:28: ( (this_BinaryNotDependency_0= ruleBinaryNotDependency | this_BinaryDependency_1= ruleBinaryDependency ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:997:1: (this_BinaryNotDependency_0= ruleBinaryNotDependency | this_BinaryDependency_1= ruleBinaryDependency )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:997:1: (this_BinaryNotDependency_0= ruleBinaryNotDependency | this_BinaryDependency_1= ruleBinaryDependency )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==24) ) {
                    alt23=1;
                }
                else if ( (LA23_1==23) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:998:5: this_BinaryNotDependency_0= ruleBinaryNotDependency
                    {
                     
                            newCompositeNode(grammarAccess.getBaseBinaryDependencyAccess().getBinaryNotDependencyParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryNotDependency_in_ruleBaseBinaryDependency2064);
                    this_BinaryNotDependency_0=ruleBinaryNotDependency();

                    state._fsp--;

                     
                            current = this_BinaryNotDependency_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1008:5: this_BinaryDependency_1= ruleBinaryDependency
                    {
                     
                            newCompositeNode(grammarAccess.getBaseBinaryDependencyAccess().getBinaryDependencyParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryDependency_in_ruleBaseBinaryDependency2091);
                    this_BinaryDependency_1=ruleBinaryDependency();

                    state._fsp--;

                     
                            current = this_BinaryDependency_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleBaseBinaryDependency"


    // $ANTLR start "entryRuleBinaryNotDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1024:1: entryRuleBinaryNotDependency returns [EObject current=null] : iv_ruleBinaryNotDependency= ruleBinaryNotDependency EOF ;
    public final EObject entryRuleBinaryNotDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNotDependency = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1025:2: (iv_ruleBinaryNotDependency= ruleBinaryNotDependency EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1026:2: iv_ruleBinaryNotDependency= ruleBinaryNotDependency EOF
            {
             newCompositeNode(grammarAccess.getBinaryNotDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryNotDependency_in_entryRuleBinaryNotDependency2126);
            iv_ruleBinaryNotDependency=ruleBinaryNotDependency();

            state._fsp--;

             current =iv_ruleBinaryNotDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryNotDependency2136); 

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
    // $ANTLR end "entryRuleBinaryNotDependency"


    // $ANTLR start "ruleBinaryNotDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1033:1: ruleBinaryNotDependency returns [EObject current=null] : (otherlv_0= '(' ( (lv_not_1_0= 'NOT' ) ) otherlv_2= '(' ( (lv_leftHand_3_0= ruleDependency ) ) ( (lv_operator_4_0= ruleBinaryOperator ) ) ( (lv_rightHand_5_0= ruleDependency ) ) otherlv_6= ')' otherlv_7= ')' ) ;
    public final EObject ruleBinaryNotDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_not_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_leftHand_3_0 = null;

        Enumerator lv_operator_4_0 = null;

        EObject lv_rightHand_5_0 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1036:28: ( (otherlv_0= '(' ( (lv_not_1_0= 'NOT' ) ) otherlv_2= '(' ( (lv_leftHand_3_0= ruleDependency ) ) ( (lv_operator_4_0= ruleBinaryOperator ) ) ( (lv_rightHand_5_0= ruleDependency ) ) otherlv_6= ')' otherlv_7= ')' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1037:1: (otherlv_0= '(' ( (lv_not_1_0= 'NOT' ) ) otherlv_2= '(' ( (lv_leftHand_3_0= ruleDependency ) ) ( (lv_operator_4_0= ruleBinaryOperator ) ) ( (lv_rightHand_5_0= ruleDependency ) ) otherlv_6= ')' otherlv_7= ')' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1037:1: (otherlv_0= '(' ( (lv_not_1_0= 'NOT' ) ) otherlv_2= '(' ( (lv_leftHand_3_0= ruleDependency ) ) ( (lv_operator_4_0= ruleBinaryOperator ) ) ( (lv_rightHand_5_0= ruleDependency ) ) otherlv_6= ')' otherlv_7= ')' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1037:3: otherlv_0= '(' ( (lv_not_1_0= 'NOT' ) ) otherlv_2= '(' ( (lv_leftHand_3_0= ruleDependency ) ) ( (lv_operator_4_0= ruleBinaryOperator ) ) ( (lv_rightHand_5_0= ruleDependency ) ) otherlv_6= ')' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryNotDependency2173); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryNotDependencyAccess().getLeftParenthesisKeyword_0());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1041:1: ( (lv_not_1_0= 'NOT' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1042:1: (lv_not_1_0= 'NOT' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1042:1: (lv_not_1_0= 'NOT' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1043:3: lv_not_1_0= 'NOT'
            {
            lv_not_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBinaryNotDependency2191); 

                    newLeafNode(lv_not_1_0, grammarAccess.getBinaryNotDependencyAccess().getNotNOTKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryNotDependencyRule());
            	        }
                   		setWithLastConsumed(current, "not", true, "NOT");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryNotDependency2216); 

                	newLeafNode(otherlv_2, grammarAccess.getBinaryNotDependencyAccess().getLeftParenthesisKeyword_2());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1060:1: ( (lv_leftHand_3_0= ruleDependency ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1061:1: (lv_leftHand_3_0= ruleDependency )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1061:1: (lv_leftHand_3_0= ruleDependency )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1062:3: lv_leftHand_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getBinaryNotDependencyAccess().getLeftHandDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleBinaryNotDependency2237);
            lv_leftHand_3_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryNotDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"leftHand",
                    		lv_leftHand_3_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1078:2: ( (lv_operator_4_0= ruleBinaryOperator ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1079:1: (lv_operator_4_0= ruleBinaryOperator )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1079:1: (lv_operator_4_0= ruleBinaryOperator )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1080:3: lv_operator_4_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBinaryNotDependencyAccess().getOperatorBinaryOperatorEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_ruleBinaryNotDependency2258);
            lv_operator_4_0=ruleBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryNotDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_4_0, 
                    		"BinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1096:2: ( (lv_rightHand_5_0= ruleDependency ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1097:1: (lv_rightHand_5_0= ruleDependency )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1097:1: (lv_rightHand_5_0= ruleDependency )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1098:3: lv_rightHand_5_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getBinaryNotDependencyAccess().getRightHandDependencyParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleBinaryNotDependency2279);
            lv_rightHand_5_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryNotDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"rightHand",
                    		lv_rightHand_5_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBinaryNotDependency2291); 

                	newLeafNode(otherlv_6, grammarAccess.getBinaryNotDependencyAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBinaryNotDependency2303); 

                	newLeafNode(otherlv_7, grammarAccess.getBinaryNotDependencyAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleBinaryNotDependency"


    // $ANTLR start "entryRuleBinaryDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1130:1: entryRuleBinaryDependency returns [EObject current=null] : iv_ruleBinaryDependency= ruleBinaryDependency EOF ;
    public final EObject entryRuleBinaryDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryDependency = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1131:2: (iv_ruleBinaryDependency= ruleBinaryDependency EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1132:2: iv_ruleBinaryDependency= ruleBinaryDependency EOF
            {
             newCompositeNode(grammarAccess.getBinaryDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryDependency_in_entryRuleBinaryDependency2339);
            iv_ruleBinaryDependency=ruleBinaryDependency();

            state._fsp--;

             current =iv_ruleBinaryDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryDependency2349); 

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
    // $ANTLR end "entryRuleBinaryDependency"


    // $ANTLR start "ruleBinaryDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1139:1: ruleBinaryDependency returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftHand_1_0= ruleDependency ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightHand_3_0= ruleDependency ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_leftHand_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightHand_3_0 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1142:28: ( (otherlv_0= '(' ( (lv_leftHand_1_0= ruleDependency ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightHand_3_0= ruleDependency ) ) otherlv_4= ')' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1143:1: (otherlv_0= '(' ( (lv_leftHand_1_0= ruleDependency ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightHand_3_0= ruleDependency ) ) otherlv_4= ')' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1143:1: (otherlv_0= '(' ( (lv_leftHand_1_0= ruleDependency ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightHand_3_0= ruleDependency ) ) otherlv_4= ')' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1143:3: otherlv_0= '(' ( (lv_leftHand_1_0= ruleDependency ) ) ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_rightHand_3_0= ruleDependency ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryDependency2386); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryDependencyAccess().getLeftParenthesisKeyword_0());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1147:1: ( (lv_leftHand_1_0= ruleDependency ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1148:1: (lv_leftHand_1_0= ruleDependency )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1148:1: (lv_leftHand_1_0= ruleDependency )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1149:3: lv_leftHand_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getBinaryDependencyAccess().getLeftHandDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleBinaryDependency2407);
            lv_leftHand_1_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"leftHand",
                    		lv_leftHand_1_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1165:2: ( (lv_operator_2_0= ruleBinaryOperator ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1166:1: (lv_operator_2_0= ruleBinaryOperator )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1166:1: (lv_operator_2_0= ruleBinaryOperator )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1167:3: lv_operator_2_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBinaryDependencyAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_ruleBinaryDependency2428);
            lv_operator_2_0=ruleBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"BinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1183:2: ( (lv_rightHand_3_0= ruleDependency ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1184:1: (lv_rightHand_3_0= ruleDependency )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1184:1: (lv_rightHand_3_0= ruleDependency )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1185:3: lv_rightHand_3_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getBinaryDependencyAccess().getRightHandDependencyParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleBinaryDependency2449);
            lv_rightHand_3_0=ruleDependency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"rightHand",
                    		lv_rightHand_3_0, 
                    		"Dependency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBinaryDependency2461); 

                	newLeafNode(otherlv_4, grammarAccess.getBinaryDependencyAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleBinaryDependency"


    // $ANTLR start "entryRuleIsSelectedDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1213:1: entryRuleIsSelectedDependency returns [EObject current=null] : iv_ruleIsSelectedDependency= ruleIsSelectedDependency EOF ;
    public final EObject entryRuleIsSelectedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSelectedDependency = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1214:2: (iv_ruleIsSelectedDependency= ruleIsSelectedDependency EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1215:2: iv_ruleIsSelectedDependency= ruleIsSelectedDependency EOF
            {
             newCompositeNode(grammarAccess.getIsSelectedDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsSelectedDependency_in_entryRuleIsSelectedDependency2497);
            iv_ruleIsSelectedDependency=ruleIsSelectedDependency();

            state._fsp--;

             current =iv_ruleIsSelectedDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsSelectedDependency2507); 

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
    // $ANTLR end "entryRuleIsSelectedDependency"


    // $ANTLR start "ruleIsSelectedDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1222:1: ruleIsSelectedDependency returns [EObject current=null] : (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? otherlv_4= 'SELECTED' otherlv_5= ')' ) ;
    public final EObject ruleIsSelectedDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_not_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1225:28: ( (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? otherlv_4= 'SELECTED' otherlv_5= ')' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1226:1: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? otherlv_4= 'SELECTED' otherlv_5= ')' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1226:1: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? otherlv_4= 'SELECTED' otherlv_5= ')' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1226:3: otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? otherlv_4= 'SELECTED' otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIsSelectedDependency2544); 

                	newLeafNode(otherlv_0, grammarAccess.getIsSelectedDependencyAccess().getLeftParenthesisKeyword_0());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1230:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1231:1: ( ruleEString )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1231:1: ( ruleEString )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1232:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIsSelectedDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIsSelectedDependencyAccess().getTargetFeatureCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIsSelectedDependency2567);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIsSelectedDependency2579); 

                	newLeafNode(otherlv_2, grammarAccess.getIsSelectedDependencyAccess().getISKeyword_2());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1249:1: ( (lv_not_3_0= 'NOT' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1250:1: (lv_not_3_0= 'NOT' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1250:1: (lv_not_3_0= 'NOT' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1251:3: lv_not_3_0= 'NOT'
                    {
                    lv_not_3_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIsSelectedDependency2597); 

                            newLeafNode(lv_not_3_0, grammarAccess.getIsSelectedDependencyAccess().getNotNOTKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIsSelectedDependencyRule());
                    	        }
                           		setWithLastConsumed(current, "not", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleIsSelectedDependency2623); 

                	newLeafNode(otherlv_4, grammarAccess.getIsSelectedDependencyAccess().getSELECTEDKeyword_4());
                
            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIsSelectedDependency2635); 

                	newLeafNode(otherlv_5, grammarAccess.getIsSelectedDependencyAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleIsSelectedDependency"


    // $ANTLR start "entryRuleIntegerValueDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1280:1: entryRuleIntegerValueDependency returns [EObject current=null] : iv_ruleIntegerValueDependency= ruleIntegerValueDependency EOF ;
    public final EObject entryRuleIntegerValueDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueDependency = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1281:2: (iv_ruleIntegerValueDependency= ruleIntegerValueDependency EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1282:2: iv_ruleIntegerValueDependency= ruleIntegerValueDependency EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerValueDependency_in_entryRuleIntegerValueDependency2671);
            iv_ruleIntegerValueDependency=ruleIntegerValueDependency();

            state._fsp--;

             current =iv_ruleIntegerValueDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerValueDependency2681); 

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
    // $ANTLR end "entryRuleIntegerValueDependency"


    // $ANTLR start "ruleIntegerValueDependency"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1289:1: ruleIntegerValueDependency returns [EObject current=null] : (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ')' ) ;
    public final EObject ruleIntegerValueDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_not_3_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1292:28: ( (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ')' ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1293:1: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ')' )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1293:1: (otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ')' )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1293:3: otherlv_0= '(' ( ( ruleEString ) ) otherlv_2= 'IS' ( (lv_not_3_0= 'NOT' ) )? ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIntegerValueDependency2718); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerValueDependencyAccess().getLeftParenthesisKeyword_0());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1297:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1298:1: ( ruleEString )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1298:1: ( ruleEString )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1299:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerValueDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIntegerValueDependencyAccess().getTargetIntegerFeatureCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerValueDependency2741);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIntegerValueDependency2753); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerValueDependencyAccess().getISKeyword_2());
                
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1316:1: ( (lv_not_3_0= 'NOT' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1317:1: (lv_not_3_0= 'NOT' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1317:1: (lv_not_3_0= 'NOT' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1318:3: lv_not_3_0= 'NOT'
                    {
                    lv_not_3_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIntegerValueDependency2771); 

                            newLeafNode(lv_not_3_0, grammarAccess.getIntegerValueDependencyAccess().getNotNOTKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerValueDependencyRule());
                    	        }
                           		setWithLastConsumed(current, "not", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1331:3: ( (lv_value_4_0= ruleEInt ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1332:1: (lv_value_4_0= ruleEInt )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1332:1: (lv_value_4_0= ruleEInt )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1333:3: lv_value_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueDependencyAccess().getValueEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerValueDependency2806);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIntegerValueDependency2818); 

                	newLeafNode(otherlv_5, grammarAccess.getIntegerValueDependencyAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleIntegerValueDependency"


    // $ANTLR start "entryRuleEInt"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1361:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1362:2: (iv_ruleEInt= ruleEInt EOF )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1363:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2855);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2866); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1370:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1373:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1374:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1374:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1374:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1374:2: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1375:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEInt2905); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2922); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleBinaryOperator"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1395:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1397:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1398:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1398:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            else if ( (LA27_0==30) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1398:2: (enumLiteral_0= 'AND' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1398:2: (enumLiteral_0= 'AND' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1398:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBinaryOperator2981); 

                            current = grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1404:6: (enumLiteral_1= 'OR' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1404:6: (enumLiteral_1= 'OR' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1404:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBinaryOperator2998); 

                            current = grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "ruleGroupType"
    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1414:1: ruleGroupType returns [Enumerator current=null] : ( (enumLiteral_0= 'Inclusive Group' ) | (enumLiteral_1= 'Exclusive Group' ) ) ;
    public final Enumerator ruleGroupType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1416:28: ( ( (enumLiteral_0= 'Inclusive Group' ) | (enumLiteral_1= 'Exclusive Group' ) ) )
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1417:1: ( (enumLiteral_0= 'Inclusive Group' ) | (enumLiteral_1= 'Exclusive Group' ) )
            {
            // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1417:1: ( (enumLiteral_0= 'Inclusive Group' ) | (enumLiteral_1= 'Exclusive Group' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1417:2: (enumLiteral_0= 'Inclusive Group' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1417:2: (enumLiteral_0= 'Inclusive Group' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1417:4: enumLiteral_0= 'Inclusive Group'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleGroupType3043); 

                            current = grammarAccess.getGroupTypeAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGroupTypeAccess().getOREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1423:6: (enumLiteral_1= 'Exclusive Group' )
                    {
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1423:6: (enumLiteral_1= 'Exclusive Group' )
                    // ../assignment6_configurator_DSL/src-gen/org/xtext/example/assignment6/parser/antlr/internal/InternalConfiguratorDSL.g:1423:8: enumLiteral_1= 'Exclusive Group'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleGroupType3060); 

                            current = grammarAccess.getGroupTypeAccess().getXOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGroupTypeAccess().getXOREnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleGroupType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfigurator_in_entryRuleConfigurator75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurator85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConfigurator131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurator152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfigurator164 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleConfigurator177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfigurator189 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleConfigurator210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleConfigurator223 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleConfigurator244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleConfigurator258 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleConfigurator273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfigurator285 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleConfigurator306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleConfigurator319 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleConfigurator340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleConfigurator354 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConfigurator368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_ruleFeature461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerFeature_in_ruleFeature488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupType_in_ruleGroup702 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup723 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroup735 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_ruleGroup756 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleGroup769 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_ruleGroup790 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleGroup804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_entryRuleSimpleFeature842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFeature852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSimpleFeature904 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSimpleFeature930 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleFeature951 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSimpleFeature963 = new BitSet(new long[]{0x000000000009A000L});
        public static final BitSet FOLLOW_19_in_ruleSimpleFeature976 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSimpleFeature988 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleSimpleFeature1009 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSimpleFeature1022 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleSimpleFeature1043 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSimpleFeature1057 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleSimpleFeature1072 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSimpleFeature1084 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleSimpleFeature1105 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSimpleFeature1118 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleSimpleFeature1139 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSimpleFeature1153 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSimpleFeature1168 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSimpleFeature1180 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSimpleFeature1201 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSimpleFeature1214 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSimpleFeature1235 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSimpleFeature1249 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSimpleFeature1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature1299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerFeature1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleIntegerFeature1361 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIntegerFeature1387 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerFeature1408 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntegerFeature1420 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleIntegerFeature1433 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerFeature1454 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleIntegerFeature1468 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerFeature1489 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleIntegerFeature1503 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerFeature1524 = new BitSet(new long[]{0x000000000009A000L});
        public static final BitSet FOLLOW_19_in_ruleIntegerFeature1538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntegerFeature1550 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleIntegerFeature1571 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleIntegerFeature1584 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleIntegerFeature1605 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleIntegerFeature1619 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleIntegerFeature1634 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntegerFeature1646 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleIntegerFeature1667 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleIntegerFeature1680 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleIntegerFeature1701 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleIntegerFeature1715 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleIntegerFeature1730 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntegerFeature1742 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleIntegerFeature1763 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleIntegerFeature1776 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleIntegerFeature1797 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleIntegerFeature1811 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntegerFeature1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency1861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseBinaryDependency_in_ruleDependency1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsSelectedDependency_in_ruleDependency1945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValueDependency_in_ruleDependency1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseBinaryDependency_in_entryRuleBaseBinaryDependency2007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBaseBinaryDependency2017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryNotDependency_in_ruleBaseBinaryDependency2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryDependency_in_ruleBaseBinaryDependency2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryNotDependency_in_entryRuleBinaryNotDependency2126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryNotDependency2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBinaryNotDependency2173 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleBinaryNotDependency2191 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleBinaryNotDependency2216 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleBinaryNotDependency2237 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryNotDependency2258 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleBinaryNotDependency2279 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleBinaryNotDependency2291 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleBinaryNotDependency2303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryDependency_in_entryRuleBinaryDependency2339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryDependency2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBinaryDependency2386 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleBinaryDependency2407 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryDependency2428 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleBinaryDependency2449 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleBinaryDependency2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsSelectedDependency_in_entryRuleIsSelectedDependency2497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsSelectedDependency2507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleIsSelectedDependency2544 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIsSelectedDependency2567 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleIsSelectedDependency2579 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_24_in_ruleIsSelectedDependency2597 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleIsSelectedDependency2623 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleIsSelectedDependency2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValueDependency_in_entryRuleIntegerValueDependency2671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueDependency2681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleIntegerValueDependency2718 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerValueDependency2741 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleIntegerValueDependency2753 = new BitSet(new long[]{0x0000000011000040L});
        public static final BitSet FOLLOW_24_in_ruleIntegerValueDependency2771 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerValueDependency2806 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleIntegerValueDependency2818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEInt2905 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBinaryOperator2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleBinaryOperator2998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleGroupType3043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleGroupType3060 = new BitSet(new long[]{0x0000000000000002L});
    }


}