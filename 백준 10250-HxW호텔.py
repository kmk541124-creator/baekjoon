a = int(input())

for i in range(a):
    H, W, N = map(int, input().split())
    
    floor = N % H
    room = (N // H) + 1
    
    if floor == 0:
        floor = H
        room -= 1
        
    print(f"{floor}{room:02d}")