<!doctype html>
<html lang="en">
<head>
	<meta name="layout" content="baseLayout" />
	<g:render template="/layouts/homeHead"/>
	<g:set var="fileName" value="${URLDecoder.decode(request.forwardURI, 'UTF-8')}"/>
    <g:set var="subName" value="${fileName.substring(fileName.lastIndexOf('/') + 1)}"/>
	<g:layoutHead/>
</head>
<body>
    <div class="clear"></div> 
    <!--content  [Start]-->
	<div class="contentContainer">
		<div class="container_12"> 
		  <!--Channel [Start]-->
		  <div class="subchannel">
		     <h2 class="grid_8 prefix_4"><fts:title filePath="${fileName}" messageKey="${subName}" /></h2>
		  </div>
		   <!--Channel [End]-->
		  <div class="content">  
		    <div class="submenu grid_3">     
		       <g:pageProperty name="page.left-content" default="" />
		    </div> 
		       
			<div class="grid_8 prefix_1">
			   <g:pageProperty name="page.right-content" default="" />
			</div>	
			<div class="clear"></div>
		  </div>
		</div>
	</div>
    <!--content  [End]-->  
    <div class="clear"></div>
</body>
</html>
