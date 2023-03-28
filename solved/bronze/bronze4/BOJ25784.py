A, B, C = map(int, input().split(' '))

if A == B + C or B == A + C or C == B + A:
	print(1)
elif A == B * C or B == A * C or C == B * A:
	print(2)
else:
	print(3)