<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div ng-controller="StoryView">
    <section>
        <h3>{{currentStory.title}}</h3>
    </section>

    <div class="panel panel-info" ng-repeat="fragment in currentStoryFragments"  ng-init="parentIndex = $index" >

        <div class="panel-heading">
            <h4>{{fragment.title}}</h4>
        </div>

        <p>&nbsp;</p>


        <div class="m-x-auto text-justify" style="padding-right: 2%; padding-left: 2%;" >
            {{fragment.text}}
        </div>

        <div class="btn pull-right">
            <button class="btn btn-default"> Likes {{fragment.likes.length}}</button>

        </div>
        <p>&nbsp;</p>


        <div class="text-center">
             <span  ng-repeat="child in fragment.childFragments" >
                 <button ng-click="addFragment(child, $parent.$index)" class="btn btn-primary"> {{child.title}}</button>
             </span>
             <span  ng-show="currentStoryFragments[parentIndex].childFragments.length <= 2 && home.authenticated" >
                 <button ng-click="openEditor(parentIndex)" class="btn btn-danger"> Add new fragment</button>
             </span>
        </div>
        <p>&nbsp;</p>

    </div>
</div>