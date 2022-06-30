t = int(input())

for i in range(1, t+1) :
    print((i * "*").rjust(t))

for j in range(t-1, 0, -1) :
    print((j * "*").rjust(t))
