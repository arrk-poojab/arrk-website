package arrk.website.filesystem
import org.apache.commons.logging.LogFactory
class HomeTagLib {
	
	def defaultFilesService
	
	private static final log = LogFactory.getLog(this)
	
	static namespace = "fts"
		
	/**
	 * Renders contents from the file
	 */
	def display = { attrs, body ->
	  if (attrs.filePath) {
		  try {
			  out << defaultFilesService.getContent(attrs.filePath)			 
		  } catch (FilesException filesExc) {
			  handleErrors(filesExc)
		  }
	  }
	}
	
	
	def title = { attrs, body ->
		if (attrs.filePath) {
			try {
				def localizedTitle = message(code:attrs.messageKey, default:attrs.messageKey)
				String title = defaultFilesService.fetchTitle(attrs.filePath, localizedTitle)
				out << title
			} catch (FilesException filesExc) {
				handleErrors(filesExc)
			}
		}
	}
	

	def copyright = {attrs, body->
		out <<  " " + Calendar.getInstance().get(Calendar.YEAR);
	}
	 
	 /**
	  * Logs the errors and also localizes the error messages
	  * @param errorCode
	  * @return
	  */
	 def handleErrors(FilesException filesExc) {
		 def error = filesExc.error
		 String errorKey = error.errorKey
		 String defaultMessage = error.message
		 log.error(message(code:errorKey, default:defaultMessage), filesExc)
		 throw new FilesException(message(code:errorKey, default:defaultMessage))
	 }
}
