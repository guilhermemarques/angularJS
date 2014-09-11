'use strict';

angular.module('myApp').controller('MyController', function ($scope) {
   
    $scope.save = function() {
    	console.log($scope.name);
    };

 });