function updateActivedPage(scope) {
    window.scopePage = scope.pagina;
}

angular.module('mercado')
  .controller('EstadoCreateController', function ($scope, $location, Estado, Pais, toastr){
        $scope.estado = {};
        $scope.save = function(){
            console.log($scope.estado);
            Estado.save($scope.estado, function(data){
                toastr.success(data.data,'Estado Salvo com Sucesso');
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

  }).controller('EstadoListController', function ($scope, Estado, toastr){
        $scope.estados = [];
        $scope.init = function(){
          Estado.getAll(function(data){
            $scope.estados = data;
          });
          $scope.pagina = 0;
          updateActivedPage(this);
        };

        //botão de páginas
        $scope._pagina = function(val){
        $scope.pagina = val;
            Estado.getPagina({pagina: $scope.pagina}, $scope.estado, function(data){
                $scope.estados = data;
            });
            updateActivedPage(this);  
        };
                
        //botão próximo
        $scope.proximo = function(val){
        $scope.pagina = val + 1;
            Estado.getPagina({pagina: $scope.pagina}, $scope.estado, function(data){
                if (data.length===0) {
                    $scope.pagina = $scope.pagina - 1;
                }else{
                    $scope.estados = data;
                };
            });
            updateActivedPage(this);
        }
        
        //botão anterior
        $scope.anterior = function(val){
        $scope.pagina = val - 1;
            Estado.getPagina({pagina: $scope.pagina}, $scope.estado, function(data){
                $scope.estados = data;
            });
            updateActivedPage(this);
        }

        //deletar opcional
        $scope.delete = function(id){
           Estado.delete({id:id}, function(){
               toastr.success('Estado Removido com Sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível Remover o Estado');
           });
        };

  }).controller('EstadoDetailController', function ($scope, $routeParams, $location, Estado, Pais, toastr){

        $scope.init = function(){
              $scope.estado = Estado.get({id:$routeParams.id});
              $scope.paises = Pais.getAll();
        };

        $scope.update = function(){
            Estado.update({id:$routeParams.id},$scope.estado, function(data){
                toastr.info(data.data,'Estado Atualizado com Sucesso');
                $location.path('/estados');
            },function(data){
               toastr.error(data.data,'Não foi possível Atualizar o Estado');
            });

          };

        $scope.cancel = function(){
            $location.path('/estados');
        };

        $scope.delete = function(){
            Estado.delete({id:$routeParams.id}, function(data){
                toastr.warning(data.data,'Estado Removido com Sucesso');
                $location.path('/estados');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível Remover o Estado');
            });

        };

        $scope.confirmacaoModal = {
            "title": "Confirmação",
            "content": "Deseja excluir o Estado?"
        };

        $scope.popoverConfirmacao = {
            "title": "Confirmação",
            "content": "Excluir?"
        };

  });
