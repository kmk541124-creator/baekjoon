a = int(input())
arr = []
for i in range(a):
    b,c = map(int,input().split())
    arr.append([c,b])

arr.sort()

reversed_arr = [row[::-1] for row in arr]

for row in reversed_arr:
    print(*row)