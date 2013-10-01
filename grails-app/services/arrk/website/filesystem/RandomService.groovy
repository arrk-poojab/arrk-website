package arrk.website.filesystem
import java.util.Random
import java.lang.StringBuilder
import org.apache.commons.lang.RandomStringUtils
class RandomService {

	
	def	generateRandomString(Integer length){
		println("randon string generation")	
		String charset = (('A'..'Z') + ('0'..'9')).join()
		String randomString = RandomStringUtils.random(length, charset.toCharArray())
		println(randomString)
		return randomString;
	  }
	
}
