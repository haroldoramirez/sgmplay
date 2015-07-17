// @SOURCE:/home/haroldo/projetos/academico/sgmplay/conf/routes
// @HASH:dd6de9c0c2118681a07c9f20d27e2b75e5973a60
// @DATE:Fri Jul 17 16:27:21 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:107
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:107
class ReverseAssets {


// @LINE:107
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
class ReverseProdutoController {


// @LINE:93
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtos")
}
                        

// @LINE:96
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:91
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "produtos")
}
                        

// @LINE:94
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:95
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:92
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseCategoriaController {


// @LINE:72
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categorias/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:68
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:69
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categorias")
}
                        

// @LINE:71
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:67
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "categorias")
}
                        

// @LINE:70
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
class ReverseFabricanteController {


// @LINE:80
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantes/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:76
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:77
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantes")
}
                        

// @LINE:79
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:75
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "fabricantes")
}
                        

// @LINE:78
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseFornecedorController {


// @LINE:64
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedores/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:60
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:61
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedores")
}
                        

// @LINE:63
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:59
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "fornecedores")
}
                        

// @LINE:62
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseBairroController {


// @LINE:48
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairros/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:44
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:45
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairros")
}
                        

// @LINE:47
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:43
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "bairros")
}
                        

// @LINE:46
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReversePaisController {


// @LINE:24
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paises/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:20
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:21
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paises")
}
                        

// @LINE:23
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:19
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "paises")
}
                        

// @LINE:22
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseLoginController {


// @LINE:11
def telaLogout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "saiu")
}
                        

// @LINE:10
def telaAutenticado(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "autenticado")
}
                        

// @LINE:13
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:9
def loginTela(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:12
def autenticar(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "autenticar")
}
                        

}
                          

// @LINE:16
// @LINE:6
class ReverseApplication {


// @LINE:16
def versaoplay(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "versaoplay")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseEstadoController {


// @LINE:32
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estados/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:28
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:29
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estados")
}
                        

// @LINE:31
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:27
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "estados")
}
                        

// @LINE:30
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseClienteController {


// @LINE:56
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientes/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:52
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:53
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientes")
}
                        

// @LINE:55
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:51
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "clientes")
}
                        

// @LINE:54
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
class ReverseUnidadeDeMedidaController {


// @LINE:88
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidas/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:84
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:85
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidas")
}
                        

// @LINE:87
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:83
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "unidadesdemedidas")
}
                        

// @LINE:86
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
class ReverseUsuarioController {


// @LINE:101
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios")
}
                        

// @LINE:104
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:99
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuarios")
}
                        

// @LINE:102
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuariosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:103
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:100
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseCidadeController {


// @LINE:40
def filtraPorNome(filtro:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidades/nome/" + implicitly[PathBindable[String]].unbind("filtro", dynamicString(filtro)))
}
                        

// @LINE:36
def atualizar(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:37
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidades")
}
                        

// @LINE:39
def remover(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:35
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cidades")
}
                        

// @LINE:38
def buscaPorId(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:107
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:107
class ReverseAssets {


// @LINE:107
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
class ReverseProdutoController {


// @LINE:93
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos"})
      }
   """
)
                        

// @LINE:96
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:91
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos"})
      }
   """
)
                        

// @LINE:94
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:95
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:92
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseCategoriaController {


// @LINE:72
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:68
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:69
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
      }
   """
)
                        

// @LINE:71
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:67
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
      }
   """
)
                        

// @LINE:70
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
class ReverseFabricanteController {


// @LINE:80
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:76
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:77
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes"})
      }
   """
)
                        

// @LINE:79
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:75
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes"})
      }
   """
)
                        

// @LINE:78
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseFornecedorController {


// @LINE:64
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:60
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:61
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
      }
   """
)
                        

// @LINE:63
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:59
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
      }
   """
)
                        

// @LINE:62
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseBairroController {


// @LINE:48
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:44
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:45
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros"})
      }
   """
)
                        

// @LINE:47
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:43
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros"})
      }
   """
)
                        

// @LINE:46
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReversePaisController {


// @LINE:24
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:20
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paises"})
      }
   """
)
                        

// @LINE:23
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:19
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paises"})
      }
   """
)
                        

// @LINE:22
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseLoginController {


// @LINE:11
def telaLogout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LoginController.telaLogout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saiu"})
      }
   """
)
                        

// @LINE:10
def telaAutenticado : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LoginController.telaAutenticado",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autenticado"})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LoginController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:9
def loginTela : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LoginController.loginTela",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:12
def autenticar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LoginController.autenticar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "autenticar"})
      }
   """
)
                        

}
              

// @LINE:16
// @LINE:6
class ReverseApplication {


// @LINE:16
def versaoplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.versaoplay",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "versaoplay"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseEstadoController {


// @LINE:32
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:28
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estados"})
      }
   """
)
                        

// @LINE:31
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estados"})
      }
   """
)
                        

// @LINE:30
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseClienteController {


// @LINE:56
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:52
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:53
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
      }
   """
)
                        

// @LINE:55
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:51
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
      }
   """
)
                        

// @LINE:54
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
class ReverseUnidadeDeMedidaController {


// @LINE:88
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:84
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:85
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas"})
      }
   """
)
                        

// @LINE:87
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:83
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas"})
      }
   """
)
                        

// @LINE:86
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
class ReverseUsuarioController {


// @LINE:101
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
      }
   """
)
                        

// @LINE:104
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:99
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
      }
   """
)
                        

// @LINE:102
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuariosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:103
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:100
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseCidadeController {


// @LINE:40
def filtraPorNome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.filtraPorNome",
   """
      function(filtro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/nome/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filtro", encodeURIComponent(filtro))})
      }
   """
)
                        

// @LINE:36
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:37
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades"})
      }
   """
)
                        

// @LINE:39
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:35
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades"})
      }
   """
)
                        

// @LINE:38
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:107
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:107
class ReverseAssets {


// @LINE:107
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
class ReverseProdutoController {


// @LINE:93
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaTodos", Seq(), "GET", """""", _prefix + """produtos""")
)
                      

// @LINE:96
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

// @LINE:91
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "inserir", Seq(), "POST", """ CRUD Produto""", _prefix + """produtos""")
)
                      

// @LINE:94
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """produtosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:95
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

// @LINE:92
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

}
                          

// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseCategoriaController {


// @LINE:72
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """categorias/nome/$filtro<[^/]+>""")
)
                      

// @LINE:68
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

// @LINE:69
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaTodos", Seq(), "GET", """""", _prefix + """categorias""")
)
                      

// @LINE:71
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

// @LINE:67
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "inserir", Seq(), "POST", """ CRUD Categoria""", _prefix + """categorias""")
)
                      

// @LINE:70
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

}
                          

// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
class ReverseFabricanteController {


// @LINE:80
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """fabricantes/nome/$filtro<[^/]+>""")
)
                      

// @LINE:76
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

// @LINE:77
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaTodos", Seq(), "GET", """""", _prefix + """fabricantes""")
)
                      

// @LINE:79
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

// @LINE:75
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "inserir", Seq(), "POST", """ CRUD Fabricante""", _prefix + """fabricantes""")
)
                      

// @LINE:78
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

}
                          

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseFornecedorController {


// @LINE:64
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """fornecedores/nome/$filtro<[^/]+>""")
)
                      

// @LINE:60
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

// @LINE:61
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaTodos", Seq(), "GET", """""", _prefix + """fornecedores""")
)
                      

// @LINE:63
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

// @LINE:59
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "inserir", Seq(), "POST", """ CRUD Fornecedor""", _prefix + """fornecedores""")
)
                      

// @LINE:62
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

}
                          

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseBairroController {


// @LINE:48
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """bairros/nome/$filtro<[^/]+>""")
)
                      

// @LINE:44
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

// @LINE:45
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaTodos", Seq(), "GET", """""", _prefix + """bairros""")
)
                      

// @LINE:47
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

// @LINE:43
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "inserir", Seq(), "POST", """ CRUD Bairro""", _prefix + """bairros""")
)
                      

// @LINE:46
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReversePaisController {


// @LINE:24
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """paises/nome/$filtro<[^/]+>""")
)
                      

// @LINE:20
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

// @LINE:21
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaTodos", Seq(), "GET", """""", _prefix + """paises""")
)
                      

// @LINE:23
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

// @LINE:19
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "inserir", Seq(), "POST", """ CRUD País""", _prefix + """paises""")
)
                      

// @LINE:22
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseLoginController {


// @LINE:11
def telaLogout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LoginController.telaLogout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "telaLogout", Seq(), "GET", """""", _prefix + """saiu""")
)
                      

// @LINE:10
def telaAutenticado(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LoginController.telaAutenticado(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "telaAutenticado", Seq(), "GET", """""", _prefix + """autenticado""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LoginController.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:9
def loginTela(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LoginController.loginTela(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "loginTela", Seq(), "GET", """ Login""", _prefix + """login""")
)
                      

// @LINE:12
def autenticar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LoginController.autenticar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "autenticar", Seq(), "POST", """""", _prefix + """autenticar""")
)
                      

}
                          

// @LINE:16
// @LINE:6
class ReverseApplication {


// @LINE:16
def versaoplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.versaoplay(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "versaoplay", Seq(), "GET", """ Applications""", _prefix + """versaoplay""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseEstadoController {


// @LINE:32
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """estados/nome/$filtro<[^/]+>""")
)
                      

// @LINE:28
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

// @LINE:29
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaTodos", Seq(), "GET", """""", _prefix + """estados""")
)
                      

// @LINE:31
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

// @LINE:27
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "inserir", Seq(), "POST", """ CRUD Estado""", _prefix + """estados""")
)
                      

// @LINE:30
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

}
                          

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseClienteController {


// @LINE:56
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """clientes/nome/$filtro<[^/]+>""")
)
                      

// @LINE:52
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

// @LINE:53
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaTodos", Seq(), "GET", """""", _prefix + """clientes""")
)
                      

// @LINE:55
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

// @LINE:51
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "inserir", Seq(), "POST", """ CRUD Cliente""", _prefix + """clientes""")
)
                      

// @LINE:54
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

}
                          

// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
class ReverseUnidadeDeMedidaController {


// @LINE:88
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """unidadesdemedidas/nome/$filtro<[^/]+>""")
)
                      

// @LINE:84
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

// @LINE:85
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaTodos", Seq(), "GET", """""", _prefix + """unidadesdemedidas""")
)
                      

// @LINE:87
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

// @LINE:83
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "inserir", Seq(), "POST", """ CRUD Unidade de Medida""", _prefix + """unidadesdemedidas""")
)
                      

// @LINE:86
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

}
                          

// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
class ReverseUsuarioController {


// @LINE:101
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaTodos", Seq(), "GET", """""", _prefix + """usuarios""")
)
                      

// @LINE:104
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

// @LINE:99
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "inserir", Seq(), "POST", """ CRUD Usuário""", _prefix + """usuarios""")
)
                      

// @LINE:102
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """usuariosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:103
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

// @LINE:100
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

}
                          

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseCidadeController {


// @LINE:40
def filtraPorNome(filtro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.filtraPorNome(filtro), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "filtraPorNome", Seq(classOf[String]), "GET", """""", _prefix + """cidades/nome/$filtro<[^/]+>""")
)
                      

// @LINE:36
def atualizar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "atualizar", Seq(classOf[Long]), "PUT", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

// @LINE:37
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaTodos", Seq(), "GET", """""", _prefix + """cidades""")
)
                      

// @LINE:39
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "remover", Seq(classOf[Long]), "DELETE", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

// @LINE:35
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "inserir", Seq(), "POST", """ CRUD Cidade""", _prefix + """cidades""")
)
                      

// @LINE:38
def buscaPorId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorId", Seq(classOf[Long]), "GET", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

}
                          
}
        
    