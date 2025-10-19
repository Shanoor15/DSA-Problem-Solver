import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,8,8,10};
		int target=8;
		int[] res=searchRange(arr,target);
		System.out.println(Arrays.toString(res));
	}
	//1.Brute Level
	/*public static int[] searchRange(int[] arr,int target) {
		int first=-1,second=-1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            if(first==-1) {
	                first=i;
	            }
	            second=i;
	        }
	    }
	    return new int[]{first,second};
	}*/
	
	public static int[] searchRange(int[] arr,int target) {
		
	}
}
