
import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.splunk.logging.*;


public final class HttpEventCollector_LogbackTest {

	@Test
	public void canSendEventUsingLogback() throws Exception {
		
		String loggerName = "com.splunk";

		Date date = new Date();
		String jsonMsg = String.format("{EventDate:%s, EventMsg:'this Test does not work'}",
				date.toString());
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.info(jsonMsg);

		Thread.sleep(5000);

	}

}
