/**
 * Created by xb on 2016/5/15.
 */
$(document)
		.ready(
				function() {
					var datatables = $("#paramInfoTable")
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
									       //条件查询
								        "ajax": {
								            "url": "getParaInfoList.action",
								            "data": function (data) {
//								                data.condTitle = $("#condTitle").val();
//								                data.condSequence = $("#condSequence").val();
//								                data.condInitiateTimeFrom = $("#condInitiateTimeFrom").val();
//								                data.condInitiateTimeTo = $("#condInitiateTimeTo").val();
								            }
								        },
								        "sDom": "t<'row'<'col-sm-4'i><'col-sm-2'l><'col-sm-6'p>>",
								        "sPaginationType": "full_numbers",
								        sServerMethod: "POST",
								        //"aaSorting": [[ 1, "asc" ]],
								        "aoColumns": [
								            {"mData": "parameterinfoid", 'sClass': '', "bSortable": false},
								            {"mData": "parametername", 'sClass': '', "bSortable": false},
								            {"mData": "parametervalue", 'sClass': '', "bSortable": false},
								            {"mData": "parametertypeid", 'sClass': '', "bSortable": false},
								            {"mData": "parametertypename", 'sClass': '', "bSortable": false},
								            {
												"mData" : function(row,
														type, val) {
													var paramstate_btn = "";

													paramstate_btn += '<a href="/ams/pages/getParaInfoById.action?paramInfoId='
															+ row.parameterinfoid
															+ '" class="text-info support-details" title="编辑" data-id="'
															+ row.parameterinfoid
															+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 编辑</a>';
													paramstate_btn += '<a href="/ams/pages/deleteParaInfo.action?paramInfoId='
															+ row.parameterinfoid
															+ '" class="text-info support-details" title="删除" data-id="'
															+ row.parameterinfoid
															+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
													/*
													 * userstate_btn += '<a
													 * href="/myasset/ableUser.action?userid=' +
													 * row.userid + '"
													 * class="text-info
													 * support-details"
													 * title="解禁" data-id="' +
													 * row.userid + '"
													 * data-toggle="modal"><i
													 * class="fa
													 * fa-file-text-o"></i>
													 * 解禁</a>';
													 */
													return '<div class="toolmenu">'
															+ paramstate_btn
															+ '</div>';
												},
												"bSortable" : false
								            }
//								            {
//								                "mData": function (row, type, val) {
//								                    var dataObj = new Date(); //日期对象
//								                    dataObj.setTime(row.createdStamp); //设置日期时间，也就是你的毫秒
//								                    var date_str = dataObj.getFullYear() + "年" + (dataObj.getMonth() + 1) + "月" + dataObj.getDate() + "日 " + checkTime(dataObj.getHours()) + ":" + checkTime(dataObj.getMinutes()) + ":" + checkTime(dataObj.getSeconds());
//								                    return date_str;
//								                },
								//
//								                "bSortable": false
//								            },
//								            {
//								                "mData": function (row, type, val) {
//								                    var sex = '';
//								                    switch ( row.sex ){
//								                        case 0 : sex = "女";break;
//								                        case 1 : sex = "男" ;break;
//								                        default :sex = row.sex;break;
//								                    }
//								                    return sex;
//								                },
//								                "bSortable": false
//								            },
//								            {"mData": "status", 'sClass': '', "bSortable": false},
								            
								        ],
								        "fnInitComplete": function () {
								            //初始化完成回调
								        },
								        "fnRowCallback": function (nRow, aData, iDisplayIndex) {
								        }

								    });
											
												
												/*{
													"mData" : function(row,
															type, val) {
														var userstate_btn = "";

														userstate_btn += '<a href="/ams/pages/getUser.action?userid='
																+ row.userid
																+ '" class="text-info support-details" title="编辑" data-id="'
																+ row.userid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 编辑</a>';
														userstate_btn += '<a href="/ams/pages/deleteUser.action?userid='
																+ row.userid
																+ '" class="text-info support-details" title="删除" data-id="'
																+ row.userid
																+ '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 删除</a>';
														
														 * userstate_btn += '<a
														 * href="/myasset/ableUser.action?userid=' +
														 * row.userid + '"
														 * class="text-info
														 * support-details"
														 * title="解禁" data-id="' +
														 * row.userid + '"
														 * data-toggle="modal"><i
														 * class="fa
														 * fa-file-text-o"></i>
														 * 解禁</a>';
														 
														return '<div class="toolmenu">'
																+ userstate_btn
																+ '</div>';
													},
													"bSortable" : false*/
												 
										
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





