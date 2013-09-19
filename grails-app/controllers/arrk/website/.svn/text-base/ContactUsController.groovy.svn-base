package arrk.website

import org.apache.commons.logging.LogFactory
import org.codehaus.groovy.grails.commons.ConfigurationHolder
import org.grails.mail.MailService;
import org.apache.commons.validator.GenericValidator


@SuppressWarnings("deprecation")
class ContactUsController {

	private static final log = LogFactory.getLog(this)
	// Declare properties
	def mailService


	
	// Send actions only accept POST requests
	static allowedMethods = [send:'POST', ajaxSend:'POST']
	

	def contactUs = {
		render(view: "contactUs")
	}

	
	/* Send mail */
   def doSend = {
		   
	   		def contactUsInstance = new ContactUs()
	 		contactUsInstance.properties = params

			    if (!contactUsInstance || contactUsInstance.hasErrors()) {
					   render(view:"contactUs",model:[contactUsInstance:contactUsInstance])
			    }
				
		   if (contactUsInstance.name == '') {
			   flash.message = 'Name cannot be blank.'
			   render view: 'contactUs', model: [contactUsInstance: contactUsInstance]
			   return
		   }
		   
//		   if (contactUsInstance.email == '') {
//			   flash.message = 'This is not a valid email address.'
//			   render view: 'contactUs', model: [contactUsInstance: contactUsInstance]
//			   return
//		   }
		   try{
			   def emailId=contactUsInstance.email
   
			   //assert GenericValidator.isEmail(emailAddresses)
				  if (!GenericValidator.isEmail(emailId)){
				   // call errors.rejectValue(), or return false, or return an error code
				   flash.message = 'Invalid Email.'
						    render view: 'contactUs', model: [contactUsInstance: contactUsInstance]
							return
				  }
			 
			}
		   catch (Exception e) {
			  log.error("stack trace", e)
			  flash.message = 'try error.'
					 render view: 'contactUs', model: [contactUsInstance: contactUsInstance]
					return
			}
		   
		   if ((contactUsInstance.message).trim() == '') {
			   flash.message = 'Message cannot be blank.'
			   render view: 'contactUs', model: [contactUsInstance: contactUsInstance]
			   return
		   }
		   
		    def toEmailAddress = ConfigurationHolder.config.grails.mail.to
			try {
					mailService.sendMail {
						to toEmailAddress
						from contactUsInstance.name + " <" + contactUsInstance.email + ">"
						subject contactUsInstance.enquiry
						body (view:"mail", model:["Message": contactUsInstance.message,"subject": contactUsInstance.enquiry,"from":contactUsInstance.name,"email": contactUsInstance.email])
					}
					println("Contact form message successfully sent")

				//flash.message = "${message(code: 'Message Sucessfuly Send')}"
				  render(view: "_message")

					
				} catch (Exception e) {
					log.error("Unable to send a contact form message - send mail has thrown an exception. " +

						"Please ensure your mail configuration declared in Config.groovy is up-to-date.", e)

					render(view: "contactUs")
				}
	}

		
}

		

