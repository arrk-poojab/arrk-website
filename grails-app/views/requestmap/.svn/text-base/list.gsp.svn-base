<head>
<meta name="layout" content="adminBaseLayout" />
<g:render template="/layouts/homeHead" />
</head>

<body>

	<div class="body">
		<div class="contentContainer">
			<div class="container_12">
				<!--Channel [Start]-->
				<div class="subchannel">
					<h2 class="grid_8 prefix_4">
						<g:message code="requestmap.listRequestmap" />
					</h2>
				</div>
				<!--Channel [End]-->
				<div class="content">
					<div class="grid_12">
						<g:if test="${flash.message}">
							<div class="message">
								${flash.message}
							</div>
						</g:if>
						<table class="admin-grid" width="100%;">
							<thead>
								<tr>
									<g:sortableColumn property="id" title="ID" />
									<g:sortableColumn property="url" title="URL Pattern" />
									<g:sortableColumn property="configAttribute" title="Roles" />
									<g:sortableColumn property="view" title="View" />

								</tr>
							</thead>
							<tbody>
								<g:each in="${requestmapList}" status="i" var="requestmap">
									<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
										<td>
											${requestmap.id}
										</td>
										<td>
											${requestmap.url?.encodeAsHTML()}
										</td>
										<td>
											${requestmap.configAttribute}
										</td>
										<td class="actionButtons"><span class="actionButton">
												<g:link action="show" id="${requestmap.id}">
													<g:message code="requestmap.show.label" />
												</g:link>
										</span></td>
									</tr>
								</g:each>
							</tbody>
						</table>
					</div>

					<div class="paginateButtons">
						<g:paginate total="${Requestmap.count()}" />
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</body>
