function updateActivedPage(scope) {
    window.scopePage = scope.pagina;
}

angular.module('mercado')
 .controller('BairroCreateController', function ($scope, $location, $modal, Bairro, Cidade, toastr){
          $scope.bairro = {};
          $scope.save = function(){
              console.log($scope.bairro);
              Bairro.save($scope.bairro, function(data){
                  toastr.success(data.data,'Bairro Salvo com Sucesso');
                  $location.path('/bairros');
              }, function(data){
                  console.log(data);
                  toastr.error(data.data,'Não foi possível Salvar o Bairro');
              });
          };

          $scope.cancel = function(){
              $location.path('/bairros');
          };

          $scope.init = function(){
              Cidade.getAll(function(data){
                  $scope.cidades = data;
              });
          };

 }).controller('BairroListController', function ($scope, Bairro, toastr){
           $scope.bairros = [];
           $scope.init = function(){
             Bairro.getAll(function(data){
                $scope.bairros = data;
             });
             $scope.pagina = 0;
             updateActivedPage(this);
           };
           
           //botão de páginas
           $scope._pagina = function(val){
           $scope.pagina = val;
               Bairro.getPagina({pagina: $scope.pagina}, $scope.bairro, function(data){
                   $scope.bairros = data;
               });
               updateActivedPage(this);
           };

           //botão próximo
           $scope.proximo = function(val){
           $scope.pagina = val + 1;
               Bairro.getPagina({pagina: $scope.pagina}, $scope.bairro, function(data){
                   if (data.length===0) {
                       $scope.pagina = $scope.pagina - 1;
                   }else{
                       $scope.bairros = data;
                           };
                       });
               updateActivedPage(this);
           }

           //botão anterior
           $scope.anterior = function(val){
           $scope.pagina = val - 1;
               Bairro.getPagina({pagina: $scope.pagina}, $scope.bairro, function(data){
                   $scope.bairros = data;
               });
               updateActivedPage(this);
           }

           //deletar opcional
           $scope.delete = function(id){
              Bairro.delete({id:id}, function(){
                  toastr.success('Bairro Removido com Sucesso');
                  $scope.init();
              }, function(data){
                  toastr.error(data.data,'Não foi possível Remover o Bairro');
              });
           };
 }).controller('BairroDetailController', function ($scope, $modal, $routeParams, $location, Bairro, Cidade, toastr){

           $scope.init = function(){
                 $scope.bairro = Bairro.get({id:$routeParams.id});
                 $scope.cidades = Cidade.getAll();
           };

           $scope.update = function(){
               Bairro.update({id:$routeParams.id},$scope.bairro, function(data){
                   toastr.success(data.data,'Bairro Atualizado com Sucesso');
                   $location.path('/bairros');
               },function(data){
                  toastr.error(data.data,'Não foi possível Atualizar o Bairro');
               });

           };

           $scope.cancel = function(){
               $location.path('/bairros');
           };

           $scope.delete = function(){
               Bairro.delete({id:$routeParams.id}, function(){
                   toastr.success('Bairro Removido com Sucesso');
                   $location.path('/bairros');
               }, function(data){
               console.log(data);
                   toastr.error(data.data,'Não foi possível remover o Bairro');
               });
           };

           $scope.confirmacaoModal = {
                "title": "Confirmação",
                "content": "Deseja excluir o Bairro?"
           };

          $scope.popoverConfirmacao = {
                "title": "Confirmação",
                "content": "Excluir?"
          };

 });
