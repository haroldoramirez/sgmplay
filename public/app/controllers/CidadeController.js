function updateActivedPage(scope) {
    window.scopePage = scope.pagina;
}

angular.module('mercado')
  .controller('CidadeCreateController', function ($scope, $location, Cidade, Estado, toastr){
      $scope.cidade = {};
      $scope.save = function(){
          console.log($scope.cidade);
          Cidade.save($scope.cidade, function(data){
              toastr.success(data.data,'Cidade Salva com Sucesso');
              $location.path('/cidades');
          }, function(data){
              console.log(data);
              toastr.error(data.data,'Não foi possível Salvar a Cidade');
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

    }).controller('CidadeListController', function ($scope, Cidade, toastr){
        $scope.cidades = [];
        $scope.init = function(){
            Cidade.getAll(function(data){
                $scope.cidades = data;
            });
            $scope.pagina = 0;
            updateActivedPage(this);
        };
        
        //botão de páginas
        $scope._pagina = function(val){
        $scope.pagina = val;
            Cidade.getPagina({pagina: $scope.pagina}, $scope.cidade, function(data){
                $scope.cidades = data;
            });
            updateActivedPage(this);
        };

        //botão próximo
        $scope.proximo = function(val){
        $scope.pagina = val + 1;
            Cidade.getPagina({pagina: $scope.pagina}, $scope.cidade, function(data){
                if (data.length===0) {
                    $scope.pagina = $scope.pagina - 1;
                }else{
                    $scope.cidades = data;
                };
            });
            updateActivedPage(this);
        }

        //botão anterior
        $scope.anterior = function(val){
        $scope.pagina = val - 1;
            Cidade.getPagina({pagina: $scope.pagina}, $scope.cidade, function(data){
                $scope.cidades = data;
            });
            updateActivedPage(this);
        }

        //deletar opcional
        $scope.delete = function(id){
           Cidade.delete({id:id}, function(){
               toastr.success('Cidade Removida com Sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível Remover a Cidade');
           });
        };
  }).controller('CidadeDetailController', function ($scope, $routeParams, $location, Cidade, Estado, toastr){

        $scope.init = function(){
              $scope.cidade = Cidade.get({id:$routeParams.id});
              $scope.estados = Estado.getAll();
        };

        $scope.update = function(){
            Cidade.update({id:$routeParams.id},$scope.cidade, function(data){
                toastr.info(data.data,'Cidade Atualizada com Sucesso');
                $location.path('/cidades');
            },function(data){
               toastr.error(data.data,'Não foi possível Atualizar a Cidade');
            });
          };

        $scope.cancel = function(){
            $location.path('/cidades');
        };

        $scope.delete = function(){
            Cidade.delete({id:$routeParams.id}, function(data){
                toastr.warning(data.data,'Cidade Removida com sucesso');
                $location.path('/cidades');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível Remover a Cidade');
            });
        };

        $scope.confirmacaoModal = {
              "title": "Confirmação",
              "content": "Deseja excluir a Cidade?"
        };

        $scope.popoverConfirmacao = {
              "title": "Confirmação",
              "content": "Excluir?"
        };

  });
