angular.module('mercado')
  .controller('PaisCreateController', function ($scope, $location, Pais, toastr) {
        $scope.pais = {};
        $scope.save = function(){
            console.log($scope.pais);
            Pais.save($scope.pais, function(data){
                toastr.success('País salvo com sucesso');
                $location.path('/paises');
            }, function(data){
                console.log(data);
                toastr.error('Não foi possível Salvar o País');
            });
        };

        $scope.cancel = function(){
            $location.path('/paises');
        };

        $scope.init = function(){
            Pais.getAll(function(data){
                $scope.paises = data;
            });
        };

  }).controller('PaisListController', function ($scope, Pais, toastr){
        $scope.paises = [];
        $scope.init = function(){
          Pais.getAll(function(data){
            $scope.paises = data;
          });
        };

        $scope.delete = function(id){
           Pais.delete({id:id}, function(){
               toastr.success('País removido com sucesso');
               $scope.init();
           }, function(data){
               toastr.error('Não foi possível remover o País');
           });
        };

  }).controller('PaisDetailController', function ($scope, $routeParams, $location, Pais, toastr){

        $scope.init = function(){
            $scope.pais = Pais.get({id:$routeParams.id});
        };

        $scope.update = function(){
            Pais.update({id:$routeParams.id},$scope.pais, function(){
                toastr.success('País atualizado com sucesso');
                $location.path('/paises');
            },function(){
               toastr.error('Não foi possível Salvar o País');
            });

        };

        $scope.cancel = function(){
            $location.path('/paises');
        };

        $scope.delete = function(){
            Pais.delete({id:$routeParams.id}, function(){
                toastr.success('País removido com sucesso');
                $location.path('/paises');
            }, function(data){
                toastr.error('Não foi possível remover o País');
            });

        };
  }).directive('ngConfirmClick', [
       function(){
         return {
           priority: -1,
           restrict: 'A',
           link: function(scope, element, attrs){
             element.bind('click', function(e){
               var message = attrs.ngConfirmClick;
               if(message && !confirm(message)){
                 e.stopImmediatePropagation();
                 e.preventDefault();
               }
             });
           }
         }
       }
  ]);