package cl.desafiolatam.contactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public String getContactlist(ModelMap model) {
		model.put("helloWorld", "Hello world from getContactList controller method");
		return "helloWorldTest";
	}

}
