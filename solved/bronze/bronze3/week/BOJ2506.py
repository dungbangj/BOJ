N = int(input())
arr = list(map(int, input().split(' ')))
for i in range(1, N):
	if arr[i] != 0:
		arr[i] = arr[i - 1] + 1

print(sum(arr))