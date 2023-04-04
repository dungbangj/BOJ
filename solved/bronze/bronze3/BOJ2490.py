play = ["D", "C", "B", "A", "E"]

for i in range(3):
	arr = list(map(int, input().split(' ')))
	print(play[sum(arr)])