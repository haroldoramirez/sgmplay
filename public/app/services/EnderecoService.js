angular.module('mercado')
  .service('Pais',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/paises/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/paises', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/paises/:id', isArray: false},
         getFiltroPais: {method: 'GET', url: BaseUrl + '/paises/nome/:filtro', isArray: true}
      });
  }]).service('Estado',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/estados/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/estados', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/estados/:id', isArray: false},
         getFiltroEstado: {method: 'GET', url: BaseUrl + '/estados/nome/:filtro', isArray: true}
      });
  }]).service('Cidade',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/cidades/:id', {}, {
        getAll: {method: 'GET', url: BaseUrl + '/cidades', isArray: true},
        update: {method: 'PUT', url: BaseUrl + '/cidades/:id', isArray: false},
        getFiltroCidade: {method: 'GET', url: BaseUrl + '/cidades/nome/:filtro', isArray: true}
      });
  }]).service('Bairro',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/bairros/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/bairros', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/bairros/:id', isArray: false},
         getFiltroBairro: {method: 'GET', url: BaseUrl + '/bairros/nome/:filtro', isArray: true}
      });
  }]).service('Cliente',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/clientes/:id', {}, {
        getAll: {method: 'GET', url: BaseUrl + '/clientes', isArray: true},
        update: {method: 'PUT', url: BaseUrl + '/clientes/:id', isArray: false},
        getFiltroCliente: {method: 'GET', url: BaseUrl + '/clientes/nome/:filtro', isArray: true}
      });
  }]).service('Fornecedor',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/fornecedores/:id', {}, {
        getAll: {method: 'GET', url: BaseUrl + '/fornecedores', isArray: true},
        update: {method: 'PUT', url: BaseUrl + '/fornecedores/:id', isArray: false},
        getFiltroFornecedor: {method: 'GET', url: BaseUrl + '/fornecedores/nome/:filtro', isArray: true}
      });
  }]).service('Categoria',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/categorias/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/categorias', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/categorias/:id', isArray: false},
         getFiltroCategoria: {method: 'GET', url: BaseUrl + '/categorias/nome/:filtro', isArray: true}
      });
   }]).service('Fabricante',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/fabricantes/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/fabricantes', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/fabricantes/:id', isArray: false},
         getFiltroFabricante: {method: 'GET', url: BaseUrl + '/fabricantes/nome/:filtro', isArray: true}
      });
    }]).service('UnidadeDeMedida',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/unidadesdemedidas/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/unidadesdemedidas', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/unidadesdemedidas/:id', isArray: false},
         getFiltroUnidadeDeMedida: {method: 'GET', url: BaseUrl + '/unidadesdemedidas/nome/:filtro', isArray: true}
      });
    }]).service('Produto',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/produtos/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/produtos', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/produtos/:id', isArray: false},
         getFiltroProduto: {method: 'GET', url: BaseUrl + '/produtos/nome/:filtro', isArray: true}
      });
    }]).service('Usuario',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/usuarios/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/usuarios', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/usuarios/:id', isArray: false},
         getFiltroUsuario: {method: 'GET', url: BaseUrl + '/usuarios/nome/:filtro', isArray: true}
      });
    }]).service('Compra',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/compras/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/compras', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/compras/:id', isArray: false},
         getFiltroCompra: {method: 'GET', url: BaseUrl + '/compras/data/:filtro', isArray: true}
      });
    }]).service('Log',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/logs/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/logs', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/logs/:id', isArray: false},
         getFiltroLog: {method: 'GET', url: BaseUrl + '/logs/data/:filtro', isArray: true}
      });
    }]).service('Contato',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/contatos/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/contatos', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/contatos/:id', isArray: false},
         getFiltro: {method: 'GET', url: BaseUrl + '/contatos/nome/:filtro', isArray: true}
      });
    }]);