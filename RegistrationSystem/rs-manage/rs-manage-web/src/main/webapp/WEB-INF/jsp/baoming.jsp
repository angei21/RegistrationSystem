<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <%@page contentType="text/html;charset=UTF-8" %>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>baoming</title>
  
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
	 <h1  align="center"  style=" color:#800080;">先留个名字吧</h1> 
          <a type="button" class="btn btn-link" data-toggle="tooltip" data-placement="left" title="关于">Tooltip on left</a>
       <div class="row all from-group">
         <form action="#" method="get">
         <table class="from-group">
         <tr>
              <td class="active"><label>团队编号:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="teamid" id="teamid" name="teamid" autofocus="autofocus" maxlength="20"/></td>
         </tr>
		   <tr>
		      <td class="active"><label>组长姓名:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="headname" id="headname" name="headname" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>组长班级:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="headclass" id="headclass" name="headclass" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>组长电话:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="headtel" id="headtel" name="headtel" autofocus="autofocus" maxlength="20"/></td>
		   </tr>
		    <tr><td><br></td></tr>
		   <tr>
		      <td class="active"><label>成一姓名:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="firstname" id="firstname" name="firstname" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成一班级:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="firstclass" id="firstclass" name="firstclass" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成一电话:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="firsttel" id="firsttel" name="firsttel" autofocus="autofocus" maxlength="20"/></td>
		   </tr>
		   <tr><td><br></td></tr>
		   <tr>
		      <td class="active"><label>成二姓名:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="secondname" id="secondname" name="secondname" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成二班级:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="secondclass" id="secondclass" name="secondclass" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成二电话:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="secondtel" id="secondtel" name="secondtel" autofocus="autofocus" maxlength="20"/></td>
		   </tr>
		    <tr><td><br></td></tr>
		   <tr>
		      <td class="active"><label>成三姓名:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="threename" id="threename" name="threename" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成三班级:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="threeclass" id="threeclass" name="threeclass" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成三电话:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="threetel" id="headtel" name="threetel" autofocus="autofocus" maxlength="20"/></td>
		   </tr>
		    <tr><td><br></td></tr>
		  <tr>
		      <td class="active"><label>成四姓名:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="fourname" id="fourname" name="fourname" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成四班级:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="fourclass" id="fourclass" name="fourclass" autofocus="autofocus" maxlength="20"/></td>
		      <td class="active"><label>成四电话:</label></td>
			  <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="fourtel" id="fourtel" name="fourtel" autofocus="autofocus" maxlength="20"/></td>
		   </tr>
		    </table>   	
                <br/>	
                <div class="from-group">
				 <input class="btn btn-success" type="submit" value="上传" onclick="matchtime();" style="position:relative;left:+400px"/>
		       </div>
           </form>
		
		</div> 
   </div><!--container-->
 
 
   
 </body>
<script type="text/javascript">
       function matchtime(){
    	   
    	   var day=document.getDate();
    	   var hours=document.gethours();
    	  
          if(day<=16&&hours<=23){
        	  alert(报名成功);
        	  window.history.back(-1);
          }else{
        	  alert(报名失败);  
          }
       }
       
     
     
     
</script>
 
 

</html>