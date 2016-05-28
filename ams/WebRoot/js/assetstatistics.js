/**
 * Created by xb on 2016/1/5.
 */

$("#reset").bind('click', function() {
	$("#assetName").find("option").remove();
	$("#assetName").append("<option value=''>请选择</option>");
});
$("#satisticsType")
		.on(
				'change',
				function() {
					if ($("#satisticsType").val() == "") {
						$("#assetName").find("option").remove();
						$("#assetName").append("<option value=''>请选择</option>");
					} else {
						$("#assetName").find("option").remove();
						$
								.ajax({
									type : "POST",
									url : "getStatistics.action",
									data : {},
									dataType : "json",
									success : function(result) {
										// 部门动态配置
										for (i = 0; i < result.assetclasses.length; i++) {
											if ($("#satisticsType").val() == "big") {
												if (result.assetclasses[i].iassetclassid == null) {
													$("#assetName")
															.append(
																	"<option value='"
																			+ result.assetclasses[i].assetclassid
																			+ "'>"
																			+ result.assetclasses[i].assetclassname
																			+ "</option>");
												}
											} else if ($("#satisticsType")
													.val() == "small") {
												if (result.assetclasses[i].iassetclassid != null) {
													$("#assetName")
															.append(
																	"<option value='"
																			+ result.assetclasses[i].assetclassid
																			+ "'>"
																			+ result.assetclasses[i].assetclassname
																			+ "</option>");
												}
											} else {
												// $("#assetName").find("option").remove();
											}
										}
									}

								});
					}

				})

$(document).ready(function() {
	var datatables = $("#department_table").DataTable({
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
		"aLengthMenu" : [ [ 5, 10 ], [ 5, 10 ] ],
		"bStateSave" : false,
		"bProcessing" : true,
		"bServerSide" : true,
		"sDom" : "t<'row'<'col-sm-4'i><'col-sm-2'l><'col-sm-6'p>>",
		"sPaginationType" : "full_numbers",
		sServerMethod : "POST",
		"ajax" : {
			"url" : "getAssetListByClass.action",
			"data" : function(data) {
				data.assetclassid = $("#assetName").val();
				data.iassetclassid = $("#assetName").val();
				data.typeFlag = $("#satisticsType").val();
			}
		},
		// "aaSorting": [[ 1, "asc" ]],
		"aoColumns" : [

		{
			"mData" : "assetid",
			'sClass' : '',
			"bSortable" : false
		}, {
			"mData" : "cardnum",
			'sClass' : '',
			"bSortable" : false
		}, {
			"mData" : "assetname",
			'sClass' : '',
			"bSortable" : false
		}, {
			"mData" : "assetcoding",
			'sClass' : '',
			"bSortable" : false
		}, {
			"mData" : "price",
			'sClass' : '',
			"bSortable" : false
		},

		],
		"fnInitComplete" : function() {
			// 初始化完成回调
		},
		"fnRowCallback" : function(nRow, aData, iDisplayIndex) {
		}
	});

	$("#search_btn").bind("click", function() {
		datatables.ajax.reload();
	});

	$(document).on('click', '.confirmDeleteBtn', function() {

		var r = confirm("是否确认删除!");
		if (r == true) {
			var departmentid = $(this).attr("data-id");
			// alert("111");
			$.ajax({
				type : "POST",
				url : "/ams/pages/deleteDepartment.action",
				data : {
					departmentid : departmentid
				},
				success : function(data) {
					datatables.ajax.reload();
					// if("delete"==data){
					// alert("删除成功");
					// }else{
					// alert("删除失败");
					// }

				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
				}
			});
		} else {
		}
	});
});