L = int(input())
R = int(input())

sum = 0
i = 1
while True:
	result = L  / 100 * R
	if int(result) <= 5:
		break
	L = int(result)
	sum += L * pow(2, i)
	i += 1
print(sum)