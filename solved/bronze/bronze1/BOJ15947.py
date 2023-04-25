N = int(input())

arr = ['baby', 'sukhwan', 'tururu', 'turu', 'very', 'cute', 'tururu', 'turu', 'in', 'bed', 'tururu', 'turu', 'baby', 'sukhwan']

res = (N - 1) % 14
m = (N - 1) // 14

def plus_plus(word, num):
	for i in range(num):
		word = word + "" + 'ru'
	return word

if arr[res] == 'tururu':
	if m < 3:
		print(plus_plus(arr[res], m))
	else:
		print(f"tu+ru*{m + 2}")
elif arr[res] == 'turu':
	if m < 4:
		print(plus_plus(arr[res], m))
	else:
		print(f"tu+ru*{m + 1}")
else:	
	print(arr[res])