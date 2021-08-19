package reporting_tool;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void console() throws IOException
	{
		Layout layout=new PatternLayout("%d %c %m %n");
		Appender appender=new FileAppender(layout, "./Reports/r2.log");
		BasicConfigurator.configure(appender);
		Logger log=Logger.getLogger(this.getClass().getName());
		log.warn("warn");
		log.error("error");
		log.info("info");
	}

}
