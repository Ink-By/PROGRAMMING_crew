__author__ = 'Chetan'

class Person(object):
    
    def __init__(self, name, age):  #constructor
        self.name = name    #data members/ attributes
        self.age = age
    
    def get_person(self,):   # member function
        return "<Person (%s, %s)>" % (self.name, self.age)

p = Person("John", 32)    # p is an object of type Person
print("Type of Object:", type(p), "Memory Address:", id(p))

a="John"
b=(1,2,3)
c=[3,4,5,6,7]
print(a[1],b[0],c[2])

class A:
    def a1(self):
        print("a1")

class B(A):
    def b(self):
        print("b")
b = B()
b.a1()