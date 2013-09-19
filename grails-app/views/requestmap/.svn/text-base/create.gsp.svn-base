<head>
<meta name="layout" content="adminBaseLayout" />
</head>

<body>
	<g:set var="selectLabel"
		value="${message(code:'select.label', default:'Select')}" />

	<div class="clear"></div>

	<div class="contentContainer">
		<div class="container_12">
			<!--Channel [Start]-->
			<div class="subchannel">
				<h2 class="grid_8 prefix_2">
					<g:message code="requestmap.createRequestmap" />
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
						<g:hasErrors bean="${requestmap}">
							<div class="errors">
								<g:renderErrors bean="${requestmap}" as="list" />
							</div>
						</g:hasErrors>
						<g:form action="save" class="formstyle">
							<div class="dialog">
								<table class="admingrid">
									<tbody>

										<tr class="prop">
											<td valign="top" class="name"><label for="url"><g:message
														code="requestmap.url.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:requestmap,field:'url','errors')}">
												<input type="text" id="url" name="url"
												value="${requestmap.url?.encodeAsHTML()}" />
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label
												for="configAttribute"><g:message
														code="requestmap.role.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:requestmap,field:'configAttribute','errors')}">
												<input type="text" id="configAttribute"
												name="configAttribute"
												value="${requestmap.configAttribute?.encodeAsHTML()}" />
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
