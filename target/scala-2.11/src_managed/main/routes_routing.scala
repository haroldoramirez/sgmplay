// @SOURCE:/home/haroldo/projetos/academico/sgmplay/conf/routes
// @HASH:7bd89177b5248d06a52bc947f48e5860d108475c
// @DATE:Thu Mar 05 15:17:15 BRT 2015


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
private[this] lazy val controllers_Assets_at0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:15
private[this] lazy val controllers_Application_versaoplay1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("versaoplay"))))
private[this] lazy val controllers_Application_versaoplay1_invoker = createInvoker(
controllers.Application.versaoplay(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "versaoplay", Nil,"GET", """ Applications""", Routes.prefix + """versaoplay"""))
        

// @LINE:18
private[this] lazy val controllers_PaisController_inserir2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises"))))
private[this] lazy val controllers_PaisController_inserir2_invoker = createInvoker(
controllers.PaisController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "inserir", Nil,"POST", """ CRUD País""", Routes.prefix + """paises"""))
        

// @LINE:19
private[this] lazy val controllers_PaisController_atualizar3_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_atualizar3_invoker = createInvoker(
controllers.PaisController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_PaisController_buscaTodos4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises"))))
private[this] lazy val controllers_PaisController_buscaTodos4_invoker = createInvoker(
controllers.PaisController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """paises"""))
        

// @LINE:21
private[this] lazy val controllers_PaisController_buscaPorPaginas5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paisesPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_buscaPorPaginas5_invoker = createInvoker(
controllers.PaisController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """paisesPagina/$pagina<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_PaisController_buscaPorId6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_buscaPorId6_invoker = createInvoker(
controllers.PaisController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_PaisController_remover7_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paises/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_PaisController_remover7_invoker = createInvoker(
controllers.PaisController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """paises/$id<[^/]+>"""))
        

// @LINE:26
private[this] lazy val controllers_EstadoController_inserir8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados"))))
private[this] lazy val controllers_EstadoController_inserir8_invoker = createInvoker(
controllers.EstadoController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "inserir", Nil,"POST", """ CRUD Estado""", Routes.prefix + """estados"""))
        

// @LINE:27
private[this] lazy val controllers_EstadoController_atualizar9_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_atualizar9_invoker = createInvoker(
controllers.EstadoController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:28
private[this] lazy val controllers_EstadoController_buscaTodos10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados"))))
private[this] lazy val controllers_EstadoController_buscaTodos10_invoker = createInvoker(
controllers.EstadoController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """estados"""))
        

// @LINE:29
private[this] lazy val controllers_EstadoController_buscaPorPaginas11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estadosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_buscaPorPaginas11_invoker = createInvoker(
controllers.EstadoController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """estadosPagina/$pagina<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_EstadoController_buscaPorId12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_buscaPorId12_invoker = createInvoker(
controllers.EstadoController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_EstadoController_remover13_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estados/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_EstadoController_remover13_invoker = createInvoker(
controllers.EstadoController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """estados/$id<[^/]+>"""))
        

// @LINE:34
private[this] lazy val controllers_CidadeController_inserir14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades"))))
private[this] lazy val controllers_CidadeController_inserir14_invoker = createInvoker(
controllers.CidadeController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "inserir", Nil,"POST", """ CRUD Cidade""", Routes.prefix + """cidades"""))
        

// @LINE:35
private[this] lazy val controllers_CidadeController_atualizar15_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_atualizar15_invoker = createInvoker(
controllers.CidadeController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_CidadeController_buscaTodos16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades"))))
private[this] lazy val controllers_CidadeController_buscaTodos16_invoker = createInvoker(
controllers.CidadeController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """cidades"""))
        

// @LINE:37
private[this] lazy val controllers_CidadeController_buscaPorPaginas17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidadesPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_buscaPorPaginas17_invoker = createInvoker(
controllers.CidadeController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """cidadesPagina/$pagina<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_CidadeController_buscaPorId18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_buscaPorId18_invoker = createInvoker(
controllers.CidadeController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:39
private[this] lazy val controllers_CidadeController_remover19_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cidades/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CidadeController_remover19_invoker = createInvoker(
controllers.CidadeController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """cidades/$id<[^/]+>"""))
        

// @LINE:42
private[this] lazy val controllers_BairroController_inserir20_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros"))))
private[this] lazy val controllers_BairroController_inserir20_invoker = createInvoker(
controllers.BairroController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "inserir", Nil,"POST", """ CRUD Bairro""", Routes.prefix + """bairros"""))
        

// @LINE:43
private[this] lazy val controllers_BairroController_atualizar21_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_atualizar21_invoker = createInvoker(
controllers.BairroController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:44
private[this] lazy val controllers_BairroController_buscaTodos22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros"))))
private[this] lazy val controllers_BairroController_buscaTodos22_invoker = createInvoker(
controllers.BairroController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """bairros"""))
        

// @LINE:45
private[this] lazy val controllers_BairroController_buscaPorPaginas23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairrosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_buscaPorPaginas23_invoker = createInvoker(
controllers.BairroController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """bairrosPagina/$pagina<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_BairroController_buscaPorId24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_buscaPorId24_invoker = createInvoker(
controllers.BairroController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:47
private[this] lazy val controllers_BairroController_remover25_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bairros/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BairroController_remover25_invoker = createInvoker(
controllers.BairroController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """bairros/$id<[^/]+>"""))
        

// @LINE:50
private[this] lazy val controllers_ClienteController_inserir26_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes"))))
private[this] lazy val controllers_ClienteController_inserir26_invoker = createInvoker(
controllers.ClienteController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "inserir", Nil,"POST", """ CRUD Cliente""", Routes.prefix + """clientes"""))
        

// @LINE:51
private[this] lazy val controllers_ClienteController_atualizar27_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_atualizar27_invoker = createInvoker(
controllers.ClienteController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:52
private[this] lazy val controllers_ClienteController_buscaTodos28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes"))))
private[this] lazy val controllers_ClienteController_buscaTodos28_invoker = createInvoker(
controllers.ClienteController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """clientes"""))
        

// @LINE:53
private[this] lazy val controllers_ClienteController_buscaPorPaginas29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientesPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_buscaPorPaginas29_invoker = createInvoker(
controllers.ClienteController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """clientesPagina/$pagina<[^/]+>"""))
        

// @LINE:54
private[this] lazy val controllers_ClienteController_buscaPorId30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_buscaPorId30_invoker = createInvoker(
controllers.ClienteController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:55
private[this] lazy val controllers_ClienteController_remover31_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClienteController_remover31_invoker = createInvoker(
controllers.ClienteController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """clientes/$id<[^/]+>"""))
        

// @LINE:58
private[this] lazy val controllers_FornecedorController_inserir32_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores"))))
private[this] lazy val controllers_FornecedorController_inserir32_invoker = createInvoker(
controllers.FornecedorController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "inserir", Nil,"POST", """ CRUD Fornecedor""", Routes.prefix + """fornecedores"""))
        

// @LINE:59
private[this] lazy val controllers_FornecedorController_atualizar33_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_atualizar33_invoker = createInvoker(
controllers.FornecedorController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:60
private[this] lazy val controllers_FornecedorController_buscaTodos34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores"))))
private[this] lazy val controllers_FornecedorController_buscaTodos34_invoker = createInvoker(
controllers.FornecedorController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """fornecedores"""))
        

// @LINE:61
private[this] lazy val controllers_FornecedorController_buscaPorPaginas35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedoresPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_buscaPorPaginas35_invoker = createInvoker(
controllers.FornecedorController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fornecedoresPagina/$pagina<[^/]+>"""))
        

// @LINE:62
private[this] lazy val controllers_FornecedorController_buscaPorId36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_buscaPorId36_invoker = createInvoker(
controllers.FornecedorController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:63
private[this] lazy val controllers_FornecedorController_remover37_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fornecedores/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FornecedorController_remover37_invoker = createInvoker(
controllers.FornecedorController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """fornecedores/$id<[^/]+>"""))
        

// @LINE:66
private[this] lazy val controllers_CategoriaController_inserir38_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias"))))
private[this] lazy val controllers_CategoriaController_inserir38_invoker = createInvoker(
controllers.CategoriaController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "inserir", Nil,"POST", """ CRUD Categoria""", Routes.prefix + """categorias"""))
        

// @LINE:67
private[this] lazy val controllers_CategoriaController_atualizar39_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_atualizar39_invoker = createInvoker(
controllers.CategoriaController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:68
private[this] lazy val controllers_CategoriaController_buscaTodos40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias"))))
private[this] lazy val controllers_CategoriaController_buscaTodos40_invoker = createInvoker(
controllers.CategoriaController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """categorias"""))
        

// @LINE:69
private[this] lazy val controllers_CategoriaController_buscaPorPaginas41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categoriasPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_buscaPorPaginas41_invoker = createInvoker(
controllers.CategoriaController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """categoriasPagina/$pagina<[^/]+>"""))
        

// @LINE:70
private[this] lazy val controllers_CategoriaController_buscaPorId42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_buscaPorId42_invoker = createInvoker(
controllers.CategoriaController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:71
private[this] lazy val controllers_CategoriaController_remover43_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("categorias/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CategoriaController_remover43_invoker = createInvoker(
controllers.CategoriaController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """categorias/$id<[^/]+>"""))
        

// @LINE:74
private[this] lazy val controllers_FabricanteController_inserir44_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes"))))
private[this] lazy val controllers_FabricanteController_inserir44_invoker = createInvoker(
controllers.FabricanteController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "inserir", Nil,"POST", """ CRUD Fabricante""", Routes.prefix + """fabricantes"""))
        

// @LINE:75
private[this] lazy val controllers_FabricanteController_atualizar45_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_atualizar45_invoker = createInvoker(
controllers.FabricanteController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:76
private[this] lazy val controllers_FabricanteController_buscaTodos46_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes"))))
private[this] lazy val controllers_FabricanteController_buscaTodos46_invoker = createInvoker(
controllers.FabricanteController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """fabricantes"""))
        

// @LINE:77
private[this] lazy val controllers_FabricanteController_buscaPorPaginas47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantesPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_buscaPorPaginas47_invoker = createInvoker(
controllers.FabricanteController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fabricantesPagina/$pagina<[^/]+>"""))
        

// @LINE:78
private[this] lazy val controllers_FabricanteController_buscaPorId48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_buscaPorId48_invoker = createInvoker(
controllers.FabricanteController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:79
private[this] lazy val controllers_FabricanteController_remover49_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fabricantes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FabricanteController_remover49_invoker = createInvoker(
controllers.FabricanteController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """fabricantes/$id<[^/]+>"""))
        

// @LINE:82
private[this] lazy val controllers_UnidadeDeMedidaController_inserir50_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas"))))
private[this] lazy val controllers_UnidadeDeMedidaController_inserir50_invoker = createInvoker(
controllers.UnidadeDeMedidaController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "inserir", Nil,"POST", """ CRUD Unidade de Medida""", Routes.prefix + """unidadesdemedidas"""))
        

// @LINE:83
private[this] lazy val controllers_UnidadeDeMedidaController_atualizar51_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_atualizar51_invoker = createInvoker(
controllers.UnidadeDeMedidaController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:84
private[this] lazy val controllers_UnidadeDeMedidaController_buscaTodos52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas"))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaTodos52_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """unidadesdemedidas"""))
        

// @LINE:85
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorPaginas53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidasPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorPaginas53_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """unidadesdemedidasPagina/$pagina<[^/]+>"""))
        

// @LINE:86
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorId54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_buscaPorId54_invoker = createInvoker(
controllers.UnidadeDeMedidaController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:87
private[this] lazy val controllers_UnidadeDeMedidaController_remover55_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unidadesdemedidas/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UnidadeDeMedidaController_remover55_invoker = createInvoker(
controllers.UnidadeDeMedidaController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """unidadesdemedidas/$id<[^/]+>"""))
        

// @LINE:90
private[this] lazy val controllers_ProdutoController_inserir56_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos"))))
private[this] lazy val controllers_ProdutoController_inserir56_invoker = createInvoker(
controllers.ProdutoController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "inserir", Nil,"POST", """ CRUD Produto""", Routes.prefix + """produtos"""))
        

// @LINE:91
private[this] lazy val controllers_ProdutoController_atualizar57_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_atualizar57_invoker = createInvoker(
controllers.ProdutoController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:92
private[this] lazy val controllers_ProdutoController_buscaTodos58_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos"))))
private[this] lazy val controllers_ProdutoController_buscaTodos58_invoker = createInvoker(
controllers.ProdutoController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """produtos"""))
        

// @LINE:93
private[this] lazy val controllers_ProdutoController_buscaPorPaginas59_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_buscaPorPaginas59_invoker = createInvoker(
controllers.ProdutoController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """produtosPagina/$pagina<[^/]+>"""))
        

// @LINE:94
private[this] lazy val controllers_ProdutoController_buscaPorId60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_buscaPorId60_invoker = createInvoker(
controllers.ProdutoController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:95
private[this] lazy val controllers_ProdutoController_remover61_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("produtos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ProdutoController_remover61_invoker = createInvoker(
controllers.ProdutoController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """produtos/$id<[^/]+>"""))
        

// @LINE:98
private[this] lazy val controllers_UsuarioController_inserir62_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios"))))
private[this] lazy val controllers_UsuarioController_inserir62_invoker = createInvoker(
controllers.UsuarioController.inserir(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "inserir", Nil,"POST", """ CRUD Usuário""", Routes.prefix + """usuarios"""))
        

// @LINE:99
private[this] lazy val controllers_UsuarioController_atualizar63_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_atualizar63_invoker = createInvoker(
controllers.UsuarioController.atualizar(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "atualizar", Seq(classOf[Integer]),"PUT", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:100
private[this] lazy val controllers_UsuarioController_buscaTodos64_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios"))))
private[this] lazy val controllers_UsuarioController_buscaTodos64_invoker = createInvoker(
controllers.UsuarioController.buscaTodos(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaTodos", Nil,"GET", """""", Routes.prefix + """usuarios"""))
        

// @LINE:101
private[this] lazy val controllers_UsuarioController_buscaPorPaginas65_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuariosPagina/"),DynamicPart("pagina", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_buscaPorPaginas65_invoker = createInvoker(
controllers.UsuarioController.buscaPorPaginas(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorPaginas", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """usuariosPagina/$pagina<[^/]+>"""))
        

// @LINE:102
private[this] lazy val controllers_UsuarioController_buscaPorId66_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_buscaPorId66_invoker = createInvoker(
controllers.UsuarioController.buscaPorId(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorId", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:103
private[this] lazy val controllers_UsuarioController_remover67_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UsuarioController_remover67_invoker = createInvoker(
controllers.UsuarioController.remover(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "remover", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """usuarios/$id<[^/]+>"""))
        

// @LINE:106
private[this] lazy val controllers_Assets_at68_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at68_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Assets.at(path:String = "/public", file:String = "/index.html")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """versaoplay""","""controllers.Application.versaoplay()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises""","""controllers.PaisController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises""","""controllers.PaisController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paisesPagina/$pagina<[^/]+>""","""controllers.PaisController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paises/$id<[^/]+>""","""controllers.PaisController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados""","""controllers.EstadoController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados""","""controllers.EstadoController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estadosPagina/$pagina<[^/]+>""","""controllers.EstadoController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estados/$id<[^/]+>""","""controllers.EstadoController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades""","""controllers.CidadeController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades""","""controllers.CidadeController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidadesPagina/$pagina<[^/]+>""","""controllers.CidadeController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cidades/$id<[^/]+>""","""controllers.CidadeController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros""","""controllers.BairroController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros""","""controllers.BairroController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairrosPagina/$pagina<[^/]+>""","""controllers.BairroController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bairros/$id<[^/]+>""","""controllers.BairroController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes""","""controllers.ClienteController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes""","""controllers.ClienteController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientesPagina/$pagina<[^/]+>""","""controllers.ClienteController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientes/$id<[^/]+>""","""controllers.ClienteController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores""","""controllers.FornecedorController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores""","""controllers.FornecedorController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedoresPagina/$pagina<[^/]+>""","""controllers.FornecedorController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""","""controllers.FornecedorController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias""","""controllers.CategoriaController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias""","""controllers.CategoriaController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categoriasPagina/$pagina<[^/]+>""","""controllers.CategoriaController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categorias/$id<[^/]+>""","""controllers.CategoriaController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes""","""controllers.FabricanteController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes""","""controllers.FabricanteController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantesPagina/$pagina<[^/]+>""","""controllers.FabricanteController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fabricantes/$id<[^/]+>""","""controllers.FabricanteController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas""","""controllers.UnidadeDeMedidaController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas""","""controllers.UnidadeDeMedidaController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidasPagina/$pagina<[^/]+>""","""controllers.UnidadeDeMedidaController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unidadesdemedidas/$id<[^/]+>""","""controllers.UnidadeDeMedidaController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos""","""controllers.ProdutoController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos""","""controllers.ProdutoController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtosPagina/$pagina<[^/]+>""","""controllers.ProdutoController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """produtos/$id<[^/]+>""","""controllers.ProdutoController.remover(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios""","""controllers.UsuarioController.inserir()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.atualizar(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios""","""controllers.UsuarioController.buscaTodos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuariosPagina/$pagina<[^/]+>""","""controllers.UsuarioController.buscaPorPaginas(pagina:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.buscaPorId(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$id<[^/]+>""","""controllers.UsuarioController.remover(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Assets_at0_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("/index.html"))) { (path, file) =>
        controllers_Assets_at0_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:15
case controllers_Application_versaoplay1_route(params) => {
   call { 
        controllers_Application_versaoplay1_invoker.call(controllers.Application.versaoplay())
   }
}
        

// @LINE:18
case controllers_PaisController_inserir2_route(params) => {
   call { 
        controllers_PaisController_inserir2_invoker.call(controllers.PaisController.inserir())
   }
}
        

// @LINE:19
case controllers_PaisController_atualizar3_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PaisController_atualizar3_invoker.call(controllers.PaisController.atualizar(id))
   }
}
        

// @LINE:20
case controllers_PaisController_buscaTodos4_route(params) => {
   call { 
        controllers_PaisController_buscaTodos4_invoker.call(controllers.PaisController.buscaTodos())
   }
}
        

// @LINE:21
case controllers_PaisController_buscaPorPaginas5_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_PaisController_buscaPorPaginas5_invoker.call(controllers.PaisController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:22
case controllers_PaisController_buscaPorId6_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PaisController_buscaPorId6_invoker.call(controllers.PaisController.buscaPorId(id))
   }
}
        

// @LINE:23
case controllers_PaisController_remover7_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PaisController_remover7_invoker.call(controllers.PaisController.remover(id))
   }
}
        

// @LINE:26
case controllers_EstadoController_inserir8_route(params) => {
   call { 
        controllers_EstadoController_inserir8_invoker.call(controllers.EstadoController.inserir())
   }
}
        

// @LINE:27
case controllers_EstadoController_atualizar9_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EstadoController_atualizar9_invoker.call(controllers.EstadoController.atualizar(id))
   }
}
        

// @LINE:28
case controllers_EstadoController_buscaTodos10_route(params) => {
   call { 
        controllers_EstadoController_buscaTodos10_invoker.call(controllers.EstadoController.buscaTodos())
   }
}
        

// @LINE:29
case controllers_EstadoController_buscaPorPaginas11_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_EstadoController_buscaPorPaginas11_invoker.call(controllers.EstadoController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:30
case controllers_EstadoController_buscaPorId12_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EstadoController_buscaPorId12_invoker.call(controllers.EstadoController.buscaPorId(id))
   }
}
        

// @LINE:31
case controllers_EstadoController_remover13_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_EstadoController_remover13_invoker.call(controllers.EstadoController.remover(id))
   }
}
        

// @LINE:34
case controllers_CidadeController_inserir14_route(params) => {
   call { 
        controllers_CidadeController_inserir14_invoker.call(controllers.CidadeController.inserir())
   }
}
        

// @LINE:35
case controllers_CidadeController_atualizar15_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CidadeController_atualizar15_invoker.call(controllers.CidadeController.atualizar(id))
   }
}
        

// @LINE:36
case controllers_CidadeController_buscaTodos16_route(params) => {
   call { 
        controllers_CidadeController_buscaTodos16_invoker.call(controllers.CidadeController.buscaTodos())
   }
}
        

// @LINE:37
case controllers_CidadeController_buscaPorPaginas17_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_CidadeController_buscaPorPaginas17_invoker.call(controllers.CidadeController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:38
case controllers_CidadeController_buscaPorId18_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CidadeController_buscaPorId18_invoker.call(controllers.CidadeController.buscaPorId(id))
   }
}
        

// @LINE:39
case controllers_CidadeController_remover19_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CidadeController_remover19_invoker.call(controllers.CidadeController.remover(id))
   }
}
        

// @LINE:42
case controllers_BairroController_inserir20_route(params) => {
   call { 
        controllers_BairroController_inserir20_invoker.call(controllers.BairroController.inserir())
   }
}
        

// @LINE:43
case controllers_BairroController_atualizar21_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BairroController_atualizar21_invoker.call(controllers.BairroController.atualizar(id))
   }
}
        

// @LINE:44
case controllers_BairroController_buscaTodos22_route(params) => {
   call { 
        controllers_BairroController_buscaTodos22_invoker.call(controllers.BairroController.buscaTodos())
   }
}
        

// @LINE:45
case controllers_BairroController_buscaPorPaginas23_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_BairroController_buscaPorPaginas23_invoker.call(controllers.BairroController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:46
case controllers_BairroController_buscaPorId24_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BairroController_buscaPorId24_invoker.call(controllers.BairroController.buscaPorId(id))
   }
}
        

// @LINE:47
case controllers_BairroController_remover25_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BairroController_remover25_invoker.call(controllers.BairroController.remover(id))
   }
}
        

// @LINE:50
case controllers_ClienteController_inserir26_route(params) => {
   call { 
        controllers_ClienteController_inserir26_invoker.call(controllers.ClienteController.inserir())
   }
}
        

// @LINE:51
case controllers_ClienteController_atualizar27_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClienteController_atualizar27_invoker.call(controllers.ClienteController.atualizar(id))
   }
}
        

// @LINE:52
case controllers_ClienteController_buscaTodos28_route(params) => {
   call { 
        controllers_ClienteController_buscaTodos28_invoker.call(controllers.ClienteController.buscaTodos())
   }
}
        

// @LINE:53
case controllers_ClienteController_buscaPorPaginas29_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_ClienteController_buscaPorPaginas29_invoker.call(controllers.ClienteController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:54
case controllers_ClienteController_buscaPorId30_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClienteController_buscaPorId30_invoker.call(controllers.ClienteController.buscaPorId(id))
   }
}
        

// @LINE:55
case controllers_ClienteController_remover31_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ClienteController_remover31_invoker.call(controllers.ClienteController.remover(id))
   }
}
        

// @LINE:58
case controllers_FornecedorController_inserir32_route(params) => {
   call { 
        controllers_FornecedorController_inserir32_invoker.call(controllers.FornecedorController.inserir())
   }
}
        

// @LINE:59
case controllers_FornecedorController_atualizar33_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FornecedorController_atualizar33_invoker.call(controllers.FornecedorController.atualizar(id))
   }
}
        

// @LINE:60
case controllers_FornecedorController_buscaTodos34_route(params) => {
   call { 
        controllers_FornecedorController_buscaTodos34_invoker.call(controllers.FornecedorController.buscaTodos())
   }
}
        

// @LINE:61
case controllers_FornecedorController_buscaPorPaginas35_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_FornecedorController_buscaPorPaginas35_invoker.call(controllers.FornecedorController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:62
case controllers_FornecedorController_buscaPorId36_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FornecedorController_buscaPorId36_invoker.call(controllers.FornecedorController.buscaPorId(id))
   }
}
        

// @LINE:63
case controllers_FornecedorController_remover37_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FornecedorController_remover37_invoker.call(controllers.FornecedorController.remover(id))
   }
}
        

// @LINE:66
case controllers_CategoriaController_inserir38_route(params) => {
   call { 
        controllers_CategoriaController_inserir38_invoker.call(controllers.CategoriaController.inserir())
   }
}
        

// @LINE:67
case controllers_CategoriaController_atualizar39_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CategoriaController_atualizar39_invoker.call(controllers.CategoriaController.atualizar(id))
   }
}
        

// @LINE:68
case controllers_CategoriaController_buscaTodos40_route(params) => {
   call { 
        controllers_CategoriaController_buscaTodos40_invoker.call(controllers.CategoriaController.buscaTodos())
   }
}
        

// @LINE:69
case controllers_CategoriaController_buscaPorPaginas41_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_CategoriaController_buscaPorPaginas41_invoker.call(controllers.CategoriaController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:70
case controllers_CategoriaController_buscaPorId42_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CategoriaController_buscaPorId42_invoker.call(controllers.CategoriaController.buscaPorId(id))
   }
}
        

// @LINE:71
case controllers_CategoriaController_remover43_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CategoriaController_remover43_invoker.call(controllers.CategoriaController.remover(id))
   }
}
        

// @LINE:74
case controllers_FabricanteController_inserir44_route(params) => {
   call { 
        controllers_FabricanteController_inserir44_invoker.call(controllers.FabricanteController.inserir())
   }
}
        

// @LINE:75
case controllers_FabricanteController_atualizar45_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FabricanteController_atualizar45_invoker.call(controllers.FabricanteController.atualizar(id))
   }
}
        

// @LINE:76
case controllers_FabricanteController_buscaTodos46_route(params) => {
   call { 
        controllers_FabricanteController_buscaTodos46_invoker.call(controllers.FabricanteController.buscaTodos())
   }
}
        

// @LINE:77
case controllers_FabricanteController_buscaPorPaginas47_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_FabricanteController_buscaPorPaginas47_invoker.call(controllers.FabricanteController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:78
case controllers_FabricanteController_buscaPorId48_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FabricanteController_buscaPorId48_invoker.call(controllers.FabricanteController.buscaPorId(id))
   }
}
        

// @LINE:79
case controllers_FabricanteController_remover49_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FabricanteController_remover49_invoker.call(controllers.FabricanteController.remover(id))
   }
}
        

// @LINE:82
case controllers_UnidadeDeMedidaController_inserir50_route(params) => {
   call { 
        controllers_UnidadeDeMedidaController_inserir50_invoker.call(controllers.UnidadeDeMedidaController.inserir())
   }
}
        

// @LINE:83
case controllers_UnidadeDeMedidaController_atualizar51_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_atualizar51_invoker.call(controllers.UnidadeDeMedidaController.atualizar(id))
   }
}
        

// @LINE:84
case controllers_UnidadeDeMedidaController_buscaTodos52_route(params) => {
   call { 
        controllers_UnidadeDeMedidaController_buscaTodos52_invoker.call(controllers.UnidadeDeMedidaController.buscaTodos())
   }
}
        

// @LINE:85
case controllers_UnidadeDeMedidaController_buscaPorPaginas53_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_UnidadeDeMedidaController_buscaPorPaginas53_invoker.call(controllers.UnidadeDeMedidaController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:86
case controllers_UnidadeDeMedidaController_buscaPorId54_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_buscaPorId54_invoker.call(controllers.UnidadeDeMedidaController.buscaPorId(id))
   }
}
        

// @LINE:87
case controllers_UnidadeDeMedidaController_remover55_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UnidadeDeMedidaController_remover55_invoker.call(controllers.UnidadeDeMedidaController.remover(id))
   }
}
        

// @LINE:90
case controllers_ProdutoController_inserir56_route(params) => {
   call { 
        controllers_ProdutoController_inserir56_invoker.call(controllers.ProdutoController.inserir())
   }
}
        

// @LINE:91
case controllers_ProdutoController_atualizar57_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_atualizar57_invoker.call(controllers.ProdutoController.atualizar(id))
   }
}
        

// @LINE:92
case controllers_ProdutoController_buscaTodos58_route(params) => {
   call { 
        controllers_ProdutoController_buscaTodos58_invoker.call(controllers.ProdutoController.buscaTodos())
   }
}
        

// @LINE:93
case controllers_ProdutoController_buscaPorPaginas59_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_ProdutoController_buscaPorPaginas59_invoker.call(controllers.ProdutoController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:94
case controllers_ProdutoController_buscaPorId60_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_buscaPorId60_invoker.call(controllers.ProdutoController.buscaPorId(id))
   }
}
        

// @LINE:95
case controllers_ProdutoController_remover61_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProdutoController_remover61_invoker.call(controllers.ProdutoController.remover(id))
   }
}
        

// @LINE:98
case controllers_UsuarioController_inserir62_route(params) => {
   call { 
        controllers_UsuarioController_inserir62_invoker.call(controllers.UsuarioController.inserir())
   }
}
        

// @LINE:99
case controllers_UsuarioController_atualizar63_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_atualizar63_invoker.call(controllers.UsuarioController.atualizar(id))
   }
}
        

// @LINE:100
case controllers_UsuarioController_buscaTodos64_route(params) => {
   call { 
        controllers_UsuarioController_buscaTodos64_invoker.call(controllers.UsuarioController.buscaTodos())
   }
}
        

// @LINE:101
case controllers_UsuarioController_buscaPorPaginas65_route(params) => {
   call(params.fromPath[Integer]("pagina", None)) { (pagina) =>
        controllers_UsuarioController_buscaPorPaginas65_invoker.call(controllers.UsuarioController.buscaPorPaginas(pagina))
   }
}
        

// @LINE:102
case controllers_UsuarioController_buscaPorId66_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_buscaPorId66_invoker.call(controllers.UsuarioController.buscaPorId(id))
   }
}
        

// @LINE:103
case controllers_UsuarioController_remover67_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UsuarioController_remover67_invoker.call(controllers.UsuarioController.remover(id))
   }
}
        

// @LINE:106
case controllers_Assets_at68_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at68_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     