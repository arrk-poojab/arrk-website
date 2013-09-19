<!-- Header starts here -->
<% def username = loggedInUserInfo(field:'username'); def fullName = username.trim().split(' '); def firstName=fullName[0]; %>
<div class="headerContainer">
<div class="container_12">
<div id="skip">
  <ul>
    <li><a href="#content" id="skiptocontent" name="skiptocontent" class="skipcontent">Skip to Content</a></li>
    <li><a href="#navigation" id="skiptonavigation" name="skiptonavigation" class="skipnavigation">Skip to Navigation</a></li>
  </ul>
</div>

 <div class="header">
    <h1 class="logo grid_2"><a href="home" title="Arrk Logo"><img src="images/logo.png" alt="Arrk Logo" /></a></h1>
     <div class="contactInfo-admin grid_4 floatRight">
   	 <div class="padding-bottom-5 overflow-hidden">
   	 <span class="welcomeuser-msg floatLeft padding-left-15">
    <g:isLoggedIn>
    	<g:ifAllGranted role="ROLE_ADMIN"><a href="admin">Welcome ${firstName}</a></g:ifAllGranted>
    	<g:ifNotGranted role="ROLE_ADMIN"><a>Welcome ${firstName}</a></g:ifNotGranted>
    </g:isLoggedIn>
    </span>
    <div class="adminInfo floatRight"> 
	  <div>
	    <form id="searchForm" method="post" >
		<div>
		<label for="s" class="hidden">Search</label>
			<input id="s"  type="text" name="s" class="search-field" size="20" placeholder="Search" />
			<input class="search-btn" type="submit" value="" id="submitButton" />
		</div>
	    </form>	
	 </div>
	  </div>
	 </div>  
      <div class="clear"></div>
      <span class="contactLink">
     <a href="contactUs" class="bottomBorder" id="contactUsTab"><g:message code="tab.contactUs"/></a>
     <g:isLoggedIn>
        <a href="logout"><g:message code="Logout"/></a>
      </g:isLoggedIn>
      <g:isNotLoggedIn>
        <g:link controller="login" action="auth" params="['goToPath':'/']"><g:message code="header.login"/></g:link>
      </g:isNotLoggedIn> 
    
     </span> 
	     <span class="contactNumber">
	     <h2><strong><g:message code="header.find.out.more.services"/></strong></h2>
            <h3>UK: +44 (0)<span style="display:none;">-</span>161<span style="display:none;">-</span> 227 9900</h3>
	     </span> 
      </div>
<div class="clear"></div>    
 <fts:display filePath="/home/header"/>
 </div> 
<div id="bottom"> <a href="javascript:void(0);" accesskey="X">To Bottom</a> <span class="remove">(X)</span></div>
 </div>
 </div> 

<!-- Header ends here -->