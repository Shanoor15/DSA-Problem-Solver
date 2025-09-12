import java.util.*;
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr={4,1,5,2,3};
		int n=arr.length;
		int[] result=selectSort(arr,n);
		System.out.println(Arrays.toString(result));
	}
	public static int[] selectSort(int[] arr,int n){
	    boolean isSwap=false;
	    for(int i=0;i<n-1;i++){
	        int small=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[small]){
	                small=j;
	                isSwap=true;
	            }
	       }
	       int temp=arr[i];
	       arr[i]=arr[small];
	       arr[small]=temp;
	    }
	    if(!isSwap) return arr;
	    return arr;
	}

}
