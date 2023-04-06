A, B = map(float, input().split(' '))

N = int(input())
min_price = 1000 / B * A

for i in range(N):
	A, B = map(float, input().split(' '))
	price = 1000 / B * A
	if price < min_price:
		min_price = price
print(min_price)