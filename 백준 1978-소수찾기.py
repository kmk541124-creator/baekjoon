a = int(input())
b = list(map(int, input().split()))
c = 0

for num in b:
    count = 0
    
    for i in range(1, num + 1):
        if num % i == 0:
            count += 1
            
    if count == 2:
        c += 1

print(c)