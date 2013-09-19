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
		<h2 class="grid_8 prefix_5 margin-left-50"><g:message code="login.heading"/></h2> 
	</div>
    <!--Channel [End]-->
   	<div class="content prefix_3">
	  <div class="grid_5 padding-right-20 padding-left-40 margin-top-30">		
		<form action='${postUrl}' method='POST' id='formLogin' name="formContactUs" class="formstyle">
			<g:if test='${flash.message}'>
				<div class='login-error-message'>${flash.message}</div>
			</g:if>
			<input type='hidden' id='spring-security-redirect' name="spring-security-redirect" value="${request.getParameter("goToPath")}"  />
			<fieldset>
				<dl>
					<dd>
						<label for='j_username'><g:message code="login.loginId.label"/></label>
						<input type='text' class='text_' name='j_username' id='j_username' value='${request.remoteUser}' placeholder='Enter your Login Name' />
					</dd>
					<dd>
						<label for='j_password'><g:message code="login.password.label"/></label>
					    <input type='password' class='text_' name='j_password' id='j_password' placeholder='Enter your Password' />
					</dd>
					<dd>
						<input type='submit' class="btn floatRight" value="Login" />
					</dd>
					<dd class="separator-top padding-top-10">		    					
					    <input type='checkbox' class='chk left-float' name='_spring_security_remember_me' id='remember_me'
						<g:if test='${hasCookie}'>checked='checked'</g:if> />	<label for='remember_me' class="padding-left-5"><g:message code="login.rememberMe.label"/></label>						
						<span class="right-float"><g:link controller='register'  params='["returnToUrl":"${goTopath}"]'><g:message code='Register'/></g:link></span>
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
