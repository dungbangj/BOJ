m = int(input())
n = int(input())

if n == 1 and m == 1:
	print(1)
elif n == 1:
	print(m)
elif m == 1:
	print(n)
else:
	print((m + n - 2) * 2)

