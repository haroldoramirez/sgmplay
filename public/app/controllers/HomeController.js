angular.module('mercado')
    .controller('HomeController', function ($scope, $location, $modal, $log) {

        $scope.modalInformacoes = {
            "title": "Informações",
            "content": ""
         };

         $scope.popoverInformacoes = {
           "title": "Informações",
           "content": "Sistema de Mercados Luana - Melhor Preços é Aqui!"
         };
    });