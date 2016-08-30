angular.module('auth', [ 'ngRoute', 'ngAnimate', 'toastr']).config(function($routeProvider, toastrConfig) {

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

    $routeProvider.when('/', {
        templateUrl : '/views/auth/loginForm.jsp'
    }).when('/signup', {
        templateUrl : '/views/auth/signup.jsp'
    }).
    otherwise({
        redirectTo: '/'
    });

});


angular.module('auth').controller("auth_controller", function($http, $location, $scope, toastr ) {
     $scope.signUp = function (valid) {
         if (valid) {
             if (this.pass == this.pass_one) {

                 var my_form = {
                     fullName: this.username,
                     login: this.username,
                     password: this.pass
                 };

                 console.log(my_form);
                 $http.post('/signup', my_form).success(function(data) {
                     if (data.code == 0) {
                         toastr.success('New user was created')
                         $location.path('/');
                     } else {
                         toastr.error('Something went wrong')

                     }
                 }).error(function() {
                     toastr.error('Something went wrong')

                 });

             } else {
                 toastr.error('Password fields should be equal')
             }
         }
     };
});