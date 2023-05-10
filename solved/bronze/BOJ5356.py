T = int(input())

for i in range(T):
	N, alpha = input().split(' ')
	N = int(N)
	for j in range(1, N + 1):
		for k in range(j):
			print(alpha, end = "")
		if alpha == 'Z':
			alpha = 'A'
		else:
			alpha = chr(ord(alpha) + 1)
		print()
	print()
