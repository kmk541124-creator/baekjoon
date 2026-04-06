while True:
    word = input()
    if(word == "0"):
         break

    if word == word[::-1]:
        is_palindrome = 'yes'
    else:
        is_palindrome = 'no'
    print(is_palindrome)
