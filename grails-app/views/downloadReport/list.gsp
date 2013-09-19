<head>
	<meta name="layout" content="adminBaseLayout" />
	<g:render template="/layouts/homeHead"/>
</head>

<body>

	<div class="body">
		

	
			 <div class="contentContainer">
      <div class="container_12">
 <!--Channel [Start]-->
	<div class="subchannel">
		<h2 class="grid_8 prefix_4">Download Report</h2> 
	</div>
   <!--Channel [End]-->
		<div class="content">
         <div class="grid_12">
         		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
	      <table class="admin-grid" width="100%;">
			<thead>
				<tr>
					<g:sortableColumn property="id" title="ID" />
					<g:sortableColumn property="username" title="Username" />
					<g:sortableColumn property="downloadables" title="Downloadables" />
					<g:sortableColumn property="timestamp" title="Timestamp" />
				
				</tr>
			</thead>
			<tbody>
			<g:each in="${downloadReportList}" status="i" var="requestmap">
				<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
					<td>${downloadReportList[i].id}</td>
					<td>${downloadReportList[i].username?.encodeAsHTML()}</td>
					<td>${downloadReportList[i].downloadables?.encodeAsHTML()}</td>
                    <td>${downloadReportList[i].timestamp?.encodeAsHTML()}</td>
				</tr>
			</g:each>
			</tbody>
			</table>
		</div>
		 <div class="clear"></div>
		<div class="pagination-container">
			<div class="export-pagination">
				<a href="${createLink(action:'exportDownloadReport',controller:'download')}">Export Into CSV</a>
			</div>
			<div class="paginateButtons">
				<g:paginate total="${DownloadReport.count()}" />
			</div>
		</div>	
</div>
	    </div>
	        <div class="clear"></div>
	    </div>
	</div>
</body>
