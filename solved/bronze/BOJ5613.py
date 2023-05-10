arr = []

while True:
	x = input()
	arr.append(x)
	if x == '=':
		break
sum = 0
for i in range(1, len(arr), 2):
	if i != 1:
		if arr[i] == '+':
			sum += int(arr[i + 1])
		elif arr[i] == '-':
			sum -= int(arr[i + 1])
		elif arr[i] == '*':
			sum *= int(arr[i + 1])
		elif arr[i] == '/':
			sum = int(sum / int(arr[i + 1]))
	elif i == 1:
		if arr[i] == '+':
			sum = int(arr[i - 1]) + int(arr[i + 1])
		elif arr[i] == '-':
			sum = int(arr[i - 1]) - int(arr[i + 1])
		elif arr[i] == '*':
			sum = int(arr[i - 1]) * int(arr[i + 1])
		elif arr[i] == '/':
			sum = int(int(arr[i - 1]) / int(arr[i + 1]))

print(sum)