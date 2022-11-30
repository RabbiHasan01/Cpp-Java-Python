


mark1=int(input("THE 1st NUMBER IS : "))
mark2=int(input("THE 2nd NUMBER IS : "))
mark3=int(input("THE 3rd NUMBER IS : "))

sum =   mark1+mark2+mark3

avrg= sum/3
print(" AVRG :  ",avrg)

if avrg>=83 and avrg <100:
    print(" THE GRADE IS : A+")

elif avrg>=78 and avrg< 83:
    print(" THE GRADE IS : A")

elif avrg>=73 and avrg < 78:
    print(" THE GRADE IS : A-")

elif avrg>=68 and avrg < 73:
    print(" THE GRADE IS : B+")

elif avrg>=63 and avrg <  68:
    print(" THE GRADE IS : B")

elif avrg>=58 and avrg <63:
    print(" THE GRADE IS : B-")

elif avrg >= 53 and avrg <58:
    print(" THE GRADE IS : C")

elif avrg >= 48 and avrg < 53:
    print(" THE GRADE IS : D")

else:
    print("Sorry! You Are FAIL.")