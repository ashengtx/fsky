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
		<h1 class="page-header">资产盘点</h1>
		<form class="form-horizontal" action="#" onSubmit="return false;">
			<fieldset class="search-fieldset">
				<div class="form-group col-lg-5">
					<label class="control-label pandian"></label> 
				</div>
			</fieldset>




		</form>
		
		<table class="table table-striped m-b-none" id="checked_table">

			<!-- 标签定义表格的表头。该标签用于组合 HTML 表格的表头内容。 thead 元素应该与 tbody 和
					tfoot 元素结合起来使用。 tbody 元素用于对 HTML 表格中的主体内容进行分组，而 tfoot 元素用于对 HTML
					表格中的表注（页脚）内容进行分组。 -->
			<thead>
				<tr>
					<th class="text-center" width="100px">明细编号</th>
					<th class="text-center" width="100px">盘点日期</th>
					<th class="text-center" width="100px">资产编号</th>
					<th class="text-center" width="100px">资产名称</th>
					<th class="text-center" width="100px">盘点结果</th>
					<th class="text-center" width="150px">操作</th>
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

	<script type="text/javascript" src="../js/checkedTable.js"></script>

</body>
</html>
