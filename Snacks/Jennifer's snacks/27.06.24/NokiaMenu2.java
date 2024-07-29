import java.util.Scanner;

public class NokiaMenu{

	public static void main(){
	Scanner input = new Scanner(System.in);

	System.out.println("YOUR NOKIA MENU MAP");
	String menu = """
			    1: PHONEBOOK
			    2: MESSAGES 
			    3: CHAT
			    4: CALL REGISTER
			    5: TONES
			    6: SETTINGS
			    7: CALL DIVERT
			    8: GAMES
			    9: cALCULATOR
			    10: REMINDERS
			    11: CLOCK
			    12: PROFILES
			    13: SIM SERVICES
					""";
	System.out.println(menu);

	String phonebook = """
			    1: Search
			    2: Search Nos.  
			    3: Add Name
			    4: Erase
			    5: Edit
			    6: Assign Name
			    7: Send b'card
			    8: Options**
			    9: Speed Dials
			    10: Voice Tags
					""";	

	String options = """
			   1: Type of View
			   2: Memory Status
					""";

	String message = """
			    1: Write Messages
			    2: Inbox
			    3: Outbox
			    4: Picture Messages
			    5: Templates
			    6: Smileys
			    7: Message Settings**
			    8: Info Service
			    9: Voice Mailbox Number
			    10: Service Command Editor
					""";	

	String write = """
			   1: Input Message
					""";
	String inbox = """
			   INBOX
						""";
	String recievedMessages = """
			    1: Obi is a boy
			    2: John-Daniel is a Software Engineer
			    3: Cohort 21 is the best set in SemiColon Africa
			    4: I can do all things
			    5: Nothing is impossible
			    			""";

	String messageSetting = """
			   1: Set 1
			   2: Common
					""";

	String set1 = """
			   1: Message Centre Number
			   2: Message Sent As
			   3: Message Validity
					""";

	String common = """
			   1: Delivery Reports
			   2: Reply Via Same Centre
			   3: Character Support
					""";

	String chat = """
			    1: Facebook
			    2: weChat  
			    3: MyChat
			    4: 2go
			    5: Instagram
			    6: SnapChat
			    7: X
					""";	

	String callregister = """
			    1: Missed Calls
			    2: Recieved Calls  
			    3: Dialled Numbers
			    4: Erase Recent Call Lists
			    5: Show Call Duration**
			    6: Show Call Costs**
			    7: Call Cost Settings**
			    8: Prepaid Credit
					""";	

	String tones = """
			    1: Ringing Tone
			    2: Ringing Volume
			    3: Incoming Call Alert
			    4: Composer
			    5: Message Alert Tone
			    6: Keypad Tones
			    7: Warning And Game Tones
			    8: Vibrating Alert
			    9: Screen Saver
					""";

	String settings = """
			    1: Call Settings**
			    2: Phone Settings  
			    3: Security Settings
			    4: Restore Factory Settings
					""";	

	String callSettings = """
			    1: Automatic Redial
			    2: Speed Dialling
			    3: Call Waiting Options
			    4: Own Number Sending
			    5: Phone Line In Use
			    6: Automatic Answer
					""";	

	String phoneSettings = """
			    1: Language
			    2: Cell Info Display
			    3: Welcome Note
			    4: Network Selection
			    5: Lights
			    6: Confirm SIM Service Actions
					""";		

	String securitySettings = """
			    1: PIN Code Request
			    2: Call Barring Service
			    3: Fixed Dialling
			    4: Closed User Group
			    5: Phone Security
			    6: Change Access Codes
					""";	
	
	String clock = """
			    1: Alarm Clock
			    2: Clock Settings  
			    3: Date Setting
			    4: Stopwatch
			    5: Countdown Timer
			    6: Auto Update of Date and Time
					""";		    

 

	System.out.print("Enter number: ");
	String value = input.next();

	String flag = "NO";
	System.out.print("Enter NO to return to previous page or YES to continue!");
	String userInput = input.nextLine();

	while(!("NO".equalsIgnoreCase(userInput))){

	switch(value){
		
		case "1": System.out.print("PHONE BOOK");
			System.out.println(phonebook);

			System.out.print("Enter number: ");
			String phonebookValue = input.next();	
		
			switch(phonebookValue){
				case "1": System.out.print("\nSearch"); main();
				case "2": System.out.print("\nService Nos. 1"); main();
				case "3": System.out.print("\nAdd Name"); main();
				case "4": System.out.print("\nErase"); main();
				case "5": System.out.print("\nEdit"); main();
				case "6": System.out.print("\nAssign Tone"); main();
				case "7": System.out.print("\nSend b'card"); main();
				case "8": System.out.print("\nOptions");
					System.out.println(options);

					System.out.print("Enter number: ");
					String optionValue = input.next();

					switch(optionValue){
						case "1": System.out.print("Type of View"); main();
						case "2": System.out.print("Memory Status"); main();
					}
				case "9": System.out.print("Speed Dials"); main();
				case "10": System.out.print("Voice Tags"); main();
			}
			main();

		case "2": System.out.println("MESSAGES");
			System.out.println(message);

			System.out.print("Enter number: ");
			String messagevalue = input.next();
				

			switch(messagevalue){
				case "1": System.out.println("Write Messages");

					System.out.println(write);

					System.out.print("Enter number: ");
					String writeValue = input.next();

					switch(writeValue){
						case "1": System.out.println("Type your message...");
					}
						main();
				case "2": System.out.print(inbox);
					System.out.println(recievedMessages);
					main();

				case "3": System.out.print("\nOutbox"); main();
				case "4": System.out.print("\nPicture Messages"); main();
				case "5": System.out.print("\nTemplates"); main();
				case "6": System.out.print("\nSmileys"); main();
				case "7": System.out.print("\nMessage Settings");
 
					System.out.println(messageSetting);

					System.out.print("Enter number: ");
					String messageSettingvalue = input.next();
				
					switch(messageSettingvalue){
						case "1": System.out.print("Set 1");
							System.out.println(set1);

							System.out.print("Enter number: ");
							String set1Value = input.next();

							switch(set1Value){
								case "1": System.out.print("\nMessage Centre Number"); main();
								case "2": System.out.print("\nMessage Sent As"); main();
								case "3": System.out.print("\nMessage Validity"); main();
					
							} 
						case "2": System.out.print("Common");
							System.out.println(common);

							System.out.print("Enter number: ");
							String commonValue = input.next();

							switch(commonValue){
								case "1": System.out.print("\nDelivery Reports"); break;
								case "2": System.out.print("\nReply Via Same Centre"); break;
								case "3": System.out.print("\nCharacter Support"); break;


							}
					} main();

				case "8": System.out.print("Options");
					System.out.println(options);

					System.out.print("Enter number: ");
					String optionsValue = input.next();

					switch(optionsValue){
						case "1": System.out.print("\nType of View"); break;
						case "2": System.out.print("\nMemory Status");break;
					} main();

					
				case "9": System.out.print("Speed Dials"); main();
				case "10": System.out.print("Voice Tags"); main();

			}
			main();

		case "3": System.out.println("CHAT");
				System.out.println(chat);

				System.out.print("Enter number: ");
					String chatValue = input.next();

					switch(chatValue){
						case "1": System.out.print("\nFaceBook"); break;
						case "2": System.out.print("\nweChat");break;
						case "3": System.out.print("\nMyChat"); break;
						case "4": System.out.print("\n2go");break;
						case "5": System.out.print("\nInstagram"); break;
						case "6": System.out.print("\nSnapChat");break;
						case "7": System.out.print("\nX");break;

					} main();
		case "4": System.out.print("CALL REGISTER");
				System.out.println(callregister);
			
				System.out.print("Enter number: ");
				String chatRegisterValue = input.next();

				switch(chatRegisterValue){
					case "1": System.out.print("\nMissed Calls"); break;
					case "2": System.out.print("\nRecieved Calls");break;
					case "3": System.out.print("\nDialled Numbers"); break;
					case "4": System.out.print("\nErase Recent Call Lists");break;
					case "5": System.out.println("\nShow Call Duration"); 

						System.out.print("Enter number: ");
						String callDurationValue = input.next();

						switch(callDurationValue){
							case "1": System.out.print("\nLast Call Duration"); break;
							case "2": System.out.print("\nAll Call's Duration");break;
							case "3": System.out.print("\nRecieved Call's Duration"); break;
							case "4": System.out.print("\nDialled Call's Duration");break;
							case "5": System.out.print("\nClear Timers"); break;
						}main();
					case "6": System.out.println("\nShow Call Costs");

						System.out.print("Enter number: ");
						String callCostValue = input.next();

						switch(callCostValue){
							case "1": System.out.print("\nLast Call Cost"); break;
							case "2": System.out.print("\nAll Calls' Cost");break;
							case "3": System.out.print("\nClear Counter");break;
						}main();
					case "7": System.out.println("\nCall Cost Settings");

						System.out.print("Enter number: ");
						String callCostSettingValue = input.next();

						switch(callCostSettingValue){
							case "1": System.out.print("\nCall Cost Limit"); break;
							case "2": System.out.print("\nShow Costs In");break;
						}main();
					case "8": System.out.print("\nPrepaid Credit");break;
				}main();
		case "5": System.out.println("TONES");
				System.out.println(tones);

				System.out.print("Enter number: ");
				String tonesValue = input.next();

				switch(tonesValue){
					case "1": System.out.print("\nRinging Tone"); break;
					case "2": System.out.print("\nRinging Volume");break;
					case "3": System.out.print("\nIncoming Call Alert"); break;
					case "4": System.out.print("\nComposer");break;
					case "5": System.out.println("\nMessage Alert Tone"); 
					case "6": System.out.print("\nKeypad Tones");break;
					case "7": System.out.print("\nWarning and Game Tone"); break;
					case "8": System.out.print("\nVibrating Alert");break;
					case "9": System.out.println("\nScreen Saver"); 
				}main();
		case "6": System.out.print("SETTINGS");
				System.out.println(settings);

				System.out.print("Enter number: ");
				String settingsValue = input.next();

				switch(settingsValue){
					case "1": System.out.println("\nCall Settings"); 

						System.out.println(callSettings);

						System.out.print("Enter number: ");
						String callSettingsValue = input.next();

						switch(callSettingsValue){
							case "1": System.out.print("\nAutonatic Redial"); break;
							case "2": System.out.print("\nSpeed Dialling");break;
							case "3": System.out.print("\nCall Waiting Options"); break;
							case "4": System.out.print("\nOwn Number Sending ");break;
							case "5": System.out.println("\nPhone Line In Use"); 
							case "6": System.out.print("\nAutomatic Answer");break;
						}main();

					case "2": System.out.println("\nPhone Settings");

						System.out.println(phoneSettings);

						System.out.print("Enter number: ");
						String phoneSettingsValue = input.next();

						switch(phoneSettingsValue){
							case "1": System.out.print("\nLanguage"); break;
							case "2": System.out.print("\nCell Info Display");break;
							case "3": System.out.print("\nNetwork Selection");break;
							case "4": System.out.print("\nWelcome Note"); break;
							case "5": System.out.print("\nLights ");break;
							case "6": System.out.println("\nConfirm SIM Service Actions"); 
						}main();

					case "3": System.out.println("Security Settings"); 

						System.out.println(securitySettings);

						System.out.print("Enter number: ");
						String securitySettingsValue = input.next();

						switch(securitySettingsValue){
							case "1": System.out.print("\nPIN Code Request"); break;
							case "2": System.out.print("\nCall Barring Service");break;
							case "3": System.out.print("\nFixed Dialling");break;
							case "4": System.out.print("\nClosed User Group"); break;
							case "5": System.out.print("\nPhone Security");break;
							case "6": System.out.println("\nChange Access Codes"); 
						}break;
					case "4": System.out.print("\nRestore Factory Settings");break;
				}main();
		case "7": System.out.print("CALL DIVERT");

			System.out.println("Call Divert");
			main();

		case "8": System.out.print("GAMES");

			System.out.println("Games");
			main();

		case "9": System.out.print("CALCULATOR");
			
			System.out.println("Calculator");
			main();

		case "10": System.out.print("REMINDERS");

			System.out.println("Reminders");
			main();

		case "11": System.out.print("CLOCK");
			System.out.println(clock);

			System.out.print("Enter number: ");
			String clockValue = input.next();

			switch(clockValue){
				case "1": System.out.print("\nAlarm Clock"); break;
				case "2": System.out.print("\nClock Settings");break;
				case "3": System.out.print("\nDate Setting");break;
				case "4": System.out.print("\nStopwatch"); break;
				case "5": System.out.print("\nCountdown Timer");break;								
				case "6": System.out.println("\nAuto Update Of Date & Time"); 
			}main();

		case "12": System.out.print("PROFILES");

			System.out.println("Profiles");
			main();

		case "13": System.out.print("SIM SERVICES");

			System.out.println("SIM Services");
			main();


		default: System.out.print("Invalid");
		}	
			System.out.print("\nDo you want to continue, enter NO or YES to continue!");
			userInput = input.next();

	}	


	public static void main(String[]args){
		
		main();
	
	}


	}
}