angular.module('mercado')
  .controller('ProdutoCreateController', function ($scope, $location, Produto, Fornecedor, Fabricante, Categoria, UnidadeDeMedida, toastr){
        $scope.produto = {};
        $scope.save = function(){
            console.log($scope.produto);
            Produto.save($scope.produto, function(data){
                toastr.success('Produto salvo com sucesso');
                $location.path('/produtos');
            }, function(data){
                console.log(data);
                toastr.error(data.data, 'Não foi possível Salvar o Produto');
            });
        };

        $scope.cancel = function(){
            $location.path('/produtos');
        };

        $scope.init = function(){
            Fornecedor.getAll(function(data){
                $scope.fornecedores = data;
            });

            Fabricante.getAll(function(data){
                $scope.fabricantes = data;
            });

            Categoria.getAll(function(data){
                $scope.categorias = data;
            });

            UnidadeDeMedida.getAll(function(data){
                $scope.unidadesdemedidas = data;
            });
        };

  }).controller('ProdutoListController', function ($scope, Produto, toastr){
        $scope.produtos = [];
        $scope.init = function(){
          Produto.getAll(function(data){
            $scope.produtos = data;
          });
        };

        $scope.delete = function(id){
           Produto.delete({id:id}, function(){
               toastr.success('Produto Removido com sucesso');
               $scope.init();
           }, function(data){
               toastr.error('Não foi possível remover o Produto');
           });
        };

  }).controller('ProdutoDetailController', function ($scope, $routeParams, $location, Produto, Fornecedor, Fabricante, Categoria, UnidadeDeMedida, toastr){

        $scope.init = function(){
              $scope.produto = Produto.get({id:$routeParams.id});
              $scope.fornecedores = Fornecedor.getAll();
              $scope.fabricantes = Fabricante.getAll();
              $scope.categorias = Categoria.getAll();
              $scope.unidadesdemedidas = UnidadeDeMedida.getAll();
        };

        $scope.update = function(){
            Produto.update({id:$routeParams.id},$scope.produto, function(){
                toastr.success('Produto atualizado com sucesso');
                $location.path('/produtos');
            },function(){
               toastr.error('Não foi possível Atualizar o Produto');
            });

          };

        $scope.cancel = function(){
            $location.path('/produtos');
        };

        $scope.delete = function(){
            Produto.delete({id:$routeParams.id}, function(){
                toastr.success('Produto removido com sucesso');
                $location.path('/produtos');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível remover o Produto');
            });

        };

        $scope.confirmacaoModal = {
            "title": "Confirmação",
            "content": "Deseja excluir o Produto?"
        };

        $scope.popoverConfirmacao = {
            "title": "Confirmação",
            "content": "Excluir?"
        };

  });
