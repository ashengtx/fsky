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
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="林连升">

<title>资产领用</title>

<jsp:include page="../header.jsp" />
<!-- stylesheet here -->

<!-- stylesheet end -->

</head>

<body>

	<div id="wrapper">
<jsp:include page="../navigation.jsp" />

<!-- Page Content -->
<div id="page-wrapper">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">资产领用</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<div class="row">
			<div class="col-lg-offset-3 col-lg-6 col-lg-offset-3">
				<div class="panel panel-primary">
					<div class="panel-heading">资产领用</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form action="assetUse.action" role="form" method="post">
										<input name="assetid" type="hidden" value="<%=request.getParameter("assetid")%>"></input>
										<fieldset>
											<div class="form-group">
												<label>领用人id</label> <input class="form-control" type="text"
													name="lyuserid" placeholder="" />
											</div>
											<div class="form-group">
													<label>领用人</label> 
													<select class="form-control" name="departmentid">
														<option value="1">市场部</option>
														<option value="2">财务部</option>
													</select>
												</div>
											<div class="form-group">
												<label>领用时间</label> <input class="form-control"
													onclick="laydate()" name="lydate" />
											</div>

											<div class="form-actions">
												<button type="submit" class="btn btn-primary">确认</button>
												<button type="reset" class="btn btn-default">重置</button>
											</div>
										</fieldset>
									</form>
							</div>
						</div>
						<!-- /.row -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel panel-default -->
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
	<script type="text/javascript" src="../laydate/laydate.js"></script> 
	<!-- script end -->
</body>
</html>
