<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
    <nav class="btn-group btn-group-justified">
         <span class="btn-group">
            <a href="#/" class="btn btn-primary">
                HOME
            </a>
         </span>
         <span class="btn-group">
            <a href="#/collection" class="btn btn-primary">
                STORY COLLECTION
            </a>
         </span>
         <span class="btn-group">
            <a href="#/profile" class="btn btn-primary">
                MY PROFILE
            </a>
         </span>

         <span class="btn-group" ng-show="!home.authenticated">
                <a href="/login"  class="btn btn-primary">
                    LOG IN
                </a>
         </span>

         <span class="btn-group" ng-show="home.authenticated">
                <button ng-click="home.logout()" class="btn btn-primary">LOG OUT</button>
         </span>
    </nav>

    <div ng-show="home.authenticated">
        Logged in as: <span ng-bind="home.user"></span>
    </div>


</div>
