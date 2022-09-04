import java.util.Scanner;
import java.util.Locale;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int diferenca = (A * B) - (C * D);
		System.out.println("DIFERENCA = " + diferenca);
		
		scan.close();
	}
}
