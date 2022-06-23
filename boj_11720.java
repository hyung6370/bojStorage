import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		String a = sc.next();
		sc.close();
		
		int sum = 0;
		
		for (int i = 0; i < t; i++) {
			sum += a.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}	
}
