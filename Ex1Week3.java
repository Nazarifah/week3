import java.util.Scanner;

public class Ex1Week3 {
	public static void main (String [] nilaiTerima){
		int noInt = 10, x;

		// if (noInt == 10)
		// 	System.out.println("sama");
		// else
		// 	System.out.println("tak sama");

		System.out.println(noInt == 10 ? "sama" : "tak sama");

		if (noInt == 10)
			x = 3;
		else
			x = 19;

		//ternary operator
		x = noInt == 10 ? 3 : 19;
		System.out.println("x is " + x);




		// String nama;
		// int nombor;
		// double noDouble;

		// Scanner input = new Scanner(System.in);

		// System.out.println("Enter a name: ");
		// nama = input.nextLine(); // or input.next();
		// System.out.println("Name is " + nama);

		// System.out.println("Enter a number: ");
		// nombor = input.nextInt();
		// System.out.println("Number is " + nombor);

		// System.out.println("Enter a double: ");
		// noDouble = input.nextDouble();
		// System.out.println("Number is " + noDouble);

		// //input.nextLine();


		// System.out.println("Enter a double: ");
		// noDouble = input.nextDouble();
		// System.out.println("Number is " + noDouble);

		// input.close();




		// int [] tataInt = {10, 20, 30, 40};

		// //ordinary for
		// for (int i = 0; i < nilaiTerima.length; i++){
		// 	System.out.println(tataInt[i]);
		// }

		// //for-each or advance for
		// for (int t : tataInt){
		// 	System.out.println("for each: " + t);
		// }




		//int noInt = '10'; //declare n initialize

		// final static char CHARSAYA = 53; //asci code
		// System.out.println("Char " + CHARSAYA);
		// CHARSAYA = 100;
		// System.out.println("Char " + CHARSAYA);

		// int [] tataInt = new int[4];

		// for (int i = 0; i < nilaiTerima.length; i++){
		// 	System.out.println(tataInt[i]);
		// }




		//int noInt = 123;
		//int noInt2 = 345;
		//double noDouble = 123.456;

		//System.out.format("%6d dan %4d", noInt, noInt2); //java Ex1Week3
		//System.out.format("%4d", noInt2);
		//System.out.format("RM%7.2f", noDouble);
		//System.out.printf("\nRM%7.2f dan %6d", noDouble, noInt);




		//System.out.println("Nilai 1: " + nilaiTerima[0]);
		//System.out.println("Nilai 1: " + nilaiTerima[1]);
		//System.out.println("Nilai 1: " + nilaiTerima[2]);

		//javac Ex1Week3.java
		//java Ex1Week3

		//int sum = 0;

		//for (int i = 0; i < nilaiTerima.length; i++){
			//System.out.println("Nilai: " + nilaiTerima[i]);
			//sum += Integer.parseInt(nilaiTerima[i]);
			//System.out.println("Nilai sum: " + sum);
		//}


		//java Ex1Week3 10 20 30 40

	}
}