/**
 * Created by xb on 2016/1/5.
 */
$(document)
		.ready(
				function() {
					var datatables = $("#assetlisttable")
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
										"aLengthMenu" : [ [ 10, 20, 30 ],
												[ 10, 20, 30 ] ],
										"bServerSide" : true,
										"bStateSave" : false,
										"bProcessing" : true,

										"sDom" : "t<'row'<'col-sm-4'i><'col-sm-2'l><'col-sm-6'p>>",
										"sPaginationType" : "full_numbers",

										sServerMethod : "POST",
										"ajax" : {
											"url" : "assetList.action",
											"data" : function(data) {

												data.assetname = $("#assetname")
														.val();
												data.assetcoding = $(
														"#assetcoding").val();
											}
										},
										// "aaSorting": [[ 1, "asc" ]],
										"aoColumns" : [

												{
													"mData" : "assetid",
												},
												{
													"mData" : "assetname",
												},
												{
													"mData" : "assetclassByAssetclassid.assetclassname",
												},
												{
													"mData" : "cardnum",

												},

												{
													"mData" : function(row,
															type, val) {
														var usersex_str = "";
														switch (row.cgbid) {
														case 1:
															usersex_str = "市场部";
															break;
														case 2:
															usersex_str = "财务部";
															break;
														case 3:
															usersex_str = "运营部";
															break;
														default:
															break;
														}
														return usersex_str;
													},
												/* "mData" : "cgbid", */
												},
												{
													"mData" : "assetcoding",
												},
												{
													"mData" : function(row,
															type, val) {
														if (row.insertdate) {
															var date = new Date(
																	row.insertdate);
															return date
																	.getFullYear()
																	+ "-"
																	+ (date
																			.getMonth() + 1)
																	+ "-"
																	+ date
																			.getDate();
														} else
															return;
													},
												/* "mData" : "insertdate", */

												},
												{
													"mData" : "price",

												},

												{
													"mData" : function(row,
															type, val) {
														var usestate_btn = "";
														console.log(row.usestate);
														switch (row.usestate) {
														case 1:
															usestate_btn += '<a href="/ams/pages/getAssetByAssetId.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="修改" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 修改</a>';
															usestate_btn += '<a href="/ams/pages/.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="查看" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看</a>';
															usestate_btn += '<a href="/ams/pages/deleteAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="删除" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';

															usestate_btn += '<a href="/ams/pages/asset-scrap.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="报废" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 报废</a>';
															usestate_btn += '<a href="/ams/pages/asset-repair.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="维修" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 维修</a>';
															usestate_btn += '<a href="/ams/pages/transfer-list.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="调拨记录" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 调拨记录</a>';
															break;
														case 2:
															usestate_btn += '<a href="/ams/pages/getAssetByAssetId.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="修改" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 修改</a>';
															usestate_btn += '<a href="/ams/pages/getOneAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="查看" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看</a>';
															usestate_btn += '<a href="/ams/pages/deleteAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="删除" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
															usestate_btn += '<a href="/ams/pages/asset-use.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="领用" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 领用</a>';
															usestate_btn += '<a href="/ams/pages/asset-scrap.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="报废" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 报废</a>';
															usestate_btn += '<a href="/ams/pages/asset-repair.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="维修" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 维修</a>';
															usestate_btn += '<a href="/ams/pages/asset-transfer.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="调拨" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 调拨</a>';
															usestate_btn += '<a href="/ams/pages/transfer-list.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="调拨记录" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 调拨记录</a>';
															break;
														case 3:
															usestate_btn += '<a href="/ams/pages/getAssetByAssetId.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="修改" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 修改</a>';
															usestate_btn += '<a href="/ams/pages/getOneAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="查看" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看</a>';
															usestate_btn += '<a href="/ams/pages/deleteAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="删除" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
															usestate_btn += '<a href="/ams/pages/asset-scrap.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="报废" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 报废</a>';
															usestate_btn += '<a href="/ams/pages/transfer-list.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="调拨记录" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 调拨记录</a>';

															break;
														case 4:
															usestate_btn += '<a href="/ams/pages/getOneAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="查看" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看</a>';
															usestate_btn += '<a href="/ams/pages/deleteAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="删除" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
															usestate_btn += '<a href="/ams/pages/transfer-list.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="调拨记录" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 调拨记录</a>';
															break;
														case 5:
															usestate_btn += '<a href="/ams/pages/getOneAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="查看" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看</a>';
															usestate_btn += '<a href="/ams/pages/deleteAsset.action?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="删除" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
															usestate_btn += '<a href="/ams/pages/transfer-list.jsp?assetid='
																	+ row.assetid
																	+ '" class="text-info support-details" title="调拨记录" data-id="'
																	+ row.assetid
																	+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 调拨记录</a>';
															break;
														default:
															break;
														}
/*														usestate_btn += '<a href="/ams/pages/.action?assetid='
																+ row.assetid
																+ '" class="text-info support-details" title="详情" data-id="'
																+ row.assetid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 详情</a>';
														usestate_btn += '<a href="/ams/pages/getAssetByAssetId.action?assetid='
																+ row.assetid
																+ '" class="text-info support-details" title="编辑" data-id="'
																+ row.assetid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 编辑</a>';
														usestate_btn += '<a href="/ams/pages/deleteAsset.action?assetid='
																+ row.assetid
																+ '" class="text-info support-details" title="删除" data-id="'
																+ row.assetid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';*/
console.log(usestate_btn);
														return '<div class="toolmenu">'
																+ usestate_btn
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
					$(document).on("click", ".refresh", function() {
						tableReload();
					});
					function tableReload() {
						datatables.ajax.reload();
					}

					$("#asset_search_btn").bind("click", function() {
						datatables.ajax.reload();
					});

				});