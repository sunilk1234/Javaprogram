package projectp1;

public class LocalAndGlobalVariables {
	static int a =46;//global static variables
	int b = 40;//global non-static variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =24;//local variables
		LocalAndGlobalVariables obj  =new LocalAndGlobalVariables();
		
		System.out.println(obj.b);//accessing global non-static variable
		
		System.out.println(a);//accessing local variable
		System.out.println(LocalAndGlobalVariables.a);//accessing global static variable

	}

}
