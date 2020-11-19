var app = angular.module("app", ["ngResource"]);
 
app.controller("appController", function ($scope, $http, dataResource) {
    $http.get('http://localhost:8080/apirest/mensajes').success(function (data) {
        $scope.datos = data;
        $scope.texto ="Mensajes desde MongoDB";
    });
    $scope.datosResource = dataResource.get();
})
 

app.factory("dataResource", function ($resource) {
    return $resource("http://localhost:8080/apirest/mensajes",
        {},
        { get: { method: "GET", isArray: true }
    })
})