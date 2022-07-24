package cl.desafiolatam.contactmanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.service.ContactService;
import cl.desafiolatam.contactmanager.service.impl.ContactServiceImpl;

@Controller
@RequestMapping(value="/contactManager", method=RequestMethod.GET)
public class ContactController {
	
	private ContactService contactService;
	
	public ContactController() {
		super();
		contactService = new ContactServiceImpl();
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getContactlist(ModelMap model) {
		model.addAttribute("contactList", contactService.getContactList());
		return "contactManager";
	}
	
	@RequestMapping(value="/addContact", method=RequestMethod.POST)
	public String addContact(ModelMap model, @ModelAttribute("contactForm")Contact contact) {
		return contactService.addContact(model, contact);
	}
	
	@RequestMapping(value="/deleteContact", method=RequestMethod.GET)
	public String deleteContact(ModelMap model, @RequestParam("id") int idToDelete) {
		return contactService.deleteContact(model, idToDelete);
	}
	
}
