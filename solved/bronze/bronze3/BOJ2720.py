T = int(input())

for i in range(T):
	C = int(input())
	Q = int(C / 25)
	C -= Q * 25
	D = int(C / 10)
	C -= D * 10
	N = int(C / 5)
	C -= N * 5
	P = C
	print(f"{Q} {D} {N} {P}")