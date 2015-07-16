angular.module('mercado').controller('HomeController', function ($scope, $modal, $log) {

  $scope.animationsEnabled = true;

  $scope.open = function (size) {

    var modalInstance = $modal.open({
      animation: $scope.animationsEnabled,
      templateUrl: 'modalHome.html',
      controller: 'ModalController',
      size: size
    });
  };

});

// Please note that $modalInstance represents a modal window (instance) dependency.
// It is not the same as the $modal service used above.

angular.module('mercado').controller('ModalController', function ($scope, $modalInstance) {

  $scope.fechar = function () {
    $modalInstance.close();
  };

});