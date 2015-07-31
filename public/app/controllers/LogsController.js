angular.module('mercado')
  .controller('LogsListController', function ($scope, $modal, $location, Log, $routeParams) {

    $scope.logs = [];

    $scope.init = function() {
        $scope.nomeFiltro = '';

        Log.getAll(function(data) {
           $scope.logs = data;
           $scope.quantidade = $scope.logs.length;
        });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Log.getFiltroLog({filtro:$scope.nomeFiltro}, $scope.log, function(data) {
                $scope.logs = data;
            });
       } else {
            Log.getAll(function(data) {
                $scope.logs = data;
            });
       };
    };

  }).controller('LogsDetailController', function ($scope, Log, $routeParams, $location) {

    $scope.init = function() {
      $scope.log = Log.get({id:$routeParams.id}, function(data) {
      },function(data) {
          console.log(data);
          toastr.error(data.data);
      });
    };

    $scope.cancel = function() {
        $location.path('/logs');
    };

  });