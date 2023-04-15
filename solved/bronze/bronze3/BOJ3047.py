arr = list(map(int, input().split(' ')))
order = input()

arr = sorted(arr, reverse = True)
C = arr[0]
B = arr[1]
A = arr[2]

for i in order:
	if i == 'A':
		print(A, end = ' ')
	elif i == 'B':
		print(B, end = ' ')
	else:
		print(C, end = ' ')
print()