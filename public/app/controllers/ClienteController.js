angular.module('mercado')
  .controller('ClienteCreateController', function ($scope, $modal, $location, Cliente, Bairro, toastr) {

    $scope.cliente = {};

    $scope.init = function() {
        Bairro.getAll(function(data) {
            $scope.bairros = data;
        });
    };

    $scope.save = function() {
        console.log($scope.cliente);
        Cliente.save($scope.cliente, function(data) {
            toastr.success('Cliente Salvo com Sucesso');
            $location.path('/clientes');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/clientes');
    };

  }).controller('ClienteListController', function ($scope, Cliente, toastr, $routeParams) {

    $scope.clientes = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Cliente.getAll(function(data) {
           $scope.clientes = data;
           $scope.quantidade = $scope.clientes.length;
        });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Cliente.getFiltroCliente({filtro:$scope.nomeFiltro}, $scope.cliente, function(data) {
                $scope.clientes = data;
            });
       } else {
            Cliente.getAll(function(data) {
                $scope.clientes = data;
            });
       };
    };

  }).controller('ClienteDetailController', function ($scope, $modal, $routeParams, $location, Cliente, Bairro, toastr) {

    $scope.init = function() {
        $scope.cliente = Cliente.get({id:$routeParams.id});
        $scope.bairros = Bairro.getAll();
    };

    $scope.update = function() {
        Cliente.update({id:$routeParams.id}, $scope.cliente, function(data) {
            toastr.info('Cliente Atualizado com Sucesso');
            $location.path('/clientes');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Cliente.delete({id:$routeParams.id}, function() {
            toastr.warning('Cliente Removido com Sucesso');
            $modalInstance.close();
            $location.path('/clientes');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/clientes');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'ClienteDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });