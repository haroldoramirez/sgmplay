
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

/**/
object versaoplay extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sistema : String)(versaoDoPlay : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*5.13*/sistema),format.raw/*5.20*/("""</title>

    <!--Jquery-->
    <script src="assets/bower_components/jquery/dist/jquery.js"></script>

    <link rel="stylesheet" href="assets/bower_components/bootstrap/dist/css/bootstrap.css"/>
    <script src="assets/bower_components/bootstrap/dist/js/bootstrap.js"></script>

    <!--CSS Personalisados-->
    <link rel="stylesheet" href="assets/stylesheets/background.css"/>
    
</head>
<body>
	<div class="container-fluid">
        <div style="min-height:869px">
		    <div class="header">
			    <h3 class="text-muted">"""),_display_(/*21.32*/sistema),format.raw/*21.39*/("""</h3>
		    </div>
		    <div class="jumbotron">
			    <p><a class="btn btn-lg btn-success" href="">
			        powered by Play Framework """),_display_(/*25.39*/versaoDoPlay),format.raw/*25.51*/("""</a></p>
            </div>
            <div align="center" class="error-actions">
                <a href="/#/" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-shopping-cart"></span>
                    Início </a>
            </div>
        </div>
	</div>
    <!--Rodapé-->
    <div align="center">
        <footer class="footer">
            <div class="container">
                <p>&copy; 2015 SGM - Sistema de Gestão de Mercados -
                    <b>Powered by Play Framework e AngularJS
                    </b>.Todos os direitos reservados.
                </p>
            </div>
        </footer>
    </div>
</body>
</html>

"""))}
  }

  def render(sistema:String,versaoDoPlay:String): play.twirl.api.HtmlFormat.Appendable = apply(sistema)(versaoDoPlay)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (sistema) => (versaoDoPlay) => apply(sistema)(versaoDoPlay)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 15 17:06:17 BRT 2015
                  SOURCE: /home/haroldo/projetos/academico/sgmplay/app/views/versaoplay.scala.html
                  HASH: b4dae8c2578f0e058e01bdc5876663c3382ec642
                  MATRIX: 735->1|864->42|891->43|970->96|997->103|1552->631|1580->638|1747->778|1780->790
                  LINES: 26->1|29->1|30->2|33->5|33->5|49->21|49->21|53->25|53->25
                  -- GENERATED --
              */
          