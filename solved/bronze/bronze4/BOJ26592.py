n = int(input())

for i in range(n):
	A, B = map(float, input().split(' '))
	h = format(2 * A / B, ".2f")
	print("The height of the triangle is {} units".format(h))