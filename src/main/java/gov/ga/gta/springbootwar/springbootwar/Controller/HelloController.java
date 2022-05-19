package gov.ga.gta.springbootwar.springbootwar.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HelloController {
   
    private Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping ({"/", "/hello"})
	public String hello () {
        log.debug("Entered method hello");
        return "hello";
    }
}
