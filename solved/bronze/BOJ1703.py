while True:
	n = input()
	if n == '0':
		break
	arr = list(map(int, n.split(' ')))
	sum = 1
	for i in range(1, arr[0] * 2 + 1):
		if i % 2 == 1:
			sum *= arr[i]
		else:
			sum -= arr[i]
	print(sum)
