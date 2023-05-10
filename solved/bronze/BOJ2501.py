import math

A, B = map(int, input().split(' '))

divs = []

for i in range(1, int(math.sqrt(A)) + 1):
	if A % i == 0:
		divs.append(i)
		if i != A // i:
			divs.append(A // i)
divs.sort()
if B - 1 > len(divs) - 1:
	print(0)
else:
	print(divs[B - 1])