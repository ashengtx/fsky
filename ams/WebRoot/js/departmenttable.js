/**
 * Created by xb on 2016/1/5.
 */
$(document)
		.ready(
				function() {
					var datatables = $("#department_table")
							.DataTable(
									{
										"oLanguage" : { // 汉化
											"sProcessing" : "正在加载数据...",
											"sLengthMenu" : "显示 _MENU_ 条 ",
											"sZeroRecords" : "没有您要搜索的内容",
											"sInfo" : "显示第_START_ 到第 _END_ 条记录，总记录数为 _TOTAL_ 条",
											"sInfoEmpty" : "记录数为0",
											"sInfoFiltered" : "(全部记录数 _MAX_  条)",
											"sInfoPostFix" : "",
											"sSearch" : "搜索 ",
											"sUrl" : "",
											"oPaginate" : {
												"sFirst" : " <i class=\"fa fa-angle-double-left\"></i> ",
												"sPrevious" : " <i class=\"fa fa-angle-left\"></i> ",
												"sNext" : " <i class=\"fa fa-angle-right\"></i> ",
												"sLast" : " <i class=\"fa fa-angle-double-right\"></i> "
											}
										},
										"aLengthMenu" : [ [5, 10 ],
												[ 5, 10 ] ],
										"bStateSave" : false,
										"bProcessing" : true,
										"bServerSide" : true,
										"sDom" : "t<'row'<'col-sm-4'i><'col-sm-2'l><'col-sm-6'p>>",
										"sPaginationType" : "full_numbers",
										sServerMethod : "POST",
										"ajax" : {
											"url" : "departmentList.action",
											"data" : function(data) {

											}
										},
										// "aaSorting": [[ 1, "asc" ]],
										"aoColumns" : [
												// 多选框

												{
													"mData" : "departmentname",
													'sClass' : '',
													"bSortable" : false
												},

												{
													"mData" : function(row,
															type, val) {
														var deleteflag_str = "";
														switch (row.deleteflag) {
														case 0:
															deleteflag_str = "已删除";
															break;
														case 1:
															deleteflag_str = "未删除";
															break;

														default:
															break;
														}
														return deleteflag_str;
													},
													"bSortable" : false
												},

												{
													"mData" : function(row,
															type, val) {
														var departmentstate_btn = "";

														departmentstate_btn += '<a href="/ams/pages/getDepartmentInfo.action?departmentid='
																+ row.departmentid
																+ '" class="text-info support-details" title="编辑" data-id="'
																+ row.departmentid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 编辑</a>';
//														departmentstate_btn += '<a href="/ams/pages/deleteDepartment.action?departmentid='
//																+ row.departmentid
//																+ '" class="text-info support-details confirmDeleteBtn" title="删除" data-id="'
//																+ row.departmentid
//																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
														
														departmentstate_btn += '<a href="#" class="text-info support-details confirmDeleteBtn" title="删除" data-id="'
															+ row.departmentid
															+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
														
														
														
														
														return '<div class="toolmenu">'
																+ departmentstate_btn
																+ '</div>';
													},
													"bSortable" : false
												} ],
										"fnInitComplete" : function() {
											// 初始化完成回调
										},
										"fnRowCallback" : function(nRow, aData,
												iDisplayIndex) {
										}
									});

					$(document).on('click', '.confirmDeleteBtn', function ()
							{

						var r = confirm("是否确认删除!");
						if (r == true) {
							var departmentid = $(this).attr("data-id");
							// alert("111");
							$.ajax({
								type: "POST",
								url: "/ams/pages/deleteDepartment.action",
								data: {
									departmentid: departmentid
								},
								success: function (data) {
									datatables.ajax.reload();
//									if("delete"==data){
//										alert("删除成功");
//									}else{
//										alert("删除失败");
//									}

								},
								error: function (XMLHttpRequest, textStatus, errorThrown)
								{
								}
							});
						} else {
						}


							});
					//
					//					
					//					
//					$(document).on("click", ".confirmDeleteBtn", function() {
//						var r = confirm("Press a button!");
//						if (r == true) {
//							alert("You pressed OK!");
//						} else {
//							alert("You pressed Cancel!");
//						}
//					});

				});