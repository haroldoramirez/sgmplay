// @SOURCE:/home/haroldo/projetos/academico/sgmplay/conf/routes
// @HASH:f0eb39d740aa95e8d1715febf62d73666d5f9606
// @DATE:Wed Jul 15 15:51:00 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:113
class ReverseAssets {


// @LINE:113
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
class ReverseProdutoController {


// @LINE:99
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtos")
}
                        

// @LINE:102
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:97
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "produtos")
}
                        

// @LINE:100
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:101
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:98
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
class ReverseCategoriaController {


// @LINE:75
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categorias")
}
                        

// @LINE:78
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:73
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "categorias")
}
                        

// @LINE:76
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categoriasPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:77
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:74
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
class ReverseFabricanteController {


// @LINE:83
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantes")
}
                        

// @LINE:86
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:81
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "fabricantes")
}
                        

// @LINE:84
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:85
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:82
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
class ReverseFornecedorController {


// @LINE:67
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedores")
}
                        

// @LINE:70
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:65
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "fornecedores")
}
                        

// @LINE:68
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedoresPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:69
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:66
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseBairroController {


// @LINE:51
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairros")
}
                        

// @LINE:54
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:49
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "bairros")
}
                        

// @LINE:52
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairrosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:53
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:50
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReversePaisController {


// @LINE:27
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paises")
}
                        

// @LINE:30
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:25
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "paises")
}
                        

// @LINE:28
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paisesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:29
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:26
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Integer]].unbind("id", id))
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
                          

// @LINE:22
// @LINE:6
class ReverseApplication {


// @LINE:22
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
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseEstadoController {


// @LINE:35
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estados")
}
                        

// @LINE:38
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:33
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "estados")
}
                        

// @LINE:36
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estadosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:37
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:34
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
class ReverseClienteController {


// @LINE:59
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientes")
}
                        

// @LINE:62
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:57
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "clientes")
}
                        

// @LINE:60
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:61
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:58
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseUnidadeDeMedidaController {


// @LINE:91
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidas")
}
                        

// @LINE:94
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:89
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "unidadesdemedidas")
}
                        

// @LINE:92
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidasPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:93
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:90
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
class ReverseUsuarioController {


// @LINE:107
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios")
}
                        

// @LINE:110
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:105
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuarios")
}
                        

// @LINE:108
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuariosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:109
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:106
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
class ReverseCidadeController {


// @LINE:43
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidades")
}
                        

// @LINE:46
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:41
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cidades")
}
                        

// @LINE:44
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidadesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:45
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:42
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:113
class ReverseAssets {


// @LINE:113
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
class ReverseProdutoController {


// @LINE:99
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos"})
      }
   """
)
                        

// @LINE:102
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:97
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos"})
      }
   """
)
                        

// @LINE:100
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:101
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:98
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
class ReverseCategoriaController {


// @LINE:75
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
      }
   """
)
                        

// @LINE:78
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:73
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
      }
   """
)
                        

// @LINE:76
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoriasPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:77
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:74
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
class ReverseFabricanteController {


// @LINE:83
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes"})
      }
   """
)
                        

// @LINE:86
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:81
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes"})
      }
   """
)
                        

// @LINE:84
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:85
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:82
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
class ReverseFornecedorController {


// @LINE:67
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
      }
   """
)
                        

// @LINE:70
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:65
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
      }
   """
)
                        

// @LINE:68
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedoresPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:69
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:66
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseBairroController {


// @LINE:51
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros"})
      }
   """
)
                        

// @LINE:54
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:49
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros"})
      }
   """
)
                        

// @LINE:52
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairrosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:53
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:50
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReversePaisController {


// @LINE:27
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paises"})
      }
   """
)
                        

// @LINE:30
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paises"})
      }
   """
)
                        

// @LINE:28
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paisesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:29
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:26
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
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
              

// @LINE:22
// @LINE:6
class ReverseApplication {


// @LINE:22
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
              

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseEstadoController {


// @LINE:35
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estados"})
      }
   """
)
                        

// @LINE:38
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:33
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estados"})
      }
   """
)
                        

// @LINE:36
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estadosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:37
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
class ReverseClienteController {


// @LINE:59
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
      }
   """
)
                        

// @LINE:62
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:57
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
      }
   """
)
                        

// @LINE:60
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:61
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:58
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseUnidadeDeMedidaController {


// @LINE:91
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas"})
      }
   """
)
                        

// @LINE:94
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:89
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas"})
      }
   """
)
                        

// @LINE:92
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidasPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:93
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:90
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
class ReverseUsuarioController {


// @LINE:107
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
      }
   """
)
                        

// @LINE:110
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:105
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
      }
   """
)
                        

// @LINE:108
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuariosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:109
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:106
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
class ReverseCidadeController {


// @LINE:43
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades"})
      }
   """
)
                        

// @LINE:46
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:41
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades"})
      }
   """
)
                        

// @LINE:44
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidadesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:45
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:42
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:113
class ReverseAssets {


// @LINE:113
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
class ReverseProdutoController {


// @LINE:99
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaTodos", Seq(), "GET", """""", _prefix + """produtos""")
)
                      

// @LINE:102
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

// @LINE:97
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "inserir", Seq(), "POST", """ CRUD Produto""", _prefix + """produtos""")
)
                      

// @LINE:100
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """produtosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:101
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

// @LINE:98
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

}
                          

// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
class ReverseCategoriaController {


// @LINE:75
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaTodos", Seq(), "GET", """""", _prefix + """categorias""")
)
                      

// @LINE:78
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

// @LINE:73
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "inserir", Seq(), "POST", """ CRUD Categoria""", _prefix + """categorias""")
)
                      

// @LINE:76
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """categoriasPagina/$pagina<[^/]+>""")
)
                      

// @LINE:77
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

// @LINE:74
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
class ReverseFabricanteController {


// @LINE:83
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaTodos", Seq(), "GET", """""", _prefix + """fabricantes""")
)
                      

// @LINE:86
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

// @LINE:81
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "inserir", Seq(), "POST", """ CRUD Fabricante""", _prefix + """fabricantes""")
)
                      

// @LINE:84
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """fabricantesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:85
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

// @LINE:82
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

}
                          

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
class ReverseFornecedorController {


// @LINE:67
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaTodos", Seq(), "GET", """""", _prefix + """fornecedores""")
)
                      

// @LINE:70
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

// @LINE:65
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "inserir", Seq(), "POST", """ CRUD Fornecedor""", _prefix + """fornecedores""")
)
                      

// @LINE:68
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """fornecedoresPagina/$pagina<[^/]+>""")
)
                      

// @LINE:69
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

// @LINE:66
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

}
                          

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseBairroController {


// @LINE:51
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaTodos", Seq(), "GET", """""", _prefix + """bairros""")
)
                      

// @LINE:54
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

// @LINE:49
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "inserir", Seq(), "POST", """ CRUD Bairro""", _prefix + """bairros""")
)
                      

// @LINE:52
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """bairrosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:53
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

// @LINE:50
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

}
                          

// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReversePaisController {


// @LINE:27
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaTodos", Seq(), "GET", """""", _prefix + """paises""")
)
                      

// @LINE:30
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

// @LINE:25
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "inserir", Seq(), "POST", """ CRUD País""", _prefix + """paises""")
)
                      

// @LINE:28
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """paisesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:29
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

// @LINE:26
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """paises/$id<[^/]+>""")
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
                          

// @LINE:22
// @LINE:6
class ReverseApplication {


// @LINE:22
def versaoplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.versaoplay(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "versaoplay", Seq(), "GET", """ Applications""", _prefix + """versaoplay""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseEstadoController {


// @LINE:35
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaTodos", Seq(), "GET", """""", _prefix + """estados""")
)
                      

// @LINE:38
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

// @LINE:33
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "inserir", Seq(), "POST", """ CRUD Estado""", _prefix + """estados""")
)
                      

// @LINE:36
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """estadosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:37
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

// @LINE:34
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

}
                          

// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
class ReverseClienteController {


// @LINE:59
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaTodos", Seq(), "GET", """""", _prefix + """clientes""")
)
                      

// @LINE:62
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

// @LINE:57
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "inserir", Seq(), "POST", """ CRUD Cliente""", _prefix + """clientes""")
)
                      

// @LINE:60
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """clientesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:61
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

// @LINE:58
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

}
                          

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseUnidadeDeMedidaController {


// @LINE:91
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaTodos", Seq(), "GET", """""", _prefix + """unidadesdemedidas""")
)
                      

// @LINE:94
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

// @LINE:89
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "inserir", Seq(), "POST", """ CRUD Unidade de Medida""", _prefix + """unidadesdemedidas""")
)
                      

// @LINE:92
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """unidadesdemedidasPagina/$pagina<[^/]+>""")
)
                      

// @LINE:93
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

// @LINE:90
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

}
                          

// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
class ReverseUsuarioController {


// @LINE:107
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaTodos", Seq(), "GET", """""", _prefix + """usuarios""")
)
                      

// @LINE:110
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

// @LINE:105
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "inserir", Seq(), "POST", """ CRUD Usuário""", _prefix + """usuarios""")
)
                      

// @LINE:108
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """usuariosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:109
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

// @LINE:106
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
class ReverseCidadeController {


// @LINE:43
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaTodos", Seq(), "GET", """""", _prefix + """cidades""")
)
                      

// @LINE:46
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

// @LINE:41
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "inserir", Seq(), "POST", """ CRUD Cidade""", _prefix + """cidades""")
)
                      

// @LINE:44
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """cidadesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:45
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

// @LINE:42
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

}
                          
}
        
    