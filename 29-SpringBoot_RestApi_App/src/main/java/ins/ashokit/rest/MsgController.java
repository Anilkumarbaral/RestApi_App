package ins.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/")
	public String welcomeMsg() {
		return "Hi Anil welcome to your dream work";
	}

}
