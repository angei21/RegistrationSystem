<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <%@page contentType="text/html;charset=UTF-8" %>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>index</title>
  
  <link rel="stylesheet" href="../css/bootstrap.min.css">
   <link rel="stylesheet" href="../css/fileinput.css">
  <script src="../js/jquery.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/holder.min.js"></script>
     <script src="../js/fileinput.js"></script>
  <style type="text/css">
    *{
      font-family: 微软雅黑;
    }
    body{
      padding-top:15px; 
	  /*规定 @keyframes 动画的名称。*/
    animation-name: myfirst;
	/*规定动画完成一个周期所花费的秒或毫秒。默认是 0*/
    animation-duration:24s;
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
    0%   {background:url("../js/holder.js/100%x100%");}
    50%  {background:url("../picture/bg-05.jpg");}
    100% {background:url("../picture/bg-good.jpg");}
   }
   /*使用 opacity，那么所有子元素都会受到影响所以使用 rgba（）函数*/
  .all{
        background:  rgba(225,220, 300, 0.25); width:500px; margin:60px auto;
		
		 }
     
    input[type="text"],input[type="password"]{padding-left:26px;}
	 
    .checkbox{
	      padding-left:10px;
	}

  </style>
</head>
<body>
    <div class="container">
	 <h1  align="center"  style=" color:#800080;">快来提交你的成就</h1> 
          <a type="button" class="btn btn-link" data-toggle="tooltip" data-placement="left" title="关于">Tooltip on left</a>
       <div class="row all from-group">
         <form action="#" method="get">
         <table class="from-group">
		   <tr>
		      <td class="active"><label>作品ID:</label></td>
			   <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/></td>
		   </tr>
		    <tr><td><br></td></tr>
		   <tr>
		      <td> <label>团队号:</label> </td> 
              <td>&nbsp; &nbsp;</td>		  
		      <td><input class=" form-control" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>	</td>
		   </tr>
		   <tr><td><br></td></tr>
		   <tr>
		      <td > <label>报名类别:</label> </td> 
              <td>&nbsp; &nbsp;</td>		  
		      <td><input class=" form-control" type="text" placeholder="Teamtype" id="teamtype"/></td>
		   </tr>
		    <tr><td><br></td></tr>
		   <tr>
		      <td > <label>作品名称:</label> </td> 
              <td>&nbsp; &nbsp;</td>		  
		      <td><input class=" form-control" type="text" placeholder="workname" id="workname"/></td>
		   </tr>
		    <tr><td><br></td></tr>
		   <tr>
		      <td > <label>第一作者:</label> </td> 
              <td>&nbsp; &nbsp;</td>		  
		      <td><input class=" form-control" type="text" placeholder="firstwrite" id="firstwrite"/></td>
		   </tr>
		    </table>  
			   <div class="from-group">
			     <label for="exampleInputFile">File input</label>
		         <input  class="file" type="file" id="File" accept="file">
               </div>	
                <br/>	
                <div class="from-group">
				 <button class="btn btn-success " type="submit"  style="position:relative;left:+400px">上传</button>
		       </div>
           </form>
		
		</div> 
   </div><!--container-->
 
 
   
 </body>
<script type="text/javascript">
function getpath(){
	         var me=document.getElementById("team").value;
	         alert(me);
}      

     function submit(){
	   //获取密码数据
	   //userword
	 var userword=document.getElementById("username");
	 //password
     var password=document.getElementById("password");
      //属于的团队	 
	 var team=document.getElementById("team");
	 //获取时间
	 var month=document.getElementById("month").value;
	 var day =document.getElementById("day").value;
	 //获取文件

	 if(month<=12&&day<=16){
	    alert("上传数据成功");
		window.open("导航条Demo.html");
		
	 }else{
	   alert("超过报名时间");	 
	 }	 
	 }
</script>
 
 

</html>