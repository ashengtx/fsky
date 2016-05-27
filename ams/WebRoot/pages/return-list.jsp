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

<title>资产归还列表</title>

<jsp:include page="../header.jsp" />
<!-- styles here -->

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
				<h1 class="page-header">资产归还列表</h1>
				<div class="panel panel-primary">
					<div class="panel-heading">资产归还列表</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<%-- <form class="form-horizontal" role="form" onSubmit="return false;">
							<fieldset class="search-fieldset">
								<div class="form-group col-lg-4">
									<label class="col-lg-6 control-label">采购部门:</label>
									<div class="col-lg-6">
										<select name="departmentid" id="departmentid"
											class="form-control">
											<option value="">请选择</option>
											<option value="1">市场部</option>
											<option value="2">财务部</option>
										</select>
									</div>
								</div>
								<div class="form-group col-lg-4">
									<label class="col-lg-6 control-label">采购状态:</label>
									<div class="col-lg-6">
										<select name="purstate" id="purstate" class="form-control">
											<option value="">请选择</option>
											<option value="0">尚未采购</option>
											<option value="1">采购完成</option>
										</select>
									</div>
								</div>

								<div class="form-group col-lg-4 text-center">
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
						<div class="dataTable_wrapper">
							<table class="table table-striped m-b-none" id="return_table">
								<thead>
									<tr>
										<!--多选框-->
										<!--<th width="10%"><label class="checkbox m-n i-checks"><input type="checkbox"><i></i></label></th>-->
										<th width="10%">领用归还id</th>
						                <th width="10%">领用人id</th>
						                <th width="10%">资产id</th>
						                <th width="10%">领用时间</th>
						                <th width="20%">操作</th>
									</tr>
								</thead>
								<tbody>
								</tbody>
							</table>
						</div>
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
<script type="text/javascript" src="../datatable/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../js/returnTable.js"></script>

<!-- script end -->
</body>
</html>
