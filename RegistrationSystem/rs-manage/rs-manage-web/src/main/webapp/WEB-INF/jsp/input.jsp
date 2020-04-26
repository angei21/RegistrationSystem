<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>index</title>
  
  <link rel="stylesheet" href="../css/bootstrap.min.css">
  <link rel="stylesheet"  href="../css/login.css">
  <script src="../js/jquery.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/holder.min.js"></script>
</head>
<body>
    <div class="container">
	<font size="+4" color="#800080" align="center">快来提交你的成就</font> 

       <div class="row all from-group">
         
         <table class="from-group">
		   <tr>
		      <td ><label>账&nbsp; &nbsp; &nbsp;号:</label></td>
			   <td>&nbsp; &nbsp;</td>	
		      <td><input class=" form-control" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/></td>
		   </tr>
		    <tr><td><br></td></tr>
		   <tr>
		      <td> <label>密&nbsp; &nbsp; &nbsp;码:</label> </td> 
              <td>&nbsp; &nbsp;</td>		  
		      <td><input class=" form-control" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>	</td>
		   </tr>
		   <tr><td><br></td></tr>
		    <tr>
		      <td> <label>参赛团队:</label> </td> 
              <td>&nbsp; &nbsp;</td>		  
		      <td><input class=" form-control" type="text" placeholder="Team" id="team"/></td>
		   </tr>
		    </table>
			  <div class="row data from-group">
			     <div class="col-md-1">
				 
				  <select name="month" id="month">
			        <option value="1">1</option>
			        <option value="2">2</option>	
			        <option value="3">3</option>	
			        <option value="4">4</option>	
			        <option value="5">5</option>	
			        <option value="6">6</option>	
			        <option value="7">7</option>	
			        <option value="8">8</option>	
			        <option value="9">9</option>
			        <option value="10">10</option>
			        <option value="11">11</option>
			        <option value="12">12</option>		
		         </select>
				</div>
		          <div class="col-md-offset-1 col-md-1">月</div>
			   <div class=" col-md-1">
			   <select name="day" id="day">
			       <option value="1">1</option>
				   <option value="2">2</option>
				   <option value="3">3</option>
				   <option value="4">4</option>
				   <option value="5">5</option>
				   <option value="6">6</option>
			       <option value="7">7</option>
		           <option value="8">8</option>
		           <option value="9">9</option>
		           <option value="10">10</option>
                   <option value="11">11</option>
			       <option value="2">12</option>
		           <option value="13">13</option>
		           <option value="14">14</option>
		           <option value="15">15</option>
                   <option value="16">16</option>
			       <option value="17">17</option>
		           <option value="18">18</option>
		           <option value="19">19</option>
		           <option value="20">20</option>				   
			       <option value="21">23</option>
			       <option value="22">22</option>
		           <option value="23">23</option>
		           <option value="24">24</option>
		           <option value="25">25</option>
				   <option value="26">26</option>				   
			       <option value="27">27</option>
			       <option value="28">28</option>
		           <option value="29">29</option>
		            <option value="30">30</option>
		           <option value="31">31</option>
	             </select>
			  </div>
				   <div class="col-md-offset-1 col-md-1">日</div>
			       <div class="col-md-offset-5 col-md-1">
				    
				 
				   </div>
				 
				 
			  </div><!--row data-->
			 <label for="exampleInputFile">File input</label>
			  <div class="row putfile from-group">
			   <div class="col-md-1">
		       <input type="file" id="exampleInputFile" accept="file">
               </div >	
                <div class="col-md-offset-5 col-md-1">
				<button class="btn btn-success" onclick="submit();">上传</button>
				</div>
                <div class="col-md-5">	
				</div> 
			   </div>
		 
		   </div><!--one-->
   </div><!--container-->
 
 
   
 </body>
<script >
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
	 if(month<=12&&day<=16){
	    alert("上传数据成功");
		window.open("导航条Demo.html");
		
	 }else{
	   alert("超过报名时间");	 
	 }	 
	 }
</script>
 
 

</html>