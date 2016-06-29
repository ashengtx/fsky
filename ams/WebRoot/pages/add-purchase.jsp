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

<title>采购入库</title>

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
				<h1 class="page-header">添加采购单</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<div class="row">
			<div class="col-lg-offset-3 col-lg-6 col-lg-offset-3">
				<div class="panel panel-primary">
					<div class="panel-heading">采购单</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<form action="addPurchase.action" role="form" method="post">
							<fieldset>
								<div class="form-group">
									<label>经办人</label> 
									<input class="form-control" type="text"	name="userid" 
										placeholder="" /> 
								</div>
								<div class="form-group">
									<label>采购日期</label> 
									<input class="form-control" onclick="laydate()" name="buydate" /> 
								</div>
								<div class="form-group">
									<label>采购用途</label> 
									<input class="form-control" type="text" name="cgyt"
										placeholder="" />
								</div>
								<div class="form-group">
									<label>采购部门</label> 
										<select class="form-control" name="departmentid">
											<option value="1">市场部</option>
											<option value="2">财务部</option>
										</select>
								</div>
								<div class="form-group">
									<label style="width: 70px;">采购状态</label>
                                    <label class="radio-inline">
                                    	<input type="radio" name="purstate" id="purstate1" value="1" disabled>采购完成
                                    </label>
                                    <label class="radio-inline">
                                    	<input type="radio" name="purstate" id="purstate2" value="0" checked>尚未采购
                                    </label>
                                </div>
                                <div class="form-actions">
									<button type="submit" class="btn btn-primary">提交</button>
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
