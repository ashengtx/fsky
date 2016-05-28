
$(document).ready(function () {
    var datatables = $("#scrap_table").DataTable({
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
            "url": "scrapList.action",
            "data": function (data) {
                
            }
        },

        "aoColumns": [
      
            {"mData": "bfid"},
            {"mData": "userinformationByUserid.userid"},
            {"mData": "asset.assetid"},
           
            {
            	"mData": function (row, type, val) {
	                if (row.bfdate){
	                    var date = new Date(row.bfdate);
	                    return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
	                }
	                else{
	                	return;
	                }
            	}
            },
            
	        {
            	"mData": function (row, type, val) {
            		var usestate_btn = "";
            		usestate_btn += '<a href="/ams/pages/scrap-check.jsp?bfid=' + row.bfid + '" class="text-info support-details" title="审核" data-id="' + row.bfid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 审核</a>';
            		return '<div class="toolmenu">' + usestate_btn + '</div>';
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