package dev.java.pj.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping 
public class StatusController {
	
	@GetMapping("/boasVIndas")
	public String boasVindas() {
		
		return "Essas é minha primeira menssagem";
	}
	
	

}
