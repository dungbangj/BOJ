max = -1

sum = 0
for i in range(10):
	o, i = map(int, input().split(' '))
	sum -= o
	sum += i
	if max <= sum:
		max = sum

print(max)