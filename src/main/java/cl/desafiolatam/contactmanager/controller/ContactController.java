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

@Controller
@RequestMapping(value="/contactManager", method=RequestMethod.GET)
public class ContactController {
	
	private List<Contact> contactList;
	private int idToContact = 0;
	
	public ContactController() {
		contactList = new ArrayList<>();
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getContactlist(ModelMap model) {
		model.put("contactList", contactList);
		return "contactManager";
	}
	
	@RequestMapping(value="/addContact", method=RequestMethod.POST)
	public String addContact(ModelMap model, @ModelAttribute("contactForm")Contact contact) {

		contact.setId(idToContact);
		contactList.add(contact);
		idToContact++;
//		model.put("contactList", contactList);

//		return "contactManager";
		return "redirect:/contactManager/home";
	}
	
	@RequestMapping(value="/deleteContact", method=RequestMethod.GET)
	public String deleteContact(ModelMap model, @RequestParam("id") int idToDelete) {
		List<Contact> contactListTemp = contactList;
		
		for (Contact contactTemp : contactListTemp) {
			if(contactTemp.getId() == idToDelete) {
				contactList.remove(contactTemp);
			}
		}
//		model.put("contactList", contactList);
//		return "contactManager";
		return "redirect:/contactManager/home";
	}
	
}
