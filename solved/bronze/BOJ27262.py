n, k, a, b = map(int, input().split(' '))

el = (k - 1) * b + (n - 1) * b
st = (n - 1) * a

print(f"{el} {st}")