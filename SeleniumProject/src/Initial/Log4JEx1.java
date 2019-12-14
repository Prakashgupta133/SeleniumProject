package Initial;

import org.testng.log4testng.Logger;
//import org.apache.log4j.Logger;


public class Log4JEx1 {
	static Logger log =Logger.getLogger(Log4JEx1.class);

	public static void main(String[] args) {
		log.debug("Hello this is debug message");
		log.info("Hello this is info message");
	}

}
