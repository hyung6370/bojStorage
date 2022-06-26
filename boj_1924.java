import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] year = { 31,28,31,30,31,30,31,31,30,31,30,31 };
		String[] str_day = { "SUN","MON","TUE","WED","THU","FRI","SAT" };
		int total_day = 0;
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		for (int i = 0; i < month - 1; i++) {
			total_day += year[i];
		}
		total_day += day;
		System.out.println(str_day[total_day % 7]);
	}	
}
