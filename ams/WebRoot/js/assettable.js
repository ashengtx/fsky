/**
 * Created by xb on 2016/1/5.
 */
$(document)
		.ready(
				function() {
					var datatables = $("#asset_table")
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
										"aLengthMenu" : [ [ 10, 15, 20 ],
												[ 10, 15, 20 ] ],
										"bStateSave" : false,
										"bProcessing" : true,
										"bServerSide" : true,
										"sDom" : "t<'row'<'col-sm-4'i><'col-sm-2'l><'col-sm-6'p>>",
										"sPaginationType" : "full_numbers",
										sServerMethod : "POST",
										// "sAjaxSource": "userList.action",
										"ajax" : {
											"url" : "assetClassList.action",
											"data" : function(data) {

											}
										},
										// "aaSorting": [[ 1, "asc" ]],
										"aoColumns" : [
												// 多选框
												/*
												 * { "mData": function ( row,
												 * type, val ) { return '<div
												 * class="checkbox i-checks
												 * m-n"><label><input
												 * name="id" type="checkbox"
												 * value="'+row.id+'"><i></i></label></div>'; },
												 * "bSortable": false },
												 */
												{
													"mData" : "assetclassid",
													'sClass' : '',
													"bSortable" : false
												},
												{
													"mData" : "assetclasscoding",
													'sClass' : '',
													"bSortable" : false
												},
												{
													"mData" : "assetclassname",
													'sClass' : '',
													"bSortable" : false
												},
												{
													"mData" : "iassetclassid",
													'sClass' : '',
													"bSortable" : false
												},
												{
													"mData" : "iassetclassname",
													'sClass' : '',
													"bSortable" : false
												},

												{
													"mData" : function(row,
															type, val) {
														var userstate_btn = "";

														userstate_btn += '<a href="/ams/getUser.action?userid='
																+ row.assetclassid
																+ '" class="text-info support-details" title="编辑" data-id="'
																+ row.assetclassid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 编辑</a>';
														userstate_btn += '<a href="/ams/deleteUser.action?userid='
																+ row.assetclassid
																+ '" class="text-info support-details" title="删除" data-id="'
																+ row.assetclassid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';

														return '<div class="toolmenu">'
																+ userstate_btn
																+ '</div>';
													},
													"bSortable" : false
												} 
												
												],
										"fnInitComplete" : function() {
											// 初始化完成回调
										},
										"fnRowCallback" : function(nRow, aData,
												iDisplayIndex) {
										}
									});
					// $(document).on("click", ".refresh", function () {
					// tableReload();
					// });
					// function tableReload() {
					// datatables.ajax.reload();
					// }
					//
					// $("#investor_search_btn").bind("click", function () {
					// datatables.ajax.reload();
					// });

				});