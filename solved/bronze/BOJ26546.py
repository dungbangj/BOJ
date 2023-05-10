n = int(input())

for i in range(n):
	ob, A, B = input().split(' ')
	print(ob[0:int(A)] + ob[int(B):])