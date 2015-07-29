angular.module('mercado')
  .controller('ProdutoCreateController', function ($scope, $location, Produto, Fornecedor, Fabricante, Categoria, UnidadeDeMedida, toastr) {

    $scope.produto = {};

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

    $scope.save = function() {
        console.log($scope.produto);
        Produto.save($scope.produto, function(data){
            toastr.success('Produto Salvo com Sucesso');
            $location.path('/produtos');
        }, function(data){
            console.log(data);
            toastr.error(data.data,'Não foi possível Salvar');
        });
    };

    $scope.cancel = function(){
        $location.path('/produtos');
    };

  }).controller('ProdutoListController', function ($scope, Produto, toastr){

    $scope.produtos = [];

    $scope.init = function(){
    $scope.nomeFiltro = '';

      Produto.getAll(function(data){
        $scope.produtos = data;
        $scope.quantidade = $scope.produtos.length;
      });
    };

    $scope.busca = function() {

       if ($scope.nomeFiltro) {
            Produto.getFiltroProduto({filtro:$scope.nomeFiltro}, $scope.produto, function(data) {
                $scope.produtos = data;
            });
       } else {
            Produto.getAll(function(data) {
                $scope.produtos = data;
            });
       };
    };

  }).controller('ProdutoDetailController', function ($scope, $modal, $routeParams, $location, Produto, Fornecedor, Fabricante, Categoria, UnidadeDeMedida, toastr){

    $scope.init = function() {
        $scope.produto = Produto.get({id:$routeParams.id}, function(data) {
           $scope.fornecedores = Fornecedor.getAll();
           $scope.fabricantes = Fabricante.getAll();
           $scope.categorias = Categoria.getAll();
           $scope.unidadesdemedidas = UnidadeDeMedida.getAll();
        },function(data) {
            console.log(data);
            toastr.error(data.data);
        });
    };

    $scope.update = function(){
        Produto.update({id:$routeParams.id},$scope.produto, function(data){
            toastr.info('Produto Atualizado com Sucesso');
            $location.path('/produtos');
        },function(data){
           console.log(data);
           toastr.error(data.data,'Não foi possível Atualizar');
        });

      };

    $scope.cancel = function(){
        $location.path('/produtos');
    };

    $scope.delete = function(){
        Produto.delete({id:$routeParams.id}, function(data){
            toastr.warning('Produto Removido com Sucesso');
            $modalInstance.close();
            $location.path('/produtos');
        }, function(data){
        console.log(data);
            console.log(data);
            $modalInstance.close();
            toastr.error(data.data,'Não foi possível Remover');
        });

    };

    $scope.open = function (size) {

        $modalInstance = $modal.open({
              templateUrl: 'modalConfirmacao.html',
              controller: 'ProdutoDetailController',
              size: size,
        });
    };

    $scope.cancelModal = function () {
        $modalInstance.dismiss('cancelModal');
    };

  });
