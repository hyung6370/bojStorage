num = int(input())

arr = [[0] * 10 for _ in range(num+1)]

arr[1][0] = 0
arr[1][1] = 1

for i in range(2, num+1):
    arr[i][0] = arr[i-1][0] + arr[i-1][1]
    arr[i][1] = arr[i-1][0]
    
print(arr[num][0] + arr[num][1])
