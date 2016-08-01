angular.module('auth', [ 'ngRoute' ]).config(function($routeProvider) {

    $routeProvider.when('/', {
        templateUrl : '/views/auth/loginForm.jsp'
    }).when('/signup', {
        templateUrl : '/views/auth/signup.jsp'
    }).
    otherwise({
        redirectTo: '/'
    });

});
