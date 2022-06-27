t = int(input())

for i in range(1, t+1) :
    print((i * "*").rjust(t) + ((i-1) * "*"))
