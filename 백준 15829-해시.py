alphabet_scores = {chr(i): i - 96 for i in range(97, 123)}
total = 0
M = 1234567891
a = int(input())
l = input()
l = list(l)

for i in range(len(l)):
    total += alphabet_scores[l[i]] * 31**i

total = total % M
print(total)