
public class SearchElementInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr= {7,8,9,1,2,3,4,5,6};
		int target=1;
		int res=searchRotatedArray(arr,target);
		System.out.println(res);
	}
	//1.Better Level
	/*public static int searchRotatedArray(int[] arr,int target) {
		for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            return i;
	        }
	    }
	    return -1;
	}*/
	
	//2.Optimal Level
	public static int searchRotatedArray(int[] arr,int target) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[low]<=arr[mid]) {
				if(arr[low]<=target && target<=arr[mid]) 
					high=mid-1;
				else
					low=mid+1;
			}
			else {
				if(arr[mid]<=target && target<=arr[high]) 
					low=mid+1;
				else
					high=mid-1;
			}
		}
		return -1;
	}
}
