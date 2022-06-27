import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2*(num-i); j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 1; i <= num-1; i++) {
			for (int k = num-1; k >= i; k--) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2*i; j++) {
				System.out.print(" ");
			}
			for (int m = num-1; m >= i; m--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}	
}
