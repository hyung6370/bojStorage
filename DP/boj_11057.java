import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		long[][] arr = new long[num+1][10];
	
		for (int i = 0; i <= 9; i++) {
			arr[0][i] = 1;
		}
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = j; k <= 9; k++) {
					arr[i][j] += arr[i-1][k];
					arr[i][j] %= 10007;
				}
			}
		}
		
		System.out.println(arr[num][0] % 10007);
	}	
}
