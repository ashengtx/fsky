<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="林连升">

<title>采购单明细列表</title>

<jsp:include page="../header.jsp" />
<!-- styles here -->
<!-- <link href="../css/public.css" type="text/css" rel="stylesheet">
<link href="../css/houtai.css" type="text/css" rel="stylesheet">
<link href="../css/smartMenu.css" type="text/css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../css/style.css" />

<link href="../css/app.css" type="text/css" rel="stylesheet">
<link href="../css/font-awesome.css" type="text/css" rel="stylesheet">
<link href="../css/simple-line-icons.css" type="text/css"
	rel="stylesheet">
<link href="../css/font-awesome.min.css" type="text/css"
	rel="stylesheet">
<link href="../css/font.css" type="text/css" rel="stylesheet"> -->
<link href="../datatable/jquery.dataTables.min.css" type="text/css" rel="stylesheet">
<!-- styles end -->
</head>
<body>

<jsp:include page="../navigation.jsp" />

<!-- Page Content -->
<div id="page-wrapper">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">采购单明细列表</h1>
				<div class="panel panel-primary">
					<div class="panel-heading">采购单明细</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
					<section class="scrollable wrapper">
						<%-- <form class="form-horizontal" role="form" onSubmit="return false;">
							<fieldset class="search-fieldset">
								<div class="form-group col-lg-4 text-left">
									<span>资产名称</span>
									<input type="text" name="assetname" id="assetname"/>
								</div>
								<div class="form-group col-lg-8 text-left">
									<button type="button" id="investor_search_btn"
										name="investor_search_btn" class="btn btn-s-md btn-primary">
										<i class="fa fa-search"></i> 查询
									</button>
									<button type="reset" class="btn btn-s-md btn-default">
										<i class="fa fa-refresh"></i> 重置
									</button>
								</div>
							</fieldset>
						</form> --%>
						<input name="purid" id="purid" type="hidden" 
							value="<%=request.getParameter("purid")%>"></input>
						<div class="dataTable_wrapper">
							<table class="table table-striped m-b-none" id="purchasedet_table">
								<thead>
									<tr>
										<!--多选框-->
										<!--<th width="10%"><label class="checkbox m-n i-checks"><input type="checkbox"><i></i></label></th>-->
										<th width="10%">采购单明细id</th>
						                <th width="10%">资产类别id</th>
						                <th width="10%">采购单id</th>
						                <th width="10%">保管人id</th>
						                <th width="10%">上级资产类别id</th>
						                <th width="10%">资产名称</th>
						                <th width="10%">单价</th>
						                <th width="20%">操作</th>
									</tr>
								</thead>
								<tbody>
								</tbody>
							</table>
						</div>
						</section>
					</div>
					<!-- panel panel-default -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->


<jsp:include page="../footer.jsp" />
<!-- script here -->
<%-- <script type="text/javascript" src="../js/contabs.js"></script>
<script type="text/javascript" src="../js/maintabs.js"></script>
<script type="text/javascript" src="../js/jquery-smartMenu-min.js"></script>
<script type="text/javascript" src="../js/jquery.nicescroll.min.js"></script> --%>
<%-- <script type="text/javascript" src="../js/jquery.dataTables.min.js"></script> --%>
<%-- <script type="text/javascript" src="../js/purchaseDetailTable.js"></script> --%>
<script type="text/javascript" src="../datatable/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../js/purchaseDetailTable.js"></script>


<!-- script end -->>
</body>
</html>
