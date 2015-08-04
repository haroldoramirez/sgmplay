angular.module('mercado')
  .controller('ContatoCreateController', function ($route, $scope, $modal, $location, Contato, toastr, $modalInstance) {
  
      $scope.contato = {};
  
      $scope.init = function() {
          Contato.getAll(function(data) {
              $scope.contatos = data;
          });
      };
  
      $scope.save = function() {
          console.log($scope.contato);
          Contato.save($scope.contato, function(data) {
              $scope.cancelModal();
              $route.reload();
              toastr.success('Contato Salvo com Sucesso');
          }, function(data) {
              console.log(data);
              $scope.cancelModal();
              toastr.error(data.data,'Não foi possível Salvar');
          });
      };

      $scope.cancelModal = function () {
          $modalInstance.dismiss('cancelModal');
      };

  }).controller('ContatoListController', function ($scope, Contato, toastr, $routeParams, $modal) {

        $scope.open = function (size) {

            $modalInstance = $modal.open({
                  templateUrl: 'modalCreate.html',
                  controller: 'ContatoCreateController',
                  size: size,
            });
        };

        $scope.cancelModal = function () {
            $modalInstance.dismiss('cancelModal');
        };
  
      $scope.contatos = [];
  
      $scope.init = function() {
          $scope.filtro = '';
  
          Contato.getAll(function(data) {
             $scope.contatos = data;
             $scope.quantidade = $scope.contatos.length;
          }, function(data) {
              console.log(data);
              toastr.error(data.data,'Não autorizado');
          });
      };
  
      $scope.busca = function() {
  
         if ($scope.filtro) {
              Contato.getFiltro({filtro:$scope.filtro}, $scope.contato, function(data) {
                  $scope.contatos = data;
              }, function(data) {
                   console.log(data);
                   toastr.error(data.data,'Não autorizado');
               });
         } else {
              Contato.getAll(function(data) {
                  $scope.contatos = data;
              });
         };
      };

  }).controller('ContatoDetailController', function ($scope, $modal, $routeParams, $location, Contato, toastr) {
  
      $scope.init = function() {
          $scope.contato = Contato.get({id:$routeParams.id});
      };
  
      $scope.init = function() {
          $scope.contato = Contato.get({id:$routeParams.id}, function(data) {
          },function(data) {
              console.log(data);
              toastr.error(data.data);
          });
      };
  
      $scope.update = function() {
          Contato.update({id:$routeParams.id}, $scope.contato, function(data) {
              toastr.info('Contato Atualizado com Sucesso');
              $location.path('/contatos');
          },function(data) {
             console.log(data);
             toastr.error(data.data,'Não foi possível Atualizar');
          });
      };
  
      $scope.delete = function() {
          Contato.delete({id:$routeParams.id}, function() {
              toastr.warning('Contato Removido com Sucesso');
              $modalInstance.close();
              $location.path('/contatos');
          }, function(data) {
              console.log(data);
              $modalInstance.close();
              toastr.error(data.data,'Não foi possível Remover');
          });
      };
  
      $scope.cancel = function() {
         $location.path('/contatos');
      };
  
      $scope.open = function (size) {
  
          $modalInstance = $modal.open({
                templateUrl: 'modalConfirmacao.html',
                controller: 'ContatoDetailController',
                size: size,
          });
      };
  
      $scope.cancelModal = function () {
          $modalInstance.dismiss('cancelModal');
      };

  });