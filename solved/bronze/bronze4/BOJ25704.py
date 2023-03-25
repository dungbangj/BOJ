stamps = int(input())
money = int(input())
A = B = C = D = 0
arr = []
if stamps >= 20:
	A = money // 4 * 3
	arr.append(A)
if stamps >= 15:
	B = money - 2000
	arr.append(B)
if stamps >= 10:
	C = money // 10 * 9
	arr.append(C)
if stamps >= 5:
	D = money - 500
	arr.append(D)

mins = 0
if len(arr) > 0:
	mins = min(arr)
	if mins < 0:
		mins = 0
	print(mins)
else:
	print(money)
