<!doctype html>
<html lang="en">
<head>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>student index</title>


<style type="text/css">
* {
	font-family: 微软雅黑;
}

#top {
	padding-top: 0;
	padding-left: 286px;
	position: relative;
}

.u {
	position: absolute;
	left: 0px;
}

#sideNav {
	text-align: center;
	position: fixed;
	top: 0px;
	left: 0;
	display: flex;
	width: 17rem;
	height: 100vh;
}

.nav-link {
	color: rgba(10, 10, 255, .5);
	display: block;
}

#sideNav .navbar-brand {
	display: flex;
	margin: auto auto 0;
	padding: 0.5rem;
}

.d-lg-block {
	display: block;
}

.container-fluid {
	width: 100%;
	padding-right: 15px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
}

.embed-responsive {
	position: absolute;
	left: 10px;
}

.fade {
	background-image: url(../picture/baoming-01.jpg);
}
</style>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" href="../css/fileinput.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/holder.min.js"></script>
<script src="../js/fileinput.js"></script>
<script src="../js/bootstrap-paginator.js"></script> 
</head>

<body data-spy="scroll" data-target="#navbarSupportedContent" data-offset="50" id="top">
	<nav class="navbar navbar-expand-lg navbar-dark bg-success fixed-top " id="sideNav" style="width: 272px; weight: 576px;">
		<a class="navbar-brand js-scroll-trigger" href="#page-top" style="width: 176px; weight: 184px;"> 
		<span class="d-block d-lg-none  mx-0 px-0"><img src="" alt="" class="img-fluid"></span> 
		<span class="d-none d-lg-block" >  <img class="img-fluid img-profile rounded-circle mx-auto mb-2" src="${userInfo.sportaid}" 
		 width="110px" height="140px" style="position: absolute;  top: 20px; left:140px;">
		</span>
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse flex-column"
			id="navbarSupportedContent" style="width: 240px; weight: 240px;">
			<ul class=" nav nav-navbar  nav-tabs flex-column"
				style="position: absolute; top: 200px; align: center;">
				<li class="nav-item "><a
					class="nav-link js-scroll-trigger" href="#begin">首页<br />
				</a></li>
				<li class=" nav-item "><a class="nav-link js-scroll-trigger"
					href="#mydate">我的资料 </a></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#teammessage"> 我的团队 </a></li>
				<li class="nav-item"><a
					class=" nav-link js-scroll-trigger btn btn-primary btn-link"
					data-toggle="modal" data-target="#tijiaozuopin"
					data-whatever="@getbootstrap">提交作品</a></li>
				<li class="nav-item"><a
					class=" nav-link js-scroll-trigger btn btn-primary btn-link"
					data-toggle="modal" data-target="#exampleModal"
					data-whatever="@getbootstrap">创建团队</a></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#allteam"> 所有参赛团队 </a></li>
				<li><br></li>
				<!-- <li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#awards"> 获奖情况 </a></li>
				<li><br></li> -->
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#awardsmessage"> 大赛奖项设置</a></li>
				<li><br></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#download"> 下载相关文件 </a></li>
				<li><br></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#checkout"> 查看主办方信息</a></li>
			</ul>
		</div>
	</nav>
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel" style="color: red" ><b>创建我的战队</b></h4>
				</div>
				<div class="modal-body">
					<c:choose>
						<c:when test="${empty myTeamInfo}">
							<form action="${pageContext.request.contextPath}/team/add" method="post">
						<table class="from-group">
							<tr>
								<td class="active"><label>组长:</label><input type="hidden" name="sno" value="${userInfo.sno}" /></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="姓名" id="headname" name="headname"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>班级:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：软件1701" id="headclass" name="headclass"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>电话:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：12345678" id="headtel" name="headtel"
									autofocus="autofocus" maxlength="20" /></td>
							</tr>
							<tr>
								<td><br></td>
							</tr>
							<tr>
								<td class="active"><label>组员:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="姓名" id="firstname" name="onename"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>班级:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：软件1701" id="firstclass" name="oneclass"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>电话:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：12345678" id="firsttel" name="onephone"
									autofocus="autofocus" maxlength="20" /></td>
							</tr>
							<tr>
								<td><br></td>
							</tr>
							<tr>
								<td class="active"><label>组员:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="姓名" id="secondname" name="twoname"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>班级:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：软件1701" id="secondclass" name="twoclass"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>电话:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：12345678" id="secondtel" name="twophone"
									autofocus="autofocus" maxlength="20" /></td>
							</tr>
							<tr>
								<td><br></td>
							</tr>
							<tr> 
								<td class="active"><label>组员:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="姓名" id="threename" name="threename"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>班级:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：软件1701" id="threeclass" name="threeclass"
									autofocus="autofocus" maxlength="20" /></td>
								<td class="active"><label>电话:</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="text"
									placeholder="如：12345678" id="headtel" name="threephone"
									autofocus="autofocus" maxlength="20" /></td>
								</tr>
								<tr>
									<td><br></td>
								</tr>
								<tr>
									<td class="active"><label>组员:</label></td>
									<td>&nbsp; &nbsp;</td>
									<td><input class=" form-control" type="text"
										placeholder="姓名" id="fourname" name="fourname"
										autofocus="autofocus" maxlength="20" /></td>
									<td class="active"><label>班级:</label></td>
									<td>&nbsp; &nbsp;</td>
									<td><input class=" form-control" type="text"
										placeholder="如：软件1701" id="fourclass" name="fourclass"
										autofocus="autofocus" maxlength="20" /></td>
									<td class="active"><label>电话:</label></td>
									<td>&nbsp; &nbsp;</td>
									<td><input class=" form-control" type="text"
										placeholder="如：12345678" id="fourtel" name="fourphone"
										autofocus="autofocus" maxlength="20" /></td>
								</tr>
							</table>
							<br />
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary" >创建</button>
						</div>
						</form>
						</c:when>
						<c:otherwise>
							<h1>您已经有战队啦！</h1>
						</c:otherwise>
					</c:choose>
				</div>
				
				
				
			</div>
		</div>
	</div>

	<div class="modal" id="tijiaozuopin" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content" style="background-color: #59577b;">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="tijiaozuopin2">作品提交</h4>
				</div>
				<div class="modal-body">
						<c:choose>
							<c:when test="${not empty myTeamInfo}">
								<form action="${pageContext.request.contextPath}/work/add" method="post" enctype="multipart/form-data">
									<table class="from-group">
										<tr>
											<td><br></td>
										</tr>
										<tr>
											<td><label>团队ID:</label></td>
											<td>&nbsp; &nbsp;</td>
											<td><input class=" form-control" type="text" id="teamid" name="teamid" 
												 value="${myTeamInfo.teamid}" maxlength="8" />
											</td>
										</tr>
										<tr>
											<td><br></td>
										</tr>
										<tr>
											<td><label>作品名称:</label></td>
											<td>&nbsp; &nbsp;</td>
											<td><input class=" form-control" type="text"
											 placeholder="参赛作品名" id="workname" name="workname"  /></td>
										</tr>
										<tr>
											<td><br></td>
										</tr>
										<tr>
											<td><label>第一作者:</label></td>
											<td>&nbsp; &nbsp;</td>
											<td><input class=" form-control" type="text"
												placeholder="姓名" id="firstwriter" name="firstwriter" />
												<input type="hidden" name="sno" value="${userInfo.sno}" />
											</td>
										</tr>
									</table>
								  <label>报名类别:</label> 		  
				                    <select  class="form-control" name="tmid" id="tmid">
								         <option value="--请选择参赛类别--">--请选择参赛类别--</option>
								         <c:forEach items="${allMatchType}" var="Ttype">
								         	<option value="${Ttype.tmid}">${Ttype.mname}</option>
								         </c:forEach>
								   </select>
									<div class="from-group">
										<label for="exampleInputFile">请打包上传您的作品压缩包</label> 
										<input class="file" type="file" id="fileupload" name="fileupload" accept="file">
									</div>
									<br />
									<div class="from-group">
									</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
									<button type="submit" class="btn btn-primary" onclick="getdata();" >提交</button>
								
								<script type="text/javascript">
								      function getdata(){
									     alert("作品提交成功！"); 
									  } 
								</script>
								
								</div>
								
								

								</form>
							</c:when>
							<c:otherwise>
								<h1> <div style="color: write">您还未组建团队哦~</div></h1> 
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								</div>
							</c:otherwise>
						</c:choose>
				</div>
				
			</div>
		</div>
	</div>






	<style type="text/css">
	
	
	
#tijiaozuopin {
	background-image: url(../picture/baoming-01.jpg);
}

.col-8 {
	height: 900px;
}

.one {
	height: 800px;
	background-image: url(../picture/bg-student-01.jpg);
}

.tw {
	height: 800px;
	
	background-image: url(../picture/bg-student-02.jpg);
}

.three {
	height: 800px;
	background-color: #286090;
}

.four {
	height: 800px;
	background-image: url(../picture/bg-getawards-01.jpg);
}

.five {
	height: 900px;
	background-image: url(../picture/bg-student-04.jpg);
}

.six {
	height:1000px;
}

.seven {
	height: 900px;
	background-color: #286090;
}

#begin {
	height: 900px;
}

#if {
	height: 800px;
}

	  
</style>
	<div class="col-sm-12 ">
		<div id="begin" class="bg-info begin">
			<div class="embed-responsive embed-responsive-4by3">
				<!--  ceshi-->

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>index</title>
  <style>
    *{
      font-family: 微软雅黑;
    }
    body{
      padding-top:15px;
	
    }
	#Table{
	  
	    border-color :blue;
		}
		#divv{
		width : 994px;
		height :600px;
	    background-image :url(picture/login-bg-01.jpg);
	}
  </style>
 

<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" date-interval="2000" ">
  <!-- Indicators -->
   <div class="carousel-indicators" style="width:100%; height:60px;  position: relative;left: 860px; top:530px;">
     <img data-target="#carousel-example-generic" data-slide-to="0" class="active" src="../picture/bg-begin-01.jpg" alt="" style="width:60px; height；60px;">
    <img data-target="#carousel-example-generic" data-slide-to="1" src="../picture/bg-begin-02.jpg" alt="" style="width:60px; height；60px;">
    <img data-target="#carousel-example-generic" data-slide-to="2" src="../picture/bg-begin-03.jpg" alt="" style="width:60px; height；60px;">
    <img data-target="#carousel-example-generic" data-slide-to="3" src="../picture/bg-begin-04.jpg" alt="" style="width:60px; height；60px;">
  </div>
  <!-- Wrapper for slides -->
<div class="row r" style="position: absolute;left: 0px; top:0px;">
 <div class="col-md-12">
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="../picture/bg-begin-01.jpg" alt="" style="width:1522px;">
      <div class="carousel-caption">
         <p></p>
      </div>
    </div>
    <div class="item">
      <img src="../picture/bg-begin-02.jpg" alt="" style="width:1522px;">
      <div class="carousel-caption">
       <p></p>
      </div>
    </div>
    <div class="item">
	<img src="../picture/bg-begin-03.jpg" alt="" style="width:1522px;">
      <div class="carousel-caption">
       <p></p>
      </div>
  </div>
  <div class="item">
	<img src="../picture/bg-begin-04.jpg" alt="" style="width:1522px;">
      <div class="carousel-caption">
       <p></p>
      </div>
  </div>
   </div><!-- carousel-inner-->
   
     <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next" >
       <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>   
    </a>  
	 <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev" >
         <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>  
     </a>
  </div><!--r col-md-12-->
   </div > <!--r rwo-->
   </div><!--carousel slide-->
	    
    <div class="row" style=" position: absolute;left: 15px;top: 735px;"> 
      <div class="col-md-9"> 
	   <div style=" width:800px; background-color:#ADD8E6;"> <p> 江西农业大学（Jiangxi Agricultural University）位于江西省省会——英雄城南昌市，是一所以农为优势、以生物技术为特色、历史悠久、特色鲜明、多学科协调发展的全国重点大学。 

学校是中国首批具有学士学位和硕士学位授予权单位之一、具有博士学位授予权高校，1962年开展研究生教育，是江西省最早进行研究生培养的高等学府，拥有“推荐免试研究生”资格。学校是中华人民共和国农业部、林业局 与江西省人民政府三方重点支持的省部共建高校，江西省核心建设的四所重点大学之一。入选国家“中西部高校基础能力建设工程”，国家首批卓越农林人才教育培养计划，国家“2011计划”，江西省“卓越工程师教育培养计划”，是教育部、科技部决定联合开展高等学校新农村发展研究院建设高校。

截至2018年5月，现设有17个学院，有全日制在校生28000余人（含独立学院）。学科涵盖农、理、工、经、管、文、法、教、艺等9大门类。有在职教职工1600余人，具有博士、硕士学位人员占教师总数的80%以上。</p>
        </div>
	  </div>
	  
	  <div class="col-md-3">
	    <div><a href="http://www.jxau.edu.cn/" target="_Blank"><h4 class="title">了解更多农大信息</h4></a></div>
	    <div><a href="http://ruanjianxy.jxau.edu.cn/" target="_Blank"><h4 class="title">了解更多农大软件学院信息</h4></a></div>
	    <div><a href=" http://jwc.jxau.edu.cn/" target="_Blank"><h4 class="title">江西农大教务处</h4></a></div>
      </div><!-- r col-md-3-->
      
	   </div>
	   

	    
	    
 </body>
 
 

 
<script type="text/javascript">
  
$(function () { 
      $('#myTabs a:first').tab('show'); //初始化显示哪个tab 
	  
      $('#myTab a').click(function (e) { 
	  
      e.preventDefault();//阻止a链接的跳转行为 
	  
      $(this).tab('show');//显示当前选中的链接及关联的content 
}) 
}) 
</script>
				<!--  ceshi-->

			</div>
		</div>
<style  type="text/css">	
	#shione{
	 text-shadow: 5px 5px 5px #FF0000;
	color:#6495ED;
	  height:50px;
	}
	#shitwo{
	 text-shadow: 5px 5px 5px #FF0000;
	 color:#6495ED;
	  height:50px;
	}
	#shithree{
	text-shadow: 5px 5px 5px #FF0000;
	color:#6495ED;
	  height:50px;
	}
	#shifour{
	 text-shadow: 5px 5px 5px #FF0000;
	 color:#6495ED;
	  height:50px;
	}
	</style>	
		<div id="mydate" class="bg-default row one">
		<div id="shione"><h3 style="align :center;"> 小荷才露尖尖角,早有蜻蜓立上头------ 宋、杨万里《小池》<h3></div>
			<h2 align="center">
				我的资料<br /> <br />
			</h2>
			    
			<div class="col-md-offset-4 col-md-6">
				<!-- 我的资料内容填充 -->
				<form action="#" method="post">
					<table class="table table-bordered table-hover">
						<tr>
							<td class="active"><p align="center">姓名</p></td>
							<td class="success" style="text-align: center;">${userInfo.sname}</td>
							<td class="warning"><p align="center">学号</p></td>
							<td class="danger" style="text-align: center;">${userInfo.sno}</td>

						</tr>
						<tr>
							<td class="active"><p align="center">学校</p></td>
							<td class="success" style="text-align: center;">${userInfo.school}</td>
							<td class="warning"><p align="center">电话</p></td>
							<td class="danger" style="text-align: center;">${userInfo.telphone}</td>
						</tr>
						<tr>
							<td class="active"><p align="center">学院</p></td>
							<td class="success" style="text-align: center;">${userInfo.academy}</td>
							<td class="warning"><p align="center">班级</p></td>
							<td class="danger" style="text-align: center;">${userInfo.classname}</td>
						</tr>
						<tr>
							<td class="active"><p align="center">身份</p></td>
							<td class="success" style="text-align: center;">
							<c:if test="${userInfo.statue==1}">学生</c:if>
							<c:if test="${userInfo.statue==2}">评委</c:if>
							<c:if test="${userInfo.statue==3}">管理员</c:if>
							</td>
							<td class="warning"><p align="center">性别</p></td>
							<td class="danger" style="text-align: center;">
								<c:if test="${userInfo.sex==0}">女</c:if>
								<c:if test="${userInfo.sex==1}">男</c:if>
							</td>
						</tr>
					</table>
					</from>
				<!--  -->
				
					<div class="row " height="500px">
						<div class="col-md-offset-2 col-md-4">
							<div>
								<p class="bg-info" height="200px">
									程序员(英文Programmer)是从事程序开发、维护的专业人员。 一般将程序员分为程序设计人员和程序编码员，
									但两者的界限并不非常清楚，特别是在中国。 软件从业人员分为初级程序员、高级程序员、系统分析员和项目经理四大类的方法。</p>
							</div>
						</div>
						<div class="col-md-offset-2 col-md-4">
							<div>
								<a href="/off" target="_self">安全退出</a>
							</div>
						</div>
					</div>
			</div>
			<script type="text/javascript">
				function oneclick(){
					location.href = "http://127.0.0.1:8080/off";
				}
			</script>
			<div class="col-md-2"></div>

		</div>
			
		<div id="teammessage" class="bg-default row tw">
			<div id="shitwo"><h3 style="align :center;">人生结交在终结，莫为升沉中路分 -----唐 、贺兰进明《行路难五首》<h3></div>
			<h2 align="center" style="color: write"><b> 成员信息</b></h2>
			<div class=" col-md-8">
				<c:choose>
					<c:when test="${not empty myTeamInfo}">
						<table class="table table-bordered table-hover">
							<tr>
								<td class="active"><p align="center">组长</p></td>
								<td class="success" style="text-align: center;">${myTeamInfo.headname}</td>
								<td class="warning"><p align="center">班级</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.headclass}</td>
								<td class="warning"><p align="center">电话</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.headtel}</td>
							</tr>
						<c:if test="${not empty myTeamInfo.onename}">
								<tr>
									<td class="active"><p align="center">小组成员</p></td>
									<td class="success" style="text-align: center;">${myTeamInfo.onename}</td>
									<td class="warning"><p align="center">班级</p></td>
									<td class="danger" style="text-align: center;">${myTeamInfo.oneclass}</td>
									<td class="warning"><p align="center">电话</p></td>
									<td class="danger" style="text-align: center;">${myTeamInfo.onephone}</td>
			
								</tr>
						</c:if>
						<c:if test="${not empty myTeamInfo.twoname}">
							<tr>
								<td class="active"><p align="center">小组成员</p></td>
								<td class="success" style="text-align: center;">${myTeamInfo.twoname}</td>
								<td class="warning"><p align="center">班级</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.twoclass}</td>
								<td class="warning"><p align="center">电话</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.twophone}</td>
							</tr>
						</c:if>
						<c:if test="${not empty myTeamInfo.threename}">
							<tr>
								<td class="active"><p align="center">小组成员</p></td>
								<td class="success" style="text-align: center;">${myTeamInfo.threename}</td>
								<td class="warning"><p align="center">班级</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.threeclass}</td>
								<td class="warning"><p align="center">电话</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.threephone}</td>
							</tr>
						</c:if>
						<c:if test="${not empty myTeamInfo.fourname}">
							<tr>
								<td class="active"><p align="center">小组成员</p></td>
								<td class="success" style="text-align: center;">${myTeamInfo.fourname}</td>
								<td class="warning"><p align="center">班级</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.fourclass}</td>
								<td class="warning"><p align="center">电话</p></td>
								<td class="danger" style="text-align: center;">${myTeamInfo.fourphone}</td>
							</tr>
						</c:if>
						</table>
					</c:when>
					<c:otherwise>
						<h1><div style="color: white;">您还没有创建战队哦！</div>  </h1> 
					</c:otherwise>
				
				</c:choose>
				<div class="row">
					<div class="col-md-0ffset-2 col-md-4 ">
						
					</div>
					<div class="col-md-0ffset-2 col-md-4 ">
						
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<img src="../picture/bg-team-03.jpg" alt="">
			</div>
		</div>
		<!-- ---------重定位---------- -->
		<!-- <a id="a001" href="#001" name="001"></a> -->
		<div id="allteam" class="bg-secondary row three">
			
			<img src="holder.js/100%x50" alt="">
			<div id="shithree"><h3 style="align :center;"> 三个臭皮匠，顶个诸葛亮------ 古人云<h3></div>
			<h1 align="center" style="color: #800080;">参赛团队</h1>
			<div class="col-md-8">
			
				<table class="table table-bordered table-hover">
					<c:choose>
						<c:when test="${not empty pagebean.list}">
							<c:forEach items="${pagebean.list}" var="TeamIn">
								<tr>
								<td class="active"><p align="center">团队号</p></td>
								<td class="success" style="text-align: center;">${TeamIn.teamId}</td>
								<td class="warning"><p align="center">团队组长</p></td>
								<td class="danger" style="text-align: center;">${TeamIn.headname}</td>
								<td class="warning"><p align="center">团队人数</p></td>
								<td class="danger" style="text-align: center;">${TeamIn.count}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<h1>暂时无团队信息哦</h1>
						</c:otherwise>
					</c:choose>
								<tr>
									<td colspan="6" align="center">
										当前：${pagebean.currentPage}/ ${pagebean.totalPage}
										&nbsp;&nbsp; 
										<a href="${pageContext.request.contextPath}/user/selectsingle?currentPage=1&sno=${userInfo.sno}">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath}/user/selectsingle?currentPage=${pagebean.currentPage-1}&sno=${userInfo.sno}">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath}/user/selectsingle?currentPage=${pagebean.currentPage+1}&sno=${userInfo.sno}">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath}/user/selectsingle?currentPage=${pagebean.totalPage}&sno=${userInfo.sno}">末页</a>
									</td>
								</tr>
				</table>
			</div>
			<div class="col-md-4">
				<img src="../picture/bg-team-02.jpg" alt="">
			</div>
		</div>
		<!-- ---------重定位---------- -->
		<!-- <script type="text/javascript">
			document.getElementById("a001").click();
		</script> -->

		<div id="awardsmessage" class="bg-default row five">
			<div id="shifour"><h3 style="align :center;">岁月本长而忙者自促，天地本宽而卑者自隘  -----摘自《菜根谭》<h3></div>
			<h1 align="center">大赛奖项设置</h1>
			<div class="row">
				<div class="col-md-4 col-md-4">
					<div class="thumbnail">
						<img src="../picture/award-01.jpg" alt="...">
						<div class="caption">
							<h3>一等奖</h3>
							<p>精美笔记本＋荣誉证书+专业素质分3分</p>
							<a tabindex="0" id="one" class="btn btn-lg btn-danger"
								role="button" data-toggle="popover" data-trigger="focus"
								title="Dismissible popover" 
								data-content="首屈一指，名列前茅，雁塔题名，无出其右，一举夺魁，高居榜首，独占鳌头，祝愉快！">点击获取更多</a>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-md-4">
					<div class="thumbnail">
						<img src="../picture/award-02.jpg" alt="...">
						<div class="caption">
							<h3>二等奖</h3>
							<p>精美笔记本＋荣誉证书+专业素质分2分</p>
							<a tabindex="0" id="two" class="btn btn-lg btn-danger"
								role="button" data-toggle="popover" data-trigger="focus"
								title="Dismissible popover"
								data-content="一说:伯仲叔季里的季是指兄弟里排行最小的，竞赛中一般只取前三名。第三名最小，故称季军。">点击获取更多</a>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-md-4">
					<div class="thumbnail">
						<img src="../picture/award-03.jpg" alt="...">
						<div class="caption">
							<h3>三等奖</h3>
							<p>精美笔记本＋荣誉证书+专业素质分1分</p>
							<a tabindex="0" id="three" class="btn btn-lg btn-danger"
								role="button" data-toggle="popover" data-trigger="focus"
								title="Dismissible popover"
								data-content="在中国历史中，亚一词有次级的意思，如在西周时，就有一职称为亚卿，亚卿是比正卿下一个级别。另外，项羽称范增为「范亚父」，都是有次一级的意思。
后来，亚军就是人们称比冠军次一名的胜出者。">点击获取更多</a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="download" class="bg-info row six">
			<img src="holder.js/100%x50">
			<h1 align="center">下载大赛资料</h1>
			<c:choose>
				<c:when test="${not empty documentsList}">
					<c:forEach items="${documentsList}" var="document">
						<div class="col-md-4 col-md-4">
							<div class="thumbnail">
								<img src="${document.dpicture}" alt="...">
								<div class="caption">
									<h3><b>${document.dname}</b> </h3>
									<p>&nbsp;&nbsp;&nbsp;&nbsp;
										${document.ddescribe}
									</p>
									<p>
										<a href="${document.dpath}" class="btn btn-primary" role="button">点击下载</a>
									</p>
								</div>
							</div>
						</div>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<h1>暂无文件可下载哦</h1>
				</c:otherwise>
			</c:choose>
		</div>
		<div id="checkout" class="bg-default seven">
			
			<h1 align="center">我的校园</h1>
			<div class="row Title">
				<h2 align="center">江西农业大学软件学院</h2>
			</div>

			<div class="row TEXT">
				<div class="col-md-6">
					<h3>学院简介</h3>
					</br>
					<p>
						我校软件学院是2003年7月经江西省教育厅批准创办，办学层次为二本。按照国家教育部关于软件工程专业要与软件企业合作办学的指示精神，我院坚持走产学研相结合的办学道路，目前在北京、上海两地与IT企业合作建立了软件专业实习基地，现正准备在IT业发展的其它地方发展软件专业实习基地。学院在全国近三十多个省市和地区招收学生，现有在校学生一千九百余人。学院现有软件工程专业和物联网工程专业，在软件工程专业框架下开设了软件开发与项目管理方向、移动互联技术方向、数字媒体技术方向、嵌入式软件技术方向和软件工程+英语(复合型专业)五个方向。</p>
				</div>
				<!--col-md-6-->
				<div class="col-md-6">
					<h3>关于我院科技月评</h3>
					</br>
					<p>
						从2006年开始，该院承办了江西农业大学大学生科技月评，并在2006年举办了第一届比赛，比赛的目的是为了推动江西农业大学学生课外学术科技活动蓬勃发展，增强大学生学习、运用软件技术的热情和兴趣，加快软件后备人才培养，促进软件产品成果转化，更好地服务青年学生成长成才。</p>
				</div>
				<!--col-md-6-->
			</div>
			<!--row TEXT-->
			<div class="row TEXT">
				<div class="col-md-6">
					<div class="row picturedate">
						<div class="col-md-2">
							<h3>办学风格</h3>
							</br>
							<h5>实习基地</h5>
						</div>
						<div class=" col-md-offset-2 col-md-8">
							<img src="../picture/jxau-01.jpg" width="260px" height="100px">
						</div>
					</div>
					<p>
						截至2010年，该院有上海、北京两个软件实习基地，其中北京实习基地位于北京中关村附近，周边IT公司林立，实习教学内容都是主流技术或新技术;由于地域优势，实习基地在完成三个月的技术集训后，有足够的IT公司安排毕业生进行顶岗实习(试就业)，不但可以提高毕业生的工作能力，也为毕业生的就业打下良好的基础</p>
				</div>
				<!--col-md-6-->
				<div class="col-md-6">
					<h3>师资力量</h3>
					</br>
					<p>该校师资队伍由专职教师、兼职教师、企业工程师(含高级工程师)和研究员等构成。

						根据江西农业大学软件学院网站资料显示:该院教职工36人，其中正教授5人，副教授10人，博士5人，有硕士研究生导师9人。教师队伍中具有硕士学位以上者占100%。

						其中专职教授4人，兼职教授2人(博士生导师)，荣誉教授1人(院
						士)，副教授12人，讲师10人。具有博士学位的教师5人，硕士学位的教师16人。北京实训基地有正副研究员5人，工程师以上职称12人。此外，学院每学期都要聘请国内外知名教授、专家为学生授课和做学术讲座。北京实习基地工程师和研究员共有固定人员26人，其中，正副研究员5人，工程师以上职称13人;实训基地实训教师有13人。</p>
				</div>
				<!--col-md-6-->

			</div>
			<!--row TEXT-->
			<div class="row r">
				<div class="col-md-12">

					<!-- <font size="+1" color="white" style="text-align: center;" >Design: A group of ambitious
						young people QQ:2447156102 tel:1245678978 email: 2447156102</font> -->
				</div>
			</div>
			<!--row r-->
		</div>

	</div>



</body>
<script type="Text/javascript">
	$(function() {
		$("#one").popover();
	});
	$(function() {
		$("#two").popover();
	});
	$(function() {
		$("#three").popover();
	});
	
    
	function getdate(item) {
		$("#conclusionShow").popover().click(function() {
			$("#content").text('YOUR CONTENT123');
		});
	}

	$('body').scrollspy({
		target : '#sideNav'
	})

	$('[data-spy="scroll"]').each(function() {
		var $spy = $(this).scrollspy('refresh')
	})

	$(function() {
		$('#myTab a:first').tab('show');//初始化显示哪个tab  
		$('#myTab a').click(function(e) {
			e.preventDefault();//阻止a链接的跳转行为 
			$(this).tab('show');//显示当前选中的链接及关联的content 
		})
	})
</script>

</html>
