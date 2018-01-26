<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/bootstrap/layui/css/layui.css">
<script type="text/javascript" src="/bootstrap/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/bootstrap/js/menu_min.js"></script>
<script type="text/javascript" src="/bootstrap/layui/layui.js"></script>
<script type="text/javascript">
$(document).ready(function (){
  $(".menu ul li").menu();
});
</script>
</head>
<body>
<center>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="menu">
	
	
 <ul class="layui-nav layui-nav-tree layui-bg-cyan layui-inline" lay-filter="demo">
        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">默认展开</a>
            <ul class="layui-nav-child">
                <li><a href="javascript:;">选项一</a>
                	<ul class="layui-nav-child">
                		<li><a href="#">三级菜单</a></li>
                		<li><a href="#">三级菜单</a></li>
                		<li><a href="#">三级菜单</a></li>
                	</ul>
                </li>
                <li><a href="javascript:;">选项二</a></li>
                <li><a href="javascript:;">选项三</a></li>
            </ul>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="">移动模块</a></dd>
                <dd><a href="">后台模版</a></dd>
                <dd><a href="">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">云市场</a></li>
        <li class="layui-nav-item"><a href="">社区</a></li>
    </ul>
    </div>
    </center>
    <script type="text/javascript">
   /*  layui.use('element', function() {
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

        //监听导航点击
        element.on('nav(demo)', function(elem) {
            //console.log(elem)
            layer.msg(elem.text());
        });
    }); */
    </script>
</body>
</html>