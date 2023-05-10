sum = 0

for i in range(65, 91):
	sum += i

word = input()

for i in range(0, len(word)):
	sum -= ord(word[i])

print(chr(sum))