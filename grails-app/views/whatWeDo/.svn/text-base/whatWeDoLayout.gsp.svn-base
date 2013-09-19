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
<div class="container_12">
<div class="channelContainer-whatwedo positionRel">
<%-- <div class="ht">
    <div class="ht1"><div class="ht2"><div class="ht3"><div class="ht4"></div></div></div></div>
	</div> --%>
<div class="keyArtical">
	   <fts:display filePath="/whatWeDo/thumbnail/${subName}"/>
</div>
<div class="relatedArtical">
	<div class="whatwedo-nav">
		<a href="javascript:void(0);" id="prev" class="previous">Prev</a>
		<a href="javascript:void(0);" id="pause" class="pause">Pause</a>
		<a href="javascript:void(0);" id="play" class="play">Play</a>
		<a href="javascript:void(0);" id="next" class="next">Next</a>
	</div>
 <div class="slideshow">
 <!-- Starts -->
<fts:display filePath="/whatWeDo/relatedLinks/${subName}"/>
   
	<!-- -ends -->
	</div>	
</div>
<div class="clear"></div>
</div>

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
