T = int(input())

for i in range(T):
	input()
	N = int(input())
	sum = 0
	for j in range(N):
		sum += int(input())
	if sum % N == 0:
		print("YES")
	else:
		print("NO")