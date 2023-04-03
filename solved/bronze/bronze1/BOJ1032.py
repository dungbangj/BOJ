n = int(input())
arr = []
for i in range(n):
	arr.append(input())

for i in range(len(arr[0])):
	tmp_arr = arr[0][i]
	for j in arr:
		if j[i] != tmp_arr:
			for k in range(len(arr)):
				arr[k] = arr[k][:i] + "?" + arr[k][i + 1:]


print(arr[0])

