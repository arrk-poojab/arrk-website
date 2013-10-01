<!doctype html>
<html lang="en">
<head>
<meta name="layout" content="baseLayout" />
<g:render template="/layouts/homeHead" />
<g:set var="fileName" value="${URLDecoder.decode(request.forwardURI, 'UTF-8')}" />
<g:set var="subName" value="${fileName.substring(fileName.lastIndexOf('/') + 1)}" />
</head>
<body>
	<div class="clear"></div>

	<!--content  [Start]-->
	<div class="contentContainer">
		<div class="container_12">
		  <div class="nopage-container">
			<div class="subchannel">
				<h2 class="grid_12">Page Not Found</h2>
			</div>
			<div class="content">
				<div class="grid_12">
					<fts:display filePath="/pageNotFound" />
				</div>
				<div class="clear"></div>
			</div>
		</div>
		</div>
	</div>
	<!--content  [End]-->
</body>
</html>