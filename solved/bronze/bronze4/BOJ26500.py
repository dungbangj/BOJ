T = int(input())

for i in range(T):
	A, B = map(float, input().split(' '))
	print(round(abs(A - B), 1))