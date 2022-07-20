import sys
sys.setrecursionlimit(10**6)

def recur(num):
    if dp[num] is None:
        dp[num] = max(max(recur(num-2), recur(num-3) + arr[num-2]) + arr[num-1], recur(num-1))
    return dp[num]

if __name__ == "__main__":
    num = int(input())

    arr = [int(sys.stdin.readline()) for _ in range(num)]
    dp = [None for _ in range(num+1)]
    
    dp[0] = 0
    dp[1] = arr[0]

    if num > 1:
        dp[2] = arr[0] + arr[1]
        
    print(recur(num)) 
