T = int(input())

def over_ten(arr):
	count = 0
	for i in arr:
		if int(i) >= 10:
			count += 1
	return count

for i in range(T):
	arr = []
	arr = input().split(' ')
	count = over_ten(arr)
	if count == 3:
		print("{} {} {}".format(arr[0], arr[1], arr[2]))
		print("triple-double\n")
	elif count == 2:
		print("{} {} {}".format(arr[0], arr[1], arr[2]))
		print("double-double\n")
	elif count == 1:
		print("{} {} {}".format(arr[0], arr[1], arr[2]))
		print("double\n")
	else:
		print("{} {} {}".format(arr[0], arr[1], arr[2]))
		print("zilch\n")


