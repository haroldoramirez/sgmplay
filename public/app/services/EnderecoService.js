angular.module('mercado')
  .service('Pais',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/paises/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/paises', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/paisesPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/paises/:id', isArray: false},
         getFiltroPais: {method: 'GET', url: BaseUrl + '/paises/nome/:filtro', isArray: true}
      });
  }]).service('Estado',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/estados/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/estados', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/estadosPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/estados/:id', isArray: false},
         getFiltroEstado: {method: 'GET', url: BaseUrl + '/estados/nome/:filtro', isArray: true}
      });
  }]).service('Cidade',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/cidades/:id', {}, {
        getAll: {method: 'GET', url: BaseUrl + '/cidades', isArray: true},
        getPagina: {method: 'GET', url: BaseUrl + '/cidadesPagina/:pagina', isArray: true},
        update: {method: 'PUT', url: BaseUrl + '/cidades/:id', isArray: false},
        getFiltroCidade: {method: 'GET', url: BaseUrl + '/cidades/nome/:filtro', isArray: true}
      });
  }]).service('Bairro',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/bairros/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/bairros', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/bairrosPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/bairros/:id', isArray: false},
         getFiltroBairro: {method: 'GET', url: BaseUrl + '/bairros/nome/:filtro', isArray: true}
      });
  }]).service('Cliente',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/clientes/:id', {}, {
        getAll: {method: 'GET', url: BaseUrl + '/clientes', isArray: true},
        getPagina: {method: 'GET', url: BaseUrl + '/clientesPagina/:pagina', isArray: true},
        update: {method: 'PUT', url: BaseUrl + '/clientes/:id', isArray: false},
        getFiltroCliente: {method: 'GET', url: BaseUrl + '/clientes/nome/:filtro', isArray: true}
      });
  }]).service('Fornecedor',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/fornecedores/:id', {}, {
        getAll: {method: 'GET', url: BaseUrl + '/fornecedores', isArray: true},
        getPagina: {method: 'GET', url: BaseUrl + '/fornecedoresPagina/:pagina', isArray: true},
        update: {method: 'PUT', url: BaseUrl + '/fornecedores/:id', isArray: false}
      });
  }]).service('Categoria',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/categorias/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/categorias', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/categoriasPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/categorias/:id', isArray: false}
      });
   }]).service('Fabricante',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/fabricantes/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/fabricantes', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/fabricantesPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/fabricantes/:id', isArray: false}
      });
    }]).service('UnidadeDeMedida',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/unidadesdemedidas/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/unidadesdemedidas', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/unidadesdemedidasPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/unidadesdemedidas/:id', isArray: false}
      });
    }]).service('Produto',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/produtos/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/produtos', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/produtosPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/produtos/:id', isArray: false}
      });
    }]).service('Usuario',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/usuarios/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/usuarios', isArray: true},
         getPagina: {method: 'GET', url: BaseUrl + '/usuariosPagina/:pagina', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/usuarios/:id', isArray: false}
      });
    }]);