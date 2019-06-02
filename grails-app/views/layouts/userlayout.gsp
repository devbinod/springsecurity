<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>
    <asset:stylesheet src="sb-admin.css"/>

    <g:layoutHead/>
</head>

<body>

<div id="page-top">
    <nav class="navbar navbar-expand navbar-dark bg-dark static-top">

        <a class="navbar-brand mr-1" href="index.html">Hamro Project</a>

        <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
            <i class="fas fa-bars"></i>
        </button>



        <!-- Navbar -->
        <ul class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
            <sec:ifNotLoggedIn>
                <a href="${createLink(controller: 'login' ,action: 'auth')}" class="btn btn-success">
                    Login
                </a>
            </sec:ifNotLoggedIn>
            <sec:ifLoggedIn>
                <a href="${createLink(controller: 'logout')}" class="btn btn-success">
                    Logout
                </a>
            </sec:ifLoggedIn>
        </ul>
    </nav>

</div>
<g:layoutBody/>
</body>
</html>