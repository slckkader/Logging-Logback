package logback;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.*;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.util.StatusPrinter;
import chapters.configuration.Foo;

public class logback {

	final static Logger logger2 = LoggerFactory.getLogger(logback.class);

	public static void main(String[] args) throws IOException, InterruptedException {

		logger2.info("Entering application.");

		doIt();
		logger2.info("Exiting application.");

	}

	static void doIt() {
		logger2.debug("Debug");
	}

}
