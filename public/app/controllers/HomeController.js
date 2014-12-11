angular.module('mercado')
    .controller('HomeController', function ($scope, $location, $popover, $modal, $log) {

        $scope.modalInformacoes = {
            "title": "Informações",
            "content": ""
         };

         $scope.popoverInformacoes = {
           "title": "Informações",
           "content": "Sistema de Mercados Luana - Melhor Preços é Aqui"
         };
    });