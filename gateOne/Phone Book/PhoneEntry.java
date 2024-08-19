import java.util.ArrayList;

public class PhoneEntry{
	public ArrayList<Contact>phoneEntry = new ArrayList<>();

	public String addEntry(String firstName, String lastName, String phoneNumber){
		Contact newEntry = new Contact(firstName, lastName, phoneNumber);
		phoneEntry.add(newEntry);
		return "Contact successfully added";
	} 
	
	public Contact findByFirstName(String name){
		for(int index = 0; index < phoneEntry.size(); index++){
			if(phoneEntry.get(index).getFirstName().equalsIgnoreCase(name))
			return phoneEntry.get(index);
		}  
		return phoneEntry.get(0);
	}

	public Contact findByLastName(String name){
		for(int index = 0; index < phoneEntry.size(); index++){
			if(phoneEntry.get(index).getLastName().equalsIgnoreCase(name))
			return phoneEntry.get(index);
		}  
		return phoneEntry.get(0);
	}
	
	public ArrayList<Contact> displayAll(){
			return phoneEntry;
	}


	public Contact validateContact(String phoneNumber){
		Contact response = null;
		for(int index = 0; index < phoneEntry.size(); index++){
			if(phoneEntry.get(index).getPhoneNumber().equals(phoneNumber)){
				response = phoneEntry.get(index);
			}	
			else response = null;		
		}
		return response;
	}

	public boolean removeContact(String phoneNumber){
		for(int index = 0; index < phoneEntry.size(); index++){
			if(phoneEntry.get(index).getPhoneNumber().equals(phoneNumber)){
				phoneEntry.remove(index);
				return true;					
			}
		}
			return false;
	}












}
