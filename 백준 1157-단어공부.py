word = input()

word = word.upper()

top_char = ""

l1 = list(set(word))
max = 0



for i in l1:
    count = word.count(i)

    if count > max:
        max = count
        top_char = i

    elif(count == max):
        top_char = "?"
print(top_char)