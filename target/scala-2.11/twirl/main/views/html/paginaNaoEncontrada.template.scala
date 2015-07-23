
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
object paginaNaoEncontrada extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.15*/("""
"""),format.raw/*2.1*/("""<html>
<body>
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.55*/routes/*6.61*/.Assets.at("images/favicon.png")),format.raw/*6.93*/("""">

    <link rel="stylesheet" href="assets/bower_components/bootstrap/dist/css/bootstrap.css"/>

    <!--Awesome Icons-->
    <link rel="stylesheet" href="assets/stylesheets/awesome/css/font-awesome.css"/>
    <title>Página não Encontrada</title>
</head>
<div align="center" class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="well">
                <h2 class="text-muted">
                    Erro 404
                </h2>
                <p class="alert alert-danger">Esta página não existe: <b>"""),_display_(/*21.75*/url),format.raw/*21.78*/("""</b></p>
                <div class="error-actions">
                    <a href="/#/" class="btn btn-primary"><span class="fa fa-home"></span>
                        Início </a>
                </div>
                <hr>
                <p align="center">&copy; 2015 SGM - Sistema de Gestão de Mercados <span class="fa fa-shopping-cart"></span></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>"""))}
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 23 15:01:17 BRT 2015
                  SOURCE: /home/haroldo/projetos/academico/sgmplay/app/views/paginaNaoEncontrada.scala.html
                  HASH: 925b6dba60d383cd11d3921b9300679e26140000
                  MATRIX: 737->1|838->14|865->15|993->117|1007->123|1059->155|1646->715|1670->718
                  LINES: 26->1|29->1|30->2|34->6|34->6|34->6|49->21|49->21
                  -- GENERATED --
              */
          