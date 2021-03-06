<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div >
    <nav class="btn-group btn-group-justified">
         <span class="btn-group">
            <a href="#/" class="btn btn-default">
                HOME
            </a>
         </span>
         <span class="btn-group">
            <button ng_click="openCollection()" class="btn btn-default">
                STORY COLLECTION
            </button>
         </span>
         <span ng-show="home.authenticated" class="btn-group">
            <a href="#/profile" class="btn btn-default">
                MY PROFILE
            </a>
         </span>

         <span class="btn-group" ng-show="!home.authenticated">
                <a href="/login"  class="btn btn-default">
                    LOG IN
                </a>
         </span>

         <span class="btn-group" ng-show="home.authenticated">
                <button ng-click="home.logout()" class="btn btn-default">LOG OUT</button>
         </span>
    </nav>

    <div ng-show="home.authenticated">
        Logged in as: <span ng-bind="home.user"></span>
    </div>


</div>
