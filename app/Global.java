import static play.mvc.Results.notFound;

import com.wordnik.swagger.converter.ModelConverters;
import converters.IgnoreConverterScala;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.Mode;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;

public class Global extends GlobalSettings {
    
    String configKey = "slick";
    String criptDirectory = "conf/evolutions/";
    String createScript = "create-database.sql";
    String dropScript = "drop-database.sql";
    String scriptHeader = "-- SQL DDL script\n-- Generated file - do not edit\n\n";

    @Override
    public F.Promise<Result> onHandlerNotFound(Http.RequestHeader request) {
        return F.Promise.<Result> pure(notFound(views.html.paginaNaoEncontrada.render(request.uri())));
    }

    @Override
    public void beforeStart(Application app) {
        Logger.info("Registering custom converter swagger");
        ModelConverters.addConverter(new IgnoreConverterScala(), true);
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
