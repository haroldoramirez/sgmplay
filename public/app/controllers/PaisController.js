function updateActivedPage(scope) {
    window.scopePage = scope.pagina;
}

angular.module('mercado')
  .controller('PaisCreateController', function ($scope, $modal, $location, Pais, toastr) {
        $scope.pais = {};
        $scope.save = function(){
            console.log($scope.pais);
            Pais.save($scope.pais, function(data){
                toastr.success(data.data,'País Salvo com Sucesso');
                $location.path('/paises');
            }, function(data){
                console.log(data);
                toastr.error(data.data,'Não foi possível Salvar o País');
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
          $scope.pagina = 0;
          updateActivedPage(this);
        };

        //botão de páginas
        $scope._pagina = function(val){
        $scope.pagina = val;
            Pais.getPagina({pagina: $scope.pagina}, $scope.pais, function(data){
                $scope.paises = data;
            });
            updateActivedPage(this);
        };
        
        //botão próximo
        $scope.proximo = function(val){
        $scope.pagina = val + 1;
            Pais.getPagina({pagina: $scope.pagina}, $scope.pais, function(data){
                if (data.length===0) {
                    $scope.pagina = $scope.pagina - 1;
                }else{
                    $scope.paises = data;
                };
            });
            updateActivedPage(this);
         }

        //botão anterior
        $scope.anterior = function(val){
        $scope.pagina = val - 1;
            Pais.getPagina({pagina: $scope.pagina}, $scope.pais, function(data){
                $scope.paises = data;
            });
            updateActivedPage(this);
         }

        //deletar opcional
        $scope.delete = function(id){
           Pais.delete({id:id}, function(){
               toastr.info('País Removido com Sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível Remover o País');
           });
        };

  }).controller('PaisDetailController', function ($scope, $modal, $routeParams, $location, Pais, toastr){

        $scope.init = function(){
            $scope.pais = Pais.get({id:$routeParams.id});
        };

        $scope.update = function(){
            Pais.update({id:$routeParams.id},$scope.pais, function(data){
                toastr.info(data.data,'País Atualizado com Sucesso');
                $location.path('/paises');
            },function(data){
               console.log(data);
               toastr.error(data.data,'Não foi possível Atualizar o País');
            });

        };

         $scope.cancel = function(){
            $location.path('/paises');
         };

        $scope.delete = function(){
            Pais.delete({id:$routeParams.id}, function(data){
                toastr.warning(data.data,'País Removido com Sucesso');
                $location.path('/paises');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível Remover o País');
            });
        };

        $scope.confirmacaoModal = {
             "title": "Confirmação",
             "content": "Deseja excluir o País?"
        };

        $scope.popoverConfirmacao = {
             "title": "Confirmação",
             "content": "Excluir?"
        };
  });