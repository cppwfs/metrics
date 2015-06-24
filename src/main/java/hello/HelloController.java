package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	HelloMetric metric;
	
    @RequestMapping("/")
    public String index() {
		metric.countMe();
        return "Greetings from Spring Boot!";
    }

}
