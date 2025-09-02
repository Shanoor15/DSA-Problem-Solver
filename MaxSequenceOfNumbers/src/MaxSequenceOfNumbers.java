import java.util.*;
public class MaxSequenceOfNumbers {
	public static void main(String[] args) {
	    int[] arr={102,4,100,1,101,3,2,1,1};
	    int n=arr.length;
	    int res=maxSequenceOfNumbers(arr,n);
	    System.out.println(res);
	}
	//1.Brute Level
	/*public static int maxSequenceOfNumbers(int[] arr,int n){
	    int max=0;
	    for(int i=0;i<n;i++){
	        int ele=arr[i];
	        int count=1;
	        while(contains(arr,ele+1)){
	            ele=ele+1;
	            count+=1;
	        }
	        max=Math.max(max,count);
	    }
	    return max;
	}
	public static boolean contains(int[] arr,int target){
	    for(int num:arr){
	        if(num==target)
	            return true;
	    }
	    return false;
	}*/
	
	//2.Better level
	/*public static int maxSequenceOfNumbers(int[] arr,int n){
	    Arrays.sort(arr);
	    int count=1,max=0;
	    for(int i=1;i<n;i++){
	        if(arr[i]==arr[i-1]){
	            continue;
	        }
	        else if(arr[i]==arr[i-1]+1){
	            count++;
	        }
	        else{
	            count=1;
	        }
	        max=Math.max(max,count);
	    }
	    return max;
	}*/
	
	//3.Optimal level
	public static int maxSequenceOfNumbers(int[] arr,int n){
	    HashSet<Integer> set=new HashSet<>();
	    if(n==0) return 0;
	    for(int i=0;i<n;i++){
	        set.add(arr[i]);
	    }
	    int max=1;
	    for(int num:set){
	        if(!set.contains(num-1)){
	            int current=num;
	            int count=1;
	            while(set.contains(current+1)){
	                count++;
	                current++;
	            }
	            max=Math.max(max,count);
	        }
	    }
	    return max;
	}

}
