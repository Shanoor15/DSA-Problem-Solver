import java.util.*;
public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		int n=arr.length;
		boolean result=containsDuplicate(arr,n);
		System.out.println(result);
	}
	//1.Brute Level
	/*public static boolean containsDuplicate(int[] arr,int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i!=j){
	                if(arr[i]==arr[j]){
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	}*/
	
	//2.Better Level
	/*public static boolean containsDuplicate(int[] arr,int n){
	    HashSet<Integer> set=new HashSet<>();
	    for(int i=0;i<n;i++){
	        if(set.contains(arr[i])){
	            return true;
	        }
	        set.add(arr[i]);
	    }
	    return false;
	}*/
	
	//3.Optimal Level
	public static boolean containsDuplicate(int[] arr,int n){
	    Arrays.sort(arr);
	    for(int i=1;i<n;i++){
	        if(arr[i]==arr[i-1])
	            return true;
	    }
	    return false;
	}

}
