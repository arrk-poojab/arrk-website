/**
 * Logout Controller (Example).
 */

import org.springframework.security.context.SecurityContextHolder
class LogoutController {

	/**
	 * Index action. Redirects to the Spring security logout uri.
	 */
	def index = {
		// TODO  put any pre-logout code here
		println(session.id)
		//session.invalidate()
		//SecurityContextHolder.clearContext()	
			
		//session.invalidate()

		//redirect(uri: '/j_spring_security_logout?logoutSuccessUrl=/login')
		
		println('after: '+session.id)
		redirect(uri: '/j_spring_security_logout')
		
	}
}
