a, b = map(int, input().split(' '))
c, d = map(int, input().split(' '))

arr1 = [False] * 5001
arr2 = [False] * 5001


for i in range(b - a, 5001, b):
	arr1[i] = True

for i in range(d - c, 5001, d):
	arr2[i] = True

for i in range(0, 5001):
	if arr1[i] == True and arr2[i] == True:
		print(i)
		break
