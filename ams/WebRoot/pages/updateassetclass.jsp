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
<title>资产类别表</title>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	<jsp:include page="../header.jsp" />
	<jsp:include page="../navigation.jsp" />

	<!-- Page Content -->
	<div id="page-wrapper">
		<!-- /#page-wrapper -->
		<h1 class="page-header">修改资产类别</h1>
		<div>
			<form action="updateAssetClass.action" method="post">
			<input name="assetclassid" type="hidden"
				value="<%=request.getParameter("assetclassid")%>"></input>
				
				
				
				
			<fieldset>
								<div class="form-group">
									<label>资产类别编码</label> 
									<input class="form-control" type="text"	name="assetclasscoding" 
										placeholder="" /> 
								</div>
								
								<div class="form-group">
									<label>资产类别名称</label> 
									<input class="form-control" type="text"	name="assetclassname" 
										placeholder="" /> 
								</div>
								<div class="form-group">
									<label>上级资产ID</label> 
									<input class="form-control" type="text"	name="iassetclassid" 
										placeholder="" /> 
								</div>
								<div class="form-group">
									<label>上级资产类型名称</label> 
									<input class="form-control" type="text"	name="iassetclassname" 
										placeholder="" /> 
								</div>
								
								
                                <div class="form-actions">
									<button type="submit" class="btn btn-primary">提交</button>
                                	<button type="reset" class="btn btn-default">重置</button>
                                </div>
                            </fieldset>	
			</form>

		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
