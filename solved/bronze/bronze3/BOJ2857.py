
flag = 0
answer = []
for i in range(5):
	name = input()
	for j in range(len(name)):
		if j + 2 < len(name):
			if name[j] == 'F' and name[j + 1] == 'B' and name[j + 2] == 'I':
				answer.append(i + 1)
				flag = 1
				break

if flag == 0:
	print("HE GOT AWAY!")
else:
	for i in range(len(answer)):
		print(answer[i], end = "")
		if i != len(answer) - 1:
			print(" ", end = "")
	print()