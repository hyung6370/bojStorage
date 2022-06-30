t = int(input())

for i in range(0, t-1):
    if (i == 0):
        print(" " * (t-1-i) + "*")
    else:
        print(" " * (t-1-i) + "*" + " " * (2*i-1) + "*")
    if (i == t-2):
        print("*" * (2 * t - 1))

if (t == 1):
    print("*")
