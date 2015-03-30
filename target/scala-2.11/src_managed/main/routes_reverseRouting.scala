// @SOURCE:C:/projetos/sgmplay/conf/routes
// @HASH:9327973e42e03e5d8beac6f03b24d3fac8d931f4
// @DATE:Mon Mar 30 16:21:51 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:6
package controllers {

// @LINE:106
// @LINE:6
class ReverseAssets {


// @LINE:106
// @LINE:6
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:6
case (file) if file == "/index.html" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "/index.html")))
  Call("GET", _prefix)
                                         
// @LINE:106
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
class ReverseProdutoController {


// @LINE:92
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtos")
}
                        

// @LINE:95
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:90
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "produtos")
}
                        

// @LINE:93
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:94
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:91
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "produtos/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
class ReverseCategoriaController {


// @LINE:68
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categorias")
}
                        

// @LINE:71
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:66
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "categorias")
}
                        

// @LINE:69
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categoriasPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:70
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:67
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "categorias/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
class ReverseFabricanteController {


// @LINE:76
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantes")
}
                        

// @LINE:79
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:74
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "fabricantes")
}
                        

// @LINE:77
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:78
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:75
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "fabricantes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseFornecedorController {


// @LINE:60
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedores")
}
                        

// @LINE:63
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:58
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "fornecedores")
}
                        

// @LINE:61
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedoresPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:62
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:59
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseBairroController {


// @LINE:44
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairros")
}
                        

// @LINE:47
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:42
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "bairros")
}
                        

// @LINE:45
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairrosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:46
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:43
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "bairros/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReversePaisController {


// @LINE:20
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paises")
}
                        

// @LINE:23
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:18
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "paises")
}
                        

// @LINE:21
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paisesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:22
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:19
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "paises/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:15
class ReverseApplication {


// @LINE:15
def versaoplay(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "versaoplay")
}
                        

}
                          

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseEstadoController {


// @LINE:28
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estados")
}
                        

// @LINE:31
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:26
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "estados")
}
                        

// @LINE:29
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estadosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:30
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:27
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "estados/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseClienteController {


// @LINE:52
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientes")
}
                        

// @LINE:55
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:50
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "clientes")
}
                        

// @LINE:53
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:54
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:51
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "clientes/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseUnidadeDeMedidaController {


// @LINE:84
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidas")
}
                        

// @LINE:87
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:82
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "unidadesdemedidas")
}
                        

// @LINE:85
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidasPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:86
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:83
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "unidadesdemedidas/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
class ReverseUsuarioController {


// @LINE:100
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios")
}
                        

// @LINE:103
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:98
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuarios")
}
                        

// @LINE:101
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuariosPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:102
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:99
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
class ReverseCidadeController {


// @LINE:36
def buscaTodos(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidades")
}
                        

// @LINE:39
def remover(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:34
def inserir(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "cidades")
}
                        

// @LINE:37
def buscaPorPaginas(pagina:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidadesPagina/" + implicitly[PathBindable[Integer]].unbind("pagina", pagina))
}
                        

// @LINE:38
def buscaPorId(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:35
def atualizar(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "cidades/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:106
// @LINE:6
class ReverseAssets {


// @LINE:106
// @LINE:6
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (file == """ + implicitly[JavascriptLitteral[String]].to("/index.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
class ReverseProdutoController {


// @LINE:92
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos"})
      }
   """
)
                        

// @LINE:95
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:90
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos"})
      }
   """
)
                        

// @LINE:93
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:94
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:91
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProdutoController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
class ReverseCategoriaController {


// @LINE:68
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:66
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
      }
   """
)
                        

// @LINE:69
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoriasPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:70
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:67
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoriaController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
class ReverseFabricanteController {


// @LINE:76
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:74
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes"})
      }
   """
)
                        

// @LINE:77
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:78
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:75
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FabricanteController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "fabricantes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseFornecedorController {


// @LINE:60
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:58
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
      }
   """
)
                        

// @LINE:61
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedoresPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:62
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:59
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FornecedorController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseBairroController {


// @LINE:44
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:42
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros"})
      }
   """
)
                        

// @LINE:45
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairrosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:46
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:43
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BairroController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "bairros/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReversePaisController {


// @LINE:20
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:18
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paises"})
      }
   """
)
                        

// @LINE:21
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paisesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:22
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:19
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaisController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paises/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:15
class ReverseApplication {


// @LINE:15
def versaoplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.versaoplay",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "versaoplay"})
      }
   """
)
                        

}
              

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseEstadoController {


// @LINE:28
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:26
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estados"})
      }
   """
)
                        

// @LINE:29
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estadosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:30
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstadoController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "estados/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseClienteController {


// @LINE:52
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:50
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
      }
   """
)
                        

// @LINE:53
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:54
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:51
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClienteController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseUnidadeDeMedidaController {


// @LINE:84
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:82
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas"})
      }
   """
)
                        

// @LINE:85
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidasPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:86
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:83
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UnidadeDeMedidaController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "unidadesdemedidas/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
class ReverseUsuarioController {


// @LINE:100
def buscaTodos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaTodos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
      }
   """
)
                        

// @LINE:103
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.remover",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:98
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
      }
   """
)
                        

// @LINE:101
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuariosPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:102
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:99
def atualizar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsuarioController.atualizar",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
class ReverseCidadeController {


// @LINE:36
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
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def inserir : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.inserir",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades"})
      }
   """
)
                        

// @LINE:37
def buscaPorPaginas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.buscaPorPaginas",
   """
      function(pagina) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidadesPagina/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pagina", pagina)})
      }
   """
)
                        

// @LINE:38
def buscaPorId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CidadeController.buscaPorId",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cidades/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:35
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
        


// @LINE:106
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:6
package controllers.ref {


// @LINE:106
// @LINE:6
class ReverseAssets {


// @LINE:6
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
class ReverseProdutoController {


// @LINE:92
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaTodos", Seq(), "GET", """""", _prefix + """produtos""")
)
                      

// @LINE:95
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

// @LINE:90
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "inserir", Seq(), "POST", """ CRUD Produto""", _prefix + """produtos""")
)
                      

// @LINE:93
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """produtosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:94
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

// @LINE:91
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProdutoController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProdutoController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """produtos/$id<[^/]+>""")
)
                      

}
                          

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
class ReverseCategoriaController {


// @LINE:68
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaTodos", Seq(), "GET", """""", _prefix + """categorias""")
)
                      

// @LINE:71
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

// @LINE:66
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "inserir", Seq(), "POST", """ CRUD Categoria""", _prefix + """categorias""")
)
                      

// @LINE:69
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """categoriasPagina/$pagina<[^/]+>""")
)
                      

// @LINE:70
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

// @LINE:67
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoriaController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CategoriaController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """categorias/$id<[^/]+>""")
)
                      

}
                          

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
class ReverseFabricanteController {


// @LINE:76
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaTodos", Seq(), "GET", """""", _prefix + """fabricantes""")
)
                      

// @LINE:79
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

// @LINE:74
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "inserir", Seq(), "POST", """ CRUD Fabricante""", _prefix + """fabricantes""")
)
                      

// @LINE:77
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """fabricantesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:78
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

// @LINE:75
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FabricanteController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FabricanteController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """fabricantes/$id<[^/]+>""")
)
                      

}
                          

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseFornecedorController {


// @LINE:60
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaTodos", Seq(), "GET", """""", _prefix + """fornecedores""")
)
                      

// @LINE:63
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

// @LINE:58
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "inserir", Seq(), "POST", """ CRUD Fornecedor""", _prefix + """fornecedores""")
)
                      

// @LINE:61
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """fornecedoresPagina/$pagina<[^/]+>""")
)
                      

// @LINE:62
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

// @LINE:59
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FornecedorController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.FornecedorController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """fornecedores/$id<[^/]+>""")
)
                      

}
                          

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseBairroController {


// @LINE:44
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaTodos", Seq(), "GET", """""", _prefix + """bairros""")
)
                      

// @LINE:47
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

// @LINE:42
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "inserir", Seq(), "POST", """ CRUD Bairro""", _prefix + """bairros""")
)
                      

// @LINE:45
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """bairrosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:46
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

// @LINE:43
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BairroController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BairroController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """bairros/$id<[^/]+>""")
)
                      

}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReversePaisController {


// @LINE:20
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaTodos", Seq(), "GET", """""", _prefix + """paises""")
)
                      

// @LINE:23
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

// @LINE:18
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "inserir", Seq(), "POST", """ CRUD País""", _prefix + """paises""")
)
                      

// @LINE:21
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """paisesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:22
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

// @LINE:19
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaisController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.PaisController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """paises/$id<[^/]+>""")
)
                      

}
                          

// @LINE:15
class ReverseApplication {


// @LINE:15
def versaoplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.versaoplay(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "versaoplay", Seq(), "GET", """ Applications""", _prefix + """versaoplay""")
)
                      

}
                          

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseEstadoController {


// @LINE:28
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaTodos", Seq(), "GET", """""", _prefix + """estados""")
)
                      

// @LINE:31
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

// @LINE:26
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "inserir", Seq(), "POST", """ CRUD Estado""", _prefix + """estados""")
)
                      

// @LINE:29
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """estadosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:30
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

// @LINE:27
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstadoController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.EstadoController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """estados/$id<[^/]+>""")
)
                      

}
                          

// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseClienteController {


// @LINE:52
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaTodos", Seq(), "GET", """""", _prefix + """clientes""")
)
                      

// @LINE:55
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

// @LINE:50
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "inserir", Seq(), "POST", """ CRUD Cliente""", _prefix + """clientes""")
)
                      

// @LINE:53
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """clientesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:54
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

// @LINE:51
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClienteController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClienteController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """clientes/$id<[^/]+>""")
)
                      

}
                          

// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseUnidadeDeMedidaController {


// @LINE:84
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaTodos", Seq(), "GET", """""", _prefix + """unidadesdemedidas""")
)
                      

// @LINE:87
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

// @LINE:82
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "inserir", Seq(), "POST", """ CRUD Unidade de Medida""", _prefix + """unidadesdemedidas""")
)
                      

// @LINE:85
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """unidadesdemedidasPagina/$pagina<[^/]+>""")
)
                      

// @LINE:86
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

// @LINE:83
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UnidadeDeMedidaController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UnidadeDeMedidaController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """unidadesdemedidas/$id<[^/]+>""")
)
                      

}
                          

// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
class ReverseUsuarioController {


// @LINE:100
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaTodos", Seq(), "GET", """""", _prefix + """usuarios""")
)
                      

// @LINE:103
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

// @LINE:98
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "inserir", Seq(), "POST", """ CRUD Usuário""", _prefix + """usuarios""")
)
                      

// @LINE:101
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """usuariosPagina/$pagina<[^/]+>""")
)
                      

// @LINE:102
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

// @LINE:99
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsuarioController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsuarioController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """usuarios/$id<[^/]+>""")
)
                      

}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
class ReverseCidadeController {


// @LINE:36
def buscaTodos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaTodos(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaTodos", Seq(), "GET", """""", _prefix + """cidades""")
)
                      

// @LINE:39
def remover(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.remover(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "remover", Seq(classOf[Integer]), "DELETE", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

// @LINE:34
def inserir(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.inserir(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "inserir", Seq(), "POST", """ CRUD Cidade""", _prefix + """cidades""")
)
                      

// @LINE:37
def buscaPorPaginas(pagina:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaPorPaginas(pagina), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorPaginas", Seq(classOf[Integer]), "GET", """""", _prefix + """cidadesPagina/$pagina<[^/]+>""")
)
                      

// @LINE:38
def buscaPorId(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.buscaPorId(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "buscaPorId", Seq(classOf[Integer]), "GET", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

// @LINE:35
def atualizar(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CidadeController.atualizar(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CidadeController", "atualizar", Seq(classOf[Integer]), "PUT", """""", _prefix + """cidades/$id<[^/]+>""")
)
                      

}
                          
}
        
    