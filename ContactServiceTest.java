/*
 * Fernando Lomeli
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import main.Contact;
import main.ContactService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer; 
import org.junit.jupiter.api.Order; 
import org.junit.jupiter.api.TestMethodOrder; 
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) 


class ContactServiceTest {

	@Test
	@Order(2)
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "Ferny", "Lomeli", "3234567890", "3737 Plum St.");
        assertEquals(true, contactService.addContact(contact));
        Contact contact1 = new Contact("2", "Ferny", "Lomeli", "3234567890", "3737 Plum St.");
        assertEquals(true, contactService.addContact(contact1));
        Contact contact2 = new Contact("2", "Ferny", "Lomeli", "3234567890", "3737 Plum St.");
        assertEquals(false, contactService.addContact(contact2));
    }
	
	@Test
	@Order(1)
	public void testDeleteContact() {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("3", "Ferny", "Lomeli", "3234567890", "3737 Plum St.");
        contactService.addContact(contact);
        contactService.deleteContact("4");
        contactService.deleteContact("3");
        assertEquals(0, contactService.list.size());
	}
	
	@Test
	@Order(3)
	void testEditFirstName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("5", "Ferny", "Lomeli", "3234567890", "3737 Apple St.");
		contactService.addContact(contact);
		contactService.editFirstName("5", "Fernando");
		assertEquals("Fernando", contact.getFirstName());
	}
	
	@Test
	@Order(4)
	void testEditLastName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("6", "Ferny", "Lomeli", "3234567890", "3737 Berry St.");
		contactService.addContact(contact);
		contactService.editLastName("6", "Lopez");
		assertEquals("Lopez", contact.getLastName());
	}
	
	@Test
	@Order(5)
	void testEditPhoneNumber() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("7", "Freddy", "Lomeli", "3234567890", "3737 Grape St.");
		contactService.addContact(contact);
		contactService.editPhoneNumber("7", "9998887777");
		assertEquals("9998887777", contact.getPhoneNumber());
	}
	
	@Test
	@Order(6)
	void testEditAddress() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("8", "Ferny", "Lomeli", "3234567890", "3737 Pear St.");
		contactService.addContact(contact);
		contactService.editAddress("8", "3737 Orange St.");
		assertEquals("3737 Orange St.", contact.getAddress());
	}
	

}