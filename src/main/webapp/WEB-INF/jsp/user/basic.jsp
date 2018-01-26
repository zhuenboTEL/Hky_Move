<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人基本信息</title>
<link href="/bootstrap/layui/css/layui.css" rel="stylesheet">
</head>
<body>
<div style="margin-top: 20px;margin-left: 25%;margin-right: 25%">
  <form class="layui-form layui-form-pane" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">用户名</label>
    <div class="layui-input-block">
      <input type="text" name="title" autocomplete="off" placeholder="请输入标题" value="小明" class="layui-input" disabled="disabled">
    </div>
  </div>
  <div class="layui-form-item" pane="" class="layui-form" lay-filter="test1">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-block" class="layui-form">
      <input type="radio" name="sex" value="nan" title="男" checked="checked">
	  <input type="radio" name="sex" value="nv" title="女" >
	  <input type="radio" name="sex" value="" title="中性" disabled>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">出生日期</label>
    <div class="layui-input-inline">
      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" value="1998-06-09	" class="layui-input" disabled="disabled">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">民族</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled">
        <option value="0">汉</option>
      </select>
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">籍贯</label>
    <div class="layui-input-inline">
      <select name="quiz1" disabled="disabled">
        <option value="">请选择省</option>
        <option value="浙江" selected="">浙江省</option>
        <option value="你的工号">江西省</option>
        <option value="你最喜欢的老师">福建省</option>
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="quiz2" disabled="disabled">
        <option value="">请选择市</option>
        <option value="杭州">杭州</option>
        <option value="宁波" disabled="">宁波</option>
        <option value="温州">温州</option>
        <option value="温州">台州</option>
        <option value="温州">绍兴</option>
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="quiz3" disabled="disabled">
        <option value="">请选择县/区</option>
        <option value="西湖区">西湖区</option>
        <option value="余杭区">余杭区</option>
        <option value="拱墅区">临安市</option>
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">出生地</label>
    <div class="layui-input-inline">
      <select name="quiz1" disabled="disabled">
        <option value="">请选择省</option>
        <option value="浙江" selected="">浙江省</option>
        <option value="你的工号">江西省</option>
        <option value="你最喜欢的老师">福建省</option>
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="quiz2" disabled="disabled">
        <option value="">请选择市</option>
        <option value="杭州">杭州</option>
        <option value="宁波" disabled="">宁波</option>
        <option value="温州">温州</option>
        <option value="温州">台州</option>
        <option value="温州">绍兴</option>
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="quiz3" disabled="disabled">
        <option value="">请选择县/区</option>
        <option value="西湖区">西湖区</option>
        <option value="余杭区">余杭区</option>
        <option value="拱墅区">临安市</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label" style="width: 120px">参加工作时间</label>
    <div class="layui-input-inline">
      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" value="1998-06-09	" class="layui-input" disabled="disabled">
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">政治面貌</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled">
        <option value="0">中共党员</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">入党时间</label>
    <div class="layui-input-inline">
      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" value="1998-06-09	" class="layui-input" disabled="disabled">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">技术职务</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled" >
        <option value="0">写作</option>
      </select>
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">取得时间</label>
    <div class="layui-input-inline">
      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" value="1998-06-09	" class="layui-input" disabled="disabled">
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">聘任时间</label>
    <div class="layui-input-inline">
      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" value="1998-06-09	" class="layui-input" disabled="disabled">
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">技术等级</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled" >
        <option value="0">专业技术十三级</option>
      </select>
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">行政级别</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled" >
        <option value="0">正局级</option>
      </select>
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">研究领域</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled" >
        <option value="0">其他研究</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">专业特长</label>
    <div class="layui-input-block">
      <input type="text" name="title" autocomplete="off" placeholder="请输入标题" value="小明" class="layui-input" disabled="disabled">
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">最高学历</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled" >
        <option value="0">博士研究生</option>
      </select>
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">最高学位</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled" >
        <option value="0">学士</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">身份证号</label>
    <div class="layui-input-block">
      <input type="text" name="title" autocomplete="off" placeholder="请输入标题" value="小明" class="layui-input" disabled="disabled">
    </div>
  </div>
   <div class="layui-form-item" pane="" class="layui-form" lay-filter="test1">
    <label class="layui-form-label">留学经历</label>
    <div class="layui-input-block" class="layui-form">
      <input type="radio" name="sex" value="nan" title="有" checked="checked">
	  <input type="radio" name="sex" value="nv" title="无" >
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">外语水平</label>
    <div class="layui-input-block" style="width: 100px">
      <select name="interest" lay-filter="aihao" disabled="disabled" >
        <option value="0">学士</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <button class="layui-btn" lay-submit="" lay-filter="demo2" style="margin-left: 40%">修改基本信息</button>
  </div>
</form>
</div>
</body>
<script type="text/javascript" src="/bootstrap/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/bootstrap/layui/layui.js"></script>
<script type="text/javascript">
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  form.render(null,"test1"); //更新全部
  //日期
  laydate.render({
    elem: '#date'
  });
  laydate.render({
    elem: '#date1'
  });
  
  //创建一个编辑器
  var editIndex = layedit.build('LAY_demo_editor');
 
  //自定义验证规则
  form.verify({
    title: function(value){
      if(value.length < 5){
        return '标题至少得5个字符啊';
      }
    }
    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
    ,content: function(value){
      layedit.sync(editIndex);
    }
  });
  
  //监听指定开关
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });
  
  //监听提交
  form.on('submit(demo1)', function(data){
    layer.alert(JSON.stringify(data.field), {
      title: '最终的提交信息'
    })
    return false;
  });
  
});
</script>
</html>