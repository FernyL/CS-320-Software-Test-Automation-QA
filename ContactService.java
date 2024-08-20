/*
 * Fernando Lomeli
 */

package main;
import java.util.ArrayList;

public class ContactService {
	public static ArrayList<Contact> list = new ArrayList<Contact>();
	
	//contactID has to be unique
	public boolean addContact(Contact contact) {
		boolean didAdd = false;
		
		//when the list is empty
		if (list.size() == 0) {
			list.add(contact);
			didAdd = true;
		}
		else {
			for(Contact c : list) {
				if (contact.getContactID().equalsIgnoreCase(c.getContactID())) {
					return didAdd;
				}
			}
			list.add(contact);
			didAdd = true;
		}
		return didAdd;
	}
	
	public void deleteContact(String contactID) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getContactID().equals(contactID)) {
				list.remove(i);
				break;
			}
			if (i == list.size() - 1) {
				System.out.println("ContactID does not exist for deletion");
			}
		}
	}
	
	public void editFirstName(String contactID, String updatedFirstName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getContactID().equals(contactID)) {
				list.get(i).setFirstName(updatedFirstName);
				break;
			}
			else {
				System.out.println("ContactID does not match.");
			}
		}
	}
	
	public void editLastName(String contactID, String updatedLastName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getContactID().equals(contactID)) {
				list.get(i).setLastName(updatedLastName);
				break;
			}
			else {
				System.out.println("ContactID does not match.");
			}
		}
	}
	
	public void editPhoneNumber(String contactID, String updatedNumber) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getContactID().equals(contactID)) {
				list.get(i).setPhoneNumber(updatedNumber);
				break;
			}
			else {
				System.out.println("ContactID does not match.");
			}
		}
	}
	
	public void editAddress(String contactID, String updatedAddress) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getContactID().equals(contactID)) {
				list.get(i).setAddress(updatedAddress);
				break;
			}
			else {
				System.out.println("ContactID does not match.");
			}
		}
	}
	

}