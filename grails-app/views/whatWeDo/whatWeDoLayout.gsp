<!DOCTYPE html>
<html lang="en">
<head>
<meta name="layout" content="baseLayout" />
<g:render template="/layouts/homeHead"/>
  <g:set var="fileName" value="${URLDecoder.decode(request.forwardURI, 'UTF-8')}"/>
    <g:set var="subName" value="${fileName.substring(fileName.lastIndexOf('/') + 1)}"/>   
	<script type="text/javascript">
	    $(document).ready(function() {
			highlightTab("#whatWeDoTab")
		});
	</script>
</head>
<body>
<div class="clear"></div>
<!--content  [Start]-->
<div class="contentContainer expertContainer">
<div class="channelContainer-whatwedo positionRel">
	<fts:display filePath="/whatWeDo/thumbnail/${subName}"/>
</div>
<div class="container_12">

<div class="content">
  
  <div id="domain" >
 		<fts:display filePath="${fileName}"/>
	</div>  
<div class="clear"></div>
  </div>
</div>
</div>
<!--content  [End]-->
</body>
</html>
