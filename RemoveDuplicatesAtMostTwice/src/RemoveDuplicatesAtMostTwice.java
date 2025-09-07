import java.util.*;
public class RemoveDuplicatesAtMostTwice {
	public static void main(String[] args) {
		int[] arr={1,1,1,2,2,3};
		int n=arr.length;
		int result=removeElement(arr,n);
		System.out.println(result);
	}
	
	public static int removeElement(int[] arr,int n){
	    int i=0;
	    for(int num:arr){
	        if(i<2 || num!=arr[i-2]){
	            arr[i++]=num;
	        }
	    }
	    return i;
	}

}
