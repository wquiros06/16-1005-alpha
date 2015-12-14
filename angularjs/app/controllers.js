/*
Final Lab
*/
var uControllers = angular.module('uControllers', ['mgcrea.ngStrap']);

uControllers.controller("mainController", function($scope, $location) {
  $scope.menuClass = function(page) {
    var current = $location.path().substring(1);
    return page === current ? "active" : "";
  };
});

uControllers.controller('loginController', ['$scope','$location', 'UService','StorageService',
    function ($scope, $location, UService, StorageService) {
        $scope.isValidUserFood = function(myForm) {
			UService.isValidUserFood(myForm.myUserName, myForm.myPassword, function (error, data) {
				if (!error) {
					if(data != undefined){
						if(data == 'true'){
							StorageService.save('myDataObject', myForm);
							$location.path('/ingredients');
						}else{
							$location.path('/errorMessage');
						}
					}
					
				}
			});
		};
    }]);

uControllers.controller('userFoodsController', ['$scope', 'UService',
    function ($scope, UService) {
        $scope.data = {};

        UService.getAllUserFoods(function (error, data) {
            if (!error) {
                $scope.data.userFoods = data;
            }
        });
    }]);
	
uControllers.controller('userFoodInfoController', ['$scope', 'UService',
    function ($scope, UService) {
		$scope.data = {};
		
        $scope.searchUserByName = function(userFood) {
            UService.findByUserName(userFood.userFoodId, function (error, data) {
                if (!error) {
                     $scope.data.userFood = data;
                }
            });
        };
    }]);
	
	
uControllers.controller('ingredientsController', ['$scope', 'UService',
    function ($scope, UService) {
        $scope.data = {};

        UService.getAllIngredients(function (error, data) {
            if (!error) {
                $scope.data.ingredients = data;
            }
        });
    }]);