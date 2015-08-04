angular.module('mercado')
  .controller('HomeController', function ($scope, ngDialog) {

  $scope.openModal = function () {
      ngDialog.open({
          template: 'templateId',
          controller: 'ModalController'
      });
  };

}).controller('ModalController', function ($scope) {

});