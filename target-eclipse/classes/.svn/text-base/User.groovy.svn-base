



/**
 * User domain class.
 */
class User {
	static transients = ['pass']
	static hasMany = [authorities: Role]
	static belongsTo = Role
		
	String username
	String passwd
	boolean enabled
	String email
	String organisation
	String jobtitle
	String phone
	String interest
	

	/** plain password to create a MD5 password */
	String pass = '[secret]'

	static constraints = {
		username(blank: false, unique: true)
		
		passwd(blank: false)
		enabled()
	}
}
