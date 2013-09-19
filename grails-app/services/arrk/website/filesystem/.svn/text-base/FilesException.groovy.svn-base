package arrk.website.filesystem

import arrk.website.filesystem.Error
import org.codehaus.groovy.grails.web.errors.GrailsWrappedRuntimeException

class FilesException extends Exception {

	Error error
	//Error errorMsg= Error.error;
	def message
	def errorMsg
	def errorKey
	
	FilesException(Error error) {
		 
		println(error);
		this.error=error;
		 errorMsg= error.message;
		 errorKey=error.errorKey;

	}
	

		
	FilesException(String message) {
		super(message)
	}

	    	
}
