var app = angular.module("app", ["ngResource"]);
 
app.controller("appController", function ($scope, $http, dataResource) {
    $http.get('http://localhost:8080/apirest/visitantes').success(function (data) {
        $scope.datos = data;
        $scope.texto = "Visitantes";
    });
    $scope.datosResource = dataResource.get();
})

app.config(function($routeProvider){
 $routeProvider.when("/home", {
 templateUrl : "/home.html"
 })
 .when("/add", {
 title: 'Añadir usuario',
 templateUrl : "/add_visitante.html",
 controller : "addController"
 })
 .when("/edit/:id", {
 title: 'Editar visitante',
 templateUrl : "/edit_visitante.html",
 controller : "editController"
 })
 .when("/remove/:id", {
 title: 'Eliminar visitante',
 templateUrl : "/remove_visitante.html",
 controller : "removeController"
 })
 .otherwise({ redirectTo : "/home"})
})



app.factory("dataResource", function ($resource) {
    return $resource("http://localhost:8080/apirest/visitantes",
        {},
        { get: { method: "GET", isArray: true }
    })
})