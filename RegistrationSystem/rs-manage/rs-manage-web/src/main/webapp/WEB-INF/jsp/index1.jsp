
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <%@page contentType="text/html;charset=UTF-8" %>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>index</title>
  <style type="text/css">
    *{
      font-family: 微软雅黑;
    }
    body{
      padding-top:15px;
	 
    }
	.col-md-2{
	 
	  background-color :blue;
	 width :200px ;
	 height :50px ;
	
	}
	.frist{
	 background-color :black;
	 width :200px ;
	 height :50px ;
	
	}

   img {
  position: absolute;
  left: 100px;
  top: 20px;
}
  #name{
  position: absolute;
  left: 1650px;
  top: 20px;

  }
  .cm{
   margin:0 px;
   background-color :#1E90FF;
  }
  </style>
  <link rel="stylesheet" href="../css/bootstrap.min.css">
  <script src="../js/jquery.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/holder.min.js"></script>
</head>

 <body>

    <img src="../picture/jxau.jpg" width="90px" height="45px">
	 <div id="name">
      <button class="btn btn-success btn-link " value="login" onclick="login();">登录</button>
	  <button class="btn btn-primary btn-link " value="register" onclick="register();">注册</button>
	</div> 
	
 <div class="container " >
    
   <nav class="navbar navbar-default navbar-static-top">
  
     
     <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
         <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
           <span class="sr-only">Toggle navigation</span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
        </button>
	    
         <a class="navbar-brand" href="#">JXAU</span></a>
     </div>

     <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     
	 <ul class="nav navbar-nav">
        <li class="active"><a href="#" >首页 </a></li>
        <li><a href="Mydate.html" target="show">我的个人资料</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">你的资料</a></li>
            <li><a href="#">参赛</a></li>
            <li><a href="#">不知道</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">是不</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
     </ul>
	  
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
	  </form>
	  
      <ul class="nav navbar-nav navbar-left">
	         <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
		     <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
		     <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
			 <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">报名点这里 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="index.jsp">作品提交</a></li>
            <li><a href="#">获奖信息查看</a></li>
            <li><a href="#">其他消息</a></li>
            <li role="separator" class="divider"></li>
            <li class="disabled"><a href="#">后续功能等待</a></li>
          </ul>
        </li>
		
        <li class="dropdown">
          <a href="#" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">关于我们 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="zhubanfang.html" target="show">举办方信息</a></li>
            <li><a href="#">奖励信息</a></li>
            <li><a href="#">其他消息</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">参赛团队</a></li>
			 <li><a href="#">下载大赛相关资料</a></li>
          </ul>
        </li>
      </ul>
	  
    </div><!-- /.navbar-collapse -->
  
  
   </nav>

  </div>	<!-- /container -->

    
	<div class="row">
	
	<div class="col-md-12 cm">
	<div class="embed-responsive embed-responsive-4by3">
	  <iframe  width="100%" height="1200px" name="show" src="begin.jsp" >
	      <div>
	     <h1>我的治疗</h1>
	     </div>
	  </iframe>
  </div>
	</div>
	</div>	<!--下一个Row-->		  
<script type="text/javascript">

 function login(){
        window.open('login.jsp');
		window.history().back(-1);
 
 }
 function register(){
	 window.open('register.jsp');
	 window.history.back();
 }

</script>
 </body>
</html>