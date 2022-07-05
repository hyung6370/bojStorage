import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		int[] arr = new int[num + 2];
		
		arr[0] = 1; 
		arr[1] = 2;
		
		for (int i = 2; i <= num; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
		}
		System.out.println(arr[num-1]);
	}	
}
