import math

n = int(input())
sum = 0

arr = input().split(' ')

for i in arr:
	sum += pow(float(i), 3)

print(sum**(1/3))