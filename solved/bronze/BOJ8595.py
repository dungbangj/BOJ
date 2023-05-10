import re

length = len(input())
word = input()
sum = 0
numbers = re.findall(r'\d+', word)
for i in numbers:
	sum += int(i)
print(sum)
