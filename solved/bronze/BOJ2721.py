arr = []
arr.append(1)
for i in range(1, 301):
	arr.append(arr[i - 1] + 1)


T = []
T.append(1)
for i in range(1, 301):
	T.append(T[i - 1] + arr[i])


N = int(input())

def W_func(n):
	sum = 0
	for k in range(1, n + 1):
		sum += k * T[k]
	return sum

for i in range(N):
	num = int(input())
	print(W_func(num))

