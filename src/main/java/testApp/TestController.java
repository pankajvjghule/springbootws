package testApp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/getCodes", method=RequestMethod.POST,consumes="application/json", produces="application/json")
	public String getMedicalCode(@RequestBody PersonRequest personRequest)
	{
		//DB call code logic to pull the medicalcode
		System.out.println("Am in /getCodes ");
		return "121";
	}
	
}
