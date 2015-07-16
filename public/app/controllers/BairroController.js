angular.module('mercado')
  .controller('BairroCreateController', function ($scope, $modal, $location, Cidade, Bairro, toastr) {

    $scope.bairro = {};

    $scope.init = function() {
        Cidade.getAll(function(data) {
            $scope.cidades = data;
        });
    };

    $scope.save = function() {
        console.log($scope.bairro);
        Bairro.save($scope.bairro, function(data) {
            toastr.success('Bairro Salvo com Sucesso');
            $location.path('/bairros');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/bairros');
    };

  }).controller('BairroListController', function ($scope, Bairro, toastr, $routeParams) {

    $scope.bairros = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Bairro.getAll(function(data) {
           $scope.bairros = data;
           $scope.quantidade = $scope.bairros.length;
        });
    };

    //* filtra por nome do estado *//
    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Bairro.getFiltroBairro({filtro:$scope.nomeFiltro}, $scope.bairro, function(data) {
                $scope.bairros = data;
            });
       } else {
            Bairro.getAll(function(data) {
                $scope.bairros = data;
            });
       };
    };

  }).controller('BairroDetailController', function ($scope, $modal, $routeParams, $location, Cidade, Bairro, toastr) {

    $scope.init = function() {
        $scope.bairro = Bairro.get({id:$routeParams.id});
        $scope.cidades = Cidade.getAll();
    };

    $scope.update = function() {
        Bairro.update({id:$routeParams.id}, $scope.bairro, function(data) {
            toastr.info('Bairro Atualizado com Sucesso');
            $location.path('/bairros');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Bairro.delete({id:$routeParams.id}, function() {
            toastr.warning('Bairro Removido com Sucesso');
            $modalInstance.close();
            $location.path('/bairros');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/bairros');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'BairroDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });