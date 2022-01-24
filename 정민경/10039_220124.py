list = []
sum = 0

for i in range(5) :
    list.append(int(input()))
    if(list[i] > 40):
        sum = sum + list[i]
    else :
        sum = sum + 40

print(sum // 5)
