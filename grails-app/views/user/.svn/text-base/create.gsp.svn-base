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
					<g:message code="admin.createUser" />
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
						<g:hasErrors bean="${person}">
							<div class="errors">
								<g:renderErrors bean="${person}" as="list" />
							</div>
						</g:hasErrors>
						<g:form action="save" class="formstyle">
							<div class="dialog">
								<table class="admingrid">
									<tbody>

										<tr class="prop">
											<td valign="top" class="name"><label for="username"><g:message
														code="admin.loginName.label" /></label><b style="color: #FF0000">*</b></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'username','errors')}">
												<input type="text" id="username" name="username"
												value="${person.username?.encodeAsHTML()}"
												placeholder=' Firstname  Surname' />
											</td>
										</tr>


										<tr class="prop">
											<td valign="top" class="name"><label for="email"><g:message code="admin.email.label" />${person?.email?.encodeAsHTML()}</label><b style="color: #FF0000">*</b></td>
											<td class="value${hasErrors(bean:person,field:'email','errors')}">
												<input type="text" id="email" name="email" title="Email" value="${person.email?.encodeAsHTML()}" placeholder='Enter your Email Id' />
											</td>
										</tr>
										


										<tr class="prop">
											<td valign="top" class="name"><label for="passwd"><g:message
														code="admin.password.label" /></label><b style="color: #FF0000">*</b></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'passwd','errors')}">
												<input type="password" id="passwd" name="passwd"
												value="${person.passwd?.encodeAsHTML()}" />
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label for="organisation"><g:message
														code="admin.organisation.label" /></label><b
												style="color: #FF0000">*</b></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'organisation','errors')}">
												<input type="text" id="organisation" name="organisation" 
												value="${person.organisation?.encodeAsHTML()}" placeholder='' />
											</td>
										</tr>
										
				

										<tr class="prop">
											<td valign="top" class="name"><label for="jobtitle"><g:message
														code="admin.jobTitle.label" /></label><b style="color: #FF0000">*</b></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'jobtitle','errors')}">
												<input type="text"  name="jobtitle" 
												value="${person.jobtitle?.encodeAsHTML()}" placeholder=''/>
											</td>
										</tr>



										<tr class="prop">
											<td valign="top" class="name"><label for="phone"><g:message
														code="admin.phone.label" /></label><b style="color: #FF0000">*</b></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'phone','errors')}">
												<input type="text"  name="phone"
												value="${person.phone?.encodeAsHTML()}" placeholder=''/>
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name"><label for="interest"><g:message
														code="admin.interest.label" /></label><b style="color: #FF0000">*</b></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'interest','errors')}" placeholder=''>
												<g:select name="interest"
													from="${grailsApplication.config.levelOfInterestList}"
													value="${person.interest?.encodeAsHTML()}"
													noSelection="${['':selectLabel]}" />
											</td>
										</tr>



										<tr class="prop">
											<td valign="top" class="name"><label for="enabled"><g:message
														code="admin.login.enabled" /></label></td>
											<td valign="top"
												class="value ${hasErrors(bean:person,field:'enabled','errors')}">
												<g:checkBox name="enabled" value="${true}"></g:checkBox>
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name" align="left"><g:message
													code="admin.assignRoles" /></td>
										</tr>

										<g:each in="${authorityList}">
											<tr>
												<td valign="top" class="name" align="left">
													${it.authority.encodeAsHTML()}
												</td>
												<td align="left"><g:checkBox name="${it.authority}" /></td>
											</tr>
										</g:each>

									</tbody>
								</table>
							</div>

							<div class="buttons">
								<span class="button"><input class="save btn" 
									type="submit" value="Register" /></span> <span class="button"><g:actionSubmit
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

