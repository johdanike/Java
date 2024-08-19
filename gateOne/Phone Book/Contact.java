public class Contact{
	private String firstName;
	private String lastName;
	private String phoneNumber;


	public Contact(String phoneNumber, String firstName,String lastName){
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}	

	public void setLastName(){
		this.lastName = lastName;
	}

	public void setFirstName(){
		this.firstName = firstName;
	}


	public void setPhoneNumber(){
		this.phoneNumber = phoneNumber;
	}

		
	public String toString(){
		return String.format("""
	Name: %4s,%4s  Phone Number: %4s
	""", firstName,lastName, phoneNumber);
	}



}