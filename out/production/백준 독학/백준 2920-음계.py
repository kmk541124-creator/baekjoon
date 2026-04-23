music = [1,2,3,4,5,6,7,8]
reverse_music = [8, 7, 6, 5, 4, 3, 2, 1]
ascending = 0

a = list(map(int,input().split()))
if a == music:
    print("ascending")
elif a == reverse_music:
    print("descending")
else:
    print("mixed")