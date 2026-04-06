word=str(input())
result = 0

l1 = list(word)
reverse_word = ''.join(reversed(word))

if(word == reverse_word):
    print(1)
elif(word != reverse_word):
    print(0)