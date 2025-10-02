package plusOne;

import java.util.Arrays;

public class plusOne {
	public static void main(String[] args) {
		//int[] arr={1,2,3};
		int[] arr={9};
		int[] res=onePlus(arr);
		System.out.println(Arrays.toString(res));
	}
	public static int[] onePlus(int[] arr) {
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}
			arr[i]=0;
		}
		int[] newArray=new int[n+1];
		newArray[0]=1;
		return newArray;
	}
}
