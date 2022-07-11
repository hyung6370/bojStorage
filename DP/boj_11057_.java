import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
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
