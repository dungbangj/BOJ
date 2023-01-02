# 17479 정식당

import sys
input = sys.stdin.readline

menu_A = {}
menu_B = {}
A, B, C = map(int, input().split())

for _ in range(A):
    name, price = input().split()
    menu_A[name] = int(price)

for _ in range(B):
    name, price = input().split()
    menu_B[name] = int(price)

for _ in range(C):
    name = input().strip()

orders = int(input())
price_split = [0] * 2
service_count = 0

for _ in range(orders):
    order_menu = input().strip()
    if order_menu in menu_A:
        price_split[0] += menu_A[order_menu]
    elif order_menu in menu_B:
        price_split[1] += menu_B[order_menu]
    else:
        service_count += 1

if price_split[1] != 0 and price_split[0] < 20000:
    print("No")
else:
    if price_split[0] + price_split[1] < 50000 and service_count > 0:
        print("No")
    elif service_count > 1:
        print("No")
    else:
        print("Okay")