var dicApp = angular.module('dicApp', [
  'ngRoute',
  'uControllers',
  'uServices'
]);

dicApp.config(['$routeProvider','$locationProvider',
  function ($routeProvider, $locationProvider) {
	  $locationProvider.hashPrefix('!');
      $routeProvider.
        when('/login', {
          templateUrl: 'app/views/login.html',
          controller: 'loginController'
        }).
        when('/userFoods', {
            templateUrl: 'app/views/userFoods.html',
            controller: 'userFoodsController'
        }).
		when('/userFoodInfo', {
          templateUrl: 'app/views/user_food_info.html',
          controller: 'userFoodInfoController'
        }).
		when('/errorMessage', {
          templateUrl: 'app/views/error.html',
          controller: 'errorMessageController'
        }).
		when('/ingredients', {
          templateUrl: 'app/views/ingredients.html',
          controller: 'ingredientsController'
        }).
               when('/addIngredients', {
                    templateUrl: 'app/views/addIngredients.html',
                    controller: 'AddIngredientController'
                    }).
        otherwise({
            redirectTo: '/login'
        });
  }]);