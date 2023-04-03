N, M = map(int, input().split(' '))
length = N * 2

arr = []
answer = []
for i in range(length):
	arr.append(input())

for i in range(N):
	new_arr = ''
	for j in range(len(arr[i])):
		new_arr += arr[i][j]
		new_arr += arr[i][j]
	answer.append(new_arr)
index = 0
flag = 0
for i in range(N, N * 2):
	if arr[i] != answer[index]:
		flag = 1
	index += 1

if flag == 1:
	print("Not Eyfa")
else:
	print("Eyfa")