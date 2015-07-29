angular.module('mercado')
    .controller('CompraCreateController', function ($scope, $modal, $log) {

    }).controller('CompraListController', function ($scope, $modal, Compra) {

        $scope.compras = [];

        $scope.init = function(){
        $scope.nomeFiltro = '';

          Compra.getAll(function(data){
            $scope.compras = data;
            $scope.quantidade = $scope.compras.length;
          });
        };

        $scope.busca = function() {

           if ($scope.nomeFiltro) {
                Compra.getFiltroProduto({filtro:$scope.nomeFiltro}, $scope.compra, function(data) {
                    $scope.compras = data;
                });
           } else {
                Compra.getAll(function(data) {
                    $scope.compras = data;
                });
           };
        };

    }).controller('CompraDetailController', function ($scope, $modal, $log) {

    });