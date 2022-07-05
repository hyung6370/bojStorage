num = int(input())

arr = [0] * (num + 2)

arr[0] = 1
arr[1] = 2
for i in range(2, num+1):
    arr[i] = (arr[i - 1] + arr[i - 2]) % 10007
    

print(arr[num-1])

