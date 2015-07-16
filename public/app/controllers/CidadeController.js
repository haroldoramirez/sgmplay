angular.module('mercado')
  .controller('CidadeCreateController', function ($scope, $modal, $location, Cidade, Estado, toastr) {

    $scope.cidade = {};

    $scope.init = function() {
        Estado.getAll(function(data) {
            $scope.estados = data;
        });
    };

    $scope.save = function() {
        console.log($scope.cidade);
        Cidade.save($scope.cidade, function(data) {
            toastr.success('Cidade Salva com Sucesso');
            $location.path('/cidades');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/cidades');
    };

  }).controller('CidadeListController', function ($scope, Cidade, toastr, $routeParams) {

    $scope.cidades = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Cidade.getAll(function(data) {
           $scope.cidades = data;
           $scope.quantidade = $scope.cidades.length;
        });
    };

    //* filtra por nome do estado *//
    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Cidade.getFiltroCidade({filtro:$scope.nomeFiltro}, $scope.cidade, function(data) {
                $scope.cidades = data;
            });
       } else {
            Cidade.getAll(function(data) {
                $scope.cidades = data;
            });
       };
    };

  }).controller('CidadeDetailController', function ($scope, $modal, $routeParams, $location, Cidade, Estado, toastr) {

    $scope.init = function() {
        $scope.cidade = Cidade.get({id:$routeParams.id});
        $scope.estados = Estado.getAll();
    };

    $scope.update = function() {
        Cidade.update({id:$routeParams.id}, $scope.cidade, function(data) {
            toastr.info('Cidade Atualizada com Sucesso');
            $location.path('/cidades');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Cidade.delete({id:$routeParams.id}, function() {
            toastr.warning('Cidade Removida com Sucesso');
            $modalInstance.close();
            $location.path('/cidades');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/cidades');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'CidadeDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });