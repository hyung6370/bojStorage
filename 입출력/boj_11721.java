import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		sc.close();
		
		int tmp = a.length() / 10;
		int tmp2 = a.length() % 10;
	
	
		if (a.length() > 10) {
			int j = 0;
			for (int i = 0; i < tmp; i++) {
				System.out.println(a.substring(j, j+10));
				j += 10;
			}
			System.out.println(a.substring(tmp * 10, tmp * 10 + tmp2));
		}
		else {
			System.out.println(a.substring(0, tmp2));
		}
	}	
}
