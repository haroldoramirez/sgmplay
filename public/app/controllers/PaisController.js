angular.module('mercado')
  .controller('PaisCreateController', function ($scope, $modal, $location, Pais, toastr) {

    $scope.pais = {};

    $scope.init = function() {
        Pais.getAll(function(data) {
            $scope.paises = data;
        });
    };

    $scope.save = function() {
        console.log($scope.pais);
        Pais.save($scope.pais, function(data) {
            toastr.success('País Salvo com Sucesso');
            $location.path('/paises');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/paises');
    };

  }).controller('PaisListController', function ($scope, Pais, toastr, $routeParams) {

    $scope.paises = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Pais.getAll(function(data) {
           $scope.paises = data;
           $scope.quantidade = $scope.paises.length;
        });
    };

    //* filtra por nome do país *//
    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Pais.getFiltroPais({filtro:$scope.nomeFiltro}, $scope.pais, function(data) {
                $scope.paises = data;
            });
       } else {
            Pais.getAll(function(data) {
                $scope.paises = data;
            });
       };
    };

  }).controller('PaisDetailController', function ($scope, $modal, $routeParams, $location, Pais, toastr) {

    $scope.init = function() {
        $scope.pais = Pais.get({id:$routeParams.id});
    };

    $scope.update = function() {
        Pais.update({id:$routeParams.id}, $scope.pais, function(data) {
            toastr.info('País Atualizado com Sucesso');
            $location.path('/paises');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Pais.delete({id:$routeParams.id}, function() {
            toastr.warning('País Removido com Sucesso');
            $modalInstance.close();
            $location.path('/paises');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/paises');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'PaisDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });