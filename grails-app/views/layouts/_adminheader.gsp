<script type="text/javascript">
// see whether device supports touch events (a bit simplistic, but...)
var hasTouch = ("ontouchstart" in window);

// hook touch events for drop-down menus
// NB: if has touch events, then has standards event handling too
if (hasTouch && document.querySelectorAll) {
    var i, len, element,
        dropdowns = document.querySelectorAll("#top-navigation li.children > a");
 
    function menuTouch(event) {
        // toggle flag for preventing click for this link
        var i, len, noclick = !(this.dataNoclick);
 
        // reset flag on all links
        for (i = 0, len = dropdowns.length; i < len; ++i) {
            dropdowns[i].dataNoclick = false;
        }
 
        // set new flag value and focus on dropdown menu
        this.dataNoclick = noclick;
        this.focus();
    }
 
    function menuClick(event) {
        // if click isn't wanted, prevent it
        if (this.dataNoclick) {
            event.preventDefault();
        }
    } 
 
    for (i = 0, len = dropdowns.length; i < len; ++i) {
        element = dropdowns[i];
        element.dataNoclick = false;
        element.addEventListener("touchstart", menuTouch, false);
        element.addEventListener("click", menuClick, false);
    }
	
}
</script>


<!-- Header starts here -->
<div class="headerContainer">
<div class="container_12">
 <div class="header">
    <h1 class="logo grid_2"><a href="home" title="Arrk Logo" ><img src="images/logo.png" alt="Arrk Logo" /></a></h1>


     <div class="contactInfo-admin grid_4 floatRight">

   	 <div class="padding-bottom-5 overflow-hidden">
   	 <span class="welcomeuser-msg floatLeft padding-left-15">
    <g:isLoggedIn>
    	<g:ifAllGranted role="ROLE_ADMIN"><a href="admin">Welcome ${loggedInUserInfo(field:'username')}</a></g:ifAllGranted>
    	<g:ifNotGranted role="ROLE_ADMIN"><a>Welcome ${loggedInUserInfo(field:'username')}</a></g:ifNotGranted>
    </g:isLoggedIn>
    </span>

	 </div>  
    <div class="clear"></div>
   
      <span class="contactLink">
     <a href="contactUs" class="bottomBorder" id="contactUsTab"><g:message code="tab.contactUs"/></a>
    <g:isLoggedIn>
      <a href="logout"><g:message code="Logout"/></a>
      </g:isLoggedIn>
      <g:isNotLoggedIn><a href="login"><g:message code="header.login"/></a></g:isNotLoggedIn> 
    
     </span> <span class="contactNumber">
      <h2><b><g:message code="header.find.out.more.services"/></b></h2>
      <h3><g:message code="header.contact.services"/></h3>
      </span> 
      </div>
       
       
       
<div class="clear"></div>
    <div class="nav">
      <ul id="top-navigation">
        <li class="first"><a href="#"><g:message code="admin.tab.home"/></a></li>
        <li><a href="javascript:void(0)" ><g:message code="admin.tab.user"/></a>
			<ul>
				<li class="children"><a href="userCreate"><g:message code="admin.tab.createUser"/></a></li>
				<li class="children"><a href="admin"><g:message code="admin.tab.userList"/></a></li>
			</ul>
		</li>
        <li><a href="javascript:void(0)"><g:message code="admin.tab.role"/></a>
			<ul>
				<li class="children"><a href="createRole"><g:message code="admin.tab.createRole"/></a></li>
				<li class="children"><a href="listRole"><g:message code="admin.tab.roleList"/></a></li>
			</ul>
		
		</li>
        <li><a href="javascript:void(0)"><g:message code="admin.tab.requestMap"/></a>
	        <ul>
		        <li class="children"><a href="createRequestmap"><g:message code="admin.tab.createRequestmap"/></a></li>
				<li class="children"><a href="listRequestmap"><g:message code="admin.tab.listRequestmap"/></a></li>
			</ul>
        </li> 
         <li><a href="javascript:void(0)"><g:message code="admin.tab.reports"/></a>
	        <ul>
		        <li class="children"><a href="listDownloadReport"><g:message code="admin.tab.downloadReport"/></a></li>				
			</ul>
        </li>       
      </ul>
    </div>
  </div>
 </div>
 </div> 
   <!--Header [End]-->
<!-- Header ends here -->