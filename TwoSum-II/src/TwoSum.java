import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		int target = 9;
		int[] res=twoSum(arr,target);
		System.out.println(Arrays.toString(res));
	}
	//1.Brute Level
	/*public static int[] twoSum(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				int value=arr[i]+arr[j];
				if(value==target) {
					return new int[] {i+1,j+1};
				}
		}
	}
		return new int[] {};
	}*/
	
	
	//2.optimal Level
		public static int[] twoSum(int[] arr, int target) {
	    int left=0,right=arr.length-1;
	    while(left<right){
	        int value=arr[left]+arr[right];
	        if(value==target){
	            return new int[]{left+1,right+1};
	        }
	        if(value>target)
	            right--;
	        else
	            left++;
	    }
	    return new int[]{};
	}
}
