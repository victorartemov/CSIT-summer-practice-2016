/**
 * Created by Aleksandr on 7/27/2016.
 */
angular.module("app", ['ngRoute', 'ngAnimate', 'toastr'])
    .config(
        function($httpProvider, $routeProvider, toastrConfig) {

            angular.extend(toastrConfig, {
                autoDismiss: false,
                containerId: 'toast-container',
                maxOpened: 0,
                newestOnTop: true,
                positionClass: 'toast-bottom-right',
                preventDuplicates: false,
                preventOpenDuplicates: false,
                target: 'body'
            });


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