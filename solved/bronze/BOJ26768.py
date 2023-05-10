n = input()

for i in range(len(n)):
	if n[i] == 'a':
		print(4, end = '')
	elif n[i] == 'e':
		print(3, end = '')
	elif n[i] == 'i':
		print(1, end = '')
	elif n[i] == 'o':
		print(0, end = '')
	elif n[i] == 's':
		print(5, end = '')
	else:
		print(n[i], end = '')