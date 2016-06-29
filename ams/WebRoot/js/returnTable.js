
$(document).ready(function () {
    var datatables = $("#return_table").DataTable({
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
            "url": "returnList.action",
            "data": function (data) {
                
            }
        },

        "aoColumns": [
      
            {"mData": "lyghid"},
            {"mData": "userinformationByLyuserid.userid"},
            {"mData": "asset.assetid"},
            {
                "mData": function (row, type, val) {
                    if (row.lydate){
                        var date = new Date(row.lydate);
                        return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
                    }
                    else
                    return;
                }
            },
            
         {
          "mData": function (row, type, val) {
              var lyghstate_btn = "";
              lyghstate_btn += '<a href="/ams/pages/asset-return.jsp?lyghid=' + row.lyghid + '" class="text-info support-details" title="归还" data-id="' + row.lyghid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 归还</a>';
              return '<div class="toolmenu">' + lyghstate_btn + '</div>';
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