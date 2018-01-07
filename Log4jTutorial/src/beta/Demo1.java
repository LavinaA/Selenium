package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	private static Logger log =LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
	//	It is similar to sysout .Its jus tthat it can be categorised as different types of errors.
		log.debug("I have clicked on button");
		log.info( "button is displayed");
		log.error("button is not displayed");
		log.fatal("Button is missing");

	}

}
