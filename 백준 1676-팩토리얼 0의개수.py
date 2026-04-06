a = int(input())
p = 1
count = 0
for i in range(1, a+1):
    p *= i

p = list(str(p))
p.reverse()

for i in range(len(p)):
    if(p[i]=='0'):
        count += 1
    else:
        break
print(count)