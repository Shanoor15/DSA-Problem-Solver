import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr={1,2,2};
		int n=arr.length;
		int[] result=removeDuplicates(arr,n);
		System.out.println(Arrays.toString(result));
	}
	/*public static int[] removeDuplicates(int[] arr,int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i!=j){
	            if(arr[i]==arr[j]){
	                arr[j]=0;
	            }
	        }
	       }
	    }
	    return arr;
	}*/
	
	/*public static int[] removeDuplicates(int[] arr,int n){
	    HashSet<Integer> set=new HashSet<>();
	    for(int i=0;i<n;i++){
	        set.add(arr[i]);
	    }
	    int ind=0;
	    int[] result=new int[set.size()];
	    for(int num:set){
	        result[ind++]=num;
	    }
	    return result;
	}*/
	
	/*public static int[] removeDuplicates(int[] arr,int n){
	    HashSet<Integer> set=new HashSet<>();
	    int[] result=new int[set.size()];
	    int ind=0;
	    for(int i=0;i<n;i++){
	        if(set.contains(arr[i])){
	            result[ind++]=arr[i];
	        }
	        set.add(arr[i]);
	    }
	    return result;
	}*/
	
	public static int[] removeDuplicates(int[] arr,int n){
	    int i=0,j=1;
	    while(i<n && j<n){
	        if(arr[i]!=arr[j]){
	            arr[i+1]=arr[j];
	            i++;
	            j++;
	        }else{
	            j++;
	        }
	    }
	    return Arrays.copyOf(arr,i+1);
	}

}
