from datetime import datetime, timedelta
age = int(input("How old are you?"))
if(age < 12):
	print("You are specifically underage to be seeing your period!")
elif(age > 52):
	print("You are most likely undergoing menopause, see a Doctor for more investigation")
else:
	next_period = input("Enter the first day of your last period in this format (dd-M-yyyy): \n ")
	MENSTRUAL_CYCLE_LENGTH_AVERAGE = 28
	OVULATION_DAY_AVERAGE = 14
	date_started = datetime.strptime(next_menses, my_date_format)
	
	cycle_length = timedelta(menstrual_cycle_length)
	next_menstrual_date = date_started + cycle_length
	print(f"Your next menstrual cycle is on: {next_menstrual}")

	safe_range = 7
	safe_time_frame = timedelta(safe_period)
	safe_range = next_menstrual_date - safe_time_frame
	print(f"Your safe period is: {safe_period}")

	flow_period_length = int(input("How long is your flow period:\n "))
	period_length = timedelta(flow_period_length)
	flow_period = next_menstrual_date + period_length
	print(f"Your next menstrual cycle would end on: {flow_period} ")

	ovulation_period = int(input("How many days is your ovulation period:\n "))
	ovulation = timedelta(ovulation_period)
	average_ovulation = timedelta(OVULATION_DAY_AVERAGE)
	estimated_ovulation = ovulation + average_ovulation
	ovulation_period = next_menstrual_date - estimated_ovulation
	print(f"Your next ovulation should be around: {ovulation_period}" )