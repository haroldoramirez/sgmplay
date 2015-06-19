
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
    <title>Página Não Encontrada</title>

    <!--Jquery-->
    <script src="assets/bower_components/jquery/dist/jquery.js"></script>

    <link rel="stylesheet" href="assets/bower_components/bootstrap/dist/css/bootstrap.css"/>
    <script src="assets/bower_components/bootstrap/dist/js/bootstrap.js"></script>

    <!--CSS Personalisados-->
    <link rel="stylesheet" href="assets/stylesheets/background.css"/>

</head>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="error-template">
                <h1>
                    Erro 404</h1>
                <h2>
                    Esta página não existe -> <b>"""),_display_(/*26.51*/url),format.raw/*26.54*/("""</b></h2>
                <div class="error-details">
                    SGM - Sistema de Mercados
                </div>
                <div class="error-actions">
                    <a href="/#/" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-shopping-cart"></span>
                        Início </a>
                </div>
            </div>
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
</html>"""))}
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jun 19 16:31:45 BRT 2015
                  SOURCE: /home/haroldo/projetos/academico/sgmplay/app/views/paginaNaoEncontrada.scala.html
                  HASH: 8b8a38ad53cbdd081446cb33405345cccd902ed9
                  MATRIX: 737->1|838->14|865->15|1613->736|1637->739
                  LINES: 26->1|29->1|30->2|54->26|54->26
                  -- GENERATED --
              */
          