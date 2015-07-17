angular.module('mercado')
  .controller('FornecedorCreateController', function ($scope, $modal, $location, Fornecedor, Bairro, toastr) {

    $scope.fornecedor = {};

    $scope.init = function() {
        Bairro.getAll(function(data) {
            $scope.bairros = data;
        });
    };

    $scope.save = function() {
        console.log($scope.fornecedor);
        Fornecedor.save($scope.fornecedor, function(data) {
            toastr.success('Fornecedor Salvo com Sucesso');
            $location.path('/fornecedores');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/fornecedores');
    };

  }).controller('FornecedorListController', function ($scope, Fornecedor, toastr, $routeParams) {

    $scope.fornecedores = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Fornecedor.getAll(function(data) {
           $scope.fornecedores = data;
           $scope.quantidade = $scope.fornecedores.length;
        });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Fornecedor.getFiltroFornecedor({filtro:$scope.nomeFiltro}, $scope.fornecedor, function(data) {
                $scope.fornecedores = data;
            });
       } else {
            Fornecedor.getAll(function(data) {
                $scope.fornecedores = data;
            });
       };
    };

  }).controller('FornecedorDetailController', function ($scope, $modal, $routeParams, $location, Fornecedor, Bairro, toastr) {

    $scope.init = function() {
        $scope.fornecedor = Fornecedor.get({id:$routeParams.id});
        $scope.bairros = Bairro.getAll();
    };

    $scope.update = function() {
        Fornecedor.update({id:$routeParams.id}, $scope.fornecedor, function(data) {
            toastr.info('Fornecedor Atualizado com Sucesso');
            $location.path('/fornecedores');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Fornecedor.delete({id:$routeParams.id}, function() {
            toastr.warning('Fornecedor Removido com Sucesso');
            $modalInstance.close();
            $location.path('/fornecedores');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/fornecedores');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'FornecedorDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });