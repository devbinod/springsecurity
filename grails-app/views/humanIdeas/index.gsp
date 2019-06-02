<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'humanIdeas.label', default: 'HumanIdeas')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>


        <div class="container-fluid">

            <div class="row">
                <a href="${createLink(controller: 'humanIdeas',action:'create')}" class="btn btn-success">Create </a>

            </div>

            <table class="table table-bordered table-hover">
                <tr>
                    <td>title</td>
                    <td>Idea</td>
                    <td>Action</td>

                </tr>
                <g:each in="${ideaList}" var="i">

                    <tr>
                        <td>${i?.title}</td>
                        <td>${i?.idea}</td>
                        <sec:ifAnyGranted roles="ROLE_ADMIN">
                            <td>
                                <a href="${createLink(controller: 'humanIdeas', action: 'publish',params: [id: i?.id])}" class="btn btn-success">Publish</a>

                            </td>
                        </sec:ifAnyGranted>

                    </tr>


                </g:each>

            </table>
        </div>

    </body>
</html>