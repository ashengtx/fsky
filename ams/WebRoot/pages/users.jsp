<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
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
<link href="../css/smartMenu.css" type="text/css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<link href="../css/datatables.css" type="text/css" rel="stylesheet">
<link href="../css/bootstrap.css" type="text/css" rel="stylesheet">
<link href="../css/app.css" type="text/css" rel="stylesheet">
<link href="../css/font-awesome.css" type="text/css" rel="stylesheet">
<link href="../css/simple-line-icons.css" type="text/css"
	rel="stylesheet">
<link href="../css/font-awesome.min.css" type="text/css"
	rel="stylesheet">
<link href="../css/font.css" type="text/css" rel="stylesheet">
</head>

<body>

	<jsp:include page="../header.jsp" />
	<jsp:include page="../navigation.jsp" />
	<jsp:include page="../footer.jsp" />
	<!-- Page Content -->
	<div id="page-wrapper">
		<!-- /#page-wrapper -->
		<h1 class="page-header">用户管理</h1>
		<div class="form-group">
			<form onSubmit="return false;">
				<label>用户名：</label> <input type="text" name="username" id="username"
					style="width: 120px" /> <label>部 门：</label> <select
					style="width: 120px" name="departmentid" id="departmentid">
					<option value="">请选择</option>
					<option value="1">市场部</option>
					<option value="2">财务部</option>
					<option value="3">运营部</option>
				</select> <label>用户状态：</label> <select style="width: 120px" name="userstate"
					id="userstate">
					<option value="">请选择</option>
					<option value="1">正常</option>
					<option value="0">禁用</option>
				</select> <label>角色：</label> <select style="width: 120px" name="roleid"
					id="roleid">
					<option value="">请选择</option>
					<option value="1">系统管理员</option>
					<option value="2">普通员工</option>
					<option value="3">财务人员</option>
				</select>
				<button type="button" class="btn btn-primary" id="users_search_btn"
					name="users_search_btn">搜索</button>
			</form>
		</div>
		<table class="table table-striped m-b-none" id="user_table">

			<!-- 标签定义表格的表头。该标签用于组合 HTML 表格的表头内容。 thead 元素应该与 tbody 和
					tfoot 元素结合起来使用。 tbody 元素用于对 HTML 表格中的主体内容进行分组，而 tfoot 元素用于对 HTML
					表格中的表注（页脚）内容进行分组。 -->
			<thead>
				<tr>
					<th width="10%">用户id</th>
					<th width="10%">用户名</th>
					<th width="10%">性别</th>
					<th width="10%">用户状态</th>
					<th width="10%">部门</th>
					<th width="10%">角色</th>
					<th width="15%">操作</th>
				</tr>
			</thead>
			<tfoot>
			</tfoot>
			<tbody>
			</tbody>
		</table>

	</div>

	<script type="text/javascript" src="../js/maintabs.js"></script>
	<script type="text/javascript" src="../js/jquery-smartMenu-min.js"></script>
	<script type="text/javascript" src="../js/jquery.nicescroll.min.js"></script>
	<script type="text/javascript" src="../js/jquery.dataTables.min.js"></script>

	<script src="../js/jquery.mCustomScrollbar.concat.min.js"></script>

	<script type="text/javascript" src="../js/table.js"></script>

</body>
</html>
