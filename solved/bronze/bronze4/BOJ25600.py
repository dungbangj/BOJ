T = int(input())

max_score = 0
for i in range(T):
	a, d, g = map(int, input().split(' '))
	score = a * (d + g)
	if a == (d + g):
		score *= 2
	max_score = max(max_score, score)

print(max_score)