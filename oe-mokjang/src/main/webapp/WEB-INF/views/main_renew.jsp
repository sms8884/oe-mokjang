<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>52����Ʈ - ������</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet" type="text/css" href="/resources/css/common.css"/>
<link rel="stylesheet" type="text/css" href="/resources/css/style.css"/>
<link rel="stylesheet" type="text/css" href="/resources/css/responsive-tables.css"/>
<style>
.swipe {overflow: hidden; visibility: hidden; position: relative; }
.swipe-wrap {overflow: hidden; position: relative; }
.swipe-wrap > div { float:left; width:100%; position: relative; }
</style>

<!--<link rel="stylesheet" type="text/css" href="css/popup.html"/>-->
<script type="text/javascript" src="/resources/js/jquery.js"></script>
<script type="text/javascript" src="/resources/js/jquery-ui.js"></script>
<script type="text/javascript" src="/resources/js/selectric.js"></script>
<script type="text/javascript" src="/resources/js/icheck.js"></script>
<script type="text/javascript" src="/resources/js/ui.js"></script>
<script type="text/javascript" src="/resources/js/responsive-tables.js"></script>
    <script>
    jQuery(document).ready(function($) {
        $('#sidebar-btn').click(function() {
            $('#sidebar').toggleClass('visible');
        });
    });
    </script>
</head>

<body>

	<div id="sidebar"> 
		<ul>
			<li class="side_profie">
				<a href="#"><img src="/resources/images/button/profile_bg.png" alt="����������" style="background:url('images/button/profile.png') 0 0 repeat-x;"/></a><br/>
				<a href="#">�蹮�� ����</a> 
			</li>
			<li><a href="#">���庸�� �ۼ�</a></li>
			<li><a href="#">���庸�� ����</a></li>
			<li><a href="#">����� ����</a></li>
			<li><a href="#">�α׾ƿ�</a></li>           
		</ul>
	</div>

<!-- Wrapper -->
<div id="wrapper">

	<!-- Wrap -->
	<div id="wrap">
		<!-- Header -->
		<div id="header-wrap">		
			<div id="header">
				<h1><a href="#"><img src="/resources/images/common/logo_oneguard.png" alt="CELL PLUS ���庸�� ����"/></a></h1>
				<div class="head-info">				
					<button id="sidebar-btn" type="button" class="btn-menu">�޴�</button>				
				</div>		
			</div>
		</div>
		<!-- //Header -->
		<!-- Body-->
		<div id="container">
			
			
			<!-- Content -->
			<div id="contents">
				<!-- Top -->

				
				<div class="cont-top-tit">				
					<h2 class="h2 tit8">${sessionUserVO.deptName} ��Ȳ</h2>
					
					<!--<ul class="location">
						<li>HOME</li>
						<li>���庸�� �ۼ�</li>						
					</ul>-->
				</div>
				<!-- //Top -->
				<!-- Article -->
				<div id="content">
					<p id="cont-left-top"></p><p id="cont-left-btm"></p><p id="cont-right-top"></p>
					<div class="cont-body">
	
	
					<div class="cont-tit"><h4 class="h4">�������</h4></div>
					<!-- List -->
					<div class="list-view form">
						<div class="box-point">
							<ul>
								<li style="width:50%;">
								<em>��������</em>
								<p style="font-size:40px; color:#FF4800; font-family:'lato'; padding:15px;">1,321</p></li>
								<li style="width:50%;">
								<em>��������</em>
								<p style="font-size:40px; color:#FF7F27; font-family:'lato'; padding:15px;">22.3%</p></li>
							</ul>
						</div>
					</div>
					<!-- //List -->	

					<div class="cont-tit"><h4 class="h4">��������</h4></div>
					<!-- List -->
					<div class="list-view form">
						<div class="box-point">
							���� ���庸���� �ۼ����� �ʾҽ��ϴ�. <br />���� ���庸���� �ۼ��Ͻ÷��� �Ʒ� ��ư�� �����ϼ���.<br>
							<a href="/report/mokjang/regist.oe" class="btn type5" style="margin-top:10px;"><span>���庸�� �ۼ�</span></a>
						</div>
					</div>
					<!-- //List -->						
					<!-- Button -->
					
							<ul class="btn-list">
								<a href="report_list.html">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img01.gif"></li>
									<li class="btn-width">���庸�� ����</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end.gif"></li>
								</a>								
							</ul>			

							<ul class="btn-list">
								<a href="/user/list.oe">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img03.gif"></li>
									<li class="btn-width">����� ����</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end.gif"></li>
								</a>								
							</ul>
	
							<ul class="btn-list">
								<a href="#">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img02.gif"></li>
									<li class="btn-width">����� �⼮����</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end.gif"></li>
								</a>
							</ul>
							
							<ul class="btn-list2">
								<a href="#">
									<li style="position:absolute;"><img src="/resources/images/button/btn_img09.gif"></li>
									<li class="btn-width">�α׾ƿ�</li>
									<li style="position:absolute; right:0px;"><img src="/resources/images/button/btn_end2.gif"></li>
								</a>
							</ul>							
							
					</div>
				</div>

				
				
				
				<!-- //Article -->
			</div>
			<!-- //Content -->
		</div>
		<!-- //Body -->
	</div>
	<!-- //Wrap -->
</div>
<!-- //Wrapper -->
</body>

</html>