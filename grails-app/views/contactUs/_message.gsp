<!doctype html>
<html lang="en">
<head>
	<meta name="layout" content="baseLayout" />
	<g:render template="/layouts/homeHead"/>
	<%@ page import="arrk.website.contactUs %>
    <head>
		<script type="text/javascript">
		$(document).ready(function() {
				highlightTab("#contactUsTab")
			});
		</script>
	</head>
</head>
<body>
	<div class="clear"></div>
	
	<!--content  [Start]-->
	<div class="contentContainer">
		<div class="container_12">
			<div class="subchannel">
				  <h2 class="grid_8 prefix_4 margin-left-20"><g:message code="contactUs.heading"/></h2>
			</div> 
		    <div class="content">
		          <h3 align="center"><g:message code="contactUs.message"/></h3>
		    </div>
		</div>
	</div>
	<!--content  [End]-->
</body>
</html>

