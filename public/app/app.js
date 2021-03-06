angular
    .module
        ('mercado',
            ['ngRoute',
             'ngResource',
             'toastr',
             'ngDialog',
             'ngAnimate',
             'angular-loading-bar',
             'ui.utils.masks',
             'ui.bootstrap',
             'mgcrea.ngStrap.datepicker'
            ]
        )
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/assets/app/views/home.html',
                controller: 'HomeController'
            })
            .when('/logs', {
                templateUrl: '/assets/app/views/logs/list.html',
                controller: 'LogsListController'
            })
            .when('/logs/detalhe/:id', {
                templateUrl: '/assets/app/views/logs/detail.html',
                controller: 'LogsDetailController'
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
               .when('/contatos', {
                 templateUrl: '/assets/app/views/contatos/list.html',
                 controller: 'ContatoListController'
            })
               .when('/contatos/novo', {
                 templateUrl: '/assets/app/views/contatos/create.html',
                 controller: 'ContatoCreateController'
            })
               .when('/contatos/detalhe/:id', {
                 templateUrl: '/assets/app/views/contatos/detail.html',
                 controller: 'ContatoDetailController'
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
            })
               .when('/compras', {
                 templateUrl: '/assets/app/views/compras/list.html',
                 controller: 'CompraListController'
            })
               .when('/compras/novo', {
                 templateUrl: '/assets/app/views/compras/create.html',
                 controller: 'CompraCreateController'
            })
               .when('/compras/detalhe/:id', {
                 templateUrl: '/assets/app/views/compras/detail.html',
                 controller: 'CompraDetailController'
            });
   //Configuração das notificações
   }).config(function(toastrConfig) {
        angular.extend(toastrConfig, {
           allowHtml: false,
           autoDismiss: false,
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
           maxOpened: 0,
           messageClass: 'toast-message',
           newestOnTop: true,
           onHidden: null,
           onShown: null,
           positionClass: 'toast-bottom-right',
           preventDuplicates: false,
           preventOpenDuplicates: false,
           progressBar: false,
           tapToDismiss: true,
           target: 'body',
           templates: {
             toast: 'directives/toast/toast.html',
             progressbar: 'directives/progressbar/progressbar.html'
           },
           timeOut: 6000,
           titleClass: 'toast-title',
           toastClass: 'toast'
        });
   }).config(function($datepickerProvider) {
        angular.extend($datepickerProvider.defaults, {
           iconLeft: 'fa fa-chevron-left',
           iconRight: 'fa fa-chevron-right',
           placement: 'bottom'
        });
   }).config(['ngDialogProvider', function (ngDialogProvider) {
        ngDialogProvider.setDefaults({
           showClose: false,
           closeByDocument: true,
           closeByEscape: true
        });
   }]);