import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		long[][] arr = new long[100][2];

		arr[1][0] = 0;
		arr[1][1] = 1;

		for (int i = 2; i <= num; i++) {
			arr[i][0] = arr[i-1][0] + arr[i-1][1];
			arr[i][1] = arr[i-1][0];
		}
		
		System.out.println(arr[num][0] + arr[num][1]);
	}	
}
