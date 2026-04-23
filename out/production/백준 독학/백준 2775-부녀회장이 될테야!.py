apartment = [[0] * 15 for _ in range(15)]

for i in range(1, 15):
    apartment[0][i] = i

for k in range(1, 15):
    for n in range(1, 15):
        apartment[k][n] = apartment[k][n-1] + apartment[k-1][n]

T = int(input())
for _ in range(T):
    floor = int(input())
    ho = int(input())
    print(apartment[floor][ho])