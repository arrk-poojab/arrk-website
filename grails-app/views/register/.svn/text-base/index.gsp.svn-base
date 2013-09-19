<head>
	<meta name="layout" content="baseLayout" />
	
</head>

<body>
<g:set var="selectLabel" value="${message(code:'select.label', default:'Select')}"/>

  <g:set var="returnToUrl" value="${request.getParameter("returnToUrl")}" />


<div class="clear"></div>
<div class="contentContainer">
	<div class="container_12">

 <!--Channel [Start]-->
	<div class="subchannel">
		<h2 class="grid_8 prefix_2"><g:message code="registration.heading"/></h2> 
	</div>
   <!--Channel [End]-->
		<div class="content">
	    	<div class="grid_8 prefix_2">		

	<div class="body">
		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
		<g:hasErrors bean="${person}">
		<div class="errors">
			<g:renderErrors bean="${person}" as="list" />
		</div>
		</g:hasErrors>

		<g:form action="save" params='["returnToUrl":"${returnToUrl}"]' class="formstyle">
		
		<div class="dialog">
		<table class="admingrid" >

		<tbody>
			<tr class='prop'>
				<td  class='name'><label for='username'><g:message code="registration.loginName.label"/></label>
				<b style="color:#FF0000">*</b>
				</td>
				<td  class='value${hasErrors(bean:person,field:'username','errors')}'>
					<input type="text" name='username' id="username" value="${person?.username?.encodeAsHTML()}" placeholder='Firstname   Surname'/>
				</td>
			</tr>

			<tr class='prop'>
				<td class='name'><label for='email'><g:message code="registration.email.label"/></label>
				<b style="color:#FF0000">*</b>
				</td>
				<td  class='value${hasErrors(bean:person,field:'email','errors')}'>
					<input type="text" name='email' id="email" title="Email" value="${person?.email?.encodeAsHTML()}" placeholder='Enter your Email Id'/>
				</td>
			</tr>
			

			<tr class='prop'>
				<td  class='name'><label for='passwd'><g:message code="registration.password.label"/></label>
				<b style="color:#FF0000">*</b>
				</td>
				<td  class='value${hasErrors(bean:person,field:'passwd','errors')}'>
					<input type="password" name='passwd' id="passwd" title="Password" value="${person?.passwd?.encodeAsHTML()}"/>
				</td>
			</tr>
			
			<tr class="prop">
						<td  class="name"><label for="organisation"><g:message code="registration.organisation.label"/></label>
						<b style="color:#FF0000">*</b>
						</td>					
						<td class="value${hasErrors(bean:person,field:'organisation','errors')}">
							<input type="text" id="organisation" name="organisation" value="${person.organisation?.encodeAsHTML()}"/>
						</td>
			</tr>
					
			<tr class="prop">
						<td  class="name"><label for="jobtitle"><g:message code="registration.jobTitle.label"/></label>
						<b style="color:#FF0000">*</b>
						</td>
						<td  class="value${hasErrors(bean:person,field:'jobtitle','errors')}">
							<input type="text" id="jobtitle" name="jobtitle" value="${person.jobtitle?.encodeAsHTML()}"/>
						</td>
			</tr>
					
					
			<tr class="prop">
						<td  class="name"><label for="phone"><g:message code="registration.phone.label"/></label>
						<b style="color:#FF0000">*</b>
						</td>
						<td  class="value${hasErrors(bean:person,field:'phone','errors')}">
							<input type="text" id="phone" name="phone" value="${person.phone?.encodeAsHTML()}"/>
						</td>
			</tr>
					
			<tr class="prop">
						<td  class="name"><label for="interest"><g:message code="registration.interest.label"/></label>
						<b style="color:#FF0000">*</b>
						</td>
						<td  class="value${hasErrors(bean:person,field:'interest','errors')}">
							<g:select name="interest" from="${grailsApplication.config.levelOfInterestList}" value="${person.interest?.encodeAsHTML()}" noSelection="${['':selectLabel]}"/>
						</td>
			</tr>

		</tbody>
		</table>
		</div>

		<div class="buttons">
			<span class="formButton">
				<input class='btn' type="submit" value="Register" />
			</span>
		</div>

		</g:form>
	</div>
	</div>
	        <div class="clear"></div>
	    </div>
	</div>
</div>
</body>
