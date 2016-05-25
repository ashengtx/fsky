<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="dingh">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>资产管理系统</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<jsp:include page="../navigation.jsp" />

	<!-- Page Content -->
	<div id="page-wrapper">
		<h1 class="page-header">编辑成功！</h1>
		<!-- /.container-fluid -->
	</div>
	<!-- /#page-wrapper -->

	<jsp:include page="../footer.jsp" />
</body>
</html>