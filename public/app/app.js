angular
    .module
        ('mercado',
            ['ngRoute',
             'ngResource',
             'toastr',
             'mgcrea.ngStrap',
             'ngAnimate',
             'angular-loading-bar',
             'ui.utils.masks'
            ]
        )
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/assets/app/views/home.html',
                controller: 'HomeController'
            })
            .when('/ajuda', {
                templateUrl: '/assets/app/views/help.html',
                controller: 'AjudaController'
            })
            .when('/login', {
                templateUrl: '/assets/app/views/login.html',
                controller: 'AutenticacaoController'
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
            })
             .when('/fornecedores', {
                templateUrl: '/assets/app/views/fornecedores/list.html',
                controller: 'FornecedorListController'
            })
            .when('/fornecedores/novo', {
                templateUrl: '/assets/app/views/fornecedores/create.html',
                controller: 'FornecedorCreateController'
            })
            .when('/fornecedores/detalhe/:id', {
                templateUrl: '/assets/app/views/fornecedores/detail.html',
                controller: 'FornecedorDetailController'
            })
            .when('/categorias', {
                 templateUrl: '/assets/app/views/categorias/list.html',
                 controller: 'CategoriaListController'
            })
            .when('/categorias/novo', {
                 templateUrl: '/assets/app/views/categorias/create.html',
                 controller: 'CategoriaCreateController'
            })
            .when('/categorias/detalhe/:id', {
                 templateUrl: '/assets/app/views/categorias/detail.html',
                 controller: 'CategoriaDetailController'
            })
            .when('/fabricantes', {
                 templateUrl: '/assets/app/views/fabricantes/list.html',
                 controller: 'FabricanteListController'
            })
            .when('/fabricantes/novo', {
                 templateUrl: '/assets/app/views/fabricantes/create.html',
                 controller: 'FabricanteCreateController'
            })
            .when('/fabricantes/detalhe/:id', {
                 templateUrl: '/assets/app/views/fabricantes/detail.html',
                 controller: 'FabricanteDetailController'
            })
            .when('/unidadesdemedidas', {
                 templateUrl: '/assets/app/views/unidadesdemedidas/list.html',
                 controller: 'UnidadeDeMedidaListController'
            })
            .when('/unidadesdemedidas/novo', {
                 templateUrl: '/assets/app/views/unidadesdemedidas/create.html',
                 controller: 'UnidadeDeMedidaCreateController'
            })
            .when('/unidadesdemedidas/detalhe/:id', {
                 templateUrl: '/assets/app/views/unidadesdemedidas/detail.html',
                 controller: 'UnidadeDeMedidaDetailController'
            })
               .when('/produtos', {
                 templateUrl: '/assets/app/views/produtos/list.html',
                 controller: 'ProdutoListController'
            })
               .when('/produtos/novo', {
                 templateUrl: '/assets/app/views/produtos/create.html',
                 controller: 'ProdutoCreateController'
            })
               .when('/produtos/detalhe/:id', {
                 templateUrl: '/assets/app/views/produtos/detail.html',
                 controller: 'ProdutoDetailController'
            })
               .when('/usuarios', {
                 templateUrl: '/assets/app/views/usuarios/list.html',
                 controller: 'UsuarioListController'
            })
               .when('/usuarios/novo', {
                 templateUrl: '/assets/app/views/usuarios/create.html',
                 controller: 'UsuarioCreateController'
            })
               .when('/usuarios/detalhe/:id', {
                 templateUrl: '/assets/app/views/usuarios/detail.html',
                 controller: 'UsuarioDetailController'
            });
   //Configuração das notificações
   }).config(function(toastrConfig) {
        angular.extend(toastrConfig, {
          allowHtml: true,
          closeButton: true,
          closeHtml: '<button>&times;</button>',
          containerId: 'toast-container',
          extendedTimeOut: 6000,
          iconClasses: {
            error: 'toast-error',
            info: 'toast-info',
            success: 'toast-success',
            warning: 'toast-warning'
          },
          messageClass: 'toast-message',
          //positionClass: 'toast-bottom-full-width',
          //positionClass: 'toast-top-full-width',
          positionClass: 'toast-bottom-right',
          tapToDismiss: true,
          timeOut: 6000,
          titleClass: 'toast-title',
          toastClass: 'toast'
        })
  //Configuração do datepicker
   }).config(function($datepickerProvider) {
        angular.extend($datepickerProvider.defaults, {
          iconLeft: 'glyphicon glyphicon-triangle-left',
          iconRight: 'glyphicon glyphicon-triangle-right',
          placement: 'bottom'
        });
  });