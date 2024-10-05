package projectp1;

public class StaticandNonstaticVar {
	static int a = 45;
	int b=1080;
	public static void main(String[] args) {
		
		StaticandNonstaticVar obj = new StaticandNonstaticVar();
		// TODO Auto-generated method stub
		System.out.println(StaticandNonstaticVar.a);//accessing static variable
		System.out.println(obj.b);//accessing non-static variable
		
		int a=40;
		System.out.println(a);//accessing local variable
	}

}
