i = 1

while True:
	line = input().split(' ')
	if line[1] == '0':
		break
	dia = float(line[0])
	turn = float(line[1])
	time = float(line[2])

	if dia != 0:
		dia = 1 / (5280 * 12) * dia
	one_turn = dia * 3.1415927
	distance = turn * one_turn
	if time == 0:
		velocity = 0
	else:
		velocity = distance / time * 3600
	print("Trip #{}: {:.2f} {:.2f}".format(i, distance, velocity))
	i += 1
