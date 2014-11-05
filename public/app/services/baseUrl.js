angular.module('mercado')
  .factory('BaseUrl', function($location) {
     return 'http://' + $location.host() + ':9000' ;
   });