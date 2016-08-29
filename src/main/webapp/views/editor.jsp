 <div class="container" ng-controller="StoryView" ng-show="home.authenticated" ng-init="onEditorLoad()">
        <div class="panel panel-success">

            <div class="panel-body center-block" >

                <p>&nbsp;</p>
                <p></p>
                <div >
                <form class="form-horizontal" name="form">
                    <div class="form-group">
                        <label for="title" class="col-md-3 control-label">Title:</label>
                        <div class="col-md-6">
                            <input type="text" name="title" ng-model="title"  class="form-control" placeholder="Enter title of fragment" ng-required="true">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="text" class="col-md-3 control-label">Text:</label>
                        <div class="col-md-6">
                            <textarea class="form-control" name="text" ng-model="text" rows="4" placeholder="Enter text of fragment" ng-required="true"></textarea>
                        </div>
                    </div>


                    <div class="center-block">
                        <div class="btn-group">
                            <button ng-click="saveFragment(form.$valid, location.search().index)" type="submit" class="btn btn-success">Save</button>
                        </div>
                        <div class="btn-group">
                            <button ng-click="closeEditor()" type="button" class="btn btn-info">Cancel</button>
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
