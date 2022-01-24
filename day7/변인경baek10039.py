list = []
for i in range (5):
    a = int(input())
    if(a<40):
        list.append(40)
    else:
        list.append(a)
b=sum(list)//5
print(b)

