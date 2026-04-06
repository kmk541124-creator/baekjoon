a = int(input())
reuslt = 0

for i in range(1, a+1):
    digit_sum = sum(map(int, str(i)))
    total = i + digit_sum

    if total == a:
        reuslt = i
        break

print(reuslt)