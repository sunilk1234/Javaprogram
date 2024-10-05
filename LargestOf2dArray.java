package projectp1;

public class LargestOf2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,20,30,40},{30,40,50,60}};
		int max=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
