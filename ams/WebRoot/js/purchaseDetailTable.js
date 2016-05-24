
$(document).ready(function () {
    var datatables = $("#purchasedet_table").DataTable({
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
            "url": "purchasedetailList.action",
            "data": function (data) {
            	data.purid=$("#purid").val();
            	//data.assetname=$("#assetname").val();
            }
        },
        
        "aoColumns": [
      
            {"mData": "pdid"},
            {"mData": "assetclassByAssetclassid.assetclassid"},
            {"mData": "purchase.purid"},
            {"mData": "userinformation.userid"},
            {"mData": "assetclassByPassetclassid.assetclassid"},
            {"mData": "assetname"},
            {"mData": "price"},
      
	        {
	          "mData": function (row, type, val) {
	              var purdet_btn = "";
	              purdet_btn += '<a href="/ams/getPurD.action?pdid=' + row.pdid + '" class="text-info support-details" title="查看采购单明细" data-id="' + row.pdid + '" data-toggle="modal"><i class="fa fa-file-text-o"></i> 查看采购单明细</a>';
	              return '<div class="toolmenu">' + purdet_btn + '</div>';
	          }
	        },
         
        ],
        
    });
    $("#purchase_table_filter").click(function (event) {
    	alert('ahhahahhahahah');
    });
});
$(function(){
	$("#purchase_table_filter").click(function (event) {
		alert("success");
	});
}) 