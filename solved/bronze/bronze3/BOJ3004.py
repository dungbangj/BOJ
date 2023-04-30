N = int(input())

count = 0
val = 2
plus = 2

for i in range(1, N):
	val += plus
	count += 1
	if count == 2:
		count = 0
		plus += 1

print(val)