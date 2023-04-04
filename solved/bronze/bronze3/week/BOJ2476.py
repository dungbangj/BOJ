N = int(input())

peo = []
for i in range(N):
	sum = 0
	arr = list(map(int, input().split(' ')))
	if arr[0] == arr[1] and arr[1] == arr[2]:
		sum += 10000 + arr[0] * 1000
	elif arr[0] == arr[1] or arr[1] == arr[2]:
		sum += 1000 + arr[1] * 100
	elif arr[0] == arr[2]:
		sum += 1000 + arr[0] * 100
	else:
		max_arr = max(arr)
		sum += max_arr * 100
	peo.append(sum)

print(max(peo))