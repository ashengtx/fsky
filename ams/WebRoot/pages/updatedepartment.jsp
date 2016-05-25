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
<meta name="author" content="李国辉">

<title>部门配置</title>

<jsp:include page="../header.jsp" />
<jsp:include page="../navigation.jsp" />

<!-- Page Content -->
<div id="page-wrapper">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">编辑部门</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<div class="row">
			<div class="col-lg-offset-3 col-lg-6 col-lg-offset-3">
				<div class="panel panel-primary">
					<div class="panel-heading">部门配置</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<form action="updateDepartment.action" role="form" method="post">
							<input name="departmentid" type="hidden"
											value="<%=request.getParameter("departmentid")%>"></input>
							<fieldset>
								<div class="form-group" >
									<label>部门名称</label> 
									<input class="form-control" type="text"	name="departmentname" 
										value="${department.departmentname}" /> 
								</div>
								<div class="form-group" type="hidden">
									<label style="width: 70px;" >删除状态</label>
                                    <label class="radio-inline">
                                    	<input type="radio" name="deleteflag" id="deleteflag1" value="1">未删除
                                    </label>
                                    <label class="radio-inline">
                                    	<input type="radio" name="deleteflag" id="deleteflag2" value="0">已删除
                                    </label>
                                </div>
                                <div class="form-actions">
									<button type="submit" class="btn btn-primary">修改</button>
                                	<button type="reset" class="btn btn-default" ><a href="/ams/pages/departments.jsp">返回</a></button>
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
