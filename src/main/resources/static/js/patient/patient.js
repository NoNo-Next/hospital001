
$(function () {
        $('#table').bootstrapTable({
            url: '${pageContext.request.contextPath}/patient/getPatient',//访问后台（json）的地址
            pagination: true,//允许分页
            search: true,//可以搜索
            toolbar: '#toolbar', //工具按钮用哪个容器
            pageSize: 5,//每页显示5条数据
            pageList: [ 5,6,7, 8],//每页显示的条数列表
            showColumns: true,//选择显示的列
            showRefresh: true,//允许刷新
            showExport: true,//允许导出
            exportDataType: 'all',
            exportTypes: ['txt', 'doc', 'excel'],
            columns: [
                {
                    field: 'patientid',//字段名称    对应json中的key
                    align: 'center',
                    valign: 'middle',
                    title: '编号'
                }, {
                    field: 'name',
                    align: 'center',
                    valign: 'middle',
                    title: '病人姓名'
                }, {
                    field: 'sex',
                    align: 'center',
                    valign: 'middle',
                    title: '性别'

                }, {
                    field: 'birthday',
                    align: 'center',
                    valign: 'middle',
                    title: '出生日期'
                }, {
                    field: 'age',
                    align: 'center',
                    valign: 'middle',
                    title: '年龄'
                }, {
                    field: 'marrage',
                    align: 'center',
                    valign: 'middle',
                    title: '婚姻状况'
                }, {
                    field: 'nation',
                    align: 'center',
                    valign: 'middle',
                    title: '民族'
                }, {
                    field: 'patientcard',
                    align: 'center',
                    valign: 'middle',
                    title: '身份证号'
                }, {
                    field: 'birthplace',
                    align: 'center',
                    valign: 'middle',
                    title: '出生地'
                },  {
                    field: 'telephone',
                    align: 'center',
                    valign: 'middle',
                    title: '电话'
                }, {
                    title: '操作',
                    align: 'center',
                    valign: 'middle',
                    formatter: function (value, row, index) {
                        var updateButton = "<button  onclick=\"myUpdateClick(" + row.patientid + ")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
                        var checkButton = "<button  onclick=\"myCheckClick("+row.patientid+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-check\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
                        var deleteButton = "<button onclick=\"myDeleteClick(" + row.patientid + ")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
                        return checkButton+updateButton + deleteButton;
                    }
                }
            ]
        })

        $("#btn_add").click(function () {

            //模态框清空内容
            var engine = $('#myAddForm select[name="nation1"]');
            var input1 = $('#myAddForm input[name="nation"]');
            addNation(engine,input1);//民族下拉列表
            //alert("添加用户了");
            $('#myAddModal').modal().on('shown.bs.modal', function () {

            })
        })
    })

// 查看框赋值
function  myCheckClick(patientid) {
    $.ajax({
        type: "post",//请求方式
        url: "${pageContext.request.contextPath}/patient/getinfoByid",//根据编号查询用户的信息
        data: {patientid: patientid},//传参数到后台
        dataType: "json",//以json格式传递数据
        success: function (data) {
            //data：指后台查询后返回来的用户信息
            $('#myCheckModal').modal().on('shown.bs.modal',
                function () {
                    $("#myCheckForm input[name ='name']").val(data.name);
                    $("#myCheckForm select[name ='sex']").val(data.sex);
                    $("#myCheckForm select[name ='marrage']").val(data.marrage);
                    $("#myCheckForm input[name ='birthday']").val(data.birthday);
                    $("#myCheckForm input[name ='patientcard']").val(data.patientcard);
                    $("#myCheckForm input[name ='age']").val(data.age);
                    $("#myCheckForm input[name ='telephone']").val(data.telephone);
                    $("#myCheckForm input[name ='birthplace']").val(data.birthplace);
                    $("#myCheckForm input[name ='nation']").val(data.nation);
                    $("#myCheckForm input[name ='address']").val(data.address);
                    $("#myCheckForm input[name ='contactsname']").val(data.contactsname);
                    $("#myCheckForm input[name ='contactsnum']").val(data.contactsnum);
                })
        }
    })
}

/* 修改赋值  */
function myUpdateClick(patientid) {
    $.ajax({
        type: "post",//请求方式
        url: "${pageContext.request.contextPath}/patient/getinfoByid",//根据编号查询用户的信息
        data: {patientid: patientid},//传参数到后台
        dataType: "json",//以json格式传递数据
        success: function (data) {
            //模态框清空内容
            var engine = $('#myUpdateForm select[name="nation1"]');
            var input1 = $('#myUpdateForm input[name="nation"]');
            addNation(engine,input1);//民族下拉列表
            //data：指后台查询后返回来的用户信息

            $('#myUpdateModal').modal().on('shown.bs.modal',
                function () {
                    $("#myUpdateForm input[name ='name']").val(data.name);
                    $("#myUpdateForm select[name ='sex']").val(data.sex);
                    $("#myUpdateForm select[name ='marrage']").val(data.marrage);
                    $("#myUpdateForm input[name ='birthday']").val(data.birthday);
                    $("#myUpdateForm input[name ='patientcard']").val(data.patientcard);
                    $("#myUpdateForm input[name ='age']").val(data.age);
                    $("#myUpdateForm input[name ='telephone']").val(data.telephone);
                    $("#myUpdateForm input[name ='birthplace']").val(data.birthplace);
                    $("#myUpdateForm input[name ='nation']").val(data.nation);
                    $("#myUpdateForm input[name ='address']").val(data.address);
                    $("#myUpdateForm input[name ='contactsname']").val(data.contactsname);
                    $("#myUpdateForm input[name ='contactsnum']").val(data.contactsnum);
                })
        }
    })
}

function updatepatient() {

    //获取表单中的所有值
    var data = $("#myUpdateForm").serializeArray();
    $.ajax({
        type: 'post',//提交方式
        url: '${pageContext.request.contextPath}/patient/updateinfo',//修改的地址
        data: data,
        dataType: 'json',
        success: function (data) {
            location.reload(true);
        }
    })

}


function myDeleteClick(patientid) {
    if (confirm("确定要删除么？？？")) {
        var patientid = patientid;

        $.ajax({
            type: "post",//请求方式
            url: "${pageContext.request.contextPath}/patient/delPatient",//根据编号查询用户的信息
            data: {patientid: patientid},//传参数到后台
            dataType: "json",//以json格式传递数据
            success: function (data) {
                if(data > 0) {
                    alert("删除成功")
                    location.reload(true);
                }else{
                    alert("删除失败")
                }
            }
        })
    }

}

function addUser() {
    var data = $("#myAddForm").serializeArray();
    alert(data);
    $.ajax({
        type: 'post',//提交方式
        url: '${pageContext.request.contextPath}/patient/addPatient',
        data: data,
        dataType: 'json',
        success: function (data) {
            if (data > 0) {
                alert("添加成功")
                location.reload(true);
            } else {
                alert("添加失败")
            }

        }
    })
}

function addNation(engine,input1){
        //获取select
//			var engine = $('select[name="EngineModel"]');
//			var input1 = input1;
        var weith = "";
        var str = engine.attr("style");
        weith = "width:94%;z-index:10;";
        str = str+weith;
        engine.attr("style",str)
        //页面加载，初始赋值select选项
        /*$.get('engines.aspx', functsion(engineModels) {
            engines = eval(engineModels);
            for(var i = 0; i < engines.length; i++) {
                engine.append('<option>' + engines[i].Model + '</option>');
            }
        })*/
        var engines = ["汉族","蒙古族","回族","藏族","维吾尔族","苗族","彝族","壮族","布依族","朝鲜族","满族","侗族","瑶族","白族","土家族",
            "哈尼族","哈萨克族","傣族","黎族","傈僳族","佤族","畲族","高山族","拉祜族","水族","东乡族","纳西族","景颇族","柯尔克孜族",
            "土族","达斡尔族","仫佬族","羌族","布朗族","撒拉族","毛南族","仡佬族","锡伯族","阿昌族","普米族","塔吉克族","怒族", "乌孜别克族",
            "俄罗斯族","鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族"];

        for(var i in engines) {
            engine.append('<option>' + engines[i] + '</option>');
        }

        //select的change事件，选中的值赋给input
        input1.change(function() {
            input1.value =engine.options[input1.selectedIndex].value;
        })

        //可编辑select具体实现
        var focus = false;
        input1.focus(function() {
            focus = true;
            $(this).next().css('display', 'block');
        }).blur(function() {
            if(focus) {
                $(this).next().css('display', 'none');
            }
        }).keyup(function() {
            var queryCondition = input1.val().toLowerCase();
            if(queryCondition.length != 0) {
                engine.empty();
                for(var i in engines) {
                    if(engines[i].toLowerCase().indexOf(queryCondition) != -1) {
                        engine.append('<option>' + engines[i] + '</option>');
                    }
                }
            } else {
                for(var i in engines) {
                    engine.append('<option>' + engines[i] + '</option>');
                }
            }
        }).next().mousedown(function() {
            focus = false;
        }).change(function() {
            $(this).css('display', 'none').prev().val(this.value);
        });
}