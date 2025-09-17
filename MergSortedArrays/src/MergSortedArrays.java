import java.util.*;
public class MergSortedArrays {
	public static void main(String[] args) {
		/*int[] arr1={1,2,3,0,0,0};
		int[] arr2={2,5,6};
		int n=3,m=3;*/
		int[] arr1={0};
		int[] arr2={1};
		int n=0,m=1;
		int[] result=mergSortArrays(arr1,arr2,n,m);
		System.out.println(Arrays.toString(result));
	}
	//1.Brute Level
	/*public static int[] mergSortArrays(int[] arr1,int[] arr2,int m,int n){
	    int[] ans=new int[m+n];
	    int l=0,r=0,ind=0;
	    while(l<n && r<m){
	        if(arr1[l]<=arr2[r]){
	            ans[ind++]=arr1[l++];
	        }else{
	            ans[ind++]=arr2[r++];
	        }
	    }
	    while(r<m){
	        ans[ind++]=arr2[r++];
	    }
	    while(l<n){
	        ans[ind++]=arr1[l++];
	    }
	    return ans;
	}*/
	
	public static int[] mergSortArrays(int[] arr1,int[] arr2,int m,int n){
        int left=m-1,right=n-1,k=m+n-1;
        while(left>=0 && right>=0){
            if(arr1[left]>arr2[right]){
                arr1[k--]=arr1[left--];
            }else{
                arr1[k--]=arr2[right--];
            }
        }
        while(right>=0){
            arr1[k--]=arr2[right--];
        }
	    return arr1;
	}

}
