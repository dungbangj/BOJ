n = int(input())
geo = input()

As = 0
Cs = 0
Gs = 0
Ts = 0

for i in geo:
	if i == "A":
		As += 1
	elif i == "C":
		Cs += 1
	elif i == "G":
		Gs += 1
	elif i == "T":
		Ts += 1

print(As * Cs * Gs * Ts % 1000000007)