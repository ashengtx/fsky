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
<title>资产类型统计报表</title>
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
		<h1 class="page-header">资产类型统计报表</h1>

		<form class="form-horizontal" onSubmit="return false;">
			<fieldset class="search-fieldset">

				<div class="form-group col-lg-5">
					<label class="control-label pandian"></label> <label
						class="col-lg-4 control-label">统计分类:</label>
					<div class="col-lg-4">
						<select name="satisticsType" id="satisticsType"
							class="form-control m-b">
							<option value="">请选择</option>
							<option value="big">资产大类</option>
							<option value="small">资产小类</option>
						</select>
					</div>
				</div>
				<div class="form-group col-lg-7">
					<label class="control-label pandian"></label> <label
						class="col-lg-4 control-label">资产名称:</label>
					<div class="col-lg-4">
						<select name="assetName" id="assetName" class="form-control m-b">
							<option value="">请选择</option>
						</select>
					</div>
				</div>
				<div class="col-xs-12 no-padder">
					<div class="form-group col-lg-12 text-center">
						<button type="button" id="search_btn" name="search_btn"
							class="btn btn-s-md btn-warning">
							<i class="fa fa-search"></i> 查询
						</button>
						<button type="reset" id="reset" class="btn btn-s-md btn-default">
							<i class="fa fa-refresh"></i> 重置
						</button>
					</div>
				</div>
			</fieldset>
		</form>

		<table class="table table-striped m-b-none" id="department_table">

			<!-- 标签定义表格的表头。该标签用于组合 HTML 表格的表头内容。 thead 元素应该与 tbody 和
					tfoot 元素结合起来使用。 tbody 元素用于对 HTML 表格中的主体内容进行分组，而 tfoot 元素用于对 HTML
					表格中的表注（页脚）内容进行分组。 -->
			<thead>
				<tr>
					<th width="10%">资产id</th>
					<th width="10%">卡片编号</th>
					<th width="10%">资产名称</th>
					<th width="20%">资产编码</th>
					<th width="10%">单价</th>
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

	<script type="text/javascript" src="../js/assetstatistics.js"></script>

</body>
</html>
