
products_bought = []
number_of_units = []
price_per_unit = []
price_total = []



def get_products_bought(product_name):
	products = input("What did the user buy? ")
	products_bought.append(products)
	return products_bought

def num_for_unit(unit_price):
	units = input("How many pieces?")
	number_of_units.append(units)
	return number_of_units

def price_for_unit(unit_price):
	units = input("How many pieces?")
	price_per_unit.append(units)
	return number_of_units

def sentinel_value(flag):
	flag = input("Add another item?")
	return flag

def tot_price(unit, price):
	for index in range(len(products_bought)):
		price_total.append(num_for_unit(index) * price_for_unit(index) )
	return price_total

def discount



def func(numbers):
	function_list = []
	for index in range(21):
		if index % 2 == 0:
			function_list.append(index)
	return 	function_list

result = func(21)
print(result)


	