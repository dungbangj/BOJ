import math

n = int(input())

for i in range(n):
	A1, P1 = map(float, input().split(' '))
	R2, P2 = map(float, input().split(' '))
	A2 = R2 * R2 * math.pi
	if A1 // P1 > A2 // P2:
		print("Slice of pizza")
	else:
		print("Whole pizza")