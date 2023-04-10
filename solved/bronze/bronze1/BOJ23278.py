N, L, H = map(int, input().split(' '))

arr = list(map(float, input().split(' ')))

arr.sort()
for i in range(L):
	arr[i] = 0

for i in range(len(arr) - 1, len(arr) - H - 1, -1):
	arr[i] = 0

print(sum(arr) / (N - (L + H)))

