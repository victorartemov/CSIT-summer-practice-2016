<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<section>
    <h3>{{home.famousStory.title}}</h3>
</section>

<div class="panel panel-info">

    <div class="panel-heading">
        <h4>{{home.famousStory.rootFragment.title}}</h4>
    </div>

    <p>&nbsp;</p>


    <div class="col-md-5 text-justify">
        {{home.famousStory.rootFragment.text}}
    </div>

    <div class="btn pull-right">
        <button class="btn btn-default"> Likes {{home.famousStory.rootFragment.likes.length}}</button>

    </div>
    <p>&nbsp;</p>


    <div class="text-center">
         <span class="btn-group">
             <button class="btn btn-danger"> Child 1 </button>
         </span>
         <span class="btn-group">
             <button class="btn btn-warning"> Child 2 </button>
         </span>
         <span class="btn-group">
             <button class="btn btn-primary"> Child 3 </button>
         </span>

    </div>

    <p>&nbsp;</p>

</div>


<div>Go to page <a href="editor">EDITOR</a>.</div>
