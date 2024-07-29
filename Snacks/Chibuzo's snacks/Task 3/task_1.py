def largest_element_finder(number):
	
	largest = 0
	for numbers in number:
		if numbers > largest:
			largest = numbers

	return largest

numbers = largest_element_finder([2,5,4,3,1,7,3,9])

print(numbers)



def reverse_array(numbers):
	counter = 0
	for rev in numbers:
		reverse_list = list(reversed(numbers))
	return reverse_list

number_list = reverse_array([2,3,4,5,6,7,8,9])
print(f"Original list: {reverse_array}")
print(f"Reveresed list: {number_list}")



def odd_position_element(numbers):
	odd = ""
	for counter in numbers:
		if counter % 2 != 0:
			odd+= counter
	return counter

result = odd_position_element([2,3,4,5,6,7,8,9])
print(f"The odd elements are {counter}")

