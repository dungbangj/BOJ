A, B, C = map(int, input().split(' '))

one = A * B
two = A + B * C

if one < two:
	print(1)
elif one > two:
	print(2)
else:
	print(0)