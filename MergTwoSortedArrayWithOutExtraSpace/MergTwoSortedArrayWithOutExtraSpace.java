import java.util.*;
public class MergTwoSortedArrayWithOutExtraSpace {
	public static void main(String[] args) {
		int[] arr1={1,3,5,7};
		int[] arr2={0,2,6,8,9};
	    int[][] result=merg(arr1,arr2);
	    for(int[] list:result){
	        System.out.println(Arrays.toString(list));
	    }
	}
	//1.Brute Level
	/*public static int[][] merg(int[] arr1,int[] arr2){
	    int n=arr1.length,m=arr2.length;
	    int[] ans=new int[n+m];
	    int left=0,right=0,ind=0;
	    while(left<n && right<m){
	        if(arr1[left]<=arr2[right]){
	            ans[ind++]=arr1[left++];
	        }
	        else{
	            ans[ind++]=arr2[right++];
	        }
	    }
	    while(left<n){
	        ans[ind++]=arr1[left++];
	    }
	    while(right<m){
	        ans[ind++]=arr2[right++];
	    }
	    for(int i=0;i<ans.length;i++){
	        if(i<n){
	            arr1[i]=ans[i];
	        }else{
	            arr2[i-n]=ans[i];
	        }
	    }
	    return new int[][]{arr1,arr2};
	}*/
	
	//Optimal Level
	public static int[][] merg(int[] arr1,int[] arr2){
	    int n=arr1.length,m=arr2.length;
	    int left=n-1,right=0;
	    while(left>=0 && right<m){
	        if(arr1[left]<=arr2[right]){
	            break;
	        }else{
	            int temp=arr1[left];
	            arr1[left]=arr2[right];
	            arr2[right]=temp;
	            left--;
	            right++;
	        }
	    }
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    return new int[][]{arr1,arr2};
	}

}
