import java.util.Arrays;

public class FloorAndCeilOfArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int target=25;
		int res=fcArray(arr,target);
		System.out.println(res);
	}
	
	//1.Brute Level
	/*public static int[] fcArray(int[] arr,int target) {
		int flore=0,ceil=0,n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]<=target)
				flore=arr[i];
			if(arr[n-i-1]>=target)
				ceil=arr[n-i-1];
		}
		return new int[] {flore,ceil};
	}*/
	
	public static int fcArray(int[] arr,int target) {
		int low=0,high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<=target) {
				ans=arr[mid];
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return ans;
	}
}
