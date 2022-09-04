import java.util.Locale;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Area {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		double numeros[] = new double[3];
		String[] strNums;
		strNums = bi.readLine().split(" ");
		for (int i = 0; i < strNums.length; i++) {
			numeros[i] = Double.parseDouble(strNums[i]);
		}
		double pi = 3.14159;
		double A = numeros[0];
		double B = numeros[1];
		double C = numeros[2];
		double T = (A * C) / 2;
		double Circulo = pi * C * C;
		double Trapezio = ((A + B) * C) / 2;
		double Q = B * B;
		double R = A * B;
		String strT = String.format(Locale.US, "%.3f", T);
		String strC = String.format(Locale.US, "%.3f", Circulo);
		String strTrapezio = String.format(Locale.US, "%.3f", Trapezio);
		String strQ = String.format(Locale.US, "%.3f", Q);
		String strR = String.format(Locale.US, "%.3f", R);
		System.out.println("TRIANGULO: " + strT);
		System.out.println("CIRCULO: " + strC);
		System.out.println("TRAPEZIO: " + strTrapezio);
		System.out.println("QUADRADO: " + strQ);
		System.out.println("RETANGULO: " + strR);
	}

}
