<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div ng-controller="CollectionCtrl">
    <div  style="padding-top: 1%;" ng-include="currentTab"></div>
</div>

<script type="text/ng-template" id="/collection_list.html">

<div class="container-fluid">
    <div>
        <h2>Collection of Stories</h2>
    </div>
    <table class="table">
        <thead>
            <tr>
                <th>#</th>
                <th>Name Story</th>
                <th>Rating</th>
            </tr>
        </thead>
        <tbody>
            <tr ng-click="openStory($index)" ng-repeat="story in stories">
                <td class="m-x-auto text-justify"> {{$index+1}} </td>
                <td class="m-x-auto text-justify"> {{story.title}}</td>
                <td class="m-x-auto text-justify"> {{story.rating}}</td>
            </tr>
        </tbody>
    </table>
    <div>
        <button ng-click="createStory()" class="btn"> Add New Story </button>
    </div>
</div>
</script>
