package projectp1;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,30,20,2,100,1,1230};
		int last = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>last) {
				last=a[i];
			}
		}
		System.out.println(last);

	}

}
