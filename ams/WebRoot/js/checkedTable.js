
$(document).ready(function () {
	$.ajax({
        url: 'getLastestChecked.action',
        type: 'POST',
        data: {
            
        },
        error: function () {
        },
        success: function (result) {
//        	alert(result.checked.cstate);
        	var checkid = result.checked.checkid;
        	if (result.checked.cstate == 0){
        		$(".pandian").after('<div class="col-lg-4"> <button class="btn btn-s-md btn-primary" id="endChecked" >结束盘点</button></div>');
        		//结束盘点
        		$("#endChecked").bind("click",function(){
//        			alert("test");
        			$.ajax({
        		        url: 'endChecked.action',
        		        type: 'POST',
        		        data: {
        		        	checkid:checkid
        		        },
        		        error: function () {
        		        },
        		        success: function (result) {
        		        	window.location.href = '/ams/pages/checklist.jsp';
        		        }
        		    });
        		});
        	}
        	if (result.checked.cstate == 1||result.checked.cstate == null){
        		$(".pandian").after('<div class="col-lg-4"> <button class="btn btn-s-md btn-warning" id="addChecked" >发起盘点</button></div>');
        		//发起盘点
        		$("#addChecked").bind("click",function(){
        			$.ajax({
        		        url: 'addChecked.action',
        		        type: 'POST',
        		        data: {
        		        },
        		        error: function () {
        		        },
        		        success: function (result) {
        		        	window.location.href = '/ams/pages/checklist.jsp';
        		        }
        		    });
        		});
        	}
        }
    });
    var datatables = $("#checked_table").DataTable({
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
        "aLengthMenu": [[10, 15, 20], [10, 15, 20]],
        "bStateSave": false,
        "bProcessing": true,
        "bServerSide": true,
        "sDom": "t<'row'<'col-sm-4'i><'col-sm-2'l><'col-sm-6'p>>",
        "sPaginationType": "full_numbers",
        sServerMethod: "POST",

        "ajax": {
            "url": "getCheckdetailList.action",
            "data": function (data) {
            	data.cresult = $("#cresult").val();
            }
        },

        "aoColumns": [
      
            {"mData": "cdid", 'sClass': '', "bSortable": false},
            {
                "mData": function (row, type, val) {
                	if (row.cdate){
                		return formatDate(row.cdate,"yyyy-MM-dd");
                	}
                    return "-" ;
                },
                "bSortable": false
            },
            {
                "mData": function (row, type, val) {
                	if (row.asset.assetid){
                		return row.asset.assetid;
                	}
                    return "-" ;
                },
                "bSortable": false
            },
            {
                "mData": function (row, type, val) {
                	if (row.asset.assetname){
                		return row.asset.assetname;
                	}
                    return "-" ;
                },
                "bSortable": false
            },
            {
                "mData": function (row, type, val) {
                	var result_str ="-";
                	if (row.cresult !=""||row.crsult != "undefine"){
                		switch (row.cresult){
                		case 0:result_str = "符合";break;
                		case 1:result_str = "不符";break;
                		case -1:result_str = "待盘点";break;
                		default:
                		}
                	}
                    return result_str ;
                },
                "bSortable": false
            },
        {
          "mData": function (row, type, val) {
              var btn = "";
              if (row.cresult == -1){
            	  btn += '<a href="/ams/pages/confirmCheckedDetail.action?cdid=' + row.cdid + '&cresult=0" class="text-info support-details" title="确认盘点"  data-toggle="modal"><i class="fa fa-file-text-o"></i> 符合&nbsp;&nbsp;</a>';
                  btn += '<a href="/ams/pages/confirmCheckedDetail.action?cdid=' + row.cdid + '&cresult=1" class="text-info support-details" title="确认盘点"  data-toggle="modal"><i class="fa fa-file-text-o"></i> 不符&nbsp;&nbsp;</a>';
              }
              
              return '<div class="toolmenu">' + btn + '</div>';
          },
          "bSortable": false
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

    $("#search_btn").bind("click", function () {
        datatables.ajax.reload();
    });
   
});

//日期格式化
function formatDate(date,format){
    if(date){
        var newDate = new Date(date);
        var o = {
            "MM": newDate.getMonth() + 1,
            "M": newDate.getMonth() + 1,
            "dd": newDate.getDate(),
            "d": newDate.getDate(),
            "HH": newDate.getHours(),
            "H": newDate.getHours(),
            "hh": newDate.getHours(),
            "h": newDate.getHours(),
            "mm": newDate.getMinutes(),
            "m": newDate.getMinutes(),
            "ss": newDate.getSeconds(),
            "s": newDate.getSeconds()
        };
        if(format==undefined){
            format="yyyy-MM-dd HH:mm:ss";
        }
        format = format.replace("yyyy", newDate.getFullYear() + "");
        for (var k in o)
            format = format.replace(k, (k.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        return format;
    }
    else return "";
}
