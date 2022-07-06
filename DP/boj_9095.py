num = int(input())

arr = [0] * 10001
arr[0] = 1
arr[1] = 2
arr[2] = 4

for _ in range(1, num+1):
    t = int(input())
    for i in range(3, t+1):
        arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3]
    
    print(arr[t-1])

