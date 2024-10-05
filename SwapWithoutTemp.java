package projectp1;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 40;
		System.out.println("Values befor swapping:"+a+" "+b);
		a = a+b;//60
		b = a-b;//20
		a = a-b;//40
		System.out.println("Values after Swapping:"+a+" "+b);

	}

}
