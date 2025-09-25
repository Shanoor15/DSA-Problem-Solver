import java.util.*;
public class SearchInsertPosition{
	public static void main(String[] args) {
		int[] arr= {1,3,5,6};
		int target=5;
		//int target=2;
		int res=searchInsert(arr,target);
		System.out.println(res);
	}
	//1.Better Level    TC==>O(n)
	/*public static int searchInsert(int[] arr,int target) {
		int ind=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>target) {
				ind=i;
				break;
			}
			else if(target==arr[i]) {
				ind=i;
				break;
			}else{
				ind=i+1;
			}
		}
		return ind;
	}*/
	//Optimal Level  Tc==>O(logN)
	public static int searchInsert(int[] arr,int target) {
		int left=0,right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				left=mid+1;
			else
				right=mid-1;
		}
		return left;
	}
}
