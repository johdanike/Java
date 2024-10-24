print("WELCOME TO JOHDAN'S CREDIT CARD VALIDITY CHECKER")
card_number = input("Hello kindly enter your credit card details to verify: ")

if(len(card_number) < 13 or len(card_number) > 16):
	print("Invalid - Check number and try again")
else:
	category = ""
	#card_number= int(card_number)
	for index in card_number:
		if(index[0] == '4'):
			category = "Visa Card"
		elif(index[0] == '5'):
			category =  " MasterCard"
		elif(index[0] == '3' and index[1] == '7'):
			category =  "American Express Card"
		elif(index[0] == '6'):
			category =  "Discover cards"
		else:
			category =  "Invalid card type"
	for first_digit_right_to_left in range(len(card_number)):
		


