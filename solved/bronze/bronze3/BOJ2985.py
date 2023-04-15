A, B, C = map(int, input().split(' '))

if A + B == C:
	print(f"{A}+{B}={C}")
elif A == B + C:
	print(f"{A}={B}+{C}")
elif A - B == C:
	print(f"{A}-{B}={C}")
elif A == B - C:
	print(f"{A}={B}-{C}")
elif A * B == C:
	print(f"{A}*{B}={C}")
elif A == B * C:
	print(f"{A}={B}*{C}")
elif A / B == C:
	print(f"{A}/{B}={C}")
else:
	print(f"{A}={B}/{C}")