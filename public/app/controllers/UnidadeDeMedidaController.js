function updateActivedPage(scope) {
    window.scopePage = scope.pagina;
}

angular.module('mercado')
  .controller('UnidadeDeMedidaCreateController', function ($scope, $modal, $location, UnidadeDeMedida, toastr) {
        $scope.unidadedemedida = {};
        $scope.save = function(){
            console.log($scope.unidadedemedida);
            UnidadeDeMedida.save($scope.unidadedemedida, function(data){
                toastr.success('Unidade de Medida salva com sucesso');
                $location.path('/unidadesdemedidas');
            }, function(data){
                console.log(data);
                toastr.error(data.data,'Não foi possível Salvar a Unidade de Medida');
            });
        };

        $scope.cancel = function(){
            $location.path('/unidadesdemedidas');
        };

        $scope.init = function(){
            UnidadeDeMedida.getAll(function(data){
                $scope.unidadesdemedidas = data;
            });
        };

  }).controller('UnidadeDeMedidaListController', function ($scope, UnidadeDeMedida, toastr){
        $scope.unidadesdemedidas = [];
        $scope.init = function(){
          UnidadeDeMedida.getAll(function(data){
            $scope.unidadesdemedidas = data;
          });
          $scope.pagina = 0;
          updateActivedPage(this);
        };
        
        //botão de páginas
        $scope._pagina = function(val){
        $scope.pagina = val;
            UnidadeDeMedida.getPagina({pagina: $scope.pagina}, $scope.unidadedemedida, function(data){
                $scope.unidadesdemedidas = data;
            });
            updateActivedPage(this);
        };

        //botão próximo
        $scope.proximo = function(val){
        $scope.pagina = val + 1;
            UnidadeDeMedida.getPagina({pagina: $scope.pagina}, $scope.unidadedemedida, function(data){
                if (data.length===0) {
                    $scope.pagina = $scope.pagina - 1;
                }else{
                    $scope.unidadesdemedidas = data;
                };
            });
            updateActivedPage(this);
         }

        //botão anterior
        $scope.anterior = function(val){
        $scope.pagina = val - 1;
            UnidadeDeMedida.getPagina({pagina: $scope.pagina}, $scope.unidadedemedida, function(data){
                $scope.unidadesdemedidas = data;
            });
            updateActivedPage(this);
         }

        //deletar opcional
        $scope.delete = function(id){
           UnidadeDeMedida.delete({id:id}, function(){
               toastr.success('Unidade de Medida removida com sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível remover a Unidade de Medida');
           });
        };

  }).controller('UnidadeDeMedidaDetailController', function ($scope, $routeParams, $location, UnidadeDeMedida, toastr){

        $scope.init = function(){
            $scope.unidadedemedida = UnidadeDeMedida.get({id:$routeParams.id});
        };

        $scope.update = function(){
            UnidadeDeMedida.update({id:$routeParams.id},$scope.unidadedemedida, function(){
                toastr.success('Unidade de Medida atualizada com sucesso');
                $location.path('/unidadesdemedidas');
            },function(){
               toastr.error('Não foi possível Salvar a Unidade de Medida');
            });

        };

         $scope.cancel = function(){
            $location.path('/unidadesdemedidas');
         };

        $scope.delete = function(){
            UnidadeDeMedida.delete({id:$routeParams.id}, function(){
                toastr.success('Unidade de Medida removida com sucesso');
                $location.path('/unidadesdemedidas');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível remover a Unidade de Medida');
            });
        };

        $scope.confirmacaoModal = {
             "title": "Confirmação",
             "content": "Deseja excluir a Unidade de Medida?"
        };

        $scope.popoverConfirmacao = {
             "title": "Confirmação",
             "content": "Excluir?"
        };
  });