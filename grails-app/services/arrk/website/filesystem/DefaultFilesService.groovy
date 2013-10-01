package arrk.website.filesystem

import org.codehaus.groovy.grails.commons.ConfigurationHolder as CH
import java.util.ArrayList
import java.util.Arrays
import arrk.website.filesystem.FilesException
import arrk.website.filesystem.Error
import java.util.LinkedHashMap
import java.net.URLEncoder

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.LogFactory

/**
 * This is default implementation of FilesService
 * It exposes APIs to fetch contents from filesystem  
 *
 */
class DefaultFilesService implements FilesService {

	static transactional = false 
	
	
	
	/**
	* Would be used to access the contents of the file
	* @param nodeRef
	* @return
	*/
	def getContent(filePath) throws FilesException {
		String basePath = CH.config.staticcontent.filesystem.path
		def filename= filePath.split(';')
	
		if (!CH.config.staticcontent.filesystem.path) {
			throw new FilesException(Error.CONFIG_NOT_SPECIFIED)
		}
		if (!filename[0]) {
			throw new FilesException(Error.FILEPATH_NOT_SPECIFIED)
		}
		String completePath = basePath + filename[0]
		
		new File(completePath).text
		
	}
   
   def getFile(filePath,panelPath){
	   String basePath = CH.config.staticcontent.filesystem.path
	   def filename= filePath.split(';')

	   if (!CH.config.staticcontent.filesystem.path) {
		   throw new FilesException(Error.CONFIG_NOT_SPECIFIED)
	   }
	 
	   String completePath = basePath + filename[0]
	  
	   def input = new File(completePath)
	 
	   if(input.exists()){
		
		   input.text
	   }else{
	 
		   if (!panelPath) {
			   throw new FilesException(Error.FILEPATH_NOT_SPECIFIED)
		   }
		   
		   	String callToActionPanel = basePath + panelPath
			   new File(callToActionPanel).text 
		   }
    }
   
   
   def handleErrors(FilesException filesExc) {
	   def error = filesExc.error
	   String errorKey = error.errorKey
	   String defaultMessage = error.message
	   log.error(message(code:errorKey, default:defaultMessage), filesExc)
	   throw new FilesException(message(code:errorKey, default:defaultMessage))
   }
   
   
   def getPath(filePath) throws FilesException {
	   String basePath = CH.config.staticcontent.filesystem.path
	   if (!CH.config.staticcontent.filesystem.path) {
		   throw new FilesException(Error.CONFIG_NOT_SPECIFIED)
	   }
	   if (!filePath) {
		   throw new FilesException(Error.FILEPATH_NOT_SPECIFIED)
	   }
	   String completePath = basePath + filePath
	   
	   completePath
   }
   /**
    * Gets the specified number of random files content from the specified folder
    * @param folderPath
    * @param numberOfFiles
    * @return
    */
   def getRandomChildFilesContent(folderPath, numberOfFiles) throws FilesException {
	   getRandomChildFilesContent(folderPath, numberOfFiles, null)
   }
   
   /**
    * Gets the specified number of random files content from the specified folder
    * excluding the files specified as comma separated in filesToExclude attribute
    * @param folderPath
    * @param numberOfFiles
    * @param filesToExclude
    * @return
    */
   def getRandomChildFilesContent(folderPath, numberOfFiles, filesToExclude) throws FilesException {
	   def numberOfFilesValue
	   try {
		   numberOfFilesValue = Integer.parseInt(numberOfFiles)
	   } catch (NumberFormatException numberFormatExc) {
	   		throw new FilesException(Error.ILLEGALARGUMENT) 
	   }
	   if (!folderPath) {
		   throw new FilesException(Error.FILEPATH_NOT_SPECIFIED)
	   }
	   
	   ArrayList<String> filePathList = getFilesFromFolder(folderPath, filesToExclude, numberOfFilesValue)
	  
	   //shuffle to get random websites each time
	   Collections.shuffle(filePathList)

	   //create array of random files to be shown
	   String[] randomFilesArray = new String[numberOfFilesValue]
	   for (count in 0..(numberOfFilesValue-1)) {
		   String filePath = filePathList.get(count);
		   randomFilesArray[count] = filePath
	   }
	   randomFilesArray
   }

   
   /**
    * Create a list of files which don't have excluded files
    * @param folderPath
    * @param filesToExclude
    * @param numberOfFilesValue
    * @return
    */
   def getFilesFromFolder(folderPath, filesToExclude, numberOfFilesValue) throws FilesException {
	   String basePath = CH.config.staticcontent.filesystem.path
	   if (!CH.config.staticcontent.filesystem.path) {
		   throw new FilesException(Error.CONFIG_NOT_SPECIFIED)
	   }
	   String completePath = basePath + folderPath
	   def dir = new File(completePath)
	   //check if path is of a file throw exception.
	   if (dir.isFile()) { 
		  	throw new FilesException(Error.ILLEGALARGUMENT)
	   }
	   ArrayList<String> filePathsToBeShownList = new ArrayList<String>()

	   	   //initialized to handle cases where there are no files to exclude
	   List<String> filesToExcludeList = new ArrayList<String>()
	   
	   if (filesToExclude != null) {
		   filesToExcludeList = Arrays.asList(filesToExclude.split(","))
	   }   
	   dir.eachFile {
		   if (it.isFile()) {
			   if (!(it.name in filesToExcludeList)) {
				   //add relative path
				   String relativePath = folderPath + "/" + it.name 
				   filePathsToBeShownList.add(relativePath)
			   }
		   }
	   }
	   
	   if (filePathsToBeShownList.size()  < numberOfFilesValue) {
		   throw new FilesException(Error.INSUFFICIENT_FILES)
	   }
	  
	   filePathsToBeShownList
   }

   /**
   * Fetches title for the file specified
   *
   * @param filePath
   * @param localizedTitle
   * @return
   */
  def fetchTitle(String filePath) {
	  fetchTitle(filePath, null)
  }
  
   /**
    * Fetches title for the file specified
    * 
    * @param filePath
    * @param localizedTitle
    * @return
    */
   def fetchTitle(String filePath, String localizedTitle) {
	   String basePath = CH.config.staticcontent.filesystem.path
	   def filename= filePath.split(';')
	   println filename[0]
	   String titlesFileName = CH.config.staticcontent.titles.fileName
	   if (!CH.config.staticcontent.filesystem.path) {
		   throw new FilesException(Error.CONFIG_NOT_SPECIFIED)
	   }
	   if (!CH.config.staticcontent.titles.fileName) {
		   throw new FilesException(Error.CONFIG_NOT_SPECIFIED)
	   }
	   if (!filename[0]) {
		   throw new FilesException(Error.FILEPATH_NOT_SPECIFIED)
	   }
	   String completePath = basePath + filename[0]
	   def file = new File(completePath)
	   
	   int fileNameSeparator = completePath.lastIndexOf('/')
	   String fileName = completePath.substring(fileNameSeparator + 1)
	   String directoryPath = completePath.substring(0, fileNameSeparator)
	   def titleBreadcrumb
	   
	   /**
	    * If the path specified by the tag i.e. filePath is path of the directory which contains child
	    * files which form the complete page say for example home page, then we expect the titles file
	    * to be present in the same directory 
	    */
	   if (file.isDirectory()) {
		   	titleBreadcrumb = fetchTitleFromTitlesFile(completePath, titlesFileName, fileName)
	   } else {
	   		titleBreadcrumb = fetchTitleFromTitlesFile(directoryPath, titlesFileName, fileName)
	   }
		
		//if title/breadcrumb not defined in titles file fetch from localized breadcrumb
		if (!titleBreadcrumb) {
			if (localizedTitle) {
				titleBreadcrumb = localizedTitle
			} else {
				titleBreadcrumb = fileName
			}
		}
		titleBreadcrumb
   }
   
   def fetchTitleFromTitlesFile(String directoryPath, String titlesFileName, String key) {
	   
	   String titlesFilePath = directoryPath + '/' + titlesFileName
	   File titlesFile = new File(titlesFilePath)
	   def titleBreadcrumb
	   
	   /**
	    * This check is for conditions where titles file may not be present
	    * in the folder containing the alfresco file whose breadcrumb/title need to be displayed
	    */
	   if (titlesFile.exists()) {
		   if (!titlesFile.isFile()) {
			   throw new FilesException(Error.ILLEGALARGUMENT)
		   }
		
		   def lines = titlesFile.readLines()
		   for (line in lines) {
			   String[] keyValuePair = line.split('=')
			   if (key.equalsIgnoreCase(keyValuePair[0])) {
				   titleBreadcrumb = keyValuePair[1]
				   break
			   }
		   }
	   }
	   titleBreadcrumb
   }
}