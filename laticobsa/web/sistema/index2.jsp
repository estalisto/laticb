<%-- 
    Document   : roles
    Created on : 27-feb-2017, 11:50:46
    Author     : CIMA2015
--%>

<%
    String Sidentificacion = "", id_empresa = "", USER_SESION="", NomEmpleados="",ApellidosEmpleados="",IdEmpleado="",RolEmpleado="", nom_empresa="",NivelAccesoRol="";
    HttpSession sesion = request.getSession(true);
    
    try {
     if (sesion.getAttribute("SstrUsuarioRol")== null && sesion.getAttribute("Sstrempresa")==null && sesion.getAttribute("SstrUSER")== null){
                  
                  sesion.invalidate();
                  response.sendRedirect("login.jsp");
              //out.print("<script>location.replace('login.jsp');<script>");
              return;
        }else {
        Sidentificacion = sesion.getAttribute("SstrUsuarioRol").toString();
        id_empresa = sesion.getAttribute("Sstrempresa").toString();
        nom_empresa = sesion.getAttribute("SstrNomEmpresa").toString();
        USER_SESION= sesion.getAttribute("SstrUSER").toString();
        IdEmpleado = sesion.getAttribute("SstrIdEmpleado").toString();
        NomEmpleados = sesion.getAttribute("SstrNombresEmpleado").toString();
        ApellidosEmpleados = sesion.getAttribute("SstrApellidosEmpleado").toString();
        RolEmpleado = sesion.getAttribute("SstrRolEmpleado").toString();
         NivelAccesoRol = sesion.getAttribute("NivelAccesoRolID").toString();
        
        }
        
    } catch (Exception e) {
        Sidentificacion = "000";
       response.sendRedirect("/laticobsa/login"); 
    }
%>



<%@page import="com.laticobsa.modelo.LcUsuarios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.laticobsa.servicios.ValidaUsuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="com.laticobsa.servicios.ModulosRoles"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.laticobsa.modelo.LcModuloRol"%>
<%@page import="java.util.List"%>
<%@page import="com.laticobsa.servicios.DashcboardOk"%>



    <!DOCTYPE html>
<html>
<head>
     <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">

  <title>LatiCobsa S.A.</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="icon" type="image/png" href="dist/img/favicon.png"/>

  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- jvectormap 
  <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">-->
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
  <!--link href="dist/css/bootstrap-datepicker.css" rel="stylesheet" /
  <link href="plugins/datepicker/bootstrap-datepicker.css" rel="stylesheet" /> --> 
    <link rel="stylesheet" href="dist/css/jquery.datetimepicker.css">  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  </head>
  <style type="text/css">
    input {
        border-radius: 12px 12px 12px 12px;
-moz-border-radius: 12px 12px 12px 12px;
-webkit-border-radius: 12px 12px 12px 12px;
border: 0px groove #000000;
     }
</style>
<body class="hold-transition skin-yellow sidebar-mini">
<div class="wrapper" id="midashboard">

  <header class="main-header">

    <!-- Logo -->
    <a href="home" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b><%=nom_empresa.substring(0, 1)%></b><%=nom_empresa.substring(1, 4)%></span>
      <!-- logo for regular state and mobile devices  str.substring(0, 3) -->
      <span class="logo-lg"><b></b><%=nom_empresa%></span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
          <!--li class="header" style="color:#ffffff; size: A4"><strong>Empresa:</strong></li-->
          <!-- Notifications: style can be found in dropdown.less -->
          <li class="dropdown notifications-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-danger" id="num_notificaciones"></span>
            </a>
            <ul class="dropdown-menu">
              <li class="header" id="titulo_notificaciones"></li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu" id="menu_notificaciones">
                  
                </ul>
              </li>
              <li class="footer"><a href="#">Ver todas las Notificaciones</a></li>
            </ul>
          </li>

          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="dist/img/logolaticobsa.png" class="user-image" alt="User Image">
              <span class="hidden-xs">Usuario:<strong>  <%=NomEmpleados%> <%=ApellidosEmpleados%> </strong></span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="dist/img/logolaticobsa.png" class="img-circle" alt="User Image">
                <input value="<%=Sidentificacion%>" id="IDUserRol" hidden>
                <p>
                  <strong> <%=NomEmpleados%> <%=ApellidosEmpleados%> </strong>                   
                  <small><strong><%=nom_empresa%> - <%=RolEmpleado.toUpperCase()%></strong></small>
                  <input type="text" id="id_empleado" value="<%=IdEmpleado %>" hidden=""/>
                  <input type="text" id="rol_empleado" value="<%=RolEmpleado.toUpperCase()%>" hidden=""/>
                  
                </p>
              </li>
              
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Perfil</a>
                </div>
                <div class="pull-right">
                  <a href="#" onclick="ConfiemaSalidaSistema();" class="btn btn-default btn-flat">Salir</a>
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button 
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>-->
        </ul>
      </div>

    </nav>
  </header>
 <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <!-- /.sidebar -->
    <input type="text" value="N" id="bandera_consulta_ascy" hidden/>
<section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="dist/img/logolaticobsa.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p><%=USER_SESION%></p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->

      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">Menu de Navegación</li>
        
        <% Integer nivelPadre=0; 
           Integer contador=0;
           contador++;
           
           Integer RolID, EmpresaID;
           Integer rol=0, empresa=0;
           //empresa = sesion.getAttribute("strempresa"); 
           //rol = session.getAttribute("strUsuarioRol"); 
           // valida usuario -> rol-> modulos
           RolID =  Integer.parseInt(Sidentificacion);//Admin
           EmpresaID= Integer.parseInt(id_empresa);
           ModulosRoles mr = new ModulosRoles();
            List<LcModuloRol> modulos = mr.getLcModulosRoles(RolID,EmpresaID);
            List<LcModuloRol> modulos2 = mr.getLcModulosRolesROL(RolID,EmpresaID);
           
           for(int i=0; i< modulos.size(); i++) {
                if(modulos.get(i).getNivelModulo().equals(nivelPadre))
                {
                    %>
                        <li class="treeview">
                        <a href="#">
                            <i class="fa fa-cog"></i> <span><%=modulos.get(i).getLcModulos().getMenuOpciones() %></span>
                          <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                          </span>
                        </a>
                        <ul class="treeview-menu">
                            <%
                            for(int j=0; j< modulos2.size(); j++) {
                             if(modulos2.get(j).getNivelModulo().equals(modulos.get(i).getGrupoMod()))
                                {
                                %>
                                <li class=""><a href="#" onclick="<%=modulos2.get(j).getLcModulos().getFunciones() %>" ><i class="fa fa-circle-o text-yellow"></i> <%=modulos2.get(j).getLcModulos().getMenuOpciones() %></a></li>
                                <% 
                                }
                            }
                            %>
                        </ul>
                      </li>
           <%
                }
             contador++;  
           }
           %>
           
       
      </ul>
    </section>

  
  </aside>
  <div  id="mensajeSalida"></div>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
      <div id="page-wrapper" > 
          <br>
          <div class="row">
              <div class="col-lg-12 thumbnail well">                                                  
                                    <div class="thumbnail">
                                        <form action="home" method="POST">
                                        <div class="row">
                                            <div class="col-lg-4"hidden>
                                                <div class="input-group input-group-sm" >
                                                    <span class="input-group-addon" id="acc">Empleados:</span>
                                                    <input name="accion" id="accion" value="consulta" />
                                                  </div>
                                                
                                            </div>
                                            
                                            <div class="col-lg-4">
                                                <div class="input-group input-group-sm" >
                                                    <span class="input-group-addon" id="sizing-addon3">Empleados:</span>
                                                    <select class="form-control input-sm" name="s_empleado"  id="s_empleado">                                          
                                                    </select>
                                                  </div>
                                                
                                            </div>
                                            <div class="col-lg-4">
                                                <div class="input-group input-group-sm">
                                                    <span class="input-group-addon" id="sizing-addon3">Carteras: </span>
                                                    <select class="form-control  input-sm" name="s_cliente" id="s_cliente">                                         
                                                    </select>
                                                  </div>                                                
                                            </div>
                                            <div class="col-lg-3 " >
                                                 <div class="input-group input-group-sm ">
                                                    <span class="input-group-addon">Fecha:</span>
                                                    <input type="text" class="form-control" placeholder="YYYY-MM-DD" aria-describedby="sizing-addon3" name="fecha_cons" id="fecha_cons">
                                                  </div>
                                            </div>
                                            <div class="col-lg-1">
                                                <button type="submit" class="btn btn-success"> Consultar </button>
                                                <!--a type="button" class="btn btn-success" onclick="gestiones_diarias()"
                                                <a href="#" onclick="gestiones_diarias();" class="btn btn-success">Consultar</a>-->
                                            </div>
                                            
                                        </div>
                                      </form>
                                          <div id="container4" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

                                    </div>
                                  </div>
              
          </div>
          
          
                   
               <%
                        if (RolEmpleado.toUpperCase().equals("OPERADOR")){
                            %>
                            <form class="well">
                                <!--div class="row">

                                  <div class="col-lg-4">
                                    <div class="thumbnail">  

                                              <div id="piechart"></div>

                                      </div>

                                  </div>
                                  <div class="col-lg-4">
                                    <div class="thumbnail">

                                            <div id="piechart2"></div>

                                      </div>
                                  </div>
                                  <div class="col-lg-4">
                                    <div class="thumbnail">

                                            <div id="columnchart_material"></div>

                                      </div>
                                  </div>
                                </div-->

                              <!--div class="row">  
                                <div class="col-lg-8">                                                  
                                    <div class="thumbnail">


                                          <div id="container3" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

                                    </div>
                                  </div>
                                </div-->
                              <div class="row">
                                  
                                    <div class="col-lg-4">
                                                  <!--div class="row">

                                                      <div class="col-lg-6">
                                                        <div class="form-group">
                                                           <label for="sel1">Periodo:</label>
                                                           <select class="form-control" id="sel1">
                                                             <option>All</option>
                                                             <option>Enero</option>
                                                             <option>Febrero</option>
                                                             <option>Marzo</option>
                                                             <option>Abril</option>
                                                             <option>Mayo</option>
                                                             <option>Junio</option>
                                                             <option>Julio</option>
                                                             <option>Agosto</option>
                                                             <option>Septiembre</option>
                                                             <option>Octubre</option>
                                                             <option>Noviembre</option>
                                                             <option>Diciembre</option>
                                                           </select>
                                                         </div>
                                                      </div>
                                                  </div

                                                <div class="thumbnail">


                                                        <div id="container2" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
                                                        <button class="btn btn-default">Reporte</button>
                                                  </div>-->
                                                  <div class="thumbnail">


                                                        <div id="container3" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
                                                        <!--button class="btn btn-default">Reporte</button-->
                                                  </div>
                                      </div>
                                </div>
           
          
                        </form> 

                            <%

                          }
                        %>
                  
                         
      </div>
         
      
      
      
  </div>
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.1.0
    </div>
        <strong> <a href="http://laticobsa.com">Laticobsa S.A. </a>&copy; 2017. </strong>  Laticobsa - Todos los derechos reservados.

  </footer>

 
  <div class="control-sidebar-bg"></div>
  <div  id="mensajeSalida"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>    
<!-- Bootstrap 3.3.6 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- DataTables -->
  
<script src="plugins/datatables/jquery.dataTables.min.js"></script>
<script src="plugins/datatables/dataTables.bootstrap.min.js"></script>
<!-- 
<script src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap4.min.js"></script> -->


<!--datapicker
<script src="bootstrap/js/bootstrap-datepicker.js"></script>-->
<!-- SlimScroll -->
<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/app.min.js"></script>

<script src="dist/js/menu.js"></script>

<!-- AdminLTE for demo purposes -->
<script src="dist/js/demo.js"></script>

<!-- page script -->
<!--script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script-->
<script type="text/javascript" src="plugins/gstatic/graficos.js"></script>
<script src="dist/plugins/jquery.maskedinput.min.js" type="text/javascript"></script>

<script src="dist/js/jquery.datetimepicker.full.js"></script>


<script src="dist/code/highcharts.js"></script>
<script src="dist/code/modules/exporting.js"></script>

<%DashcboardOk gfc=new DashcboardOk();%>
    <!--script type="text/javascript">
        
      google.charts.load('current', {'packages':['corechart','bar']});
      google.charts.setOnLoadCallback(drawChart);
      google.charts.setOnLoadCallback(drawChart2);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Meses', 'Compromisos de Pago'],           
              <%=gfc.ObtenerCompromisosPagos()%>
           ]);
        var options = {
           title: 'Compromisos de Pagos'
        };
        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(data, options);
      }
      function drawChart2() {
        var data = google.visualization.arrayToDataTable([
          ['Task', 'Hours per Day'],
          ['Work',     5],         
          ['Sleep',    9]
        ]);
        var options = {
          title: 'My Daily Activities'
        };
        var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));
        chart2.draw(data, options);
      }
    
     
      google.charts.setOnLoadCallback(drawChart3);
      function drawChart3() {
        var data = google.visualization.arrayToDataTable([
          ['','Gestiones'],           
             <%=gfc.ObtenerGestiones()%> 
          ]);
/*
          ['2014', 1000, 400, 200],
          ['2015', 1170, 460, 250],
          ['2016', 660, 1120, 300],
          ['2017', 1030, 540, 350]*/
        var options = {
          chart: {
            title: 'Gestiones Realizadas por mes',
            
          }
        };
        var chart = new google.charts.Bar(document.getElementById('columnchart_material'));
        chart.draw(data, google.charts.Bar.convertOptions(options));
      }
    </script-->
    
<script type="text/javascript">

   /* Highcharts.chart('container2', {
        chart: {
            type: 'column'
        },
        title: {
            text: 'Gestiones Realizadas'
        },
        subtitle: {
            text: 'Seis ultimos Periodos'
        },
        xAxis: {
            categories: [
                'Jan',
                'Feb',
                'Mar',
                'Apr',
                'May'

            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Transacciones (u)'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} U</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            name: 'Pvillota',
            data: [20, 56, 0, 129.2, 144.0]

        }, {
            name: 'eharo',
            data: [83.6, 78.8, 98.5, 93.4, 106.0]

        }, {
            name: 'London',
            data: [48.9, 38.8, 39.3, 41.4, 1]

        }, {
            name: 'Berlin',
            data: [42.4, 2, 34.5, 39.7, 52.6]

        }]
    });*/
   
       
       <%=gfc.ObtenerGestionmesesHist(IdEmpleado)%>

</script>  

     <script src="dist/js/jquery.datetimepicker.full.js"></script>
     <script>
         $('#fecha_cons').datetimepicker({   format:'Y-m-d' }); 
         consultaMisClientes();
         function consultaMisClientes(){
             
             var IDUserRol = $("#IDUserRol").val();
    document.getElementById("s_cliente").innerHTML="";
    console.log("IDUserRol"+IDUserRol);
     if(IDUserRol==="72" || IDUserRol==="7" || IDUserRol==="12"){
            $("#s_cliente").append($("<option>",{value:"0",text:"Seleccione la cartera"}));
     }
    //  $("#cartera").append($("<option>",{value:"0",text:"Seleccione el cliente"}));
     $.getJSON("consultacartera", {"accion" : "ClientesPorRol"}, function(result){
          $.each(result.listaClientes, function(key, val){   
           $("#s_cliente").append($("<option>",{value:val.id_cliente,text:val.razon_social}));
           //var valor_select = val.razon_social;
          // alert(valor_select);
       
          });
    });  
    
}

//empleados
consultaMisEmpleados();
function consultaMisEmpleados(){
             
   var IDUserRol = $("#IDUserRol").val();
    document.getElementById("s_empleado").innerHTML="";
    console.log("IDUserRol"+IDUserRol);
    if(IDUserRol==="72" || IDUserRol==="7" || IDUserRol==="12"){
            $("#s_empleado").append($("<option>",{value:"0",text:"Seleccione el empleado"}));
     }
    //  $("#cartera").append($("<option>",{value:"0",text:"Seleccione el cliente"}));
     $.getJSON("empleados", {"accion" : "MisEmpleados"}, function(result){
          $.each(result.listaEmpleados, function(key, val){   
           $("#s_empleado").append($("<option>",{value:val.id_empleado,text:val.empleado}));
           //var valor_select = val.razon_social;
          // alert(valor_select);
       
          });
    });  
    
}/*
fncConsultaGestionesDiarias(0,0,0);
function fncConsultaGestionesDiarias(pn_id_empleado,pv_fecha,pn_id_cliente){
    document.getElementById("container4").innerHTML="";
    
     var parametros = {
        "accion": "GestionesDiarias"
    };
        $.ajax({
        data: parametros,
        url: 'consultacartera',
        type: 'GET',
        beforeSend: function () {
        },
        success: function (response) {
            console.log("container4"+response.toString());
              document.getElementById("container4").value=response.toString();
        }
    });
    
}
*/

<%  if(request.getAttribute("Grafica1")!= null){
     %>
     <%=request.getAttribute("Grafica1")%>

<%
    
}   %>


     
     </script>
     <script>
         
function gestiones_diarias(){
    //var s_empleado=$("#s_empleado").val();  
    var s_empleado = $("#s_empleado").val();
    var s_cliente = $("#s_cliente").val();
    var fecha_cons = $("#fecha_cons").val();
    if(s_cliente==="0"){
        MsgSalidaModalA("Debe seleccionar una cartera");
        return;
        
    }
    $("#midashboard").load("home", {"accion":"consulta","s_empleado":s_empleado,"s_cliente":s_cliente,"fecha_cons":fecha_cons});
   // var s_clientes=$("#s_clientes")val();
    //var fecha_cons=$("#fecha_cons").val();
  //  alert("ooook");
    /*if(s_clientes==="0"){
        MsgSalidaModalA("Debe seleccionar una cartera");
        return;
        
    }*/
    
    // jQuery("#midashboard").load("home?s_empleado=28",{},function(){});
  // $("#midashboard").load("home", {s_empleado:'s_empleado',s_clientes:'s_clientes',fecha_cons:'fecha_cons'});
    
}
     </script>   
     
     <script>
         
         
         function consulta_push(){
                //var id_empleado = $("#id_empleado").val();             
                var accion = "notificaciones";
                console.log("consultando...  ");
                var parametros = {
                    //"id_empleado": id_empleado,
                    "accion": accion
                };
                var titulo=false;
                var item="";
               // console.log("id_empleado"+id_empleado);
             $.getJSON("home", {"accion" : "notificaciones"}, function(result){
              $.each(result.Notificaciones, function(key, val){   
                 
                 document.getElementById("num_notificaciones").innerHTML=val.cantidad;
                 if(!titulo){
                 if(val.cantidad>0 && val.cantidad<2){
                  document.getElementById("titulo_notificaciones").innerHTML="Tienes "+val.cantidad+" Notificaión";   
                 }else{
                     document.getElementById("titulo_notificaciones").innerHTML="Tienes "+val.cantidad+" Notificaiones";
                 }
                 titulo=true;                     
                 }
                 item = item+"<li><a href='#'><i class='"+val.icono+" text-aqua'></i> "+val.cantidad+" "+val.titulo+"</a></li>";
              
                    
                 
              // $("#tgestion").append('<option id="' + val.idTipoGestion + '">' + val.nombreTipoGestion +'</option>');
              // $("#tsub_cartera").append($("<option>",{value:val.idSubcartera,text:val.nombreSubcartera}));
             //  document.getElementById("num_notificaciones").value=val.cantidad;
               //$("#tcartera").append($("<option>",{value:val.idTipoGestion,text:val.nombreTipoGestion}));
              });
              document.getElementById("menu_notificaciones").innerHTML=item;
        });
                

}
   //  setTimeout(, 3000); 
   /*   
     consulta_bandera();
    
    function consulta_bandera(){
         var dato="";
         var parametros = {
        "accion": "consulta_parametro",
        "parametro": "LB_CONSULTA_NOTIFICACIONES"
    };
        $.ajax({
        data: parametros,
        url: 'parametros',
        type: 'GET',
        beforeSend: function () {
        },
        success: function (response) {
           document.getElementById("bandera_consulta_ascy").value="";
              document.getElementById("bandera_consulta_ascy").value=response.toString();
               dato=response.toString();
               dato=$("#bandera_consulta_ascy").val();
               console.log(">>>>>>>>>ok"+dato);
        }
    });

     }*/
   
    

     </script>
</body>
</html>