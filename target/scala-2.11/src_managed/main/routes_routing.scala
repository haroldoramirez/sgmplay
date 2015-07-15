// @SOURCE:/home/haroldo/projetos/academico/sgmplay/conf/routes
// @HASH:b761bef19c7af9a01a8bedb74774e1ce3504ba0c
// @DATE:Wed Jul 15 17:07:49 BRT 2015


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
        

// @LINE:22
private[this] lazy val controllers_Application_versaoplay6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("versaoplay"))))
private[this] lazy val controllers_Application_versaoplay6_invoker = createInvoker(
controllers.Application.versaoplay(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "versaoplay", Nil,"GET", """ Applications""", Routes.prefix + """versaoplay"""))
        

// @LINE:25
private[this] lazy val controllers_PaisController_inserir7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises"))))
private[this] lazy val controllers_PaisController_inserir7_invoker = createInvoker(
controllers.PaisController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "inserir", Nil,"POST", """ CRUD País""", Routes.prefix + """paises"""))
        

// @LINE:26
private[this] lazy val controllers_PaisController_atualizar8_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_atualizar8_invoker = createInvoker(
controllers.PaisController.atualizar(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "atualizar", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:27
private[this] lazy val controllers_PaisController_buscaTodos9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises"))))
private[this] lazy val controllers_PaisController_buscaTodos9_invoker = createInvoker(
controllers.PaisController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """paises"""))
        

// @LINE:28
private[this] lazy val controllers_PaisController_buscaPorId10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_buscaPorId10_invoker = createInvoker(
controllers.PaisController.buscaPorId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_PaisController_remover11_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_remover11_invoker = createInvoker(
controllers.PaisController.remover(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "remover", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_PaisController_filtraPorNome12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/nome/"),DynamicPart("filtro", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_filtraPorNome12_invoker = createInvoker(
controllers.PaisController.filtraPorNome(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "filtraPorNome", Seq(classOf[String]),"GET", """""", Routes.prefix + """paises/nome/$filtro<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_EstadoController_inserir13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados"))))
private[this] lazy val controllers_EstadoController_inserir13_invoker = createInvoker(
controllers.EstadoController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "inserir", Nil,"POST", """ CRUD Estado""", Routes.prefix + """estados"""))
        

// @LINE:34
private[this] lazy val controllers_EstadoController_atualizar14_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_atualizar14_invoker = createInvoker(
controllers.EstadoController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_EstadoController_buscaTodos15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados"))))
private[this] lazy val controllers_EstadoController_buscaTodos15_invoker = createInvoker(
controllers.EstadoController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """estados"""))
        

// @LINE:36
private[this] lazy val controllers_EstadoController_buscaPorPaginas16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estadosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_buscaPorPaginas16_invoker = createInvoker(
controllers.EstadoController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """estadosPagina/$pagina<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_EstadoController_buscaPorId17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_buscaPorId17_invoker = createInvoker(
controllers.EstadoController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_EstadoController_remover18_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_remover18_invoker = createInvoker(
controllers.EstadoController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:41
private[this] lazy val controllers_CidadeController_inserir19_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades"))))
private[this] lazy val controllers_CidadeController_inserir19_invoker = createInvoker(
controllers.CidadeController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "inserir", Nil,"POST", """ CRUD Cidade""", Routes.prefix + """cidades"""))
        

// @LINE:42
private[this] lazy val controllers_CidadeController_atualizar20_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_atualizar20_invoker = createInvoker(
controllers.CidadeController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:43
private[this] lazy val controllers_CidadeController_buscaTodos21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades"))))
private[this] lazy val controllers_CidadeController_buscaTodos21_invoker = createInvoker(
controllers.CidadeController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """cidades"""))
        

// @LINE:44
private[this] lazy val controllers_CidadeController_buscaPorPaginas22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidadesPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_buscaPorPaginas22_invoker = createInvoker(
controllers.CidadeController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """cidadesPagina/$pagina<[^/]+>"""))
        

// @LINE:45
private[this] lazy val controllers_CidadeController_buscaPorId23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_buscaPorId23_invoker = createInvoker(
controllers.CidadeController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_CidadeController_remover24_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_remover24_invoker = createInvoker(
controllers.CidadeController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:49
private[this] lazy val controllers_BairroController_inserir25_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros"))))
private[this] lazy val controllers_BairroController_inserir25_invoker = createInvoker(
controllers.BairroController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "inserir", Nil,"POST", """ CRUD Bairro""", Routes.prefix + """bairros"""))
        

// @LINE:50
private[this] lazy val controllers_BairroController_atualizar26_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_atualizar26_invoker = createInvoker(
controllers.BairroController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:51
private[this] lazy val controllers_BairroController_buscaTodos27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros"))))
private[this] lazy val controllers_BairroController_buscaTodos27_invoker = createInvoker(
controllers.BairroController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """bairros"""))
        

// @LINE:52
private[this] lazy val controllers_BairroController_buscaPorPaginas28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairrosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_buscaPorPaginas28_invoker = createInvoker(
controllers.BairroController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """bairrosPagina/$pagina<[^/]+>"""))
        

// @LINE:53
private[this] lazy val controllers_BairroController_buscaPorId29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_buscaPorId29_invoker = createInvoker(
controllers.BairroController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:54
private[this] lazy val controllers_BairroController_remover30_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_remover30_invoker = createInvoker(
controllers.BairroController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:57
private[this] lazy val controllers_ClienteController_inserir31_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes"))))
private[this] lazy val controllers_ClienteController_inserir31_invoker = createInvoker(
controllers.ClienteController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "inserir", Nil,"POST", """ CRUD Cliente""", Routes.prefix + """clientes"""))
        

// @LINE:58
private[this] lazy val controllers_ClienteController_atualizar32_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_atualizar32_invoker = createInvoker(
controllers.ClienteController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_ClienteController_buscaTodos33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes"))))
private[this] lazy val controllers_ClienteController_buscaTodos33_invoker = createInvoker(
controllers.ClienteController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """clientes"""))
        

// @LINE:60
private[this] lazy val controllers_ClienteController_buscaPorPaginas34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientesPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_buscaPorPaginas34_invoker = createInvoker(
controllers.ClienteController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """clientesPagina/$pagina<[^/]+>"""))
        

// @LINE:61
private[this] lazy val controllers_ClienteController_buscaPorId35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_buscaPorId35_invoker = createInvoker(
controllers.ClienteController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:62
private[this] lazy val controllers_ClienteController_remover36_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_remover36_invoker = createInvoker(
controllers.ClienteController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:65
private[this] lazy val controllers_FornecedorController_inserir37_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores"))))
private[this] lazy val controllers_FornecedorController_inserir37_invoker = createInvoker(
controllers.FornecedorController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "inserir", Nil,"POST", """ CRUD Fornecedor""", Routes.prefix + """fornecedores"""))
        

// @LINE:66
private[this] lazy val controllers_FornecedorController_atualizar38_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_atualizar38_invoker = createInvoker(
controllers.FornecedorController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:67
private[this] lazy val controllers_FornecedorController_buscaTodos39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores"))))
private[this] lazy val controllers_FornecedorController_buscaTodos39_invoker = createInvoker(
controllers.FornecedorController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """fornecedores"""))
        

// @LINE:68
private[this] lazy val controllers_FornecedorController_buscaPorPaginas40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedoresPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_buscaPorPaginas40_invoker = createInvoker(
controllers.FornecedorController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fornecedoresPagina/$pagina<[^/]+>"""))
        

// @LINE:69
private[this] lazy val controllers_FornecedorController_buscaPorId41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_buscaPorId41_invoker = createInvoker(
controllers.FornecedorController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:70
private[this] lazy val controllers_FornecedorController_remover42_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_remover42_invoker = createInvoker(
controllers.FornecedorController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:73
private[this] lazy val controllers_CategoriaController_inserir43_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias"))))
private[this] lazy val controllers_CategoriaController_inserir43_invoker = createInvoker(
controllers.CategoriaController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "inserir", Nil,"POST", """ CRUD Categoria""", Routes.prefix + """categorias"""))
        

// @LINE:74
private[this] lazy val controllers_CategoriaController_atualizar44_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_atualizar44_invoker = createInvoker(
controllers.CategoriaController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:75
private[this] lazy val controllers_CategoriaController_buscaTodos45_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias"))))
private[this] lazy val controllers_CategoriaController_buscaTodos45_invoker = createInvoker(
controllers.CategoriaController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """categorias"""))
        

// @LINE:76
private[this] lazy val controllers_CategoriaController_buscaPorPaginas46_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categoriasPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_buscaPorPaginas46_invoker = createInvoker(
controllers.CategoriaController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """categoriasPagina/$pagina<[^/]+>"""))
        

// @LINE:77
private[this] lazy val controllers_CategoriaController_buscaPorId47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_buscaPorId47_invoker = createInvoker(
controllers.CategoriaController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:78
private[this] lazy val controllers_CategoriaController_remover48_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_remover48_invoker = createInvoker(
controllers.CategoriaController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:81
private[this] lazy val controllers_FabricanteController_inserir49_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes"))))
private[this] lazy val controllers_FabricanteController_inserir49_invoker = createInvoker(
controllers.FabricanteController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "inserir", Nil,"POST", """ CRUD Fabricante""", Routes.prefix + """fabricantes"""))
        

// @LINE:82
private[this] lazy val controllers_FabricanteController_atualizar50_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_atualizar50_invoker = createInvoker(
controllers.FabricanteController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:83
private[this] lazy val controllers_FabricanteController_buscaTodos51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes"))))
private[this] lazy val controllers_FabricanteController_buscaTodos51_invoker = createInvoker(
controllers.FabricanteController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """fabricantes"""))
        

// @LINE:84
private[this] lazy val controllers_FabricanteController_buscaPorPaginas52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantesPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_buscaPorPaginas52_invoker = createInvoker(
controllers.FabricanteController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fabricantesPagina/$pagina<[^/]+>"""))
        

// @LINE:85
private[this] lazy val controllers_FabricanteController_buscaPorId53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_buscaPorId53_invoker = createInvoker(
controllers.FabricanteController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:86
private[this] lazy val controllers_FabricanteController_remover54_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_remover54_invoker = createInvoker(
controllers.FabricanteController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:89
private[this] lazy val controllers_UnidadeDeMedidaController_inserir55_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas"))))
private[this] lazy val controllers_UnidadeDeMedidaController_inserir55_invoker = createInvoker(
controllers.UnidadeDeMedidaController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "inserir", Nil,"POST", """ CRUD Unidade de Medida""", Routes.prefix + """unidadesdemedidas"""))
        

// @LINE:90
private[this] lazy val controllers_UnidadeDeMedidaController_atualizar56_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_atualizar56_invoker = createInvoker(
controllers.UnidadeDeMedidaController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:91
private[this] lazy val controllers_UnidadeDeMedidaController_buscaTodos57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas"))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaTodos57_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """unidadesdemedidas"""))
        

// @LINE:92
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorPaginas58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidasPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorPaginas58_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """unidadesdemedidasPagina/$pagina<[^/]+>"""))
        

// @LINE:93
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorId59_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorId59_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:94
private[this] lazy val controllers_UnidadeDeMedidaController_remover60_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_remover60_invoker = createInvoker(
controllers.UnidadeDeMedidaController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:97
private[this] lazy val controllers_ProdutoController_inserir61_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos"))))
private[this] lazy val controllers_ProdutoController_inserir61_invoker = createInvoker(
controllers.ProdutoController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "inserir", Nil,"POST", """ CRUD Produto""", Routes.prefix + """produtos"""))
        

// @LINE:98
private[this] lazy val controllers_ProdutoController_atualizar62_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_atualizar62_invoker = createInvoker(
controllers.ProdutoController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:99
private[this] lazy val controllers_ProdutoController_buscaTodos63_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos"))))
private[this] lazy val controllers_ProdutoController_buscaTodos63_invoker = createInvoker(
controllers.ProdutoController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """produtos"""))
        

// @LINE:100
private[this] lazy val controllers_ProdutoController_buscaPorPaginas64_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_buscaPorPaginas64_invoker = createInvoker(
controllers.ProdutoController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """produtosPagina/$pagina<[^/]+>"""))
        

// @LINE:101
private[this] lazy val controllers_ProdutoController_buscaPorId65_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_buscaPorId65_invoker = createInvoker(
controllers.ProdutoController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:102
private[this] lazy val controllers_ProdutoController_remover66_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_remover66_invoker = createInvoker(
controllers.ProdutoController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:105
private[this] lazy val controllers_UsuarioController_inserir67_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios"))))
private[this] lazy val controllers_UsuarioController_inserir67_invoker = createInvoker(
controllers.UsuarioController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "inserir", Nil,"POST", """ CRUD Usuário""", Routes.prefix + """usuarios"""))
        

// @LINE:106
private[this] lazy val controllers_UsuarioController_atualizar68_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_atualizar68_invoker = createInvoker(
controllers.UsuarioController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:107
private[this] lazy val controllers_UsuarioController_buscaTodos69_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios"))))
private[this] lazy val controllers_UsuarioController_buscaTodos69_invoker = createInvoker(
controllers.UsuarioController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """usuarios"""))
        

// @LINE:108
private[this] lazy val controllers_UsuarioController_buscaPorPaginas70_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuariosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_buscaPorPaginas70_invoker = createInvoker(
controllers.UsuarioController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """usuariosPagina/$pagina<[^/]+>"""))
        

// @LINE:109
private[this] lazy val controllers_UsuarioController_buscaPorId71_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_buscaPorId71_invoker = createInvoker(
controllers.UsuarioController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:110
private[this] lazy val controllers_UsuarioController_remover72_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_remover72_invoker = createInvoker(
controllers.UsuarioController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:113
private[this] lazy val controllers_Assets_at73_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at73_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.LoginController.loginTela()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autenticado""","""controllers.LoginController.telaAutenticado()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saiu""","""controllers.LoginController.telaLogout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """autenticar""","""controllers.LoginController.autenticar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.LoginController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """versaoplay""","""controllers.Application.versaoplay()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises""","""controllers.PaisController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.atualizar(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises""","""controllers.PaisController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.buscaPorId(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.remover(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/nome/$filtro<[^/]+>""","""controllers.PaisController.filtraPorNome(filtro:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados""","""controllers.EstadoController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados""","""controllers.EstadoController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estadosPagina/$pagina<[^/]+>""","""controllers.EstadoController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades""","""controllers.CidadeController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades""","""controllers.CidadeController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidadesPagina/$pagina<[^/]+>""","""controllers.CidadeController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros""","""controllers.BairroController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros""","""controllers.BairroController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairrosPagina/$pagina<[^/]+>""","""controllers.BairroController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes""","""controllers.ClienteController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes""","""controllers.ClienteController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientesPagina/$pagina<[^/]+>""","""controllers.ClienteController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores""","""controllers.FornecedorController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores""","""controllers.FornecedorController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedoresPagina/$pagina<[^/]+>""","""controllers.FornecedorController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias""","""controllers.CategoriaController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias""","""controllers.CategoriaController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categoriasPagina/$pagina<[^/]+>""","""controllers.CategoriaController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes""","""controllers.FabricanteController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes""","""controllers.FabricanteController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantesPagina/$pagina<[^/]+>""","""controllers.FabricanteController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas""","""controllers.UnidadeDeMedidaController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas""","""controllers.UnidadeDeMedidaController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidasPagina/$pagina<[^/]+>""","""controllers.UnidadeDeMedidaController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos""","""controllers.ProdutoController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos""","""controllers.ProdutoController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtosPagina/$pagina<[^/]+>""","""controllers.ProdutoController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios""","""controllers.UsuarioController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios""","""controllers.UsuarioController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuariosPagina/$pagina<[^/]+>""","""controllers.UsuarioController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.remover(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:22
case controllers_Application_versaoplay6_route(params) => {
   call { 
        controllers_Application_versaoplay6_invoker.call(controllers.Application.versaoplay())
   }
}
        

// @LINE:25
case controllers_PaisController_inserir7_route(params) => {
   call { 
        controllers_PaisController_inserir7_invoker.call(controllers.PaisController.inserir())
   }
}
        

// @LINE:26
case controllers_PaisController_atualizar8_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_atualizar8_invoker.call(controllers.PaisController.atualizar(id))
   }
}
        

// @LINE:27
case controllers_PaisController_buscaTodos9_route(params) => {
   call { 
        controllers_PaisController_buscaTodos9_invoker.call(controllers.PaisController.buscaTodos())
   }
}
        

// @LINE:28
case controllers_PaisController_buscaPorId10_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_buscaPorId10_invoker.call(controllers.PaisController.buscaPorId(id))
   }
}
        

// @LINE:29
case controllers_PaisController_remover11_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaisController_remover11_invoker.call(controllers.PaisController.remover(id))
   }
}
        

// @LINE:30
case controllers_PaisController_filtraPorNome12_route(params) => {
   call(params.fromPath[String]("filtro", None)) { (filtro) =>
        controllers_PaisController_filtraPorNome12_invoker.call(controllers.PaisController.filtraPorNome(filtro))
   }
}
        

// @LINE:33
case controllers_EstadoController_inserir13_route(params) => {
   call { 
        controllers_EstadoController_inserir13_invoker.call(controllers.EstadoController.inserir())
   }
}
        

// @LINE:34
case controllers_EstadoController_atualizar14_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EstadoController_atualizar14_invoker.call(controllers.EstadoController.atualizar(id))
   }
}
        

// @LINE:35
case controllers_EstadoController_buscaTodos15_route(params) => {
   call { 
        controllers_EstadoController_buscaTodos15_invoker.call(controllers.EstadoController.buscaTodos())
   }
}
        

// @LINE:36
case controllers_EstadoController_buscaPorPaginas16_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_EstadoController_buscaPorPaginas16_invoker.call(controllers.EstadoController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:37
case controllers_EstadoController_buscaPorId17_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EstadoController_buscaPorId17_invoker.call(controllers.EstadoController.buscaPorId(id))
   }
}
        

// @LINE:38
case controllers_EstadoController_remover18_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EstadoController_remover18_invoker.call(controllers.EstadoController.remover(id))
   }
}
        

// @LINE:41
case controllers_CidadeController_inserir19_route(params) => {
   call { 
        controllers_CidadeController_inserir19_invoker.call(controllers.CidadeController.inserir())
   }
}
        

// @LINE:42
case controllers_CidadeController_atualizar20_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CidadeController_atualizar20_invoker.call(controllers.CidadeController.atualizar(id))
   }
}
        

// @LINE:43
case controllers_CidadeController_buscaTodos21_route(params) => {
   call { 
        controllers_CidadeController_buscaTodos21_invoker.call(controllers.CidadeController.buscaTodos())
   }
}
        

// @LINE:44
case controllers_CidadeController_buscaPorPaginas22_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_CidadeController_buscaPorPaginas22_invoker.call(controllers.CidadeController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:45
case controllers_CidadeController_buscaPorId23_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CidadeController_buscaPorId23_invoker.call(controllers.CidadeController.buscaPorId(id))
   }
}
        

// @LINE:46
case controllers_CidadeController_remover24_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CidadeController_remover24_invoker.call(controllers.CidadeController.remover(id))
   }
}
        

// @LINE:49
case controllers_BairroController_inserir25_route(params) => {
   call { 
        controllers_BairroController_inserir25_invoker.call(controllers.BairroController.inserir())
   }
}
        

// @LINE:50
case controllers_BairroController_atualizar26_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BairroController_atualizar26_invoker.call(controllers.BairroController.atualizar(id))
   }
}
        

// @LINE:51
case controllers_BairroController_buscaTodos27_route(params) => {
   call { 
        controllers_BairroController_buscaTodos27_invoker.call(controllers.BairroController.buscaTodos())
   }
}
        

// @LINE:52
case controllers_BairroController_buscaPorPaginas28_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_BairroController_buscaPorPaginas28_invoker.call(controllers.BairroController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:53
case controllers_BairroController_buscaPorId29_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BairroController_buscaPorId29_invoker.call(controllers.BairroController.buscaPorId(id))
   }
}
        

// @LINE:54
case controllers_BairroController_remover30_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BairroController_remover30_invoker.call(controllers.BairroController.remover(id))
   }
}
        

// @LINE:57
case controllers_ClienteController_inserir31_route(params) => {
   call { 
        controllers_ClienteController_inserir31_invoker.call(controllers.ClienteController.inserir())
   }
}
        

// @LINE:58
case controllers_ClienteController_atualizar32_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClienteController_atualizar32_invoker.call(controllers.ClienteController.atualizar(id))
   }
}
        

// @LINE:59
case controllers_ClienteController_buscaTodos33_route(params) => {
   call { 
        controllers_ClienteController_buscaTodos33_invoker.call(controllers.ClienteController.buscaTodos())
   }
}
        

// @LINE:60
case controllers_ClienteController_buscaPorPaginas34_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_ClienteController_buscaPorPaginas34_invoker.call(controllers.ClienteController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:61
case controllers_ClienteController_buscaPorId35_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClienteController_buscaPorId35_invoker.call(controllers.ClienteController.buscaPorId(id))
   }
}
        

// @LINE:62
case controllers_ClienteController_remover36_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClienteController_remover36_invoker.call(controllers.ClienteController.remover(id))
   }
}
        

// @LINE:65
case controllers_FornecedorController_inserir37_route(params) => {
   call { 
        controllers_FornecedorController_inserir37_invoker.call(controllers.FornecedorController.inserir())
   }
}
        

// @LINE:66
case controllers_FornecedorController_atualizar38_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FornecedorController_atualizar38_invoker.call(controllers.FornecedorController.atualizar(id))
   }
}
        

// @LINE:67
case controllers_FornecedorController_buscaTodos39_route(params) => {
   call { 
        controllers_FornecedorController_buscaTodos39_invoker.call(controllers.FornecedorController.buscaTodos())
   }
}
        

// @LINE:68
case controllers_FornecedorController_buscaPorPaginas40_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_FornecedorController_buscaPorPaginas40_invoker.call(controllers.FornecedorController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:69
case controllers_FornecedorController_buscaPorId41_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FornecedorController_buscaPorId41_invoker.call(controllers.FornecedorController.buscaPorId(id))
   }
}
        

// @LINE:70
case controllers_FornecedorController_remover42_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FornecedorController_remover42_invoker.call(controllers.FornecedorController.remover(id))
   }
}
        

// @LINE:73
case controllers_CategoriaController_inserir43_route(params) => {
   call { 
        controllers_CategoriaController_inserir43_invoker.call(controllers.CategoriaController.inserir())
   }
}
        

// @LINE:74
case controllers_CategoriaController_atualizar44_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CategoriaController_atualizar44_invoker.call(controllers.CategoriaController.atualizar(id))
   }
}
        

// @LINE:75
case controllers_CategoriaController_buscaTodos45_route(params) => {
   call { 
        controllers_CategoriaController_buscaTodos45_invoker.call(controllers.CategoriaController.buscaTodos())
   }
}
        

// @LINE:76
case controllers_CategoriaController_buscaPorPaginas46_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_CategoriaController_buscaPorPaginas46_invoker.call(controllers.CategoriaController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:77
case controllers_CategoriaController_buscaPorId47_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CategoriaController_buscaPorId47_invoker.call(controllers.CategoriaController.buscaPorId(id))
   }
}
        

// @LINE:78
case controllers_CategoriaController_remover48_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CategoriaController_remover48_invoker.call(controllers.CategoriaController.remover(id))
   }
}
        

// @LINE:81
case controllers_FabricanteController_inserir49_route(params) => {
   call { 
        controllers_FabricanteController_inserir49_invoker.call(controllers.FabricanteController.inserir())
   }
}
        

// @LINE:82
case controllers_FabricanteController_atualizar50_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FabricanteController_atualizar50_invoker.call(controllers.FabricanteController.atualizar(id))
   }
}
        

// @LINE:83
case controllers_FabricanteController_buscaTodos51_route(params) => {
   call { 
        controllers_FabricanteController_buscaTodos51_invoker.call(controllers.FabricanteController.buscaTodos())
   }
}
        

// @LINE:84
case controllers_FabricanteController_buscaPorPaginas52_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_FabricanteController_buscaPorPaginas52_invoker.call(controllers.FabricanteController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:85
case controllers_FabricanteController_buscaPorId53_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FabricanteController_buscaPorId53_invoker.call(controllers.FabricanteController.buscaPorId(id))
   }
}
        

// @LINE:86
case controllers_FabricanteController_remover54_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FabricanteController_remover54_invoker.call(controllers.FabricanteController.remover(id))
   }
}
        

// @LINE:89
case controllers_UnidadeDeMedidaController_inserir55_route(params) => {
   call { 
        controllers_UnidadeDeMedidaController_inserir55_invoker.call(controllers.UnidadeDeMedidaController.inserir())
   }
}
        

// @LINE:90
case controllers_UnidadeDeMedidaController_atualizar56_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_atualizar56_invoker.call(controllers.UnidadeDeMedidaController.atualizar(id))
   }
}
        

// @LINE:91
case controllers_UnidadeDeMedidaController_buscaTodos57_route(params) => {
   call { 
        controllers_UnidadeDeMedidaController_buscaTodos57_invoker.call(controllers.UnidadeDeMedidaController.buscaTodos())
   }
}
        

// @LINE:92
case controllers_UnidadeDeMedidaController_buscaPorPaginas58_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_UnidadeDeMedidaController_buscaPorPaginas58_invoker.call(controllers.UnidadeDeMedidaController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:93
case controllers_UnidadeDeMedidaController_buscaPorId59_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_buscaPorId59_invoker.call(controllers.UnidadeDeMedidaController.buscaPorId(id))
   }
}
        

// @LINE:94
case controllers_UnidadeDeMedidaController_remover60_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_remover60_invoker.call(controllers.UnidadeDeMedidaController.remover(id))
   }
}
        

// @LINE:97
case controllers_ProdutoController_inserir61_route(params) => {
   call { 
        controllers_ProdutoController_inserir61_invoker.call(controllers.ProdutoController.inserir())
   }
}
        

// @LINE:98
case controllers_ProdutoController_atualizar62_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_atualizar62_invoker.call(controllers.ProdutoController.atualizar(id))
   }
}
        

// @LINE:99
case controllers_ProdutoController_buscaTodos63_route(params) => {
   call { 
        controllers_ProdutoController_buscaTodos63_invoker.call(controllers.ProdutoController.buscaTodos())
   }
}
        

// @LINE:100
case controllers_ProdutoController_buscaPorPaginas64_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_ProdutoController_buscaPorPaginas64_invoker.call(controllers.ProdutoController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:101
case controllers_ProdutoController_buscaPorId65_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_buscaPorId65_invoker.call(controllers.ProdutoController.buscaPorId(id))
   }
}
        

// @LINE:102
case controllers_ProdutoController_remover66_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_remover66_invoker.call(controllers.ProdutoController.remover(id))
   }
}
        

// @LINE:105
case controllers_UsuarioController_inserir67_route(params) => {
   call { 
        controllers_UsuarioController_inserir67_invoker.call(controllers.UsuarioController.inserir())
   }
}
        

// @LINE:106
case controllers_UsuarioController_atualizar68_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_atualizar68_invoker.call(controllers.UsuarioController.atualizar(id))
   }
}
        

// @LINE:107
case controllers_UsuarioController_buscaTodos69_route(params) => {
   call { 
        controllers_UsuarioController_buscaTodos69_invoker.call(controllers.UsuarioController.buscaTodos())
   }
}
        

// @LINE:108
case controllers_UsuarioController_buscaPorPaginas70_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_UsuarioController_buscaPorPaginas70_invoker.call(controllers.UsuarioController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:109
case controllers_UsuarioController_buscaPorId71_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_buscaPorId71_invoker.call(controllers.UsuarioController.buscaPorId(id))
   }
}
        

// @LINE:110
case controllers_UsuarioController_remover72_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_remover72_invoker.call(controllers.UsuarioController.remover(id))
   }
}
        

// @LINE:113
case controllers_Assets_at73_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at73_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     