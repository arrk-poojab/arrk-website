<head>
<meta name="layout" content="adminBaseLayout" />
<g:render template="/layouts/homeHead" />
</head>

<body>
	<!--Channel [Start]-->
	<div class="body">
		<div class="contentContainer">
			<div class="container_12">
				<!--Channel [Start]-->
				<div class="subchannel">
					<h2 class="grid_8 prefix_4">
						<g:message code="admin.listUser" />
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
									<g:sortableColumn property="id" title="Id" />
									<g:sortableColumn property="username" title="Login Name" />
									<g:sortableColumn property="email" title="Email" />
									<g:sortableColumn property="organisation" title="Organisation" />
									<g:sortableColumn property="jobtitle" title="Jobtitle" />
									<g:sortableColumn property="phone" title="Phone" />
									<g:sortableColumn property="interest" title="Interest" />
									<g:sortableColumn property="View" title="View" />
									<g:sortableColumn property="Edit" title="Edit" />
								</tr>
							</thead>
							<tbody>
								<g:each in="${personList}" status="i" var="person">
									<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
										<td>
											${person.id}
										</td>
										<td>
											${person.username?.encodeAsHTML()}
										</td>
										<td>
											${person.email?.encodeAsHTML()}
										</td>
										<td>
											${person.organisation?.encodeAsHTML()}
										</td>
										<td>
											${person.jobtitle?.encodeAsHTML()}
										</td>
										<td>
											${person.phone?.encodeAsHTML()}
										</td>
										<td>
											${person.interest?.encodeAsHTML()}
										</td>
										<td class="actionButtons"><span class="actionButton">
												<g:link action="show" id="${person.id}">
													<g:message code="admin.show.label" />
												</g:link>
										</span></td>
										<td class="actionButtons"><span class="actionButton">
												<g:link action="edit" id="${person.id}">
													<g:message code="admin.edit.label" />
												</g:link>
										</span></td>
									</tr>
								</g:each>
							</tbody>
						</table>
					</div>
					<div class="clear"></div>
					<div class="pagination-container">
						<div class="export-pagination">
							<a
								href="${createLink(action:'exportUserInfoReport',controller:'download')}"
								class="csv"><g:message code="export.into.csv" /></a>
						</div>
						<div class="paginateButtons">
							<g:paginate total="${User.count()}" />
						</div>
					</div>

				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</body>
