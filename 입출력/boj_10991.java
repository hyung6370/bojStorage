import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int k = 1; k < (num - i)+1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
	}	
}
