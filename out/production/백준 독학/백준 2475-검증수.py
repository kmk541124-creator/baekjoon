a = list(map(int,input().split()))
sum = 0
for i in range(len(a)):
    sum = a[i]**2 + sum
print(sum%10)