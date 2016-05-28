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
<meta name="author" content="LiGuohui">
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
		<h1 class="page-header">部门列表</h1>
		<form class="form-horizontal" action="#" onSubmit="return false;">
			<fieldset class="search-fieldset">

				<div class="col-xs-12 no-padder">
					<div class="form-group">
					<div class="col-gl-4">
						<span class="item_name" style="width:120px;">部门名称：</span> 
						<input type="text" class="textbox textbox_150" name="departmentname"
							id="departmentname" />
					</div>
					<div class="col-gl-8" align="right">
						<button type="button" id="search_btn" name="search_btn"
							class="btn btn-s-md btn-warning ">
							<i class="fa fa-search"></i> 查询
						</button>
						<button type="reset" class="btn btn-s-md btn-default">
							<i class="fa fa-refresh"></i> 重置
						</button>
					</div>
					</div>

				</div>
			</fieldset>
		</form>
		<br>
		<table class="table table-striped m-b-none" id="department_table">

			<!-- 标签定义表格的表头。该标签用于组合 HTML 表格的表头内容。 thead 元素应该与 tbody 和
					tfoot 元素结合起来使用。 tbody 元素用于对 HTML 表格中的主体内容进行分组，而 tfoot 元素用于对 HTML
					表格中的表注（页脚）内容进行分组。 -->
			<thead>
				<tr>
					<th width="10%">部门名称</th>
					<th width="10%">删除状态</th>
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

	<script type="text/javascript" src="../js/departmenttable.js"></script>

</body>
</html>
