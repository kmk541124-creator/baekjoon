n = int(input())
group_word_count = n

for _ in range(n):
    word = input()
    for i in range(len(word) - 1):
        if word[i] != word[i+1]:
            if word[i] in word[i+1:]:
                group_word_count -= 1
                break
                
print(group_word_count)