n = int(input())

for i in range(n):
	num = int(input())
	half = num // 2
	print(f"Pairs for {num}", end = ": ")
	for i in range(1, half + 1):
		A = i
		B = num - i
		if A != B:
			print(f"{A} {B}", end = "")
			if i != half and A + 1 != B - 1:
				print(", ", end = "")
	print()