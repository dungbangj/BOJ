A, B, C = map(int, input().split(' '))

avg = (A + B + C) // 3
sum = 0

sum += abs(avg - A)
B -= sum
sum += abs(avg - B)

print(sum)