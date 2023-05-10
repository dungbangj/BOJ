def is_prime(number):
	if number < 2:
		return False
	for i in range(2, int(number ** 0.5) + 1):
		if number % i == 0:
			return False
	return True

def generate_prime_numbers(n):
	primes = []
	num = 2
	while num < n:
		if is_prime(num):
			primes.append(num)
		num += 1
	return primes

a, b = map(int, input().split(' '))
flag = 0

primes = generate_prime_numbers(b)
for i in primes:
	if a % i == 0:
		print(f"BAD {i}")
		flag = 1
		break

if flag == 0:
	print("GOOD")

# for i in range(2, b + 1):
# 	if a % i == 0 and is_prime(i) == True:
# 		print(f"BAD {i}")
# 		flag = 1
# 		break

# if flag == 0:
# 	print("GOOD")

