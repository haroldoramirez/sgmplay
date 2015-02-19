package converters;

import com.wordnik.swagger.converter.SwaggerSchemaConverter;
import scala.collection.immutable.Set;

public class IgnoreConverter extends SwaggerSchemaConverter {

    //Exemplo em Scala
//    class IgnoreConverter extends SwaggerSchemaConverter {
//        override def skippedClasses: Set[String] =    Set("com.avaje.ebean.bean.EntityBeanIntercept")
//        override def ignoredClasses: Set[String] =  Set("com.avaje.ebean.bean.EntityBeanIntercept")
//        override def ignoredPackages: Set[String] = Set("com.avaje.ebean")
//    }
    
    String skippedClasses = "com.avaje.ebean.bean.EntityBeanIntercept";
    String ignoredClasses = "com.avaje.ebean.bean.EntityBeanIntercept";
    String ignoredPackages = "com.avaje.ebean";

    @Override
    public Set<String> skippedClasses() {
        return super.skippedClasses();
    }

    @Override
    public Set<String> ignoredClasses() {
        return super.ignoredClasses();
    }

    @Override
    public Set<String> ignoredPackages() {
        return super.ignoredPackages();
    }
}
