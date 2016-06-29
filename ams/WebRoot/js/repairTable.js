
$(document).ready(function () {
    var datatables = $("#repair_table").DataTable({
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
        "bServerSide": true,

        "ajax": {
            "url": "repairList.action",
            "data": function (data) {
                
            }
        },

        "aoColumns": [
      
            {"mData": "rid"},
            {"mData": "userinformation.userid"},
            {"mData": "asset.assetid"},
            {"mData": "shqk"},
            {"mData": "beforestate"},
            
         {
          "mData": function (row, type, val) {
              var rstate_btn = "";
              rstate_btn += '<a href="/ams/pages/repair-complete.jsp?rid=' + row.rid + '" class="text-info support-details" title="维修完成" data-id="' + row.rid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 维修完成</a>';
              return '<div class="toolmenu">' + rstate_btn + '</div>';
          }
      },
         
        ],
        "fnInitComplete": function () {
            //初始化完成回调
        },
        "fnRowCallback": function (nRow, aData, iDisplayIndex) {
        }
    });
   
});