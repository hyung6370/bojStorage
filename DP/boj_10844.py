num = int(input())

arr = [[0] * 10 for _ in range(num + 1)]
sum = 0
mod = 1000000000 
int(sum)
int(mod)

for i in range(1, 10):
    arr[1][i] = 1

for i in range(2, num+1):
    for j in range(0, 10):
        if (j == 0):
            arr[i][j] = (arr[i-1][j+1]) % mod
        elif (j >= 1 and j <= 8 ):
            arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % mod
        elif (j == 9):
            arr[i][j] = (arr[i-1][j-1]) % mod
            
for i in range(0, 10):
    sum += arr[num][i]
    
print(sum % mod)

