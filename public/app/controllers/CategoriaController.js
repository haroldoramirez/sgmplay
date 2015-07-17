angular.module('mercado')
  .controller('CategoriaCreateController', function ($scope, $modal, $location, Categoria, toastr) {

    $scope.categoria = {};

    $scope.init = function() {
        Categoria.getAll(function(data) {
            $scope.categorias = data;
        });
    };

    $scope.save = function() {
        console.log($scope.categoria);
        Categoria.save($scope.categoria, function(data) {
            toastr.success('Categoria Salva com Sucesso');
            $location.path('/categorias');
        }, function(data) {
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function() {
        $location.path('/categorias');
    };

  }).controller('CategoriaListController', function ($scope, Categoria, toastr, $routeParams) {

    $scope.categorias = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Categoria.getAll(function(data) {
           $scope.categorias = data;
           $scope.quantidade = $scope.categorias.length;
        });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Categoria.getFiltroCategoria({filtro:$scope.nomeFiltro}, $scope.categoria, function(data) {
                $scope.categorias = data;
            });
       } else {
            Categoria.getAll(function(data) {
                $scope.categorias = data;
            });
       };
    };

  }).controller('CategoriaDetailController', function ($scope, $modal, $routeParams, $location, Categoria, toastr) {

    $scope.init = function() {
        $scope.categoria = Categoria.get({id:$routeParams.id});
    };

    $scope.update = function() {
        Categoria.update({id:$routeParams.id}, $scope.categoria, function(data) {
            toastr.info('Categoria Atualizada com Sucesso');
            $location.path('/categorias');
        },function(data) {
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });
    };

    $scope.delete = function() {
        Categoria.delete({id:$routeParams.id}, function() {
            toastr.warning('Categoria Removida com Sucesso');
            $modalInstance.close();
            $location.path('/categorias');
        }, function(data) {
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });
    };

    $scope.cancel = function() {
       $location.path('/categorias');
    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'CategoriaDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });