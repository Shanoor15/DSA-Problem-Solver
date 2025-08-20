package findMaximumConsecutiveOnces;

import java.util.HashMap;

public class FindMaximumConsecutiveOnces {
	public static void main(String[] args) {
		int[] arr={1,1,1,1,1,0,1,1,1,0,1,1};
		int result=findMaxConsigutiveOnce(arr);
		System.out.println(result);
	}
	//Brute Level
	/*public static int findMaxConsigutiveOnce(int[] arr){
	    int max=0;
	    for(int i=0;i<arr.length;i++){
	        int count=0;
	        for(int j=i;j<arr.length;j++){
	            if(arr[i]==arr[j]){
	                count++;
	            }
	            else{
	                max=Math.max(max,count);
	                break;
	            }
	        }
	        max=Math.max(max,count);
	    }
	    return max;
	}*/
	
	//Optimal Level
	public static int findMaxConsigutiveOnce(int[] arr){
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
				max=Math.max(count, max);
				count=0;
			}
		}
		max=Math.max(count, max);
		return max;
	}

}
