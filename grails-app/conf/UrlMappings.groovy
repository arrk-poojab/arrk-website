class UrlMappings {

	static mappings = {
		"/"(view: 'home/home')
		"/home"(view: 'home/home')
		"/whoWeAre"(view:'/whoWeAre/whoWeAre')
		"/whoWeAre/details/*"(view:'/whoWeAre/whoWeAreSubchannel')

		"/howWeDoIt"(view:'/howWeDoIt/howWeDoItLayout')
		"/workWithUs/featuredCaseStudies"(view:'/workWithUs/featuredCaseStudies')
		"/workWithUs/workWithUs"(view:'/workWithUs/workWithUs')
		"/workWithUs/customerCharter"(view:'/workWithUs/workWithUs')
		"/workWithUs/details/*"(view:'/workWithUs/workWithUsSubchannel')
		"/workWithUs/customerTestimonials"(view:'/workWithUs/customerTestimonials')
		"/workForUs/workAndLifeAtArrk"(view:'/workForUs/workForUsSubchannel')
		"/workForUs/hotjobs"(view:'/workForUs/hotjobs')
		"/workForUs/postHotjobs/*"(view:'/workForUs/hotjobs')
		"/workForUs/workForUs"(view:'/workForUs/workForUs')
		
		"/download"(controller: "download", action: "download")
		"/whatWeDo/*"(view:'/whatWeDo/whatWeDoLayout')
        "/howWeDoIt"(view:'/howWeDoIt/howWeDoIt')
		"/login"(view:'/login')
		"/howWeDoIt/details/*"(view:'/howWeDoIt/howWeDoItSubchannel')
		"/whatWeDo/details/*"(view:'/whatWeDo/detailLayouts')
		"/awards/*"(view:'/awards/awards')
		"/siteMap"(view:'/siteMap')
		"/privacyPolicy"(view:'/rules')
		"/termsOfUse"(view:'/rules')
		"/accessibilityStatement"(view:'/rules')
		"/whatWeDo/expertise/*"(view:'/whatWeDo/whatWeDoLayout')
		"/machesterOfficeMap/"(view:'/machesterOfficeMap')
		"/mumbaiOfficeMap/"(view:'/mumbaiOfficeMap')
		"/legalLinks/*"(view:'/layouts/bodyLayout')
		"/photoGallery"(view:'/photoGallery')
		"/executiveTeam"(view:'/layouts/executiveTeamLayout')
		"/contactUs" (controller: "contactUs",action: "contactUs")
		"/contactUs/doSend"(controller: "contactUs", action: "doSend")
	    "/contactUs/mail"(view:'/contactUs/mail')
		
		//For Registration and Login
		
		  "/login" (controller: "login", action: "index")
		  "/logout/$action?"(controller: "logout")
		  "/$controller/$action?/$id?"{
		   constraints {
			// apply constraints here
		   }
		  }
		
		  "/admin" (controller: "user", action: "index")
		  "/userCreate"(controller: "user", action: "create")
		  "/createRole"(controller: "role", action: "create")
		  "/listRole"(controller: "role", action: "index")
		  "/createRequestmap"(controller: "requestmap", action: "create")
		  "/listRequestmap"(controller: "requestmap", action: "index")
		  "/listDownloadReport"(controller: "downloadReport", action: "index")
		  
		  
		  "/login/denied"(view:'/login/denied')
		  "/google"(view:'/googleSearch')
//		  "/user/delete"(controller: "user", action: "delete")
		  
		  "/createdownloadReport" (controller: "downloadReport",action: "save")
		
		"/google"(view:'/googleSearch')
	
		
		//Default error
		"500"(view:'/siteMap')
		"400"(view: '/siteMap')
		"403"(view: '/siteMap')
		"404"(view: '/siteMap')	
	}
}
