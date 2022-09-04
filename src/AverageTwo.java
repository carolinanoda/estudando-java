import java.util.Scanner;
import java.util.Locale;

public class AverageTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		String strDouble = String.format(Locale.US, "%.1f", media);
		System.out.println("MEDIA = " + strDouble);
		
		scan.close();
	}
}
