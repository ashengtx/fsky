<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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

</head>

<body>
	<jsp:include page="../header.jsp" />
	<jsp:include page="../navigation.jsp" />
	<jsp:include page="../footer.jsp" />
	<!-- Page Content -->
	<div id="page-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">修改参数</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<div class="row">
				<div class="col-lg-offset-3 col-lg-6 col-lg-offset-3">
					<div class="panel panel-primary">
						<div class="panel-heading">参数信息</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<s:form action="saveOrUpdateParaInfo.action">
										<input name="paramInfoId" type="hidden"
											value="<%=request.getParameter("paramInfoId")%>"></input>
										<fieldset>											
											<div class="form-group">
												<label>参数名：</label> <input class="form-control" type="text"
													name="paramName"
													value="<s:property value="paramInfo.parametername"/>" />
											</div>
											<div class="form-group">
												<label>参数值：</label> <input class="form-control" type="text"
													name="paramValue"
													value="<s:property value="paramInfo.parametervalue"/>" />
											</div>
											<div class="form-group">
												<label>参数类型id：</label> <input class="form-control" type="text"
													name="pdParamId"
													value="<s:property value="paramInfo.parametertypeid"/>" />
											</div><div class="form-group">
												<label>参数类型名：</label> <input class="form-control" type="text"
													name="pdParamName"
													value="<s:property value="paramInfo.parametertypename"/>" />
											</div>
									
											<div class="form-actions">
												<button type="submit" class="btn btn-primary">修改</button>
												<button type="reset" class="btn btn-default">重置</button>
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

</body>
</html>

