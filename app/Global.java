import static play.mvc.Results.notFound;

import com.wordnik.swagger.converter.ModelConverters;
import converters.IgnoreConverter;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;

public class Global extends GlobalSettings {

    @Override
    public F.Promise<Result> onHandlerNotFound(Http.RequestHeader request) {
        return F.Promise.<Result> pure(notFound(views.html.paginaNaoEncontrada.render(request.uri())));
    }

    @Override
    public void beforeStart(Application app) {
        Logger.info("Registering custom converter swagger");
        ModelConverters.addConverter(new IgnoreConverter(), true);
    }

    @Override
    public void onStart(Application app) {
        Logger.info("Application has started");
    }

    @Override
    public void onStop(Application app) {
        Logger.info("Application shutdown...");
    }
}
