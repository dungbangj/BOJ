word = input()

alpha = [0] * 26

for k in word:
	i = ord(k)
	if i >= 65 and i <= 90:
		alpha[i - 65] += 1
	elif i >= 97 and i <= 122:
		alpha[i - 97] += 1

max_num = max(alpha)
count = 0
idx = 0
for i in range(len(alpha)):
	if max_num == alpha[i]:
		idx = i
		count += 1
if count != 1:
	print("?")
elif count == 1:
	print(chr(idx + 65))