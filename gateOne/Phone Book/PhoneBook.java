import java.util.Scanner;

public class PhoneBook{
	public static void main(String[]args){
		System.out.println("Welcome to JohDan's PhoneBook");
		display();	
	}
	
	public static void display(){
		Scanner johdan = new Scanner(System.in);
		PhoneEntry call = new PhoneEntry();

		
		
		String choices = """
		1. Add Contact
		2. View All Contact
		3. Remove Contact
		4. Find Contact By Phone Number
		5. Find Contact By First Name
		6. Find Contact By Last Name
		7. Edit Contact
		""";
		
		System.out.println(choices);
		System.out.println("Select one option: ");
		String option = johdan.next();

		switch(option){
			case "1":
				System.out.println("Enter first name, last name and Phone number: ");
				String firstName = johdan.next();
				String lastName = johdan.next();
				String phoneNumber = johdan.next();

				call.addEntry(firstName, lastName, phoneNumber);
				display();	

			case "2":
				System.out.println("Contacts");
				System.out.println(call.displayAll());
				display();	

			case "3":
				System.out.println("Enter phone number: ");
				String upForDeletion = johdan.next();
				Contact foundNumber = call.validateContact(upForDeletion);
				System.out.println("Phone number "+foundNumber.getPhoneNumber()+" found.");

				System.out.println("Do you still want to delect this contact?");
				String answer = johdan.next();
				if(answer.equalsIgnoreCase("yes")){
					call.removeContact(upForDeletion);
					System.out.println("Contact "+ foundNumber.getPhoneNumber()+" "+"removed...");
				}
				display();
	
			case "4":
				System.out.println("Enter Phone Number: ");
				String num = johdan.next();
				display();	
		}
	}

}