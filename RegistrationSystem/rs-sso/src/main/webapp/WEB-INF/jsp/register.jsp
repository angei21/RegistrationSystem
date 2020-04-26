<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>Register</title>
  <style type="text/css">
    *{
      font-family: 微软雅黑;
    }
    
    .tilte{
    	color: white;
    }
    
    label{
    	color: white;
    }
    
    body{
      padding-top:15px; 
	  /*规定 @keyframes 动画的名称。*/
    animation-name: myfirst;
	/*规定动画完成一个周期所花费的秒或毫秒。默认是 0*/
    animation-duration:8s;
    /*动画开始时间*/
    animation-delay:0s;
    /*规定动画被播放的次数  无穷*/
    animation-iteration-count:infinite;
   /*规定动作下个周期播放顺序*  交替/
   animation-direction :alternate;
    /*动画开始运行*/
    animation-play-state:running;
    }
	
   @-webkit-keyframes myfirst  
   {
    0%   {background:url("../picture/bg-login-01.jpg");}
    34%  {background:url("../picture/bg-login-02.jpg");}
    67%  {background:url("../picture/bg-login-03.jpg");}
    100% {background:url("../picture/bg-login-04.jpg");}
   }
    .cl{
      background:  rgba(225,225, 225, 0.25); width:447.5px; margin:0px auto;
    }
  </style>
  <link rel="stylesheet" href="../css/bootstrap.min.css">
   <link rel="stylesheet" href="../css/fileinput.css">
  <script src="../js/jquery.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/holder.min.js"></script>
   <script src="../js/fileinput.js"></script>
</head>
  <body>
   <h2 align="center" class="tilte">快来注册一个账号吧</h2>
	  <div class="row student">
		<div class=" col-md-offset-4 col-md-4 cl">
	     <form action="${pageContext.request.contextPath }/user/register" method="post" id="myFrom"  enctype="multipart/form-data">
		   <div class="from-group" id="userword">
 	           <label>学&nbsp;&nbsp;&nbsp;号:</label>
               <input class=" form-control" type="text" placeholder="sno" id="sno" name="sno" autofocus="autofocus" maxlength="20"/>
	      </div>
		  <div class="form-group" id="password">
				<label>密&nbsp;&nbsp;&nbsp;码:</label>
                <input class=" form-control" type="password" placeholder="spassword" id="spassword" name="spassword" maxlength="8"/>	
          </div>
		  <div class="from-group" id="sno">
 	           <label>姓&nbsp;&nbsp;&nbsp;名:</label>
               <input class="form-control" type="text" placeholder="姓名" id="sname" name="sname" autofocus="autofocus" maxlength="20"/>
		  </div>
		  <br/>
		  <div class="from-group" id="tel">
		   <label>电&nbsp;&nbsp;&nbsp;话:  <label>
		    <input class=" form-control" type="text" style="width: 540px" placeholder="telphone" id="telphone" name="telphone"  maxlength="20"/>
		 </div>
		 <br/>
	      <div class="from-group" id="img">
	       <label>上传一张帅气图片:  <label>
		    <input class="from-control file" type="file" name="uploadFile" value="添加图片" style="dispaly:none; width:200px; height:80px;">
		  </div>
		  <br/>
		  <div class="from-group" id="school">
		   <label>学&nbsp;&nbsp;&nbsp;校:  <label>
		    <input class=" form-control" type="text" style="width: 450px" placeholder="school" id="school" name="school" autofocus="autofocus" maxlength="20"/>
		  </div>
		  <div class="from-group" name="academy">	    
		     <select name="academy" align="left">
			   <option value="xueyaun">--请选择院系--</option>
		        <option value="软件学院">软件学院</option>
				<option value="经管学院">经管学院</option>
				<option value="农学院">农学院</option>
				<option value="计算机学院">计算机学院</option>
				<option value="理学院">理学院</option>
				<option value="食品学院">食品学院</option>
				<option value="职师院">食品学院</option>
				<option value="动科院">食品学院</option>
				<option value="其他学院">其他学院</option>
		     </select>
			 <select name="classname" style="position:absolute; left:200px;">
			  <option value="class">--请选择班级--</option>
		        <option value="一班">一班</option>
				<option value="二班">二班</option>
				<option value="三班">三班</option>
				<option value="四班">四班</option>
				<option value="五班">五班</option>
				<option value="六班">六班</option>
				<option value="七班">七班</option>
				<option value="八班">八班</option>
				<option value="九班">九班</option>
				<option value="十班">十班</option>
				<option value="十一班">十一班</option>
				<option value="十二班">十二班</option>
				<option value="十三班">十三班</option>
				<option value="十四班">十四班</option>
				<option value="其他班">其他班</option>
		     </select>
		     <select name="statue" style="position:absolute; left:400px;">
			  <option value="statu">--请选择身份--</option>
		        <option value="1">参赛学生</option>
				<option value="2">评委</option>
		     </select>	 	  
		  </div>
		  <br/>
        <div class="from-group" id="tel">
		 <label>性&nbsp;&nbsp;&nbsp;别:  <label>
		 &nbsp;&nbsp;<input  type="radio" name="sex" value="0"/>女 &nbsp;<input type="radio" name="sex" value="1"/>男
		</div>
		<div class="checkbox">
         <!--  <label>
            <input type="checkbox"/> Check me out
         </label> -->
        </div>
		  <div class="from-group">
		    <input class="btn btn-success" type="submit" value="提交" onclick="getdata();"/>
		  </div>
	     <form> 
      </div>		 
     </div><!--class="row student"-->		 
   
   </body> 
<script type="text/javascript">
      function getdata(){
	     alert("注册成功！"); 
	  } 
   $('#myTabs a').click(function (e) {
     e.preventDefault()
     $(this).tab('show')
   })
</script>
</html>