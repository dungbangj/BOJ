sum = 0

for i in range(4):
	my_input = input()
	line = list(my_input.split(' '))
	if line[0] == "Es":
		sum += int(line[1]) * 21
	elif line[0] == "Stair":
		sum += int(line[1]) * 17
	
print(sum)