<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <div class="panel panel-warning">
        <div class="panel-heading">
            <h2>Registration</h2>
        </div>
        <div class="panel-body text-center" >

            <p>&nbsp;</p>
            <p></p>

            <form  method="post" class="form-inline" >
                <div><label> Username <input class="form-control" type="text" name="username" required="required" /> </label></div>
                <div><label> Password <input class="form-control" type="password" name="password" required="required" /> </label></div>
                <div><label> PassRepeat <input class="form-control" type="password" name="password" required="required" /> </label></div>

                <div class="col-sm-offset-3 col-sm-10">
                    <input type="submit" class="btn btn-success" value="Sign Up"/>
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
