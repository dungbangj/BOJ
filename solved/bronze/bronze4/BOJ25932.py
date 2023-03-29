n = int(input())

for i in range(n):
	count = 0
	who = ""
	arr = input().split(' ')
	for j in arr:
		print("{} ".format(j), end = '')
		if int(j) == 18:
			count += 1
			who = "mack"
		elif int(j) == 17:
			count += 1
			who = "zack"
	print()
	if count == 2:
		print("both")
	elif count == 0:
		print("none")
	elif count == 1:
		print(who)
	print()
		