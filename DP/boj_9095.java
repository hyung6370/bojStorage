import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		int[] arr = new int[10001];
	
		arr[0] = 1; 
		arr[1] = 2;
		arr[2] = 4;
		
		for (int j = 1; j <= num; j++) {
			int t = sc.nextInt();
			for (int i = 3; i <= t; i++) {
				arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
			}
			System.out.println(arr[t-1]);
		}
	}	
}
