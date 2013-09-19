package arrk.website.filesystem

import arrk.website.filesystem.FilesException
/**
 * This is a service to fetch contents from the file system
 * It exposes APIs to fetch contents from filesystem
 */
public interface FilesService {
	
	def getContent(filePath) throws FilesException
	def getRandomChildFilesContent(folderPath, numberOfFiles) throws FilesException
	def getRandomChildFilesContent(folderPath, numberOfFiles, filesToExclude) throws FilesException
	def fetchTitle(String filePath) throws FilesException
	def fetchTitle(String filePath, String messageKey) throws FilesException
	def getFile(filePath,panelPath) throws FilesException
		
}

