import java.util.Scanner;
import java.util.Locale;

public class Sphere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		double pi = 3.14159;
		double R = scan.nextDouble();
		double V = (4.0 / 3) * pi * (R * R * R);
		String strDouble = String.format(Locale.US, "%.3f", V);
		System.out.println("VOLUME = " + strDouble);

	}

}
