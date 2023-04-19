import math

while True:
	B, N = map(int, input().split(' '))
	if B == 0 and N == 0:
		break
	res = int(B ** (1 / N))
	
	a = abs(B - res ** N)
	b = abs(B - (res + 1) ** N)
	
	if a > b:
		print(res + 1)
	else:
		print(res)
	
	
