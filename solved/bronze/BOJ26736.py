AB = input()

countA = 0
countB = 0

for i in range(len(AB)):
	if AB[i] == 'A':
		countA += 1
	elif AB[i] == 'B':
		countB += 1
	
print("{} : {}".format(countA, countB))