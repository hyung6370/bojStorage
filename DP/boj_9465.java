import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			int val = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[2][val+1];
			int[][] sticker = new int[2][val+1];

			for (int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 1; k < val+1; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			sticker[0][1] = arr[0][1];
			sticker[1][1] = arr[1][1];
			for (int k = 2; k < val+1; k++) {
				sticker[0][k] = Math.max(sticker[1][k-1], sticker[1][k-2]) + arr[0][k];
				sticker[1][k] = Math.max(sticker[0][k-1], sticker[0][k-2]) + arr[1][k];
			}
			System.out.println(Math.max(sticker[0][val], sticker[1][val]));
		}
	}	
}
