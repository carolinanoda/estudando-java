import java.lang.Math;
import java.util.Locale;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TheGreatest {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int numeros[] = new int[3];
		String[] strNums;
		strNums = bi.readLine().split(" ");
		for (int i = 0; i < strNums.length; i++) {
			numeros[i] = Integer.parseInt(strNums[i]);
		}
		int a = numeros[0];
		int b = numeros[1];
		int c = numeros[2];
		int maiorAb = (a + b + Math.abs(a-b)) / 2;
		int maior = (maiorAb + c + Math.abs(maiorAb - c)) / 2;
		System.out.print(maior);
		System.out.println(" eh o maior");
	}

}
