star = int(input())
starcount = star
hollsu = 1
for i in range(starcount):
    for v in range(starcount-1):
        print(" ", end="")
    for j in range(hollsu):
        print("*", end="")
        
    hollsu = hollsu + 2
    print("")
    starcount = starcount - 1

starcount = starcount + 1
hollsu = star*2-1-2

for i in range(star-1):
    for v in range(starcount):
        print(" ", end="")
    for j in range(hollsu):
        print("*", end="")
    
    hollsu = hollsu - 2
    print("")
    starcount = starcount + 1