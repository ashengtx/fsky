<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="dingh">
<title>资产管理系统</title>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	<jsp:include page="../header.jsp" />
	<jsp:include page="../navigation.jsp" />

	<!-- Page Content -->
	<div id="page-wrapper">
		<!-- /#page-wrapper -->
		<h1 class="page-header">添加用户</h1>
		<div>
			<form action="addUser.action">
				<ul>
					<li><span style="width:120px;">用户姓名：</span> <input type="text"
						name="username" placeholder="请输入用户姓名" /></li>
					<li><span style="width:120px;">用户密码：</span> <input type="text"
						name="userpassword" placeholder="请设置用户密码" /></li>

					<li><span style="width:120px;">用户状态：</span> <label><input
							type="radio" name="userstate" value="1" />正常 </label> <label><input
							type="radio" name="userstate" value="0" />禁用 </label></li>
					<li><span style="width:120px;">用户性别：</span> <label><input
							type="radio" name="usersex" value="1" />男</label> <label><input
							type="radio" name="usersex" value="0" />女</label></li>
					<li><span style="width:120px;">角 色：</span> <select
						name="roleid">
							<option value="1">系统管理员</option>
							<option value="2">普通员工</option>
							<option value="3">财务人员</option>
					</select></li>

					<li><span style="width:120px;">部 门：</span> <select
						name="departmentid">
							<option value="1">市场部</option>
							<option value="2">财务部</option>
							<option value="3">运营部</option>
					</select></li>
					<li><span style="width:120px;"></span> <input type="submit" value="添加"/></li>
				</ul>
			</form>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
