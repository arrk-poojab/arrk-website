<!doctype html>
<html lang="en">
<head>
	<meta name="layout" content="baseLayout" />
	<g:render template="/layouts/homeHead"/>
	<g:set var="fileName" value="${URLDecoder.decode(request.forwardURI, 'UTF-8')}"/>
    <g:set var="subName" value="${fileName.substring(fileName.lastIndexOf('/') + 1)}"/>
    <g:set var="Name" value="${fileName.substring(0,30)}"/>
    
	<script type="text/javascript">
	$(document).ready(function() {
			highlightTab("#whatWeDoTab")
		});
	</script>	
   </head>
<body>
<%--<div class="subChannelContainer">--%>
<%--<div class="container_12"> --%>
<%--<!--Channel [Start]-->--%>
<%--<div class="subchannel">--%>
<%--	<h2 class="grid_8 prefix_4"><fts:title filePath="${fileName}" messageKey="${subName}"/></h2> --%>
<%--</div>--%>
<%--   <!--Channel [End]-->--%>
<%--  </div>--%>
<%--  </div>--%>
 <div class="clear"></div>
 <div class="contentContainer">
<div class="container_12"> 
<!--Channel [Start]-->
<div class="subchannel">
	<h2 class="grid_8 prefix_4"><fts:title filePath="${fileName}" messageKey="${subName}"/></h2> 
</div>
   <!--Channel [End]-->
  <!--content  [Start]-->
<div class="content">
<div class="submenu grid_3 suffix_1" id="leftNav">
   
      <g:isLoggedIn>
      	<input type='hidden' id='userSession' value='Y' name="userSession"/>
      </g:isLoggedIn>
      
      <g:isNotLoggedIn>
      	<input type='hidden' id='userSession' value="N" name="userSession"/>
      </g:isNotLoggedIn> 
      
       <fts:display filePath="/links/whatWeDoLinks" />
     <div class="clear"></div>
       <fts:displayActionPanel filePath="/downloadLink/${subName}"  panelPath="/downloadLink/callToActionPanel" />
    
</div>
     <div class="grid_8">
    	<fts:display filePath="${fileName}"/>
    </div>
    
  <div class="clear"></div>
</div>
  <!--content  [End]-->
  </div>
  </div>
</body>
</html>