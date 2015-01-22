angular.module('mercado')
  .controller('PaisCreateController', function ($scope, $modal, $location, Pais, toastr) {
        $scope.pais = {};
        $scope.save = function(){
            console.log($scope.pais);
            Pais.save($scope.pais, function(data){
                toastr.success('País salvo com sucesso');
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
        };

        //páginas
        $scope._pagina = function(val){
            $scope.pagina = val;
            Pais.getPagina({pagina: $scope.pagina}, $scope.pais, function(data){
                $scope.paises = data;
            });
        }

        //botão anterior da página
        $scope.anterior = function(){
        console.log('página anterior');
            $scope.pagina = $scope.pagina - 1;
            Pais.getPagina({pagina: $scope.pagina}, $scope.pais, function(data){
                 $scope.paises = data;
            });
        };

         //botão proximo da página
            $scope.pagina = $scope.pagina + 1;
            Pais.getPagina({pagina: $scope.pagina}, $scope.pais, function(data){
              if (data.length===0) {
                $scope.pagina = $scope.pagina - 1;
              }else{
                $scope.paises = data;
              };
            });

        //deletar opcional
        $scope.delete = function(id){
           Pais.delete({id:id}, function(){
               toastr.success('País removido com sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível remover o País');
           });
        };

  }).controller('PaisDetailController', function ($scope, $modal, $routeParams, $location, Pais, toastr){

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
            console.log(data);
                toastr.error(data.data,'Não foi possível remover o País');
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