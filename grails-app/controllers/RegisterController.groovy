


import java.beans.NullPersistenceDelegate;
import java.lang.ref.ReferenceQueue.Null;

import org.springframework.security.providers.UsernamePasswordAuthenticationToken as AuthToken
import org.springframework.security.context.SecurityContextHolder as SCH
import org.grails.mail.MailService
import org.apache.commons.validator.GenericValidator

import com.sun.istack.internal.Nullable;

/**
 * Registration controller.
 */
class RegisterController {

	def authenticateService
	def daoAuthenticationProvider
	def emailerService
	def mailService

	static Map allowedMethods = [save: 'POST', update: 'POST']

	/**
	 * User Registration Top page.
	 */
	def index = {

		// skip if already logged in
		if (authenticateService.isLoggedIn()) {
			redirect action: show
			return
		}

		if (session.id) {
			def person = new User()
			person.properties = params
			return [person: person]
		}

		redirect uri: '/'
	}

	/**
	 * User Information page for current user.
	 */
	def show = {

		// get user id from session's domain class.
		def user = authenticateService.userDomain()
		if (user) {
			render view: 'show', model: [person: User.get(user.id)]
		}
		else {
			redirect action: index
		}
	}

	/**
	 * Edit page for current user.
	 */
	def edit = {

		def person
		def user = authenticateService.userDomain()
		if (user) {
			person = User.get(user.id)
		}

		if (!person) {
			flash.message = "[Illegal Access] User not found with id ${params.id}"
			redirect action: index
			return
		}

		[person: person]
	}

	/**
	 * update action for current user's edit page
	 */
	def update = {

		def person
		def user = authenticateService.userDomain()
		if (user) {
			person = User.get(user.id)
		}
		else {
			redirect action: index
			return
		}

		if (!person) {
			flash.message = "[Illegal Access] User not found with id ${params.id}"
			redirect action: index, id: params.id
			return
		}

		// if user want to change password. leave passwd field blank, passwd will not change.
		if (params.passwd && params.passwd.length() > 0
		&& params.repasswd && params.repasswd.length() > 0) {
			if (params.passwd == params.repasswd) {
				person.passwd = authenticateService.encodePassword(params.passwd)
			}
			else {
				person.passwd = ''
				flash.message = 'The passwords you entered do not match.'
				render view: 'edit', model: [person: person]
				return
			}
		}

		person.userRealName = params.userRealName
		person.email = params.email
		if (params.emailShow) {
			person.emailShow = true
		}
		else {
			person.emailShow = false
		}

		if (person.save()) {
			redirect action: show, id: person.id
		}
		else {
			render view: 'edit', model: [person: person]
		}
	}


	def delete = {
		def person = User.get(params.id)
		if (person) {
			def authPrincipal = authenticateService.principal()
			//avoid self-delete if the logged-in user is an admin
			if (!(authPrincipal instanceof String) && authPrincipal.username == person.username) {
				flash.message = "You can not delete yourself, please login as another admin and try again"
			}
			else {
				//first, delete this person from People_Authorities table.
				Role.findAll().each { it.removeFromPeople(person) }
				person.delete()
				flash.message = "User $params.id deleted."
			}
		}
		else {
			flash.message = "User not found with id $params.id"
		}

		redirect view: 'list', model: [person: person]
	}

	/**
	 * Person save action.
	 */
	def save = {

		// skip if already logged in
		if (authenticateService.isLoggedIn()) {
			redirect action: show
			return
		}

		def person = new User()
		person.properties = params

		def config = authenticateService.securityConfig
		def defaultRole = config.security.defaultRole

		def role = Role.findByAuthority(defaultRole)
		if (!role) {
			person.passwd = ''
			flash.message = 'Default Role not found.'
			render view: 'index', model: [person: person]
			return
		}


		if ((person.username).trim() == '')
		{
			flash.message = 'Login Name cannot be blank'
			render view: 'index', model: [person: person]
			return
		}


		def fullName = (params.username).trim().split(' ')

		def firstname = fullName[0]

		if ( firstname.length() > 11){
			person.username==''
			flash.message = 'First Name can be maximum 11 characters.'
			render view: 'index', model: [person: person]
			return
		}



		if ((params.passwd).trim() =='') {
			flash.message = 'Password cannot be blank'
			render view: 'index', model: [person: person]
			return
		}




		person.email=params.email
		try{
			def emailAddresses=params.email

			//assert GenericValidator.isEmail(emailAddresses)
			if (!GenericValidator.isEmail(emailAddresses)){
				// call errors.rejectValue(), or return false, or return an error code
				flash.message = 'Invalid Email.'
				render view: 'index', model: [person: person]
				return
			}

		}
		catch (Exception e) {
			log.error("stack trace", e)
			flash.message = 'try error.'
			render view: 'index', model: [person: person]
			return
		}


		if ((params.organisation).trim() =='') {
			flash.message = 'Organisation cannot be blank.'
			render view: 'index', model: [person: person]
			return
		}

		if ((params.jobtitle).trim() =='') {
			flash.message = 'Job Title cannot be blank.'
			render view: 'index', model: [person: person]
			return
		}



		if ((params.phone).trim() =='') {
			flash.message = 'Phone cannot be blank.'
			render view: 'index', model: [person: person]
			return
		}

		def phoneNo = (params.phone).trim();

		for (int i = 0; i < phoneNo.length(); i++) {
			//If we find a non-digit character we return false.
			if (!Character.isDigit(phoneNo.charAt(i)))
			{
				if(phoneNo.charAt(i)!=" "){
					flash.message = 'Phone cannot be non-numeric.'
					render view: 'index', model: [person: person]
					return
				}
			}
		}


		if (params.interest =='') {
			flash.message = 'Interest cannot be blank.'
			render view: 'index', model: [person: person]
			return
		}

		def passwdWithoutEncode = params.passwd;

		def pass = authenticateService.encodePassword(params.passwd)
		person.passwd = pass
		person.enabled = true
		//		person.emailShow = true
		//	person.description = ''
		if (person.save()) {
			role.addToPeople(person)
			//if (config.security.useMail) {
			String emailContent1 ="""Hi ${person.username},
						
Thank you for registering with Arrk Group. 
As a registered user, you can download the white paper 
and case studies posted on our website.
										 
UserName: ${person.username}

Regards
Arrk Group
						
Contact us - http://www.arrkgroup.com/contactUs

Note: This is a system-generated e-mail, please don't reply to this message as it is not being monitored.			
"""
			mailService.sendMail {
				to person.email
				from 'donotreply@arrkgroup.com'
				subject 'Email content for Arrk Website Registration'
				body emailContent1.toString()
			}

			String emailContent2 ="""Hi ${person.username},
						
Thank you for registering with Arrk Group. 
As a registered user, you can download the white paper 
and case studies posted on our website.
							 
Password: ${params.passwd}

Regards
Arrk Group
						
Contact us - http://www.arrkgroup.com/contactUs
	
Note: This is a system-generated e-mail, please don't reply to this message as it is not being monitored.					
"""
			mailService.sendMail {
				to person.email
				from 'donotreply@arrkgroup.com'
				subject 'Email content for Arrk Website Registration'
				body emailContent2.toString()
			}

			person.save(flush: true)

			def auth = new AuthToken(person.username, params.passwd)
			def authtoken = daoAuthenticationProvider.authenticate(auth)
			SCH.context.authentication = authtoken

			def returnToUrl=request.getParameter('returnToUrl')
			if(returnToUrl!="null")
			{
				redirect uri:returnToUrl ;

			}
			else
			{

				redirect uri:'/' ;

			}

			//	def returnToUrl = request.getParameter('returnToUrl').trim() ?: "/home"


		}
		else {
			person.passwd = passwdWithoutEncode
			render view: 'index', model: [person: person]
		}
	}
}
