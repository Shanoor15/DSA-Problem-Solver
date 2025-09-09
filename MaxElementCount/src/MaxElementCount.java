import java.util.*;
public class MaxElementCount {
	public static void main(String[] args) {
		int[] arr={1,2,3,1,3,2,1};
		int number=1;
		int result=maxElementCount(arr,number);
		System.out.println(result);
	}
	//Brute Level
	/*public static int maxElementCount(int[] arr,int number){
	    int cnt=0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==number)
	            cnt++;
	    }
	    return cnt;
	}*/
	
	public static int maxElementCount(int[] arr,int number){
	    int[] hash=new int[12];
	    for(int i=0;i<arr.length;i++){
	        hash[arr[i]]+=1;
	    }
	    return hash[number];
	}

}
