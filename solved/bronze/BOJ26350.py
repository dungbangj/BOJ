n = int(input())

for i in range(n):
    denominations = list(map(int, input().split()))
    good_denominations = True
    
    for j in range(1, len(denominations) - 1):
        if denominations[j] * 2 > denominations[j+1]:
            good_denominations = False
            break
    
    print("Denominations:", end=" ")
    print(*denominations[1:len(denominations)])
    if good_denominations:
        print("Good coin denominations!\n")
    else:
        print("Bad coin denominations!\n")
