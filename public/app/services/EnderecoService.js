angular.module('mercado')
  .service('Pais',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/paises/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/paises', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/paises/:id', isArray: false}
      });
  }]).service('Estado',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/estados/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/estados', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/estados/:id', isArray: false}
      });
  }]).service('Cidade',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
      return $resource(BaseUrl + '/cidades/:id', {}, {
        getAll: {method: 'GET', url: BaseUrl + '/cidades', isArray: true},
        update: {method: 'PUT', url: BaseUrl + '/cidades/:id', isArray: false}
      });
  }]).service('Bairro',['$resource', 'BaseUrl',
    function($resource, BaseUrl){
       return $resource(BaseUrl + '/bairros/:id', {}, {
         getAll: {method: 'GET', url: BaseUrl + '/bairros', isArray: true},
         update: {method: 'PUT', url: BaseUrl + '/bairros/:id', isArray: false}
       });
  }]);