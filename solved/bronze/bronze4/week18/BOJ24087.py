S: int = int(input())
A: int = int(input())
B: int = int(input())
price: int = 250

while S > A:
	A += B
	price += 100

print(price)