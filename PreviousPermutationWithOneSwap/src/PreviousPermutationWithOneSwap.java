import java.util.*;
public class PreviousPermutationWithOneSwap {
	public static void main(String[] args) {
		//int[] arr={3,2,1};
		int arr[] = {1,9,4,6,7};
		//int[] arr={3,1,1,3};
		int n=arr.length;
		int[] result=previousPermitation(arr,n);
		System.out.println(Arrays.toString(result));
	}
	public static int[] previousPermitation(int[] arr,int n){
	    int ind=-1;
	    for(int i=n-2;i>=0;i--){
	        if(arr[i]>arr[i+1]){
	            ind=i;
	            break;
	        }
	    }
	    if(ind==-1){
	        return arr;
	    }
	    
	    int ind1=-1;
	    for(int i=n-1;i>ind;i--){
	        if(arr[i]<arr[ind]){
	            ind1=i;
	            while(i-1>ind && arr[i]==arr[i-1]){
	                i--;
	                ind1=i;
	            }
	            break;
	        }
	    }
	    int temp=arr[ind];
	    arr[ind]=arr[ind1];
	    arr[ind1]=temp;
	    return arr;
	}

}
