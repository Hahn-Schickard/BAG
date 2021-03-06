/**
 * generated by Xtext 2.22.0
 */
package bag.dsl.formatting2;

import bag.dsl.services.BagDslGrammarAccess;
import bag.model.bagEcore.App;
import bag.model.bagEcore.MacFilter;
import bag.model.bagEcore.NameFilter;
import bag.model.bagEcore.Sensor;
import bag.model.bagEcore.Service;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class BagDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private BagDslGrammarAccess _bagDslGrammarAccess;
  
  protected void _format(final App app, @Extension final IFormattableDocument document) {
    document.<Sensor>format(app.getSensor());
    document.<MacFilter>format(app.getMacfilter());
    document.<NameFilter>format(app.getNamefilter());
  }
  
  protected void _format(final Sensor sensor, @Extension final IFormattableDocument document) {
    EList<Service> _service = sensor.getService();
    for (final Service service : _service) {
      document.<Service>format(service);
    }
  }
  
  public void format(final Object app, final IFormattableDocument document) {
    if (app instanceof XtextResource) {
      _format((XtextResource)app, document);
      return;
    } else if (app instanceof App) {
      _format((App)app, document);
      return;
    } else if (app instanceof Sensor) {
      _format((Sensor)app, document);
      return;
    } else if (app instanceof EObject) {
      _format((EObject)app, document);
      return;
    } else if (app == null) {
      _format((Void)null, document);
      return;
    } else if (app != null) {
      _format(app, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(app, document).toString());
    }
  }
}
