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

<title>资产维修列表</title>

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
				<h1 class="page-header">资产维修</h1>
				<div class="panel panel-primary">
					<div class="panel-heading">资产维修列表</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<div class="dataTable_wrapper">
							<table class="table table-striped m-b-none" id="repair_table">
								<thead>
									<tr>
										<th width="10%">资产维修id</th>
						                <th width="10%">送修人id</th>
						                <th width="10%">资产id</th>
						                <th width="10%">损坏情况</th>
						                <th width="10%">送修前资产使用状态</th>
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
<script type="text/javascript" src="../js/repairTable.js"></script>
<!-- script end -->
</body>
</html>
