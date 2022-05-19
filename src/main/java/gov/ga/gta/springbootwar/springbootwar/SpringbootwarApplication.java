package gov.ga.gta.springbootwar.springbootwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringbootwarApplication {

	private static Logger log = LoggerFactory.getLogger(SpringbootwarApplication.class);

	public static void main(String[] args) {
		try {
			log.debug("Starting application springbootwar");
			SpringApplication.run(SpringbootwarApplication.class, args);
		} catch (Exception e) {
			log.error("Exception occurred starting application", e);
		}
	}

}
