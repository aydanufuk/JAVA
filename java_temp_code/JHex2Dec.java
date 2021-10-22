import java.util.Scanner;

public class JHex2Dec {

	public static int hex2Dec(String hex_in) {

		int numb = 0;
		String hex_String = "0123456789ABCDEF";
		hex_in = hex_in.toUpperCase();

		for (int idx = 0; idx < hex_in.length(); ++idx) {

			char c = hex_in.charAt(idx);
			int i = hex_String.indexOf(c);
			numb = 16 * numb + i;
		}
		return numb;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter HEX value: ");
		String hex_input = input.next();
		System.out.println(hex2Dec(hex_input));

		input.close();
	}
}
