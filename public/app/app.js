angular.module('mercado', ['ngRoute', 'ngResource', 'toastr'])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {templateUrl: '/assets/app/views/home.html', controller: ''})
            .when('/paises/novo', {templateUrl: '/assets/app/views/paises/create.html', controller: 'PaisCreateController'})
            .when('/paises/detalhe/:id', {templateUrl: '/assets/app/views/paises/detail.html', controller: 'PaisDetailController'})
            .when('/paises', {templateUrl: '/assets/app/views/paises/list.html', controller: 'PaisListController'})
            .when('/estados/novo', {templateUrl: '/assets/app/views/estados/create.html', controller: 'EstadoCreateController'})
            .when('/estados/detalhe/:id', {templateUrl: '/assets/app/views/estados/detail.html', controller: 'EstadoDetailController'})
            .when('/estados', {templateUrl: '/assets/app/views/estados/list.html', controller: 'EstadoListController'});
   }).config(function(toastrConfig) {
        angular.extend(toastrConfig, {
          allowHtml: true,
          closeButton: false,
          closeHtml: '<button>&times;</button>',
          containerId: 'toast-container',
          extendedTimeOut: 2000,
          iconClasses: {
            error: 'toast-error',
            info: 'toast-info',
            success: 'toast-success',
            warning: 'toast-warning'
          },
          messageClass: 'toast-message',
          positionClass: 'toast-top-right',
          tapToDismiss: true,
          timeOut: 5000,
          titleClass: 'toast-title',
          toastClass: 'toast'
        });
   });