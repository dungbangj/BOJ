N, M, K = map(int, input().split(' '))

while K != 0:
	if M * 2 >= N:
		K -= 1
		M -= 1
	else:
		K -= 1
		N -= 1

print(int(min(N / 2, M)))