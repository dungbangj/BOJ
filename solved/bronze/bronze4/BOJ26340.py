n = int(input())

for i in range(n):
	one = input()
	print("Data set: " + one)
	A, B, C = map(int, one.split(' '))
	for j in range(C):
		tmpA = A
		tmpB = B
		if A >= B:
			A //= 2
			if tmpA == A:
				A = 0
		elif A < B:
			B //= 2
			if tmpB == B:
				B = 0
	print("{} {}".format(max(A, B), min(A, B)))
	print()