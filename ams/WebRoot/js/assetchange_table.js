/**
 * Created by xb on 2016/1/5.
 */
$(document)
		.ready(
				function() {
					var datatables = $("#assetchangetable")
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

										"ajax" : {
											"url" : "assetChangeList.action",
											"data" : function(data) {
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
													"mData" : function(row,
															type, val) {
														var zkstate_str = "";
														switch (row.zkstate) {
														case 1:
															zkstate_str = "在用";
															break;
														case 2:
															zkstate_str = "库存";
															break;
														case 3:
															zkstate_str = "故障";
															break;
														case 4:
															zkstate_str = "报废";
															break;
														case 5:
															zkstate_str = "调拨";
															break;

														default:
															break;
														}
														return zkstate_str;
													}
												},

												{
													"mData" : function(row,
															type, val) {
														var userstate_btn = "";

														userstate_btn += '<a href="/ams/pages/getAssetDetail.action?assetid='
																+ row.assetid
																+ '" class="text-info support-details" title="详情" data-id="'
																+ row.assetid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 详情</a>';
														userstate_btn += '<a href="/ams/pages/getAssetByAssetId.action?assetid='
																+ row.assetid
																+ '" class="text-info support-details" title="编辑" data-id="'
																+ row.assetid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 编辑</a>';
														userstate_btn += '<a href="/ams/pages/deleteAsset.action?assetid='
																+ row.assetid
																+ '" class="text-info support-details" title="删除" data-id="'
																+ row.assetid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';

														return '<div class="toolmenu">'
																+ userstate_btn
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