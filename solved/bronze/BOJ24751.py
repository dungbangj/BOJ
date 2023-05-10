a = float(input())

b = 100 - a

format_a = format((a + b) / a, ".10f")
format_b = format((a + b) / b, ".10f")
print(format_a, format_b)

