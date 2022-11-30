import  random
import os

n = 50000
s = 0
l = []

for i in range(1,n+1,1):
    p = random.randrange(1,1000001)
    l.append(p)

print(len(l))


for i in l:
    f = open("input.txt", "a")
    f.write(str(i)+ " \n")

f.close()
f = open("input.txt", "r")

for i in f:
    print(i)