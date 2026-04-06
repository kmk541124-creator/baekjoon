a = input()
b = []
for i in range(int(a)):
    c = input()
    b.append(c)

sort = sorted(b, key=len)
result = sorted(b, key=lambda x: (len(x), x))

for word in result:
    print(word)