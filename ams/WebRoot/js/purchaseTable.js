
$(document).ready(function () {
    var datatables = $("#purchase_table").DataTable({
        "oLanguage": { // 汉化
            "sProcessing": "正在加载数据...",
            "sLengthMenu": "显示 _MENU_ 条 ",
            "sZeroRecords": "没有您要搜索的内容",
            "sInfo": "显示第_START_ 到第 _END_ 条记录，总记录数为 _TOTAL_ 条",
            "sInfoEmpty": "记录数为0",
            "sInfoFiltered": "(全部记录数 _MAX_  条)",
            "sInfoPostFix": "",
            "sSearch": "搜索 ",
            "sUrl": "",
            "oPaginate": {
                "sFirst": " <i class=\"fa fa-angle-double-left\"></i> ",
                "sPrevious": " <i class=\"fa fa-angle-left\"></i> ",
                "sNext": " <i class=\"fa fa-angle-right\"></i> ",
                "sLast": " <i class=\"fa fa-angle-double-right\"></i> "
            }
        },
        //"aLengthMenu": [[10, 15, 20], [10, 15, 20]],
        //"bStateSave": true,
        //"bProcessing": true,
        //"bServerSide": true, //开启才能传数据到前端,但是关掉之后才能搜索，日
        //"sDom": "t<'row'<'col-sm-4'i><'col-sm-2'l><'col-sm-6'p>>",
        //"sPaginationType": "full_numbers",
        //sServerMethod: "POST",

        "ajax": {
            "url": "purchaseList.action",
            "data": function (data) {
            	data.departmentid=$("#departmentid").val();
            	data.purstate=$("#purstate").val();
                
            }
        },

        "aoColumns": [
      
            {"mData": "purid"},
            {
                "mData": function (row, type, val) {
                    var departmentid_str = "";
                    switch (row.department.departmentid) {
                        case 1:
                        	departmentid_str = "市场部";
                            break;
                        case 2:
                        	departmentid_str = "财务部";
                            break;

                        default :
                            break;
                    }
                    return departmentid_str;
                }
            },
            {"mData": "userinformation.userid"},
            {
                "mData": function (row, type, val) {
                    if (row.buydate){
                        var date = new Date(row.buydate);
                        return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
                    }
                    else
                    return;
                }
            },

            {"mData": "cgyt"},
            {
                "mData": function (row, type, val) {
                    var purstate_str = "";
                    switch (row.purstate) {
                        case 0:
                        	purstate_str = "尚未采购";
                            break;
                        case 1:
                        	purstate_str = "采购完成";
                            break;

                        default :
                            break;
                    }
                    return purstate_str;
                }
            },
         {
          "mData": function (row, type, val) {
              var pur_btn = "";
     
              switch (row.purstate) {
                  case 0:
                	  pur_btn += '<a href="/ams/pages/getPur.action?purid=' + row.purid + '" class="text-info support-details" title="修改" data-id="' + row.purid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 修改</a>';
                	  pur_btn += '<a href="/ams/pages/add-purchase-detail.jsp?purid=' + row.purid + '" class="text-info support-details" title="添加采购单明细" data-id="' + row.purid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 添加采购单明细</a>';
                	  pur_btn += '<a href="/ams/pages/purchase-detail-list.jsp?purid=' + row.purid + '" class="text-info support-details" title="查看采购单明细列表" data-id="' + row.purid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看采购单明细列表</a>';
                	  break;
                  case 1:
                	  pur_btn += '<a href="/ams/pages/getPur.action?purid=' + row.purid + '" class="text-info support-details" title="查看" data-id="' + row.purid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看</a>';
                	  pur_btn += '<a href="/ams/pages/add-purchase-detail.jsp?purid=' + row.purid + '" class="text-info support-details" title="添加采购单明细" data-id="' + row.purid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 添加采购单明细</a>';
                	  pur_btn += '<a href="/ams/pages/purchase-detail-list.jsp?purid=' + row.purid + '" class="text-info support-details" title="查看采购单明细列表" data-id="' + row.purid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看采购单明细列表</a>';
                	  break;
                  default :
                	  break;
              }
              return '<div class="toolmenu">' + pur_btn + '</div>';
          }
      },
         
        ],
        "fnInitComplete": function () {
            //初始化完成回调
        },
        "fnRowCallback": function (nRow, aData, iDisplayIndex) {
        }
    });
    $(document).on("click", ".refresh", function () {
        tableReload();
    });
    function tableReload() {
        datatables.ajax.reload();
    }

    $("#investor_search_btn").bind("click", function () {
        datatables.ajax.reload();
    });
   
});