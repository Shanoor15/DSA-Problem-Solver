import java.util.*;
public class CountSubarraysWithZeroXOR {
	public static void main(String[] args) {
		int[] arr= {4,2,2,6,4};
		int target=6;
		int res = countSubarray(arr,target);
		System.out.println(res);
	}

	//1.Brute Level
	/*private static int countSubarray(int[] arr,int target) {
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int xor=0;
				for(int k=i;k<=j;k++) {
					xor=xor^arr[k];
				}
				if(xor==target) {
					count++;
				}
			}
		}
		return count;
	}*/
	
	//2.Better Level
	private static int countSubarray(int[] arr,int target) {
		int n=arr.length,count=0;
		for(int i=0;i<n;i++) {
			int xor=0;
			for(int j=i;j<n;j++) {
				xor^=arr[j];
				if(xor==target) {
					count++;
				}
			}
		}
		return count;
	}

}
