<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>KIT ADMIN</title>
    <link rel="stylesheet" href="/plugins/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/build/css/app.css" media="all">
    <script type="text/javascript" src="/build/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="/build/js/menu_min.js"></script> 	
    <script src="/plugins/layui/layui.js"></script>
    <script type="text/javascript">
  $(document).ready(function (){
	  $(".menu ul li").menu();
});
  </script>  
</head>

<body>
	
    <div class="layui-layout layui-layout-admin kit-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">Personnel 管理系统</div>
            <div class="layui-logo kit-logo-mobile">K</div>
            
            <ul class="layui-nav layui-layout-right kit-nav">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://m.zhengjinfan.cn/images/0.jpg" class="layui-nav-img"> Van
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">基本资料</a></dd>
                        <dd><a href="javascript:;">安全设置</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="javascript:;"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></li>
            </ul>
        </div>
	
		
        <div class="layui-side layui-bg-black kit-side">
            <div class="layui-side-scroll">
                <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
                 <div class="menu">
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>个人信息</span></a>
                        <ul class="layui-nav-child">
                            <li>
                                <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 综合信息</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
                                <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>信息清单</span></a>
		                            </li>
		                        </ul>
                            </li>
                            <li>
		                        <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 基本信息</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
		                        <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" data-url="/page/basic" data-icon="fa-user" data-title="基本信息" kit-target data-id='1'><i class="layui-icon" aria-hidden="true">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>基本信息</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" data-url="/page/message" data-icon="fa-user" data-title="通讯信息" kit-target data-id='2'><i class="layui-icon" aria-hidden="true">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>通讯信息</span></a>
		                            </li>
		                             
		                        </ul>
		                    </li>
		                     <li>
		                        <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 经历信息</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
		                        <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" data-url="nav.html" data-icon="&#xe628;" data-title="导航栏" kit-target data-id='3'><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>教育经历</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="列表四" kit-target data-id='4'><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>工作经历</span></a>
		                            </li>
		                        </ul>
		                    </li>
		                    <li>
                                <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 论文专著</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
                                <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>论文发表</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>专著译著</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>有效专利</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>软件著作权</span></a>
		                            </li>
		                        </ul>
                            </li>
                            <li>
		                        <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 项目支撑</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
		                        <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" data-url="/page/message" data-icon="fa-user" data-title="通讯信息" kit-target data-id='2'><i class="layui-icon" aria-hidden="true">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>科研支撑</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" data-url="/page/message" data-icon="fa-user" data-title="通讯信息" kit-target data-id='2'><i class="layui-icon" aria-hidden="true">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>技术支撑</span></a>
		                            </li>
		                        </ul>
		                    </li>
		                    <li>
		                        <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 成就荣誉</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &#xe61a;</i></a>
		                        <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" data-url="nav.html" data-icon="&#xe628;" data-title="导航栏" kit-target data-id='3'><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>任职情况</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="列表四" kit-target data-id='4'><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>荣誉称号</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" data-url="nav.html" data-icon="&#xe628;" data-title="导航栏" kit-target data-id='3'><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>兼职情况</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="列表四" kit-target data-id='4'><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>人才培养</span></a>
		                            </li>
		                        </ul>
		                    </li>
		                    <li>
                                <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 年度考核</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
                                <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分年度</span></a>
		                            </li>
		                        </ul>
                            </li>
                             <li>
		                        <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 自我评价</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
		                        <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" data-url="/page/message" data-icon="fa-user" data-title="通讯信息" kit-target data-id='2'><i class="layui-icon" aria-hidden="true">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分年度</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" data-url="/page/message" data-icon="fa-user" data-title="通讯信息" kit-target data-id='2'><i class="layui-icon" aria-hidden="true">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分季度</span></a>
		                            </li>
		                        </ul>
		                    </li>
		                    <li>
		                        <a href="javascript:;" data-url="/page/message" data-icon="fa-user" data-title="通讯信息" kit-target data-id='2'><i class="layui-icon" aria-hidden="true">&nbsp;&#xe658;</i><span>领导考评</span></a>
		                    </li>	
                        </ul>
                    </li>
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>员工管理</span></a>
                         <ul class="layui-nav-child">
                            <li>
                                <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 人员信息管理</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
                                <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>分支主题</span></a>
		                            </li>
		                        </ul>
                            </li>
                            <li>
                                <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 考勤管理</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
                                <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>事假</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>病假</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>出差</span></a>
		                            </li>
		                        </ul>
                            </li>
                            <li>
                                <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 合同管理</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
                                <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>新增</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>续签</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>终止</span></a>
		                            </li>
		                        </ul>
                            </li>
                            <li>
                                <a href="javascript:;"><i class="layui-icon">&nbsp;&#xe658;</i><span> 人员变动</span><i class="layui-icon">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &#xe61a;</i></a>
                                <ul class="layui-nav-child">
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>入职</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>离职</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>晋升</span></a>
		                            </li>
		                            <li>
		                                <a href="javascript:;" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&nbsp;&nbsp;&nbsp;&#xe602;</i><span>调动</span></a>
		                            </li>
		                        </ul>
                            </li>
                        </ul>
                    </li>
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>部门管理</span></a>
                        <ul class="layui-nav-child">
                            <li>
                                <a href="javascript:;" data-url="nav.html" data-icon="&#xe628;" data-title="导航栏" kit-target data-id='3'><i class="layui-icon">&nbsp;&#xe654;</i><span>增加</span></a>
                            </li>
                            <li>
                                <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="列表四" kit-target data-id='4'><i class="layui-icon">&nbsp;&#xe642;</i><span>调整</span></a>
                            </li>
                            <li>
                                <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="列表四" kit-target data-id='4'><i class="layui-icon">&nbsp;&#xe640;</i><span>删除</span></a>
                            </li>
                        </ul>
                    </li>
                    <li class="layui-nav-item">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span>薪酬管理</span></a>
                        <ul class="layui-nav-child">
                            <li>
                                <a href="javascript:;" data-url="nav.html" data-icon="&#xe628;" data-title="导航栏" kit-target data-id='3'><i class="layui-icon">&nbsp;&#xe65e;</i><span>薪酬表</span></a>
                            </li>
                            <li>
                                <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="列表四" kit-target data-id='4'><i class="layui-icon">&nbsp;&#xe659;</i><span>薪酬变动表</span></a>
                            </li>
                        </ul>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" data-url="/components/table/table.html" data-name="table" kit-loader><i class="fa fa-plug" aria-hidden="true"></i><span>用户权限管理</span></a>
                    </li>
                    
                </ul>
            </div>
            </div>
        </div>
        <div class="layui-body" id="container">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">主体内容加载中,请稍等...</div>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            2017 &copy;
            <a href="http://kit.zhengjinfan.cn/">kit.zhengjinfan.cn/</a> MIT license

        </div>
    </div>

   
    <script>
        var message;
        layui.config({
            base: '/build/js/'
        }).use(['app', 'message'], function() {
            var app = layui.app,
                $ = layui.jquery,
                layer = layui.layer;
            //将message设置为全局以便子页面调用
            message = layui.message;
            //主入口
            app.set({
                type: 'iframe'
            }).init();
            $('#pay').on('click', function() {
                layer.open({
                    title: false,
                    type: 1,
                    content: '<img src="/build/images/pay.png" />',
                    area: ['500px', '250px'],
                    shadeClose: true
                });
            });
        }); 
        
    </script>
</body>

</html>