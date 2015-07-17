angular.module('mercado')
  .controller('UnidadeDeMedidaCreateController', function ($scope, $modal, $location, UnidadeDeMedida, toastr) {

    $scope.unidadedemedida = {};

    $scope.init = function() {
        UnidadeDeMedida.getAll(function(data) {
            $scope.unidadesdemedidas = data;
        });
    };

    $scope.save = function() {
        console.log($scope.unidadedemedida);
        UnidadeDeMedida.save($scope.unidadedemedida, function(data) {
            toastr.success('Unidade de Medida Salva com Sucesso');
            $location.path('/unidadesdemedidas');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/unidadesdemedidas');
    };

  }).controller('UnidadeDeMedidaListController', function ($scope, UnidadeDeMedida, toastr, $routeParams) {

    $scope.unidadesdemedidas = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        UnidadeDeMedida.getAll(function(data) {
           $scope.unidadesdemedidas = data;
           $scope.quantidade = $scope.unidadesdemedidas.length;
        });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            UnidadeDeMedida.getFiltroUnidadeDeMedida({filtro:$scope.nomeFiltro}, $scope.unidadedemedida, function(data) {
                $scope.unidadesdemedidas = data;
            });
       } else {
            UnidadeDeMedida.getAll(function(data) {
                $scope.unidadesdemedidas = data;
            });
       };
    };

  }).controller('UnidadeDeMedidaDetailController', function ($scope, $modal, $routeParams, $location, UnidadeDeMedida, toastr) {

    $scope.init = function() {
        $scope.unidadedemedida = UnidadeDeMedida.get({id:$routeParams.id});
    };

    $scope.update = function() {
        UnidadeDeMedida.update({id:$routeParams.id}, $scope.unidadedemedida, function(data) {
            toastr.info('Unidade de Medida Atualizada com Sucesso');
            $location.path('/unidadesdemedidas');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        UnidadeDeMedida.delete({id:$routeParams.id}, function() {
            toastr.warning('Unidade de Medida Removida com Sucesso');
            $modalInstance.close();
            $location.path('/unidadesdemedidas');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/unidadesdemedidas');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'UnidadeDeMedidaDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });