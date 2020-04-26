<!doctype html>
<html lang="en">
<head>
  <%@page contentType="text/html;charset=UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>judgeindex index</title>
   
<style type="text/css">
    *{
      font-family: 微软雅黑;
    }
   body {
    padding-top: 0;
    padding-left: 286px;
  }
    .u{
       position: absolute;
      left: 0px;
    }
     #sideNav{ 
      text-align: center;
      position: fixed;
      top: 0px;
      left: 0;
      display: flex;
      
      width: 17rem;
      height: 100vh;
   }
   .nav-link {
    color: rgba(255,255,255,.5);
    display: block;
}
#sideNav .navbar-brand {
    display: flex;
    margin: auto auto 0;
    padding: 0.5rem;
}
.d-lg-block {
    display: block!important;
}
.container-fluid {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
}
.embed-responsive{
    position: absolute;
      left: 10px;

}
  </style>
 <link rel="stylesheet" href="../css/bootstrap.min.css">
  <script src="../js/jquery.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/holder.min.js"></script>
  </head>
    
<body data-spy="scroll" data-target="#navbarSupportedContent" data-offset="50" id="top">
 
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top" id="sideNav" style="width:272px; weight:576px;">
      <a class="navbar-brand js-scroll-trigger" href="#page-top" style="width:176px; weight:184px;">
        <span class="d-block d-lg-none  mx-0 px-0"><img src="" alt="" class="img-fluid"></span> -->
        <span class="d-none d-lg-block">
        <img class="img-fluid img-profile rounded-circle mx-auto mb-2" src="${userInfo.sportaid}" 
		 width="110px" height="140px" style="position: absolute;  top: 20px; left:140px;"> 
        </span>
      </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent" style="width:240px; weight:240px;">
            <ul class=" nav nav-navbar nav-tabs"style="position: absolute;top:200px; align: center;" >
            <li class="nav-item active">  
                   <a class="nav-link js-scroll-trigger" href="#begin" >首页 </a> 
                </li>   
                <li><br></li>
                <li class="nav-item">  
                   <a class="nav-link js-scroll-trigger" href="#Mydate" >我的资料 </a> 
                </li>
                <li><br></li>
                <li class="nav-item">  
                   <a class="nav-link js-scroll-trigger" href="#dafen" >作品评分 </a> 
                </li>
             </ul>  
        </div>
    </nav>
   
	 <style type="text/css">
	.begin{
	       height:1200px;      
	     
	     }
	 .two{
	       height:auto;        
	        position: relative;
	     left:15px;
	    
	     }
	 .three{
	       height:800px;
	        position: relative;
	     left:15px;
	     }
	     .embed-responsive{
	     height:1100px;
	     }
	 </style>
  
     <div class="col-sm-12">
       <div id="begin" class=" begin bg-info" >         
   <div class="embed-responsive embed-responsive-16by9">
        <!-- 测试！ ---------------------------------------------------------------- -->
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
						    
					    <div class="row" style=" position: absolute;left: 15px;top: 800px;"> 
					      <div class="col-md-9"> 
						   <div style=" width:800px; background-color:#ADD8E6;"> <p> 江西农业大学（Jiangxi Agricultural University）位于江西省省会——英雄城南昌市，是一所以农为优势、以生物技术为特色、历史悠久、特色鲜明、多学科协调发展的全国重点大学。 
					
					学校是中国首批具有学士学位和硕士学位授予权单位之一、具有博士学位授予权高校，1962年开展研究生教育，是江西省最早进行研究生培养的高等学府，拥有“推荐免试研究生”资格。学校是中华人民共和国农业部、林业局 与江西省人民政府三方重点支持的省部共建高校，江西省核心建设的四所重点大学之一。入选国家“中西部高校基础能力建设工程”，国家首批卓越农林人才教育培养计划，国家“2011计划”，江西省“卓越工程师教育培养计划”，是教育部、科技部决定联合开展高等学校新农村发展研究院建设高校。
					
					截至2018年5月，现设有17个学院，有全日制在校生28000余人（含独立学院）。学科涵盖农、理、工、经、管、文、法、教、艺等9大门类。有在职教职工1600余人，具有博士、硕士学位人员占教师总数的80%以上。</p>
					        </div>
						  </div>
						  
						  <div class="col-md-3">
						    <div><a href="http://www.jxau.edu.cn/" target="_Blank"><h4 class="title" style=" text-shadow: 5px 5px 5px #FF0000;color:#6495ED;">了解更多农大信息</h4></a></div>
						    <div><a href="http://ruanjianxy.jxau.edu.cn/" target="_Blank"><h4 class="title" style=" text-shadow: 5px 5px 5px #FF0000;color:#6495ED;">了解更多农大软件学院信息</h4></a></div>
						    <div><a href=" http://jwc.jxau.edu.cn/" target="_Blank"><h4 class="title" style=" text-shadow: 5px 5px 5px #FF0000;color:#6495ED;">江西农大教务处</h4></a></div>
					      </div><!-- r col-md-3-->
					      
						   </div>
						   
					
						    
						    
					 </body>
					 
					 
					
					 
					
          <!-- 测试！ ---------------------------------------------------------------- -->
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
	
	</style>	
    <div id="Mydate" class="bg-info row two"> 
         <div id="shione"><h3 style="align :center;"> 路漫漫其修远兮，吾将上下而求索 ------楚、屈原《离骚》<h3></div>
           <h1 align="center">我的资料</h1>
            <div class="col-md-8">    
        <table class="table table-bordered table-hover">
              <tr>
                   <td class="primary" style="width:60px; height:60px;"><p color="red;">职工号</p></td>               
                   <td >${userInfo.sno}</td>
                   <td class="primary"  style="width:80px; height:60px;">姓名</td>              
                   <td >${userInfo.sname}</td>
                   <td class="primary"  style="width:60px; height:60px;">学校</td>              
                   <td >${userInfo.school}</td>
                 </tr>
                <tr>
                   <td class="primary" style="width:60px; height:60px;">学院</td>               
                   <td>${userInfo.academy}</td>
                   <td class="primary"  style="width:80px; height:60px;">身份</td>              
                   <td >
                   		<c:if test="${userInfo.statue==1}">学生</c:if>
						<c:if test="${userInfo.statue==2}">评委</c:if>
						<c:if test="${userInfo.statue==3}">管理员</c:if>
                   </td>
                   <td class="primary"  style="width:60px; height:60px;">性别</td>              
                   <td >
                   		<c:if test="${userInfo.sex==0}">女</c:if>
						<c:if test="${userInfo.sex==1}">男</c:if>
                   </td>
               </tr>            
         </table> 
       </div>
      <div>
	 	 <a href="/off" target="_self">安全退出</a>
	  </div>
	  
       <div class="col-md-4">  
       
       </div>
       </div>
      <div id="dafen" class="bg-info row three"> 
           <div id="shitwo"><h3 style="align :center;"> 落红不是无情物，化作春泥更护花-------清、龚自珍《己亥杂诗.其五》<h3></div>
           <h1 align="center">作品评分</h1> 
           <br/> 
        <div class="col-md-8"> 
           	<c:choose>  
           		<c:when test="${not empty showworks.unaccomplishList}">
           			<table class="table table-bordered table-hover ">  
           			<tr>已完成：<b style="color: red;">${showworks.accomplishCount}</b>/<b style="color: red">${showworks.numcount}</b>份,还剩<b style="color: red">${showworks.unaccomplishCount}</b>份未评分哦</tr>
		               <c:forEach items="${showworks.unaccomplishList}" var="workscore">
		               		<tr>
			                   <td class="primary" style="width:60px; height:60px;">参赛类别</td>               
			                   <td>${workscore.mname}</td>
			                   <td class="primary"  style="width:60px; height:60px;">作品名称</td>          
			                   <td >${workscore.workname}</td>
			                   <td class="primary"  style="width:80px; height:60px;">第一作者</td>              
			                   <td >${workscore.firstwriter}</td>
			                   <td class="primary"  style="width:80px; height:60px;">作品下载</td>           
			                   <td style="width:60px; height:60px;"><p><a href="${workscore.submitpath}" class="btn btn-primary" role="button">点击下载</a> </p></td>
			               <form action="${pageContext.request.contextPath}/score/update" method="post">
			                    <td class="primary"  style="width:80px; height:60px;">作品分数</td>              
			                   <td >
			                   <input type="hidden" name="sid" value="${workscore.sid}">
			                   <input type="hidden" name="sno" value="${userInfo.sno}">
			                   <input type="text" name="scoretotal" style="width: 55px;height:38px"/> </td>
			                   <td class="primary"  style="width:80px; height:60px;"> 提交 </td>           
			                   <td style="width:60px; height:60px;"><p><input type="submit" class="btn btn-primary"/></p></td>  
			               </form>
			               </tr>
		               
		               </c:forEach>
		          </table>	
           		</c:when>
           		<c:otherwise>
           			<h1>所有的作品都审核完啦~</h1> 
           		</c:otherwise>
           	</c:choose>
        </div>
          <!-- <div class="col-md-4">
             <img src="holder.js/100%x400">
          </div> -->
       </div>
        
   </div>
  </body>
  <script type="Text/javascript">
  
</script>
  
</html>