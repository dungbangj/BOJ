one = input()
two = input()
three = input()
four = input()
five = input()

one_arr = []
two_arr = []
three_arr = []
four_arr = []
five_arr = []

i = 0

for i in range(len(one)):
	string = one[i] + two[i] + three[i] + four[i] + five[i]
	if string == '.omln':
		one_arr.append('o')
		two_arr.append('w')
		three_arr.append('l')
		four_arr.append('n')
		five_arr.append('.')
	elif string == 'owln.':
		one_arr.append('.')
		two_arr.append('o')
		three_arr.append('m')
		four_arr.append('l')
		five_arr.append('n')
	elif string == '..oLn':
		one_arr.append('.')
		two_arr.append('.')
		three_arr.append('o')
		four_arr.append('L')
		five_arr.append('n')


def print_arr(arr):
	for i in range(len(arr)):
		print(arr[i], end = '')
	print()
print_arr(one_arr)
print_arr(two_arr)
print_arr(three_arr)
print_arr(four_arr)
print_arr(five_arr)