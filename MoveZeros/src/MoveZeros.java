import java.util.*;
public class MoveZeros {
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		//int[] arr={5,4,-1,7,8};
		int n=arr.length;
		int[] result=moveZores(arr,n);
		System.out.println(Arrays.toString(result));
	}
	
	/*public static int[] moveZores(int[] arr,int n){
	    //ArrayList<Integer> list=new ArrayList<>();
	    int[] ans=new int[n];
	    int ind=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]!=0){
	            ans[ind++]=arr[i];
	        }
	    }
	    return ans;
	}*/
	
	public static int[] moveZores(int[] arr,int n){
	    int j=0;
	   for(int i=0;i<n;i++){
	       if(arr[i]!=0){
	           int temp=arr[i];
	           arr[i]=arr[j];
	           arr[j++]=temp;
	       }
	   }
	   return arr;
	}

}
