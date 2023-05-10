n = int(input())

mods = ['h', 'a', 'b', 'c', 'd', 'e', 'f', 'g']

if n % 8 == 0:
	print("{}{}".format(mods[n % 8], n // 8))
else:
	print("{}{}".format(mods[n % 8], n // 8 + 1))
