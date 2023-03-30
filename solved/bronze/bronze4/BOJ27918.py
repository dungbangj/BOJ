n = int(input())

sumD = 0
sumP = 0

for i in range(n):
	score = input()
	if score == "D":
		sumD += 1
	else:
		sumP += 1
	if abs(sumD - sumP) == 2:
		break
print(f"{sumD}:{sumP}")
