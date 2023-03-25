N = int(input())

print("int a;")
print("int *ptr = &a;")

for i in range(2, N + 1):
	num = str(i - 1)
	if i == 2:
		num = ''
	print("int " + str(i * '*') + "ptr" + str(i) + " = &ptr" + num + ";")