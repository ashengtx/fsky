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
					<h1 class="page-header">修改用户</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<div class="row">
				<div class="col-lg-offset-3 col-lg-6 col-lg-offset-3">
					<div class="panel panel-primary">
						<div class="panel-heading">用户信息</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<s:form action="updateUser.action">
										<input name="userid" type="hidden"
											value="<%=request.getParameter("userid")%>"></input>
										<fieldset>
											<div class="form-group">
												<label>用户姓名：</label> <input class="form-control" type="text"
													name="username"
													value="<s:property value="userinformation.username"/>" />
											</div>
											<div class="form-group">
												<label>用户密码：</label> <input class="form-control" type="text"
													name="userpassword" value="<s:property value="userinformation.userpwd"/>" />
											</div>
											<div class="form-group">
												<label style="width: 90px;">用户状态：</label> <label
													class="radio-inline"> <input type="radio"
													name="userstate" id="userstate" value="1">正常
												</label> <label class="radio-inline"> <input type="radio"
													name="userstate" id="userstate" value="0">禁用
												</label>
											</div>
											<div class="form-group">
												<label style="width: 90px;">用户性别：</label> <label
													class="radio-inline"> <input type="radio"
													name="usersex" id="usersex" value="1">男
												</label> <label class="radio-inline"> <input type="radio"
													name="usersex" id="usersex" value="0">女
												</label>
											</div>
											<div class="form-group">
												<label>角色</label> <select class="form-control"
													name="roleid">
													<option value="1">系统管理员</option>
													<option value="2">普通员工</option>
													<option value="3">财务人员</option>
												</select>
											</div>

											<div class="form-group">
												<label>部 门：</label> <select class="form-control"
													name="departmentid">
													<option value="1">市场部</option>
													<option value="2">财务部</option>
													<option value="3">运营部</option>
												</select>
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
