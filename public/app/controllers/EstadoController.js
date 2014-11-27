angular.module('mercado')
  .controller('EstadoCreateController', function ($scope, $location, Estado, Pais, toastr){
        $scope.estado = {};
        $scope.save = function(){
            console.log($scope.estado);
            Estado.save($scope.estado, function(data){
                toastr.success('Estado salvo com sucesso');
                $location.path('/estados');
            }, function(data){
                console.log(data);
                toastr.error(data.data, 'Não foi possível Salvar o Estado');
            });
        };

        $scope.cancel = function(){
            $location.path('/estados');
        };

        $scope.init = function(){
            Pais.getAll(function(data){
                $scope.paises = data;
            });
        };

        $scope.modalAjuda = {
            "title": "Ajuda",
            "content": "Campos Obrigatórios em Vermelho"
        };

  }).controller('EstadoListController', function ($scope, Estado, toastr){
        $scope.estados = [];
        $scope.init = function(){
          Estado.getAll(function(data){
            $scope.estados = data;
          });
        };

        $scope.delete = function(id){
           Estado.delete({id:id}, function(){
               toastr.success('Estado Removido com sucesso');
               $scope.init();
           }, function(data){
               toastr.error('Não foi possível remover o Estado');
           });
        };

  }).controller('EstadoDetailController', function ($scope, $routeParams, $location, Estado, Pais, toastr){

        $scope.init = function(){
              $scope.estado = Estado.get({id:$routeParams.id});
              $scope.paises = Pais.getAll();
        };

        $scope.update = function(){
            Estado.update({id:$routeParams.id},$scope.estado, function(){
                toastr.success('Estado atualizado com sucesso');
                $location.path('/estados');
            },function(){
               toastr.error('Não foi possível Salvar o Estado');
            });

          };

        $scope.cancel = function(){
            $location.path('/estados');
        };

        $scope.delete = function(){
            Estado.delete({id:$routeParams.id}, function(){
                toastr.success('Estado removido com sucesso');
                $location.path('/estados');
            }, function(data){
                toastr.error(data.statusText,'Não foi possível remover o Estado');
            });

        };

        $scope.modalAjuda = {
            "title": "Ajuda",
            "content": "Campos Obrigatórios em Vermelho"
        };

        $scope.confirmacaoModal = {
            "title": "Confirmação",
            "content": "Deseja excluir o Estado?"
        };

  });
