T = int(input())

for i in range(T):
	N = int(input())
	if N == 1:
		print("#")
	elif N == 2:
		print("##")
		print("##")
	else:
		for j in range(N):
			if j == 0 or j == N - 1:
				for k in range(N):
					print("#", end = "")
			else:
				print("#", end = "")
				for k in range(N - 2):
					print("J", end = "")
				print("#", end = "")
			print()
	print()
