angular.module('mercado')
    .controller('HomeController', function ($scope, $location, $modal, $log) {

       $scope.openModal = function(){

       console.log('abriu modal');

           $modal.open({
              templateUrl: 'myModalContent.html',
              controller: '',
              size: 'sm',
              resolve: {
                items: function () {
                  return $scope.items;
                }
              }
            }).result.then(function (selectedItem) {
              $scope.selected = selectedItem;
            }, function () {
              $log.info('Modal dismissed at: ' + new Date());
            });


       };

    });