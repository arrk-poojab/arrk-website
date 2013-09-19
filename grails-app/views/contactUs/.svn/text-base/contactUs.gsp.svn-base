<!doctype html>
<html lang="en">
<head>
	<meta name="layout" content="baseLayout" />
	<g:render template="/layouts/homeHead"/>
	<%@ page import="arrk.website.ContactUs %>
    <head>
		<script type="text/javascript">
		$(document).ready(function() {
				highlightTab("#contactUsTab")
			});
		</script>
	</head>
</head>
<body>
	<div class="clear"></div>
    <!--content  [Start]-->
	<div class="contentContainer">
	  <div class="container_12"> 
		<!--Channel [Start]-->
		<div class="subchannel">
			  <h2 class="grid_8 prefix_4 margin-left-20">Contact Us</h2>
		</div>
		<!--Channel [End]-->
	
	    <div class="content">
		    <div class="submenu grid_3 suffix_1">
		     <h2>Maps:</h2>
		      <ul>
			  <li><a target="_blank" href="http://maps.google.com/maps/ms?ie=UTF8&amp;hl=en&amp;msa=0&amp;msid=115851791252006996826.000436a11097e9c729552&amp;ll=53.457189,-2.27005&amp;spn=0.096692,0.2314&amp;z=12&amp;om=1" id="lnkUK">Arrk UK</a></li>
			  <li><a target="_blank" href="http://maps.google.com/maps/ms?ie=UTF8&amp;hl=en&amp;om=1&amp;msa=0&amp;msid=115851791252006996826.000436a11097e9c729552&amp;ll=19.023823,72.944412&amp;spn=0.294061,0.461426&amp;z=11" id="lnkIndia">Arrk India</a></li>
			  </ul>
		      <h2>Directions:</h2>
		      <ul>
			  <li><a onClick="window.open('machesterOfficeMap','','width=530, height=550'); return false" href="Machester Office Map.htm">Arrk UK</a></li>
			  <li><a onClick="window.open('mumbaiOfficeMap', '','width=560, height=240'); return false" href="Mumbai Office Map.htm">Arrk India</a></li>
			  </ul>
		    </div>
	        <div class="grid_8">
			 <fts:display filePath="/contactUs" />
			 <h3>Alternatively you can use the contact form below:</h3>
	   
		     <g:form method="post" action="doSend">
				<fieldset class="form">
					<g:if test="${flash.message}">
					<div class="message">${flash.message}</div>
					</g:if>
					<div class="fieldcontain">
						<label for="name">
						<g:message code="ContactUs.name.label" default="Name" />
						<b style="color:#FF0000">*</b>
						</label>
						<g:textField name="name" value="${contactUsInstance?.name}" />
						
						<g:hasErrors bean="${contactUsInstance}" field="name">
					        <ul>
								<g:eachError bean="${contactUsInstance}" field="name">
						                <div class="error-message">
						                    <li><g:message code="name.cannot.be.blank"/></li>
								        </div>
								</g:eachError>
							</ul>
				     	</g:hasErrors>
					</div>
					
					<div class="fieldcontain">
						<label for="email">
						<g:message code="ContactUs.email.label" default="Email" />
						<b style="color:#FF0000">*</b>
						</label>
						<g:textField name="email" value="${contactUsInstance?.email}" />
					</div>
					
					<div class="fieldcontain">
						<label for="enquiry">
						<g:message code="ContactUs.enquiry.label" default="Enquiry" />
						</label>
						<g:select name="enquiry" from="${grailsApplication.config.enquiryList}" value="${contactUsInstance?.enquiry}"  />
						</div>
					<div class="fieldcontain">
						<label for="message">
						<g:message code="ContactUs.message.label" default="Message" />
						<b style="color:#FF0000">*</b>
						</label>
						<g:textArea name="message" value="${contactUsInstance?.message}" />
						<g:hasErrors bean="${contactUsInstance}" field="message">
				        	<ul>
							<g:eachError bean="${contactUsInstance}" field="message">
					            <div class="error-message">
					                    <li><g:message code="message.cannot.be.blank"/></li>
								</div>
							</g:eachError>
							</ul>
				     	</g:hasErrors>
					</div>
				</fieldset>
				<fieldset >
				<g:submitButton name="sendMessage" class="btn"  value="Send Message"/>	
				</fieldset>
			</g:form>
	     </div>
	     <div class="clear"></div>
	   </div>
	  </div>
	</div>
	  <!--content  [End]-->
</body>
</html>