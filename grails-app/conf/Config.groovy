
// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }
import org.apache.log4j.*
grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination
grails.mime.file.extensions = true // enables the parsing of file extensions from URLs into the request format
grails.mime.use.accept.header = false
grails.mime.types = [
	all:           '*/*',
	atom:          'application/atom+xml',
	css:           'text/css',
	csv:           'text/csv',
	form:          'application/x-www-form-urlencoded',
	html:          ['text/html','application/xhtml+xml'],
	js:            'text/javascript',
	json:          ['application/json', 'text/json'],
	multipartForm: 'multipart/form-data',
	rss:           'application/rss+xml',
	text:          'text/plain',
	xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// What URL patterns should be processed by the resources plugin
grails.resources.adhoc.patterns = ['/images/*', '/css/*', '/js/*', '/plugins/*']

grails.plugins.springsecurity.useSessionFixationPrevention = true

// The default codec used to encode data with ${}
grails.views.default.codec = "none" // none, html, base64
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
// enable Sitemesh preprocessing of GSP pages
grails.views.gsp.sitemesh.preprocess = true
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

staticcontent.titles.fileName = "titles"

staticcontent.downloads.fileName = "downloads"

enquiryList = ['Career Enquiry','General Enquiry','Sales Enquiry']
countryList= ['India','UK']
levelOfInterestList= ['Current Requirement','Requirement In Future','Just For Interest']

environments {
	development {
	    grails.logging.jul.usebridge = true
		staticcontent.filesystem.path = 'c:/fileSystem'
		//staticcontent.filesystem.path ='C:/alfresco-community-file-transfer-receiver-4.0.d/ftr-root'
		
	}
	production {
		grails.logging.jul.usebridge = false
		grails.gsp.enable.reload=true
		session.webservice.host = '10.0.1.107'
		session.webservice.port = '7070'
		session.fulfil.naming.provider.port = '7071'
		session.webservice.path = '/axis2/services/session'
		session.rest.api.path = '/api/rest'
		session.identity.path = '/service/identity_indiv'
		session.fakeLicenceId='lic310158'
		session.clockss.identity.id = '2_CLOCKSS'
		session.login.server = 'https://10.0.1.107'
		session.webservice.url = 'http://${webservice.host}:${webservice.port}${webservice.path}'
		staticcontent.filesystem.path ='/cms_data/alfresco-community-file-transfer-receiver-4.0.e/ftr-root/filesystem'
		// TODO: grails.serverURL = "http://www.arrkgroup.com"
	}
	preview {
	    grails.logging.jul.usebridge = false
		grails.gsp.enable.reload=true
		session.webservice.host = '10.0.1.107'
		session.webservice.port = '7072'
		session.fulfil.naming.provider.port = '7073'
		session.webservice.path = '/axis2/services/session'
		session.rest.api.path = '/api/rest'
		session.identity.path = '/service/identity_indiv'
		session.fakeLicenceId='lic310158'
		session.clockss.identity.id = '2_CLOCKSS'
		session.login.server = 'https://10.0.1.107'
		session.webservice.url = 'http://${webservice.host}:${webservice.port}${webservice.path}'
		staticcontent.filesystem.path ='/cms_data/alfresco-community-file-transfer-receiver-4.0.e/ftr-root/repository'
		// TODO: grails.serverURL = "http://www.arrkgroup.com"
	}
}


// log4j configuration


def logDirectory = System.properties.getProperty("catalina.home")+ "/logs"


// log4j configuration
log4j = {
	// Example of changing the log pattern for the default console
	// appender:
	//
	appenders {
		appender new DailyRollingFileAppender(
				name: "Arrk-website",
				datePattern: "'.'yyyy-MM-dd",
				fileName: "${logDirectory}/Arrk-website.log",
							
				)
	}

	root {
		//error "Arrk-website"
		//error "Arrk-website":"org.codehaus.groovy.grails.commons"
		error "Arrk-website":"StackTrace"
		additivity = true
	}

	error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
		   'org.codehaus.groovy.grails.web.pages', //  GSP
		   'org.codehaus.groovy.grails.web.sitemesh', //  layouts
		   'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
		   'org.codehaus.groovy.grails.web.mapping', // URL mapping
		   'org.codehaus.groovy.grails.commons', // core / classloading
		   'org.codehaus.groovy.grails.plugins', // plugins
		   'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
		   'org.springframework',
		   'org.hibernate',
		   'net.sf.ehcache.hibernate'

	warn   'org.codehaus.groovy.grails',
	       'org.mortbay.log'
}

grails {
	mail {
		to = "smita.gavhane@arrkgroup.com"
		host = "192.168.2.16"
		port = 25
		props = ["mail.smtp.auth":"False","mail.smtp.socketFactory.fallback":"false"]
	}
}
grails.mail.default.from="pooja.bawa@arrkgroup.com"

log4j.logger.org.springframework.security='off,stdout'

twitter {
	disableTwitter4jController = false  // To avoid intruders to use controller alltogether.
	'default' {
	  OAuthConsumerKey       = 'c3EH0waBCycZ7rbzttYXw'
	  OAuthConsumerSecret    = 'nLdBhBHdaBexyl4WwTKVUbbCkqR9ZJUVUIIEl0rf8'
	  OAuthAccessToken       = '719603797-NE350jCD3CT9dOQIw4EvAIlYr8HjlUof9P3v4ZIS'
	  OAuthAccessTokenSecret = 'mhwoLVaxcLs6yYHyp7GYcYmCUTDS3wUWGjLKBeAONjU'
	}
  }

//log4j.logger.org.springframework.security='off,stdout'

grails.views.enable.jsessionid=false


twitter {
	disableTwitter4jController = false  // To avoid intruders to use controller alltogether.
	'default' {
	  OAuthConsumerKey       = 'c3EH0waBCycZ7rbzttYXw'
	  OAuthConsumerSecret    = 'nLdBhBHdaBexyl4WwTKVUbbCkqR9ZJUVUIIEl0rf8'
	  OAuthAccessToken       = '719603797-NE350jCD3CT9dOQIw4EvAIlYr8HjlUof9P3v4ZIS'
	  OAuthAccessTokenSecret = 'mhwoLVaxcLs6yYHyp7GYcYmCUTDS3wUWGjLKBeAONjU'
	}
  }