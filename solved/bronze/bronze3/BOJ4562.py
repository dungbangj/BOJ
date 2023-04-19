n = int(input())

for i in range(n):
	A, B = map(int, input().split(' '))
	if A < B:
		print("NO BRAINS")
	else:
		print("MMM BRAINS")