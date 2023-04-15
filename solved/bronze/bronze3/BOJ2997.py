a = list(map(int, input().split(' ')))

a.sort()

two = a[2] - a[1]
one = a[1] - a[0]

if one == two:
	if a[2] + two <= 100:
		print(a[2] + two)
	else:
		print(a[0] - two)
else:
	if one > two:
		print(a[0] + two)
	else:
		print(a[2] - one)