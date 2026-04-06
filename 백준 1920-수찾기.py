a = int(input())
arr = [0]*a

j = list(map(int,input().split()))

b = int(input())

l = list(map(int,input().split()))
for i in range(b):
    if(j.count(l[i]) >= 1):
        print(1)
    else:
        print(0)    