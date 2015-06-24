package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Service;

/**
 * Created by glennrenfro on 6/23/15.
 */

@Service
public class HelloMetric {

	private final CounterService counterService;
	
	@Autowired
	public HelloMetric (CounterService counterService) {
		this.counterService = counterService;
	}

	public void countMe() {
		this.counterService.increment("services.system.hellometric.invoked");
	}
}
