while True:
    a,b,c = map(int,input().split())
    if(a==0 and b==0 and c==0):
        break
    tring = a**2 + b**2 == c**2
    if(tring):
        print("right")
    else:
        print("wrong")