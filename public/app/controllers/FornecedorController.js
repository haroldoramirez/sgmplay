angular.module('mercado')
.controller('FornecedorCreateController', function ($scope, $location, Fornecedor, Bairro, toastr){
          $scope.fornecedor = {};
          $scope.save = function(){
              console.log($scope.fornecedor);
              Fornecedor.save($scope.fornecedor, function(data){
                  toastr.success('Fornecedor salvo com sucesso');
                  $location.path('/fornecedores');
              }, function(data){
                  console.log(data);
                  toastr.error(data.statusText,'Não foi possível Salvar o Fornecedor');
              });
          };

          $scope.cancel = function(){
              $location.path('/fornecedores');
          };

          $scope.init = function(){
              Bairro.getAll(function(data){
                  $scope.bairros = data;
              });
          };

        $scope.modalAjuda = {
             "title": "Ajuda",
             "content": "Campos Obrigatórios em Vermelho"
        };

}).controller('FornecedorListController', function ($scope, Fornecedor, toastr){
          $scope.fornecedores = [];
          $scope.init = function(){
            Fornecedor.getAll(function(data){
              $scope.fornecedores = data;
            });
          };

          $scope.delete = function(id){
             Fornecedor.delete({id:id}, function(){
                 toastr.success('Fornecedor Removido com sucesso');
                 $scope.init();
             }, function(data){
                 toastr.error(data.statusText,'Não foi possível remover o Fornecedor');
             });
          };

}).controller('FornecedorDetailController', function ($scope, $routeParams, $location, Fornecedor, Bairro, toastr){

          $scope.init = function(){
             $scope.fornecedor = Fornecedor.get({id:$routeParams.id});
             $scope.bairro = Bairro.getAll();
          };

          $scope.update = function(){
              Fornecedor.update({id:$routeParams.id},$scope.fornecedor, function(){
                  toastr.success('Fornecedor atualizado com sucesso');
                  $location.path('/fornecedores');
              },function(){
                 toastr.error('Não foi possível Salvar o Fornecedor');
              });
          };

          $scope.cancel = function(){
              $location.path('/fornecedores');
          };

          $scope.delete = function(){
              Fornecedor.delete({id:$routeParams.id}, function(){
                  toastr.success('Fornecedor removido com sucesso');
                  $location.path('/fornecedores');
              }, function(data){
                  toastr.error(data.statusText,'Não foi possível remover o Fornecedor');
              });

          };

          $scope.modalAjuda = {
                "title": "Ajuda",
                "content": "Campos Obrigatórios em Vermelho"
          };

          $scope.confirmacaoModal = {
                "title": "Confirmação",
                "content": "Deseja excluir o Fornecedor?"
          };

          $scope.popoverConfirmacao = {
                "title": "Confirmação",
                "content": "Excluir?"
          };

});