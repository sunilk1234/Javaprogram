package projectp1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,30,50,20,30,70,70,90};
		System.out.println("Array elements before sorting: "+Arrays.toString(a));
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array elements After sorting: "+Arrays.toString(a));
	}

}
