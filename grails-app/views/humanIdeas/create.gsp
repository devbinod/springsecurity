<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'humanIdeas.label', default: 'HumanIdeas')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>

        <div class="container-fluid">
            <g:form action="save" controller="humanIdeas" method="post">

                <div class="row form-row">
                    <label>Title</label>
                    <input type="text" name="title" class="form-control"/>

                </div>



                <div class="row form-row">
                    <label>Idea</label>
                    <input type="text" name="idea" class="form-control"/>

                </div>
                <input type="submit" class="btn btn-success" name="Save" value="Save"/>
            </g:form>
        </div>

    </body>
</html>
