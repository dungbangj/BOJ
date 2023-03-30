N = int(input())

arr = list(map(int, input().split(' ')))

sum = 0
for i in arr:
	if i <= N:
		sum += i
	else:
		sum += N

print(sum)