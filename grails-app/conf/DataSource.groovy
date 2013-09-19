dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username = "root"
	password = "admin@123"
}
//	hibernate {
//		cache.use_second_level_cache = true
//		cache.use_query_cache = true
//		cache.provider_class ='com.opensymphony.oscache.hibernate.OSCacheProvider'
//	}

hibernate {
	
		 cache.use_second_level_cache = true
	
		 cache.use_query_cache = true
	
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
	
	}
	

	
// environment specific settings
environments {
	development {
		dataSource {
		// one of 'create', 'create-drop','update'
		dbCreate = "update"
		// NOTE: the JDBC connection string should be
		// all on the same line.
		url = "jdbc:mysql://localhost:3306/arrk_website?autoreconnect=true"
		username = "root"
		password = "admin@123"
		}
	}
	test {
		dataSource {
		dbCreate = "update"
		url = "jdbc:mysql://localhost:3306/arrk_website?autoreconnect=true"
		}
	}
	production {
		dataSource {
		dbCreate = "update"
		url = "jdbc:mysql://localhost:3306/arrk_website?autoreconnect=true"
		username = "root"
		password = "admin@123"
		}
	}
}