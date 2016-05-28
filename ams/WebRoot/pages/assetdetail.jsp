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
<meta name="author" content="dingh">

<title>资产详情</title>

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
						<h1 class="page-header">资产详情</h1>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<div class="row">
					<div class="col-lg-offset-2 col-lg-8 col-lg-offset-2">
						<div class="panel panel-primary">
							<div class="panel-heading">资产详情</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										<s:form>
											<%-- 											<input name=assetid type="hidden"
												value="<%=request.getParameter("assetid")%>"></input>
 --%>
											<fieldset>

												<div class="col-lg-12">
													<div class="col-lg-4">
														<div class="form-group">
															<label>资产id</label> <input class="form-control"
																type="text" name="assetid"
																value="<s:property value="asset.assetid"/>" />
														</div>
														<div class="form-group">
															<label>资产名称</label> <input class="form-control"
																type="text" name="assetname"
																value="<s:property value="asset.assetname"/>" />
														</div>
														<div class="form-group">
															<label>资产类别</label> <input class="form-control"
																type="text" name="assetclassid"
																value="<s:property value="asset.assetclassByAssetclassid.assetclassname"/>" />
														</div>
														<div class="form-group">
															<label>资产编码</label> <input class="form-control"
																type="text" name="assetcoding"
																value="<s:property value="asset.assetcoding"/>" />
														</div>
														<div class="form-group">
															<label>保管人</label> <input class="form-control"
																type="text" name="userid"
																value="<s:property value="asset.userinformationByUserid.username"/>" />
														</div>
														<div class="form-group">
															<label>财务入账人</label> <input class="form-control"
																type="text" name="cwuid"
																value="<s:property value="asset.userinformationByCwuid.username"/>" />
														</div>
														<div class="form-group">
															<label>上级资产类别</label> <input class="form-control"
																type="text" name="passetclassid"
																value="<s:property value="asset.assetclassByPassetclassid.assetclassname"/>" />
														</div>
														<div class="form-group">
															<label>采购单明细id：</label> <input class="form-control"
																type="text" name="pdid"
																value="<s:property value="asset.purchasedetail.pdid"/>" />
														</div>


													</div>

													<div class="col-lg-4">
														<div class="form-group">
															<label>卡片编号：</label> <input class="form-control"
																type="text" name="cardnum"
																value="<s:property value="asset.cardnum"/>" />
														</div>
														<div class="form-group">
															<label>在库状态：</label> <select class="form-control"
																name="zkstate" id="zkstate">
																<option value="0">是</option>
																<option value="1">否</option>

															</select>
														</div>

														<div class="form-group">
															<label>规格型号</label> <input class="form-control"
																type="text" name="ggxh"
																value="<s:property value="asset.ggxh"/>" />
														</div>
														<div class="form-group">
															<label>使用状态</label><select class="form-control"
																name="usestate" id="usestate">
																<option value="1">使用中</option>
																<option value="2">维修中</option>
																<option value="3">报废</option>
															</select>
														</div>
														<div class="form-group">
															<%-- 															<label>采购部门</label> <input class="form-control"
																type="text" name="cgbid"
																value="<s:property value="asset.cgbid"/>" /> --%>
															<label>采购部门</label> <select class="form-control"
																name="cgbid" id="cgbid" disabled=true>
																<option value="1">市场部</option>
																<option value="2">财务部</option>
																<option value="3">运营部</option>
															</select>
														</div>
														<div class="form-group">
															<label>单位</label> <input class="form-control" type="text"
																name="aunit" value="<s:property value="asset.aunit"/>" />
														</div>
														<div class="form-group">
															<label>数量</label> <input class="form-control" type="text"
																name="amount" value="<s:property value="asset.amount"/>" />
														</div>
													</div>

													<div class="col-lg-4">

														<div class="form-group">
															<label>财务入账日期</label> <input class="form-control"
																type="text" name="intodate"
																value="<s:date name="asset.intodate" format="yyyy-MM-dd" />" />
														</div>
														<div class="form-group">
															<label>财务编码</label> <input class="form-control"
																type="text" name="cwcoding"
																value="<s:property value="asset.cwcoding"/>" />
														</div>
														<div class="form-group">
															<label>制造商</label> <input class="form-control"
																type="text" name="manufacturer"
																value="<s:property value="asset.manufacturer"/>" />
														</div>
														<div class="form-group">
															<label>供应商</label> <input class="form-control"
																type="text" name="provider"
																value="<s:property value="asset.provider"/>" />
														</div>
														<div class="form-group">
															<label>入库时间</label> <input class="form-control"
																type="text" name="insertdate"
																value="<s:date name="asset.insertdate" format="yyyy-MM-dd" />" />
														</div>
														<div class="form-group">
															<label>备注</label> <input class="form-control" type="text"
																name="remark" value="<s:property value="asset.remark"/>" />
														</div>
														<div class="form-group">
															<label>单价</label> <input class="form-control" type="text"
																name="price" value="<s:property value="asset.price"/>" />
														</div>
													</div>
												</div>

												<div class="form-actions text-center">
													<a href="<%=basePath%>pages/assetlist.jsp">
														<button type="button" class="btn btn-primary">返回</button>
													</a>
												</div>

											</fieldset>
										</s:form>
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
	<script type="text/javascript">
		$(function() {
			$(
					"#cgbid option[value='" + <s:property value="asset.cgbid"/>
							+ "']").attr("selected", "selected");
			$(
					"#zkstate option[value='"
							+ <s:property value="asset.zkstate"/> + "']").attr(
					"selected", "selected");

		});

		$(function() {
			$(
					"#usestate option[value='"
							+ <s:property value="asset.usestate"/> + "']")
					.attr("selected", "selected");

		});
	</script>
	<!-- script here -->

	<!-- script end -->
</body>
</html>