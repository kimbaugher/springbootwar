package gov.ga.gta.springbootwar.springbootwar;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class ServletInitializer extends SpringBootServletInitializer {

	private Logger log = LoggerFactory.getLogger(ServletInitializer.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.debug("Entered SpringApplicationBuilder for servlet initialization");
		return application.sources(SpringbootwarApplication.class);
	}

}
