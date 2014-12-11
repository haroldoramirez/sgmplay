angular.module('mercado')
  .controller('CategoriaCreateController', function ($scope, $modal, $location, Categoria, toastr) {
        $scope.categoria = {};
        $scope.save = function(){
            console.log($scope.categoria);
            Categoria.save($scope.categoria, function(data){
                toastr.success('Categoria salva com sucesso');
                $location.path('/categorias');
            }, function(data){
                console.log(data);
                toastr.error(data.data,'Não foi possível Salvar a Categoria');
            });
        };

        $scope.cancel = function(){
            $location.path('/categorias');
        };

        $scope.init = function(){
            Categoria.getAll(function(data){
                $scope.categorias = data;
            });
        };

        $scope.modalAjuda = {
            "title": "Ajuda",
            "content": "Campos Obrigatórios em Vermelho"
        };

  }).controller('CategoriaListController', function ($scope, Categoria, toastr){
        $scope.categorias = [];
        $scope.init = function(){
          Categoria.getAll(function(data){
            $scope.categorias = data;
          });
        };

        $scope.delete = function(id){
           Categoria.delete({id:id}, function(){
               toastr.success('Categoria removida com sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível remover a Categoria');
           });
        };

  }).controller('CategoriaDetailController', function ($scope, $routeParams, $location, Categoria, toastr){

        $scope.init = function(){
            $scope.categoria = Categoria.get({id:$routeParams.id});
        };

        $scope.update = function(){
            Categoria.update({id:$routeParams.id},$scope.categoria, function(){
                toastr.success('Categoria atualizada com sucesso');
                $location.path('/categorias');
            },function(){
               toastr.error('Não foi possível Salvar a Categoria');
            });

        };

         $scope.cancel = function(){
            $location.path('/categorias');
         };

        $scope.delete = function(){
            Categoria.delete({id:$routeParams.id}, function(){
                toastr.success('Categoria removida com sucesso');
                $location.path('/categorias');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível remover a Categoria');
            });
        };

        $scope.modalAjuda = {
             "title": "Ajuda",
             "content": "Campos Obrigatórios em Vermelho"
        };

        $scope.confirmacaoModal = {
             "title": "Confirmação",
             "content": "Deseja excluir a Categoria?"
        };

        $scope.popoverConfirmacao = {
             "title": "Confirmação",
             "content": "Excluir?"
        };
  });