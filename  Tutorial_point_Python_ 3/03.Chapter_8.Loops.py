
""" For loops"""

range(5)
range(0,5)
list(range(5))
print("01 : ")
print(list(range(5))) #This is list
for var in list(range(5)):
    print(var )  #[0,1,2,3,4]
print("02 : ")
for letter in "PYTHON":
    print("Letter : ",letter)

alist=["What","the","f**cking","b***ch"]
print("03 : ")
for word in alist:
     print("Word : ",word)

#For - else loop.....
print("04 : ")
c=0
blist=[1,4,5,7,9]
for num in blist:
    if(num%2==0):
        c=c+1
        print (c," : ",num,"is even")
else :
    print("Here is no even number")