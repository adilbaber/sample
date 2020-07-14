
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.splunk.logging.*;


public final class HttpEventCollector_Logback {


	public static void main(String a[]) throws InterruptedException {
		
		String loggerName = "SplunkLogger";

		Date date = new Date();
		String jsonMsg = String.format("{EventDate:%s, EventMsg:'This Test doesnt work'}",
				date.toString());
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.info(jsonMsg);
		
	}

	
}
