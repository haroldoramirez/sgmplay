angular.module('mercado')
  .controller('HomeController', function ($scope, $modal) {

  $scope.open = function (size) {

    var modalInstance = $modal.open({
      animation: $scope.animationsEnabled,
      templateUrl: 'modalHome.html',
      controller: 'ModalController',
      size: size
    });
  };

}).controller('ModalController', function ($scope, $modalInstance) {

  $scope.fechar = function () {
    $modalInstance.close();
  };

});