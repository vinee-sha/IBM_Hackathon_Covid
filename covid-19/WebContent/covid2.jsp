<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="">
<head>
<title>Covid-19</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css"
	media="all">
</head>
<body id="top" class="bgded overlay"
	style="background-image: url('images/corona.jpg');">
	<div class="wrapper row1">
		<header id="header" class="hoc clear">
			<div id="logo" class="fl_left">
				<div class="col-sm-4 col-xs-12">
					<img src="images/logo.png" style="width: 50px; height: 50px" /> <font
						color="#ed2f85">COVID-19</font>
					<div id="gtco-logo"></div>
				</div>
			</div>
			<nav id="mainav" class="fl_right" >
				<ul class="clear" style="color:#ed2f85;">
				<li><a href="covid2.jsp">ChatBot</a></li>
					<li><a class="drop" href="#">About</a>
						<ul style="color:#ed2f85;">
						
							<li ><a href="covid1.jsp">Overview</a></li>
							<li><a href="covid3.jsp">Preventions</a></li>
							<li><a href="covid4.jsp">Symptoms</a></li>
						</ul></li>
					
					
					<li><a href="Login.html">Logout</a></li>
				</ul>
			</nav>
		</header>
	</div>
	
<script>
  window.watsonAssistantChatOptions = {
      integrationID: "6fe7f831-9dbb-4737-914a-65082a975f77", // The ID of this integration.
      region: "eu-gb", // The region your integration is hosted in.
      serviceInstanceID: "ce22428f-cc97-46a3-9da0-c51c4703bf66", // The ID of your service instance.
      onLoad: function(instance) { instance.render(); }
    };
  setTimeout(function(){
    const t=document.createElement('script');
    t.src="https://web-chat.global.assistant.watson.appdomain.cloud/loadWatsonAssistantChat.js";
    document.head.appendChild(t);
  });
</script>

<br>
	<br><div style="margin-left:1120px; width:100%; color:#ed2f85">
	<pre><span class="inner-pre" style="font-size: 27px">





Have any doubts about 
CORONA VIRUS??

Here is the CHATBOT.. 

Ask a question on 
COVID-19, 

it will reply you...













</span></pre>

</div>
</body>

</html>