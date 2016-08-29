angular.module('app').controller("StoryView", function($http, $location, $scope, CurrentStates, toastr ) {
    if ($location.path() != '/collection') {

        if (CurrentStates.currentFamousStory == null) {
            $http.get("/api/getFamousStory").success(function (data) {
                $scope.currentStory = data;
                $scope.currentStoryFragments = [data.rootFragment];
                CurrentStates.currentFamousStoryFragments = $scope.currentStoryFragments;
                CurrentStates.currentFamousStory = $scope.currentStory;

            }).error(function () {
                self.famousStors = "{\"error\":\"400\"}";
            });
        } else  {
            $scope.currentStory = CurrentStates.currentFamousStory;
            $scope.currentStoryFragments = CurrentStates.currentFamousStoryFragments;
        }
    } else {
        $scope.currentStory = CurrentStates.currentStory;
        $scope.currentStoryFragments = CurrentStates.currentStoryFragments;

    }

    $scope.current_index = CurrentStates.currentEditIndex;
    $scope.openEditor = function (id) {
        if ($location.path() == '/collection') {
            CurrentStates.currentEditIndex = id;
            $scope.$emit('changeView', '/views/editor.jsp');
        } else {
            $location.path('/editor').search({index: id});
        }
    };

    $scope.closeEditor = function () {
        if ($location.path() == '/collection') {
            $scope.$emit('changeView', '/views/home.jsp');
        } else {
            $location.path('/');
        }
    };

    $scope.addFragment = function (data, index) {
        $scope.currentStoryFragments.splice(index + 1, Number.MAX_VALUE ,data);
        if ($location.path() == '/collection') {
            CurrentStates.currentStoryFragments = $scope.currentStoryFragments;
        } else {
            CurrentStates.currentFamousStoryFragments = $scope.currentStoryFragments;
        }
    };



    $scope.onEditorLoad = function () {
        $scope.title = '';
        $scope.text = '';

    };

    $scope.saveFragment = function (form_valid, index, id) {
        if (form_valid) {
            // use $.param jQuery function to serialize data from JSON
            var new_child = {
                title: $scope.title,
                text: $scope.text
            };

            if ($location.path() == '/collection') {
                index = $scope.current_index;
            }
            console.log(index);

            $scope.currentStoryFragments[index].childFragments.push(new_child);

            var data = $scope.currentStoryFragments[index];
            $http.post('/api/addChildFragment', data)
                .success(function (data) {
                    toastr.success('Новый фрагмент размещен');

                    $scope.addFragment(data, index - 1);
                    console.log("post");



                    if ($location.path() == '/collection') {
                        $scope.$emit('closeEdit');
                    } else {
                        $location.path("/");
                    }

                })
                .error(function (data) {
                    var response = "{\"error\":\"400\"}";
                });


        }
    };



});