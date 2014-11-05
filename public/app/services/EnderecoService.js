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
    }]);