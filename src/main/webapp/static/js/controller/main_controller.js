
angular.module('app').service('CurrentStates', function($http) {
    this.currentStory = null;
    this.currentStoryFragments = null;
    this.currentFamousStory = null;
    this.currentFamousStoryFragments = null;
    this.currentEditIndex = 0;

});


angular.module('app').controller("home", function($http, $location, $scope, $route, CurrentStates ) {

    var self = this;

    $scope.location = $location;

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


    $scope.openCollection = function (index) {
        if ($location.path() == '/collection') {
            $route.reload();
        } else {
            $location.path('/collection');
        }
    };
        //////////////////////////////////////////////////////////////////////////////////
    self.logout = function() {
        $http.post('logout', {}).success(function() {
            self.authenticated = false;
            $location.path("/");
        }).error(function(data) {
            console.log("Logout failed")
            self.authenticated = false;
        });
    };
});


