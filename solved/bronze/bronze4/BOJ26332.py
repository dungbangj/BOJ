T = int(input())

for i in range(T):
	one = input()
	A, B = map(int, one.split(' '))
	print(one)
	if A > 1:
		print(A * B - (A - 1) * 2)
	else:
		print(A * B)