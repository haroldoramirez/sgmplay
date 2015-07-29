angular.module('mercado')
  .controller('FabricanteCreateController', function ($scope, $modal, $location, Fabricante, toastr) {

    $scope.fabricante = {};

    $scope.init = function() {
        Fabricante.getAll(function(data) {
            $scope.fabricantes = data;
        });
    };

    $scope.save = function() {
        console.log($scope.fabricante);
        Fabricante.save($scope.fabricante, function(data) {
            toastr.success('Fabricante Salvo com Sucesso');
            $location.path('/fabricantes');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/fabricantes');
    };

  }).controller('FabricanteListController', function ($scope, Fabricante, toastr, $routeParams) {

    $scope.fabricantes = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Fabricante.getAll(function(data) {
           $scope.fabricantes = data;
           $scope.quantidade = $scope.fabricantes.length;
        });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Fabricante.getFiltroFabricante({filtro:$scope.nomeFiltro}, $scope.fabricante, function(data) {
                $scope.fabricantes = data;
            });
       } else {
            Fabricante.getAll(function(data) {
                $scope.fabricantes = data;
            });
       };
    };

  }).controller('FabricanteDetailController', function ($scope, $modal, $routeParams, $location, Fabricante, toastr) {

    $scope.init = function() {
        $scope.fabricante = Fabricante.get({id:$routeParams.id}, function(data) {
        },function(data) {
            console.log(data);
            toastr.error(data.data);
        });
    };

    $scope.update = function() {
        Fabricante.update({id:$routeParams.id}, $scope.fabricante, function(data) {
            toastr.info('Fabricante Atualizado com Sucesso');
            $location.path('/fabricantes');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Fabricante.delete({id:$routeParams.id}, function() {
            toastr.warning('Fabricante Removido com Sucesso');
            $modalInstance.close();
            $location.path('/fabricantes');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/fabricantes');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'FabricanteDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });