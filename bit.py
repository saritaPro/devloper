#!/usr/bin/python

a=60                          #60=00111100
b=13                          #13=00001101
c=0

c=a&b                         #12=00001100
print"line 1 - value of c is",c

c=a|b                         #61=00111101
print"line 2 - value of c is",c

c=a^b                         #49=00110001
print"line 3 - value of c is",c

c=~a                          #-61=11000011 
print"line 4 - value of c is",c

c=a<<2                        #240=11110000
print"line 4 - value of c is ",c

c=a>>2                        #15=1111
print"line 5 - value of c is ",c

