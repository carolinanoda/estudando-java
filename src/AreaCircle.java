import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class AreaCircle {
	public static void main(String[] args) throws IOException {		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		double pi = 3.14159d;
		double R = scan.nextDouble();
		double A = pi * R * R;
		String strDouble = String.format(Locale.US, "%.4f", A);
		System.out.println("A=" + strDouble);
		
		scan.close();
		

	}

}
