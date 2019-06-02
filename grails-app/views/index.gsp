<!doctype html>
<html>
<head>
    <meta name="layout" content="userlayout"/>
    <title>Welcome to Grails</title>
</head>
<body>


<div class="container-fluid">

    <br/><br/><br/>
    <div class="row">
            <g:each in="${idealist}" var="i">
                <div class="col-xl-3 col-sm-6 mb-3">
                    <div class="card text-white bg-primary o-hidden h-100">
                        <div class="card-body">
                            <div class="card-body-icon">
                                <i class="fas fa-fw fa-comments"></i>
                            </div>
                            <div class="mr-5">${i?.title}</div>
                        </div>
                        <a class="card-footer text-white clearfix small z-1" href="#">
                            <span class="float-left">${i?.idea}</span>
                            <span class="float-right">
                                <i class="fas fa-angle-right"></i>
                            </span>
                        </a>
                    </div>
                </div>
            </g:each>

        </div>
    </div>

</div>

</body>
</html>
