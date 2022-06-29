t = int(input())

for i in range(0, t) :
    print(" " * i + "*" * ((t - i) * 2 - 1))
    
for j in range(2, t+1) :
    print(" " * (t - j)  + "*" * ((2 * j) - 1))
