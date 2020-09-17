/*
 * generated by Xtext 2.22.0
 */
package bag.dsl.serializer;

import bag.dsl.services.BagDslGrammarAccess;
import bag.model.bagEcore.App;
import bag.model.bagEcore.BagEcorePackage;
import bag.model.bagEcore.Characteristic;
import bag.model.bagEcore.MacAddress;
import bag.model.bagEcore.MacFilter;
import bag.model.bagEcore.NameExpression;
import bag.model.bagEcore.NameFilter;
import bag.model.bagEcore.Sensor;
import bag.model.bagEcore.Service;
import bag.model.bagEcore.UiElement;
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

@SuppressWarnings("all")
public class BagDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BagDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BagEcorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BagEcorePackage.APP:
				sequence_App(context, (App) semanticObject); 
				return; 
			case BagEcorePackage.CHARACTERISTIC:
				sequence_Characteristic(context, (Characteristic) semanticObject); 
				return; 
			case BagEcorePackage.MAC_ADDRESS:
				sequence_MacAddress(context, (MacAddress) semanticObject); 
				return; 
			case BagEcorePackage.MAC_FILTER:
				sequence_MacFilter(context, (MacFilter) semanticObject); 
				return; 
			case BagEcorePackage.NAME_EXPRESSION:
				sequence_NameExpression(context, (NameExpression) semanticObject); 
				return; 
			case BagEcorePackage.NAME_FILTER:
				sequence_NameFilter(context, (NameFilter) semanticObject); 
				return; 
			case BagEcorePackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case BagEcorePackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case BagEcorePackage.UI_ELEMENT:
				sequence_UIElement(context, (UiElement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     App returns App
	 *
	 * Constraint:
	 *     (name=EString packageName=EString sensor=Sensor macfilter=MacFilter? namefilter=NameFilter?)
	 */
	protected void sequence_App(ISerializationContext context, App semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Characteristic returns Characteristic
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         uuid=EString 
	 *         dataType=DataType 
	 *         unit=EString? 
	 *         read=EBoolean 
	 *         write=EBoolean 
	 *         notification=EBoolean 
	 *         uielement=UIElement?
	 *     )
	 */
	protected void sequence_Characteristic(ISerializationContext context, Characteristic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MacAddress returns MacAddress
	 *
	 * Constraint:
	 *     address=EString
	 */
	protected void sequence_MacAddress(ISerializationContext context, MacAddress semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BagEcorePackage.Literals.MAC_ADDRESS__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BagEcorePackage.Literals.MAC_ADDRESS__ADDRESS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMacAddressAccess().getAddressEStringParserRuleCall_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MacFilter returns MacFilter
	 *
	 * Constraint:
	 *     (macaddress+=MacAddress macaddress+=MacAddress*)
	 */
	protected void sequence_MacFilter(ISerializationContext context, MacFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NameExpression returns NameExpression
	 *
	 * Constraint:
	 *     regEx=EString
	 */
	protected void sequence_NameExpression(ISerializationContext context, NameExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BagEcorePackage.Literals.NAME_EXPRESSION__REG_EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BagEcorePackage.Literals.NAME_EXPRESSION__REG_EX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameExpressionAccess().getRegExEStringParserRuleCall_0(), semanticObject.getRegEx());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NameFilter returns NameFilter
	 *
	 * Constraint:
	 *     name=NameExpression
	 */
	protected void sequence_NameFilter(ISerializationContext context, NameFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BagEcorePackage.Literals.NAME_FILTER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BagEcorePackage.Literals.NAME_FILTER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameFilterAccess().getNameNameExpressionParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (name=EString service+=Service service+=Service*)
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (name=EString uuid=EString characteristic+=Characteristic characteristic+=Characteristic*)
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIElement returns UiElement
	 *
	 * Constraint:
	 *     (name=EString label=EString description=EString?)
	 */
	protected void sequence_UIElement(ISerializationContext context, UiElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}