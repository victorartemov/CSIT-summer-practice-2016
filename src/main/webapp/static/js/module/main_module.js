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
            }).when('/editor', {
                templateUrl : '/views/editor.jsp'
            }).

            otherwise({
                redirectTo: '/'
            });
            
        });