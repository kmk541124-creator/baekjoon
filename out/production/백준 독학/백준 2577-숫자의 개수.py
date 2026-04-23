a = [0] * 10
sum = 1
cu = 0
se = ''
for i in range(3):
    b = int(input())
    sum = sum * b

sum = str(sum)
sum = list(sum)
for d in range(10):
    a[d] = sum.count(str(d))
for g in a:
    print(g)