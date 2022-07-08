import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		long[][] arr = new long[num+1][10];
		long mod = 1_000_000_000;
	
		for (int i = 1; i <= 9; i++) {
			arr[1][i] = 1;
		}
		
		for (int i = 2; i <= num; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					arr[i][j] = (arr[i-1][j+1]) % mod;
				}
				else if (j >= 1 && j <= 8) {
					arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % mod;
				}
				else if (j == 9) {
					arr[i][j] = (arr[i-1][j-1]) % mod;
				}
			}
		}
		
		long sum = 0;
		for (int i = 0; i <= 9; i++) {
			sum += arr[num][i];
		}
		System.out.println(sum % mod);
	}	
}
