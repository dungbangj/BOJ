import math

N, W, H = map(int, input().split(' '))

sqr_val = math.sqrt(W ** 2 + H ** 2)

for i in range(N):
	len = int(input())

	if len <= W or len <= H or len <= sqr_val:
		print("DA")
	else:
		print("NE")