a, b = map(int, input().split())
max = 0
low = 0
e = 1
for i in range(a):
    if(a%(i+1) == 0 and b%(i+1) ==0):
        if(max<i+1):
            max=i+1
while True:
    if (a * e) % b == 0:
        low = a * e
        break
    else:
        e = e + 1
print(max)
print(low)