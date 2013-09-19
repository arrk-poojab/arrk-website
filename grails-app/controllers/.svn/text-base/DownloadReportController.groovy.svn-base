import java.util.Map;

import org.springframework.util.StringUtils

class DownloadReportController {

	
	def index = {
		redirect action: list, params: params
	}

	def list = {
		if (!params.max) {
			params.max = 10
		}
		[downloadReportList: DownloadReport.list(params)]
	}
		/*def create = {
			[download: new DownloadReport(params)]
		} */
	
		/**
		 * Save action, called when a new Requestmap is created.
		 */
	def save = {
		
		def downloadReport = new DownloadReport(params)
		//[downloadReport: downloadReport]
	
		downloadReport.username = params.username;
		downloadReport.downloadables= params.downloadables;
		def date = new Date()
		def timestamp = date.toTimestamp()
		downloadReport.timestamp = timestamp.toString();
	
		if (downloadReport.save()) {	
			
		}
		else {
			//render view: 'auth', model: [downloadReport: downloadReport]
		} 
	}
}
