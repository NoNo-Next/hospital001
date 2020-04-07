<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

  <%@ include file="../common/commoncss.jsp" %>
  <%@ include file="../common/commonjs.jsp" %>
</head>
<body>
  <div id="toolbar" style="float: left;width: 100%;">
    <button id="btn_add" type="submit" class="btn btn-default">
      <span class="glyphicon glyphicon-plus" style="color: rgb(0, 0, 0); font-size: 16px;margin-top: -5px;">&nbsp;添加</span>
    </button>
  </div>
  <table id="table">
</table>

  <!-- 修改模态框（Modal） -->
  <div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
          <div class="modal-content">
              <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                  <h4 class="modal-title" id="myModalLabel">修改库存信息</h4>
              </div>
              <div class="modal-body">

                  <form id="myUpdateForm" class="form-horizontal">
                      <!-- 隐藏框传值 -->
                      <input type="hidden" name="drugsid" id="drugsid">
                      <div class="form-group">
                          <label for="drugsname" class="col-sm-2 control-label">药品名称:</label>
                          <div class="col-sm-10">
                              <input  type="text"   id="drugsname" name="drugsname"  class="form-control"  >
                          </div>
                      </div>

                      <div class="form-group">
                          <label for="price" class="col-sm-2 control-label">药品价格:</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" name="price" id="price" placeholder="请输入">
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="amount" class="col-sm-2 control-label">药品数量:</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" name="amount" id="amount" placeholder="请输入">
                          </div>
                      </div>

                  </form>
              </div>
              <div class="modal-footer">
                  <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                  <button onclick="updateDrugs()" type="button" class="btn btn-primary">修改</button>
              </div>
          </div><!-- /.modal-content -->
      </div><!-- /.modal -->
  </div>

  <!-- 添加模态框（Modal） -->
  <div class="modal fade" id="myAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
          <div class="modal-content">
              <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                  <h4 class="modal-title" id="myModalLabel">添加用户</h4>
              </div>
              <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">

                      <div class="form-group">
                          <label for="drugsname" class="col-sm-2 control-label">药品名称:</label>
                          <div class="col-sm-10">
                              <input  type="text"   id="drugsname" name="drugsname"  class="form-control"  >
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="price" class="col-sm-2 control-label">药品价格:</label>
                          <div class="col-sm-10">
                              <input  type="text"   id="price" name="price"  class="form-control"  >
                          </div>
                      </div>

                      <div class="form-group">
                          <label for="amount" class="col-sm-2 control-label">药品数量:</label>
                          <div class="col-sm-10">
                              <input  type="text"   id="amount" name="amount"  class="form-control"  >
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="manufacturedate" class="col-sm-2 control-label">生产日期:</label>
                          <div class="col-sm-10">
                              <input  type="text"   id="manufacturedate" name="manufacturedate"  class="form-control"  >
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="guaranteetime" class="col-sm-2 control-label">保质期:</label>
                          <div class="col-sm-10">
                              <input  type="text"   id="guaranteetime" name="guaranteetime"  class="form-control"  >
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="supplierid" class="col-sm-2 control-label">供应商编号:</label>
                          <div class="col-sm-10">
                              <select  id="mysupid"  class="form-control" name="supplierid" >
                                  <option>123</option>
                              </select>
                          </div>
                      </div>

                      <div class="form-group">
                          <label for="suppliername" class="col-sm-2 control-label">供应商名称:</label>
                          <div class="col-sm-10">
                              <input  type="text"   id="addsuppliername" name="suppliername"  class="form-control"  readonly="true">
                          </div>
                      </div>
                  </form>
              </div>
              <div class="modal-footer">
                  <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                  <button onclick="addDrugs()" type="button" class="btn btn-primary">添加</button>
              </div>
          </div>
      </div>
  </div>

<script type="text/javascript">
  $(function(){
	  $('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/DrugStorage/getAllDrugStorage',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
          toolbar: '#toolbar', //工具按钮用哪个容器
		  pageSize:5,//每页显示5条数据
		  pageList:[5,6,7,8],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [
		  {
		    field: 'drugstorageid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    title: '编号'
		  }, {
		    field: 'drugsstrongname',
		    align: 'center',
		    valign:'middle',
		    title: '药库名'
		  }, {
			  field: 'drugstorageid',
			    align: 'center',
			    valign:'middle',
			    title: '药品名称'
		  }, {
			    field: 'drugsnum',
			    align: 'center',
			    valign:'middle',
			    title: '药品库存'
			  },{
              title:'操作',
              align: 'center',
              valign:'middle',
              formatter:function(value,row,index){
                var updateButton = "<button  onclick=\"myUpdateClick("+row.drugstorageid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
                //var authorityButton = "<button  onclick=\"myAuthorityClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
                var deleteButton = "<button onclick=\"myDeleteClick("+row.drugstorageid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
                return updateButton+deleteButton;
              }
            }
			  ]
		})
  })
    /*删除*/
    function myDeleteClick(id) {

        if (confirm("确定要删除么？？？")){
            $.ajax({
                type:"post",//请求方式
                url:"${pageContext.request.contextPath}/DrugStorage/delDsById",//根据编号查询供应商
                data:{dsid:id},//传参数到后台
                dataType:"json",//以json格式传递数据
                success:function(data){
                    if(data > 0){
                        alert("删除成功");
                        //刷新页面
                        $("#table").bootstrapTable("refresh");
                    }else{
                        alert("删除失败")
                    }
                }
            })
        }
    }
</script>
</body>
</html>