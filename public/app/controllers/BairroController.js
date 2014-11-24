angular.module('mercado')
 .controller('BairroCreateController', function ($scope, $location, Bairro, Cidade, toastr){
          $scope.bairro = {};
          $scope.save = function(){
              console.log($scope.bairro);
              Bairro.save($scope.bairro, function(data){
                  toastr.success('Bairro salvo com sucesso');
                  $location.path('/bairros');
              }, function(data){
                  console.log(data);
                  toastr.error(data.data, 'Não foi possível Salvar o Bairro');
              });
          };

          $scope.cancel = function(){
              $location.path('/bairros');
          };

          $scope.init = function(){
              Cidade.getAll(function(data){
                  $scope.cidades = data;
              });
          };

 }).controller('BairroListController', function ($scope, Bairro, toastr){
           $scope.bairros = [];
           $scope.init = function(){
             Bairro.getAll(function(data){
               $scope.bairros = data;
             });
           };

           $scope.delete = function(id){
              Bairro.delete({id:id}, function(){
                  toastr.success('Bairro Removido com sucesso');
                  $scope.init();
              }, function(data){
                  toastr.error('Não foi possível remover o Bairro');
              });
           };
 }).controller('BairroDetailController', function ($scope, $routeParams, $location, Bairro, Cidade, toastr){

           $scope.init = function(){
                 $scope.bairro = Bairro.get({id:$routeParams.id});
                 $scope.cidade = Cidade.getAll();
           };

           $scope.update = function(){
               Bairro.update({id:$routeParams.id},$scope.bairro, function(){
                   toastr.success('Bairro atualizado com sucesso');
                   $location.path('/bairros');
               },function(){
                  toastr.error('Não foi possível Salvar o Bairro');
               });

           };

           $scope.cancel = function(){
               $location.path('/bairros');
           };

           $scope.delete = function(){
               Bairro.delete({id:$routeParams.id}, function(){
                   toastr.success('Bairro removido com sucesso');
                   $location.path('/bairros');
               }, function(data){
                   toastr.error('Não foi possível remover o Bairro');
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