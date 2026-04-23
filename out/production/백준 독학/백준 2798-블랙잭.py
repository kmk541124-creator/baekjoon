n, m = map(int,input().split())
cards = list(map(int,input().split()))

result = 0

for i in range(0, n - 2):
    for j in range(i + 1, n - 1):
        for k in range(j + 1, n):
            card_sum = cards[i] + cards[j] + cards[k]
            
            if card_sum <= m:
                if card_sum > result:
                    result = card_sum

print(result)