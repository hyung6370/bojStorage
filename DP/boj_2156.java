import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static Integer[] dp;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
			
			
		dp = new Integer[num+1];
		arr = new int[num+1];
		
		for (int i = 1; i < num+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		if (num > 1) {
			dp[2] = arr[1] + arr[2];
		}
		System.out.println(recur(num));
	}	
	
	static int recur(int num) {
		if (dp[num] == null) {
			dp[num] = Math.max(Math.max(recur(num-2), recur(num-3) + arr[num-1]) + arr[num], recur(num-1));
		}
		return dp[num];
	}
}
