package projectp1;

public class VarDec_Initialization {

	public static void main(String[] args) {
		int a;//variable declaration
		a=20;//variable initialization
		System.out.println("Variable after initialization "+a);
		a=40;//variable re-initialization
		System.out.println("Variable After re-initialization "+a);
		
		//"Static Variable Declaration and Initialization"
		int b = 30;
		float f = 20.0f;
		long l = 23l;
		double d= 23.65;
		boolean t = true;
		short sh = 231;
		System.out.println("variables after declaration and intialization");
		System.out.println(b);
		System.out.println(f);
		System.out.println(l);
		System.out.println(d);
		System.out.println(t);
		System.out.println(sh);
		System.out.println("variables after re-intialization");
		 b = 234;
		 f = 23.98f;
		 l = 234665l;
		 d= 33.90;
		 t = false;
		 sh = 467;
		 	System.out.println(b);
			System.out.println(f);
			System.out.println(l);
			System.out.println(d);
			System.out.println(t);
			System.out.println(sh);
		
		
	}

}
