<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <div class="panel panel-warning">
        <div class="panel-heading">
            <h2>Registration</h2>
        </div>
        <div class="panel-body text-center" >

            <p>&nbsp;</p>
            <p></p>

            <form  class="form-inline"  name="form" >
                <div><label> Username <input class="form-control" type="text" ng-model="username" ng-required="true" /> </label></div>
                <div><label> Password <input class="form-control" type="password" ng-model="pass" ng-required="true" /> </label></div>
                <div><label> PassRepeat <input class="form-control" type="password" ng-model="pass_one" ng-required="true" /> </label></div>

                <div class="col-sm-offset-3 col-sm-10">
                    <input type="submit" ng-click="signUp(form.$valid)" class="btn btn-success" value="Sign Up"/>
                </div>

                <div><input type="hidden" name="referrer" value="${param.referrer}" /></div>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>



            <p>&nbsp;</p>
            <p></p>

            <div >
                <a href="/login#/">Already Have an Account? - Sign In</a>
            </div>
        </div>

        <div class="panel-footer">© 2016 Epam's Summer Practice Team.</div>
    </div>


</div>
