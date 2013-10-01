<!doctype html>
<html lang="en">
<head>
	<meta name="layout" content="baseLayout" />
	<g:render template="/layouts/homeHead"/>
</head>

<body>

<g:set var="goTopath" value="${request.getParameter("goToPath")}" /> 
<div class="clear"></div>

<div class="contentContainer">
  <div class="container_12">

    <!--Channel [Start]-->
	<div class="subchannel">
		<h2 class="grid_8 prefix_5 margin-left-50 margin-left8"><g:message code="ForgotPassword.heading"/></h2> 
	</div>
    <!--Channel [End]-->
   	<div class="content prefix_3">
	  <div class="grid_5 padding-right-20 padding-left-40 margin-top-30 margin-bottom50">		
		<form action='forgotPasswordSendMail' method="post"  id='formLogin' name="formContactUs" class="formstyle">
			<g:if test='${flash.message}'>
				<div class='login-error-message'>${flash.message}</div>
			</g:if>
			<fieldset>
				<dl>
					<dd>
						<label for='j_username'><g:message code="login.loginId.label"/></label>
						<input type='text' class='text_' name='username' id='username'  />
					</dd>
					<dd>
						<label for='j_email'><g:message code="forgotPassword.email.label"/></label>
						<input type='text' class='text_' name='email' id='email'  />
					</dd>
					<dd>
						<input type='submit' class="btn floatRight" value="Submit" />
					</dd>
				</dl>	
			</fieldset>
		</form>
	  </div>
	</div>
  </div>
</div>

</body>
</html>