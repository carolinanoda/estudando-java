import java.util.Scanner;
import java.util.Locale;

public class AverageOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		double media = ((A * 3.5) + (B * 7.5)) / 11;
		String strDouble = String.format(Locale.US, "%.5f", media);
		System.out.println("MEDIA = " + strDouble);
		
		scan.close();
	}
}
