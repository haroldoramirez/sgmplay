function updateActivedPage(scope) {
    window.scopePage = scope.pagina;
}

angular.module('mercado')
  .controller('FabricanteCreateController', function ($scope, $modal, $location, Fabricante, toastr) {
        $scope.fabricante = {};
        $scope.save = function(){
            console.log($scope.fabricante);
            Fabricante.save($scope.fabricante, function(data){
                toastr.success(data.data,'Fabricante Salvo com Sucesso');
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
          $scope.pagina = 0;
          updateActivedPage(this);
        };
        
        //botão de páginas
        $scope._pagina = function(val){
        $scope.pagina = val;
            Fabricante.getPagina({pagina: $scope.pagina}, $scope.fabricante, function(data){
                $scope.fabricantes = data;
            });
            updateActivedPage(this);
        };
        
        //botão próximo
        $scope.proximo = function(val){
        $scope.pagina = val + 1;
            Fabricante.getPagina({pagina: $scope.pagina}, $scope.fabricante, function(data){
                if (data.length===0) {
                    $scope.pagina = $scope.pagina - 1;
                }else{
                    $scope.fabricantes = data;
                };
            });
            updateActivedPage(this);
         }

        //botão anterior
        $scope.anterior = function(val){
        $scope.pagina = val - 1;
            Fabricante.getPagina({pagina: $scope.pagina}, $scope.fabricante, function(data){
                $scope.fabricantes = data;
            });
            updateActivedPage(this);
         }

        //deletar opcional
        $scope.delete = function(id){
           Fabricante.delete({id:id}, function(){
               toastr.success('Fabricante Removido com Sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível Remover o Fabricante');
           });
        };

  }).controller('FabricanteDetailController', function ($scope, $routeParams, $location, Fabricante, toastr){

        $scope.init = function(){
            $scope.fabricante = Fabricante.get({id:$routeParams.id});
        };

        $scope.update = function(){
            Fabricante.update({id:$routeParams.id},$scope.fabricante, function(data){
                toastr.success(data.data,'Fabricante Atualizado com Sucesso');
                $location.path('/fabricantes');
            },function(data){
               toastr.error(data.data,'Não foi possível Atualizar o Fabricante');
            });

        };

         $scope.cancel = function(){
            $location.path('/fabricantes');
         };

        $scope.delete = function(){
            Fabricante.delete({id:$routeParams.id}, function(){
                toastr.success('Fabricante Removido com Sucesso');
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