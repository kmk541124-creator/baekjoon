a = int(input())
sum = 0
aum = 0
um = 0
b = list(map(int,input().split()))

t, p = map(int,input().split())

for i in b:
    sum = i//t + sum
    if(i%t >0):
        sum = sum+1
aum = a//p
um = a%p
print(sum)
print(aum,um)