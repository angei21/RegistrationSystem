<!doctype html>
<html lang="en">
<head>
<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>admin index</title>

<style type="text/css">
* {
	font-family: 微软雅黑;
}

body {
	padding-top: 0;
	padding-left: 286px;
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
	color: rgba(255, 255, 255, .5);
	display: block;
}

#sideNav .navbar-brand {
	display: flex;
	margin: auto auto 0;
	padding: 0.5rem;
}

.d-lg-block {
	display: block !important;
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

</style>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/holder.min.js"></script>

</head>

<body data-spy="scroll" data-target="#navbarSupportedContent"
	data-offset="50" id="top">
   

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top"
		id="sideNav" style="width: 272px; weight: 576px;">
		<a class="navbar-brand js-scroll-trigger" href="#page-top"
			style="width: 176px; weight: 184px;"> <span
			class="d-block d-lg-none  mx-0 px-0"><img class="img-fluid img-profile rounded-circle mx-auto mb-2" src="${userInfo.sportaid}" 
		 width="110px" height="140px" style="position: absolute;  top: 20px; left:140px;"></span>
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent"
			style="width: 260px; weight: 240px;">
			<ul class=" nav nav-navbar nav-tabs flex-column"
				style="position: absolute; top: 200px; align: center;">
				<li class="nav-item active"><a
					class="nav-link js-scroll-trigger" href="#begin">首页 </a></li>
				<li><br></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#点击下载message">参赛人员信息 </a></li>
				<li><br></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#wordmessage">作品信息 </a></li>
				<li><br></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#teammessage">参赛团队信息 </a></li>
				<li><br></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#wengdang">文档管理 </a></li>
				<li><br></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#wengdang">打印 </a></li>
			</ul>
		</div>
	</nav>
	<div class="modal fade " id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content" style="background-color: #286090;">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">New message</h4>
				</div>
				<div class="modal-body">
					<form action="${pageContext.request.contextPath }/document/add" method="post"  enctype="multipart/form-data">
						<table class="from-group">

							<!-- 文件名，文件描述，文件图标上传，文件上传-->
							<tr>
								<td class="active"><label>文件名:</label></td>
								<td><input class=" form-control" type="text"
									placeholder="请输入文件名称" id="dname" name="dname" />
									<input type="hidden" name="sno" value="${userInfo.sno}"/>
								</td>
							</tr>
							<tr>
								<td class="active"><label>文件图标上传</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="file" name="imageupload" /></td>
							</tr>
							<tr>
								<td class="active"><label>文件上传</label></td>
								<td>&nbsp; &nbsp;</td>
								<td><input class=" form-control" type="file"  name="fileupload"/></td>
							</tr>
						</table>
						<lable>文件摘要概述:</lable>
						<textarea name="ddescribe" cols="30" rows="7"> 	</textarea>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
							<button type="submit" class="btn btn-primary">上传</button>
						</div>
					</form>
				</div>
				
			</div>
		</div>
	</div>
	</div>
	<style type="text/css">
.begin {
	height: 900px;
}

.two {
	height: auto;
	background-color: #286090;
}

.three {
	height: 800px;
}
</style>

	<div class="col-sm-12">
		<div id="begin" class="bg-info begin">
			<div class="embed-responsive embed-responsive-16by9">
				<!-- 测试！ ---------------------------------------------------------------- -->
				<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>index</title>
<style>
* {
	font-family: 微软雅黑;
}

body {
	padding-top: 15px;
}

#Table {
	border-color: blue;
}

#divv {
	width: 994px;
	height: 600px;
	background-image: url(picture/login-bg-01.jpg);
}
#exit{
position: absolute;
	left: 1500px;
     top: 800px;
}
</style>


<div id="carousel-example-generic" class="carousel slide"
	data-ride="carousel" date-interval="2000"">
	<!-- Indicators -->
	<div class="carousel-indicators"
		style="width: 100%; height: 60px; position: relative; left: 860px; top: 530px;">
		<img data-target="#carousel-example-generic" data-slide-to="0"
			class="active" src="../picture/bg-begin-01.jpg" alt=""
			style="width: 60px;"> <img
			data-target="#carousel-example-generic" data-slide-to="1"
			src="../picture/bg-begin-02.jpg" alt="" style="width: 60px;"> <img
			data-target="#carousel-example-generic" data-slide-to="2"
			src="../picture/bg-begin-03.jpg" alt="" style="width: 60px;"> <img
			data-target="#carousel-example-generic" data-slide-to="3"
			src="../picture/bg-begin-04.jpg" alt="" style="width: 60px;">
	</div>
	<!-- Wrapper for slides -->
	<div class="row r" style="position: absolute; left: 0px; top: 0px;">
		<div class="col-md-12">
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="../picture/bg-begin-01.jpg" alt="" style="width: 1522px;">
					<div class="carousel-caption">
						<p></p>
					</div>
				</div>
				<div class="item">
					<img src="../picture/bg-begin-02.jpg" alt="" style="width: 1522px;">
					<div class="carousel-caption">
						<p></p>
					</div>
				</div>
				<div class="item">
					<img src="../picture/bg-begin-03.jpg" alt="" style="width: 1522px;">
					<div class="carousel-caption">
						<p></p>
					</div>
				</div>
				<div class="item">
					<img src="../picture/bg-begin-04.jpg" alt="" style="width: 1522px;">
					<div class="carousel-caption">
						<p></p>
					</div>
				</div>
			</div>
			<!-- carousel-inner-->

			<a class="right carousel-control" href="#carousel-example-generic"
				role="button" data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			</a> <a class="left carousel-control" href="#carousel-example-generic"
				role="button" data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			</a>
		</div>
		<!--r col-md-12-->
	</div>
	<!--r rwo-->
</div>
<!--carousel slide-->

<div class="row" style="position: absolute; left: 15px; top: 800px;">
	<div class="col-md-8">
		<div style="width: 800px; background-color: #ADD8E6;">
			<!-- <p>江西农业大学（Jiangxi Agricultural
				University）位于江西省省会——英雄城南昌市，是一所以农为优势、以生物技术为特色、历史悠久、特色鲜明、多学科协调发展的全国重点大学。

				学校是中国首批具有学士学位和硕士学位授予权单位之一、具有博士学位授予权高校，1962年开展研究生教育，是江西省最早进行研究生培养的高等学府，拥有“推荐免试研究生”资格。学校是中华人民共和国农业部、林业局
				与江西省人民政府三方重点支持的省部共建高校，江西省核心建设的四所重点大学之一。入选国家“中西部高校基础能力建设工程”，国家首批卓越农林人才教育培养计划，国家“2011计划”，江西省“卓越工程师教育培养计划”，是教育部、科技部决定联合开展高等学校新农村发展研究院建设高校。

				截至2018年5月，现设有17个学院，有全日制在校生28000余人（含独立学院）。学科涵盖农、理、工、经、管、文、法、教、艺等9大门类。有在职教职工1600余人，具有博士、硕士学位人员占教师总数的80%以上。</p> -->
		</div>
	</div>

	<div class="col-md-3">
		<div>
			<a href="http://www.jxau.edu.cn/" target="_Blank"><h4
					class="title">首页图片管理</h4></a>
		</div>
		<div>
			<a href="http://ruanjianxy.jxau.edu.cn/" target="_Blank"><h4
					class="title">了解更多农大软件学院信息</h4></a>
		</div>
		<div>
			<a href=" http://jwc.jxau.edu.cn/" target="_Blank"><h4
					class="title">江西农大教务处</h4></a>
		</div>
		
	</div>
	<div class="col-md-1"><a href="/off" target="_self">安全退出</a></div>
	<!-- r col-md-3-->
</div>
</body>

<!-- 测试！ ---------------------------------------------------------------- -->
</div>
</div>






<div id="点击下载message" class="bg-default row one">
	<img src="holder.js/100%x50">
	<h1 align="center">参赛人员信息</h1>
	<div class="col-md-10">
		<c:choose>
			<c:when test="${not empty allUserInfo}">
				<table class="table table-bordered table-hover ">
					<c:forEach items="${allUserInfo}" var="oneuser">
						<tr>
							<td class="info" style="width: 60px; height: 60px;">学号</td>
							<td>${oneuser.sno}</td>
							<td class="info" style="width: 60px; height: 60px;">姓名</td>
							<td>${oneuser.sname}</td>
							<td class="info" style="width: 60px; height: 60px;">学校</td>
							<td>${oneuser.school}</td>
							<td class="info" style="width: 60px; height: 60px;">学院</td>
							<td>${oneuser.academy}</td>
							<td class="info" style="width: 60px; height: 60px;">班级</td>
							<td>${oneuser.classname}</td>
							<td class="info" style="width: 60px; height: 60px;">电话</td>
							<td>${oneuser.telphone}</td>
							<td class="info" style="width: 60px; height: 60px;">身份</td>
							<td>学生</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<h1>暂无参赛人员信息哦</h1>
			</c:otherwise>
		</c:choose>
	</div>
	<div class="col-md-2"></div>
</div>

<div id="wordmessage" class="bg-default row tow">
	<img src="holder.js/100%x50">
	<h1 align="center">作品信息</h1>
	<div class="col-md-9">
		<c:choose>
			<c:when test="${not empty showworks}">

				<table class="table table-bordered table-hover ">
					<c:forEach items="${showworks}" var="works">
						<tr>
							<td class="info" style="width: 60px; height: 60px;">参赛组别</td>
							<td>${works.mname}</td>
							<td class="info" style="width: 60px; height: 60px;">作品名称</td>
							<td>${works.workname}</td>
							<td class="info" style="width: 60px; height: 60px;">第一作者</td>
							<td >${works.firstwriter}</td>
							<td class="info" style="width: 60px; height: 60px;">作品下载</td>
							<td style="width: 120px; height: 60px;"><p>
									<a href="${works.submitpath}" class="btn btn-primary"
										role="button">点击下载</a>
								</p></td>
							<td class="info" style="width: 60px; height: 60px;">作品分数</td>
							<td >${works.scoretotal}</td>
							<td class="info" style="width: 60px; height: 60px;">评审人</td>
							<td>
								<c:if test="${works.rater==110}">吴国平</c:if>
								<c:if test="${works.rater==111}">龚雪</c:if>
								<c:if test="${works.rater==112}">刘昊</c:if>
							</td>
						</tr>
						</c:forEach>
				</table>

			</c:when>

			<c:otherwise>
				<h1>暂无作品信息哦</h1>
			</c:otherwise>
		</c:choose>
	</div>
	<div class="col-md-3">
		<img src="../picture/bg-admin-01.jpg" alt="">
	</div>

</div>
<div id="teammessage" class="bg-default row three">
	<img src="holder.js/100%x50">
	<h1 align="center">参赛团队信息</h1>
	<div class="col-md-9">
		<c:choose>
			<c:when test="${not empty teamlist}">
				<table class="table table-bordered table-hover ">
					<c:forEach items="${teamlist}" var="team">
						<tr>
							<td class="info" style="width: 60px; height: 60px;">团队号</td>
							<td>${team.teamid}</td>
							<td class="info" style="width: 60px; height: 60px;">组长名</td>
							<td>${team.headname}</td>
							<td class="info" style="width: 60px; height: 60px;">班级</td>
							<td>${team.headclass}</td>
							<td class="info" style="width: 60px; height: 60px;">电话</td>
							<td>${team.headtel}</td>
							<c:if test="${team.onename!=null}">
								<td class="info" style="width: 60px; height: 60px;">成员</td>
								<td>${team.onename}</td>
							</c:if>
							<c:if test="${team.twoname!=null}">
								<td class="info" style="width: 60px; height: 60px;">成员</td>
								<td>${team.twoname}</td>
							</c:if>
							<c:if test="${team.threename!=null}">
								<td class="info" style="width: 60px; height: 60px;">成员</td>
								<td>${team.threename}</td>
							</c:if>
							<c:if test="${team.fourname!=null}">
								<td class="info" style="width: 60px; height: 60px;">成员</td>
								<td>${team.fourname}</td>
							</c:if>
						
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<h1>暂无参赛团队信息哦</h1>
			</c:otherwise>
		</c:choose>
	</div>
	<div class="col-md-3"></div>
	<div class="row" style="height: 200px;"></div>
</div>
<div id="wengdang" class="bg-default row four">
	<img src="holder.js/100%x50">
	<h1 align="center">文档管理</h1>
	
	<div class="col-md-8">
	<!--  -->
	<a class=" nav-link js-scroll-trigger btn btn-primary "
										data-toggle="modal" data-target="#exampleModal"
										data-whatever="@getbootstrap">文件新增</a>
	<!--  -->
	<hr/>
		<c:choose>
			<c:when test="${not empty documentsList}">
				<c:forEach items="${documentsList}" var="document">
					<table class="table table-bordered table-hover ">
						<tr>
							<td class="info" style="width: 80px; height: 80px;">文件ID</td>
							<td>${document.did}</td>
							<td class="info" style="width: 80px; height: 80px;">文件名</td>
							<td>${document.dname}</td>
							<td class="info" style="width: 80px; height: 80px;">文件描述</td>
							<td>${document.ddescribe}</td>
							<td class="info" style="width: 80px; height: 80px;">文件下载</td>
							<td style="width: 160px; height: 100px;"><p>
									<a href="${document.dpath}" class="btn btn-primary" role="button">点击下载</a>
								</p></td>
							<td class="info" style="width: 60px; height: 60px;"><p>
									<a class=" nav-link js-scroll-trigger btn btn-primary "
										data-toggle="modal" data-target="#exampleModal"
										data-whatever="@getbootstrap">文件修改</a>
								</p></td>
							<td class="info" style="width: 60px; height: 60px;">
								<p>
									<form action="${pageContext.request.contextPath}/document/delete" method="get"> 
									<input type="hidden" name="did" value="${document.did}" />
									<input type="hidden" name="sno" value="${userInfo.sno}" />
									<!-- <a href="javascript:;" class="btn btn-primary" role="button"
										>文件删除</a> -->
										<td class="info" style="width: 60px; height: 60px;"><p>
										<button type="submit" class=" nav-link js-scroll-trigger btn btn-primary "
										data-toggle="modal" data-target="#exampleModal"
										data-whatever="@getbootstrap">文件删除</button>

									</form>	
										
								</p>
							</td>
						</tr>
					</table>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<h1>暂无文件需要管理哦</h1>
			</c:otherwise>
		</c:choose>
	</div>
	<div class="col-md-4"></div>
</div>
</div>


</body>
<!-- <script type="Text/javascript">
	function deletefile() {

		alert(10);
	}
</script> -->
</html>
