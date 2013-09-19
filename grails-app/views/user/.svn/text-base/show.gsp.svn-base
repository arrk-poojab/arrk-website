<head>
<meta name="layout" content="adminBaseLayout" />
</head>

<body>

	<div class="clear"></div>

	<div class="contentContainer">
		<div class="container_12">
			<!--Channel [Start]-->
			<div class="subchannel">
				<h2 class="grid_8 prefix_2">Show User</h2>
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
											<td valign="top" class="name">Login Name:</td>
											<td valign="top" class="value">
												${person.username?.encodeAsHTML()}
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name">Email:</td>
											<td valign="top" class="value">
												${person.email?.encodeAsHTML()}
											</td>
										</tr>


										<tr class="prop">
											<td valign="top" class="name">Organisation:</td>
											<td valign="top" class="value">
												${person.organisation?.encodeAsHTML()}
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name">Job Title:</td>
											<td valign="top" class="value">
												${person.jobtitle?.encodeAsHTML()}
											</td>
										</tr>


										<tr class="prop">
											<td valign="top" class="name">Phone:</td>
											<td valign="top" class="value">
												${person.phone?.encodeAsHTML()}
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name">Interest:</td>
											<td valign="top" class="value">
												${person.interest?.encodeAsHTML()}
											</td>
										</tr>

										<tr class="prop">
											<td valign="top" class="name">Enabled:</td>
											<td valign="top" class="value">
												${person.enabled}
											</td>
										</tr>






										<tr class="prop">
											<td valign="top" class="name">Roles:</td>
											<td valign="top" class="value"><g:each in="${roleNames}"
													var='name'>
													${name}</br>
												</g:each></td>
										</tr>

									</tbody>
								</table>
							</div>

							<div class="buttons">
								<g:form>
									<input type="hidden" name="id" value="${person.id}" />
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
</body>
