T = int(input())

score_A = 0
score_B = 0

for i in range(T):
	A, B = map(int, input().split(' '))
	if A > B:
		score_A += 1
	elif A < B:
		score_B += 1

print(score_A, score_B)