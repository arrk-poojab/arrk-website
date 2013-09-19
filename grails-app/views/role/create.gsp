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
					<g:message code="role.createRole" />
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
						<g:hasErrors bean="${authority}">
							<div class="errors">
								<g:renderErrors bean="${authority}" as="list" />
							</div>
						</g:hasErrors>

						<g:form action="save" class="formstyle">
							<div class="dialog">
								<table class="admingrid">
									<tbody>
										<tr class="prop">
											<td valign="top" class="name"><label for="authority"><g:message
														code="role.roleName.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:authority,field:'authority','errors')}">
												<input type="text" id="authority" name="authority"
												value="${authority?.authority?.encodeAsHTML()}" />
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label for="description"><g:message
														code="role.description.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:authority,field:'description','errors')}">
												<input type="text" id="description" name="description"
												value="${authority?.description?.encodeAsHTML()}" />
											</td>
										</tr>
									</tbody>
								</table>
							</div>

							<div class="buttons">
								<span class="button"><input class="save btn"
									type="submit" value="Create" /></span> <span class="button"><g:actionSubmit
										action="list" value="Cancel" class="btn" /></span>
							</div>
						</g:form>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!--content  [End]-->
</body>
