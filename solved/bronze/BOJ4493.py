T = int(input())

for i in range(T):
	N = int(input())
	score_A = 0
	score_B = 0
	for j in range(N):
		A, B = input().split(' ')
		if A == B:
			continue
		if A == 'P':
			if B == 'R':
				score_A += 1
			else:
				score_B += 1
		elif A == 'R':
			if B == 'S':
				score_A += 1
			else:
				score_B += 1
		elif A == 'S':
			if B == 'P':
				score_A += 1
			else:
				score_B += 1
	if score_A > score_B:
		print("Player 1")
	elif score_A < score_B:
		print("Player 2")
	else:
		print("TIE")