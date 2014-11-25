angular.module('mercado', ['ngRoute', 'ngResource', 'toastr', 'mgcrea.ngStrap', 'ngAnimate'])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/assets/app/views/home.html',
                controller: 'HomeController'
            })
            .when('/paises/novo', {
                templateUrl: '/assets/app/views/paises/create.html',
                controller: 'PaisCreateController'
            })
            .when('/paises/detalhe/:id', {
                templateUrl: '/assets/app/views/paises/detail.html',
                controller: 'PaisDetailController'
            })
            .when('/paises', {
                templateUrl: '/assets/app/views/paises/list.html',
                controller: 'PaisListController'
            })
            .when('/estados/novo', {
                templateUrl: '/assets/app/views/estados/create.html',
                controller: 'EstadoCreateController'
            })
            .when('/estados/detalhe/:id', {
                templateUrl: '/assets/app/views/estados/detail.html',
                controller: 'EstadoDetailController'
            })
            .when('/estados', {
                templateUrl: '/assets/app/views/estados/list.html',
                controller: 'EstadoListController'
            })
            .when('/cidades/novo', {
                templateUrl: '/assets/app/views/cidades/create.html',
                controller: 'CidadeCreateController'
            })
            .when('/cidades/detalhe/:id', {
                templateUrl: '/assets/app/views/cidades/detail.html',
                controller: 'CidadeDetailController'
            })
            .when('/cidades', {
                templateUrl: '/assets/app/views/cidades/list.html',
                controller: 'CidadeListController'
            })
            .when('/bairros/novo', {
                templateUrl: '/assets/app/views/bairros/create.html',
                controller: 'BairroCreateController'
            })
            .when('/bairros/detalhe/:id', {
                templateUrl: '/assets/app/views/bairros/detail.html',
                controller: 'BairroDetailController'
            })
            .when('/bairros', {
                templateUrl: '/assets/app/views/bairros/list.html',
                controller: 'BairroListController'
            })
            .when('/clientes/novo', {
                templateUrl: '/assets/app/views/clientes/create.html',
                controller: 'ClienteCreateController'
            })
            .when('/clientes/detalhe/:id', {
                templateUrl: '/assets/app/views/clientes/detail.html',
                controller: 'ClienteDetailController'
            })
            .when('/clientes', {
                templateUrl: '/assets/app/views/clientes/list.html',
                controller: 'ClienteListController'
            });
   //Configuração das notificações
   }).config(function(toastrConfig) {
        angular.extend(toastrConfig, {
          allowHtml: true,
          closeButton: true,
          closeHtml: '<button>&times;</button>',
          containerId: 'toast-container',
          extendedTimeOut: 3000,
          iconClasses: {
            error: 'toast-error',
            info: 'toast-info',
            success: 'toast-success',
            warning: 'toast-warning'
          },
          messageClass: 'toast-message',
          positionClass: 'toast-top-right',
          tapToDismiss: true,
          timeOut: 3000,
          titleClass: 'toast-title',
          toastClass: 'toast'
        })
  //Configuração das datas
   }).config(function($datepickerProvider) {
        angular.extend($datepickerProvider.defaults, {
          dateFormat: 'dd/MM/yyyy',
          startWeek: 1
        });
  });