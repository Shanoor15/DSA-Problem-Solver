import java.util.*;
public class CountSubarraysWithZeroXOR {
	public static void main(String[] args) {
		int[] arr= {4,2,2,6,4};
		int target=6;
		int res = countSubarray(arr,target);
		System.out.println(res);
	}

	private static int countSubarray(int[] arr,int target) {
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
	}

}
