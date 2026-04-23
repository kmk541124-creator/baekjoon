s = input()
total = 0
star_idx = 0

for i in range(13):
    if s[i] == '*':
        star_idx = i
        continue
    
    num = int(s[i])
    if i % 2 == 0:
        total += num
    else:
        total += num * 3

for j in range(10):
    weight = 1 if star_idx % 2 == 0 else 3
    if (total + j * weight) % 10 == 0:
        print(j)
        break