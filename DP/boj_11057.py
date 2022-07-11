num = int(input())

arr = [[0] * 10 for _ in range(num + 1)]
mod = 10007
int(mod)

for i in range(0, 10):
    arr[0][i] = 1

for i in range(1, num+1):
    for j in range(0, 10):
        for k in range(j, 10):
            arr[i][j] += arr[i-1][k]
            arr[i][j] %= mod
    
print(arr[num][0] % mod)

