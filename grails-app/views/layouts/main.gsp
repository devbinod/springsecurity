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

<div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="index.html">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Dashboard</span>
            </a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="${createLink(controller: 'humanIdeas',action: 'index')}">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Idea List</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="tables.html">
                <i class="fas fa-fw fa-table"></i>
                <span>Tables</span></a>
        </li>
    </ul>

    <g:layoutBody/>
</div>



<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>
<asset:javascript src="sb-admin.js"/>
</body>
</html>
