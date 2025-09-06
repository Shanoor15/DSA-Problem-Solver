import java.util.*;
public class FindNonMinOrMax {
	public static void main(String[] args) {
		int[] arr={1, 6, 33, 34};
		int n=arr.length;
		int result=findNonMinOrMax(arr,n);
		System.out.println(result);
	}
	//1.Brute Level
	/*public static int findNonMinOrMax(int[] arr,int n){
	    Arrays.sort(arr);
	    int min=arr[0];
	    int max=arr[n-1];
	    int mid=-1;
	    for(int num:arr){
	        if(num>min && num<max)
	            mid=num;
	    }
	    return mid;
	}*/
	
	//2.Optimal Level
	public static int findNonMinOrMax(int[] arr,int n){
	    int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
	    for(int num:arr){
	        if(num>max)
	            max=num;
	        if(num<min)
	            min=num;
	    }
	    int mid=-1;
	    for(int num:arr){
	        if(num>min && num<max)
	            mid=num;
	    }
	    return mid;
	}

}
