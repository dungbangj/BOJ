n = input()

count = 0
counts = []

for i in n:
	if i == '0':
		count += 1
	else:
		counts.append(count)
		count = 0

print(sum(counts))