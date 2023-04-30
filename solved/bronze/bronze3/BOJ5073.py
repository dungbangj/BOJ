while True:
	A, B, C = map(int,input().split(' '))
	if A == 0 and B == 0 and C == 0:
		break
	max_num = max(A, max(B, C))
	sum = A + B + C
	if A == B and B == C:
		print("Equilateral")
	elif max_num >= sum - max_num:
		print("Invalid")
	elif A == B or B == C or A == C:
		print("Isosceles")
	else:
		print("Scalene")
	