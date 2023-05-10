T = int(input())

for i in range(T):
	n = int(input())
	sum = 0
	for j in range(n):
		food, A, B = input().split(' ')
		sum += float(A) * float(B)
	formatted_sum = format(sum, ".2f")
	print("${}".format(formatted_sum))