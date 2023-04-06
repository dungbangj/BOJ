T = int(input())

for i in range(T):
	num, unit = input().split(' ')
	num = float(num)
	if unit == 'kg':
		num = num * 2.2046
		unit = 'lb'
	elif unit == 'lb':
		num = num * 0.4536
		unit = 'kg'
	elif unit == 'l':
		num = num * 0.2642
		unit = 'g'
	elif unit == 'g':
		num = num * 3.7854
		unit = 'l'
	print("{:.4f} {}".format(num, unit))