arr = []

for i in range(9):
	arr.append(list(map(int, input().split(' '))))

max_num = -1
x = -1
y = -1
for i in range(9):
	for j in range(len(arr[i])):
		if arr[i][j] > max_num:
			max_num = arr[i][j]
			x = i
			y = j

print(max_num)
print(x + 1, y + 1)
