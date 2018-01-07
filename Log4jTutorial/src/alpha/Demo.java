package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	private static Logger log =LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
	//	It is similar to sysout .Its jus tthat it can be categorised as different types of errors.
		log.debug("object is present");
		log.info( "This is just info");
		log.error("this is error");
		log.fatal("This is fatal error");

	}

}
