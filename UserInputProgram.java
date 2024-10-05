package projectp1;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter byte value");
		byte by = sc.nextByte();
			System.out.println("Enter short value");
		short sh = sc.nextShort();
			System.out.println("Enter int value");
		int a = sc.nextInt();
			System.out.println("Enter Long value");
		long ln = sc.nextLong();
			System.out.println("Enter Float value");
		float fl = sc.nextFloat();
			System.out.println("Enter Double value");
		double db = sc.nextDouble();
			System.out.println("Enter Boolean value");
		boolean bh = sc.nextBoolean();
			System.out.println("Enter char value");
		char ch = sc.next().charAt(0);
		
			System.out.println("user byte value:"+by);
			System.out.println("user int value:"+a);
			System.out.println("user short value:"+sh);
			System.out.println("user long value:"+ln);
			System.out.println("user double value:"+db);
			System.out.println("user float value:"+fl);
			System.out.println("user boolean value:"+bh);
			System.out.println("user chat value:"+ch);
		
			System.out.println("...........Non-primitive datatype.......");
		String st = sc.next();//one-word input
			System.out.println("User String value :"+st);
		sc.nextLine();
		String stl = sc.nextLine();//more-words input
			System.out.println("User sentence:"+stl);
	}

}
