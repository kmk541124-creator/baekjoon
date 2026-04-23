a = input()
b = input()
c = input()
num = 0
num_index = 0
result = ''

try:
    a = int(a)
    num = a
    num_index = 1
except ValueError:
    a = str(a)
try:
    b = int(b)
    num = b
    num_index = 2
except ValueError:
    c = str(c)
try:
    c = int(c)
    num = c
    num_index = 3
except ValueError:
    c = str(c)

num = num + (4-num_index)
if(num%3 == 0 and num%5 == 0):
    result = "FizzBuzz"
elif(num%3 == 0 and num%5 != 0):
    result = "Fizz"
elif(num%3 != 0 and num%5 ==0):
    result = "Buzz"
else:
    result = num

print(result)