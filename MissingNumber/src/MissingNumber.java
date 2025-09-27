import java.util.*;
public class MissingNumber {
	public static void main(String[] args) {
		int[] arr= {3,0,1};
		//int[] arr= {0,1};
		//int[] arr= {9,6,4,2,3,5,7,0,1};
		int missingNumber = findMissingNumber(arr);
		System.out.println(missingNumber);
	}
	
	//1.Brute Level
	/*private static int findMissingNumber(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<=max;i++) {
			boolean isPresent=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					isPresent=true;
					break; // stop checking once found
				}
			}
			if(!(isPresent)) {
				return i; // return first missing number
			}
		}
		return max+1;  // if none missing in range, next number is missing
	}*/
	
	//2.Better Level using Hashing
	/*private static int findMissingNumber(int[] arr) {
		int[] hash=new int[12];
		for(int num:arr) {
			hash[num]=1;
		}
		for(int i=0;i<hash.length;i++) {
			if(hash[i]==0)
				return i;
		}
		return -1;
	}*/
	
	//2.Better Level using HashMap
	/*private static int findMissingNumber(int[] arr) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],i); // store element as key
		}
		for(int i=0;i<=arr.length;i++) {
			if(!map.containsKey(i))
				return i;
		}
		return -1;
	}*/
	
	//3.Optimal Level
	private static int findMissingNumber(int[] arr) {
		int n=arr.length,sum=0;
		int total=n*(n+1)/2;
		for(int num:arr) {
			sum+=num;
		}
		return total-sum;
	}
}