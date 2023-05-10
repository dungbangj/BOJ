N = int(input())

tmp_N = N
for i in range(N):
	for j in range(0, i):
		print(' ', end = '')
	for j in range((tmp_N - i) * 2 - 1):
		print("*", end = '')
	print()