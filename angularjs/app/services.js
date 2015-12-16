/*
Final Lab
*/
var uServices = angular.module('uServices', ['ngResource']);
		
uServices.factory('UService', function ($http) {
		/*User Foods URLs*/
		var srvUFGet = 'http://localhost:8080/services/api/userFoods';
		var srvUFisValidUserFood = 'http://localhost:8080/services/api/userFoods/isValidUserFood';
		var srvUFfindByUserName ='http://localhost:8080/services/api/userFoods/findByUserName';
		
		/*Ingredient URLs*/
		var srvIGet = 'http://localhost:8080/services/api/ingredients';
		var srvIfindByName = 'http://localhost:8080/services/api/ingredients/findByName';
		var srvIngredientCreate = 'http://localhost:8080/services/api/ingredients/create';
		var srvIngredientDelete = 'http://localhost:8080/services/api/ingredients/delete';
		var srvIngredientUpdate = 'http://localhost:8080/services/api/ingredients/update';
	
        return {
			/*User Food services*/
			getAllUserFoods: function(callback){
				$http.get(srvUFGet)
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
			},
			isValidUserFood: function(user, pass, callback){
				 $http.get(srvUFisValidUserFood, { params: { userName: user, password: pass } })
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
			},
			findByUserName: function(query, callback) {
                $http.get(srvUFfindByUserName, { params: { name: query} })
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
            },
			
			/*Ingredient services*/
			getAllIngredients:function(callback){
				$http.get(srvIGet)
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
			},
			findIngredientByName:function(query, callback) {
                $http.get(srvIfindByName, { params: { name: query} })
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
            },
			createIngredient:function(query, callback) {
                $http.post(srvIngredientCreate, { params: { name: query} })
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
            },
			deleteIngredient: function(query, callback) {
                $http.POST(srvIngredientDelete, { params: { id: query} })
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
            },
			updateIngredient: function(id,name, callback) {
                $http.POST(srvIngredientUpdate, { params: { id: id, name: name} })
                    .success(function (data) {
                        callback(null, data);
                    })
                    .error(function (e) {
                        callback(e);
                    });
            }
        }
	}
);

uServices.factory('StorageService', function StorageService($window) {
    return {
        get: function (key) {
            var data = angular.fromJson($window.sessionStorage.getItem(key));

            return data;
        },

        save: function (key, dataToSave) {
            var dataToSaveInJson = angular.toJson(dataToSave);

            return $window.sessionStorage.setItem(key, dataToSaveInJson);
        },

        remove: function(key) {
            return $window.sessionStorage.removeItem(key);
        },

        clear: function () {
            $window.sessionStorage.clear();
        }
    }
});
