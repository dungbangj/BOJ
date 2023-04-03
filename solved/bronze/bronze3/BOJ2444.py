N = int(input())

for i in range(N):
	for j in range(N - 1, i, -1):
		print(' ', end = '')
	for j in range((i + 1) * 2 - 1):
		print('*', end = '')
	print()

for i in range(N - 1):
	for j in range(i + 1):
		print(' ', end = '')
	for j in range((N - i) * 2 - 3):
		print('*', end = '')
	print()