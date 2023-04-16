while True:
	res = 0
	A, B, C = map(int, input().split(' '))
	if A == 0 and B == 0 and C == 0:
		break
	if C - B == B - A:
		res = C + B - A
		print(f"AP {res}")
	else:
		res = C * (B // A)
		print(f"GP {res}")
	