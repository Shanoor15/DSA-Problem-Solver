
public class SeacherInsertionPosition {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6};
		int target = 5;
		int res=searchInsert(arr,target);
		System.out.println(res);
	}
	
	//1.Brute Level
	/*public static int searchInsert(int[] arr, int target) {
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>=target){
	            return i;
	        }
	    }
	    return arr.length;
	}*/
	
	//2.Optimal Level
	public static int searchInsert(int[] arr, int target) {
		int left=0,right=arr.length-1;
        int min=arr.length;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=target){
                min=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return min;
	}
}
