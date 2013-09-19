package arrk.website
import groovy.io.*;
import java.io.*;
import groovy.io.*;
import groovy.sql.Sql;
import java.sql.*;
import org.codehaus.groovy.grails.commons.ConfigurationHolder as CH
import java.util.ArrayList
import java.util.Arrays

class DownloadController {

	static defaultAction = 'downloadFile'
	
	def DefaultFilesService
	
//	def index = {
//		redirect(action:'downloadFile')
//	}
			
	def downloadFile ={
		def fileDoc = new File('/filesystem/Arrk-website/downloadables/Arrkitect_Charter.pdf');
	
		if(fileDoc.exists()){
			// force download
			def fileName = fileDoc.getName();
			response.setContentType("application/pdf")
			response.setHeader "Content-disposition", "attachment; filename=${fileName}";
			response.outputStream << fileDoc.newInputStream();
			response.outputStream.flush();
			return true;
		}
	}
	
	def downloadCSV ={
		def fileDoc = new File('/FLSTR/GAB.csv');
		if(fileDoc.exists()){
			// force download
			def fileName = fileDoc.getName();
			response.setContentType("application/csv")
			response.setHeader "Content-disposition", "attachment; filename=${fileName}";
			response.outputStream << fileDoc.newInputStream();
			response.outputStream.flush();
			return true;
		}
	}
	
	
	def download ={
		def filename = params.filename;
		def filePath = params.filePath;		
		String completePath
	
		println(completePath)
		completePath = defaultFilesService.getPath(filePath)
		if (completePath!=null) {				
				def linkDir = "${completePath}/${filename}"
			
				def fileDoc = new File(linkDir);
		
				if(fileDoc.exists()){
					// force download
					def fileName = fileDoc.getName();
					response.setContentType("application/octet-stream");
					response.setHeader "Content-disposition", "attachment; filename=${fileName}";
					response.outputStream << fileDoc.newInputStream();
					response.outputStream.flush();
					return true;
				}	
		}else {
								println('File Path not specified');
								return false;
		}	
	   }
	
	def exportDownloadReport={
		try
		{
			
		String basePath = CH.config.staticcontent.filesystem.path;			
		String filePath = '/Reports/User_Download_Report.csv';	 
	    String completePath = basePath + filePath;
		
		FileWriter fw = new FileWriter(completePath);
		fw.append("Sr.No");
		fw.append(',');
		fw.append("Username");
		fw.append(',');
		fw.append("Downloadables");
		fw.append(',');
		fw.append("Date");
		fw.append(',');
		fw.append("Time");
		fw.append('\n');

		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/arrk_website","root","admin@123","com.mysql.jdbc.Driver")
	
		sql.query "select * from download_report", { ResultSet rs ->
			while (rs.next()) {
				fw.append(rs.getString(1));
				fw.append(',');
				fw.append(rs.getString(5));
				fw.append(',');
				fw.append(rs.getString(3));
				fw.append(',');
				fw.append(rs.getString(4));
				fw.append(',');
				fw.append(rs.getString(4));
				fw.append('\n');
			}
		}
		
		fw.flush();
		fw.close();
				
		def fileDoc = new File(completePath);
		
		if(fileDoc.exists()){
			// force download
			def fileName = fileDoc.getName();
			response.setContentType("application/csv")
			response.setHeader "Content-disposition", "attachment; filename=${fileName}";
			response.outputStream << fileDoc.newInputStream();
			response.outputStream.flush();
			return true;
		}
		
		} catch (Exception e) {
		e.printStackTrace();
		}
		return true;
		}
	
	
	def exportUserInfoReport={
		try
		{
			String basePath = CH.config.staticcontent.filesystem.path;
			String filePath = '/Reports/User_Info_Report.csv';
			String completePath = basePath + filePath;
			
			FileWriter fw = new FileWriter(completePath);
			fw.append("Id.No");
			fw.append(',');
			fw.append("Login Name");
			fw.append(',');
			fw.append("Email-Id");
			fw.append(',');
			fw.append("Organisation");
			fw.append(',');
			fw.append("Job Title");
			fw.append(',');
			fw.append("Phone No");
			fw.append(',');
			fw.append("Interest");
			fw.append('\n');
			println('SQL before connection: ');
			def sql = Sql.newInstance("jdbc:mysql://localhost:3306/arrk_website","root","admin@123","com.mysql.jdbc.Driver")
			println('SQL connection: '+sql);
			sql.query "select * from user", { ResultSet rs ->
				while (rs.next()) {
					fw.append(rs.getString(1));
					fw.append(',');
					fw.append(rs.getString(10));
					fw.append(',');
					fw.append(rs.getString(3));
					fw.append(',');
					fw.append(rs.getString(7));
					fw.append(',');
					fw.append(rs.getString(6));
					fw.append(',');
					fw.append(rs.getString(9));
					fw.append(',');
					fw.append(rs.getString(5));
					fw.append('\n');
				}
			}
			
			fw.flush();
			fw.close();
					
			def fileDoc = new File(completePath);
			
			if(fileDoc.exists()){
				// force download
				def fileName = fileDoc.getName();
				response.setContentType("application/csv")
				response.setHeader "Content-disposition", "attachment; filename=${fileName}";
				response.outputStream << fileDoc.newInputStream();
				response.outputStream.flush();
				return true;
			}
			
			} catch (Exception e) {
			e.printStackTrace();
			}
			return true;
			}
}