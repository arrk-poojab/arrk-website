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
					<g:message code="admin.editUser.label" />
				</h2>
			</div>
			<!--Channel [End]-->

			<div class="content">
				<div class="grid_8 prefix_2">

					<div class="body">
						<g:hasErrors bean="${person}">
							<div class="errors">
								<g:renderErrors bean="${person}" as="list" />
							</div>
						</g:hasErrors>
						<g:form class="formstyle">
							<input type="hidden" name="id" value="${person.id}" />
							<input type="hidden" name="version" value="${person.version}" />
							<div class="dialog">
								<table class="admingrid">
									<tbody>

										<tr class="prop">
											<td valign="top" class="name"><label for="username"><g:message
														code="admin.loginName.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'username','errors')}">
												<input type="text" id="username" name="username"
												readonly="true" value="${person.username?.encodeAsHTML()}" />
											</td>
										</tr>


										<tr class="prop">
											<td valign="top" class="name"><label for="email"><g:message
														code="admin.email.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'email','errors')}">
												<input type="text" id="email" name="email" readonly="true"
												value="${person.email?.encodeAsHTML()}" />
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label for="passwd"><g:message
														code="admin.password.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'passwd','errors')}">
												<input type="password" id="passwd" name="passwd"
												readonly="true" value="${person.passwd?.encodeAsHTML()}" />
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label for="organisation"><g:message
														code="admin.organisation.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'organisation','errors')}">
												<input type="text" id="organisation" name="organisation"
												readonly="true"
												value="${person.organisation?.encodeAsHTML()}" />
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label for="jobtitle"><g:message
														code="admin.jobTitle.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'jobtitle','errors')}">
												<input type="text" id="jobtitle" name="jobtitle"
												readonly="true" value="${person.jobtitle?.encodeAsHTML()}" />
											</td>
										</tr>


										<tr class="prop">
											<td valign="top" class="name"><label for="phone"><g:message
														code="admin.phone.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'phone','errors')}">
												<input type="text" id="phone" readonly="true" name="phone"
												value="${person.phone?.encodeAsHTML()}" />
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label for="interest"><g:message
														code="admin.interest.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'interest','errors')}">
												<g:select name="interest"
													from="${grailsApplication.config.levelOfInterestList}"
													disabled="true" value="${person.interest?.encodeAsHTML()}"
													noSelection="${['':selectLabel]}" />
											</td>
										</tr>



										<tr class="prop">
											<td valign="top" class="name"><label for="enabled"><g:message
														code="admin.login.enabled" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'enabled','errors')}">
												<g:checkBox name="enabled" value="${person.enabled}" />
											</td>
										</tr>


										<tr class="prop">
											<td valign="top" class="name"><label for="authorities"><g:message
														code="admin.roles.label" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'authorities','errors')}">
										</tr>

										<g:each var="entry" in="${roleMap}">
											<tr>
												<td valign="top" class="name" align="left">
													${entry.key.authority.encodeAsHTML()}
												</td>
												<td align="left"><g:checkBox
														name="${entry.key.authority}" value="${entry.value}" /></td>
											</tr>
										</g:each>

									</tbody>
								</table>
							</div>

							<div class="buttons">
								<span class="button"><g:actionSubmit class="save btn"
										value="Update" /></span> <span class="button"><g:actionSubmit
										class="delete btn" onclick="return confirm('Are you sure?');"
										value="Delete" /></span> <span class="button"><g:actionSubmit
										action="list" value="Cancel" class="btn" /></span>
							</div>

						</g:form>

					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
</body>
