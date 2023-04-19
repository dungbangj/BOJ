while True:
	count = 0
	A, B = map(int, input().split(' '))
	if A == 0 and B == 0:
		break
	sum = A + B
	big = max(A, B)
	str_sum = str(sum)
	str_big = str(big)
	arr_sum = [char for char in str_sum]
	arr_big = [char for char in str_big]
	for i in range(len(arr_big) - 1, -1, -1):
		int_sum = int(arr_sum[i])
		int_big = int(arr_big[i])
		if int_sum < int_big:
			count += 1
	print(count)

