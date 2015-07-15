
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
                  DATE: Wed Jul 15 17:06:16 BRT 2015
                  SOURCE: /home/haroldo/projetos/academico/sgmplay/app/views/swagger.scala.html
                  HASH: db6189cda7816fc4bdccc95d4fbbfc2ad026c841
                  MATRIX: 828->30|3342->2516|3371->2517|3405->2524|3521->2612|3550->2613|3586->2622|3633->2642|3661->2643|3689->2644|3722->2649|3751->2650|3787->2659|3822->2667|3968->2792|4003->2800|4031->2801|4066->2809|4127->2842|4156->2843|4192->2852|4387->3019|4416->3020|4455->3031|4553->3101|4582->3102|4623->3115|4676->3140|4705->3141|4748->3156|4891->3271|4920->3272|4976->3300|5005->3301|5044->3312|5106->3346|5135->3347|5176->3360|5237->3393|5266->3394|5304->3405|5333->3406|5397->3442|5426->3443|5465->3454|5533->3495|5562->3496|5652->3559|5680->3560|5752->3604|5781->3605|5817->3614|5948->3717|5977->3718|6018->3731|6178->3864|6207->3865|6241->3872|6269->3873|6304->3881|6369->3918|6398->3919|6434->3928|6493->3960|6521->3961|6828->4241|6856->4242
                  LINES: 29->2|70->43|70->43|71->44|72->45|72->45|73->46|74->47|74->47|74->47|74->47|74->47|75->48|75->48|76->49|77->50|77->50|79->52|79->52|79->52|80->53|83->56|83->56|84->57|85->58|85->58|86->59|87->60|87->60|88->61|91->64|91->64|93->66|93->66|94->67|94->67|94->67|95->68|96->69|96->69|97->70|97->70|98->71|98->71|99->72|100->73|100->73|103->76|103->76|105->78|105->78|106->79|108->81|108->81|109->82|111->84|111->84|112->85|112->85|114->87|114->87|114->87|115->88|116->89|116->89|126->99|126->99
                  -- GENERATED --
              */
          