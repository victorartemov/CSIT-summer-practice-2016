 <div class="container" ng-show="home.authenticated">
        <div class="panel panel-success">

            <div class="panel-body center-block" >

                <p>&nbsp;</p>
                <p></p>
                <div >
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="title" class="col-md-3 control-label">Title:</label>
                        <div class="col-md-6">
                            <input type="text" name="title" ng-model="home.title"  class="form-control" placeholder="Enter title of fragment">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="text" class="col-md-3 control-label">Text:</label>
                        <div class="col-md-6">
                            <textarea class="form-control" name="text" ng-model="home.text"   rows="4" placeholder="Enter text of fragment"></textarea>
                        </div>
                    </div>

                    <!--
                    <div class="form-group">
                        <label for="sequel1" class="col-md-3 control-label">Sequel 1:</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" placeholder="Enter title sequel of fragment">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="sequel2" class="col-md-3 control-label">Sequel 2:</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" placeholder="Enter title sequel of fragment">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="sequel3" class="col-md-3 control-label">Sequel 3:</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" placeholder="Enter title sequel of fragment">
                        </div>
                    </div>
                    -->
                    <div class="center-block">
                        <div class="btn-group">
                            <button ng-click="saveFragment(location.search().index)" type="button" class="btn btn-success">Save</button>
                        </div>
                        <div class="btn-group">
                            <a href="#/home" type="button" class="btn btn-info">Cancel</a>
                        </div>
                    </div>
                </form>

                <p>&nbsp;</p>
                <p></p>
                </div>
            </div>
        </div>
</div>

<div class="container" ng-show="!home.authenticated">
 You must log in to see your profile
</div>
