a = int(input())
arr = []

for i in range(a):
    b, c = map(int, input().split())
    arr.append([b, c])

score = []

for w in range(a):
    count = 0
    for e in range(a):
        if arr[w][0] < arr[e][0] and arr[w][1] < arr[e][1]:
            count += 1
    
    score.append(count + 1)

print(*score)