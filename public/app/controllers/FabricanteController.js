angular.module('mercado')
  .controller('FabricanteCreateController', function ($scope, $modal, $location, Fabricante, toastr) {
        $scope.fabricante = {};
        $scope.save = function(){
            console.log($scope.fabricante);
            Fabricante.save($scope.fabricante, function(data){
                toastr.success('Fabricante salvo com sucesso');
                $location.path('/fabricantes');
            }, function(data){
                console.log(data);
                toastr.error(data.data,'Não foi possível Salvar o Fabricante');
            });
        };

        $scope.cancel = function(){
            $location.path('/fabricantes');
        };

        $scope.init = function(){
            Fabricante.getAll(function(data){
                $scope.fabricantes = data;
            });
        };

  }).controller('FabricanteListController', function ($scope, Fabricante, toastr){
        $scope.fabricantes = [];
        $scope.init = function(){
          Fabricante.getAll(function(data){
            $scope.fabricantes = data;
          });
        };

        $scope.delete = function(id){
           Fabricante.delete({id:id}, function(){
               toastr.success('Fabricante removido com sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível remover o Fabricante');
           });
        };

  }).controller('FabricanteDetailController', function ($scope, $routeParams, $location, Fabricante, toastr){

        $scope.init = function(){
            $scope.fabricante = Fabricante.get({id:$routeParams.id});
        };

        $scope.update = function(){
            Fabricante.update({id:$routeParams.id},$scope.fabricante, function(){
                toastr.success('Fabricante atualizado com sucesso');
                $location.path('/fabricantes');
            },function(){
               toastr.error('Não foi possível Salvar o Fabricante');
            });

        };

         $scope.cancel = function(){
            $location.path('/fabricantes');
         };

        $scope.delete = function(){
            Fabricante.delete({id:$routeParams.id}, function(){
                toastr.success('Fabricante removido com sucesso');
                $location.path('/fabricantes');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível remover o Fabricante');
            });
        };

        $scope.confirmacaoModal = {
             "title": "Confirmação",
             "content": "Deseja excluir o Fabricante?"
        };

        $scope.popoverConfirmacao = {
             "title": "Confirmação",
             "content": "Excluir?"
        };
  });