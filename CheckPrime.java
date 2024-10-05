package projectp1;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=23;
		if(isPrime(a)) {
			System.out.println("Given number is a prime");
		}else {
			System.out.println("Given number is not a prime number");
		}
	}

	private static boolean isPrime(int a) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=2;i<a;i++) {
			flag = true;
		}
		return flag;
	}

}
