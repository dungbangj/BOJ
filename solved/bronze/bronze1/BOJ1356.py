n = input()

def muls(n):
	mul = 1
	for i in n:
		mul *= int(i)
	return mul

flag = 0
for i in range(len(n) - 1):
	a = (n[0 : i + 1])
	b = (n[i + 1 : ])
	if muls(a) == muls(b):
		flag = 1

if flag == 0:
	print("NO")
else:
	print("YES")

