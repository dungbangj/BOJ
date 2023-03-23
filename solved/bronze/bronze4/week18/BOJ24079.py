X = int(input())
Y = int(input())
Z = int(input())

if X * 60 + Y * 60 <= Z * 60 + 30:
	print(1)
else:
	print(0)