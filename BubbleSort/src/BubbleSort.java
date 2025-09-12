import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr={4,1,5,2,3};
		int n=arr.length;
		int[] result=bubbleSort(arr,n);
		System.out.println(Arrays.toString(result));
	}
	public static int[] bubbleSort(int[] arr,int n){
	    boolean isSwap=false;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-i-1;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                isSwap=true;
	            }
	        }
	        if(!isSwap)//array is already sorted
	            return arr;
	    }
	    return arr;
	}

}
