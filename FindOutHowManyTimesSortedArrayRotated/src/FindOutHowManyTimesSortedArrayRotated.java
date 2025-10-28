
public class FindOutHowManyTimesSortedArrayRotated {
	public static void main(String[] args) {
		int[] arr= {3,4,5,1,2};
		//int[] arr= {1,2,3,4,5};
		int res=timesRotated(arr);
		System.out.println("Program started"); 
		System.out.println(res);
	}
	/*public static int timesRotated(int[] arr) {
	int ind=0;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			ind=i;
			min=arr[i];
		}
	}
	return ind;
	}*/
	
		public static int timesRotated(int[] arr) {
		int low=0,high=arr.length-1;
		int min=Integer.MAX_VALUE;
		int ind=0;
		if(arr[low]<=arr[high])
			return ind;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[low]<=arr[mid]) {
				if(arr[low]<min) {
					ind=low;
					min=arr[low];
					low=mid+1;
				}
			}else {
				if(arr[mid]<min) {
					ind=mid;
					min=arr[mid];
					high=mid-1;
				}
			}
		}
		return ind;
	}	
}
