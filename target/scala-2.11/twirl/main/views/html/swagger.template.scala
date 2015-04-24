
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
import play.api.Play.current
/**/
object swagger extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<html>
<head>
    <title>Swagger UI</title>
    <link href='//fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'/>
    <link href='/assets/swagger/css/reset.css' media='screen' rel='stylesheet' type='text/css'/>
    <link href='/assets/swagger/css/screen.css' media='screen' rel='stylesheet' type='text/css'/>
    <link href='/assets/swagger/css/reset.css' media='print' rel='stylesheet' type='text/css'/>
    <link href='/assets/swagger/css/screen.css' media='print' rel='stylesheet' type='text/css'/>
</head>

<body class="swagger-section">
<div id='header'>
    <div class="swagger-ui-wrap">
        <a id="logo" href="http://swagger.io">swagger</a>
        <form id='api_selector'>
            <div class='input'><input placeholder="http://example.com/api" id="input_baseUrl" name="baseUrl" type="text"/></div>
            <div class='input'><input placeholder="api_key" id="input_apiKey" name="apiKey" type="text"/></div>
            <div class='input'><a id="explore" href="#">Explore</a></div>
        </form>
    </div>
</div>

<div id="message-bar" class="swagger-ui-wrap">&nbsp;</div>
<div id="swagger-ui-container" class="swagger-ui-wrap"></div>
<script type="text/javascript" src="/assets/swagger/lib/shred.bundle.js"></script>
<script src='/assets/swagger/lib/jquery-1.8.0.min.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/jquery.slideto.min.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/jquery.wiggle.min.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/jquery.ba-bbq.min.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/handlebars-1.0.0.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/underscore-min.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/backbone-min.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/swagger.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/swagger-client.js' type='text/javascript'></script>
<script src='/assets/swagger/swagger-ui.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/highlight.7.3.pack.js' type='text/javascript'></script>
<script src='/assets/swagger/lib/backbone-min.js' type='text/javascript'></script>

<!-- enabling this will enable oauth2 implicit scope support -->
<!--<script src='lib/swagger-oauth.js' type='text/javascript'></script>-->
<script type="text/javascript">
      $(function () """),format.raw/*43.21*/("""{"""),format.raw/*43.22*/("""
      """),format.raw/*44.7*/("""var url = window.location.search.match(/url=([^&]+)/);
      if (url && url.length > 1) """),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""
        """),format.raw/*46.9*/("""url = url[1];
      """),format.raw/*47.7*/("""}"""),format.raw/*47.8*/(""" """),format.raw/*47.9*/("""else """),format.raw/*47.14*/("""{"""),format.raw/*47.15*/("""
        """),format.raw/*48.9*/("""url = """"),_display_(/*48.17*/{s"${current.configuration.getString("swagger.api.basepath")
            .getOrElse("http://localhost:9000")}/api-docs.json"}),format.raw/*49.65*/(""""
      """),format.raw/*50.7*/("""}"""),format.raw/*50.8*/("""

      """),format.raw/*52.7*/("""window.swaggerUi = new SwaggerUi("""),format.raw/*52.40*/("""{"""),format.raw/*52.41*/("""
        """),format.raw/*53.9*/("""url: url,
        dom_id: "swagger-ui-container",
        supportedSubmitMethods: ['get', 'post', 'put', 'delete'],
        onComplete: function(swaggerApi, swaggerUi)"""),format.raw/*56.52*/("""{"""),format.raw/*56.53*/("""
          """),format.raw/*57.11*/("""log("Loaded SwaggerUI");
          if(typeof initOAuth == "function") """),format.raw/*58.46*/("""{"""),format.raw/*58.47*/("""
            """),format.raw/*59.13*/("""/*
            initOAuth("""),format.raw/*60.23*/("""{"""),format.raw/*60.24*/("""
              """),format.raw/*61.15*/("""clientId: "your-client-id",
              realm: "your-realms",
              appName: "your-app-name"
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/(""");
            */
          """),format.raw/*66.11*/("""}"""),format.raw/*66.12*/("""
          """),format.raw/*67.11*/("""$('pre code').each(function(i, e) """),format.raw/*67.45*/("""{"""),format.raw/*67.46*/("""
            """),format.raw/*68.13*/("""hljs.highlightBlock(e)
          """),format.raw/*69.11*/("""}"""),format.raw/*69.12*/(""");
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""",
        onFailure: function(data) """),format.raw/*71.35*/("""{"""),format.raw/*71.36*/("""
          """),format.raw/*72.11*/("""log("Unable to Load SwaggerUI");
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/(""",
        docExpansion: "none",
        sorter : "alpha"
      """),format.raw/*76.7*/("""}"""),format.raw/*76.8*/(""");

      function addApiKeyAuthorization() """),format.raw/*78.41*/("""{"""),format.raw/*78.42*/("""
        """),format.raw/*79.9*/("""var key = $('#input_apiKey')[0].value;
        log("key: " + key);
        if(key && key.trim() != "") """),format.raw/*81.37*/("""{"""),format.raw/*81.38*/("""
            """),format.raw/*82.13*/("""log("added key " + key);
            window.authorizations.add("api_key", new ApiKeyAuthorization("api_key", key, "query"));
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""
      """),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""

      """),format.raw/*87.7*/("""$('#input_apiKey').change(function() """),format.raw/*87.44*/("""{"""),format.raw/*87.45*/("""
        """),format.raw/*88.9*/("""addApiKeyAuthorization();
      """),format.raw/*89.7*/("""}"""),format.raw/*89.8*/(""");

      // if you have an apiKey you would like to pre-populate on the page for demonstration purposes...
      /*
        var apiKey = "myApiKeyXXXX123456789";
        $('#input_apiKey').val(apiKey);
        addApiKeyAuthorization();
      */

      window.swaggerUi.load();
  """),format.raw/*99.3*/("""}"""),format.raw/*99.4*/(""");
  </script>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 16:39:27 BRT 2015
                  SOURCE: C:/projetos/sgmplay/app/views/swagger.scala.html
                  HASH: dfb9f98ecf6c8f5f544c270fdd745a9f417902a6
                  MATRIX: 828->31|3383->2558|3412->2559|3447->2567|3564->2656|3593->2657|3630->2667|3678->2688|3706->2689|3734->2690|3767->2695|3796->2696|3833->2706|3868->2714|4015->2840|4051->2849|4079->2850|4116->2860|4177->2893|4206->2894|4243->2904|4441->3074|4470->3075|4510->3087|4609->3158|4638->3159|4680->3173|4734->3199|4763->3200|4807->3216|4953->3334|4982->3335|5040->3365|5069->3366|5109->3378|5171->3412|5200->3413|5242->3427|5304->3461|5333->3462|5372->3474|5401->3475|5466->3512|5495->3513|5535->3525|5604->3567|5633->3568|5726->3634|5754->3635|5828->3681|5857->3682|5894->3692|6027->3797|6056->3798|6098->3812|6260->3947|6289->3948|6324->3956|6352->3957|6389->3967|6454->4004|6483->4005|6520->4015|6580->4048|6608->4049|6925->4339|6953->4340
                  LINES: 29->2|70->43|70->43|71->44|72->45|72->45|73->46|74->47|74->47|74->47|74->47|74->47|75->48|75->48|76->49|77->50|77->50|79->52|79->52|79->52|80->53|83->56|83->56|84->57|85->58|85->58|86->59|87->60|87->60|88->61|91->64|91->64|93->66|93->66|94->67|94->67|94->67|95->68|96->69|96->69|97->70|97->70|98->71|98->71|99->72|100->73|100->73|103->76|103->76|105->78|105->78|106->79|108->81|108->81|109->82|111->84|111->84|112->85|112->85|114->87|114->87|114->87|115->88|116->89|116->89|126->99|126->99
                  -- GENERATED --
              */
          