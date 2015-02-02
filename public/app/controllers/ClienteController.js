angular.module('mercado')
.controller('ClienteCreateController', function ($scope, $location, Cliente, Bairro, toastr){
          $scope.cliente = {};
          $scope.save = function(){
              console.log($scope.cliente);
              Cliente.save($scope.cliente, function(data){
                  toastr.success('Cliente salvo com sucesso');
                  $location.path('/clientes');
              }, function(data){
                  console.log(data);
                  toastr.error(data.data,'Não foi possível Salvar o Cliente');
              });
          };

          $scope.cancel = function(){
              $location.path('/clientes');
          };

          $scope.init = function(){
              Bairro.getAll(function(data){
                  $scope.bairros = data;
              });
          };

}).controller('ClienteListController', function ($scope, Cliente, toastr){
          $scope.clientes = [];
          $scope.init = function(){
            Cliente.getAll(function(data){
              $scope.clientes = data;
            });
            $scope.pagina = 0;
            updateActivedPage(this);
          };
          
          //botão de páginas
          $scope._pagina = function(val){
          $scope.pagina = val;
              Cliente.getPagina({pagina: $scope.pagina}, $scope.cliente, function(data){
                  $scope.clientes = data;
              });
              updateActivedPage(this);
          };

          //botão próximo
          $scope.proximo = function(val){
          $scope.pagina = val + 1;
              Cliente.getPagina({pagina: $scope.pagina}, $scope.cliente, function(data){
                  if (data.length===0) {
                      $scope.pagina = $scope.pagina - 1;
                  }else{
                      $scope.clientes = data;
                  };
              });
              updateActivedPage(this);
          }

          //botão anterior
          $scope.anterior = function(val){
          $scope.pagina = val - 1;
              Cliente.getPagina({pagina: $scope.pagina}, $scope.cliente, function(data){
                  $scope.clientes = data;
              });
              updateActivedPage(this);
          }

          //deletar opcional
          $scope.delete = function(id){
             Cliente.delete({id:id}, function(){
                 toastr.success('Cliente Removido com sucesso');
                 $scope.init();
             }, function(data){
                 toastr.error(data.data,'Não foi possível remover o Cliente');
             });
          };

}).controller('ClienteDetailController', function ($scope, $routeParams, $location, Cliente, Bairro, toastr){

          $scope.init = function(){
             $scope.cliente = Cliente.get({id:$routeParams.id});
             $scope.bairros = Bairro.getAll();
          };

          $scope.update = function(){
              Cliente.update({id:$routeParams.id},$scope.cliente, function(){
                  toastr.success('Cliente atualizado com sucesso');
                  $location.path('/clientes');
              },function(){
                 toastr.error('Não foi possível Salvar o Cliente');
              });
          };

          $scope.cancel = function(){
              $location.path('/clientes');
          };

          $scope.delete = function(){
              Cliente.delete({id:$routeParams.id}, function(){
                  toastr.success('Cliente removido com sucesso');
                  $location.path('/clientes');
              }, function(data){
                  toastr.error(data.data,'Não foi possível remover o Cliente');
              });

          };

          $scope.confirmacaoModal = {
                "title": "Confirmação",
                "content": "Deseja excluir o Cliente?"
          };

          $scope.popoverConfirmacao = {
                "title": "Confirmação",
                "content": "Excluir?"
          };

});
