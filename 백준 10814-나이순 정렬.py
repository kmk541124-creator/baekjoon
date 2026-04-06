a = int(input())

list = []
for i in range(a):
    b,c = map(str,input().split())
    b = int(b)
    list.append([b,c])

list.sort(key=lambda x: x[0])


for row in list:
    print(*row)