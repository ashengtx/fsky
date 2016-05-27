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

<title>采购单明细</title>

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
						<h1 class="page-header">采购单明细</h1>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<div class="row">
					<div class="col-lg-offset-2 col-lg-8 col-lg-offset-2">
						<div class="panel panel-primary">
							<div class="panel-heading">采购单明细</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										<form role="form">
											<fieldset>
												<%-- <input name="purid" type="hidden"
													value="<%=request.getParameter("purid")%>"></input> --%>

												<div class="col-lg-12">
													<div class="col-lg-6">

														<div class="form-group">

															<label>资产类别id</label> <input class="form-control" type="text" name="assetclassid" 
															value="<s:property value="purchasedetail.assetclassByAssetclassid.assetclassid"/>" />
														</div>
														<div class="form-group">
															<label>保管人id</label> <input class="form-control" type="text" name="userid" 
															value="<s:property value="purchasedetail.userinformation.userid"/>"/>
														</div>
														<div class="form-group">
															<label>上级资产类别id</label> <input class="form-control" type="text" name="passetclassid" 
															value="<s:property value="purchasedetail.assetclassByPassetclassid.assetclassid"/>" />
														</div>
														<div class="form-group">
															<label>单位</label> <input class="form-control" type="text" name="punit" 	
															value="<s:property value="purchasedetail.punit"/>" />
														</div>
														<div class="form-group">
															<label>资产型号</label> <input class="form-control" type="text" name="zcxh" 
															value="<s:property value="purchasedetail.zcxh"/>" />
														</div>
														<div class="form-group">
															<label>资产名称</label> <input class="form-control" type="text" name="assetname" 
															value="<s:property value="purchasedetail.assetname"/>" />
														</div>

													</div>

													<div class="col-lg-6">

														<div class="form-group">
															<label>数量</label> <input class="form-control" type="text" name="amount" 
															value="<s:property value="purchasedetail.amount"/>" />
														</div>
														<div class="form-group">
															<label>备注</label> <input class="form-control" type="text" name="remark" 
															value="<s:property value="purchasedetail.remart"/>" />
														</div>
														<div class="form-group">
															<label>制造商</label> <input class="form-control"	type="text" name="manufacturer" 
															value="<s:property value="purchasedetail.manufacturer"/>" />
														</div>
														<div class="form-group">
															<label>供应商</label> <input class="form-control" type="text" name="provider" 
															value="<s:property value="purchasedetail.provider"/>" />
														</div>
														<div class="form-group">
															<label>单价</label> <input class="form-control" type="text" name="price" 
															value="<s:property value="purchasedetail.price"/>" />
														</div>

													</div>
												</div>

												<div class="form-actions text-center">
													<a
														href="<%=basePath%>pages/purchase-detail-list.jsp?purid=<%=request.getParameter("purid")%>">
														<button type="button" class="btn btn-primary">返回</button>
													</a>
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

	<!-- script end -->
</body>
</html>