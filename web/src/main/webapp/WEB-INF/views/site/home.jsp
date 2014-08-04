<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="../resources/bootstrap-cosmo/3_1_1/css//bootstrap-responsive.css" rel="stylesheet">
<link href="../resources/bootstrap-cosmo/3_1_1/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="../resources/css/style.css" rel="stylesheet" media="screen">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <!- *********************************************************************
        BARRA DE NAVEAGAÇÃO
        *********************************************************************->
    <div class="navbar navbar-inverse">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Brand</a>
        </div>
        <div class="navbar-collapse collapse navbar-inverse-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Active</a></li>
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li class="dropdown-header">Dropdown header</li>
                        <li><a href="#">Separated link</a></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left">
                <input type="text" class="form-control col-lg-8" placeholder="Search">
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!- *********************************************************************
        BANNER COM CARROUSEL
        *********************************************************************->
    <div class="jumbotron">
        <div class="col-md-6">
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="..." alt="...">
                    <div class="carousel-caption">
                        ...
                    </div>
                </div>
                <div class="item">
                    <img src="..." alt="...">
                    <div class="carousel-caption">
                        ...
                    </div>
                </div>
                </div>
            </div>

            <!-- Controls -->
            <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
        </div>
    </div>
    <!- *********************************************************************
        CATEGORIAS DO LADO ESQUERDO
        *********************************************************************->
    <div class="row">

        <div class="col-md-2">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Cozinha</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>

            <div class="panel panel-success">
                <div class="panel-heading">
                    <h3 class="panel-title">Quarto</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>
        </div>
    <!- *********************************************************************
        EXIBIÇÃO DOS PRODUTOS
        *********************************************************************->
        <div class="col-md-8">
            <div class="row">
                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src="../resources/image/produto1.jpg" alt="..." id="produto">
                        <div class="caption">
                            <h4>Cortina Paris</h4>
                            <h1 align="center"><span class="label label-default">R$ 359,00</span></h1>
                            <h4 align="center"><span class="label label-danger">10 X R$ 35,90</span></h4>
                            <p>A melhor toalha de Santa Catarina</p>
                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                        </div>
                    </div>
                </div>

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src="../resources/image/produto2.jpg" alt="..." id="produto">
                        <div class="caption">
                            <h4>Toalhas de mesa</h4>
                            <h1 align="center"><span class="label label-default">R$ 50,00</span></h1>
                            <h4 align="center"><span class="label label-danger">2 X R$ 25,00</span></h4>
                            <p>A melhor toalha de Santa Catarina</p>
                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                        </div>
                    </div>
                </div>

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src="../resources/image/produto3.jpg" alt="..." id="produto">
                        <div class="caption">
                            <h4>Tapetes Mohamade</h4>
                            <h1 align="center"><span class="label label-default">R$ 1500,00</span></h1>
                            <h4 align="center"><span class="label label-danger">10 X R$ 150,00</span></h4>
                            <p>A melhor toalha de Santa Catarina</p>
                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src="../resources/image/produto4.jpg" alt="..." id="produto">
                        <div class="caption">
                            <h4>Toalhas Catarinense</h4>
                            <h1 align="center"><span class="label label-default">R$ 199,00</span></h1>
                            <h4 align="center"><span class="label label-danger">3 X R$ 100,00</span></h4>
                            <p>A melhor toalha de Santa Catarina</p>
                            <p><a href="#" class="btn btn-primary" role="button">Comprar</a></p>
                        </div>
                    </div>
                </div>
        </div>


        </div>
    <!- *********************************************************************
        CATEGORIAS DO LADO DIREITO
        *********************************************************************->
        <div class="col-md-2">
            <div class="panel panel-warning">
                <div class="panel-heading">
                    <h3 class="panel-title">Sala</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>
            <div class="panel panel-danger">
                <div class="panel-heading">
                    <h3 class="panel-title">Decoração</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>

            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">Praia</h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
            </div>
        </div>
    <!- *********************************************************************
        RODAPÉ
        *********************************************************************->
    </div>
 </div>
<script src="../resources/jquery/2_1_1/jquery-2.1.1.min.js"></script>
<script src="../resources/bootstrap-cosmo/3_1_1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.2.0/js/carousel.js"></script>
</body>
</html>