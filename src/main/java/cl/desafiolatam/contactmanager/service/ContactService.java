package cl.desafiolatam.contactmanager.service;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import cl.desafiolatam.contactmanager.model.Contact;

public interface ContactService {

	public List<Contact> getContactList();
	
	public String addContact(ModelMap model, @ModelAttribute("contactForm") Contact contact);
	
	public String deleteContact(ModelMap model, @RequestParam("id") int intToDelete);
	
}
