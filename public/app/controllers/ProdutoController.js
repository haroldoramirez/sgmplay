function updateActivedPage(scope) {
    window.scopePage = scope.pagina;
}

angular.module('mercado')
  .controller('ProdutoCreateController', function ($scope, $location, Produto, Fornecedor, Fabricante, Categoria, UnidadeDeMedida, toastr){
        $scope.produto = {};
        $scope.save = function(){
            console.log($scope.produto);
            Produto.save($scope.produto, function(data){
                toastr.success(data.data,'Produto Salvo com Sucesso');
                $location.path('/produtos');
            }, function(data){
                console.log(data);
                toastr.error(data.data,'Não foi possível Salvar o Produto');
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
          $scope.pagina = 0;
          updateActivedPage(this);
        };

        //botão de páginas
        $scope._pagina = function(val){
        $scope.pagina = val;
            Produto.getPagina({pagina: $scope.pagina}, $scope.produto, function(data){
                $scope.produtos = data;
            });
            updateActivedPage(this);
        };

        //botão próximo
        $scope.proximo = function(val){
        $scope.pagina = val + 1;
            Produto.getPagina({pagina: $scope.pagina}, $scope.produto, function(data){
                if (data.length===0) {
                    $scope.pagina = $scope.pagina - 1;
                }else{
                    $scope.produtos = data;
                };
            });
            updateActivedPage(this);
         }

        //botão anterior
        $scope.anterior = function(val){
        $scope.pagina = val - 1;
            Produto.getPagina({pagina: $scope.pagina}, $scope.produto, function(data){
                $scope.produtos = data;
            });
            updateActivedPage(this);
         }

        //deletar opcional
        $scope.delete = function(id){
           Produto.delete({id:id}, function(){
               toastr.success('Produto Removido com Sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível Remover o Produto');
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
            Produto.update({id:$routeParams.id},$scope.produto, function(data){
                toastr.success(data.data,'Produto Atualizado com Sucesso');
                $location.path('/produtos');
            },function(data){
               console.log(data);
               toastr.error(data.data,'Não foi possível Atualizar o Produto');
            });

          };

        $scope.cancel = function(){
            $location.path('/produtos');
        };

        $scope.delete = function(){
            Produto.delete({id:$routeParams.id}, function(){
                toastr.success('Produto Removido com Sucesso');
                $location.path('/produtos');
            }, function(data){
            console.log(data);
                console.log(data);
                toastr.error(data.data,'Não foi possível Remover o Produto');
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
