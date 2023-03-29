student, money = map(int, input().split(' '))

sum = 0
score = []

for i in range(0, student):
	tmp = int(input())
	score.append(tmp)
	sum += tmp

money = money // sum

for i in range(0, student):
	print(score[i] * money)