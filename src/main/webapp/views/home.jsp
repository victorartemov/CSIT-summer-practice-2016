<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<section>
    <h3>{{home.famousStory.title}}</h3>
</section>

<div class="panel panel-info" ng-repeat="fragment in home.famousStoryFragments"  ng-init="parentIndex = $index" >

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
             <button ng-click="home.addFragment(child, $parent.$index)" class="btn {{home.randomBtnStyle()}}"> {{child.title}}</button>
         </span>
         <span  ng-show="fragment.childFragments.length <= 2" >
             <a href="#/editor" class="btn {{home.randomBtnStyle()}}"> Add new fragment</a>
         </span>

    </div>

    <p>&nbsp;</p>

</div>
