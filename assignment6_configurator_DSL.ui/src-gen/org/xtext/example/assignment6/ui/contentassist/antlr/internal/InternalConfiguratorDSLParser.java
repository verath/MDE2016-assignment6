package org.xtext.example.assignment6.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.assignment6.services.ConfiguratorDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfiguratorDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'Inclusive Group'", "'Exclusive Group'", "'Configurator'", "'{'", "'}'", "'features'", "','", "'groups'", "'Feature'", "'dependencies'", "'minValue'", "'maxValue'", "'step'", "'('", "')'", "'IS'", "'SELECTED'", "'-'", "'mandatory'", "'NOT'"
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
    public String getGrammarFileName() { return "../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g"; }


     
     	private ConfiguratorDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ConfiguratorDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleConfigurator"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:60:1: entryRuleConfigurator : ruleConfigurator EOF ;
    public final void entryRuleConfigurator() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:61:1: ( ruleConfigurator EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:62:1: ruleConfigurator EOF
            {
             before(grammarAccess.getConfiguratorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurator_in_entryRuleConfigurator61);
            ruleConfigurator();

            state._fsp--;

             after(grammarAccess.getConfiguratorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurator68); 

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
    // $ANTLR end "entryRuleConfigurator"


    // $ANTLR start "ruleConfigurator"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:69:1: ruleConfigurator : ( ( rule__Configurator__Group__0 ) ) ;
    public final void ruleConfigurator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:73:2: ( ( ( rule__Configurator__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:74:1: ( ( rule__Configurator__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:74:1: ( ( rule__Configurator__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:75:1: ( rule__Configurator__Group__0 )
            {
             before(grammarAccess.getConfiguratorAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:76:1: ( rule__Configurator__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:76:2: rule__Configurator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__0_in_ruleConfigurator94);
            rule__Configurator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getGroup()); 

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
    // $ANTLR end "ruleConfigurator"


    // $ANTLR start "entryRuleFeature"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:88:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:89:1: ( ruleFeature EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:90:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature121);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature128); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:97:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:101:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:102:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:102:1: ( ( rule__Feature__Alternatives ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:103:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:104:1: ( rule__Feature__Alternatives )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:104:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Alternatives_in_ruleFeature154);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEString"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:117:1: ( ruleEString EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:132:1: ( rule__EString__Alternatives )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
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


    // $ANTLR start "entryRuleGroup"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:144:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:145:1: ( ruleGroup EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:146:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup241);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup248); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:153:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:157:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:158:1: ( ( rule__Group__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:158:1: ( ( rule__Group__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:159:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:160:1: ( rule__Group__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:160:2: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0_in_ruleGroup274);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleSimpleFeature"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:174:1: entryRuleSimpleFeature : ruleSimpleFeature EOF ;
    public final void entryRuleSimpleFeature() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:175:1: ( ruleSimpleFeature EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:176:1: ruleSimpleFeature EOF
            {
             before(grammarAccess.getSimpleFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_entryRuleSimpleFeature303);
            ruleSimpleFeature();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleFeature310); 

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
    // $ANTLR end "entryRuleSimpleFeature"


    // $ANTLR start "ruleSimpleFeature"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:183:1: ruleSimpleFeature : ( ( rule__SimpleFeature__Group__0 ) ) ;
    public final void ruleSimpleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:187:2: ( ( ( rule__SimpleFeature__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:188:1: ( ( rule__SimpleFeature__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:188:1: ( ( rule__SimpleFeature__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:189:1: ( rule__SimpleFeature__Group__0 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:190:1: ( rule__SimpleFeature__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:190:2: rule__SimpleFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__0_in_ruleSimpleFeature336);
            rule__SimpleFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleFeature"


    // $ANTLR start "entryRuleIntegerFeature"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:202:1: entryRuleIntegerFeature : ruleIntegerFeature EOF ;
    public final void entryRuleIntegerFeature() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:203:1: ( ruleIntegerFeature EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:204:1: ruleIntegerFeature EOF
            {
             before(grammarAccess.getIntegerFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature363);
            ruleIntegerFeature();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerFeature370); 

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
    // $ANTLR end "entryRuleIntegerFeature"


    // $ANTLR start "ruleIntegerFeature"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:211:1: ruleIntegerFeature : ( ( rule__IntegerFeature__Group__0 ) ) ;
    public final void ruleIntegerFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:215:2: ( ( ( rule__IntegerFeature__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:216:1: ( ( rule__IntegerFeature__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:216:1: ( ( rule__IntegerFeature__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:217:1: ( rule__IntegerFeature__Group__0 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:218:1: ( rule__IntegerFeature__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:218:2: rule__IntegerFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__0_in_ruleIntegerFeature396);
            rule__IntegerFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerFeature"


    // $ANTLR start "entryRuleDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:230:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:231:1: ( ruleDependency EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:232:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency423);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency430); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:239:1: ruleDependency : ( ( rule__Dependency__Alternatives ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:243:2: ( ( ( rule__Dependency__Alternatives ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:244:1: ( ( rule__Dependency__Alternatives ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:244:1: ( ( rule__Dependency__Alternatives ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:245:1: ( rule__Dependency__Alternatives )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:246:1: ( rule__Dependency__Alternatives )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:246:2: rule__Dependency__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Alternatives_in_ruleDependency456);
            rule__Dependency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleBaseBinaryDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:258:1: entryRuleBaseBinaryDependency : ruleBaseBinaryDependency EOF ;
    public final void entryRuleBaseBinaryDependency() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:259:1: ( ruleBaseBinaryDependency EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:260:1: ruleBaseBinaryDependency EOF
            {
             before(grammarAccess.getBaseBinaryDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBaseBinaryDependency_in_entryRuleBaseBinaryDependency483);
            ruleBaseBinaryDependency();

            state._fsp--;

             after(grammarAccess.getBaseBinaryDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBaseBinaryDependency490); 

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
    // $ANTLR end "entryRuleBaseBinaryDependency"


    // $ANTLR start "ruleBaseBinaryDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:267:1: ruleBaseBinaryDependency : ( ( rule__BaseBinaryDependency__Alternatives ) ) ;
    public final void ruleBaseBinaryDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:271:2: ( ( ( rule__BaseBinaryDependency__Alternatives ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:272:1: ( ( rule__BaseBinaryDependency__Alternatives ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:272:1: ( ( rule__BaseBinaryDependency__Alternatives ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:273:1: ( rule__BaseBinaryDependency__Alternatives )
            {
             before(grammarAccess.getBaseBinaryDependencyAccess().getAlternatives()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:274:1: ( rule__BaseBinaryDependency__Alternatives )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:274:2: rule__BaseBinaryDependency__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BaseBinaryDependency__Alternatives_in_ruleBaseBinaryDependency516);
            rule__BaseBinaryDependency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseBinaryDependencyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBaseBinaryDependency"


    // $ANTLR start "entryRuleBinaryNotDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:286:1: entryRuleBinaryNotDependency : ruleBinaryNotDependency EOF ;
    public final void entryRuleBinaryNotDependency() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:287:1: ( ruleBinaryNotDependency EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:288:1: ruleBinaryNotDependency EOF
            {
             before(grammarAccess.getBinaryNotDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryNotDependency_in_entryRuleBinaryNotDependency543);
            ruleBinaryNotDependency();

            state._fsp--;

             after(grammarAccess.getBinaryNotDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryNotDependency550); 

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
    // $ANTLR end "entryRuleBinaryNotDependency"


    // $ANTLR start "ruleBinaryNotDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:295:1: ruleBinaryNotDependency : ( ( rule__BinaryNotDependency__Group__0 ) ) ;
    public final void ruleBinaryNotDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:299:2: ( ( ( rule__BinaryNotDependency__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:300:1: ( ( rule__BinaryNotDependency__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:300:1: ( ( rule__BinaryNotDependency__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:301:1: ( rule__BinaryNotDependency__Group__0 )
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:302:1: ( rule__BinaryNotDependency__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:302:2: rule__BinaryNotDependency__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__0_in_ruleBinaryNotDependency576);
            rule__BinaryNotDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryNotDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryNotDependency"


    // $ANTLR start "entryRuleBinaryDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:314:1: entryRuleBinaryDependency : ruleBinaryDependency EOF ;
    public final void entryRuleBinaryDependency() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:315:1: ( ruleBinaryDependency EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:316:1: ruleBinaryDependency EOF
            {
             before(grammarAccess.getBinaryDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryDependency_in_entryRuleBinaryDependency603);
            ruleBinaryDependency();

            state._fsp--;

             after(grammarAccess.getBinaryDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryDependency610); 

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
    // $ANTLR end "entryRuleBinaryDependency"


    // $ANTLR start "ruleBinaryDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:323:1: ruleBinaryDependency : ( ( rule__BinaryDependency__Group__0 ) ) ;
    public final void ruleBinaryDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:327:2: ( ( ( rule__BinaryDependency__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:328:1: ( ( rule__BinaryDependency__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:328:1: ( ( rule__BinaryDependency__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:329:1: ( rule__BinaryDependency__Group__0 )
            {
             before(grammarAccess.getBinaryDependencyAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:330:1: ( rule__BinaryDependency__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:330:2: rule__BinaryDependency__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__0_in_ruleBinaryDependency636);
            rule__BinaryDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryDependency"


    // $ANTLR start "entryRuleIsSelectedDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:342:1: entryRuleIsSelectedDependency : ruleIsSelectedDependency EOF ;
    public final void entryRuleIsSelectedDependency() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:343:1: ( ruleIsSelectedDependency EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:344:1: ruleIsSelectedDependency EOF
            {
             before(grammarAccess.getIsSelectedDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsSelectedDependency_in_entryRuleIsSelectedDependency663);
            ruleIsSelectedDependency();

            state._fsp--;

             after(grammarAccess.getIsSelectedDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsSelectedDependency670); 

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
    // $ANTLR end "entryRuleIsSelectedDependency"


    // $ANTLR start "ruleIsSelectedDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:351:1: ruleIsSelectedDependency : ( ( rule__IsSelectedDependency__Group__0 ) ) ;
    public final void ruleIsSelectedDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:355:2: ( ( ( rule__IsSelectedDependency__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:356:1: ( ( rule__IsSelectedDependency__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:356:1: ( ( rule__IsSelectedDependency__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:357:1: ( rule__IsSelectedDependency__Group__0 )
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:358:1: ( rule__IsSelectedDependency__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:358:2: rule__IsSelectedDependency__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__0_in_ruleIsSelectedDependency696);
            rule__IsSelectedDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsSelectedDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleIsSelectedDependency"


    // $ANTLR start "entryRuleIntegerValueDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:370:1: entryRuleIntegerValueDependency : ruleIntegerValueDependency EOF ;
    public final void entryRuleIntegerValueDependency() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:371:1: ( ruleIntegerValueDependency EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:372:1: ruleIntegerValueDependency EOF
            {
             before(grammarAccess.getIntegerValueDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerValueDependency_in_entryRuleIntegerValueDependency723);
            ruleIntegerValueDependency();

            state._fsp--;

             after(grammarAccess.getIntegerValueDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerValueDependency730); 

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
    // $ANTLR end "entryRuleIntegerValueDependency"


    // $ANTLR start "ruleIntegerValueDependency"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:379:1: ruleIntegerValueDependency : ( ( rule__IntegerValueDependency__Group__0 ) ) ;
    public final void ruleIntegerValueDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:383:2: ( ( ( rule__IntegerValueDependency__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:384:1: ( ( rule__IntegerValueDependency__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:384:1: ( ( rule__IntegerValueDependency__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:385:1: ( rule__IntegerValueDependency__Group__0 )
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:386:1: ( rule__IntegerValueDependency__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:386:2: rule__IntegerValueDependency__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__0_in_ruleIntegerValueDependency756);
            rule__IntegerValueDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerValueDependency"


    // $ANTLR start "entryRuleEInt"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:398:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:399:1: ( ruleEInt EOF )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:400:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt783);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt790); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:407:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:411:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:412:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:412:1: ( ( rule__EInt__Group__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:413:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:414:1: ( rule__EInt__Group__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:414:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt816);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleBinaryOperator"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:427:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:431:1: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:432:1: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:432:1: ( ( rule__BinaryOperator__Alternatives ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:433:1: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:434:1: ( rule__BinaryOperator__Alternatives )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:434:2: rule__BinaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator853);
            rule__BinaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "ruleGroupType"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:446:1: ruleGroupType : ( ( rule__GroupType__Alternatives ) ) ;
    public final void ruleGroupType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:450:1: ( ( ( rule__GroupType__Alternatives ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:451:1: ( ( rule__GroupType__Alternatives ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:451:1: ( ( rule__GroupType__Alternatives ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:452:1: ( rule__GroupType__Alternatives )
            {
             before(grammarAccess.getGroupTypeAccess().getAlternatives()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:453:1: ( rule__GroupType__Alternatives )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:453:2: rule__GroupType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupType__Alternatives_in_ruleGroupType889);
            rule__GroupType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGroupType"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:464:1: rule__Feature__Alternatives : ( ( ruleSimpleFeature ) | ( ruleIntegerFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:468:1: ( ( ruleSimpleFeature ) | ( ruleIntegerFeature ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_STRING) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==16) ) {
                            int LA1_5 = input.LA(5);

                            if ( (LA1_5==23) ) {
                                alt1=2;
                            }
                            else if ( ((LA1_5>=17 && LA1_5<=18)||LA1_5==20||LA1_5==22) ) {
                                alt1=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_2==RULE_ID) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==16) ) {
                            int LA1_5 = input.LA(5);

                            if ( (LA1_5==23) ) {
                                alt1=2;
                            }
                            else if ( ((LA1_5>=17 && LA1_5<=18)||LA1_5==20||LA1_5==22) ) {
                                alt1=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==21) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_STRING) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==16) ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5==23) ) {
                            alt1=2;
                        }
                        else if ( ((LA1_5>=17 && LA1_5<=18)||LA1_5==20||LA1_5==22) ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_2==RULE_ID) ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4==16) ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5==23) ) {
                            alt1=2;
                        }
                        else if ( ((LA1_5>=17 && LA1_5<=18)||LA1_5==20||LA1_5==22) ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:469:1: ( ruleSimpleFeature )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:469:1: ( ruleSimpleFeature )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:470:1: ruleSimpleFeature
                    {
                     before(grammarAccess.getFeatureAccess().getSimpleFeatureParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_rule__Feature__Alternatives924);
                    ruleSimpleFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getSimpleFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:475:6: ( ruleIntegerFeature )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:475:6: ( ruleIntegerFeature )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:476:1: ruleIntegerFeature
                    {
                     before(grammarAccess.getFeatureAccess().getIntegerFeatureParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerFeature_in_rule__Feature__Alternatives941);
                    ruleIntegerFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getIntegerFeatureParserRuleCall_1()); 

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:486:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:490:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:491:1: ( RULE_STRING )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:491:1: ( RULE_STRING )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:492:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives973); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:497:6: ( RULE_ID )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:497:6: ( RULE_ID )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:498:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives990); 
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


    // $ANTLR start "rule__Dependency__Alternatives"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:509:1: rule__Dependency__Alternatives : ( ( ruleBaseBinaryDependency ) | ( ruleIsSelectedDependency ) | ( ruleIntegerValueDependency ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:513:1: ( ( ruleBaseBinaryDependency ) | ( ruleIsSelectedDependency ) | ( ruleIntegerValueDependency ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==28) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            int LA3_6 = input.LA(5);

                            if ( (LA3_6==RULE_INT||LA3_6==30) ) {
                                alt3=3;
                            }
                            else if ( (LA3_6==29) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_INT:
                        case 30:
                            {
                            alt3=3;
                            }
                            break;
                        case 29:
                            {
                            alt3=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==28) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            int LA3_6 = input.LA(5);

                            if ( (LA3_6==RULE_INT||LA3_6==30) ) {
                                alt3=3;
                            }
                            else if ( (LA3_6==29) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_INT:
                        case 30:
                            {
                            alt3=3;
                            }
                            break;
                        case 29:
                            {
                            alt3=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                case 32:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:514:1: ( ruleBaseBinaryDependency )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:514:1: ( ruleBaseBinaryDependency )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:515:1: ruleBaseBinaryDependency
                    {
                     before(grammarAccess.getDependencyAccess().getBaseBinaryDependencyParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBaseBinaryDependency_in_rule__Dependency__Alternatives1023);
                    ruleBaseBinaryDependency();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getBaseBinaryDependencyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:520:6: ( ruleIsSelectedDependency )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:520:6: ( ruleIsSelectedDependency )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:521:1: ruleIsSelectedDependency
                    {
                     before(grammarAccess.getDependencyAccess().getIsSelectedDependencyParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIsSelectedDependency_in_rule__Dependency__Alternatives1040);
                    ruleIsSelectedDependency();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getIsSelectedDependencyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:526:6: ( ruleIntegerValueDependency )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:526:6: ( ruleIntegerValueDependency )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:527:1: ruleIntegerValueDependency
                    {
                     before(grammarAccess.getDependencyAccess().getIntegerValueDependencyParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerValueDependency_in_rule__Dependency__Alternatives1057);
                    ruleIntegerValueDependency();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getIntegerValueDependencyParserRuleCall_2()); 

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
    // $ANTLR end "rule__Dependency__Alternatives"


    // $ANTLR start "rule__BaseBinaryDependency__Alternatives"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:537:1: rule__BaseBinaryDependency__Alternatives : ( ( ruleBinaryNotDependency ) | ( ruleBinaryDependency ) );
    public final void rule__BaseBinaryDependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:541:1: ( ( ruleBinaryNotDependency ) | ( ruleBinaryDependency ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else if ( (LA4_1==32) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:542:1: ( ruleBinaryNotDependency )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:542:1: ( ruleBinaryNotDependency )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:543:1: ruleBinaryNotDependency
                    {
                     before(grammarAccess.getBaseBinaryDependencyAccess().getBinaryNotDependencyParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryNotDependency_in_rule__BaseBinaryDependency__Alternatives1089);
                    ruleBinaryNotDependency();

                    state._fsp--;

                     after(grammarAccess.getBaseBinaryDependencyAccess().getBinaryNotDependencyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:548:6: ( ruleBinaryDependency )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:548:6: ( ruleBinaryDependency )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:549:1: ruleBinaryDependency
                    {
                     before(grammarAccess.getBaseBinaryDependencyAccess().getBinaryDependencyParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryDependency_in_rule__BaseBinaryDependency__Alternatives1106);
                    ruleBinaryDependency();

                    state._fsp--;

                     after(grammarAccess.getBaseBinaryDependencyAccess().getBinaryDependencyParserRuleCall_1()); 

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
    // $ANTLR end "rule__BaseBinaryDependency__Alternatives"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:559:1: rule__BinaryOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:563:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:564:1: ( ( 'AND' ) )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:564:1: ( ( 'AND' ) )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:565:1: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:566:1: ( 'AND' )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:566:3: 'AND'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__BinaryOperator__Alternatives1139); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:571:6: ( ( 'OR' ) )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:571:6: ( ( 'OR' ) )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:572:1: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:573:1: ( 'OR' )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:573:3: 'OR'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__BinaryOperator__Alternatives1160); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__GroupType__Alternatives"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:583:1: rule__GroupType__Alternatives : ( ( ( 'Inclusive Group' ) ) | ( ( 'Exclusive Group' ) ) );
    public final void rule__GroupType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:587:1: ( ( ( 'Inclusive Group' ) ) | ( ( 'Exclusive Group' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:588:1: ( ( 'Inclusive Group' ) )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:588:1: ( ( 'Inclusive Group' ) )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:589:1: ( 'Inclusive Group' )
                    {
                     before(grammarAccess.getGroupTypeAccess().getOREnumLiteralDeclaration_0()); 
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:590:1: ( 'Inclusive Group' )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:590:3: 'Inclusive Group'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__GroupType__Alternatives1196); 

                    }

                     after(grammarAccess.getGroupTypeAccess().getOREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:595:6: ( ( 'Exclusive Group' ) )
                    {
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:595:6: ( ( 'Exclusive Group' ) )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:596:1: ( 'Exclusive Group' )
                    {
                     before(grammarAccess.getGroupTypeAccess().getXOREnumLiteralDeclaration_1()); 
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:597:1: ( 'Exclusive Group' )
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:597:3: 'Exclusive Group'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__GroupType__Alternatives1217); 

                    }

                     after(grammarAccess.getGroupTypeAccess().getXOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__GroupType__Alternatives"


    // $ANTLR start "rule__Configurator__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:609:1: rule__Configurator__Group__0 : rule__Configurator__Group__0__Impl rule__Configurator__Group__1 ;
    public final void rule__Configurator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:613:1: ( rule__Configurator__Group__0__Impl rule__Configurator__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:614:2: rule__Configurator__Group__0__Impl rule__Configurator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__01250);
            rule__Configurator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__01253);
            rule__Configurator__Group__1();

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
    // $ANTLR end "rule__Configurator__Group__0"


    // $ANTLR start "rule__Configurator__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:621:1: rule__Configurator__Group__0__Impl : ( () ) ;
    public final void rule__Configurator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:625:1: ( ( () ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:626:1: ( () )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:626:1: ( () )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:627:1: ()
            {
             before(grammarAccess.getConfiguratorAccess().getConfiguratorAction_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:628:1: ()
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:630:1: 
            {
            }

             after(grammarAccess.getConfiguratorAccess().getConfiguratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configurator__Group__0__Impl"


    // $ANTLR start "rule__Configurator__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:640:1: rule__Configurator__Group__1 : rule__Configurator__Group__1__Impl rule__Configurator__Group__2 ;
    public final void rule__Configurator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:644:1: ( rule__Configurator__Group__1__Impl rule__Configurator__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:645:2: rule__Configurator__Group__1__Impl rule__Configurator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__11311);
            rule__Configurator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__11314);
            rule__Configurator__Group__2();

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
    // $ANTLR end "rule__Configurator__Group__1"


    // $ANTLR start "rule__Configurator__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:652:1: rule__Configurator__Group__1__Impl : ( 'Configurator' ) ;
    public final void rule__Configurator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:656:1: ( ( 'Configurator' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:657:1: ( 'Configurator' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:657:1: ( 'Configurator' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:658:1: 'Configurator'
            {
             before(grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Configurator__Group__1__Impl1342); 
             after(grammarAccess.getConfiguratorAccess().getConfiguratorKeyword_1()); 

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
    // $ANTLR end "rule__Configurator__Group__1__Impl"


    // $ANTLR start "rule__Configurator__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:671:1: rule__Configurator__Group__2 : rule__Configurator__Group__2__Impl rule__Configurator__Group__3 ;
    public final void rule__Configurator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:675:1: ( rule__Configurator__Group__2__Impl rule__Configurator__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:676:2: rule__Configurator__Group__2__Impl rule__Configurator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__21373);
            rule__Configurator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__21376);
            rule__Configurator__Group__3();

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
    // $ANTLR end "rule__Configurator__Group__2"


    // $ANTLR start "rule__Configurator__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:683:1: rule__Configurator__Group__2__Impl : ( ( rule__Configurator__NameAssignment_2 ) ) ;
    public final void rule__Configurator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:687:1: ( ( ( rule__Configurator__NameAssignment_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:688:1: ( ( rule__Configurator__NameAssignment_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:688:1: ( ( rule__Configurator__NameAssignment_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:689:1: ( rule__Configurator__NameAssignment_2 )
            {
             before(grammarAccess.getConfiguratorAccess().getNameAssignment_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:690:1: ( rule__Configurator__NameAssignment_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:690:2: rule__Configurator__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__NameAssignment_2_in_rule__Configurator__Group__2__Impl1403);
            rule__Configurator__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Configurator__Group__2__Impl"


    // $ANTLR start "rule__Configurator__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:700:1: rule__Configurator__Group__3 : rule__Configurator__Group__3__Impl rule__Configurator__Group__4 ;
    public final void rule__Configurator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:704:1: ( rule__Configurator__Group__3__Impl rule__Configurator__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:705:2: rule__Configurator__Group__3__Impl rule__Configurator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__31433);
            rule__Configurator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__31436);
            rule__Configurator__Group__4();

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
    // $ANTLR end "rule__Configurator__Group__3"


    // $ANTLR start "rule__Configurator__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:712:1: rule__Configurator__Group__3__Impl : ( '{' ) ;
    public final void rule__Configurator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:716:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:717:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:717:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:718:1: '{'
            {
             before(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Configurator__Group__3__Impl1464); 
             after(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Configurator__Group__3__Impl"


    // $ANTLR start "rule__Configurator__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:731:1: rule__Configurator__Group__4 : rule__Configurator__Group__4__Impl rule__Configurator__Group__5 ;
    public final void rule__Configurator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:735:1: ( rule__Configurator__Group__4__Impl rule__Configurator__Group__5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:736:2: rule__Configurator__Group__4__Impl rule__Configurator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__41495);
            rule__Configurator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__41498);
            rule__Configurator__Group__5();

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
    // $ANTLR end "rule__Configurator__Group__4"


    // $ANTLR start "rule__Configurator__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:743:1: rule__Configurator__Group__4__Impl : ( ( rule__Configurator__Group_4__0 )? ) ;
    public final void rule__Configurator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:747:1: ( ( ( rule__Configurator__Group_4__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:748:1: ( ( rule__Configurator__Group_4__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:748:1: ( ( rule__Configurator__Group_4__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:749:1: ( rule__Configurator__Group_4__0 )?
            {
             before(grammarAccess.getConfiguratorAccess().getGroup_4()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:750:1: ( rule__Configurator__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:750:2: rule__Configurator__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__0_in_rule__Configurator__Group__4__Impl1525);
                    rule__Configurator__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguratorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Configurator__Group__4__Impl"


    // $ANTLR start "rule__Configurator__Group__5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:760:1: rule__Configurator__Group__5 : rule__Configurator__Group__5__Impl rule__Configurator__Group__6 ;
    public final void rule__Configurator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:764:1: ( rule__Configurator__Group__5__Impl rule__Configurator__Group__6 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:765:2: rule__Configurator__Group__5__Impl rule__Configurator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__51556);
            rule__Configurator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__51559);
            rule__Configurator__Group__6();

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
    // $ANTLR end "rule__Configurator__Group__5"


    // $ANTLR start "rule__Configurator__Group__5__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:772:1: rule__Configurator__Group__5__Impl : ( ( rule__Configurator__Group_5__0 )? ) ;
    public final void rule__Configurator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:776:1: ( ( ( rule__Configurator__Group_5__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:777:1: ( ( rule__Configurator__Group_5__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:777:1: ( ( rule__Configurator__Group_5__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:778:1: ( rule__Configurator__Group_5__0 )?
            {
             before(grammarAccess.getConfiguratorAccess().getGroup_5()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:779:1: ( rule__Configurator__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:779:2: rule__Configurator__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl1586);
                    rule__Configurator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguratorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Configurator__Group__5__Impl"


    // $ANTLR start "rule__Configurator__Group__6"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:789:1: rule__Configurator__Group__6 : rule__Configurator__Group__6__Impl ;
    public final void rule__Configurator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:793:1: ( rule__Configurator__Group__6__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:794:2: rule__Configurator__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__61617);
            rule__Configurator__Group__6__Impl();

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
    // $ANTLR end "rule__Configurator__Group__6"


    // $ANTLR start "rule__Configurator__Group__6__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:800:1: rule__Configurator__Group__6__Impl : ( '}' ) ;
    public final void rule__Configurator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:804:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:805:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:805:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:806:1: '}'
            {
             before(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Configurator__Group__6__Impl1645); 
             after(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Configurator__Group__6__Impl"


    // $ANTLR start "rule__Configurator__Group_4__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:833:1: rule__Configurator__Group_4__0 : rule__Configurator__Group_4__0__Impl rule__Configurator__Group_4__1 ;
    public final void rule__Configurator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:837:1: ( rule__Configurator__Group_4__0__Impl rule__Configurator__Group_4__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:838:2: rule__Configurator__Group_4__0__Impl rule__Configurator__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__0__Impl_in_rule__Configurator__Group_4__01690);
            rule__Configurator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__1_in_rule__Configurator__Group_4__01693);
            rule__Configurator__Group_4__1();

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
    // $ANTLR end "rule__Configurator__Group_4__0"


    // $ANTLR start "rule__Configurator__Group_4__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:845:1: rule__Configurator__Group_4__0__Impl : ( 'features' ) ;
    public final void rule__Configurator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:849:1: ( ( 'features' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:850:1: ( 'features' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:850:1: ( 'features' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:851:1: 'features'
            {
             before(grammarAccess.getConfiguratorAccess().getFeaturesKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Configurator__Group_4__0__Impl1721); 
             after(grammarAccess.getConfiguratorAccess().getFeaturesKeyword_4_0()); 

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
    // $ANTLR end "rule__Configurator__Group_4__0__Impl"


    // $ANTLR start "rule__Configurator__Group_4__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:864:1: rule__Configurator__Group_4__1 : rule__Configurator__Group_4__1__Impl rule__Configurator__Group_4__2 ;
    public final void rule__Configurator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:868:1: ( rule__Configurator__Group_4__1__Impl rule__Configurator__Group_4__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:869:2: rule__Configurator__Group_4__1__Impl rule__Configurator__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__1__Impl_in_rule__Configurator__Group_4__11752);
            rule__Configurator__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__2_in_rule__Configurator__Group_4__11755);
            rule__Configurator__Group_4__2();

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
    // $ANTLR end "rule__Configurator__Group_4__1"


    // $ANTLR start "rule__Configurator__Group_4__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:876:1: rule__Configurator__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Configurator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:880:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:881:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:881:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:882:1: '{'
            {
             before(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Configurator__Group_4__1__Impl1783); 
             after(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Configurator__Group_4__1__Impl"


    // $ANTLR start "rule__Configurator__Group_4__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:895:1: rule__Configurator__Group_4__2 : rule__Configurator__Group_4__2__Impl rule__Configurator__Group_4__3 ;
    public final void rule__Configurator__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:899:1: ( rule__Configurator__Group_4__2__Impl rule__Configurator__Group_4__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:900:2: rule__Configurator__Group_4__2__Impl rule__Configurator__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__2__Impl_in_rule__Configurator__Group_4__21814);
            rule__Configurator__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__3_in_rule__Configurator__Group_4__21817);
            rule__Configurator__Group_4__3();

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
    // $ANTLR end "rule__Configurator__Group_4__2"


    // $ANTLR start "rule__Configurator__Group_4__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:907:1: rule__Configurator__Group_4__2__Impl : ( ( rule__Configurator__FeaturesAssignment_4_2 ) ) ;
    public final void rule__Configurator__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:911:1: ( ( ( rule__Configurator__FeaturesAssignment_4_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:912:1: ( ( rule__Configurator__FeaturesAssignment_4_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:912:1: ( ( rule__Configurator__FeaturesAssignment_4_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:913:1: ( rule__Configurator__FeaturesAssignment_4_2 )
            {
             before(grammarAccess.getConfiguratorAccess().getFeaturesAssignment_4_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:914:1: ( rule__Configurator__FeaturesAssignment_4_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:914:2: rule__Configurator__FeaturesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__FeaturesAssignment_4_2_in_rule__Configurator__Group_4__2__Impl1844);
            rule__Configurator__FeaturesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getFeaturesAssignment_4_2()); 

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
    // $ANTLR end "rule__Configurator__Group_4__2__Impl"


    // $ANTLR start "rule__Configurator__Group_4__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:924:1: rule__Configurator__Group_4__3 : rule__Configurator__Group_4__3__Impl rule__Configurator__Group_4__4 ;
    public final void rule__Configurator__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:928:1: ( rule__Configurator__Group_4__3__Impl rule__Configurator__Group_4__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:929:2: rule__Configurator__Group_4__3__Impl rule__Configurator__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__3__Impl_in_rule__Configurator__Group_4__31874);
            rule__Configurator__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__4_in_rule__Configurator__Group_4__31877);
            rule__Configurator__Group_4__4();

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
    // $ANTLR end "rule__Configurator__Group_4__3"


    // $ANTLR start "rule__Configurator__Group_4__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:936:1: rule__Configurator__Group_4__3__Impl : ( ( rule__Configurator__Group_4_3__0 )* ) ;
    public final void rule__Configurator__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:940:1: ( ( ( rule__Configurator__Group_4_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:941:1: ( ( rule__Configurator__Group_4_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:941:1: ( ( rule__Configurator__Group_4_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:942:1: ( rule__Configurator__Group_4_3__0 )*
            {
             before(grammarAccess.getConfiguratorAccess().getGroup_4_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:943:1: ( rule__Configurator__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:943:2: rule__Configurator__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4_3__0_in_rule__Configurator__Group_4__3__Impl1904);
            	    rule__Configurator__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConfiguratorAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Configurator__Group_4__3__Impl"


    // $ANTLR start "rule__Configurator__Group_4__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:953:1: rule__Configurator__Group_4__4 : rule__Configurator__Group_4__4__Impl ;
    public final void rule__Configurator__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:957:1: ( rule__Configurator__Group_4__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:958:2: rule__Configurator__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4__4__Impl_in_rule__Configurator__Group_4__41935);
            rule__Configurator__Group_4__4__Impl();

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
    // $ANTLR end "rule__Configurator__Group_4__4"


    // $ANTLR start "rule__Configurator__Group_4__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:964:1: rule__Configurator__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Configurator__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:968:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:969:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:969:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:970:1: '}'
            {
             before(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Configurator__Group_4__4__Impl1963); 
             after(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Configurator__Group_4__4__Impl"


    // $ANTLR start "rule__Configurator__Group_4_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:993:1: rule__Configurator__Group_4_3__0 : rule__Configurator__Group_4_3__0__Impl rule__Configurator__Group_4_3__1 ;
    public final void rule__Configurator__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:997:1: ( rule__Configurator__Group_4_3__0__Impl rule__Configurator__Group_4_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:998:2: rule__Configurator__Group_4_3__0__Impl rule__Configurator__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4_3__0__Impl_in_rule__Configurator__Group_4_3__02004);
            rule__Configurator__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4_3__1_in_rule__Configurator__Group_4_3__02007);
            rule__Configurator__Group_4_3__1();

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
    // $ANTLR end "rule__Configurator__Group_4_3__0"


    // $ANTLR start "rule__Configurator__Group_4_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1005:1: rule__Configurator__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Configurator__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1009:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1010:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1010:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1011:1: ','
            {
             before(grammarAccess.getConfiguratorAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Configurator__Group_4_3__0__Impl2035); 
             after(grammarAccess.getConfiguratorAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Configurator__Group_4_3__0__Impl"


    // $ANTLR start "rule__Configurator__Group_4_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1024:1: rule__Configurator__Group_4_3__1 : rule__Configurator__Group_4_3__1__Impl ;
    public final void rule__Configurator__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1028:1: ( rule__Configurator__Group_4_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1029:2: rule__Configurator__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_4_3__1__Impl_in_rule__Configurator__Group_4_3__12066);
            rule__Configurator__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Configurator__Group_4_3__1"


    // $ANTLR start "rule__Configurator__Group_4_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1035:1: rule__Configurator__Group_4_3__1__Impl : ( ( rule__Configurator__FeaturesAssignment_4_3_1 ) ) ;
    public final void rule__Configurator__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1039:1: ( ( ( rule__Configurator__FeaturesAssignment_4_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1040:1: ( ( rule__Configurator__FeaturesAssignment_4_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1040:1: ( ( rule__Configurator__FeaturesAssignment_4_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1041:1: ( rule__Configurator__FeaturesAssignment_4_3_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getFeaturesAssignment_4_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1042:1: ( rule__Configurator__FeaturesAssignment_4_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1042:2: rule__Configurator__FeaturesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__FeaturesAssignment_4_3_1_in_rule__Configurator__Group_4_3__1__Impl2093);
            rule__Configurator__FeaturesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getFeaturesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Configurator__Group_4_3__1__Impl"


    // $ANTLR start "rule__Configurator__Group_5__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1056:1: rule__Configurator__Group_5__0 : rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 ;
    public final void rule__Configurator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1060:1: ( rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1061:2: rule__Configurator__Group_5__0__Impl rule__Configurator__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__02127);
            rule__Configurator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__02130);
            rule__Configurator__Group_5__1();

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
    // $ANTLR end "rule__Configurator__Group_5__0"


    // $ANTLR start "rule__Configurator__Group_5__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1068:1: rule__Configurator__Group_5__0__Impl : ( 'groups' ) ;
    public final void rule__Configurator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1072:1: ( ( 'groups' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1073:1: ( 'groups' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1073:1: ( 'groups' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1074:1: 'groups'
            {
             before(grammarAccess.getConfiguratorAccess().getGroupsKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Configurator__Group_5__0__Impl2158); 
             after(grammarAccess.getConfiguratorAccess().getGroupsKeyword_5_0()); 

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
    // $ANTLR end "rule__Configurator__Group_5__0__Impl"


    // $ANTLR start "rule__Configurator__Group_5__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1087:1: rule__Configurator__Group_5__1 : rule__Configurator__Group_5__1__Impl rule__Configurator__Group_5__2 ;
    public final void rule__Configurator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1091:1: ( rule__Configurator__Group_5__1__Impl rule__Configurator__Group_5__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1092:2: rule__Configurator__Group_5__1__Impl rule__Configurator__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__12189);
            rule__Configurator__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__2_in_rule__Configurator__Group_5__12192);
            rule__Configurator__Group_5__2();

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
    // $ANTLR end "rule__Configurator__Group_5__1"


    // $ANTLR start "rule__Configurator__Group_5__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1099:1: rule__Configurator__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Configurator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1103:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1104:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1104:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1105:1: '{'
            {
             before(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Configurator__Group_5__1__Impl2220); 
             after(grammarAccess.getConfiguratorAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Configurator__Group_5__1__Impl"


    // $ANTLR start "rule__Configurator__Group_5__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1118:1: rule__Configurator__Group_5__2 : rule__Configurator__Group_5__2__Impl rule__Configurator__Group_5__3 ;
    public final void rule__Configurator__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1122:1: ( rule__Configurator__Group_5__2__Impl rule__Configurator__Group_5__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1123:2: rule__Configurator__Group_5__2__Impl rule__Configurator__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__2__Impl_in_rule__Configurator__Group_5__22251);
            rule__Configurator__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__3_in_rule__Configurator__Group_5__22254);
            rule__Configurator__Group_5__3();

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
    // $ANTLR end "rule__Configurator__Group_5__2"


    // $ANTLR start "rule__Configurator__Group_5__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1130:1: rule__Configurator__Group_5__2__Impl : ( ( rule__Configurator__GroupsAssignment_5_2 ) ) ;
    public final void rule__Configurator__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1134:1: ( ( ( rule__Configurator__GroupsAssignment_5_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1135:1: ( ( rule__Configurator__GroupsAssignment_5_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1135:1: ( ( rule__Configurator__GroupsAssignment_5_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1136:1: ( rule__Configurator__GroupsAssignment_5_2 )
            {
             before(grammarAccess.getConfiguratorAccess().getGroupsAssignment_5_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1137:1: ( rule__Configurator__GroupsAssignment_5_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1137:2: rule__Configurator__GroupsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__GroupsAssignment_5_2_in_rule__Configurator__Group_5__2__Impl2281);
            rule__Configurator__GroupsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getGroupsAssignment_5_2()); 

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
    // $ANTLR end "rule__Configurator__Group_5__2__Impl"


    // $ANTLR start "rule__Configurator__Group_5__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1147:1: rule__Configurator__Group_5__3 : rule__Configurator__Group_5__3__Impl rule__Configurator__Group_5__4 ;
    public final void rule__Configurator__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1151:1: ( rule__Configurator__Group_5__3__Impl rule__Configurator__Group_5__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1152:2: rule__Configurator__Group_5__3__Impl rule__Configurator__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__3__Impl_in_rule__Configurator__Group_5__32311);
            rule__Configurator__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__4_in_rule__Configurator__Group_5__32314);
            rule__Configurator__Group_5__4();

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
    // $ANTLR end "rule__Configurator__Group_5__3"


    // $ANTLR start "rule__Configurator__Group_5__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1159:1: rule__Configurator__Group_5__3__Impl : ( ( rule__Configurator__Group_5_3__0 )* ) ;
    public final void rule__Configurator__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1163:1: ( ( ( rule__Configurator__Group_5_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1164:1: ( ( rule__Configurator__Group_5_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1164:1: ( ( rule__Configurator__Group_5_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1165:1: ( rule__Configurator__Group_5_3__0 )*
            {
             before(grammarAccess.getConfiguratorAccess().getGroup_5_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1166:1: ( rule__Configurator__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1166:2: rule__Configurator__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5_3__0_in_rule__Configurator__Group_5__3__Impl2341);
            	    rule__Configurator__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConfiguratorAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Configurator__Group_5__3__Impl"


    // $ANTLR start "rule__Configurator__Group_5__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1176:1: rule__Configurator__Group_5__4 : rule__Configurator__Group_5__4__Impl ;
    public final void rule__Configurator__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1180:1: ( rule__Configurator__Group_5__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1181:2: rule__Configurator__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5__4__Impl_in_rule__Configurator__Group_5__42372);
            rule__Configurator__Group_5__4__Impl();

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
    // $ANTLR end "rule__Configurator__Group_5__4"


    // $ANTLR start "rule__Configurator__Group_5__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1187:1: rule__Configurator__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Configurator__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1191:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1192:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1192:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1193:1: '}'
            {
             before(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Configurator__Group_5__4__Impl2400); 
             after(grammarAccess.getConfiguratorAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Configurator__Group_5__4__Impl"


    // $ANTLR start "rule__Configurator__Group_5_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1216:1: rule__Configurator__Group_5_3__0 : rule__Configurator__Group_5_3__0__Impl rule__Configurator__Group_5_3__1 ;
    public final void rule__Configurator__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1220:1: ( rule__Configurator__Group_5_3__0__Impl rule__Configurator__Group_5_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1221:2: rule__Configurator__Group_5_3__0__Impl rule__Configurator__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5_3__0__Impl_in_rule__Configurator__Group_5_3__02441);
            rule__Configurator__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5_3__1_in_rule__Configurator__Group_5_3__02444);
            rule__Configurator__Group_5_3__1();

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
    // $ANTLR end "rule__Configurator__Group_5_3__0"


    // $ANTLR start "rule__Configurator__Group_5_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1228:1: rule__Configurator__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Configurator__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1232:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1233:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1233:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1234:1: ','
            {
             before(grammarAccess.getConfiguratorAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Configurator__Group_5_3__0__Impl2472); 
             after(grammarAccess.getConfiguratorAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Configurator__Group_5_3__0__Impl"


    // $ANTLR start "rule__Configurator__Group_5_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1247:1: rule__Configurator__Group_5_3__1 : rule__Configurator__Group_5_3__1__Impl ;
    public final void rule__Configurator__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1251:1: ( rule__Configurator__Group_5_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1252:2: rule__Configurator__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__Group_5_3__1__Impl_in_rule__Configurator__Group_5_3__12503);
            rule__Configurator__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Configurator__Group_5_3__1"


    // $ANTLR start "rule__Configurator__Group_5_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1258:1: rule__Configurator__Group_5_3__1__Impl : ( ( rule__Configurator__GroupsAssignment_5_3_1 ) ) ;
    public final void rule__Configurator__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1262:1: ( ( ( rule__Configurator__GroupsAssignment_5_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1263:1: ( ( rule__Configurator__GroupsAssignment_5_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1263:1: ( ( rule__Configurator__GroupsAssignment_5_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1264:1: ( rule__Configurator__GroupsAssignment_5_3_1 )
            {
             before(grammarAccess.getConfiguratorAccess().getGroupsAssignment_5_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1265:1: ( rule__Configurator__GroupsAssignment_5_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1265:2: rule__Configurator__GroupsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configurator__GroupsAssignment_5_3_1_in_rule__Configurator__Group_5_3__1__Impl2530);
            rule__Configurator__GroupsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguratorAccess().getGroupsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Configurator__Group_5_3__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1279:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1283:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1284:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__02564);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__02567);
            rule__Group__Group__1();

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
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1291:1: rule__Group__Group__0__Impl : ( ( rule__Group__GroupTypeAssignment_0 ) ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1295:1: ( ( ( rule__Group__GroupTypeAssignment_0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1296:1: ( ( rule__Group__GroupTypeAssignment_0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1296:1: ( ( rule__Group__GroupTypeAssignment_0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1297:1: ( rule__Group__GroupTypeAssignment_0 )
            {
             before(grammarAccess.getGroupAccess().getGroupTypeAssignment_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1298:1: ( rule__Group__GroupTypeAssignment_0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1298:2: rule__Group__GroupTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupTypeAssignment_0_in_rule__Group__Group__0__Impl2594);
            rule__Group__GroupTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroupTypeAssignment_0()); 

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
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1308:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1312:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1313:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__12624);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__12627);
            rule__Group__Group__2();

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
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1320:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1324:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1325:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1325:1: ( ( rule__Group__NameAssignment_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1326:1: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1327:1: ( rule__Group__NameAssignment_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1327:2: rule__Group__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl2654);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1337:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1341:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1342:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__22684);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__22687);
            rule__Group__Group__3();

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
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1349:1: rule__Group__Group__2__Impl : ( '{' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1353:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1354:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1354:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1355:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Group__Group__2__Impl2715); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1368:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1372:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1373:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__32746);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__32749);
            rule__Group__Group__4();

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
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1380:1: rule__Group__Group__3__Impl : ( ( rule__Group__FeaturesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1384:1: ( ( ( rule__Group__FeaturesAssignment_3 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1385:1: ( ( rule__Group__FeaturesAssignment_3 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1385:1: ( ( rule__Group__FeaturesAssignment_3 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1386:1: ( rule__Group__FeaturesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getFeaturesAssignment_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1387:1: ( rule__Group__FeaturesAssignment_3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1387:2: rule__Group__FeaturesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__FeaturesAssignment_3_in_rule__Group__Group__3__Impl2776);
            rule__Group__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getFeaturesAssignment_3()); 

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
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1397:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1401:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1402:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__42806);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5_in_rule__Group__Group__42809);
            rule__Group__Group__5();

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
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1409:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1413:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1414:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1414:1: ( ( rule__Group__Group_4__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1415:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1416:1: ( rule__Group__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1416:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl2836);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1426:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1430:1: ( rule__Group__Group__5__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1431:2: rule__Group__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__52867);
            rule__Group__Group__5__Impl();

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
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1437:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1441:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1442:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1442:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1443:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Group__Group__5__Impl2895); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1468:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1472:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1473:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__02938);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__02941);
            rule__Group__Group_4__1();

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
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1480:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1484:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1485:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1485:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1486:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Group__Group_4__0__Impl2969); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1499:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1503:1: ( rule__Group__Group_4__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1504:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__13000);
            rule__Group__Group_4__1__Impl();

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
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1510:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__FeaturesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1514:1: ( ( ( rule__Group__FeaturesAssignment_4_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1515:1: ( ( rule__Group__FeaturesAssignment_4_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1515:1: ( ( rule__Group__FeaturesAssignment_4_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1516:1: ( rule__Group__FeaturesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getFeaturesAssignment_4_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1517:1: ( rule__Group__FeaturesAssignment_4_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1517:2: rule__Group__FeaturesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__FeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl3027);
            rule__Group__FeaturesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getFeaturesAssignment_4_1()); 

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
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1531:1: rule__SimpleFeature__Group__0 : rule__SimpleFeature__Group__0__Impl rule__SimpleFeature__Group__1 ;
    public final void rule__SimpleFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1535:1: ( rule__SimpleFeature__Group__0__Impl rule__SimpleFeature__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1536:2: rule__SimpleFeature__Group__0__Impl rule__SimpleFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__0__Impl_in_rule__SimpleFeature__Group__03061);
            rule__SimpleFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__1_in_rule__SimpleFeature__Group__03064);
            rule__SimpleFeature__Group__1();

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
    // $ANTLR end "rule__SimpleFeature__Group__0"


    // $ANTLR start "rule__SimpleFeature__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1543:1: rule__SimpleFeature__Group__0__Impl : ( () ) ;
    public final void rule__SimpleFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1547:1: ( ( () ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1548:1: ( () )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1548:1: ( () )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1549:1: ()
            {
             before(grammarAccess.getSimpleFeatureAccess().getSimpleFeatureAction_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1550:1: ()
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1552:1: 
            {
            }

             after(grammarAccess.getSimpleFeatureAccess().getSimpleFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFeature__Group__0__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1562:1: rule__SimpleFeature__Group__1 : rule__SimpleFeature__Group__1__Impl rule__SimpleFeature__Group__2 ;
    public final void rule__SimpleFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1566:1: ( rule__SimpleFeature__Group__1__Impl rule__SimpleFeature__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1567:2: rule__SimpleFeature__Group__1__Impl rule__SimpleFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__1__Impl_in_rule__SimpleFeature__Group__13122);
            rule__SimpleFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__2_in_rule__SimpleFeature__Group__13125);
            rule__SimpleFeature__Group__2();

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
    // $ANTLR end "rule__SimpleFeature__Group__1"


    // $ANTLR start "rule__SimpleFeature__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1574:1: rule__SimpleFeature__Group__1__Impl : ( ( rule__SimpleFeature__MandatoryAssignment_1 )? ) ;
    public final void rule__SimpleFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1578:1: ( ( ( rule__SimpleFeature__MandatoryAssignment_1 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1579:1: ( ( rule__SimpleFeature__MandatoryAssignment_1 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1579:1: ( ( rule__SimpleFeature__MandatoryAssignment_1 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1580:1: ( rule__SimpleFeature__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getSimpleFeatureAccess().getMandatoryAssignment_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1581:1: ( rule__SimpleFeature__MandatoryAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1581:2: rule__SimpleFeature__MandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__MandatoryAssignment_1_in_rule__SimpleFeature__Group__1__Impl3152);
                    rule__SimpleFeature__MandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleFeatureAccess().getMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__1__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1591:1: rule__SimpleFeature__Group__2 : rule__SimpleFeature__Group__2__Impl rule__SimpleFeature__Group__3 ;
    public final void rule__SimpleFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1595:1: ( rule__SimpleFeature__Group__2__Impl rule__SimpleFeature__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1596:2: rule__SimpleFeature__Group__2__Impl rule__SimpleFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__2__Impl_in_rule__SimpleFeature__Group__23183);
            rule__SimpleFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__3_in_rule__SimpleFeature__Group__23186);
            rule__SimpleFeature__Group__3();

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
    // $ANTLR end "rule__SimpleFeature__Group__2"


    // $ANTLR start "rule__SimpleFeature__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1603:1: rule__SimpleFeature__Group__2__Impl : ( 'Feature' ) ;
    public final void rule__SimpleFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1607:1: ( ( 'Feature' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1608:1: ( 'Feature' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1608:1: ( 'Feature' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1609:1: 'Feature'
            {
             before(grammarAccess.getSimpleFeatureAccess().getFeatureKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__SimpleFeature__Group__2__Impl3214); 
             after(grammarAccess.getSimpleFeatureAccess().getFeatureKeyword_2()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__2__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1622:1: rule__SimpleFeature__Group__3 : rule__SimpleFeature__Group__3__Impl rule__SimpleFeature__Group__4 ;
    public final void rule__SimpleFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1626:1: ( rule__SimpleFeature__Group__3__Impl rule__SimpleFeature__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1627:2: rule__SimpleFeature__Group__3__Impl rule__SimpleFeature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__3__Impl_in_rule__SimpleFeature__Group__33245);
            rule__SimpleFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__4_in_rule__SimpleFeature__Group__33248);
            rule__SimpleFeature__Group__4();

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
    // $ANTLR end "rule__SimpleFeature__Group__3"


    // $ANTLR start "rule__SimpleFeature__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1634:1: rule__SimpleFeature__Group__3__Impl : ( ( rule__SimpleFeature__NameAssignment_3 ) ) ;
    public final void rule__SimpleFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1638:1: ( ( ( rule__SimpleFeature__NameAssignment_3 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1639:1: ( ( rule__SimpleFeature__NameAssignment_3 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1639:1: ( ( rule__SimpleFeature__NameAssignment_3 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1640:1: ( rule__SimpleFeature__NameAssignment_3 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getNameAssignment_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1641:1: ( rule__SimpleFeature__NameAssignment_3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1641:2: rule__SimpleFeature__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__NameAssignment_3_in_rule__SimpleFeature__Group__3__Impl3275);
            rule__SimpleFeature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__3__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1651:1: rule__SimpleFeature__Group__4 : rule__SimpleFeature__Group__4__Impl rule__SimpleFeature__Group__5 ;
    public final void rule__SimpleFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1655:1: ( rule__SimpleFeature__Group__4__Impl rule__SimpleFeature__Group__5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1656:2: rule__SimpleFeature__Group__4__Impl rule__SimpleFeature__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__4__Impl_in_rule__SimpleFeature__Group__43305);
            rule__SimpleFeature__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__5_in_rule__SimpleFeature__Group__43308);
            rule__SimpleFeature__Group__5();

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
    // $ANTLR end "rule__SimpleFeature__Group__4"


    // $ANTLR start "rule__SimpleFeature__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1663:1: rule__SimpleFeature__Group__4__Impl : ( '{' ) ;
    public final void rule__SimpleFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1667:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1668:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1668:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1669:1: '{'
            {
             before(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__SimpleFeature__Group__4__Impl3336); 
             after(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__4__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1682:1: rule__SimpleFeature__Group__5 : rule__SimpleFeature__Group__5__Impl rule__SimpleFeature__Group__6 ;
    public final void rule__SimpleFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1686:1: ( rule__SimpleFeature__Group__5__Impl rule__SimpleFeature__Group__6 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1687:2: rule__SimpleFeature__Group__5__Impl rule__SimpleFeature__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__5__Impl_in_rule__SimpleFeature__Group__53367);
            rule__SimpleFeature__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__6_in_rule__SimpleFeature__Group__53370);
            rule__SimpleFeature__Group__6();

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
    // $ANTLR end "rule__SimpleFeature__Group__5"


    // $ANTLR start "rule__SimpleFeature__Group__5__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1694:1: rule__SimpleFeature__Group__5__Impl : ( ( rule__SimpleFeature__Group_5__0 )? ) ;
    public final void rule__SimpleFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1698:1: ( ( ( rule__SimpleFeature__Group_5__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1699:1: ( ( rule__SimpleFeature__Group_5__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1699:1: ( ( rule__SimpleFeature__Group_5__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1700:1: ( rule__SimpleFeature__Group_5__0 )?
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroup_5()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1701:1: ( rule__SimpleFeature__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1701:2: rule__SimpleFeature__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__0_in_rule__SimpleFeature__Group__5__Impl3397);
                    rule__SimpleFeature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleFeatureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__5__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__6"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1711:1: rule__SimpleFeature__Group__6 : rule__SimpleFeature__Group__6__Impl rule__SimpleFeature__Group__7 ;
    public final void rule__SimpleFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1715:1: ( rule__SimpleFeature__Group__6__Impl rule__SimpleFeature__Group__7 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1716:2: rule__SimpleFeature__Group__6__Impl rule__SimpleFeature__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__6__Impl_in_rule__SimpleFeature__Group__63428);
            rule__SimpleFeature__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__7_in_rule__SimpleFeature__Group__63431);
            rule__SimpleFeature__Group__7();

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
    // $ANTLR end "rule__SimpleFeature__Group__6"


    // $ANTLR start "rule__SimpleFeature__Group__6__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1723:1: rule__SimpleFeature__Group__6__Impl : ( ( rule__SimpleFeature__Group_6__0 )? ) ;
    public final void rule__SimpleFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1727:1: ( ( ( rule__SimpleFeature__Group_6__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1728:1: ( ( rule__SimpleFeature__Group_6__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1728:1: ( ( rule__SimpleFeature__Group_6__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1729:1: ( rule__SimpleFeature__Group_6__0 )?
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroup_6()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1730:1: ( rule__SimpleFeature__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1730:2: rule__SimpleFeature__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__0_in_rule__SimpleFeature__Group__6__Impl3458);
                    rule__SimpleFeature__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleFeatureAccess().getGroup_6()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__6__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__7"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1740:1: rule__SimpleFeature__Group__7 : rule__SimpleFeature__Group__7__Impl rule__SimpleFeature__Group__8 ;
    public final void rule__SimpleFeature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1744:1: ( rule__SimpleFeature__Group__7__Impl rule__SimpleFeature__Group__8 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1745:2: rule__SimpleFeature__Group__7__Impl rule__SimpleFeature__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__7__Impl_in_rule__SimpleFeature__Group__73489);
            rule__SimpleFeature__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__8_in_rule__SimpleFeature__Group__73492);
            rule__SimpleFeature__Group__8();

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
    // $ANTLR end "rule__SimpleFeature__Group__7"


    // $ANTLR start "rule__SimpleFeature__Group__7__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1752:1: rule__SimpleFeature__Group__7__Impl : ( ( rule__SimpleFeature__Group_7__0 )? ) ;
    public final void rule__SimpleFeature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1756:1: ( ( ( rule__SimpleFeature__Group_7__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1757:1: ( ( rule__SimpleFeature__Group_7__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1757:1: ( ( rule__SimpleFeature__Group_7__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1758:1: ( rule__SimpleFeature__Group_7__0 )?
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroup_7()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1759:1: ( rule__SimpleFeature__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1759:2: rule__SimpleFeature__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__0_in_rule__SimpleFeature__Group__7__Impl3519);
                    rule__SimpleFeature__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleFeatureAccess().getGroup_7()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__7__Impl"


    // $ANTLR start "rule__SimpleFeature__Group__8"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1769:1: rule__SimpleFeature__Group__8 : rule__SimpleFeature__Group__8__Impl ;
    public final void rule__SimpleFeature__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1773:1: ( rule__SimpleFeature__Group__8__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1774:2: rule__SimpleFeature__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group__8__Impl_in_rule__SimpleFeature__Group__83550);
            rule__SimpleFeature__Group__8__Impl();

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
    // $ANTLR end "rule__SimpleFeature__Group__8"


    // $ANTLR start "rule__SimpleFeature__Group__8__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1780:1: rule__SimpleFeature__Group__8__Impl : ( '}' ) ;
    public final void rule__SimpleFeature__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1784:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1785:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1785:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1786:1: '}'
            {
             before(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__SimpleFeature__Group__8__Impl3578); 
             after(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__SimpleFeature__Group__8__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_5__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1817:1: rule__SimpleFeature__Group_5__0 : rule__SimpleFeature__Group_5__0__Impl rule__SimpleFeature__Group_5__1 ;
    public final void rule__SimpleFeature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1821:1: ( rule__SimpleFeature__Group_5__0__Impl rule__SimpleFeature__Group_5__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1822:2: rule__SimpleFeature__Group_5__0__Impl rule__SimpleFeature__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__0__Impl_in_rule__SimpleFeature__Group_5__03627);
            rule__SimpleFeature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__1_in_rule__SimpleFeature__Group_5__03630);
            rule__SimpleFeature__Group_5__1();

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
    // $ANTLR end "rule__SimpleFeature__Group_5__0"


    // $ANTLR start "rule__SimpleFeature__Group_5__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1829:1: rule__SimpleFeature__Group_5__0__Impl : ( 'dependencies' ) ;
    public final void rule__SimpleFeature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1833:1: ( ( 'dependencies' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1834:1: ( 'dependencies' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1834:1: ( 'dependencies' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1835:1: 'dependencies'
            {
             before(grammarAccess.getSimpleFeatureAccess().getDependenciesKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SimpleFeature__Group_5__0__Impl3658); 
             after(grammarAccess.getSimpleFeatureAccess().getDependenciesKeyword_5_0()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_5__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1848:1: rule__SimpleFeature__Group_5__1 : rule__SimpleFeature__Group_5__1__Impl rule__SimpleFeature__Group_5__2 ;
    public final void rule__SimpleFeature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1852:1: ( rule__SimpleFeature__Group_5__1__Impl rule__SimpleFeature__Group_5__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1853:2: rule__SimpleFeature__Group_5__1__Impl rule__SimpleFeature__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__1__Impl_in_rule__SimpleFeature__Group_5__13689);
            rule__SimpleFeature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__2_in_rule__SimpleFeature__Group_5__13692);
            rule__SimpleFeature__Group_5__2();

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
    // $ANTLR end "rule__SimpleFeature__Group_5__1"


    // $ANTLR start "rule__SimpleFeature__Group_5__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1860:1: rule__SimpleFeature__Group_5__1__Impl : ( '{' ) ;
    public final void rule__SimpleFeature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1864:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1865:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1865:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1866:1: '{'
            {
             before(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__SimpleFeature__Group_5__1__Impl3720); 
             after(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_5__1__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_5__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1879:1: rule__SimpleFeature__Group_5__2 : rule__SimpleFeature__Group_5__2__Impl rule__SimpleFeature__Group_5__3 ;
    public final void rule__SimpleFeature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1883:1: ( rule__SimpleFeature__Group_5__2__Impl rule__SimpleFeature__Group_5__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1884:2: rule__SimpleFeature__Group_5__2__Impl rule__SimpleFeature__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__2__Impl_in_rule__SimpleFeature__Group_5__23751);
            rule__SimpleFeature__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__3_in_rule__SimpleFeature__Group_5__23754);
            rule__SimpleFeature__Group_5__3();

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
    // $ANTLR end "rule__SimpleFeature__Group_5__2"


    // $ANTLR start "rule__SimpleFeature__Group_5__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1891:1: rule__SimpleFeature__Group_5__2__Impl : ( ( rule__SimpleFeature__DependenciesAssignment_5_2 ) ) ;
    public final void rule__SimpleFeature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1895:1: ( ( ( rule__SimpleFeature__DependenciesAssignment_5_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1896:1: ( ( rule__SimpleFeature__DependenciesAssignment_5_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1896:1: ( ( rule__SimpleFeature__DependenciesAssignment_5_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1897:1: ( rule__SimpleFeature__DependenciesAssignment_5_2 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getDependenciesAssignment_5_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1898:1: ( rule__SimpleFeature__DependenciesAssignment_5_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1898:2: rule__SimpleFeature__DependenciesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__DependenciesAssignment_5_2_in_rule__SimpleFeature__Group_5__2__Impl3781);
            rule__SimpleFeature__DependenciesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getDependenciesAssignment_5_2()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_5__2__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_5__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1908:1: rule__SimpleFeature__Group_5__3 : rule__SimpleFeature__Group_5__3__Impl rule__SimpleFeature__Group_5__4 ;
    public final void rule__SimpleFeature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1912:1: ( rule__SimpleFeature__Group_5__3__Impl rule__SimpleFeature__Group_5__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1913:2: rule__SimpleFeature__Group_5__3__Impl rule__SimpleFeature__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__3__Impl_in_rule__SimpleFeature__Group_5__33811);
            rule__SimpleFeature__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__4_in_rule__SimpleFeature__Group_5__33814);
            rule__SimpleFeature__Group_5__4();

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
    // $ANTLR end "rule__SimpleFeature__Group_5__3"


    // $ANTLR start "rule__SimpleFeature__Group_5__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1920:1: rule__SimpleFeature__Group_5__3__Impl : ( ( rule__SimpleFeature__Group_5_3__0 )* ) ;
    public final void rule__SimpleFeature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1924:1: ( ( ( rule__SimpleFeature__Group_5_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1925:1: ( ( rule__SimpleFeature__Group_5_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1925:1: ( ( rule__SimpleFeature__Group_5_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1926:1: ( rule__SimpleFeature__Group_5_3__0 )*
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroup_5_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1927:1: ( rule__SimpleFeature__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1927:2: rule__SimpleFeature__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5_3__0_in_rule__SimpleFeature__Group_5__3__Impl3841);
            	    rule__SimpleFeature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSimpleFeatureAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_5__3__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_5__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1937:1: rule__SimpleFeature__Group_5__4 : rule__SimpleFeature__Group_5__4__Impl ;
    public final void rule__SimpleFeature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1941:1: ( rule__SimpleFeature__Group_5__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1942:2: rule__SimpleFeature__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5__4__Impl_in_rule__SimpleFeature__Group_5__43872);
            rule__SimpleFeature__Group_5__4__Impl();

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
    // $ANTLR end "rule__SimpleFeature__Group_5__4"


    // $ANTLR start "rule__SimpleFeature__Group_5__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1948:1: rule__SimpleFeature__Group_5__4__Impl : ( '}' ) ;
    public final void rule__SimpleFeature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1952:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1953:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1953:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1954:1: '}'
            {
             before(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__SimpleFeature__Group_5__4__Impl3900); 
             after(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_5__4__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_5_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1977:1: rule__SimpleFeature__Group_5_3__0 : rule__SimpleFeature__Group_5_3__0__Impl rule__SimpleFeature__Group_5_3__1 ;
    public final void rule__SimpleFeature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1981:1: ( rule__SimpleFeature__Group_5_3__0__Impl rule__SimpleFeature__Group_5_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1982:2: rule__SimpleFeature__Group_5_3__0__Impl rule__SimpleFeature__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5_3__0__Impl_in_rule__SimpleFeature__Group_5_3__03941);
            rule__SimpleFeature__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5_3__1_in_rule__SimpleFeature__Group_5_3__03944);
            rule__SimpleFeature__Group_5_3__1();

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
    // $ANTLR end "rule__SimpleFeature__Group_5_3__0"


    // $ANTLR start "rule__SimpleFeature__Group_5_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1989:1: rule__SimpleFeature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleFeature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1993:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1994:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1994:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:1995:1: ','
            {
             before(grammarAccess.getSimpleFeatureAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleFeature__Group_5_3__0__Impl3972); 
             after(grammarAccess.getSimpleFeatureAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_5_3__0__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_5_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2008:1: rule__SimpleFeature__Group_5_3__1 : rule__SimpleFeature__Group_5_3__1__Impl ;
    public final void rule__SimpleFeature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2012:1: ( rule__SimpleFeature__Group_5_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2013:2: rule__SimpleFeature__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_5_3__1__Impl_in_rule__SimpleFeature__Group_5_3__14003);
            rule__SimpleFeature__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__SimpleFeature__Group_5_3__1"


    // $ANTLR start "rule__SimpleFeature__Group_5_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2019:1: rule__SimpleFeature__Group_5_3__1__Impl : ( ( rule__SimpleFeature__DependenciesAssignment_5_3_1 ) ) ;
    public final void rule__SimpleFeature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2023:1: ( ( ( rule__SimpleFeature__DependenciesAssignment_5_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2024:1: ( ( rule__SimpleFeature__DependenciesAssignment_5_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2024:1: ( ( rule__SimpleFeature__DependenciesAssignment_5_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2025:1: ( rule__SimpleFeature__DependenciesAssignment_5_3_1 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getDependenciesAssignment_5_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2026:1: ( rule__SimpleFeature__DependenciesAssignment_5_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2026:2: rule__SimpleFeature__DependenciesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__DependenciesAssignment_5_3_1_in_rule__SimpleFeature__Group_5_3__1__Impl4030);
            rule__SimpleFeature__DependenciesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getDependenciesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_5_3__1__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_6__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2040:1: rule__SimpleFeature__Group_6__0 : rule__SimpleFeature__Group_6__0__Impl rule__SimpleFeature__Group_6__1 ;
    public final void rule__SimpleFeature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2044:1: ( rule__SimpleFeature__Group_6__0__Impl rule__SimpleFeature__Group_6__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2045:2: rule__SimpleFeature__Group_6__0__Impl rule__SimpleFeature__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__0__Impl_in_rule__SimpleFeature__Group_6__04064);
            rule__SimpleFeature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__1_in_rule__SimpleFeature__Group_6__04067);
            rule__SimpleFeature__Group_6__1();

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
    // $ANTLR end "rule__SimpleFeature__Group_6__0"


    // $ANTLR start "rule__SimpleFeature__Group_6__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2052:1: rule__SimpleFeature__Group_6__0__Impl : ( 'features' ) ;
    public final void rule__SimpleFeature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2056:1: ( ( 'features' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2057:1: ( 'features' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2057:1: ( 'features' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2058:1: 'features'
            {
             before(grammarAccess.getSimpleFeatureAccess().getFeaturesKeyword_6_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__SimpleFeature__Group_6__0__Impl4095); 
             after(grammarAccess.getSimpleFeatureAccess().getFeaturesKeyword_6_0()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_6__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2071:1: rule__SimpleFeature__Group_6__1 : rule__SimpleFeature__Group_6__1__Impl rule__SimpleFeature__Group_6__2 ;
    public final void rule__SimpleFeature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2075:1: ( rule__SimpleFeature__Group_6__1__Impl rule__SimpleFeature__Group_6__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2076:2: rule__SimpleFeature__Group_6__1__Impl rule__SimpleFeature__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__1__Impl_in_rule__SimpleFeature__Group_6__14126);
            rule__SimpleFeature__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__2_in_rule__SimpleFeature__Group_6__14129);
            rule__SimpleFeature__Group_6__2();

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
    // $ANTLR end "rule__SimpleFeature__Group_6__1"


    // $ANTLR start "rule__SimpleFeature__Group_6__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2083:1: rule__SimpleFeature__Group_6__1__Impl : ( '{' ) ;
    public final void rule__SimpleFeature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2087:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2088:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2088:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2089:1: '{'
            {
             before(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__SimpleFeature__Group_6__1__Impl4157); 
             after(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_6__1__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_6__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2102:1: rule__SimpleFeature__Group_6__2 : rule__SimpleFeature__Group_6__2__Impl rule__SimpleFeature__Group_6__3 ;
    public final void rule__SimpleFeature__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2106:1: ( rule__SimpleFeature__Group_6__2__Impl rule__SimpleFeature__Group_6__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2107:2: rule__SimpleFeature__Group_6__2__Impl rule__SimpleFeature__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__2__Impl_in_rule__SimpleFeature__Group_6__24188);
            rule__SimpleFeature__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__3_in_rule__SimpleFeature__Group_6__24191);
            rule__SimpleFeature__Group_6__3();

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
    // $ANTLR end "rule__SimpleFeature__Group_6__2"


    // $ANTLR start "rule__SimpleFeature__Group_6__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2114:1: rule__SimpleFeature__Group_6__2__Impl : ( ( rule__SimpleFeature__FeaturesAssignment_6_2 ) ) ;
    public final void rule__SimpleFeature__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2118:1: ( ( ( rule__SimpleFeature__FeaturesAssignment_6_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2119:1: ( ( rule__SimpleFeature__FeaturesAssignment_6_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2119:1: ( ( rule__SimpleFeature__FeaturesAssignment_6_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2120:1: ( rule__SimpleFeature__FeaturesAssignment_6_2 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getFeaturesAssignment_6_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2121:1: ( rule__SimpleFeature__FeaturesAssignment_6_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2121:2: rule__SimpleFeature__FeaturesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__FeaturesAssignment_6_2_in_rule__SimpleFeature__Group_6__2__Impl4218);
            rule__SimpleFeature__FeaturesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getFeaturesAssignment_6_2()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_6__2__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_6__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2131:1: rule__SimpleFeature__Group_6__3 : rule__SimpleFeature__Group_6__3__Impl rule__SimpleFeature__Group_6__4 ;
    public final void rule__SimpleFeature__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2135:1: ( rule__SimpleFeature__Group_6__3__Impl rule__SimpleFeature__Group_6__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2136:2: rule__SimpleFeature__Group_6__3__Impl rule__SimpleFeature__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__3__Impl_in_rule__SimpleFeature__Group_6__34248);
            rule__SimpleFeature__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__4_in_rule__SimpleFeature__Group_6__34251);
            rule__SimpleFeature__Group_6__4();

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
    // $ANTLR end "rule__SimpleFeature__Group_6__3"


    // $ANTLR start "rule__SimpleFeature__Group_6__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2143:1: rule__SimpleFeature__Group_6__3__Impl : ( ( rule__SimpleFeature__Group_6_3__0 )* ) ;
    public final void rule__SimpleFeature__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2147:1: ( ( ( rule__SimpleFeature__Group_6_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2148:1: ( ( rule__SimpleFeature__Group_6_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2148:1: ( ( rule__SimpleFeature__Group_6_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2149:1: ( rule__SimpleFeature__Group_6_3__0 )*
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroup_6_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2150:1: ( rule__SimpleFeature__Group_6_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2150:2: rule__SimpleFeature__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6_3__0_in_rule__SimpleFeature__Group_6__3__Impl4278);
            	    rule__SimpleFeature__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSimpleFeatureAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_6__3__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_6__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2160:1: rule__SimpleFeature__Group_6__4 : rule__SimpleFeature__Group_6__4__Impl ;
    public final void rule__SimpleFeature__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2164:1: ( rule__SimpleFeature__Group_6__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2165:2: rule__SimpleFeature__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6__4__Impl_in_rule__SimpleFeature__Group_6__44309);
            rule__SimpleFeature__Group_6__4__Impl();

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
    // $ANTLR end "rule__SimpleFeature__Group_6__4"


    // $ANTLR start "rule__SimpleFeature__Group_6__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2171:1: rule__SimpleFeature__Group_6__4__Impl : ( '}' ) ;
    public final void rule__SimpleFeature__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2175:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2176:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2176:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2177:1: '}'
            {
             before(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__SimpleFeature__Group_6__4__Impl4337); 
             after(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_6__4__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_6_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2200:1: rule__SimpleFeature__Group_6_3__0 : rule__SimpleFeature__Group_6_3__0__Impl rule__SimpleFeature__Group_6_3__1 ;
    public final void rule__SimpleFeature__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2204:1: ( rule__SimpleFeature__Group_6_3__0__Impl rule__SimpleFeature__Group_6_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2205:2: rule__SimpleFeature__Group_6_3__0__Impl rule__SimpleFeature__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6_3__0__Impl_in_rule__SimpleFeature__Group_6_3__04378);
            rule__SimpleFeature__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6_3__1_in_rule__SimpleFeature__Group_6_3__04381);
            rule__SimpleFeature__Group_6_3__1();

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
    // $ANTLR end "rule__SimpleFeature__Group_6_3__0"


    // $ANTLR start "rule__SimpleFeature__Group_6_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2212:1: rule__SimpleFeature__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleFeature__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2216:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2217:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2217:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2218:1: ','
            {
             before(grammarAccess.getSimpleFeatureAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleFeature__Group_6_3__0__Impl4409); 
             after(grammarAccess.getSimpleFeatureAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_6_3__0__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_6_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2231:1: rule__SimpleFeature__Group_6_3__1 : rule__SimpleFeature__Group_6_3__1__Impl ;
    public final void rule__SimpleFeature__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2235:1: ( rule__SimpleFeature__Group_6_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2236:2: rule__SimpleFeature__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_6_3__1__Impl_in_rule__SimpleFeature__Group_6_3__14440);
            rule__SimpleFeature__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__SimpleFeature__Group_6_3__1"


    // $ANTLR start "rule__SimpleFeature__Group_6_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2242:1: rule__SimpleFeature__Group_6_3__1__Impl : ( ( rule__SimpleFeature__FeaturesAssignment_6_3_1 ) ) ;
    public final void rule__SimpleFeature__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2246:1: ( ( ( rule__SimpleFeature__FeaturesAssignment_6_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2247:1: ( ( rule__SimpleFeature__FeaturesAssignment_6_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2247:1: ( ( rule__SimpleFeature__FeaturesAssignment_6_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2248:1: ( rule__SimpleFeature__FeaturesAssignment_6_3_1 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getFeaturesAssignment_6_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2249:1: ( rule__SimpleFeature__FeaturesAssignment_6_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2249:2: rule__SimpleFeature__FeaturesAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__FeaturesAssignment_6_3_1_in_rule__SimpleFeature__Group_6_3__1__Impl4467);
            rule__SimpleFeature__FeaturesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getFeaturesAssignment_6_3_1()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_6_3__1__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_7__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2263:1: rule__SimpleFeature__Group_7__0 : rule__SimpleFeature__Group_7__0__Impl rule__SimpleFeature__Group_7__1 ;
    public final void rule__SimpleFeature__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2267:1: ( rule__SimpleFeature__Group_7__0__Impl rule__SimpleFeature__Group_7__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2268:2: rule__SimpleFeature__Group_7__0__Impl rule__SimpleFeature__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__0__Impl_in_rule__SimpleFeature__Group_7__04501);
            rule__SimpleFeature__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__1_in_rule__SimpleFeature__Group_7__04504);
            rule__SimpleFeature__Group_7__1();

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
    // $ANTLR end "rule__SimpleFeature__Group_7__0"


    // $ANTLR start "rule__SimpleFeature__Group_7__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2275:1: rule__SimpleFeature__Group_7__0__Impl : ( 'groups' ) ;
    public final void rule__SimpleFeature__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2279:1: ( ( 'groups' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2280:1: ( 'groups' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2280:1: ( 'groups' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2281:1: 'groups'
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroupsKeyword_7_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__SimpleFeature__Group_7__0__Impl4532); 
             after(grammarAccess.getSimpleFeatureAccess().getGroupsKeyword_7_0()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_7__0__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_7__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2294:1: rule__SimpleFeature__Group_7__1 : rule__SimpleFeature__Group_7__1__Impl rule__SimpleFeature__Group_7__2 ;
    public final void rule__SimpleFeature__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2298:1: ( rule__SimpleFeature__Group_7__1__Impl rule__SimpleFeature__Group_7__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2299:2: rule__SimpleFeature__Group_7__1__Impl rule__SimpleFeature__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__1__Impl_in_rule__SimpleFeature__Group_7__14563);
            rule__SimpleFeature__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__2_in_rule__SimpleFeature__Group_7__14566);
            rule__SimpleFeature__Group_7__2();

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
    // $ANTLR end "rule__SimpleFeature__Group_7__1"


    // $ANTLR start "rule__SimpleFeature__Group_7__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2306:1: rule__SimpleFeature__Group_7__1__Impl : ( '{' ) ;
    public final void rule__SimpleFeature__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2310:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2311:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2311:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2312:1: '{'
            {
             before(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__SimpleFeature__Group_7__1__Impl4594); 
             after(grammarAccess.getSimpleFeatureAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_7__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2325:1: rule__SimpleFeature__Group_7__2 : rule__SimpleFeature__Group_7__2__Impl rule__SimpleFeature__Group_7__3 ;
    public final void rule__SimpleFeature__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2329:1: ( rule__SimpleFeature__Group_7__2__Impl rule__SimpleFeature__Group_7__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2330:2: rule__SimpleFeature__Group_7__2__Impl rule__SimpleFeature__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__2__Impl_in_rule__SimpleFeature__Group_7__24625);
            rule__SimpleFeature__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__3_in_rule__SimpleFeature__Group_7__24628);
            rule__SimpleFeature__Group_7__3();

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
    // $ANTLR end "rule__SimpleFeature__Group_7__2"


    // $ANTLR start "rule__SimpleFeature__Group_7__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2337:1: rule__SimpleFeature__Group_7__2__Impl : ( ( rule__SimpleFeature__GroupsAssignment_7_2 ) ) ;
    public final void rule__SimpleFeature__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2341:1: ( ( ( rule__SimpleFeature__GroupsAssignment_7_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2342:1: ( ( rule__SimpleFeature__GroupsAssignment_7_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2342:1: ( ( rule__SimpleFeature__GroupsAssignment_7_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2343:1: ( rule__SimpleFeature__GroupsAssignment_7_2 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroupsAssignment_7_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2344:1: ( rule__SimpleFeature__GroupsAssignment_7_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2344:2: rule__SimpleFeature__GroupsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__GroupsAssignment_7_2_in_rule__SimpleFeature__Group_7__2__Impl4655);
            rule__SimpleFeature__GroupsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getGroupsAssignment_7_2()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_7__2__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_7__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2354:1: rule__SimpleFeature__Group_7__3 : rule__SimpleFeature__Group_7__3__Impl rule__SimpleFeature__Group_7__4 ;
    public final void rule__SimpleFeature__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2358:1: ( rule__SimpleFeature__Group_7__3__Impl rule__SimpleFeature__Group_7__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2359:2: rule__SimpleFeature__Group_7__3__Impl rule__SimpleFeature__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__3__Impl_in_rule__SimpleFeature__Group_7__34685);
            rule__SimpleFeature__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__4_in_rule__SimpleFeature__Group_7__34688);
            rule__SimpleFeature__Group_7__4();

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
    // $ANTLR end "rule__SimpleFeature__Group_7__3"


    // $ANTLR start "rule__SimpleFeature__Group_7__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2366:1: rule__SimpleFeature__Group_7__3__Impl : ( ( rule__SimpleFeature__Group_7_3__0 )* ) ;
    public final void rule__SimpleFeature__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2370:1: ( ( ( rule__SimpleFeature__Group_7_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2371:1: ( ( rule__SimpleFeature__Group_7_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2371:1: ( ( rule__SimpleFeature__Group_7_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2372:1: ( rule__SimpleFeature__Group_7_3__0 )*
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroup_7_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2373:1: ( rule__SimpleFeature__Group_7_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2373:2: rule__SimpleFeature__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7_3__0_in_rule__SimpleFeature__Group_7__3__Impl4715);
            	    rule__SimpleFeature__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSimpleFeatureAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_7__3__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_7__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2383:1: rule__SimpleFeature__Group_7__4 : rule__SimpleFeature__Group_7__4__Impl ;
    public final void rule__SimpleFeature__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2387:1: ( rule__SimpleFeature__Group_7__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2388:2: rule__SimpleFeature__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7__4__Impl_in_rule__SimpleFeature__Group_7__44746);
            rule__SimpleFeature__Group_7__4__Impl();

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
    // $ANTLR end "rule__SimpleFeature__Group_7__4"


    // $ANTLR start "rule__SimpleFeature__Group_7__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2394:1: rule__SimpleFeature__Group_7__4__Impl : ( '}' ) ;
    public final void rule__SimpleFeature__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2398:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2399:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2399:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2400:1: '}'
            {
             before(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__SimpleFeature__Group_7__4__Impl4774); 
             after(grammarAccess.getSimpleFeatureAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_7__4__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_7_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2423:1: rule__SimpleFeature__Group_7_3__0 : rule__SimpleFeature__Group_7_3__0__Impl rule__SimpleFeature__Group_7_3__1 ;
    public final void rule__SimpleFeature__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2427:1: ( rule__SimpleFeature__Group_7_3__0__Impl rule__SimpleFeature__Group_7_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2428:2: rule__SimpleFeature__Group_7_3__0__Impl rule__SimpleFeature__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7_3__0__Impl_in_rule__SimpleFeature__Group_7_3__04815);
            rule__SimpleFeature__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7_3__1_in_rule__SimpleFeature__Group_7_3__04818);
            rule__SimpleFeature__Group_7_3__1();

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
    // $ANTLR end "rule__SimpleFeature__Group_7_3__0"


    // $ANTLR start "rule__SimpleFeature__Group_7_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2435:1: rule__SimpleFeature__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleFeature__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2439:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2440:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2440:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2441:1: ','
            {
             before(grammarAccess.getSimpleFeatureAccess().getCommaKeyword_7_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleFeature__Group_7_3__0__Impl4846); 
             after(grammarAccess.getSimpleFeatureAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_7_3__0__Impl"


    // $ANTLR start "rule__SimpleFeature__Group_7_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2454:1: rule__SimpleFeature__Group_7_3__1 : rule__SimpleFeature__Group_7_3__1__Impl ;
    public final void rule__SimpleFeature__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2458:1: ( rule__SimpleFeature__Group_7_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2459:2: rule__SimpleFeature__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__Group_7_3__1__Impl_in_rule__SimpleFeature__Group_7_3__14877);
            rule__SimpleFeature__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__SimpleFeature__Group_7_3__1"


    // $ANTLR start "rule__SimpleFeature__Group_7_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2465:1: rule__SimpleFeature__Group_7_3__1__Impl : ( ( rule__SimpleFeature__GroupsAssignment_7_3_1 ) ) ;
    public final void rule__SimpleFeature__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2469:1: ( ( ( rule__SimpleFeature__GroupsAssignment_7_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2470:1: ( ( rule__SimpleFeature__GroupsAssignment_7_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2470:1: ( ( rule__SimpleFeature__GroupsAssignment_7_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2471:1: ( rule__SimpleFeature__GroupsAssignment_7_3_1 )
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroupsAssignment_7_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2472:1: ( rule__SimpleFeature__GroupsAssignment_7_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2472:2: rule__SimpleFeature__GroupsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleFeature__GroupsAssignment_7_3_1_in_rule__SimpleFeature__Group_7_3__1__Impl4904);
            rule__SimpleFeature__GroupsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFeatureAccess().getGroupsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__SimpleFeature__Group_7_3__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2486:1: rule__IntegerFeature__Group__0 : rule__IntegerFeature__Group__0__Impl rule__IntegerFeature__Group__1 ;
    public final void rule__IntegerFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2490:1: ( rule__IntegerFeature__Group__0__Impl rule__IntegerFeature__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2491:2: rule__IntegerFeature__Group__0__Impl rule__IntegerFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__0__Impl_in_rule__IntegerFeature__Group__04938);
            rule__IntegerFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__1_in_rule__IntegerFeature__Group__04941);
            rule__IntegerFeature__Group__1();

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
    // $ANTLR end "rule__IntegerFeature__Group__0"


    // $ANTLR start "rule__IntegerFeature__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2498:1: rule__IntegerFeature__Group__0__Impl : ( () ) ;
    public final void rule__IntegerFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2502:1: ( ( () ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2503:1: ( () )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2503:1: ( () )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2504:1: ()
            {
             before(grammarAccess.getIntegerFeatureAccess().getIntegerFeatureAction_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2505:1: ()
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2507:1: 
            {
            }

             after(grammarAccess.getIntegerFeatureAccess().getIntegerFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerFeature__Group__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2517:1: rule__IntegerFeature__Group__1 : rule__IntegerFeature__Group__1__Impl rule__IntegerFeature__Group__2 ;
    public final void rule__IntegerFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2521:1: ( rule__IntegerFeature__Group__1__Impl rule__IntegerFeature__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2522:2: rule__IntegerFeature__Group__1__Impl rule__IntegerFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__1__Impl_in_rule__IntegerFeature__Group__14999);
            rule__IntegerFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__2_in_rule__IntegerFeature__Group__15002);
            rule__IntegerFeature__Group__2();

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
    // $ANTLR end "rule__IntegerFeature__Group__1"


    // $ANTLR start "rule__IntegerFeature__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2529:1: rule__IntegerFeature__Group__1__Impl : ( ( rule__IntegerFeature__MandatoryAssignment_1 )? ) ;
    public final void rule__IntegerFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2533:1: ( ( ( rule__IntegerFeature__MandatoryAssignment_1 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2534:1: ( ( rule__IntegerFeature__MandatoryAssignment_1 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2534:1: ( ( rule__IntegerFeature__MandatoryAssignment_1 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2535:1: ( rule__IntegerFeature__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getIntegerFeatureAccess().getMandatoryAssignment_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2536:1: ( rule__IntegerFeature__MandatoryAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2536:2: rule__IntegerFeature__MandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__MandatoryAssignment_1_in_rule__IntegerFeature__Group__1__Impl5029);
                    rule__IntegerFeature__MandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerFeatureAccess().getMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2546:1: rule__IntegerFeature__Group__2 : rule__IntegerFeature__Group__2__Impl rule__IntegerFeature__Group__3 ;
    public final void rule__IntegerFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2550:1: ( rule__IntegerFeature__Group__2__Impl rule__IntegerFeature__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2551:2: rule__IntegerFeature__Group__2__Impl rule__IntegerFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__2__Impl_in_rule__IntegerFeature__Group__25060);
            rule__IntegerFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__3_in_rule__IntegerFeature__Group__25063);
            rule__IntegerFeature__Group__3();

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
    // $ANTLR end "rule__IntegerFeature__Group__2"


    // $ANTLR start "rule__IntegerFeature__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2558:1: rule__IntegerFeature__Group__2__Impl : ( 'Feature' ) ;
    public final void rule__IntegerFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2562:1: ( ( 'Feature' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2563:1: ( 'Feature' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2563:1: ( 'Feature' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2564:1: 'Feature'
            {
             before(grammarAccess.getIntegerFeatureAccess().getFeatureKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__IntegerFeature__Group__2__Impl5091); 
             after(grammarAccess.getIntegerFeatureAccess().getFeatureKeyword_2()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__2__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2577:1: rule__IntegerFeature__Group__3 : rule__IntegerFeature__Group__3__Impl rule__IntegerFeature__Group__4 ;
    public final void rule__IntegerFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2581:1: ( rule__IntegerFeature__Group__3__Impl rule__IntegerFeature__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2582:2: rule__IntegerFeature__Group__3__Impl rule__IntegerFeature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__3__Impl_in_rule__IntegerFeature__Group__35122);
            rule__IntegerFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__4_in_rule__IntegerFeature__Group__35125);
            rule__IntegerFeature__Group__4();

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
    // $ANTLR end "rule__IntegerFeature__Group__3"


    // $ANTLR start "rule__IntegerFeature__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2589:1: rule__IntegerFeature__Group__3__Impl : ( ( rule__IntegerFeature__NameAssignment_3 ) ) ;
    public final void rule__IntegerFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2593:1: ( ( ( rule__IntegerFeature__NameAssignment_3 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2594:1: ( ( rule__IntegerFeature__NameAssignment_3 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2594:1: ( ( rule__IntegerFeature__NameAssignment_3 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2595:1: ( rule__IntegerFeature__NameAssignment_3 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getNameAssignment_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2596:1: ( rule__IntegerFeature__NameAssignment_3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2596:2: rule__IntegerFeature__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__NameAssignment_3_in_rule__IntegerFeature__Group__3__Impl5152);
            rule__IntegerFeature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__3__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2606:1: rule__IntegerFeature__Group__4 : rule__IntegerFeature__Group__4__Impl rule__IntegerFeature__Group__5 ;
    public final void rule__IntegerFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2610:1: ( rule__IntegerFeature__Group__4__Impl rule__IntegerFeature__Group__5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2611:2: rule__IntegerFeature__Group__4__Impl rule__IntegerFeature__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__4__Impl_in_rule__IntegerFeature__Group__45182);
            rule__IntegerFeature__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__5_in_rule__IntegerFeature__Group__45185);
            rule__IntegerFeature__Group__5();

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
    // $ANTLR end "rule__IntegerFeature__Group__4"


    // $ANTLR start "rule__IntegerFeature__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2618:1: rule__IntegerFeature__Group__4__Impl : ( '{' ) ;
    public final void rule__IntegerFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2622:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2623:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2623:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2624:1: '{'
            {
             before(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntegerFeature__Group__4__Impl5213); 
             after(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__4__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2637:1: rule__IntegerFeature__Group__5 : rule__IntegerFeature__Group__5__Impl rule__IntegerFeature__Group__6 ;
    public final void rule__IntegerFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2641:1: ( rule__IntegerFeature__Group__5__Impl rule__IntegerFeature__Group__6 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2642:2: rule__IntegerFeature__Group__5__Impl rule__IntegerFeature__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__5__Impl_in_rule__IntegerFeature__Group__55244);
            rule__IntegerFeature__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__6_in_rule__IntegerFeature__Group__55247);
            rule__IntegerFeature__Group__6();

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
    // $ANTLR end "rule__IntegerFeature__Group__5"


    // $ANTLR start "rule__IntegerFeature__Group__5__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2649:1: rule__IntegerFeature__Group__5__Impl : ( ( rule__IntegerFeature__Group_5__0 ) ) ;
    public final void rule__IntegerFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2653:1: ( ( ( rule__IntegerFeature__Group_5__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2654:1: ( ( rule__IntegerFeature__Group_5__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2654:1: ( ( rule__IntegerFeature__Group_5__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2655:1: ( rule__IntegerFeature__Group_5__0 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_5()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2656:1: ( rule__IntegerFeature__Group_5__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2656:2: rule__IntegerFeature__Group_5__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_5__0_in_rule__IntegerFeature__Group__5__Impl5274);
            rule__IntegerFeature__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__5__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__6"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2666:1: rule__IntegerFeature__Group__6 : rule__IntegerFeature__Group__6__Impl rule__IntegerFeature__Group__7 ;
    public final void rule__IntegerFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2670:1: ( rule__IntegerFeature__Group__6__Impl rule__IntegerFeature__Group__7 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2671:2: rule__IntegerFeature__Group__6__Impl rule__IntegerFeature__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__6__Impl_in_rule__IntegerFeature__Group__65304);
            rule__IntegerFeature__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__7_in_rule__IntegerFeature__Group__65307);
            rule__IntegerFeature__Group__7();

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
    // $ANTLR end "rule__IntegerFeature__Group__6"


    // $ANTLR start "rule__IntegerFeature__Group__6__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2678:1: rule__IntegerFeature__Group__6__Impl : ( ( rule__IntegerFeature__Group_6__0 ) ) ;
    public final void rule__IntegerFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2682:1: ( ( ( rule__IntegerFeature__Group_6__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2683:1: ( ( rule__IntegerFeature__Group_6__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2683:1: ( ( rule__IntegerFeature__Group_6__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2684:1: ( rule__IntegerFeature__Group_6__0 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_6()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2685:1: ( rule__IntegerFeature__Group_6__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2685:2: rule__IntegerFeature__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_6__0_in_rule__IntegerFeature__Group__6__Impl5334);
            rule__IntegerFeature__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getGroup_6()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__6__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__7"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2695:1: rule__IntegerFeature__Group__7 : rule__IntegerFeature__Group__7__Impl rule__IntegerFeature__Group__8 ;
    public final void rule__IntegerFeature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2699:1: ( rule__IntegerFeature__Group__7__Impl rule__IntegerFeature__Group__8 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2700:2: rule__IntegerFeature__Group__7__Impl rule__IntegerFeature__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__7__Impl_in_rule__IntegerFeature__Group__75364);
            rule__IntegerFeature__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__8_in_rule__IntegerFeature__Group__75367);
            rule__IntegerFeature__Group__8();

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
    // $ANTLR end "rule__IntegerFeature__Group__7"


    // $ANTLR start "rule__IntegerFeature__Group__7__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2707:1: rule__IntegerFeature__Group__7__Impl : ( ( rule__IntegerFeature__Group_7__0 ) ) ;
    public final void rule__IntegerFeature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2711:1: ( ( ( rule__IntegerFeature__Group_7__0 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2712:1: ( ( rule__IntegerFeature__Group_7__0 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2712:1: ( ( rule__IntegerFeature__Group_7__0 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2713:1: ( rule__IntegerFeature__Group_7__0 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_7()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2714:1: ( rule__IntegerFeature__Group_7__0 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2714:2: rule__IntegerFeature__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_7__0_in_rule__IntegerFeature__Group__7__Impl5394);
            rule__IntegerFeature__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getGroup_7()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__7__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__8"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2724:1: rule__IntegerFeature__Group__8 : rule__IntegerFeature__Group__8__Impl rule__IntegerFeature__Group__9 ;
    public final void rule__IntegerFeature__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2728:1: ( rule__IntegerFeature__Group__8__Impl rule__IntegerFeature__Group__9 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2729:2: rule__IntegerFeature__Group__8__Impl rule__IntegerFeature__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__8__Impl_in_rule__IntegerFeature__Group__85424);
            rule__IntegerFeature__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__9_in_rule__IntegerFeature__Group__85427);
            rule__IntegerFeature__Group__9();

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
    // $ANTLR end "rule__IntegerFeature__Group__8"


    // $ANTLR start "rule__IntegerFeature__Group__8__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2736:1: rule__IntegerFeature__Group__8__Impl : ( ( rule__IntegerFeature__Group_8__0 )? ) ;
    public final void rule__IntegerFeature__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2740:1: ( ( ( rule__IntegerFeature__Group_8__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2741:1: ( ( rule__IntegerFeature__Group_8__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2741:1: ( ( rule__IntegerFeature__Group_8__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2742:1: ( rule__IntegerFeature__Group_8__0 )?
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_8()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2743:1: ( rule__IntegerFeature__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2743:2: rule__IntegerFeature__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__0_in_rule__IntegerFeature__Group__8__Impl5454);
                    rule__IntegerFeature__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerFeatureAccess().getGroup_8()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__8__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__9"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2753:1: rule__IntegerFeature__Group__9 : rule__IntegerFeature__Group__9__Impl rule__IntegerFeature__Group__10 ;
    public final void rule__IntegerFeature__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2757:1: ( rule__IntegerFeature__Group__9__Impl rule__IntegerFeature__Group__10 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2758:2: rule__IntegerFeature__Group__9__Impl rule__IntegerFeature__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__9__Impl_in_rule__IntegerFeature__Group__95485);
            rule__IntegerFeature__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__10_in_rule__IntegerFeature__Group__95488);
            rule__IntegerFeature__Group__10();

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
    // $ANTLR end "rule__IntegerFeature__Group__9"


    // $ANTLR start "rule__IntegerFeature__Group__9__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2765:1: rule__IntegerFeature__Group__9__Impl : ( ( rule__IntegerFeature__Group_9__0 )? ) ;
    public final void rule__IntegerFeature__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2769:1: ( ( ( rule__IntegerFeature__Group_9__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2770:1: ( ( rule__IntegerFeature__Group_9__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2770:1: ( ( rule__IntegerFeature__Group_9__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2771:1: ( rule__IntegerFeature__Group_9__0 )?
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_9()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2772:1: ( rule__IntegerFeature__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2772:2: rule__IntegerFeature__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__0_in_rule__IntegerFeature__Group__9__Impl5515);
                    rule__IntegerFeature__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerFeatureAccess().getGroup_9()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__9__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__10"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2782:1: rule__IntegerFeature__Group__10 : rule__IntegerFeature__Group__10__Impl rule__IntegerFeature__Group__11 ;
    public final void rule__IntegerFeature__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2786:1: ( rule__IntegerFeature__Group__10__Impl rule__IntegerFeature__Group__11 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2787:2: rule__IntegerFeature__Group__10__Impl rule__IntegerFeature__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__10__Impl_in_rule__IntegerFeature__Group__105546);
            rule__IntegerFeature__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__11_in_rule__IntegerFeature__Group__105549);
            rule__IntegerFeature__Group__11();

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
    // $ANTLR end "rule__IntegerFeature__Group__10"


    // $ANTLR start "rule__IntegerFeature__Group__10__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2794:1: rule__IntegerFeature__Group__10__Impl : ( ( rule__IntegerFeature__Group_10__0 )? ) ;
    public final void rule__IntegerFeature__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2798:1: ( ( ( rule__IntegerFeature__Group_10__0 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2799:1: ( ( rule__IntegerFeature__Group_10__0 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2799:1: ( ( rule__IntegerFeature__Group_10__0 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2800:1: ( rule__IntegerFeature__Group_10__0 )?
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_10()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2801:1: ( rule__IntegerFeature__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2801:2: rule__IntegerFeature__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__0_in_rule__IntegerFeature__Group__10__Impl5576);
                    rule__IntegerFeature__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerFeatureAccess().getGroup_10()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__10__Impl"


    // $ANTLR start "rule__IntegerFeature__Group__11"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2811:1: rule__IntegerFeature__Group__11 : rule__IntegerFeature__Group__11__Impl ;
    public final void rule__IntegerFeature__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2815:1: ( rule__IntegerFeature__Group__11__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2816:2: rule__IntegerFeature__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group__11__Impl_in_rule__IntegerFeature__Group__115607);
            rule__IntegerFeature__Group__11__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group__11"


    // $ANTLR start "rule__IntegerFeature__Group__11__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2822:1: rule__IntegerFeature__Group__11__Impl : ( '}' ) ;
    public final void rule__IntegerFeature__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2826:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2827:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2827:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2828:1: '}'
            {
             before(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IntegerFeature__Group__11__Impl5635); 
             after(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__IntegerFeature__Group__11__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_5__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2865:1: rule__IntegerFeature__Group_5__0 : rule__IntegerFeature__Group_5__0__Impl rule__IntegerFeature__Group_5__1 ;
    public final void rule__IntegerFeature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2869:1: ( rule__IntegerFeature__Group_5__0__Impl rule__IntegerFeature__Group_5__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2870:2: rule__IntegerFeature__Group_5__0__Impl rule__IntegerFeature__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_5__0__Impl_in_rule__IntegerFeature__Group_5__05690);
            rule__IntegerFeature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_5__1_in_rule__IntegerFeature__Group_5__05693);
            rule__IntegerFeature__Group_5__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_5__0"


    // $ANTLR start "rule__IntegerFeature__Group_5__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2877:1: rule__IntegerFeature__Group_5__0__Impl : ( 'minValue' ) ;
    public final void rule__IntegerFeature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2881:1: ( ( 'minValue' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2882:1: ( 'minValue' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2882:1: ( 'minValue' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2883:1: 'minValue'
            {
             before(grammarAccess.getIntegerFeatureAccess().getMinValueKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__IntegerFeature__Group_5__0__Impl5721); 
             after(grammarAccess.getIntegerFeatureAccess().getMinValueKeyword_5_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_5__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_5__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2896:1: rule__IntegerFeature__Group_5__1 : rule__IntegerFeature__Group_5__1__Impl ;
    public final void rule__IntegerFeature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2900:1: ( rule__IntegerFeature__Group_5__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2901:2: rule__IntegerFeature__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_5__1__Impl_in_rule__IntegerFeature__Group_5__15752);
            rule__IntegerFeature__Group_5__1__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_5__1"


    // $ANTLR start "rule__IntegerFeature__Group_5__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2907:1: rule__IntegerFeature__Group_5__1__Impl : ( ( rule__IntegerFeature__MinValueAssignment_5_1 ) ) ;
    public final void rule__IntegerFeature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2911:1: ( ( ( rule__IntegerFeature__MinValueAssignment_5_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2912:1: ( ( rule__IntegerFeature__MinValueAssignment_5_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2912:1: ( ( rule__IntegerFeature__MinValueAssignment_5_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2913:1: ( rule__IntegerFeature__MinValueAssignment_5_1 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getMinValueAssignment_5_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2914:1: ( rule__IntegerFeature__MinValueAssignment_5_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2914:2: rule__IntegerFeature__MinValueAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__MinValueAssignment_5_1_in_rule__IntegerFeature__Group_5__1__Impl5779);
            rule__IntegerFeature__MinValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getMinValueAssignment_5_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_6__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2928:1: rule__IntegerFeature__Group_6__0 : rule__IntegerFeature__Group_6__0__Impl rule__IntegerFeature__Group_6__1 ;
    public final void rule__IntegerFeature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2932:1: ( rule__IntegerFeature__Group_6__0__Impl rule__IntegerFeature__Group_6__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2933:2: rule__IntegerFeature__Group_6__0__Impl rule__IntegerFeature__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_6__0__Impl_in_rule__IntegerFeature__Group_6__05813);
            rule__IntegerFeature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_6__1_in_rule__IntegerFeature__Group_6__05816);
            rule__IntegerFeature__Group_6__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_6__0"


    // $ANTLR start "rule__IntegerFeature__Group_6__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2940:1: rule__IntegerFeature__Group_6__0__Impl : ( 'maxValue' ) ;
    public final void rule__IntegerFeature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2944:1: ( ( 'maxValue' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2945:1: ( 'maxValue' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2945:1: ( 'maxValue' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2946:1: 'maxValue'
            {
             before(grammarAccess.getIntegerFeatureAccess().getMaxValueKeyword_6_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__IntegerFeature__Group_6__0__Impl5844); 
             after(grammarAccess.getIntegerFeatureAccess().getMaxValueKeyword_6_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_6__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_6__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2959:1: rule__IntegerFeature__Group_6__1 : rule__IntegerFeature__Group_6__1__Impl ;
    public final void rule__IntegerFeature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2963:1: ( rule__IntegerFeature__Group_6__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2964:2: rule__IntegerFeature__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_6__1__Impl_in_rule__IntegerFeature__Group_6__15875);
            rule__IntegerFeature__Group_6__1__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_6__1"


    // $ANTLR start "rule__IntegerFeature__Group_6__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2970:1: rule__IntegerFeature__Group_6__1__Impl : ( ( rule__IntegerFeature__MaxValueAssignment_6_1 ) ) ;
    public final void rule__IntegerFeature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2974:1: ( ( ( rule__IntegerFeature__MaxValueAssignment_6_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2975:1: ( ( rule__IntegerFeature__MaxValueAssignment_6_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2975:1: ( ( rule__IntegerFeature__MaxValueAssignment_6_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2976:1: ( rule__IntegerFeature__MaxValueAssignment_6_1 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getMaxValueAssignment_6_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2977:1: ( rule__IntegerFeature__MaxValueAssignment_6_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2977:2: rule__IntegerFeature__MaxValueAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__MaxValueAssignment_6_1_in_rule__IntegerFeature__Group_6__1__Impl5902);
            rule__IntegerFeature__MaxValueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getMaxValueAssignment_6_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_6__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_7__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2991:1: rule__IntegerFeature__Group_7__0 : rule__IntegerFeature__Group_7__0__Impl rule__IntegerFeature__Group_7__1 ;
    public final void rule__IntegerFeature__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2995:1: ( rule__IntegerFeature__Group_7__0__Impl rule__IntegerFeature__Group_7__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:2996:2: rule__IntegerFeature__Group_7__0__Impl rule__IntegerFeature__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_7__0__Impl_in_rule__IntegerFeature__Group_7__05936);
            rule__IntegerFeature__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_7__1_in_rule__IntegerFeature__Group_7__05939);
            rule__IntegerFeature__Group_7__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_7__0"


    // $ANTLR start "rule__IntegerFeature__Group_7__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3003:1: rule__IntegerFeature__Group_7__0__Impl : ( 'step' ) ;
    public final void rule__IntegerFeature__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3007:1: ( ( 'step' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3008:1: ( 'step' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3008:1: ( 'step' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3009:1: 'step'
            {
             before(grammarAccess.getIntegerFeatureAccess().getStepKeyword_7_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__IntegerFeature__Group_7__0__Impl5967); 
             after(grammarAccess.getIntegerFeatureAccess().getStepKeyword_7_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_7__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_7__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3022:1: rule__IntegerFeature__Group_7__1 : rule__IntegerFeature__Group_7__1__Impl ;
    public final void rule__IntegerFeature__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3026:1: ( rule__IntegerFeature__Group_7__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3027:2: rule__IntegerFeature__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_7__1__Impl_in_rule__IntegerFeature__Group_7__15998);
            rule__IntegerFeature__Group_7__1__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_7__1"


    // $ANTLR start "rule__IntegerFeature__Group_7__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3033:1: rule__IntegerFeature__Group_7__1__Impl : ( ( rule__IntegerFeature__StepAssignment_7_1 ) ) ;
    public final void rule__IntegerFeature__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3037:1: ( ( ( rule__IntegerFeature__StepAssignment_7_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3038:1: ( ( rule__IntegerFeature__StepAssignment_7_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3038:1: ( ( rule__IntegerFeature__StepAssignment_7_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3039:1: ( rule__IntegerFeature__StepAssignment_7_1 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getStepAssignment_7_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3040:1: ( rule__IntegerFeature__StepAssignment_7_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3040:2: rule__IntegerFeature__StepAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__StepAssignment_7_1_in_rule__IntegerFeature__Group_7__1__Impl6025);
            rule__IntegerFeature__StepAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getStepAssignment_7_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_7__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_8__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3054:1: rule__IntegerFeature__Group_8__0 : rule__IntegerFeature__Group_8__0__Impl rule__IntegerFeature__Group_8__1 ;
    public final void rule__IntegerFeature__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3058:1: ( rule__IntegerFeature__Group_8__0__Impl rule__IntegerFeature__Group_8__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3059:2: rule__IntegerFeature__Group_8__0__Impl rule__IntegerFeature__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__0__Impl_in_rule__IntegerFeature__Group_8__06059);
            rule__IntegerFeature__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__1_in_rule__IntegerFeature__Group_8__06062);
            rule__IntegerFeature__Group_8__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_8__0"


    // $ANTLR start "rule__IntegerFeature__Group_8__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3066:1: rule__IntegerFeature__Group_8__0__Impl : ( 'dependencies' ) ;
    public final void rule__IntegerFeature__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3070:1: ( ( 'dependencies' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3071:1: ( 'dependencies' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3071:1: ( 'dependencies' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3072:1: 'dependencies'
            {
             before(grammarAccess.getIntegerFeatureAccess().getDependenciesKeyword_8_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IntegerFeature__Group_8__0__Impl6090); 
             after(grammarAccess.getIntegerFeatureAccess().getDependenciesKeyword_8_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_8__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_8__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3085:1: rule__IntegerFeature__Group_8__1 : rule__IntegerFeature__Group_8__1__Impl rule__IntegerFeature__Group_8__2 ;
    public final void rule__IntegerFeature__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3089:1: ( rule__IntegerFeature__Group_8__1__Impl rule__IntegerFeature__Group_8__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3090:2: rule__IntegerFeature__Group_8__1__Impl rule__IntegerFeature__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__1__Impl_in_rule__IntegerFeature__Group_8__16121);
            rule__IntegerFeature__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__2_in_rule__IntegerFeature__Group_8__16124);
            rule__IntegerFeature__Group_8__2();

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
    // $ANTLR end "rule__IntegerFeature__Group_8__1"


    // $ANTLR start "rule__IntegerFeature__Group_8__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3097:1: rule__IntegerFeature__Group_8__1__Impl : ( '{' ) ;
    public final void rule__IntegerFeature__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3101:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3102:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3102:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3103:1: '{'
            {
             before(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntegerFeature__Group_8__1__Impl6152); 
             after(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_8__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_8__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3116:1: rule__IntegerFeature__Group_8__2 : rule__IntegerFeature__Group_8__2__Impl rule__IntegerFeature__Group_8__3 ;
    public final void rule__IntegerFeature__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3120:1: ( rule__IntegerFeature__Group_8__2__Impl rule__IntegerFeature__Group_8__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3121:2: rule__IntegerFeature__Group_8__2__Impl rule__IntegerFeature__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__2__Impl_in_rule__IntegerFeature__Group_8__26183);
            rule__IntegerFeature__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__3_in_rule__IntegerFeature__Group_8__26186);
            rule__IntegerFeature__Group_8__3();

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
    // $ANTLR end "rule__IntegerFeature__Group_8__2"


    // $ANTLR start "rule__IntegerFeature__Group_8__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3128:1: rule__IntegerFeature__Group_8__2__Impl : ( ( rule__IntegerFeature__DependenciesAssignment_8_2 ) ) ;
    public final void rule__IntegerFeature__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3132:1: ( ( ( rule__IntegerFeature__DependenciesAssignment_8_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3133:1: ( ( rule__IntegerFeature__DependenciesAssignment_8_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3133:1: ( ( rule__IntegerFeature__DependenciesAssignment_8_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3134:1: ( rule__IntegerFeature__DependenciesAssignment_8_2 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getDependenciesAssignment_8_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3135:1: ( rule__IntegerFeature__DependenciesAssignment_8_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3135:2: rule__IntegerFeature__DependenciesAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__DependenciesAssignment_8_2_in_rule__IntegerFeature__Group_8__2__Impl6213);
            rule__IntegerFeature__DependenciesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getDependenciesAssignment_8_2()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_8__2__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_8__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3145:1: rule__IntegerFeature__Group_8__3 : rule__IntegerFeature__Group_8__3__Impl rule__IntegerFeature__Group_8__4 ;
    public final void rule__IntegerFeature__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3149:1: ( rule__IntegerFeature__Group_8__3__Impl rule__IntegerFeature__Group_8__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3150:2: rule__IntegerFeature__Group_8__3__Impl rule__IntegerFeature__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__3__Impl_in_rule__IntegerFeature__Group_8__36243);
            rule__IntegerFeature__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__4_in_rule__IntegerFeature__Group_8__36246);
            rule__IntegerFeature__Group_8__4();

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
    // $ANTLR end "rule__IntegerFeature__Group_8__3"


    // $ANTLR start "rule__IntegerFeature__Group_8__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3157:1: rule__IntegerFeature__Group_8__3__Impl : ( ( rule__IntegerFeature__Group_8_3__0 )* ) ;
    public final void rule__IntegerFeature__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3161:1: ( ( ( rule__IntegerFeature__Group_8_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3162:1: ( ( rule__IntegerFeature__Group_8_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3162:1: ( ( rule__IntegerFeature__Group_8_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3163:1: ( rule__IntegerFeature__Group_8_3__0 )*
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_8_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3164:1: ( rule__IntegerFeature__Group_8_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3164:2: rule__IntegerFeature__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8_3__0_in_rule__IntegerFeature__Group_8__3__Impl6273);
            	    rule__IntegerFeature__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getIntegerFeatureAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_8__3__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_8__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3174:1: rule__IntegerFeature__Group_8__4 : rule__IntegerFeature__Group_8__4__Impl ;
    public final void rule__IntegerFeature__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3178:1: ( rule__IntegerFeature__Group_8__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3179:2: rule__IntegerFeature__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8__4__Impl_in_rule__IntegerFeature__Group_8__46304);
            rule__IntegerFeature__Group_8__4__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_8__4"


    // $ANTLR start "rule__IntegerFeature__Group_8__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3185:1: rule__IntegerFeature__Group_8__4__Impl : ( '}' ) ;
    public final void rule__IntegerFeature__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3189:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3190:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3190:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3191:1: '}'
            {
             before(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IntegerFeature__Group_8__4__Impl6332); 
             after(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_8__4__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_8_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3214:1: rule__IntegerFeature__Group_8_3__0 : rule__IntegerFeature__Group_8_3__0__Impl rule__IntegerFeature__Group_8_3__1 ;
    public final void rule__IntegerFeature__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3218:1: ( rule__IntegerFeature__Group_8_3__0__Impl rule__IntegerFeature__Group_8_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3219:2: rule__IntegerFeature__Group_8_3__0__Impl rule__IntegerFeature__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8_3__0__Impl_in_rule__IntegerFeature__Group_8_3__06373);
            rule__IntegerFeature__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8_3__1_in_rule__IntegerFeature__Group_8_3__06376);
            rule__IntegerFeature__Group_8_3__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_8_3__0"


    // $ANTLR start "rule__IntegerFeature__Group_8_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3226:1: rule__IntegerFeature__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__IntegerFeature__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3230:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3231:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3231:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3232:1: ','
            {
             before(grammarAccess.getIntegerFeatureAccess().getCommaKeyword_8_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IntegerFeature__Group_8_3__0__Impl6404); 
             after(grammarAccess.getIntegerFeatureAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_8_3__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_8_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3245:1: rule__IntegerFeature__Group_8_3__1 : rule__IntegerFeature__Group_8_3__1__Impl ;
    public final void rule__IntegerFeature__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3249:1: ( rule__IntegerFeature__Group_8_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3250:2: rule__IntegerFeature__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_8_3__1__Impl_in_rule__IntegerFeature__Group_8_3__16435);
            rule__IntegerFeature__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_8_3__1"


    // $ANTLR start "rule__IntegerFeature__Group_8_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3256:1: rule__IntegerFeature__Group_8_3__1__Impl : ( ( rule__IntegerFeature__DependenciesAssignment_8_3_1 ) ) ;
    public final void rule__IntegerFeature__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3260:1: ( ( ( rule__IntegerFeature__DependenciesAssignment_8_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3261:1: ( ( rule__IntegerFeature__DependenciesAssignment_8_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3261:1: ( ( rule__IntegerFeature__DependenciesAssignment_8_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3262:1: ( rule__IntegerFeature__DependenciesAssignment_8_3_1 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getDependenciesAssignment_8_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3263:1: ( rule__IntegerFeature__DependenciesAssignment_8_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3263:2: rule__IntegerFeature__DependenciesAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__DependenciesAssignment_8_3_1_in_rule__IntegerFeature__Group_8_3__1__Impl6462);
            rule__IntegerFeature__DependenciesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getDependenciesAssignment_8_3_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_8_3__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_9__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3277:1: rule__IntegerFeature__Group_9__0 : rule__IntegerFeature__Group_9__0__Impl rule__IntegerFeature__Group_9__1 ;
    public final void rule__IntegerFeature__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3281:1: ( rule__IntegerFeature__Group_9__0__Impl rule__IntegerFeature__Group_9__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3282:2: rule__IntegerFeature__Group_9__0__Impl rule__IntegerFeature__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__0__Impl_in_rule__IntegerFeature__Group_9__06496);
            rule__IntegerFeature__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__1_in_rule__IntegerFeature__Group_9__06499);
            rule__IntegerFeature__Group_9__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_9__0"


    // $ANTLR start "rule__IntegerFeature__Group_9__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3289:1: rule__IntegerFeature__Group_9__0__Impl : ( 'features' ) ;
    public final void rule__IntegerFeature__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3293:1: ( ( 'features' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3294:1: ( 'features' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3294:1: ( 'features' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3295:1: 'features'
            {
             before(grammarAccess.getIntegerFeatureAccess().getFeaturesKeyword_9_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__IntegerFeature__Group_9__0__Impl6527); 
             after(grammarAccess.getIntegerFeatureAccess().getFeaturesKeyword_9_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_9__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_9__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3308:1: rule__IntegerFeature__Group_9__1 : rule__IntegerFeature__Group_9__1__Impl rule__IntegerFeature__Group_9__2 ;
    public final void rule__IntegerFeature__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3312:1: ( rule__IntegerFeature__Group_9__1__Impl rule__IntegerFeature__Group_9__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3313:2: rule__IntegerFeature__Group_9__1__Impl rule__IntegerFeature__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__1__Impl_in_rule__IntegerFeature__Group_9__16558);
            rule__IntegerFeature__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__2_in_rule__IntegerFeature__Group_9__16561);
            rule__IntegerFeature__Group_9__2();

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
    // $ANTLR end "rule__IntegerFeature__Group_9__1"


    // $ANTLR start "rule__IntegerFeature__Group_9__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3320:1: rule__IntegerFeature__Group_9__1__Impl : ( '{' ) ;
    public final void rule__IntegerFeature__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3324:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3325:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3325:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3326:1: '{'
            {
             before(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntegerFeature__Group_9__1__Impl6589); 
             after(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_9__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_9__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3339:1: rule__IntegerFeature__Group_9__2 : rule__IntegerFeature__Group_9__2__Impl rule__IntegerFeature__Group_9__3 ;
    public final void rule__IntegerFeature__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3343:1: ( rule__IntegerFeature__Group_9__2__Impl rule__IntegerFeature__Group_9__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3344:2: rule__IntegerFeature__Group_9__2__Impl rule__IntegerFeature__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__2__Impl_in_rule__IntegerFeature__Group_9__26620);
            rule__IntegerFeature__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__3_in_rule__IntegerFeature__Group_9__26623);
            rule__IntegerFeature__Group_9__3();

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
    // $ANTLR end "rule__IntegerFeature__Group_9__2"


    // $ANTLR start "rule__IntegerFeature__Group_9__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3351:1: rule__IntegerFeature__Group_9__2__Impl : ( ( rule__IntegerFeature__FeaturesAssignment_9_2 ) ) ;
    public final void rule__IntegerFeature__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3355:1: ( ( ( rule__IntegerFeature__FeaturesAssignment_9_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3356:1: ( ( rule__IntegerFeature__FeaturesAssignment_9_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3356:1: ( ( rule__IntegerFeature__FeaturesAssignment_9_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3357:1: ( rule__IntegerFeature__FeaturesAssignment_9_2 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getFeaturesAssignment_9_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3358:1: ( rule__IntegerFeature__FeaturesAssignment_9_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3358:2: rule__IntegerFeature__FeaturesAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__FeaturesAssignment_9_2_in_rule__IntegerFeature__Group_9__2__Impl6650);
            rule__IntegerFeature__FeaturesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getFeaturesAssignment_9_2()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_9__2__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_9__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3368:1: rule__IntegerFeature__Group_9__3 : rule__IntegerFeature__Group_9__3__Impl rule__IntegerFeature__Group_9__4 ;
    public final void rule__IntegerFeature__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3372:1: ( rule__IntegerFeature__Group_9__3__Impl rule__IntegerFeature__Group_9__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3373:2: rule__IntegerFeature__Group_9__3__Impl rule__IntegerFeature__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__3__Impl_in_rule__IntegerFeature__Group_9__36680);
            rule__IntegerFeature__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__4_in_rule__IntegerFeature__Group_9__36683);
            rule__IntegerFeature__Group_9__4();

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
    // $ANTLR end "rule__IntegerFeature__Group_9__3"


    // $ANTLR start "rule__IntegerFeature__Group_9__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3380:1: rule__IntegerFeature__Group_9__3__Impl : ( ( rule__IntegerFeature__Group_9_3__0 )* ) ;
    public final void rule__IntegerFeature__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3384:1: ( ( ( rule__IntegerFeature__Group_9_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3385:1: ( ( rule__IntegerFeature__Group_9_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3385:1: ( ( rule__IntegerFeature__Group_9_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3386:1: ( rule__IntegerFeature__Group_9_3__0 )*
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_9_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3387:1: ( rule__IntegerFeature__Group_9_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3387:2: rule__IntegerFeature__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9_3__0_in_rule__IntegerFeature__Group_9__3__Impl6710);
            	    rule__IntegerFeature__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getIntegerFeatureAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_9__3__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_9__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3397:1: rule__IntegerFeature__Group_9__4 : rule__IntegerFeature__Group_9__4__Impl ;
    public final void rule__IntegerFeature__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3401:1: ( rule__IntegerFeature__Group_9__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3402:2: rule__IntegerFeature__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9__4__Impl_in_rule__IntegerFeature__Group_9__46741);
            rule__IntegerFeature__Group_9__4__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_9__4"


    // $ANTLR start "rule__IntegerFeature__Group_9__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3408:1: rule__IntegerFeature__Group_9__4__Impl : ( '}' ) ;
    public final void rule__IntegerFeature__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3412:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3413:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3413:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3414:1: '}'
            {
             before(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IntegerFeature__Group_9__4__Impl6769); 
             after(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_9__4__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_9_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3437:1: rule__IntegerFeature__Group_9_3__0 : rule__IntegerFeature__Group_9_3__0__Impl rule__IntegerFeature__Group_9_3__1 ;
    public final void rule__IntegerFeature__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3441:1: ( rule__IntegerFeature__Group_9_3__0__Impl rule__IntegerFeature__Group_9_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3442:2: rule__IntegerFeature__Group_9_3__0__Impl rule__IntegerFeature__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9_3__0__Impl_in_rule__IntegerFeature__Group_9_3__06810);
            rule__IntegerFeature__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9_3__1_in_rule__IntegerFeature__Group_9_3__06813);
            rule__IntegerFeature__Group_9_3__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_9_3__0"


    // $ANTLR start "rule__IntegerFeature__Group_9_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3449:1: rule__IntegerFeature__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__IntegerFeature__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3453:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3454:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3454:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3455:1: ','
            {
             before(grammarAccess.getIntegerFeatureAccess().getCommaKeyword_9_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IntegerFeature__Group_9_3__0__Impl6841); 
             after(grammarAccess.getIntegerFeatureAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_9_3__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_9_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3468:1: rule__IntegerFeature__Group_9_3__1 : rule__IntegerFeature__Group_9_3__1__Impl ;
    public final void rule__IntegerFeature__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3472:1: ( rule__IntegerFeature__Group_9_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3473:2: rule__IntegerFeature__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_9_3__1__Impl_in_rule__IntegerFeature__Group_9_3__16872);
            rule__IntegerFeature__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_9_3__1"


    // $ANTLR start "rule__IntegerFeature__Group_9_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3479:1: rule__IntegerFeature__Group_9_3__1__Impl : ( ( rule__IntegerFeature__FeaturesAssignment_9_3_1 ) ) ;
    public final void rule__IntegerFeature__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3483:1: ( ( ( rule__IntegerFeature__FeaturesAssignment_9_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3484:1: ( ( rule__IntegerFeature__FeaturesAssignment_9_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3484:1: ( ( rule__IntegerFeature__FeaturesAssignment_9_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3485:1: ( rule__IntegerFeature__FeaturesAssignment_9_3_1 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getFeaturesAssignment_9_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3486:1: ( rule__IntegerFeature__FeaturesAssignment_9_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3486:2: rule__IntegerFeature__FeaturesAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__FeaturesAssignment_9_3_1_in_rule__IntegerFeature__Group_9_3__1__Impl6899);
            rule__IntegerFeature__FeaturesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getFeaturesAssignment_9_3_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_9_3__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_10__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3500:1: rule__IntegerFeature__Group_10__0 : rule__IntegerFeature__Group_10__0__Impl rule__IntegerFeature__Group_10__1 ;
    public final void rule__IntegerFeature__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3504:1: ( rule__IntegerFeature__Group_10__0__Impl rule__IntegerFeature__Group_10__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3505:2: rule__IntegerFeature__Group_10__0__Impl rule__IntegerFeature__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__0__Impl_in_rule__IntegerFeature__Group_10__06933);
            rule__IntegerFeature__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__1_in_rule__IntegerFeature__Group_10__06936);
            rule__IntegerFeature__Group_10__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_10__0"


    // $ANTLR start "rule__IntegerFeature__Group_10__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3512:1: rule__IntegerFeature__Group_10__0__Impl : ( 'groups' ) ;
    public final void rule__IntegerFeature__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3516:1: ( ( 'groups' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3517:1: ( 'groups' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3517:1: ( 'groups' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3518:1: 'groups'
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroupsKeyword_10_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__IntegerFeature__Group_10__0__Impl6964); 
             after(grammarAccess.getIntegerFeatureAccess().getGroupsKeyword_10_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_10__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_10__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3531:1: rule__IntegerFeature__Group_10__1 : rule__IntegerFeature__Group_10__1__Impl rule__IntegerFeature__Group_10__2 ;
    public final void rule__IntegerFeature__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3535:1: ( rule__IntegerFeature__Group_10__1__Impl rule__IntegerFeature__Group_10__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3536:2: rule__IntegerFeature__Group_10__1__Impl rule__IntegerFeature__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__1__Impl_in_rule__IntegerFeature__Group_10__16995);
            rule__IntegerFeature__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__2_in_rule__IntegerFeature__Group_10__16998);
            rule__IntegerFeature__Group_10__2();

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
    // $ANTLR end "rule__IntegerFeature__Group_10__1"


    // $ANTLR start "rule__IntegerFeature__Group_10__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3543:1: rule__IntegerFeature__Group_10__1__Impl : ( '{' ) ;
    public final void rule__IntegerFeature__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3547:1: ( ( '{' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3548:1: ( '{' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3548:1: ( '{' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3549:1: '{'
            {
             before(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntegerFeature__Group_10__1__Impl7026); 
             after(grammarAccess.getIntegerFeatureAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_10__1__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_10__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3562:1: rule__IntegerFeature__Group_10__2 : rule__IntegerFeature__Group_10__2__Impl rule__IntegerFeature__Group_10__3 ;
    public final void rule__IntegerFeature__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3566:1: ( rule__IntegerFeature__Group_10__2__Impl rule__IntegerFeature__Group_10__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3567:2: rule__IntegerFeature__Group_10__2__Impl rule__IntegerFeature__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__2__Impl_in_rule__IntegerFeature__Group_10__27057);
            rule__IntegerFeature__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__3_in_rule__IntegerFeature__Group_10__27060);
            rule__IntegerFeature__Group_10__3();

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
    // $ANTLR end "rule__IntegerFeature__Group_10__2"


    // $ANTLR start "rule__IntegerFeature__Group_10__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3574:1: rule__IntegerFeature__Group_10__2__Impl : ( ( rule__IntegerFeature__GroupsAssignment_10_2 ) ) ;
    public final void rule__IntegerFeature__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3578:1: ( ( ( rule__IntegerFeature__GroupsAssignment_10_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3579:1: ( ( rule__IntegerFeature__GroupsAssignment_10_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3579:1: ( ( rule__IntegerFeature__GroupsAssignment_10_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3580:1: ( rule__IntegerFeature__GroupsAssignment_10_2 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroupsAssignment_10_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3581:1: ( rule__IntegerFeature__GroupsAssignment_10_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3581:2: rule__IntegerFeature__GroupsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__GroupsAssignment_10_2_in_rule__IntegerFeature__Group_10__2__Impl7087);
            rule__IntegerFeature__GroupsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getGroupsAssignment_10_2()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_10__2__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_10__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3591:1: rule__IntegerFeature__Group_10__3 : rule__IntegerFeature__Group_10__3__Impl rule__IntegerFeature__Group_10__4 ;
    public final void rule__IntegerFeature__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3595:1: ( rule__IntegerFeature__Group_10__3__Impl rule__IntegerFeature__Group_10__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3596:2: rule__IntegerFeature__Group_10__3__Impl rule__IntegerFeature__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__3__Impl_in_rule__IntegerFeature__Group_10__37117);
            rule__IntegerFeature__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__4_in_rule__IntegerFeature__Group_10__37120);
            rule__IntegerFeature__Group_10__4();

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
    // $ANTLR end "rule__IntegerFeature__Group_10__3"


    // $ANTLR start "rule__IntegerFeature__Group_10__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3603:1: rule__IntegerFeature__Group_10__3__Impl : ( ( rule__IntegerFeature__Group_10_3__0 )* ) ;
    public final void rule__IntegerFeature__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3607:1: ( ( ( rule__IntegerFeature__Group_10_3__0 )* ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3608:1: ( ( rule__IntegerFeature__Group_10_3__0 )* )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3608:1: ( ( rule__IntegerFeature__Group_10_3__0 )* )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3609:1: ( rule__IntegerFeature__Group_10_3__0 )*
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroup_10_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3610:1: ( rule__IntegerFeature__Group_10_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3610:2: rule__IntegerFeature__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10_3__0_in_rule__IntegerFeature__Group_10__3__Impl7147);
            	    rule__IntegerFeature__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getIntegerFeatureAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_10__3__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_10__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3620:1: rule__IntegerFeature__Group_10__4 : rule__IntegerFeature__Group_10__4__Impl ;
    public final void rule__IntegerFeature__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3624:1: ( rule__IntegerFeature__Group_10__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3625:2: rule__IntegerFeature__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10__4__Impl_in_rule__IntegerFeature__Group_10__47178);
            rule__IntegerFeature__Group_10__4__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_10__4"


    // $ANTLR start "rule__IntegerFeature__Group_10__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3631:1: rule__IntegerFeature__Group_10__4__Impl : ( '}' ) ;
    public final void rule__IntegerFeature__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3635:1: ( ( '}' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3636:1: ( '}' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3636:1: ( '}' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3637:1: '}'
            {
             before(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IntegerFeature__Group_10__4__Impl7206); 
             after(grammarAccess.getIntegerFeatureAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_10__4__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_10_3__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3660:1: rule__IntegerFeature__Group_10_3__0 : rule__IntegerFeature__Group_10_3__0__Impl rule__IntegerFeature__Group_10_3__1 ;
    public final void rule__IntegerFeature__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3664:1: ( rule__IntegerFeature__Group_10_3__0__Impl rule__IntegerFeature__Group_10_3__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3665:2: rule__IntegerFeature__Group_10_3__0__Impl rule__IntegerFeature__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10_3__0__Impl_in_rule__IntegerFeature__Group_10_3__07247);
            rule__IntegerFeature__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10_3__1_in_rule__IntegerFeature__Group_10_3__07250);
            rule__IntegerFeature__Group_10_3__1();

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
    // $ANTLR end "rule__IntegerFeature__Group_10_3__0"


    // $ANTLR start "rule__IntegerFeature__Group_10_3__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3672:1: rule__IntegerFeature__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__IntegerFeature__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3676:1: ( ( ',' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3677:1: ( ',' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3677:1: ( ',' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3678:1: ','
            {
             before(grammarAccess.getIntegerFeatureAccess().getCommaKeyword_10_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IntegerFeature__Group_10_3__0__Impl7278); 
             after(grammarAccess.getIntegerFeatureAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_10_3__0__Impl"


    // $ANTLR start "rule__IntegerFeature__Group_10_3__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3691:1: rule__IntegerFeature__Group_10_3__1 : rule__IntegerFeature__Group_10_3__1__Impl ;
    public final void rule__IntegerFeature__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3695:1: ( rule__IntegerFeature__Group_10_3__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3696:2: rule__IntegerFeature__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__Group_10_3__1__Impl_in_rule__IntegerFeature__Group_10_3__17309);
            rule__IntegerFeature__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__IntegerFeature__Group_10_3__1"


    // $ANTLR start "rule__IntegerFeature__Group_10_3__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3702:1: rule__IntegerFeature__Group_10_3__1__Impl : ( ( rule__IntegerFeature__GroupsAssignment_10_3_1 ) ) ;
    public final void rule__IntegerFeature__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3706:1: ( ( ( rule__IntegerFeature__GroupsAssignment_10_3_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3707:1: ( ( rule__IntegerFeature__GroupsAssignment_10_3_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3707:1: ( ( rule__IntegerFeature__GroupsAssignment_10_3_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3708:1: ( rule__IntegerFeature__GroupsAssignment_10_3_1 )
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroupsAssignment_10_3_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3709:1: ( rule__IntegerFeature__GroupsAssignment_10_3_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3709:2: rule__IntegerFeature__GroupsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerFeature__GroupsAssignment_10_3_1_in_rule__IntegerFeature__Group_10_3__1__Impl7336);
            rule__IntegerFeature__GroupsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerFeatureAccess().getGroupsAssignment_10_3_1()); 

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
    // $ANTLR end "rule__IntegerFeature__Group_10_3__1__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3723:1: rule__BinaryNotDependency__Group__0 : rule__BinaryNotDependency__Group__0__Impl rule__BinaryNotDependency__Group__1 ;
    public final void rule__BinaryNotDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3727:1: ( rule__BinaryNotDependency__Group__0__Impl rule__BinaryNotDependency__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3728:2: rule__BinaryNotDependency__Group__0__Impl rule__BinaryNotDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__0__Impl_in_rule__BinaryNotDependency__Group__07370);
            rule__BinaryNotDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__1_in_rule__BinaryNotDependency__Group__07373);
            rule__BinaryNotDependency__Group__1();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__0"


    // $ANTLR start "rule__BinaryNotDependency__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3735:1: rule__BinaryNotDependency__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryNotDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3739:1: ( ( '(' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3740:1: ( '(' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3740:1: ( '(' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3741:1: '('
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BinaryNotDependency__Group__0__Impl7401); 
             after(grammarAccess.getBinaryNotDependencyAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__0__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3754:1: rule__BinaryNotDependency__Group__1 : rule__BinaryNotDependency__Group__1__Impl rule__BinaryNotDependency__Group__2 ;
    public final void rule__BinaryNotDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3758:1: ( rule__BinaryNotDependency__Group__1__Impl rule__BinaryNotDependency__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3759:2: rule__BinaryNotDependency__Group__1__Impl rule__BinaryNotDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__1__Impl_in_rule__BinaryNotDependency__Group__17432);
            rule__BinaryNotDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__2_in_rule__BinaryNotDependency__Group__17435);
            rule__BinaryNotDependency__Group__2();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__1"


    // $ANTLR start "rule__BinaryNotDependency__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3766:1: rule__BinaryNotDependency__Group__1__Impl : ( ( rule__BinaryNotDependency__NotAssignment_1 ) ) ;
    public final void rule__BinaryNotDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3770:1: ( ( ( rule__BinaryNotDependency__NotAssignment_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3771:1: ( ( rule__BinaryNotDependency__NotAssignment_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3771:1: ( ( rule__BinaryNotDependency__NotAssignment_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3772:1: ( rule__BinaryNotDependency__NotAssignment_1 )
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getNotAssignment_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3773:1: ( rule__BinaryNotDependency__NotAssignment_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3773:2: rule__BinaryNotDependency__NotAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__NotAssignment_1_in_rule__BinaryNotDependency__Group__1__Impl7462);
            rule__BinaryNotDependency__NotAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryNotDependencyAccess().getNotAssignment_1()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__1__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3783:1: rule__BinaryNotDependency__Group__2 : rule__BinaryNotDependency__Group__2__Impl rule__BinaryNotDependency__Group__3 ;
    public final void rule__BinaryNotDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3787:1: ( rule__BinaryNotDependency__Group__2__Impl rule__BinaryNotDependency__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3788:2: rule__BinaryNotDependency__Group__2__Impl rule__BinaryNotDependency__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__2__Impl_in_rule__BinaryNotDependency__Group__27492);
            rule__BinaryNotDependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__3_in_rule__BinaryNotDependency__Group__27495);
            rule__BinaryNotDependency__Group__3();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__2"


    // $ANTLR start "rule__BinaryNotDependency__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3795:1: rule__BinaryNotDependency__Group__2__Impl : ( '(' ) ;
    public final void rule__BinaryNotDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3799:1: ( ( '(' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3800:1: ( '(' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3800:1: ( '(' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3801:1: '('
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BinaryNotDependency__Group__2__Impl7523); 
             after(grammarAccess.getBinaryNotDependencyAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__2__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3814:1: rule__BinaryNotDependency__Group__3 : rule__BinaryNotDependency__Group__3__Impl rule__BinaryNotDependency__Group__4 ;
    public final void rule__BinaryNotDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3818:1: ( rule__BinaryNotDependency__Group__3__Impl rule__BinaryNotDependency__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3819:2: rule__BinaryNotDependency__Group__3__Impl rule__BinaryNotDependency__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__3__Impl_in_rule__BinaryNotDependency__Group__37554);
            rule__BinaryNotDependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__4_in_rule__BinaryNotDependency__Group__37557);
            rule__BinaryNotDependency__Group__4();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__3"


    // $ANTLR start "rule__BinaryNotDependency__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3826:1: rule__BinaryNotDependency__Group__3__Impl : ( ( rule__BinaryNotDependency__LeftHandAssignment_3 ) ) ;
    public final void rule__BinaryNotDependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3830:1: ( ( ( rule__BinaryNotDependency__LeftHandAssignment_3 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3831:1: ( ( rule__BinaryNotDependency__LeftHandAssignment_3 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3831:1: ( ( rule__BinaryNotDependency__LeftHandAssignment_3 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3832:1: ( rule__BinaryNotDependency__LeftHandAssignment_3 )
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getLeftHandAssignment_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3833:1: ( rule__BinaryNotDependency__LeftHandAssignment_3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3833:2: rule__BinaryNotDependency__LeftHandAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__LeftHandAssignment_3_in_rule__BinaryNotDependency__Group__3__Impl7584);
            rule__BinaryNotDependency__LeftHandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryNotDependencyAccess().getLeftHandAssignment_3()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__3__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3843:1: rule__BinaryNotDependency__Group__4 : rule__BinaryNotDependency__Group__4__Impl rule__BinaryNotDependency__Group__5 ;
    public final void rule__BinaryNotDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3847:1: ( rule__BinaryNotDependency__Group__4__Impl rule__BinaryNotDependency__Group__5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3848:2: rule__BinaryNotDependency__Group__4__Impl rule__BinaryNotDependency__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__4__Impl_in_rule__BinaryNotDependency__Group__47614);
            rule__BinaryNotDependency__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__5_in_rule__BinaryNotDependency__Group__47617);
            rule__BinaryNotDependency__Group__5();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__4"


    // $ANTLR start "rule__BinaryNotDependency__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3855:1: rule__BinaryNotDependency__Group__4__Impl : ( ( rule__BinaryNotDependency__OperatorAssignment_4 ) ) ;
    public final void rule__BinaryNotDependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3859:1: ( ( ( rule__BinaryNotDependency__OperatorAssignment_4 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3860:1: ( ( rule__BinaryNotDependency__OperatorAssignment_4 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3860:1: ( ( rule__BinaryNotDependency__OperatorAssignment_4 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3861:1: ( rule__BinaryNotDependency__OperatorAssignment_4 )
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getOperatorAssignment_4()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3862:1: ( rule__BinaryNotDependency__OperatorAssignment_4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3862:2: rule__BinaryNotDependency__OperatorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__OperatorAssignment_4_in_rule__BinaryNotDependency__Group__4__Impl7644);
            rule__BinaryNotDependency__OperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryNotDependencyAccess().getOperatorAssignment_4()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__4__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3872:1: rule__BinaryNotDependency__Group__5 : rule__BinaryNotDependency__Group__5__Impl rule__BinaryNotDependency__Group__6 ;
    public final void rule__BinaryNotDependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3876:1: ( rule__BinaryNotDependency__Group__5__Impl rule__BinaryNotDependency__Group__6 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3877:2: rule__BinaryNotDependency__Group__5__Impl rule__BinaryNotDependency__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__5__Impl_in_rule__BinaryNotDependency__Group__57674);
            rule__BinaryNotDependency__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__6_in_rule__BinaryNotDependency__Group__57677);
            rule__BinaryNotDependency__Group__6();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__5"


    // $ANTLR start "rule__BinaryNotDependency__Group__5__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3884:1: rule__BinaryNotDependency__Group__5__Impl : ( ( rule__BinaryNotDependency__RightHandAssignment_5 ) ) ;
    public final void rule__BinaryNotDependency__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3888:1: ( ( ( rule__BinaryNotDependency__RightHandAssignment_5 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3889:1: ( ( rule__BinaryNotDependency__RightHandAssignment_5 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3889:1: ( ( rule__BinaryNotDependency__RightHandAssignment_5 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3890:1: ( rule__BinaryNotDependency__RightHandAssignment_5 )
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getRightHandAssignment_5()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3891:1: ( rule__BinaryNotDependency__RightHandAssignment_5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3891:2: rule__BinaryNotDependency__RightHandAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__RightHandAssignment_5_in_rule__BinaryNotDependency__Group__5__Impl7704);
            rule__BinaryNotDependency__RightHandAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBinaryNotDependencyAccess().getRightHandAssignment_5()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__5__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__6"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3901:1: rule__BinaryNotDependency__Group__6 : rule__BinaryNotDependency__Group__6__Impl rule__BinaryNotDependency__Group__7 ;
    public final void rule__BinaryNotDependency__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3905:1: ( rule__BinaryNotDependency__Group__6__Impl rule__BinaryNotDependency__Group__7 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3906:2: rule__BinaryNotDependency__Group__6__Impl rule__BinaryNotDependency__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__6__Impl_in_rule__BinaryNotDependency__Group__67734);
            rule__BinaryNotDependency__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__7_in_rule__BinaryNotDependency__Group__67737);
            rule__BinaryNotDependency__Group__7();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__6"


    // $ANTLR start "rule__BinaryNotDependency__Group__6__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3913:1: rule__BinaryNotDependency__Group__6__Impl : ( ')' ) ;
    public final void rule__BinaryNotDependency__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3917:1: ( ( ')' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3918:1: ( ')' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3918:1: ( ')' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3919:1: ')'
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__BinaryNotDependency__Group__6__Impl7765); 
             after(grammarAccess.getBinaryNotDependencyAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__6__Impl"


    // $ANTLR start "rule__BinaryNotDependency__Group__7"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3932:1: rule__BinaryNotDependency__Group__7 : rule__BinaryNotDependency__Group__7__Impl ;
    public final void rule__BinaryNotDependency__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3936:1: ( rule__BinaryNotDependency__Group__7__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3937:2: rule__BinaryNotDependency__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryNotDependency__Group__7__Impl_in_rule__BinaryNotDependency__Group__77796);
            rule__BinaryNotDependency__Group__7__Impl();

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
    // $ANTLR end "rule__BinaryNotDependency__Group__7"


    // $ANTLR start "rule__BinaryNotDependency__Group__7__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3943:1: rule__BinaryNotDependency__Group__7__Impl : ( ')' ) ;
    public final void rule__BinaryNotDependency__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3947:1: ( ( ')' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3948:1: ( ')' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3948:1: ( ')' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3949:1: ')'
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getRightParenthesisKeyword_7()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__BinaryNotDependency__Group__7__Impl7824); 
             after(grammarAccess.getBinaryNotDependencyAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__BinaryNotDependency__Group__7__Impl"


    // $ANTLR start "rule__BinaryDependency__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3978:1: rule__BinaryDependency__Group__0 : rule__BinaryDependency__Group__0__Impl rule__BinaryDependency__Group__1 ;
    public final void rule__BinaryDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3982:1: ( rule__BinaryDependency__Group__0__Impl rule__BinaryDependency__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3983:2: rule__BinaryDependency__Group__0__Impl rule__BinaryDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__0__Impl_in_rule__BinaryDependency__Group__07871);
            rule__BinaryDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__1_in_rule__BinaryDependency__Group__07874);
            rule__BinaryDependency__Group__1();

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
    // $ANTLR end "rule__BinaryDependency__Group__0"


    // $ANTLR start "rule__BinaryDependency__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3990:1: rule__BinaryDependency__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3994:1: ( ( '(' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3995:1: ( '(' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3995:1: ( '(' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:3996:1: '('
            {
             before(grammarAccess.getBinaryDependencyAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BinaryDependency__Group__0__Impl7902); 
             after(grammarAccess.getBinaryDependencyAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__BinaryDependency__Group__0__Impl"


    // $ANTLR start "rule__BinaryDependency__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4009:1: rule__BinaryDependency__Group__1 : rule__BinaryDependency__Group__1__Impl rule__BinaryDependency__Group__2 ;
    public final void rule__BinaryDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4013:1: ( rule__BinaryDependency__Group__1__Impl rule__BinaryDependency__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4014:2: rule__BinaryDependency__Group__1__Impl rule__BinaryDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__1__Impl_in_rule__BinaryDependency__Group__17933);
            rule__BinaryDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__2_in_rule__BinaryDependency__Group__17936);
            rule__BinaryDependency__Group__2();

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
    // $ANTLR end "rule__BinaryDependency__Group__1"


    // $ANTLR start "rule__BinaryDependency__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4021:1: rule__BinaryDependency__Group__1__Impl : ( ( rule__BinaryDependency__LeftHandAssignment_1 ) ) ;
    public final void rule__BinaryDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4025:1: ( ( ( rule__BinaryDependency__LeftHandAssignment_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4026:1: ( ( rule__BinaryDependency__LeftHandAssignment_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4026:1: ( ( rule__BinaryDependency__LeftHandAssignment_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4027:1: ( rule__BinaryDependency__LeftHandAssignment_1 )
            {
             before(grammarAccess.getBinaryDependencyAccess().getLeftHandAssignment_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4028:1: ( rule__BinaryDependency__LeftHandAssignment_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4028:2: rule__BinaryDependency__LeftHandAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__LeftHandAssignment_1_in_rule__BinaryDependency__Group__1__Impl7963);
            rule__BinaryDependency__LeftHandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryDependencyAccess().getLeftHandAssignment_1()); 

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
    // $ANTLR end "rule__BinaryDependency__Group__1__Impl"


    // $ANTLR start "rule__BinaryDependency__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4038:1: rule__BinaryDependency__Group__2 : rule__BinaryDependency__Group__2__Impl rule__BinaryDependency__Group__3 ;
    public final void rule__BinaryDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4042:1: ( rule__BinaryDependency__Group__2__Impl rule__BinaryDependency__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4043:2: rule__BinaryDependency__Group__2__Impl rule__BinaryDependency__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__2__Impl_in_rule__BinaryDependency__Group__27993);
            rule__BinaryDependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__3_in_rule__BinaryDependency__Group__27996);
            rule__BinaryDependency__Group__3();

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
    // $ANTLR end "rule__BinaryDependency__Group__2"


    // $ANTLR start "rule__BinaryDependency__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4050:1: rule__BinaryDependency__Group__2__Impl : ( ( rule__BinaryDependency__OperatorAssignment_2 ) ) ;
    public final void rule__BinaryDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4054:1: ( ( ( rule__BinaryDependency__OperatorAssignment_2 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4055:1: ( ( rule__BinaryDependency__OperatorAssignment_2 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4055:1: ( ( rule__BinaryDependency__OperatorAssignment_2 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4056:1: ( rule__BinaryDependency__OperatorAssignment_2 )
            {
             before(grammarAccess.getBinaryDependencyAccess().getOperatorAssignment_2()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4057:1: ( rule__BinaryDependency__OperatorAssignment_2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4057:2: rule__BinaryDependency__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__OperatorAssignment_2_in_rule__BinaryDependency__Group__2__Impl8023);
            rule__BinaryDependency__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryDependencyAccess().getOperatorAssignment_2()); 

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
    // $ANTLR end "rule__BinaryDependency__Group__2__Impl"


    // $ANTLR start "rule__BinaryDependency__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4067:1: rule__BinaryDependency__Group__3 : rule__BinaryDependency__Group__3__Impl rule__BinaryDependency__Group__4 ;
    public final void rule__BinaryDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4071:1: ( rule__BinaryDependency__Group__3__Impl rule__BinaryDependency__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4072:2: rule__BinaryDependency__Group__3__Impl rule__BinaryDependency__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__3__Impl_in_rule__BinaryDependency__Group__38053);
            rule__BinaryDependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__4_in_rule__BinaryDependency__Group__38056);
            rule__BinaryDependency__Group__4();

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
    // $ANTLR end "rule__BinaryDependency__Group__3"


    // $ANTLR start "rule__BinaryDependency__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4079:1: rule__BinaryDependency__Group__3__Impl : ( ( rule__BinaryDependency__RightHandAssignment_3 ) ) ;
    public final void rule__BinaryDependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4083:1: ( ( ( rule__BinaryDependency__RightHandAssignment_3 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4084:1: ( ( rule__BinaryDependency__RightHandAssignment_3 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4084:1: ( ( rule__BinaryDependency__RightHandAssignment_3 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4085:1: ( rule__BinaryDependency__RightHandAssignment_3 )
            {
             before(grammarAccess.getBinaryDependencyAccess().getRightHandAssignment_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4086:1: ( rule__BinaryDependency__RightHandAssignment_3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4086:2: rule__BinaryDependency__RightHandAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__RightHandAssignment_3_in_rule__BinaryDependency__Group__3__Impl8083);
            rule__BinaryDependency__RightHandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryDependencyAccess().getRightHandAssignment_3()); 

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
    // $ANTLR end "rule__BinaryDependency__Group__3__Impl"


    // $ANTLR start "rule__BinaryDependency__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4096:1: rule__BinaryDependency__Group__4 : rule__BinaryDependency__Group__4__Impl ;
    public final void rule__BinaryDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4100:1: ( rule__BinaryDependency__Group__4__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4101:2: rule__BinaryDependency__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryDependency__Group__4__Impl_in_rule__BinaryDependency__Group__48113);
            rule__BinaryDependency__Group__4__Impl();

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
    // $ANTLR end "rule__BinaryDependency__Group__4"


    // $ANTLR start "rule__BinaryDependency__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4107:1: rule__BinaryDependency__Group__4__Impl : ( ')' ) ;
    public final void rule__BinaryDependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4111:1: ( ( ')' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4112:1: ( ')' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4112:1: ( ')' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4113:1: ')'
            {
             before(grammarAccess.getBinaryDependencyAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__BinaryDependency__Group__4__Impl8141); 
             after(grammarAccess.getBinaryDependencyAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__BinaryDependency__Group__4__Impl"


    // $ANTLR start "rule__IsSelectedDependency__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4136:1: rule__IsSelectedDependency__Group__0 : rule__IsSelectedDependency__Group__0__Impl rule__IsSelectedDependency__Group__1 ;
    public final void rule__IsSelectedDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4140:1: ( rule__IsSelectedDependency__Group__0__Impl rule__IsSelectedDependency__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4141:2: rule__IsSelectedDependency__Group__0__Impl rule__IsSelectedDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__0__Impl_in_rule__IsSelectedDependency__Group__08182);
            rule__IsSelectedDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__1_in_rule__IsSelectedDependency__Group__08185);
            rule__IsSelectedDependency__Group__1();

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
    // $ANTLR end "rule__IsSelectedDependency__Group__0"


    // $ANTLR start "rule__IsSelectedDependency__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4148:1: rule__IsSelectedDependency__Group__0__Impl : ( '(' ) ;
    public final void rule__IsSelectedDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4152:1: ( ( '(' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4153:1: ( '(' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4153:1: ( '(' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4154:1: '('
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__IsSelectedDependency__Group__0__Impl8213); 
             after(grammarAccess.getIsSelectedDependencyAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__IsSelectedDependency__Group__0__Impl"


    // $ANTLR start "rule__IsSelectedDependency__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4167:1: rule__IsSelectedDependency__Group__1 : rule__IsSelectedDependency__Group__1__Impl rule__IsSelectedDependency__Group__2 ;
    public final void rule__IsSelectedDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4171:1: ( rule__IsSelectedDependency__Group__1__Impl rule__IsSelectedDependency__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4172:2: rule__IsSelectedDependency__Group__1__Impl rule__IsSelectedDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__1__Impl_in_rule__IsSelectedDependency__Group__18244);
            rule__IsSelectedDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__2_in_rule__IsSelectedDependency__Group__18247);
            rule__IsSelectedDependency__Group__2();

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
    // $ANTLR end "rule__IsSelectedDependency__Group__1"


    // $ANTLR start "rule__IsSelectedDependency__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4179:1: rule__IsSelectedDependency__Group__1__Impl : ( ( rule__IsSelectedDependency__TargetAssignment_1 ) ) ;
    public final void rule__IsSelectedDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4183:1: ( ( ( rule__IsSelectedDependency__TargetAssignment_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4184:1: ( ( rule__IsSelectedDependency__TargetAssignment_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4184:1: ( ( rule__IsSelectedDependency__TargetAssignment_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4185:1: ( rule__IsSelectedDependency__TargetAssignment_1 )
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getTargetAssignment_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4186:1: ( rule__IsSelectedDependency__TargetAssignment_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4186:2: rule__IsSelectedDependency__TargetAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__TargetAssignment_1_in_rule__IsSelectedDependency__Group__1__Impl8274);
            rule__IsSelectedDependency__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIsSelectedDependencyAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__IsSelectedDependency__Group__1__Impl"


    // $ANTLR start "rule__IsSelectedDependency__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4196:1: rule__IsSelectedDependency__Group__2 : rule__IsSelectedDependency__Group__2__Impl rule__IsSelectedDependency__Group__3 ;
    public final void rule__IsSelectedDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4200:1: ( rule__IsSelectedDependency__Group__2__Impl rule__IsSelectedDependency__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4201:2: rule__IsSelectedDependency__Group__2__Impl rule__IsSelectedDependency__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__2__Impl_in_rule__IsSelectedDependency__Group__28304);
            rule__IsSelectedDependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__3_in_rule__IsSelectedDependency__Group__28307);
            rule__IsSelectedDependency__Group__3();

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
    // $ANTLR end "rule__IsSelectedDependency__Group__2"


    // $ANTLR start "rule__IsSelectedDependency__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4208:1: rule__IsSelectedDependency__Group__2__Impl : ( 'IS' ) ;
    public final void rule__IsSelectedDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4212:1: ( ( 'IS' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4213:1: ( 'IS' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4213:1: ( 'IS' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4214:1: 'IS'
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getISKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__IsSelectedDependency__Group__2__Impl8335); 
             after(grammarAccess.getIsSelectedDependencyAccess().getISKeyword_2()); 

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
    // $ANTLR end "rule__IsSelectedDependency__Group__2__Impl"


    // $ANTLR start "rule__IsSelectedDependency__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4227:1: rule__IsSelectedDependency__Group__3 : rule__IsSelectedDependency__Group__3__Impl rule__IsSelectedDependency__Group__4 ;
    public final void rule__IsSelectedDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4231:1: ( rule__IsSelectedDependency__Group__3__Impl rule__IsSelectedDependency__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4232:2: rule__IsSelectedDependency__Group__3__Impl rule__IsSelectedDependency__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__3__Impl_in_rule__IsSelectedDependency__Group__38366);
            rule__IsSelectedDependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__4_in_rule__IsSelectedDependency__Group__38369);
            rule__IsSelectedDependency__Group__4();

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
    // $ANTLR end "rule__IsSelectedDependency__Group__3"


    // $ANTLR start "rule__IsSelectedDependency__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4239:1: rule__IsSelectedDependency__Group__3__Impl : ( ( rule__IsSelectedDependency__NotAssignment_3 )? ) ;
    public final void rule__IsSelectedDependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4243:1: ( ( ( rule__IsSelectedDependency__NotAssignment_3 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4244:1: ( ( rule__IsSelectedDependency__NotAssignment_3 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4244:1: ( ( rule__IsSelectedDependency__NotAssignment_3 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4245:1: ( rule__IsSelectedDependency__NotAssignment_3 )?
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getNotAssignment_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4246:1: ( rule__IsSelectedDependency__NotAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4246:2: rule__IsSelectedDependency__NotAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__NotAssignment_3_in_rule__IsSelectedDependency__Group__3__Impl8396);
                    rule__IsSelectedDependency__NotAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIsSelectedDependencyAccess().getNotAssignment_3()); 

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
    // $ANTLR end "rule__IsSelectedDependency__Group__3__Impl"


    // $ANTLR start "rule__IsSelectedDependency__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4256:1: rule__IsSelectedDependency__Group__4 : rule__IsSelectedDependency__Group__4__Impl rule__IsSelectedDependency__Group__5 ;
    public final void rule__IsSelectedDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4260:1: ( rule__IsSelectedDependency__Group__4__Impl rule__IsSelectedDependency__Group__5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4261:2: rule__IsSelectedDependency__Group__4__Impl rule__IsSelectedDependency__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__4__Impl_in_rule__IsSelectedDependency__Group__48427);
            rule__IsSelectedDependency__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__5_in_rule__IsSelectedDependency__Group__48430);
            rule__IsSelectedDependency__Group__5();

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
    // $ANTLR end "rule__IsSelectedDependency__Group__4"


    // $ANTLR start "rule__IsSelectedDependency__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4268:1: rule__IsSelectedDependency__Group__4__Impl : ( 'SELECTED' ) ;
    public final void rule__IsSelectedDependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4272:1: ( ( 'SELECTED' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4273:1: ( 'SELECTED' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4273:1: ( 'SELECTED' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4274:1: 'SELECTED'
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getSELECTEDKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__IsSelectedDependency__Group__4__Impl8458); 
             after(grammarAccess.getIsSelectedDependencyAccess().getSELECTEDKeyword_4()); 

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
    // $ANTLR end "rule__IsSelectedDependency__Group__4__Impl"


    // $ANTLR start "rule__IsSelectedDependency__Group__5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4287:1: rule__IsSelectedDependency__Group__5 : rule__IsSelectedDependency__Group__5__Impl ;
    public final void rule__IsSelectedDependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4291:1: ( rule__IsSelectedDependency__Group__5__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4292:2: rule__IsSelectedDependency__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsSelectedDependency__Group__5__Impl_in_rule__IsSelectedDependency__Group__58489);
            rule__IsSelectedDependency__Group__5__Impl();

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
    // $ANTLR end "rule__IsSelectedDependency__Group__5"


    // $ANTLR start "rule__IsSelectedDependency__Group__5__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4298:1: rule__IsSelectedDependency__Group__5__Impl : ( ')' ) ;
    public final void rule__IsSelectedDependency__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4302:1: ( ( ')' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4303:1: ( ')' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4303:1: ( ')' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4304:1: ')'
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__IsSelectedDependency__Group__5__Impl8517); 
             after(grammarAccess.getIsSelectedDependencyAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__IsSelectedDependency__Group__5__Impl"


    // $ANTLR start "rule__IntegerValueDependency__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4329:1: rule__IntegerValueDependency__Group__0 : rule__IntegerValueDependency__Group__0__Impl rule__IntegerValueDependency__Group__1 ;
    public final void rule__IntegerValueDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4333:1: ( rule__IntegerValueDependency__Group__0__Impl rule__IntegerValueDependency__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4334:2: rule__IntegerValueDependency__Group__0__Impl rule__IntegerValueDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__0__Impl_in_rule__IntegerValueDependency__Group__08560);
            rule__IntegerValueDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__1_in_rule__IntegerValueDependency__Group__08563);
            rule__IntegerValueDependency__Group__1();

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
    // $ANTLR end "rule__IntegerValueDependency__Group__0"


    // $ANTLR start "rule__IntegerValueDependency__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4341:1: rule__IntegerValueDependency__Group__0__Impl : ( '(' ) ;
    public final void rule__IntegerValueDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4345:1: ( ( '(' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4346:1: ( '(' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4346:1: ( '(' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4347:1: '('
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__IntegerValueDependency__Group__0__Impl8591); 
             after(grammarAccess.getIntegerValueDependencyAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__IntegerValueDependency__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueDependency__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4360:1: rule__IntegerValueDependency__Group__1 : rule__IntegerValueDependency__Group__1__Impl rule__IntegerValueDependency__Group__2 ;
    public final void rule__IntegerValueDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4364:1: ( rule__IntegerValueDependency__Group__1__Impl rule__IntegerValueDependency__Group__2 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4365:2: rule__IntegerValueDependency__Group__1__Impl rule__IntegerValueDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__1__Impl_in_rule__IntegerValueDependency__Group__18622);
            rule__IntegerValueDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__2_in_rule__IntegerValueDependency__Group__18625);
            rule__IntegerValueDependency__Group__2();

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
    // $ANTLR end "rule__IntegerValueDependency__Group__1"


    // $ANTLR start "rule__IntegerValueDependency__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4372:1: rule__IntegerValueDependency__Group__1__Impl : ( ( rule__IntegerValueDependency__TargetAssignment_1 ) ) ;
    public final void rule__IntegerValueDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4376:1: ( ( ( rule__IntegerValueDependency__TargetAssignment_1 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4377:1: ( ( rule__IntegerValueDependency__TargetAssignment_1 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4377:1: ( ( rule__IntegerValueDependency__TargetAssignment_1 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4378:1: ( rule__IntegerValueDependency__TargetAssignment_1 )
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getTargetAssignment_1()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4379:1: ( rule__IntegerValueDependency__TargetAssignment_1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4379:2: rule__IntegerValueDependency__TargetAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__TargetAssignment_1_in_rule__IntegerValueDependency__Group__1__Impl8652);
            rule__IntegerValueDependency__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueDependencyAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__IntegerValueDependency__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueDependency__Group__2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4389:1: rule__IntegerValueDependency__Group__2 : rule__IntegerValueDependency__Group__2__Impl rule__IntegerValueDependency__Group__3 ;
    public final void rule__IntegerValueDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4393:1: ( rule__IntegerValueDependency__Group__2__Impl rule__IntegerValueDependency__Group__3 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4394:2: rule__IntegerValueDependency__Group__2__Impl rule__IntegerValueDependency__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__2__Impl_in_rule__IntegerValueDependency__Group__28682);
            rule__IntegerValueDependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__3_in_rule__IntegerValueDependency__Group__28685);
            rule__IntegerValueDependency__Group__3();

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
    // $ANTLR end "rule__IntegerValueDependency__Group__2"


    // $ANTLR start "rule__IntegerValueDependency__Group__2__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4401:1: rule__IntegerValueDependency__Group__2__Impl : ( 'IS' ) ;
    public final void rule__IntegerValueDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4405:1: ( ( 'IS' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4406:1: ( 'IS' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4406:1: ( 'IS' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4407:1: 'IS'
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getISKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__IntegerValueDependency__Group__2__Impl8713); 
             after(grammarAccess.getIntegerValueDependencyAccess().getISKeyword_2()); 

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
    // $ANTLR end "rule__IntegerValueDependency__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueDependency__Group__3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4420:1: rule__IntegerValueDependency__Group__3 : rule__IntegerValueDependency__Group__3__Impl rule__IntegerValueDependency__Group__4 ;
    public final void rule__IntegerValueDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4424:1: ( rule__IntegerValueDependency__Group__3__Impl rule__IntegerValueDependency__Group__4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4425:2: rule__IntegerValueDependency__Group__3__Impl rule__IntegerValueDependency__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__3__Impl_in_rule__IntegerValueDependency__Group__38744);
            rule__IntegerValueDependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__4_in_rule__IntegerValueDependency__Group__38747);
            rule__IntegerValueDependency__Group__4();

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
    // $ANTLR end "rule__IntegerValueDependency__Group__3"


    // $ANTLR start "rule__IntegerValueDependency__Group__3__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4432:1: rule__IntegerValueDependency__Group__3__Impl : ( ( rule__IntegerValueDependency__NotAssignment_3 )? ) ;
    public final void rule__IntegerValueDependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4436:1: ( ( ( rule__IntegerValueDependency__NotAssignment_3 )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4437:1: ( ( rule__IntegerValueDependency__NotAssignment_3 )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4437:1: ( ( rule__IntegerValueDependency__NotAssignment_3 )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4438:1: ( rule__IntegerValueDependency__NotAssignment_3 )?
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getNotAssignment_3()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4439:1: ( rule__IntegerValueDependency__NotAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4439:2: rule__IntegerValueDependency__NotAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__NotAssignment_3_in_rule__IntegerValueDependency__Group__3__Impl8774);
                    rule__IntegerValueDependency__NotAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueDependencyAccess().getNotAssignment_3()); 

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
    // $ANTLR end "rule__IntegerValueDependency__Group__3__Impl"


    // $ANTLR start "rule__IntegerValueDependency__Group__4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4449:1: rule__IntegerValueDependency__Group__4 : rule__IntegerValueDependency__Group__4__Impl rule__IntegerValueDependency__Group__5 ;
    public final void rule__IntegerValueDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4453:1: ( rule__IntegerValueDependency__Group__4__Impl rule__IntegerValueDependency__Group__5 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4454:2: rule__IntegerValueDependency__Group__4__Impl rule__IntegerValueDependency__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__4__Impl_in_rule__IntegerValueDependency__Group__48805);
            rule__IntegerValueDependency__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__5_in_rule__IntegerValueDependency__Group__48808);
            rule__IntegerValueDependency__Group__5();

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
    // $ANTLR end "rule__IntegerValueDependency__Group__4"


    // $ANTLR start "rule__IntegerValueDependency__Group__4__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4461:1: rule__IntegerValueDependency__Group__4__Impl : ( ( rule__IntegerValueDependency__ValueAssignment_4 ) ) ;
    public final void rule__IntegerValueDependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4465:1: ( ( ( rule__IntegerValueDependency__ValueAssignment_4 ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4466:1: ( ( rule__IntegerValueDependency__ValueAssignment_4 ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4466:1: ( ( rule__IntegerValueDependency__ValueAssignment_4 ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4467:1: ( rule__IntegerValueDependency__ValueAssignment_4 )
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getValueAssignment_4()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4468:1: ( rule__IntegerValueDependency__ValueAssignment_4 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4468:2: rule__IntegerValueDependency__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__ValueAssignment_4_in_rule__IntegerValueDependency__Group__4__Impl8835);
            rule__IntegerValueDependency__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueDependencyAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__IntegerValueDependency__Group__4__Impl"


    // $ANTLR start "rule__IntegerValueDependency__Group__5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4478:1: rule__IntegerValueDependency__Group__5 : rule__IntegerValueDependency__Group__5__Impl ;
    public final void rule__IntegerValueDependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4482:1: ( rule__IntegerValueDependency__Group__5__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4483:2: rule__IntegerValueDependency__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValueDependency__Group__5__Impl_in_rule__IntegerValueDependency__Group__58865);
            rule__IntegerValueDependency__Group__5__Impl();

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
    // $ANTLR end "rule__IntegerValueDependency__Group__5"


    // $ANTLR start "rule__IntegerValueDependency__Group__5__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4489:1: rule__IntegerValueDependency__Group__5__Impl : ( ')' ) ;
    public final void rule__IntegerValueDependency__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4493:1: ( ( ')' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4494:1: ( ')' )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4494:1: ( ')' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4495:1: ')'
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__IntegerValueDependency__Group__5__Impl8893); 
             after(grammarAccess.getIntegerValueDependencyAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__IntegerValueDependency__Group__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4520:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4524:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4525:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08936);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08939);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4532:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4536:1: ( ( ( '-' )? ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4537:1: ( ( '-' )? )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4537:1: ( ( '-' )? )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4538:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4539:1: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4540:2: '-'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__EInt__Group__0__Impl8968); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4551:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4555:1: ( rule__EInt__Group__1__Impl )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4556:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19001);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4562:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4566:1: ( ( RULE_INT ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4567:1: ( RULE_INT )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4567:1: ( RULE_INT )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4568:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9028); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Configurator__NameAssignment_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4584:1: rule__Configurator__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Configurator__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4588:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4589:1: ( ruleEString )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4589:1: ( ruleEString )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4590:1: ruleEString
            {
             before(grammarAccess.getConfiguratorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Configurator__NameAssignment_29066);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Configurator__NameAssignment_2"


    // $ANTLR start "rule__Configurator__FeaturesAssignment_4_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4599:1: rule__Configurator__FeaturesAssignment_4_2 : ( ruleFeature ) ;
    public final void rule__Configurator__FeaturesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4603:1: ( ( ruleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4604:1: ( ruleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4604:1: ( ruleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4605:1: ruleFeature
            {
             before(grammarAccess.getConfiguratorAccess().getFeaturesFeatureParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Configurator__FeaturesAssignment_4_29097);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getFeaturesFeatureParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Configurator__FeaturesAssignment_4_2"


    // $ANTLR start "rule__Configurator__FeaturesAssignment_4_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4614:1: rule__Configurator__FeaturesAssignment_4_3_1 : ( ruleFeature ) ;
    public final void rule__Configurator__FeaturesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4618:1: ( ( ruleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4619:1: ( ruleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4619:1: ( ruleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4620:1: ruleFeature
            {
             before(grammarAccess.getConfiguratorAccess().getFeaturesFeatureParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Configurator__FeaturesAssignment_4_3_19128);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getFeaturesFeatureParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Configurator__FeaturesAssignment_4_3_1"


    // $ANTLR start "rule__Configurator__GroupsAssignment_5_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4629:1: rule__Configurator__GroupsAssignment_5_2 : ( ruleGroup ) ;
    public final void rule__Configurator__GroupsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4633:1: ( ( ruleGroup ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4634:1: ( ruleGroup )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4634:1: ( ruleGroup )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4635:1: ruleGroup
            {
             before(grammarAccess.getConfiguratorAccess().getGroupsGroupParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Configurator__GroupsAssignment_5_29159);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getGroupsGroupParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Configurator__GroupsAssignment_5_2"


    // $ANTLR start "rule__Configurator__GroupsAssignment_5_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4644:1: rule__Configurator__GroupsAssignment_5_3_1 : ( ruleGroup ) ;
    public final void rule__Configurator__GroupsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4648:1: ( ( ruleGroup ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4649:1: ( ruleGroup )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4649:1: ( ruleGroup )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4650:1: ruleGroup
            {
             before(grammarAccess.getConfiguratorAccess().getGroupsGroupParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Configurator__GroupsAssignment_5_3_19190);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getConfiguratorAccess().getGroupsGroupParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Configurator__GroupsAssignment_5_3_1"


    // $ANTLR start "rule__Group__GroupTypeAssignment_0"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4659:1: rule__Group__GroupTypeAssignment_0 : ( ruleGroupType ) ;
    public final void rule__Group__GroupTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4663:1: ( ( ruleGroupType ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4664:1: ( ruleGroupType )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4664:1: ( ruleGroupType )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4665:1: ruleGroupType
            {
             before(grammarAccess.getGroupAccess().getGroupTypeGroupTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupType_in_rule__Group__GroupTypeAssignment_09221);
            ruleGroupType();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getGroupTypeGroupTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Group__GroupTypeAssignment_0"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4674:1: rule__Group__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4678:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4679:1: ( ruleEString )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4679:1: ( ruleEString )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4680:1: ruleEString
            {
             before(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Group__NameAssignment_19252);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__FeaturesAssignment_3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4689:1: rule__Group__FeaturesAssignment_3 : ( ruleSimpleFeature ) ;
    public final void rule__Group__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4693:1: ( ( ruleSimpleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4694:1: ( ruleSimpleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4694:1: ( ruleSimpleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4695:1: ruleSimpleFeature
            {
             before(grammarAccess.getGroupAccess().getFeaturesSimpleFeatureParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_rule__Group__FeaturesAssignment_39283);
            ruleSimpleFeature();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getFeaturesSimpleFeatureParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Group__FeaturesAssignment_3"


    // $ANTLR start "rule__Group__FeaturesAssignment_4_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4704:1: rule__Group__FeaturesAssignment_4_1 : ( ruleSimpleFeature ) ;
    public final void rule__Group__FeaturesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4708:1: ( ( ruleSimpleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4709:1: ( ruleSimpleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4709:1: ( ruleSimpleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4710:1: ruleSimpleFeature
            {
             before(grammarAccess.getGroupAccess().getFeaturesSimpleFeatureParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleFeature_in_rule__Group__FeaturesAssignment_4_19314);
            ruleSimpleFeature();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getFeaturesSimpleFeatureParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Group__FeaturesAssignment_4_1"


    // $ANTLR start "rule__SimpleFeature__MandatoryAssignment_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4719:1: rule__SimpleFeature__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__SimpleFeature__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4723:1: ( ( ( 'mandatory' ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4724:1: ( ( 'mandatory' ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4724:1: ( ( 'mandatory' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4725:1: ( 'mandatory' )
            {
             before(grammarAccess.getSimpleFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4726:1: ( 'mandatory' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4727:1: 'mandatory'
            {
             before(grammarAccess.getSimpleFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SimpleFeature__MandatoryAssignment_19350); 
             after(grammarAccess.getSimpleFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getSimpleFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 

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
    // $ANTLR end "rule__SimpleFeature__MandatoryAssignment_1"


    // $ANTLR start "rule__SimpleFeature__NameAssignment_3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4742:1: rule__SimpleFeature__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__SimpleFeature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4746:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4747:1: ( ruleEString )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4747:1: ( ruleEString )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4748:1: ruleEString
            {
             before(grammarAccess.getSimpleFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleFeature__NameAssignment_39389);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SimpleFeature__NameAssignment_3"


    // $ANTLR start "rule__SimpleFeature__DependenciesAssignment_5_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4757:1: rule__SimpleFeature__DependenciesAssignment_5_2 : ( ruleDependency ) ;
    public final void rule__SimpleFeature__DependenciesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4761:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4762:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4762:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4763:1: ruleDependency
            {
             before(grammarAccess.getSimpleFeatureAccess().getDependenciesDependencyParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__SimpleFeature__DependenciesAssignment_5_29420);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureAccess().getDependenciesDependencyParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__SimpleFeature__DependenciesAssignment_5_2"


    // $ANTLR start "rule__SimpleFeature__DependenciesAssignment_5_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4772:1: rule__SimpleFeature__DependenciesAssignment_5_3_1 : ( ruleDependency ) ;
    public final void rule__SimpleFeature__DependenciesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4776:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4777:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4777:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4778:1: ruleDependency
            {
             before(grammarAccess.getSimpleFeatureAccess().getDependenciesDependencyParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__SimpleFeature__DependenciesAssignment_5_3_19451);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureAccess().getDependenciesDependencyParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__SimpleFeature__DependenciesAssignment_5_3_1"


    // $ANTLR start "rule__SimpleFeature__FeaturesAssignment_6_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4787:1: rule__SimpleFeature__FeaturesAssignment_6_2 : ( ruleFeature ) ;
    public final void rule__SimpleFeature__FeaturesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4791:1: ( ( ruleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4792:1: ( ruleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4792:1: ( ruleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4793:1: ruleFeature
            {
             before(grammarAccess.getSimpleFeatureAccess().getFeaturesFeatureParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__SimpleFeature__FeaturesAssignment_6_29482);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureAccess().getFeaturesFeatureParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__SimpleFeature__FeaturesAssignment_6_2"


    // $ANTLR start "rule__SimpleFeature__FeaturesAssignment_6_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4802:1: rule__SimpleFeature__FeaturesAssignment_6_3_1 : ( ruleFeature ) ;
    public final void rule__SimpleFeature__FeaturesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4806:1: ( ( ruleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4807:1: ( ruleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4807:1: ( ruleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4808:1: ruleFeature
            {
             before(grammarAccess.getSimpleFeatureAccess().getFeaturesFeatureParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__SimpleFeature__FeaturesAssignment_6_3_19513);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureAccess().getFeaturesFeatureParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__SimpleFeature__FeaturesAssignment_6_3_1"


    // $ANTLR start "rule__SimpleFeature__GroupsAssignment_7_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4817:1: rule__SimpleFeature__GroupsAssignment_7_2 : ( ruleGroup ) ;
    public final void rule__SimpleFeature__GroupsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4821:1: ( ( ruleGroup ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4822:1: ( ruleGroup )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4822:1: ( ruleGroup )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4823:1: ruleGroup
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroupsGroupParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SimpleFeature__GroupsAssignment_7_29544);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureAccess().getGroupsGroupParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__SimpleFeature__GroupsAssignment_7_2"


    // $ANTLR start "rule__SimpleFeature__GroupsAssignment_7_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4832:1: rule__SimpleFeature__GroupsAssignment_7_3_1 : ( ruleGroup ) ;
    public final void rule__SimpleFeature__GroupsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4836:1: ( ( ruleGroup ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4837:1: ( ruleGroup )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4837:1: ( ruleGroup )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4838:1: ruleGroup
            {
             before(grammarAccess.getSimpleFeatureAccess().getGroupsGroupParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SimpleFeature__GroupsAssignment_7_3_19575);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSimpleFeatureAccess().getGroupsGroupParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__SimpleFeature__GroupsAssignment_7_3_1"


    // $ANTLR start "rule__IntegerFeature__MandatoryAssignment_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4847:1: rule__IntegerFeature__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__IntegerFeature__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4851:1: ( ( ( 'mandatory' ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4852:1: ( ( 'mandatory' ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4852:1: ( ( 'mandatory' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4853:1: ( 'mandatory' )
            {
             before(grammarAccess.getIntegerFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4854:1: ( 'mandatory' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4855:1: 'mandatory'
            {
             before(grammarAccess.getIntegerFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__IntegerFeature__MandatoryAssignment_19611); 
             after(grammarAccess.getIntegerFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getIntegerFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 

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
    // $ANTLR end "rule__IntegerFeature__MandatoryAssignment_1"


    // $ANTLR start "rule__IntegerFeature__NameAssignment_3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4870:1: rule__IntegerFeature__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__IntegerFeature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4874:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4875:1: ( ruleEString )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4875:1: ( ruleEString )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4876:1: ruleEString
            {
             before(grammarAccess.getIntegerFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerFeature__NameAssignment_39650);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IntegerFeature__NameAssignment_3"


    // $ANTLR start "rule__IntegerFeature__MinValueAssignment_5_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4885:1: rule__IntegerFeature__MinValueAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__IntegerFeature__MinValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4889:1: ( ( ruleEInt ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4890:1: ( ruleEInt )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4890:1: ( ruleEInt )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4891:1: ruleEInt
            {
             before(grammarAccess.getIntegerFeatureAccess().getMinValueEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerFeature__MinValueAssignment_5_19681);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getMinValueEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__IntegerFeature__MinValueAssignment_5_1"


    // $ANTLR start "rule__IntegerFeature__MaxValueAssignment_6_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4900:1: rule__IntegerFeature__MaxValueAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__IntegerFeature__MaxValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4904:1: ( ( ruleEInt ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4905:1: ( ruleEInt )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4905:1: ( ruleEInt )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4906:1: ruleEInt
            {
             before(grammarAccess.getIntegerFeatureAccess().getMaxValueEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerFeature__MaxValueAssignment_6_19712);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getMaxValueEIntParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__IntegerFeature__MaxValueAssignment_6_1"


    // $ANTLR start "rule__IntegerFeature__StepAssignment_7_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4915:1: rule__IntegerFeature__StepAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__IntegerFeature__StepAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4919:1: ( ( ruleEInt ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4920:1: ( ruleEInt )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4920:1: ( ruleEInt )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4921:1: ruleEInt
            {
             before(grammarAccess.getIntegerFeatureAccess().getStepEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerFeature__StepAssignment_7_19743);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getStepEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__IntegerFeature__StepAssignment_7_1"


    // $ANTLR start "rule__IntegerFeature__DependenciesAssignment_8_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4930:1: rule__IntegerFeature__DependenciesAssignment_8_2 : ( ruleDependency ) ;
    public final void rule__IntegerFeature__DependenciesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4934:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4935:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4935:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4936:1: ruleDependency
            {
             before(grammarAccess.getIntegerFeatureAccess().getDependenciesDependencyParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__IntegerFeature__DependenciesAssignment_8_29774);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getDependenciesDependencyParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__IntegerFeature__DependenciesAssignment_8_2"


    // $ANTLR start "rule__IntegerFeature__DependenciesAssignment_8_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4945:1: rule__IntegerFeature__DependenciesAssignment_8_3_1 : ( ruleDependency ) ;
    public final void rule__IntegerFeature__DependenciesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4949:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4950:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4950:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4951:1: ruleDependency
            {
             before(grammarAccess.getIntegerFeatureAccess().getDependenciesDependencyParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__IntegerFeature__DependenciesAssignment_8_3_19805);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getDependenciesDependencyParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__IntegerFeature__DependenciesAssignment_8_3_1"


    // $ANTLR start "rule__IntegerFeature__FeaturesAssignment_9_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4960:1: rule__IntegerFeature__FeaturesAssignment_9_2 : ( ruleFeature ) ;
    public final void rule__IntegerFeature__FeaturesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4964:1: ( ( ruleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4965:1: ( ruleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4965:1: ( ruleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4966:1: ruleFeature
            {
             before(grammarAccess.getIntegerFeatureAccess().getFeaturesFeatureParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__IntegerFeature__FeaturesAssignment_9_29836);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getFeaturesFeatureParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__IntegerFeature__FeaturesAssignment_9_2"


    // $ANTLR start "rule__IntegerFeature__FeaturesAssignment_9_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4975:1: rule__IntegerFeature__FeaturesAssignment_9_3_1 : ( ruleFeature ) ;
    public final void rule__IntegerFeature__FeaturesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4979:1: ( ( ruleFeature ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4980:1: ( ruleFeature )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4980:1: ( ruleFeature )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4981:1: ruleFeature
            {
             before(grammarAccess.getIntegerFeatureAccess().getFeaturesFeatureParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__IntegerFeature__FeaturesAssignment_9_3_19867);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getFeaturesFeatureParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__IntegerFeature__FeaturesAssignment_9_3_1"


    // $ANTLR start "rule__IntegerFeature__GroupsAssignment_10_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4990:1: rule__IntegerFeature__GroupsAssignment_10_2 : ( ruleGroup ) ;
    public final void rule__IntegerFeature__GroupsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4994:1: ( ( ruleGroup ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4995:1: ( ruleGroup )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4995:1: ( ruleGroup )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:4996:1: ruleGroup
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroupsGroupParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__IntegerFeature__GroupsAssignment_10_29898);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getGroupsGroupParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__IntegerFeature__GroupsAssignment_10_2"


    // $ANTLR start "rule__IntegerFeature__GroupsAssignment_10_3_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5005:1: rule__IntegerFeature__GroupsAssignment_10_3_1 : ( ruleGroup ) ;
    public final void rule__IntegerFeature__GroupsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5009:1: ( ( ruleGroup ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5010:1: ( ruleGroup )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5010:1: ( ruleGroup )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5011:1: ruleGroup
            {
             before(grammarAccess.getIntegerFeatureAccess().getGroupsGroupParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__IntegerFeature__GroupsAssignment_10_3_19929);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getIntegerFeatureAccess().getGroupsGroupParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__IntegerFeature__GroupsAssignment_10_3_1"


    // $ANTLR start "rule__BinaryNotDependency__NotAssignment_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5020:1: rule__BinaryNotDependency__NotAssignment_1 : ( ( 'NOT' ) ) ;
    public final void rule__BinaryNotDependency__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5024:1: ( ( ( 'NOT' ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5025:1: ( ( 'NOT' ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5025:1: ( ( 'NOT' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5026:1: ( 'NOT' )
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getNotNOTKeyword_1_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5027:1: ( 'NOT' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5028:1: 'NOT'
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getNotNOTKeyword_1_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BinaryNotDependency__NotAssignment_19965); 
             after(grammarAccess.getBinaryNotDependencyAccess().getNotNOTKeyword_1_0()); 

            }

             after(grammarAccess.getBinaryNotDependencyAccess().getNotNOTKeyword_1_0()); 

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
    // $ANTLR end "rule__BinaryNotDependency__NotAssignment_1"


    // $ANTLR start "rule__BinaryNotDependency__LeftHandAssignment_3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5043:1: rule__BinaryNotDependency__LeftHandAssignment_3 : ( ruleDependency ) ;
    public final void rule__BinaryNotDependency__LeftHandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5047:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5048:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5048:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5049:1: ruleDependency
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getLeftHandDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__BinaryNotDependency__LeftHandAssignment_310004);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getBinaryNotDependencyAccess().getLeftHandDependencyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BinaryNotDependency__LeftHandAssignment_3"


    // $ANTLR start "rule__BinaryNotDependency__OperatorAssignment_4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5058:1: rule__BinaryNotDependency__OperatorAssignment_4 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryNotDependency__OperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5062:1: ( ( ruleBinaryOperator ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5063:1: ( ruleBinaryOperator )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5063:1: ( ruleBinaryOperator )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5064:1: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getOperatorBinaryOperatorEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_rule__BinaryNotDependency__OperatorAssignment_410035);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryNotDependencyAccess().getOperatorBinaryOperatorEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__BinaryNotDependency__OperatorAssignment_4"


    // $ANTLR start "rule__BinaryNotDependency__RightHandAssignment_5"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5073:1: rule__BinaryNotDependency__RightHandAssignment_5 : ( ruleDependency ) ;
    public final void rule__BinaryNotDependency__RightHandAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5077:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5078:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5078:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5079:1: ruleDependency
            {
             before(grammarAccess.getBinaryNotDependencyAccess().getRightHandDependencyParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__BinaryNotDependency__RightHandAssignment_510066);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getBinaryNotDependencyAccess().getRightHandDependencyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__BinaryNotDependency__RightHandAssignment_5"


    // $ANTLR start "rule__BinaryDependency__LeftHandAssignment_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5088:1: rule__BinaryDependency__LeftHandAssignment_1 : ( ruleDependency ) ;
    public final void rule__BinaryDependency__LeftHandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5092:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5093:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5093:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5094:1: ruleDependency
            {
             before(grammarAccess.getBinaryDependencyAccess().getLeftHandDependencyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__BinaryDependency__LeftHandAssignment_110097);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getBinaryDependencyAccess().getLeftHandDependencyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BinaryDependency__LeftHandAssignment_1"


    // $ANTLR start "rule__BinaryDependency__OperatorAssignment_2"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5103:1: rule__BinaryDependency__OperatorAssignment_2 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryDependency__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5107:1: ( ( ruleBinaryOperator ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5108:1: ( ruleBinaryOperator )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5108:1: ( ruleBinaryOperator )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5109:1: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryDependencyAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_rule__BinaryDependency__OperatorAssignment_210128);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryDependencyAccess().getOperatorBinaryOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__BinaryDependency__OperatorAssignment_2"


    // $ANTLR start "rule__BinaryDependency__RightHandAssignment_3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5118:1: rule__BinaryDependency__RightHandAssignment_3 : ( ruleDependency ) ;
    public final void rule__BinaryDependency__RightHandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5122:1: ( ( ruleDependency ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5123:1: ( ruleDependency )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5123:1: ( ruleDependency )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5124:1: ruleDependency
            {
             before(grammarAccess.getBinaryDependencyAccess().getRightHandDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__BinaryDependency__RightHandAssignment_310159);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getBinaryDependencyAccess().getRightHandDependencyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BinaryDependency__RightHandAssignment_3"


    // $ANTLR start "rule__IsSelectedDependency__TargetAssignment_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5133:1: rule__IsSelectedDependency__TargetAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__IsSelectedDependency__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5137:1: ( ( ( ruleEString ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5138:1: ( ( ruleEString ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5138:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5139:1: ( ruleEString )
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getTargetFeatureCrossReference_1_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5140:1: ( ruleEString )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5141:1: ruleEString
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getTargetFeatureEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IsSelectedDependency__TargetAssignment_110194);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIsSelectedDependencyAccess().getTargetFeatureEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIsSelectedDependencyAccess().getTargetFeatureCrossReference_1_0()); 

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
    // $ANTLR end "rule__IsSelectedDependency__TargetAssignment_1"


    // $ANTLR start "rule__IsSelectedDependency__NotAssignment_3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5152:1: rule__IsSelectedDependency__NotAssignment_3 : ( ( 'NOT' ) ) ;
    public final void rule__IsSelectedDependency__NotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5156:1: ( ( ( 'NOT' ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5157:1: ( ( 'NOT' ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5157:1: ( ( 'NOT' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5158:1: ( 'NOT' )
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getNotNOTKeyword_3_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5159:1: ( 'NOT' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5160:1: 'NOT'
            {
             before(grammarAccess.getIsSelectedDependencyAccess().getNotNOTKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__IsSelectedDependency__NotAssignment_310234); 
             after(grammarAccess.getIsSelectedDependencyAccess().getNotNOTKeyword_3_0()); 

            }

             after(grammarAccess.getIsSelectedDependencyAccess().getNotNOTKeyword_3_0()); 

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
    // $ANTLR end "rule__IsSelectedDependency__NotAssignment_3"


    // $ANTLR start "rule__IntegerValueDependency__TargetAssignment_1"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5175:1: rule__IntegerValueDependency__TargetAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__IntegerValueDependency__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5179:1: ( ( ( ruleEString ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5180:1: ( ( ruleEString ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5180:1: ( ( ruleEString ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5181:1: ( ruleEString )
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getTargetIntegerFeatureCrossReference_1_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5182:1: ( ruleEString )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5183:1: ruleEString
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getTargetIntegerFeatureEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerValueDependency__TargetAssignment_110277);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueDependencyAccess().getTargetIntegerFeatureEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIntegerValueDependencyAccess().getTargetIntegerFeatureCrossReference_1_0()); 

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
    // $ANTLR end "rule__IntegerValueDependency__TargetAssignment_1"


    // $ANTLR start "rule__IntegerValueDependency__NotAssignment_3"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5194:1: rule__IntegerValueDependency__NotAssignment_3 : ( ( 'NOT' ) ) ;
    public final void rule__IntegerValueDependency__NotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5198:1: ( ( ( 'NOT' ) ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5199:1: ( ( 'NOT' ) )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5199:1: ( ( 'NOT' ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5200:1: ( 'NOT' )
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getNotNOTKeyword_3_0()); 
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5201:1: ( 'NOT' )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5202:1: 'NOT'
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getNotNOTKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__IntegerValueDependency__NotAssignment_310317); 
             after(grammarAccess.getIntegerValueDependencyAccess().getNotNOTKeyword_3_0()); 

            }

             after(grammarAccess.getIntegerValueDependencyAccess().getNotNOTKeyword_3_0()); 

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
    // $ANTLR end "rule__IntegerValueDependency__NotAssignment_3"


    // $ANTLR start "rule__IntegerValueDependency__ValueAssignment_4"
    // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5217:1: rule__IntegerValueDependency__ValueAssignment_4 : ( ruleEInt ) ;
    public final void rule__IntegerValueDependency__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5221:1: ( ( ruleEInt ) )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5222:1: ( ruleEInt )
            {
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5222:1: ( ruleEInt )
            // ../assignment6_configurator_DSL.ui/src-gen/org/xtext/example/assignment6/ui/contentassist/antlr/internal/InternalConfiguratorDSL.g:5223:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueDependencyAccess().getValueEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerValueDependency__ValueAssignment_410356);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueDependencyAccess().getValueEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IntegerValueDependency__ValueAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfigurator_in_entryRuleConfigurator61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurator68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__0_in_ruleConfigurator94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_entryRuleSimpleFeature303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFeature310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__0_in_ruleSimpleFeature336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerFeature_in_entryRuleIntegerFeature363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerFeature370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__0_in_ruleIntegerFeature396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Alternatives_in_ruleDependency456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseBinaryDependency_in_entryRuleBaseBinaryDependency483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBaseBinaryDependency490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BaseBinaryDependency__Alternatives_in_ruleBaseBinaryDependency516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryNotDependency_in_entryRuleBinaryNotDependency543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryNotDependency550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__0_in_ruleBinaryNotDependency576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryDependency_in_entryRuleBinaryDependency603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryDependency610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__0_in_ruleBinaryDependency636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsSelectedDependency_in_entryRuleIsSelectedDependency663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsSelectedDependency670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__0_in_ruleIsSelectedDependency696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValueDependency_in_entryRuleIntegerValueDependency723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValueDependency730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__0_in_ruleIntegerValueDependency756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupType__Alternatives_in_ruleGroupType889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_rule__Feature__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerFeature_in_rule__Feature__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBaseBinaryDependency_in_rule__Dependency__Alternatives1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsSelectedDependency_in_rule__Dependency__Alternatives1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValueDependency_in_rule__Dependency__Alternatives1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryNotDependency_in_rule__BaseBinaryDependency__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryDependency_in_rule__BaseBinaryDependency__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__BinaryOperator__Alternatives1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BinaryOperator__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__GroupType__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GroupType__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__0__Impl_in_rule__Configurator__Group__01250 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1_in_rule__Configurator__Group__01253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__1__Impl_in_rule__Configurator__Group__11311 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2_in_rule__Configurator__Group__11314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Configurator__Group__1__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__2__Impl_in_rule__Configurator__Group__21373 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3_in_rule__Configurator__Group__21376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__NameAssignment_2_in_rule__Configurator__Group__2__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__3__Impl_in_rule__Configurator__Group__31433 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4_in_rule__Configurator__Group__31436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Configurator__Group__3__Impl1464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__4__Impl_in_rule__Configurator__Group__41495 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5_in_rule__Configurator__Group__41498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__0_in_rule__Configurator__Group__4__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__5__Impl_in_rule__Configurator__Group__51556 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6_in_rule__Configurator__Group__51559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0_in_rule__Configurator__Group__5__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group__6__Impl_in_rule__Configurator__Group__61617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Configurator__Group__6__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__0__Impl_in_rule__Configurator__Group_4__01690 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__1_in_rule__Configurator__Group_4__01693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Configurator__Group_4__0__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__1__Impl_in_rule__Configurator__Group_4__11752 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__2_in_rule__Configurator__Group_4__11755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Configurator__Group_4__1__Impl1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__2__Impl_in_rule__Configurator__Group_4__21814 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__3_in_rule__Configurator__Group_4__21817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__FeaturesAssignment_4_2_in_rule__Configurator__Group_4__2__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__3__Impl_in_rule__Configurator__Group_4__31874 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__4_in_rule__Configurator__Group_4__31877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4_3__0_in_rule__Configurator__Group_4__3__Impl1904 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4__4__Impl_in_rule__Configurator__Group_4__41935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Configurator__Group_4__4__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4_3__0__Impl_in_rule__Configurator__Group_4_3__02004 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4_3__1_in_rule__Configurator__Group_4_3__02007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Configurator__Group_4_3__0__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_4_3__1__Impl_in_rule__Configurator__Group_4_3__12066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__FeaturesAssignment_4_3_1_in_rule__Configurator__Group_4_3__1__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__0__Impl_in_rule__Configurator__Group_5__02127 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1_in_rule__Configurator__Group_5__02130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Configurator__Group_5__0__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__1__Impl_in_rule__Configurator__Group_5__12189 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__2_in_rule__Configurator__Group_5__12192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Configurator__Group_5__1__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__2__Impl_in_rule__Configurator__Group_5__22251 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__3_in_rule__Configurator__Group_5__22254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__GroupsAssignment_5_2_in_rule__Configurator__Group_5__2__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__3__Impl_in_rule__Configurator__Group_5__32311 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__4_in_rule__Configurator__Group_5__32314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5_3__0_in_rule__Configurator__Group_5__3__Impl2341 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5__4__Impl_in_rule__Configurator__Group_5__42372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Configurator__Group_5__4__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5_3__0__Impl_in_rule__Configurator__Group_5_3__02441 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5_3__1_in_rule__Configurator__Group_5_3__02444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Configurator__Group_5_3__0__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__Group_5_3__1__Impl_in_rule__Configurator__Group_5_3__12503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configurator__GroupsAssignment_5_3_1_in_rule__Configurator__Group_5_3__1__Impl2530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__02564 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__02567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupTypeAssignment_0_in_rule__Group__Group__0__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__12624 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__12627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__22684 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__22687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Group__Group__2__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__32746 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__32749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__FeaturesAssignment_3_in_rule__Group__Group__3__Impl2776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__42806 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__42809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl2836 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__52867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Group__Group__5__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__02938 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__02941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Group__Group_4__0__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__13000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__FeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__0__Impl_in_rule__SimpleFeature__Group__03061 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__1_in_rule__SimpleFeature__Group__03064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__1__Impl_in_rule__SimpleFeature__Group__13122 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__2_in_rule__SimpleFeature__Group__13125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__MandatoryAssignment_1_in_rule__SimpleFeature__Group__1__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__2__Impl_in_rule__SimpleFeature__Group__23183 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__3_in_rule__SimpleFeature__Group__23186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__SimpleFeature__Group__2__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__3__Impl_in_rule__SimpleFeature__Group__33245 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__4_in_rule__SimpleFeature__Group__33248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__NameAssignment_3_in_rule__SimpleFeature__Group__3__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__4__Impl_in_rule__SimpleFeature__Group__43305 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__5_in_rule__SimpleFeature__Group__43308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__SimpleFeature__Group__4__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__5__Impl_in_rule__SimpleFeature__Group__53367 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__6_in_rule__SimpleFeature__Group__53370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__0_in_rule__SimpleFeature__Group__5__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__6__Impl_in_rule__SimpleFeature__Group__63428 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__7_in_rule__SimpleFeature__Group__63431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__0_in_rule__SimpleFeature__Group__6__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__7__Impl_in_rule__SimpleFeature__Group__73489 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__8_in_rule__SimpleFeature__Group__73492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__0_in_rule__SimpleFeature__Group__7__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group__8__Impl_in_rule__SimpleFeature__Group__83550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SimpleFeature__Group__8__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__0__Impl_in_rule__SimpleFeature__Group_5__03627 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__1_in_rule__SimpleFeature__Group_5__03630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SimpleFeature__Group_5__0__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__1__Impl_in_rule__SimpleFeature__Group_5__13689 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__2_in_rule__SimpleFeature__Group_5__13692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__SimpleFeature__Group_5__1__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__2__Impl_in_rule__SimpleFeature__Group_5__23751 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__3_in_rule__SimpleFeature__Group_5__23754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__DependenciesAssignment_5_2_in_rule__SimpleFeature__Group_5__2__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__3__Impl_in_rule__SimpleFeature__Group_5__33811 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__4_in_rule__SimpleFeature__Group_5__33814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5_3__0_in_rule__SimpleFeature__Group_5__3__Impl3841 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5__4__Impl_in_rule__SimpleFeature__Group_5__43872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SimpleFeature__Group_5__4__Impl3900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5_3__0__Impl_in_rule__SimpleFeature__Group_5_3__03941 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5_3__1_in_rule__SimpleFeature__Group_5_3__03944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleFeature__Group_5_3__0__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_5_3__1__Impl_in_rule__SimpleFeature__Group_5_3__14003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__DependenciesAssignment_5_3_1_in_rule__SimpleFeature__Group_5_3__1__Impl4030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__0__Impl_in_rule__SimpleFeature__Group_6__04064 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__1_in_rule__SimpleFeature__Group_6__04067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SimpleFeature__Group_6__0__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__1__Impl_in_rule__SimpleFeature__Group_6__14126 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__2_in_rule__SimpleFeature__Group_6__14129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__SimpleFeature__Group_6__1__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__2__Impl_in_rule__SimpleFeature__Group_6__24188 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__3_in_rule__SimpleFeature__Group_6__24191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__FeaturesAssignment_6_2_in_rule__SimpleFeature__Group_6__2__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__3__Impl_in_rule__SimpleFeature__Group_6__34248 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__4_in_rule__SimpleFeature__Group_6__34251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6_3__0_in_rule__SimpleFeature__Group_6__3__Impl4278 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6__4__Impl_in_rule__SimpleFeature__Group_6__44309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SimpleFeature__Group_6__4__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6_3__0__Impl_in_rule__SimpleFeature__Group_6_3__04378 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6_3__1_in_rule__SimpleFeature__Group_6_3__04381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleFeature__Group_6_3__0__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_6_3__1__Impl_in_rule__SimpleFeature__Group_6_3__14440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__FeaturesAssignment_6_3_1_in_rule__SimpleFeature__Group_6_3__1__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__0__Impl_in_rule__SimpleFeature__Group_7__04501 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__1_in_rule__SimpleFeature__Group_7__04504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__SimpleFeature__Group_7__0__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__1__Impl_in_rule__SimpleFeature__Group_7__14563 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__2_in_rule__SimpleFeature__Group_7__14566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__SimpleFeature__Group_7__1__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__2__Impl_in_rule__SimpleFeature__Group_7__24625 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__3_in_rule__SimpleFeature__Group_7__24628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__GroupsAssignment_7_2_in_rule__SimpleFeature__Group_7__2__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__3__Impl_in_rule__SimpleFeature__Group_7__34685 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__4_in_rule__SimpleFeature__Group_7__34688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7_3__0_in_rule__SimpleFeature__Group_7__3__Impl4715 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7__4__Impl_in_rule__SimpleFeature__Group_7__44746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SimpleFeature__Group_7__4__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7_3__0__Impl_in_rule__SimpleFeature__Group_7_3__04815 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7_3__1_in_rule__SimpleFeature__Group_7_3__04818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleFeature__Group_7_3__0__Impl4846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__Group_7_3__1__Impl_in_rule__SimpleFeature__Group_7_3__14877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleFeature__GroupsAssignment_7_3_1_in_rule__SimpleFeature__Group_7_3__1__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__0__Impl_in_rule__IntegerFeature__Group__04938 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__1_in_rule__IntegerFeature__Group__04941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__1__Impl_in_rule__IntegerFeature__Group__14999 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__2_in_rule__IntegerFeature__Group__15002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__MandatoryAssignment_1_in_rule__IntegerFeature__Group__1__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__2__Impl_in_rule__IntegerFeature__Group__25060 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__3_in_rule__IntegerFeature__Group__25063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IntegerFeature__Group__2__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__3__Impl_in_rule__IntegerFeature__Group__35122 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__4_in_rule__IntegerFeature__Group__35125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__NameAssignment_3_in_rule__IntegerFeature__Group__3__Impl5152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__4__Impl_in_rule__IntegerFeature__Group__45182 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__5_in_rule__IntegerFeature__Group__45185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntegerFeature__Group__4__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__5__Impl_in_rule__IntegerFeature__Group__55244 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__6_in_rule__IntegerFeature__Group__55247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_5__0_in_rule__IntegerFeature__Group__5__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__6__Impl_in_rule__IntegerFeature__Group__65304 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__7_in_rule__IntegerFeature__Group__65307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_6__0_in_rule__IntegerFeature__Group__6__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__7__Impl_in_rule__IntegerFeature__Group__75364 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__8_in_rule__IntegerFeature__Group__75367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_7__0_in_rule__IntegerFeature__Group__7__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__8__Impl_in_rule__IntegerFeature__Group__85424 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__9_in_rule__IntegerFeature__Group__85427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__0_in_rule__IntegerFeature__Group__8__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__9__Impl_in_rule__IntegerFeature__Group__95485 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__10_in_rule__IntegerFeature__Group__95488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__0_in_rule__IntegerFeature__Group__9__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__10__Impl_in_rule__IntegerFeature__Group__105546 = new BitSet(new long[]{0x0000000000560000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__11_in_rule__IntegerFeature__Group__105549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__0_in_rule__IntegerFeature__Group__10__Impl5576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group__11__Impl_in_rule__IntegerFeature__Group__115607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IntegerFeature__Group__11__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_5__0__Impl_in_rule__IntegerFeature__Group_5__05690 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_5__1_in_rule__IntegerFeature__Group_5__05693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__IntegerFeature__Group_5__0__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_5__1__Impl_in_rule__IntegerFeature__Group_5__15752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__MinValueAssignment_5_1_in_rule__IntegerFeature__Group_5__1__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_6__0__Impl_in_rule__IntegerFeature__Group_6__05813 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_6__1_in_rule__IntegerFeature__Group_6__05816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__IntegerFeature__Group_6__0__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_6__1__Impl_in_rule__IntegerFeature__Group_6__15875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__MaxValueAssignment_6_1_in_rule__IntegerFeature__Group_6__1__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_7__0__Impl_in_rule__IntegerFeature__Group_7__05936 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_7__1_in_rule__IntegerFeature__Group_7__05939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__IntegerFeature__Group_7__0__Impl5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_7__1__Impl_in_rule__IntegerFeature__Group_7__15998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__StepAssignment_7_1_in_rule__IntegerFeature__Group_7__1__Impl6025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__0__Impl_in_rule__IntegerFeature__Group_8__06059 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__1_in_rule__IntegerFeature__Group_8__06062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IntegerFeature__Group_8__0__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__1__Impl_in_rule__IntegerFeature__Group_8__16121 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__2_in_rule__IntegerFeature__Group_8__16124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntegerFeature__Group_8__1__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__2__Impl_in_rule__IntegerFeature__Group_8__26183 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__3_in_rule__IntegerFeature__Group_8__26186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__DependenciesAssignment_8_2_in_rule__IntegerFeature__Group_8__2__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__3__Impl_in_rule__IntegerFeature__Group_8__36243 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__4_in_rule__IntegerFeature__Group_8__36246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8_3__0_in_rule__IntegerFeature__Group_8__3__Impl6273 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8__4__Impl_in_rule__IntegerFeature__Group_8__46304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IntegerFeature__Group_8__4__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8_3__0__Impl_in_rule__IntegerFeature__Group_8_3__06373 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8_3__1_in_rule__IntegerFeature__Group_8_3__06376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IntegerFeature__Group_8_3__0__Impl6404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_8_3__1__Impl_in_rule__IntegerFeature__Group_8_3__16435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__DependenciesAssignment_8_3_1_in_rule__IntegerFeature__Group_8_3__1__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__0__Impl_in_rule__IntegerFeature__Group_9__06496 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__1_in_rule__IntegerFeature__Group_9__06499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IntegerFeature__Group_9__0__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__1__Impl_in_rule__IntegerFeature__Group_9__16558 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__2_in_rule__IntegerFeature__Group_9__16561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntegerFeature__Group_9__1__Impl6589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__2__Impl_in_rule__IntegerFeature__Group_9__26620 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__3_in_rule__IntegerFeature__Group_9__26623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__FeaturesAssignment_9_2_in_rule__IntegerFeature__Group_9__2__Impl6650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__3__Impl_in_rule__IntegerFeature__Group_9__36680 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__4_in_rule__IntegerFeature__Group_9__36683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9_3__0_in_rule__IntegerFeature__Group_9__3__Impl6710 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9__4__Impl_in_rule__IntegerFeature__Group_9__46741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IntegerFeature__Group_9__4__Impl6769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9_3__0__Impl_in_rule__IntegerFeature__Group_9_3__06810 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9_3__1_in_rule__IntegerFeature__Group_9_3__06813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IntegerFeature__Group_9_3__0__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_9_3__1__Impl_in_rule__IntegerFeature__Group_9_3__16872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__FeaturesAssignment_9_3_1_in_rule__IntegerFeature__Group_9_3__1__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__0__Impl_in_rule__IntegerFeature__Group_10__06933 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__1_in_rule__IntegerFeature__Group_10__06936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__IntegerFeature__Group_10__0__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__1__Impl_in_rule__IntegerFeature__Group_10__16995 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__2_in_rule__IntegerFeature__Group_10__16998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntegerFeature__Group_10__1__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__2__Impl_in_rule__IntegerFeature__Group_10__27057 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__3_in_rule__IntegerFeature__Group_10__27060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__GroupsAssignment_10_2_in_rule__IntegerFeature__Group_10__2__Impl7087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__3__Impl_in_rule__IntegerFeature__Group_10__37117 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__4_in_rule__IntegerFeature__Group_10__37120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10_3__0_in_rule__IntegerFeature__Group_10__3__Impl7147 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10__4__Impl_in_rule__IntegerFeature__Group_10__47178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IntegerFeature__Group_10__4__Impl7206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10_3__0__Impl_in_rule__IntegerFeature__Group_10_3__07247 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10_3__1_in_rule__IntegerFeature__Group_10_3__07250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IntegerFeature__Group_10_3__0__Impl7278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__Group_10_3__1__Impl_in_rule__IntegerFeature__Group_10_3__17309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerFeature__GroupsAssignment_10_3_1_in_rule__IntegerFeature__Group_10_3__1__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__0__Impl_in_rule__BinaryNotDependency__Group__07370 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__1_in_rule__BinaryNotDependency__Group__07373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BinaryNotDependency__Group__0__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__1__Impl_in_rule__BinaryNotDependency__Group__17432 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__2_in_rule__BinaryNotDependency__Group__17435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__NotAssignment_1_in_rule__BinaryNotDependency__Group__1__Impl7462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__2__Impl_in_rule__BinaryNotDependency__Group__27492 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__3_in_rule__BinaryNotDependency__Group__27495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BinaryNotDependency__Group__2__Impl7523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__3__Impl_in_rule__BinaryNotDependency__Group__37554 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__4_in_rule__BinaryNotDependency__Group__37557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__LeftHandAssignment_3_in_rule__BinaryNotDependency__Group__3__Impl7584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__4__Impl_in_rule__BinaryNotDependency__Group__47614 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__5_in_rule__BinaryNotDependency__Group__47617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__OperatorAssignment_4_in_rule__BinaryNotDependency__Group__4__Impl7644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__5__Impl_in_rule__BinaryNotDependency__Group__57674 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__6_in_rule__BinaryNotDependency__Group__57677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__RightHandAssignment_5_in_rule__BinaryNotDependency__Group__5__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__6__Impl_in_rule__BinaryNotDependency__Group__67734 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__7_in_rule__BinaryNotDependency__Group__67737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__BinaryNotDependency__Group__6__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryNotDependency__Group__7__Impl_in_rule__BinaryNotDependency__Group__77796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__BinaryNotDependency__Group__7__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__0__Impl_in_rule__BinaryDependency__Group__07871 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__1_in_rule__BinaryDependency__Group__07874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BinaryDependency__Group__0__Impl7902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__1__Impl_in_rule__BinaryDependency__Group__17933 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__2_in_rule__BinaryDependency__Group__17936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__LeftHandAssignment_1_in_rule__BinaryDependency__Group__1__Impl7963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__2__Impl_in_rule__BinaryDependency__Group__27993 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__3_in_rule__BinaryDependency__Group__27996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__OperatorAssignment_2_in_rule__BinaryDependency__Group__2__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__3__Impl_in_rule__BinaryDependency__Group__38053 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__4_in_rule__BinaryDependency__Group__38056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__RightHandAssignment_3_in_rule__BinaryDependency__Group__3__Impl8083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryDependency__Group__4__Impl_in_rule__BinaryDependency__Group__48113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__BinaryDependency__Group__4__Impl8141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__0__Impl_in_rule__IsSelectedDependency__Group__08182 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__1_in_rule__IsSelectedDependency__Group__08185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__IsSelectedDependency__Group__0__Impl8213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__1__Impl_in_rule__IsSelectedDependency__Group__18244 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__2_in_rule__IsSelectedDependency__Group__18247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__TargetAssignment_1_in_rule__IsSelectedDependency__Group__1__Impl8274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__2__Impl_in_rule__IsSelectedDependency__Group__28304 = new BitSet(new long[]{0x0000000120000000L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__3_in_rule__IsSelectedDependency__Group__28307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__IsSelectedDependency__Group__2__Impl8335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__3__Impl_in_rule__IsSelectedDependency__Group__38366 = new BitSet(new long[]{0x0000000120000000L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__4_in_rule__IsSelectedDependency__Group__38369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__NotAssignment_3_in_rule__IsSelectedDependency__Group__3__Impl8396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__4__Impl_in_rule__IsSelectedDependency__Group__48427 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__5_in_rule__IsSelectedDependency__Group__48430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__IsSelectedDependency__Group__4__Impl8458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsSelectedDependency__Group__5__Impl_in_rule__IsSelectedDependency__Group__58489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__IsSelectedDependency__Group__5__Impl8517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__0__Impl_in_rule__IntegerValueDependency__Group__08560 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__1_in_rule__IntegerValueDependency__Group__08563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__IntegerValueDependency__Group__0__Impl8591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__1__Impl_in_rule__IntegerValueDependency__Group__18622 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__2_in_rule__IntegerValueDependency__Group__18625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__TargetAssignment_1_in_rule__IntegerValueDependency__Group__1__Impl8652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__2__Impl_in_rule__IntegerValueDependency__Group__28682 = new BitSet(new long[]{0x0000000140000040L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__3_in_rule__IntegerValueDependency__Group__28685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__IntegerValueDependency__Group__2__Impl8713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__3__Impl_in_rule__IntegerValueDependency__Group__38744 = new BitSet(new long[]{0x0000000140000040L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__4_in_rule__IntegerValueDependency__Group__38747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__NotAssignment_3_in_rule__IntegerValueDependency__Group__3__Impl8774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__4__Impl_in_rule__IntegerValueDependency__Group__48805 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__5_in_rule__IntegerValueDependency__Group__48808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__ValueAssignment_4_in_rule__IntegerValueDependency__Group__4__Impl8835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValueDependency__Group__5__Impl_in_rule__IntegerValueDependency__Group__58865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__IntegerValueDependency__Group__5__Impl8893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08936 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EInt__Group__0__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Configurator__NameAssignment_29066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Configurator__FeaturesAssignment_4_29097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Configurator__FeaturesAssignment_4_3_19128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Configurator__GroupsAssignment_5_29159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Configurator__GroupsAssignment_5_3_19190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupType_in_rule__Group__GroupTypeAssignment_09221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Group__NameAssignment_19252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_rule__Group__FeaturesAssignment_39283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleFeature_in_rule__Group__FeaturesAssignment_4_19314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SimpleFeature__MandatoryAssignment_19350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleFeature__NameAssignment_39389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__SimpleFeature__DependenciesAssignment_5_29420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__SimpleFeature__DependenciesAssignment_5_3_19451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__SimpleFeature__FeaturesAssignment_6_29482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__SimpleFeature__FeaturesAssignment_6_3_19513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SimpleFeature__GroupsAssignment_7_29544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SimpleFeature__GroupsAssignment_7_3_19575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__IntegerFeature__MandatoryAssignment_19611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerFeature__NameAssignment_39650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerFeature__MinValueAssignment_5_19681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerFeature__MaxValueAssignment_6_19712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerFeature__StepAssignment_7_19743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__IntegerFeature__DependenciesAssignment_8_29774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__IntegerFeature__DependenciesAssignment_8_3_19805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__IntegerFeature__FeaturesAssignment_9_29836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__IntegerFeature__FeaturesAssignment_9_3_19867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__IntegerFeature__GroupsAssignment_10_29898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__IntegerFeature__GroupsAssignment_10_3_19929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BinaryNotDependency__NotAssignment_19965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__BinaryNotDependency__LeftHandAssignment_310004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__BinaryNotDependency__OperatorAssignment_410035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__BinaryNotDependency__RightHandAssignment_510066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__BinaryDependency__LeftHandAssignment_110097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__BinaryDependency__OperatorAssignment_210128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__BinaryDependency__RightHandAssignment_310159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IsSelectedDependency__TargetAssignment_110194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__IsSelectedDependency__NotAssignment_310234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerValueDependency__TargetAssignment_110277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__IntegerValueDependency__NotAssignment_310317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerValueDependency__ValueAssignment_410356 = new BitSet(new long[]{0x0000000000000002L});
    }


}