<!doctype html>
<html lang="en">
<head>
 <%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8"%>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <title>Login</title>
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
    0%   {background:url("../picture/bg-register-01.jpg");}
    34%  {background:url("../picture/bg-register-02.jpg");}
    67%  {background:url("../picture/bg-register-03.jpg");}
    100% {background:url("../picture/bg-register-04.jpg");}
   }
   /*使用 opacity，那么所有子元素都会受到影响所以使用 rgba（）函数*/
  .all{
        background:  rgba(255, 255, 255, 0.25);width:600px;margin:120px auto;
		
		 }
    input[type="text"],input[type="password"]{padding-left:26px;} 
    .checkbox{
	      padding-left:10px;
	}
.register{
 position: absolute;
  left:1700px;
  top:440px;
 
}
.t1{
position: absolute;
  left:300px;
  top: 100px; 
}
.t2{
position: absolute;
  left:450px;
  top: 300px; 
}
h1{
text-shadow: 5px 5px 5px #FFD700;
}
h3{
text-shadow: 5px 5px 5px #DC143C;
}
.all{
 position: absolute;
  top: 60px;
  left:1100px;
}

.subtitle{
	color: white;
}

.bigtitle{
	font-size: 85px;
}


  </style>
  <link rel="stylesheet" href="../css/bootstrap.min.css">
  
  <script src="../js/jquery.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
  <script src="../js/holder.min.js"></script>
</head>
<body>


<div class="container">
        <div class="title t1"><h1 align="center" class="bigtitle" style="letter-spacing:2px"><b>软件创新设计大赛</b></h1></div>
         <div class="register">
        <a href="${pageContext.request.contextPath }/page/register" target="blank" id="register"><h4>点击注册</h4></a>
       </div>
        <div class="title t2"><h3 align="center" class="subtitle">用创新点缀人生，让科技融入理想</h3></div>
        <div class=" row all">
             <div class="rwo login">
             <div class="col-md-offset-3 col-md-2">
              <h3 class="title" id="login_form" style="width:300px;">LOGIN</h3> 
              </div>
             </div>
             <div class="row r">
               <div class="row login">
               <form  id="formlogin" method="post" onsubmit="return false;">
			   <div class=" col-md-offset-1 col-md-6">
                    <div class="form-group">
                        <br/>
					   <div id="userword">
					    <label>学&nbsp;&nbsp;&nbsp;号:</label>
                        <input class=" form-control" type="text" id="username" name="username" autofocus="autofocus" maxlength="20"/>
                       </div>
					</div >
                    <div class="form-group" id="passWord">
					  <label>密&nbsp;&nbsp;&nbsp;码:</label>
                      <input class=" form-control" type="password"  id="password" name="password" maxlength="8"/>	
                    </div>
                    <div class="form-group">
                        <label class="checkbox">
                            <input type="checkbox" name="remember" value="1" />记住我
                        </label>
                    </div> 
               </div>
			   <div class="col-md-5">
			   </div>
    </div>
    
		  <div class="row id">		   
					<div class="col-md-offset-1 col-md-4">		 
					     <select  class="form-control" name="statue" id="type">
						 <option value="--请选择身份--">--请选择身份--</option>
						  <option value="1">参赛学生</option>
						  <option value="2">评委</option>
						  <option value="3">管理员</option>
						 </select>
					 </div>
					 
					 <div class="col-md-2">
					 <div class="login">
                        <button type="submit" class="btn btn-success pull-right" id="loginsubmit" name="submit" >登录</button>
                     </div>
                   </div>
                   </form>
				   <div class=" col-md-4">	 
        <button type="button" class="btn btn-link btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@getbootstrap"><div style="color: white">Lost Your Password？</div> </button>
        
         
			      <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">New Imformation</h4>
      </div>
      <div class="modal-body">
        <form action="#" method="post">
           <div id="userword">
			 <label>账&nbsp;&nbsp;&nbsp;号:</label>
                 <input class=" form-control" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/>
           </div>
           <div class="form-group" id="passWord">
			  <label>学&nbsp;&nbsp;&nbsp;号:</label>
              <input class=" form-control" type="text" placeholder="sno" id="sno" name="sno" maxlength="20"/>	
           </div>
          <div class="form-group">
            <label for="recipient-name" class="control-label">新密码:</label>
            <input type="password" placeholder="Password" id="password" name="password" maxlength="8" class="form-control">
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">revise message</button>
      </div>
    </div>
  </div>
</div>
				   </div>
				   
				   
				   <div class="col-md-1">
		         </div>
		 </div>  
		</div> 
			</div>  
</div>
 </body>
 <div>
 	
 </div>
<script type="text/javascript">
     function login(){  
	    //获取文本数据
		//userword
		var userword=document.getElementById("username").value;
		var password=document.getElementById("password").value;
		var type=document.getElementById("type").value;
		if(userword=="admin" && password=="123456" ){
			if(type=="参赛者"){
				window.open("studentindex.jsp");	
			}
			else if(type=="评委"){
				window.open("judgeindex.jsp");
			}
			else if(type=="管理员"){
				window.open("adminindex.jsp");	
			}
			else{
				alert("身份不存在，请重新开始");
			}
		}else{
		  alert("你的密码或者账号有误");
		}	 
	 }
  
    
 	var redirectUrl = "${redirect}";
	var LOGIN = {
			doLogin:function() {
				$.post("/user/login", $("#formlogin").serialize(),function(data){
					if (data.status == 200) {
						alert("登录成功！");
						if (redirectUrl == "") {
							if($("#type").val() ==1){
								location.href = "http://localhost:8080/user/selectsingle?sno=" + parseInt($("#username").val());
							}else if($("#type").val() ==2){
								location.href = "http://localhost:8080/userTeacher/selectsingle?sno=" + parseInt($("#username").val());
							}else{
								location.href = "http://localhost:8080/useradmin/selectsingle?sno=" + parseInt($("#username").val());
							}
						} else {
							location.href = redirectUrl;
						}
					} else {
						alert("登录失败，原因是：" + data.msg);
						$("#loginname").select();
					}
				});
			},
			login:function() {
					this.doLogin();
			}
		
	};
	$(function(){
		$("#loginsubmit").click(function(){
			LOGIN.login();
		});
	});
  

</script>
 

</html>