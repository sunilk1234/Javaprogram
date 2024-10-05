package projectp1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int pre=0;
		int cur=1;
		int n=20;
		System.out.print(pre+" ");
		System.out.print(cur+" ");
		for(int i=3;i<=n;i++) {
			int next = pre+cur;
			pre=cur;
			cur=next;
			System.out.print(next+" ");
		}
	}

}
