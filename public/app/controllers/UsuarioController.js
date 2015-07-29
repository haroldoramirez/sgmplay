angular.module('mercado')
  .controller('UsuarioCreateController', function ($scope, $modal, $location, Usuario, toastr) {

    $scope.usuario = {};

    $scope.init = function() {
        Usuario.getAll(function(data) {
            $scope.usuarios = data;
        });
    };

    $scope.save = function() {
        console.log($scope.usuario);
        Usuario.save($scope.usuario, function(data) {
            toastr.success('Usuário Salvo com Sucesso');
            $location.path('/usuarios');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/usuarios');
    };

  }).controller('UsuarioListController', function ($scope, Usuario, toastr, $routeParams) {

    $scope.usuarios = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Usuario.getAll(function(data) {
           $scope.usuarios = data;
           $scope.quantidade = $scope.usuarios.length;
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não autorizado');
        });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Usuario.getFiltroUsuario({filtro:$scope.nomeFiltro}, $scope.usuario, function(data) {
                $scope.usuarios = data;
            }, function(data) {
                 console.log(data);
                 toastr.error(data.data,'Não autorizado');
             });
       } else {
            Usuario.getAll(function(data) {
                $scope.usuarios = data;
            });
       };
    };

  }).controller('UsuarioDetailController', function ($scope, $modal, $routeParams, $location, Usuario, toastr) {

    $scope.init = function() {
        $scope.usuario = Usuario.get({id:$routeParams.id});
    };

    $scope.init = function() {
        $scope.usuario = Usuario.get({id:$routeParams.id}, function(data) {
        },function(data) {
            console.log(data);
            toastr.error(data.data);
        });
    };

    $scope.update = function() {
        Usuario.update({id:$routeParams.id}, $scope.usuario, function(data) {
            toastr.info('Usuário Atualizado com Sucesso');
            $location.path('/usuarios');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Usuario.delete({id:$routeParams.id}, function() {
            toastr.warning('Usuário Removido com Sucesso');
            $modalInstance.close();
            $location.path('/usuarios');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/usuarios');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'UsuarioDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });