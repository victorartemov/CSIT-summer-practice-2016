
angular.module('app').controller("CollectionCtrl", function($http, $location, $scope, CurrentStates, toastr ) {
    
    $http.get("/api/getAllStory").success(function(data) {
        $scope.stories=data;
    }).error(function() {
        $scope.stories = [];
    });

    
    $scope.tabs = [{
        title: 'Stories list',
        url: '/collection_list.html'
    }, {
        title: 'Story details',
        url: '/views/home.jsp'
    }];

    $scope.$on('closeEdit', function (event) {
        $scope.currentTab = $scope.tabs[1].url;
    });

    $scope.$on('changeView', function (event, args) {
        $scope.currentTab = args;

    });
    
    $scope.currentTab = $scope.tabs[0].url;


    $scope.openStory = function (index) {
        $scope.currentTab = $scope.tabs[1].url;
        CurrentStates.currentStory = $scope.stories[index];
        CurrentStates.currentStoryFragments = [$scope.stories[index].rootFragment];

    };

    
    



    $scope.createStory = function (index) {
        toastr.warning('Creating stories is not available')

    };
});
