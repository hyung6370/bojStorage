num = int(input())

for _ in range(num):
    arr = []
    val = int(input())

    for i in range(2):
        arr.append(list(map(int, input().split())))
        
    for j in range(1, val):
        if j == 1:
            arr[0][j] += arr[1][j-1]
            arr[1][j] += arr[0][j-1]
        else:
            arr[0][j] += max(arr[1][j-1], arr[1][j-2])
            arr[1][j] += max(arr[0][j-1], arr[0][j-2])
    
    print(max(arr[0][val-1], arr[1][val-1]))
