angular.module('mercado')
  .controller('CidadeCreateController', function ($scope, $location, Cidade, Estado, toastr){
      $scope.cidade = {};
      $scope.save = function(){
          console.log($scope.cidade);
          Cidade.save($scope.cidade, function(data){
              toastr.success('Cidade salva com sucesso');
              $location.path('/cidades');
          }, function(data){
              console.log(data);
              toastr.error(data.data, 'Não foi possível Salvar a Cidade');
          });
      };

      $scope.cancel = function(){
          $location.path('/cidades');
      };

      $scope.init = function(){
          Estado.getAll(function(data){
              $scope.estados = data;
          });
      };

      $scope.modalAjuda = {
          "title": "Ajuda",
          "content": "Campos Obrigatórios em Vermelho"
      };

    }).controller('CidadeListController', function ($scope, Cidade, toastr){
        $scope.cidades = [];
        $scope.init = function(){
          Cidade.getAll(function(data){
            $scope.cidades = data;
          });
        };

        $scope.delete = function(id){
           Cidade.delete({id:id}, function(){
               toastr.success('Cidade Removida com sucesso');
               $scope.init();
           }, function(data){
               toastr.error('Não foi possível remover a Cidade');
           });
        };
  }).controller('CidadeDetailController', function ($scope, $routeParams, $location, Cidade, Estado, toastr){

        $scope.init = function(){
              $scope.cidade = Cidade.get({id:$routeParams.id});
              $scope.estado = Estado.getAll();
        };

        $scope.update = function(){
            Cidade.update({id:$routeParams.id},$scope.cidade, function(){
                toastr.success('Cidade atualizada com sucesso');
                $location.path('/cidades');
            },function(){
               toastr.error('Não foi possível Salvar a Cidade');
            });
          };

        $scope.cancel = function(){
            $location.path('/cidades');
        };

        $scope.delete = function(){
            Cidade.delete({id:$routeParams.id}, function(){
                toastr.success('Cidade removido com sucesso');
                $location.path('/cidades');
            }, function(data){
                toastr.error(data.statusText,'Não foi possível remover a Cidade');
            });
        };

         $scope.modalAjuda = {
              "title": "Ajuda",
              "content": "Campos Obrigatórios em Vermelho"
         };

         $scope.confirmacaoModal = {
               "title": "Confirmação",
               "content": "Deseja excluir a Cidade?"
         };

  });
