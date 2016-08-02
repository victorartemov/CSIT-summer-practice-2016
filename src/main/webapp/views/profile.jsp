<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div ng-show="home.authenticated">
    <h3>Profile</h3>
    <h4>Name: <span ng-bind="home.user"> </span> </h4>
    <h4>My stories fragments:</h4>
    <div>
        <div class="well">
            Кроме обычных, свойственных научной фантастике, вещей, в этой
            вселенной вполне спокойно уживаются с техническим прогрессом сверхъестественные:
            рыцари, магия, ведьмы, принцессы и причудливые виды, такие как эвоки, вуки и другие.
            <div class="btn pull-right">
                <a href="#" class="btn btn-default"> Likes 34</a>
            </div>
            <p>&nbsp;</p>

        </div>

        <div class="well">
            Эта история случилась давным-давно в далекой Галактике.
            Она давно завершилась. И уже ничего не изменишь. Это повесть о любви и потерях.
            <div class="btn pull-right">
                <a href="#" class="btn btn-default"> Likes 16</a>
            </div>
            <p>&nbsp;</p>

        </div>
    </div>

</div>


<div class="container" ng-show="!home.authenticated">
    You must log in to see your profile
</div>
