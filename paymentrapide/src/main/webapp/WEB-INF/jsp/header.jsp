<%@page import="java.net.CookieHandler"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>
<%@include file="connection.jsp"%>
<!DOCTYPE html>
<html lang="en">


<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Happy Choice</title>
  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="/plugins/fontawesome-free/css/all.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/dist/css/adminlte.min.css">
  
   <!-- DataTables -->
  <link rel="stylesheet" href="plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
  <link rel="stylesheet" href="plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
  <link rel="stylesheet" href="plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
</head>
<body class="hold-transition sidebar-mini layout-fixed layout-navbar-fixed layout-footer-fixed">
<%-- <%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		response.setHeader("Expires", "0"); // Proxies.
%> --%>
<%
	Integer useridheder = (Integer) session.getAttribute("userId");
	String userEmail = (String) session.getAttribute("userName");
	String userFullName = (String) session.getAttribute("userFullName");
%>
<%-- <%
		if (useridheder == null)
			response.sendRedirect(request.getContextPath() + "/login.jsp");
%> --%> 

	
	<%-- <%
	if (session.getAttribute("userEmail")==null) {
		session.invalidate();
		session.setMaxInactiveInterval(0);
		  
		//changing the maximum age to 0 seconds  
		
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		}
	%> --%>

<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
    </ul>
    
    
<sql:query dataSource="${webappDataSource}" var="result">
 		SELECT * FROM paymentrapide.profile where id=<%=useridheder%>;
</sql:query>

    <!-- Right navbar links -->
    <h3 class="card-title p-3" style="color: green">
<c:forEach var="row" items="${result.rows}">
								Allocated Limit : ${row.allocated_limit} <i class="fas fa-rupee-sign"></i>
							</h3>
							<h3 class="card-title p-3">|</h3>
							<h3 class="card-title p-3" style="color: red">
								Available Limit : ${row.available_limit} <i class="fas fa-rupee-sign"></i>
							</h3>
							<h3 class="card-title p-3">|</h3>
							<h3 class="card-title p-3" style="color: blue">
								Used Limit :  ${row.used_limit} <i class="fas fa-rupee-sign"></i>
							</h3>
</c:forEach>

    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
          <i class="fas fa-th-large"></i>
        </a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/login" role="button">
          <i class="fa fa-power-off"></i>
        </a>
      </li>

      <li class="nav-item">
              <img src="dist/img/user2-160x160.jpg" style="height: 40px;" class="user-image" alt="User Image">
              <span class="hidden-xs"><%=userFullName%></span>
       </li>
    </ul>
  </nav>

  <!-- /.navbar -->
  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="/index" class="brand-link">
      <img src="/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
      <span class="brand-text font-weight-light">Happy Choice</span>
    </a>
    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item">
            <a href="dashboard" class="nav-link">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Dashboard
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="payToMerchantOnline" class="nav-link">
              <i class="nav-icon fas fa-shopping-cart"></i>
              <p>
                Online Purchase
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="payToMerchantPurchaseHistory" class="nav-link">
              <i class="nav-icon fas fa-history"></i>
              <p>
                Order History
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="payment" class="nav-link">
              <i class="nav-icon fas fa-rupee-sign"></i>
              <p>
                Pay EMI
              </p>
            </a>
          </li>
           </li>
          <li class="nav-item">
            <a href="payToMerchantInStore" class="nav-link">
              <i class="nav-icon fas fa-university"></i>
              <p>
                Pay to Merchant
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-user-alt"></i>
              <p>
                Profile
              </p>
            </a>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
</body>
</html>