// @SOURCE:/home/haroldo/projetos/academico/sgmplay/conf/routes
// @HASH:dd6de9c0c2118681a07c9f20d27e2b75e5973a60
// @DATE:Fri Jul 17 16:27:21 BRT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_LoginController_loginTela1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_LoginController_loginTela1_invoker = createInvoker(
controllers.LoginController.loginTela(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "loginTela", Nil,"GET", """ Login""", Routes.prefix + """login"""))
        

// @LINE:10
private[this] lazy val controllers_LoginController_telaAutenticado2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autenticado"))))
private[this] lazy val controllers_LoginController_telaAutenticado2_invoker = createInvoker(
controllers.LoginController.telaAutenticado(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "telaAutenticado", Nil,"GET", """""", Routes.prefix + """autenticado"""))
        

// @LINE:11
private[this] lazy val controllers_LoginController_telaLogout3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saiu"))))
private[this] lazy val controllers_LoginController_telaLogout3_invoker = createInvoker(
controllers.LoginController.telaLogout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "telaLogout", Nil,"GET", """""", Routes.prefix + """saiu"""))
        

// @LINE:12
private[this] lazy val controllers_LoginController_autenticar4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("autenticar"))))
private[this] lazy val controllers_LoginController_autenticar4_invoker = createInvoker(
controllers.LoginController.autenticar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "autenticar", Nil,"POST", """""", Routes.prefix + """autenticar"""))
        

// @LINE:13
private[this] lazy val controllers_LoginController_logout5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_LoginController_logout5_invoker = createInvoker(
controllers.LoginController.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:16
private[this] lazy val controllers_Application_versaoplay6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("versaoplay"))))
private[this] lazy val controllers_Application_versaoplay6_invoker = createInvoker(
controllers.Application.versaoplay(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "versaoplay", Nil,"GET", """ Applications""", Routes.prefix + """versaoplay"""))
        

// @LINE:19
private[this] lazy val controllers_PaisController_inserir7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises"))))
private[this] lazy val controllers_PaisController_inserir7_invoker = createInvoker(
controllers.PaisController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "inserir", Nil,"POST", """ CRUD País""", Routes.prefix + """paises"""))
        

// @LINE:20
private[this] lazy val controllers_PaisController_atualizar8_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_atualizar8_invoker = createInvoker(
controllers.PaisController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:21
private[this] lazy val controllers_PaisController_buscaTodos9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises"))))
private[this] lazy val controllers_PaisController_buscaTodos9_invoker = createInvoker(
controllers.PaisController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """paises"""))
        

// @LINE:22
private[this] lazy val controllers_PaisController_buscaPorId10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_buscaPorId10_invoker = createInvoker(
controllers.PaisController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_PaisController_remover11_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_remover11_invoker = createInvoker(
controllers.PaisController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:24
private[this] lazy val controllers_PaisController_filtraPorNome12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_filtraPorNome12_invoker = createInvoker(
controllers.PaisController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """paises/nome/$filtro<[^/]+>"""))
        

// @LINE:27
private[this] lazy val controllers_EstadoController_inserir13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados"))))
private[this] lazy val controllers_EstadoController_inserir13_invoker = createInvoker(
controllers.EstadoController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "inserir", Nil,"POST", """ CRUD Estado""", Routes.prefix + """estados"""))
        

// @LINE:28
private[this] lazy val controllers_EstadoController_atualizar14_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_atualizar14_invoker = createInvoker(
controllers.EstadoController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_EstadoController_buscaTodos15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados"))))
private[this] lazy val controllers_EstadoController_buscaTodos15_invoker = createInvoker(
controllers.EstadoController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """estados"""))
        

// @LINE:30
private[this] lazy val controllers_EstadoController_buscaPorId16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_buscaPorId16_invoker = createInvoker(
controllers.EstadoController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_EstadoController_remover17_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_remover17_invoker = createInvoker(
controllers.EstadoController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_EstadoController_filtraPorNome18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_filtraPorNome18_invoker = createInvoker(
controllers.EstadoController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """estados/nome/$filtro<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_CidadeController_inserir19_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades"))))
private[this] lazy val controllers_CidadeController_inserir19_invoker = createInvoker(
controllers.CidadeController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "inserir", Nil,"POST", """ CRUD Cidade""", Routes.prefix + """cidades"""))
        

// @LINE:36
private[this] lazy val controllers_CidadeController_atualizar20_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_atualizar20_invoker = createInvoker(
controllers.CidadeController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_CidadeController_buscaTodos21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades"))))
private[this] lazy val controllers_CidadeController_buscaTodos21_invoker = createInvoker(
controllers.CidadeController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """cidades"""))
        

// @LINE:38
private[this] lazy val controllers_CidadeController_buscaPorId22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_buscaPorId22_invoker = createInvoker(
controllers.CidadeController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:39
private[this] lazy val controllers_CidadeController_remover23_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_remover23_invoker = createInvoker(
controllers.CidadeController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:40
private[this] lazy val controllers_CidadeController_filtraPorNome24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_filtraPorNome24_invoker = createInvoker(
controllers.CidadeController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """cidades/nome/$filtro<[^/]+>"""))
        

// @LINE:43
private[this] lazy val controllers_BairroController_inserir25_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros"))))
private[this] lazy val controllers_BairroController_inserir25_invoker = createInvoker(
controllers.BairroController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "inserir", Nil,"POST", """ CRUD Bairro""", Routes.prefix + """bairros"""))
        

// @LINE:44
private[this] lazy val controllers_BairroController_atualizar26_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_atualizar26_invoker = createInvoker(
controllers.BairroController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:45
private[this] lazy val controllers_BairroController_buscaTodos27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros"))))
private[this] lazy val controllers_BairroController_buscaTodos27_invoker = createInvoker(
controllers.BairroController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """bairros"""))
        

// @LINE:46
private[this] lazy val controllers_BairroController_buscaPorId28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_buscaPorId28_invoker = createInvoker(
controllers.BairroController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:47
private[this] lazy val controllers_BairroController_remover29_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_remover29_invoker = createInvoker(
controllers.BairroController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:48
private[this] lazy val controllers_BairroController_filtraPorNome30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_filtraPorNome30_invoker = createInvoker(
controllers.BairroController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """bairros/nome/$filtro<[^/]+>"""))
        

// @LINE:51
private[this] lazy val controllers_ClienteController_inserir31_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes"))))
private[this] lazy val controllers_ClienteController_inserir31_invoker = createInvoker(
controllers.ClienteController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "inserir", Nil,"POST", """ CRUD Cliente""", Routes.prefix + """clientes"""))
        

// @LINE:52
private[this] lazy val controllers_ClienteController_atualizar32_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_atualizar32_invoker = createInvoker(
controllers.ClienteController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:53
private[this] lazy val controllers_ClienteController_buscaTodos33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes"))))
private[this] lazy val controllers_ClienteController_buscaTodos33_invoker = createInvoker(
controllers.ClienteController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """clientes"""))
        

// @LINE:54
private[this] lazy val controllers_ClienteController_buscaPorId34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_buscaPorId34_invoker = createInvoker(
controllers.ClienteController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:55
private[this] lazy val controllers_ClienteController_remover35_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_remover35_invoker = createInvoker(
controllers.ClienteController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:56
private[this] lazy val controllers_ClienteController_filtraPorNome36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_filtraPorNome36_invoker = createInvoker(
controllers.ClienteController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """clientes/nome/$filtro<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_FornecedorController_inserir37_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores"))))
private[this] lazy val controllers_FornecedorController_inserir37_invoker = createInvoker(
controllers.FornecedorController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "inserir", Nil,"POST", """ CRUD Fornecedor""", Routes.prefix + """fornecedores"""))
        

// @LINE:60
private[this] lazy val controllers_FornecedorController_atualizar38_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_atualizar38_invoker = createInvoker(
controllers.FornecedorController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:61
private[this] lazy val controllers_FornecedorController_buscaTodos39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores"))))
private[this] lazy val controllers_FornecedorController_buscaTodos39_invoker = createInvoker(
controllers.FornecedorController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """fornecedores"""))
        

// @LINE:62
private[this] lazy val controllers_FornecedorController_buscaPorId40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_buscaPorId40_invoker = createInvoker(
controllers.FornecedorController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:63
private[this] lazy val controllers_FornecedorController_remover41_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_remover41_invoker = createInvoker(
controllers.FornecedorController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:64
private[this] lazy val controllers_FornecedorController_filtraPorNome42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_filtraPorNome42_invoker = createInvoker(
controllers.FornecedorController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """fornecedores/nome/$filtro<[^/]+>"""))
        

// @LINE:67
private[this] lazy val controllers_CategoriaController_inserir43_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias"))))
private[this] lazy val controllers_CategoriaController_inserir43_invoker = createInvoker(
controllers.CategoriaController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "inserir", Nil,"POST", """ CRUD Categoria""", Routes.prefix + """categorias"""))
        

// @LINE:68
private[this] lazy val controllers_CategoriaController_atualizar44_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_atualizar44_invoker = createInvoker(
controllers.CategoriaController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:69
private[this] lazy val controllers_CategoriaController_buscaTodos45_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias"))))
private[this] lazy val controllers_CategoriaController_buscaTodos45_invoker = createInvoker(
controllers.CategoriaController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """categorias"""))
        

// @LINE:70
private[this] lazy val controllers_CategoriaController_buscaPorId46_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_buscaPorId46_invoker = createInvoker(
controllers.CategoriaController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:71
private[this] lazy val controllers_CategoriaController_remover47_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_remover47_invoker = createInvoker(
controllers.CategoriaController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:72
private[this] lazy val controllers_CategoriaController_filtraPorNome48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_filtraPorNome48_invoker = createInvoker(
controllers.CategoriaController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """categorias/nome/$filtro<[^/]+>"""))
        

// @LINE:75
private[this] lazy val controllers_FabricanteController_inserir49_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes"))))
private[this] lazy val controllers_FabricanteController_inserir49_invoker = createInvoker(
controllers.FabricanteController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "inserir", Nil,"POST", """ CRUD Fabricante""", Routes.prefix + """fabricantes"""))
        

// @LINE:76
private[this] lazy val controllers_FabricanteController_atualizar50_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_atualizar50_invoker = createInvoker(
controllers.FabricanteController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:77
private[this] lazy val controllers_FabricanteController_buscaTodos51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes"))))
private[this] lazy val controllers_FabricanteController_buscaTodos51_invoker = createInvoker(
controllers.FabricanteController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """fabricantes"""))
        

// @LINE:78
private[this] lazy val controllers_FabricanteController_buscaPorId52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_buscaPorId52_invoker = createInvoker(
controllers.FabricanteController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:79
private[this] lazy val controllers_FabricanteController_remover53_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_remover53_invoker = createInvoker(
controllers.FabricanteController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:80
private[this] lazy val controllers_FabricanteController_filtraPorNome54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_filtraPorNome54_invoker = createInvoker(
controllers.FabricanteController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """fabricantes/nome/$filtro<[^/]+>"""))
        

// @LINE:83
private[this] lazy val controllers_UnidadeDeMedidaController_inserir55_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas"))))
private[this] lazy val controllers_UnidadeDeMedidaController_inserir55_invoker = createInvoker(
controllers.UnidadeDeMedidaController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "inserir", Nil,"POST", """ CRUD Unidade de Medida""", Routes.prefix + """unidadesdemedidas"""))
        

// @LINE:84
private[this] lazy val controllers_UnidadeDeMedidaController_atualizar56_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_atualizar56_invoker = createInvoker(
controllers.UnidadeDeMedidaController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:85
private[this] lazy val controllers_UnidadeDeMedidaController_buscaTodos57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas"))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaTodos57_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """unidadesdemedidas"""))
        

// @LINE:86
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorId58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorId58_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:87
private[this] lazy val controllers_UnidadeDeMedidaController_remover59_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_remover59_invoker = createInvoker(
controllers.UnidadeDeMedidaController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:88
private[this] lazy val controllers_UnidadeDeMedidaController_filtraPorNome60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_filtraPorNome60_invoker = createInvoker(
controllers.UnidadeDeMedidaController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """unidadesdemedidas/nome/$filtro<[^/]+>"""))
        

// @LINE:91
private[this] lazy val controllers_ProdutoController_inserir61_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos"))))
private[this] lazy val controllers_ProdutoController_inserir61_invoker = createInvoker(
controllers.ProdutoController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "inserir", Nil,"POST", """ CRUD Produto""", Routes.prefix + """produtos"""))
        

// @LINE:92
private[this] lazy val controllers_ProdutoController_atualizar62_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_atualizar62_invoker = createInvoker(
controllers.ProdutoController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:93
private[this] lazy val controllers_ProdutoController_buscaTodos63_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos"))))
private[this] lazy val controllers_ProdutoController_buscaTodos63_invoker = createInvoker(
controllers.ProdutoController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """produtos"""))
        

// @LINE:94
private[this] lazy val controllers_ProdutoController_buscaPorPaginas64_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_buscaPorPaginas64_invoker = createInvoker(
controllers.ProdutoController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """produtosPagina/$pagina<[^/]+>"""))
        

// @LINE:95
private[this] lazy val controllers_ProdutoController_buscaPorId65_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_buscaPorId65_invoker = createInvoker(
controllers.ProdutoController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:96
private[this] lazy val controllers_ProdutoController_remover66_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_remover66_invoker = createInvoker(
controllers.ProdutoController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:99
private[this] lazy val controllers_UsuarioController_inserir67_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios"))))
private[this] lazy val controllers_UsuarioController_inserir67_invoker = createInvoker(
controllers.UsuarioController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "inserir", Nil,"POST", """ CRUD Usuário""", Routes.prefix + """usuarios"""))
        

// @LINE:100
private[this] lazy val controllers_UsuarioController_atualizar68_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_atualizar68_invoker = createInvoker(
controllers.UsuarioController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:101
private[this] lazy val controllers_UsuarioController_buscaTodos69_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios"))))
private[this] lazy val controllers_UsuarioController_buscaTodos69_invoker = createInvoker(
controllers.UsuarioController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """usuarios"""))
        

// @LINE:102
private[this] lazy val controllers_UsuarioController_buscaPorPaginas70_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuariosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_buscaPorPaginas70_invoker = createInvoker(
controllers.UsuarioController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """usuariosPagina/$pagina<[^/]+>"""))
        

// @LINE:103
private[this] lazy val controllers_UsuarioController_buscaPorId71_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_buscaPorId71_invoker = createInvoker(
controllers.UsuarioController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:104
private[this] lazy val controllers_UsuarioController_remover72_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_remover72_invoker = createInvoker(
controllers.UsuarioController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:107
private[this] lazy val controllers_Assets_at73_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at73_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.LoginController.loginTela()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autenticado""","""controllers.LoginController.telaAutenticado()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saiu""","""controllers.LoginController.telaLogout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autenticar""","""controllers.LoginController.autenticar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.LoginController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """versaoplay""","""controllers.Application.versaoplay()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises""","""controllers.PaisController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises""","""controllers.PaisController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/nome/$filtro<[^/]+>""","""controllers.PaisController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados""","""controllers.EstadoController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados""","""controllers.EstadoController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/nome/$filtro<[^/]+>""","""controllers.EstadoController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades""","""controllers.CidadeController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades""","""controllers.CidadeController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/nome/$filtro<[^/]+>""","""controllers.CidadeController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros""","""controllers.BairroController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros""","""controllers.BairroController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/nome/$filtro<[^/]+>""","""controllers.BairroController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes""","""controllers.ClienteController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes""","""controllers.ClienteController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/nome/$filtro<[^/]+>""","""controllers.ClienteController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores""","""controllers.FornecedorController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores""","""controllers.FornecedorController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/nome/$filtro<[^/]+>""","""controllers.FornecedorController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias""","""controllers.CategoriaController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias""","""controllers.CategoriaController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/nome/$filtro<[^/]+>""","""controllers.CategoriaController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes""","""controllers.FabricanteController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes""","""controllers.FabricanteController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/nome/$filtro<[^/]+>""","""controllers.FabricanteController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas""","""controllers.UnidadeDeMedidaController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas""","""controllers.UnidadeDeMedidaController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/nome/$filtro<[^/]+>""","""controllers.UnidadeDeMedidaController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos""","""controllers.ProdutoController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos""","""controllers.ProdutoController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtosPagina/$pagina<[^/]+>""","""controllers.ProdutoController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios""","""controllers.UsuarioController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios""","""controllers.UsuarioController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuariosPagina/$pagina<[^/]+>""","""controllers.UsuarioController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.remover(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_LoginController_loginTela1_route(params) => {
   call { 
        controllers_LoginController_loginTela1_invoker.call(controllers.LoginController.loginTela())
   }
}
        

// @LINE:10
case controllers_LoginController_telaAutenticado2_route(params) => {
   call { 
        controllers_LoginController_telaAutenticado2_invoker.call(controllers.LoginController.telaAutenticado())
   }
}
        

// @LINE:11
case controllers_LoginController_telaLogout3_route(params) => {
   call { 
        controllers_LoginController_telaLogout3_invoker.call(controllers.LoginController.telaLogout())
   }
}
        

// @LINE:12
case controllers_LoginController_autenticar4_route(params) => {
   call { 
        controllers_LoginController_autenticar4_invoker.call(controllers.LoginController.autenticar())
   }
}
        

// @LINE:13
case controllers_LoginController_logout5_route(params) => {
   call { 
        controllers_LoginController_logout5_invoker.call(controllers.LoginController.logout())
   }
}
        

// @LINE:16
case controllers_Application_versaoplay6_route(params) => {
   call { 
        controllers_Application_versaoplay6_invoker.call(controllers.Application.versaoplay())
   }
}
        

// @LINE:19
case controllers_PaisController_inserir7_route(params) => {
   call { 
        controllers_PaisController_inserir7_invoker.call(controllers.PaisController.inserir())
   }
}
        

// @LINE:20
case controllers_PaisController_atualizar8_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_atualizar8_invoker.call(controllers.PaisController.atualizar(id))
   }
}
        

// @LINE:21
case controllers_PaisController_buscaTodos9_route(params) => {
   call { 
        controllers_PaisController_buscaTodos9_invoker.call(controllers.PaisController.buscaTodos())
   }
}
        

// @LINE:22
case controllers_PaisController_buscaPorId10_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_buscaPorId10_invoker.call(controllers.PaisController.buscaPorId(id))
   }
}
        

// @LINE:23
case controllers_PaisController_remover11_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_remover11_invoker.call(controllers.PaisController.remover(id))
   }
}
        

// @LINE:24
case controllers_PaisController_filtraPorNome12_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_PaisController_filtraPorNome12_invoker.call(controllers.PaisController.filtraPorNome(filtro))
   }
}
        

// @LINE:27
case controllers_EstadoController_inserir13_route(params) => {
   call { 
        controllers_EstadoController_inserir13_invoker.call(controllers.EstadoController.inserir())
   }
}
        

// @LINE:28
case controllers_EstadoController_atualizar14_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoController_atualizar14_invoker.call(controllers.EstadoController.atualizar(id))
   }
}
        

// @LINE:29
case controllers_EstadoController_buscaTodos15_route(params) => {
   call { 
        controllers_EstadoController_buscaTodos15_invoker.call(controllers.EstadoController.buscaTodos())
   }
}
        

// @LINE:30
case controllers_EstadoController_buscaPorId16_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoController_buscaPorId16_invoker.call(controllers.EstadoController.buscaPorId(id))
   }
}
        

// @LINE:31
case controllers_EstadoController_remover17_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EstadoController_remover17_invoker.call(controllers.EstadoController.remover(id))
   }
}
        

// @LINE:32
case controllers_EstadoController_filtraPorNome18_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_EstadoController_filtraPorNome18_invoker.call(controllers.EstadoController.filtraPorNome(filtro))
   }
}
        

// @LINE:35
case controllers_CidadeController_inserir19_route(params) => {
   call { 
        controllers_CidadeController_inserir19_invoker.call(controllers.CidadeController.inserir())
   }
}
        

// @LINE:36
case controllers_CidadeController_atualizar20_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CidadeController_atualizar20_invoker.call(controllers.CidadeController.atualizar(id))
   }
}
        

// @LINE:37
case controllers_CidadeController_buscaTodos21_route(params) => {
   call { 
        controllers_CidadeController_buscaTodos21_invoker.call(controllers.CidadeController.buscaTodos())
   }
}
        

// @LINE:38
case controllers_CidadeController_buscaPorId22_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CidadeController_buscaPorId22_invoker.call(controllers.CidadeController.buscaPorId(id))
   }
}
        

// @LINE:39
case controllers_CidadeController_remover23_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CidadeController_remover23_invoker.call(controllers.CidadeController.remover(id))
   }
}
        

// @LINE:40
case controllers_CidadeController_filtraPorNome24_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_CidadeController_filtraPorNome24_invoker.call(controllers.CidadeController.filtraPorNome(filtro))
   }
}
        

// @LINE:43
case controllers_BairroController_inserir25_route(params) => {
   call { 
        controllers_BairroController_inserir25_invoker.call(controllers.BairroController.inserir())
   }
}
        

// @LINE:44
case controllers_BairroController_atualizar26_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BairroController_atualizar26_invoker.call(controllers.BairroController.atualizar(id))
   }
}
        

// @LINE:45
case controllers_BairroController_buscaTodos27_route(params) => {
   call { 
        controllers_BairroController_buscaTodos27_invoker.call(controllers.BairroController.buscaTodos())
   }
}
        

// @LINE:46
case controllers_BairroController_buscaPorId28_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BairroController_buscaPorId28_invoker.call(controllers.BairroController.buscaPorId(id))
   }
}
        

// @LINE:47
case controllers_BairroController_remover29_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BairroController_remover29_invoker.call(controllers.BairroController.remover(id))
   }
}
        

// @LINE:48
case controllers_BairroController_filtraPorNome30_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_BairroController_filtraPorNome30_invoker.call(controllers.BairroController.filtraPorNome(filtro))
   }
}
        

// @LINE:51
case controllers_ClienteController_inserir31_route(params) => {
   call { 
        controllers_ClienteController_inserir31_invoker.call(controllers.ClienteController.inserir())
   }
}
        

// @LINE:52
case controllers_ClienteController_atualizar32_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClienteController_atualizar32_invoker.call(controllers.ClienteController.atualizar(id))
   }
}
        

// @LINE:53
case controllers_ClienteController_buscaTodos33_route(params) => {
   call { 
        controllers_ClienteController_buscaTodos33_invoker.call(controllers.ClienteController.buscaTodos())
   }
}
        

// @LINE:54
case controllers_ClienteController_buscaPorId34_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClienteController_buscaPorId34_invoker.call(controllers.ClienteController.buscaPorId(id))
   }
}
        

// @LINE:55
case controllers_ClienteController_remover35_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClienteController_remover35_invoker.call(controllers.ClienteController.remover(id))
   }
}
        

// @LINE:56
case controllers_ClienteController_filtraPorNome36_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_ClienteController_filtraPorNome36_invoker.call(controllers.ClienteController.filtraPorNome(filtro))
   }
}
        

// @LINE:59
case controllers_FornecedorController_inserir37_route(params) => {
   call { 
        controllers_FornecedorController_inserir37_invoker.call(controllers.FornecedorController.inserir())
   }
}
        

// @LINE:60
case controllers_FornecedorController_atualizar38_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FornecedorController_atualizar38_invoker.call(controllers.FornecedorController.atualizar(id))
   }
}
        

// @LINE:61
case controllers_FornecedorController_buscaTodos39_route(params) => {
   call { 
        controllers_FornecedorController_buscaTodos39_invoker.call(controllers.FornecedorController.buscaTodos())
   }
}
        

// @LINE:62
case controllers_FornecedorController_buscaPorId40_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FornecedorController_buscaPorId40_invoker.call(controllers.FornecedorController.buscaPorId(id))
   }
}
        

// @LINE:63
case controllers_FornecedorController_remover41_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FornecedorController_remover41_invoker.call(controllers.FornecedorController.remover(id))
   }
}
        

// @LINE:64
case controllers_FornecedorController_filtraPorNome42_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_FornecedorController_filtraPorNome42_invoker.call(controllers.FornecedorController.filtraPorNome(filtro))
   }
}
        

// @LINE:67
case controllers_CategoriaController_inserir43_route(params) => {
   call { 
        controllers_CategoriaController_inserir43_invoker.call(controllers.CategoriaController.inserir())
   }
}
        

// @LINE:68
case controllers_CategoriaController_atualizar44_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_atualizar44_invoker.call(controllers.CategoriaController.atualizar(id))
   }
}
        

// @LINE:69
case controllers_CategoriaController_buscaTodos45_route(params) => {
   call { 
        controllers_CategoriaController_buscaTodos45_invoker.call(controllers.CategoriaController.buscaTodos())
   }
}
        

// @LINE:70
case controllers_CategoriaController_buscaPorId46_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_buscaPorId46_invoker.call(controllers.CategoriaController.buscaPorId(id))
   }
}
        

// @LINE:71
case controllers_CategoriaController_remover47_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_remover47_invoker.call(controllers.CategoriaController.remover(id))
   }
}
        

// @LINE:72
case controllers_CategoriaController_filtraPorNome48_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_CategoriaController_filtraPorNome48_invoker.call(controllers.CategoriaController.filtraPorNome(filtro))
   }
}
        

// @LINE:75
case controllers_FabricanteController_inserir49_route(params) => {
   call { 
        controllers_FabricanteController_inserir49_invoker.call(controllers.FabricanteController.inserir())
   }
}
        

// @LINE:76
case controllers_FabricanteController_atualizar50_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FabricanteController_atualizar50_invoker.call(controllers.FabricanteController.atualizar(id))
   }
}
        

// @LINE:77
case controllers_FabricanteController_buscaTodos51_route(params) => {
   call { 
        controllers_FabricanteController_buscaTodos51_invoker.call(controllers.FabricanteController.buscaTodos())
   }
}
        

// @LINE:78
case controllers_FabricanteController_buscaPorId52_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FabricanteController_buscaPorId52_invoker.call(controllers.FabricanteController.buscaPorId(id))
   }
}
        

// @LINE:79
case controllers_FabricanteController_remover53_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FabricanteController_remover53_invoker.call(controllers.FabricanteController.remover(id))
   }
}
        

// @LINE:80
case controllers_FabricanteController_filtraPorNome54_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_FabricanteController_filtraPorNome54_invoker.call(controllers.FabricanteController.filtraPorNome(filtro))
   }
}
        

// @LINE:83
case controllers_UnidadeDeMedidaController_inserir55_route(params) => {
   call { 
        controllers_UnidadeDeMedidaController_inserir55_invoker.call(controllers.UnidadeDeMedidaController.inserir())
   }
}
        

// @LINE:84
case controllers_UnidadeDeMedidaController_atualizar56_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_atualizar56_invoker.call(controllers.UnidadeDeMedidaController.atualizar(id))
   }
}
        

// @LINE:85
case controllers_UnidadeDeMedidaController_buscaTodos57_route(params) => {
   call { 
        controllers_UnidadeDeMedidaController_buscaTodos57_invoker.call(controllers.UnidadeDeMedidaController.buscaTodos())
   }
}
        

// @LINE:86
case controllers_UnidadeDeMedidaController_buscaPorId58_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_buscaPorId58_invoker.call(controllers.UnidadeDeMedidaController.buscaPorId(id))
   }
}
        

// @LINE:87
case controllers_UnidadeDeMedidaController_remover59_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_remover59_invoker.call(controllers.UnidadeDeMedidaController.remover(id))
   }
}
        

// @LINE:88
case controllers_UnidadeDeMedidaController_filtraPorNome60_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_UnidadeDeMedidaController_filtraPorNome60_invoker.call(controllers.UnidadeDeMedidaController.filtraPorNome(filtro))
   }
}
        

// @LINE:91
case controllers_ProdutoController_inserir61_route(params) => {
   call { 
        controllers_ProdutoController_inserir61_invoker.call(controllers.ProdutoController.inserir())
   }
}
        

// @LINE:92
case controllers_ProdutoController_atualizar62_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_atualizar62_invoker.call(controllers.ProdutoController.atualizar(id))
   }
}
        

// @LINE:93
case controllers_ProdutoController_buscaTodos63_route(params) => {
   call { 
        controllers_ProdutoController_buscaTodos63_invoker.call(controllers.ProdutoController.buscaTodos())
   }
}
        

// @LINE:94
case controllers_ProdutoController_buscaPorPaginas64_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_ProdutoController_buscaPorPaginas64_invoker.call(controllers.ProdutoController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:95
case controllers_ProdutoController_buscaPorId65_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_buscaPorId65_invoker.call(controllers.ProdutoController.buscaPorId(id))
   }
}
        

// @LINE:96
case controllers_ProdutoController_remover66_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_remover66_invoker.call(controllers.ProdutoController.remover(id))
   }
}
        

// @LINE:99
case controllers_UsuarioController_inserir67_route(params) => {
   call { 
        controllers_UsuarioController_inserir67_invoker.call(controllers.UsuarioController.inserir())
   }
}
        

// @LINE:100
case controllers_UsuarioController_atualizar68_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_atualizar68_invoker.call(controllers.UsuarioController.atualizar(id))
   }
}
        

// @LINE:101
case controllers_UsuarioController_buscaTodos69_route(params) => {
   call { 
        controllers_UsuarioController_buscaTodos69_invoker.call(controllers.UsuarioController.buscaTodos())
   }
}
        

// @LINE:102
case controllers_UsuarioController_buscaPorPaginas70_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_UsuarioController_buscaPorPaginas70_invoker.call(controllers.UsuarioController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:103
case controllers_UsuarioController_buscaPorId71_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_buscaPorId71_invoker.call(controllers.UsuarioController.buscaPorId(id))
   }
}
        

// @LINE:104
case controllers_UsuarioController_remover72_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_remover72_invoker.call(controllers.UsuarioController.remover(id))
   }
}
        

// @LINE:107
case controllers_Assets_at73_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at73_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     