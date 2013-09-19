<head>
<meta name="layout" content="adminBaseLayout" />
</head>


<body>


	<div class="clear"></div>
	<div class="contentContainer">
		<div class="container_12">
			<!--Channel [Start]-->
			<div class="subchannel">
				<h2 class="grid_8 prefix_2">
					<g:message code="requestmap.showRequestmap" />
				</h2>
			</div>
			<!--Channel [End]-->
			<div class="content">
				<div class="grid_8 prefix_2">

					<div class="body">

						<g:if test="${flash.message}">
							<div class="message">
								${flash.message}
							</div>
						</g:if>
						<div class="formstyle">
							<div class="dialog">
								<table class="admingrid">
									<tbody>
										<tr class="prop">
											<td valign="top" class="name"><g:message
													code="requestmap.url.label" /></td>
											<td valign="top" class="value">
												${requestmap.url}
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><g:message
													code="requestmap.role.label" /></td>
											<td valign="top" class="value">
												${requestmap.configAttribute}
											</td>
										</tr>

									</tbody>
								</table>
							</div>

							<div class="buttons">
								<g:form>
									<input type="hidden" name="id" value="${requestmap.id}" />
									<span class="button"><g:actionSubmit class="edit btn"
											value="Edit" /></span>
									<span class="button"><g:actionSubmit class="delete btn"
											onclick="return confirm('Are you sure?');" value="Delete" /></span>
									<span class="button"><g:actionSubmit action="list"
											value="Cancel" class="btn" /></span>
								</g:form>
							</div>
						</div>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	</div>
</body>