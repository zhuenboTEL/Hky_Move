<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通讯信息界面</title>
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
  <div class="layui-form-item">
    <label class="layui-form-label">办公电话</label>
    <div class="layui-input-inline">
        <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
      </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">手机</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
      </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">传真</label>
    <div class="layui-input-inline">
        <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
      </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">通讯地址</label>
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
      <label class="layui-form-label">邮箱</label>
      <div class="layui-input-inline">
        <input type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
    <label class="layui-form-label">紧急联系人1电话</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
      </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">关系</label>
    <div class="layui-input-block">
      <input type="text" name="title" autocomplete="off" placeholder="请输入标题" value="小明" class="layui-input" disabled="disabled">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">紧急联系人2电话</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
      </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">关系</label>
    <div class="layui-input-block">
      <input type="text" name="title" autocomplete="off" placeholder="请输入标题" value="小明" class="layui-input" disabled="disabled">
    </div>
  </div>
  <div class="layui-form-item">
    <button class="layui-btn" lay-submit="" lay-filter="demo2" style="margin-left: 40%">修改通讯信息</button>
  </div>
</form>
</div>
</body>
<script type="text/javascript" src="/bootstrap/layui/layui.js"></script>
<script type="text/javascript">
layui.use(['form', 'layedit', 'laydate'], function(){
	  var form = layui.form
	  ,layer = layui.layer
	  ,layedit = layui.layedit
	  ,laydate = layui.laydate;
	  
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
	  form.render();
	});
</script>
</html>