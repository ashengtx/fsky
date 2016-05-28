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
<meta name="author" content="胡景霖">

<title>参数配置</title>

<jsp:include page="../header.jsp" />
<jsp:include page="../navigation.jsp" />

<!-- Page Content -->
<div id="page-wrapper">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">参数配置</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<div class="row">
			<div class="col-lg-offset-3 col-lg-6 col-lg-offset-3">
				<div class="panel panel-primary">
					<div class="panel-heading">参数表</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							<form action="addParaInfo.action" role="form" method="post">
							<fieldset>
								<div class="form-group">
									<label>参数名称</label> 
									<input class="form-control" type="text"	name="paramName" 
                                          placeholder="" /> 
								</div>
								<div class="form-group">
									<label>参数值</label> 
									<input class="form-control" type="text" name="paramValue"
									      placeholder="" /> 
								</div>
								<div class="form-group">
									<label>参数类型id</label> 
									<input class="form-control" type="text" name="pdParamId"
										placeholder="" />
								</div>
								<div class="form-group">
									<label>参数类型</label> 
									<input class="form-control" type="text" name="pdParamName"
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
