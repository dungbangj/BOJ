n = input()

sum = len(n)

for i in n:
	if i == ":":
		sum += 1
	elif i == "_":
		sum += 5

print(sum)