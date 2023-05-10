BC = input()

countB = 0
countC = 0

for i in range(len(BC)):
	if BC[i] == "B":
		countB += 1
	elif BC[i] == "C":
		countC += 1

print(countB // 2 + countC //2)