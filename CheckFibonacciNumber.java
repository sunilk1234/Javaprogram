package projectp1;

public class CheckFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =20;
		if(isFibonacci(n)){
			System.out.println("Given number is Fibonacci Number");
		}else {
			System.out.println("Given number is not a Fibonacci number");
		}
		

	}

	private static boolean isFibonacci(int n) {
		// TODO Auto-generated method stub
		int pre =0;
		int cur = 1;
		int next =pre+cur;
		if(n==0||n==1) {
			return true;
		}
		while(next<=n){
			if(next==n) {
				return true;
			}
			next=pre+cur;
			pre=cur;
			cur=next;
		}
		
		
		return false;
	}

}
