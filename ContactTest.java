/*
 * Fernando Lomeli
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.Contact;
import main.Task;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("1", "Ferny", "Lomeli", "1234567890", "3737 Plum St.");
		assertTrue(contact.getContactID().equals("1"));
		assertTrue(contact.getFirstName().equals("Ferny"));
		assertTrue(contact.getLastName().equals("Lomeli"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("3737 Plum St."));
	}
	
	@Test
	void testContactClassContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678912", "Ferny", "Lomeli", "3234827437", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Ferny", "Lomeli", "3234827437", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Fernandoando", "Lomeli", "3234827437", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Lomeli", "3234827437", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Fernando", "LomeliLomeli", "3234827437", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Ferny", null, "3234827437", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Ferny", "Lomeli", "32348274377", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Ferny", "Lomeli", "323482743", 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Ferny", "Lomeli", null, 
				"3737 Plum St.");
		});
	}
	
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Fernando", "Lomeli", "3234827437", 
				"3737 Plum St. 56789012345678901");
		});
	}
	
	@Test
	void testContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Ferny", "Lomeli", "3233233232", 
				null);
		});
	}
	
	@Test
	void testSetFirstName() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		newContact.setFirstName("Fernando");
		assertTrue(newContact.getFirstName().equals("Fernando"));
	}
	
	@Test
	void testSetFirstNameNull() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setFirstName(null);
		});
	}
	
	@Test
	void testSetFirstNameTooLong() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setFirstName("Ferny's task name is way too long");
		});
	}
	
	@Test
	void testSetLastName() {
		Contact newContact = new Contact("1", "Ferny", "Lome", "3234827437", "3737 Plum St.");
		newContact.setLastName("Lomeli");
		assertTrue(newContact.getLastName().equals("Lomeli"));
	}
	
	@Test
	void testSetLastNameNull() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setLastName(null);
		});
	}
	
	@Test
	void testSetLastNameTooLong() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setLastName("Ferny's last name is way too long");
		});
	}
	
	@Test
	void testSetPhoneNumber() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		newContact.setPhoneNumber("1234567890");
		assertTrue(newContact.getPhoneNumber().equals("1234567890"));
	}
	
	@Test
	void testSetPhoneNumberNull() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setPhoneNumber(null);
		});
	}
	
	@Test
	void testSetPhoneNumberTooLong() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setPhoneNumber("123456789012");
		});
	}
	
	@Test
	void testSetAddress() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		newContact.setAddress("1234 Fern St.");
		assertTrue(newContact.getAddress().equals("1234 Fern St."));
	}
	
	@Test
	void testSetAddressNull() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setAddress(null);
		});
	}
	
	@Test
	void testSetAddressTooLong() {
		Contact newContact = new Contact("1", "Ferny", "Lomeli", "3234827437", "3737 Plum St.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		newContact.setAddress("Ferny's address is way too long, it should not be over 30 characters");
		});
	}

}
