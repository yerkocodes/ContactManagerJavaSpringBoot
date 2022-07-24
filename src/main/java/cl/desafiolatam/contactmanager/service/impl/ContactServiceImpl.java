package cl.desafiolatam.contactmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.service.ContactService;

@Service("contactService")
public class ContactServiceImpl implements ContactService {
	
	private List<Contact> listContact;
	
	//Constructor
	public ContactServiceImpl() {
		super();
		listContact = new ArrayList<Contact>();
	}

	@Override
	public List<Contact> getContactList() {
		return listContact;
	}

	@Override
	public String addContact(ModelMap model, Contact contact) {
		
		contact.setId(listContact.size() + 1);

		if (contact.getId() > 0) {
			listContact.add(contact);
		}

		return "redirect:/contactManager/home";
	}

	@Override
	public String deleteContact(ModelMap model, int idToDelete) {
		
		List<Contact> listContactTemp = listContact;
		
		if (listContactTemp.size() != 1) {
			for (Contact contactTemp : listContactTemp) {
				if (contactTemp.getId() == idToDelete) {
					listContact.remove(contactTemp);
				}
			}
		} else {
			listContact.remove(0);
		}
		
		return "redirect:/contactManager/home";
	}

}
