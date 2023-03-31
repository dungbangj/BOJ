a, b = map(int, input().split(' '))

def divs(ab):
	if ab % 4 == 0:
		ab = ab // 4
	else:
		ab = ab // 4 + 1
	return ab

def mods(ab):
	if ab % 4 == 0:
		return (4)
	return (ab % 4)

x = abs(divs(b) - divs(a))
y = abs(mods(b) - mods(a))

print(x + y)