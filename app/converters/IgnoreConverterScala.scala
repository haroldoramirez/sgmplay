package converters

import com.wordnik.swagger.converter.SwaggerSchemaConverter

class IgnoreConverterScala extends SwaggerSchemaConverter {
  override def skippedClasses: Set[String] = Set("com.avaje.ebean.bean.EntityBeanIntercept")
  override def ignoredClasses: Set[String] = Set("com.avaje.ebean.bean.EntityBeanIntercept")
  override def ignoredPackages: Set[String] = Set("com.avaje.ebean")
}
