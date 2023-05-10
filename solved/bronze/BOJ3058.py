T = int(input())

for i in range(T):
	arr = list(map(int, input().split(' ')))
	arr.sort()
	sum = 0
	for j in arr:
		if j % 2 == 0:
			sum += j
	print(sum, end = " ")
	for j in arr:
		if j % 2 == 0:
			print(j)
			break