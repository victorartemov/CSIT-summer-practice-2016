/**
 * Created by Aleksandr on 7/27/2016.
 */
angular.module("app", ['ngRoute'])
    .config(
        function($httpProvider, $routeProvider) {
            $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

            $routeProvider.when('/', {
                templateUrl : '/views/home.jsp'
            }).when('/collection', {
                templateUrl : '/views/collection.jsp'
            }).when('/profile', {
                templateUrl : '/views/profile.jsp'
            }).
            otherwise({
                redirectTo: '/'
            });
            
        }).controller("home", function($http, $location) {
    var self = this;
    $http.get("/user").success(function(data) {
        if (data.name) {
            self.user = data.name;
            self.authenticated = true;
        } else {
            self.user = "N/A";
            self.authenticated = false;
        }
    }).error(function() {
        self.user = "N/A";
        self.authenticated = false;
    });


    $http.get("/api/getFamousStory").success(function(data) {
        self.famousStory = data;
    }).error(function() {
        self.famousStory = "{\"error\":\"400\"}";

    });

    
    self.logout = function() {
        $http.post('logout', {}).success(function() {
            self.authenticated = false;
            $location.path("/");
        }).error(function(data) {
            console.log("Logout failed")
            self.authenticated = false;
        });
    };



    $http.get("/api/getFamousStory").success(function(data) {
        self.famousStory = data;
    }).error(function() {
        self.famousStory = "{\"error\":\"400\"}";

    });




});