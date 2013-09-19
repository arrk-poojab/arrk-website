

import org.codehaus.groovy.grails.plugins.springsecurity.Secured

class SecureController {

    def index = {
      render 'Secure access only'
   }
	
	
//	static transactional = true 
//	static scope = "request"
//	
//	@Secured(["ROLE_SUPERVISOR"]) 
//	def getSome()
//	{ 
//		println "getSome()" 
//		return "this method is for ROLE_SUPERVISOR Only" 
//		} 
//	@Secured(["ROLE_USER"]) 
//	def doSome()
//	{ 
//		println "doSome() method for ROLE_USER" 
//		return "this method is for ROLE_USER Only" 
//	}
}
