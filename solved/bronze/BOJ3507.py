n = int(input())

a = 0
count = 0
if n >= 199:
	print(count)
else:
	while a < 100:
		if a < 100 and n - a < 100:
			count += 1
		a += 1
	print(count)
