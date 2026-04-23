a = int(input())
score = 0
dou = 1
for i in range(a):
    o = input()
    o = list(o)
    for d in range(len(o)):
        if(o[d] == 'O'):
            score = score + dou
            dou = dou+1
        elif(o[d] == 'X'):
            dou = 1
    print(score)
    score=0
    dou = 1