a = int(input())
arr = []
for i in range(a):
    b,c = map(int,input().split())
    arr.append([b,c])

arr.sort()

for row in arr:
    print(*row)