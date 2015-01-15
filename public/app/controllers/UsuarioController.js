angular.module('mercado')
  .controller('UsuarioCreateController', function ($scope, $modal, $location, Usuario, toastr) {
        $scope.usuario = {};
        $scope.save = function(){
            console.log($scope.usuario);
            Usuario.save($scope.usuario, function(data){
                toastr.success('Usuário salvo com sucesso');
                $location.path('/usuarios');
            }, function(data){
                console.log(data);
                toastr.error(data.data,'Não foi possível Salvar o Usuário');
            });
        };

        $scope.cancel = function(){
            $location.path('/usuarios');
        };

        $scope.init = function(){
            Usuario.getAll(function(data){
                $scope.usuarios = data;
            });
        };

  }).controller('UsuarioListController', function ($scope, Usuario, toastr){
        $scope.usuarios = [];
        $scope.init = function(){
          Usuario.getAll(function(data){
            $scope.usuarios = data;
          });
        };

        $scope.delete = function(id){
           Usuario.delete({id:id}, function(){
               toastr.success('Usuário removido com sucesso');
               $scope.init();
           }, function(data){
               toastr.error(data.data,'Não foi possível remover o Usuário');
           });
        };

  }).controller('UsuarioDetailController', function ($scope, $modal, $routeParams, $location, Usuario, toastr){

        $scope.init = function(){
            $scope.usuario = Usuario.get({id:$routeParams.id});
        };

        $scope.update = function(){
            Usuario.update({id:$routeParams.id},$scope.usuario, function(){
                toastr.success('Usuário atualizado com sucesso');
                $location.path('/usuarios');
            },function(){
               toastr.error('Não foi possível Salvar o Usuário');
            });

        };

         $scope.cancel = function(){
            $location.path('/usuarios');
         };

        $scope.delete = function(){
            Usuario.delete({id:$routeParams.id}, function(){
                toastr.success('Usuário removido com sucesso');
                $location.path('/usuarios');
            }, function(data){
            console.log(data);
                toastr.error(data.data,'Não foi possível remover o Usuário');
            });
        };

        $scope.confirmacaoModal = {
             "title": "Confirmação",
             "content": "Deseja excluir o Usuário?"
        };

        $scope.popoverConfirmacao = {
             "title": "Confirmação",
             "content": "Excluir?"
        };
  });