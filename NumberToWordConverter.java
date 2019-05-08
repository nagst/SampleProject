import java.util.Scanner;


public class NumberToWordConverter {
	
	
	public static final String[] units = { "", "One", "Two", "Three", "Four",
		"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
		"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
		"Eighteen", "Nineteen" };

		public static final String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty",
				"Seventy","Eighty",	"Ninety" };

		public static String convert(final int number) {
			if (number < 0) {
				return "Minus " + convert(-number);
			}

			if (number < 20) {
				return units[number];
			}

			if (number < 100) {
				return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
			}

			if (number < 1000) {
				return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + convert(number % 100);
			}

			if (number < 100000) {
				return convert(number / 1000) + " Thousand" + ((number % 10000 != 0) ? " " : "") + convert(number % 1000);
			}

			if (number < 10000000) {
				return convert(number / 100000) + " Lakh" + ((number % 100000 != 0) ? " " : "") + convert(number % 100000);
			}

			return convert(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " : "") + convert(number % 10000000);
		}

		public static void main(String[] args) {

			int num;
			Scanner s=new Scanner(System.in);
		    System.out.println("Enter a number to convert into word format");
			num =s.nextInt();
			System.out.println(num + "='" + convert(num) + "'");

		}
		

}
