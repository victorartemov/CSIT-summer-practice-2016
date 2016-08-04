<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container">
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
            <tr ng-repeat="story in home.stories">
                <td class="m-x-auto text-justify"> {{$index+1}} </td>
                <td class="m-x-auto text-justify"> {{story.title}}</td>
                <td class="m-x-auto text-justify"> {{story.rating}}</td>
            </tr>
        </tbody>
    </table>
    <div>
        <button class="btn"> Add New Story </button>
    </div>
</div>
