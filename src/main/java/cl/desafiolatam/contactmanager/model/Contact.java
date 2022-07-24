package cl.desafiolatam.contactmanager.model;

import org.springframework.stereotype.Component;

@Component("contact")
public class Contact {

	private int id;
	private String name;
	private String lastName;
	private String motherLastName;
	private String address;
	private String phoneNumber;
	
	public Contact() {}

	public Contact(int id, String name, String lastName, String motherLastName, String address, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.motherLastName = motherLastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", lastName=" + lastName + ", motherLastName=" + motherLastName
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
