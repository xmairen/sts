<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生成绩考评系统</title>

<link href="/skin/css/common.css" rel="stylesheet" />
<link href="/skin/css/index.css" rel="stylesheet" type="text/css" />
</head>
	<body>
	<div id="menu" class="menu leftMenu">
				<ul id="menuUl">
				<li class="menuLi hasChildren selected">
				<a class="menuLink" href="#" onclick="">
					<i class="icn icn-26 icn-menuLink icn-menu-home"></i><span>首页</span><i class="after"></i>
				</a>
				</li>
				<li class="menuLi hasChildren selected"><a class="menuLink"> <i
							class="icn icn-26 icn-menuLink icn-menu-jcwj"></i><span>试题库管理</span><i class="after"></i>
					</a>
						<ul class="subMenu" style="">
							<li class=""><a href="#" onclick="openPage('initfile.do');"><i class="icn icn-10 icn-menu-hscd"></i>
							<span>添加试题</span><i class="triangle"></i></a></li>
						</ul>
						<ul class="subMenu" style="">
							<li class=""><a href="#" onclick="openPage('initfile.do');"><i class="icn icn-10 icn-menu-hscd"></i>
							<span>删除试题</span><i class="triangle"></i></a></li>
						</ul>
						<ul class="subMenu" style="">
							<li class=""><a href="#" onclick="openPage('initfile.do');"><i class="icn icn-10 icn-menu-hscd"></i>
							<span>修改试题</span><i class="triangle"></i></a></li>
						</ul>
					</li>
					<li class="menuLi hasChildren selected"><a class="menuLink"> 
						<i class="icn icn-26 icn-menuLink icn-menu-xtgl"></i><span>试卷配置管理</span> <i class="after"></i>
					</a>
						<ul class="subMenu" style="">
							<li class=""><a href="#" onclick="openPage('initfile.do');"><i class="icn icn-10 icn-menu-hscd"></i>
							<span>试题数量管理</span><i class="triangle"></i></a></li>
						</ul>
						<ul class="subMenu" style="">
							<li class=""><a href="#" onclick="openPage('initfile.do');"><i class="icn icn-10 icn-menu-hscd"></i>
							<span>测试等级管理</span><i class="triangle"></i></a></li>
						</ul>
					</li>
					<li class="menuLi hasChildren selected"><a class="menuLink"> 
						<i class="icn icn-26 icn-menuLink icn-menu-jjgc"></i><span>信息查询</span> <i class="after"></i>
					</a>
					<ul class="subMenu" style="">
							<li class=""><a href="#" onclick="openPage('initfile.do');"><i class="icn icn-10 icn-menu-hscd"></i>
							<span>成绩查询</span><i class="triangle"></i></a></li>
						</ul>
					</li>
					
					<li class="menuLi hasChildren selected"><a class="menuLink"> 
						<i class="icn icn-26 icn-menuLink icn-menu-tjfx"></i><span>退出登陆</span> <i class="after"></i>
					</a>
					</li>
					
				</ul>
				<div class="clear"></div>
			</div>
</body>