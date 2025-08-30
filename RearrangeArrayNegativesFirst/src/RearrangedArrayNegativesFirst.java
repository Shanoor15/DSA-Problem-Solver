import java.util.*;
public class RearrangedArrayNegativesFirst {
	public static void main(String[] args) {
		//int[] arr={-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6};
		int n=arr.length;
		int[] result=rearangElements(arr,n);
		System.out.println(Arrays.toString(result));
	}
	//1.Brute Level
	/*public static int[] rearangElements(int[] arr,int n){
	    ArrayList<Integer> po=new ArrayList<>();
	    ArrayList<Integer> ne=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        if(arr[i]>=0){
	            po.add(arr[i]);
	        }else{
	            ne.add(arr[i]);
	        }
	    }
	    int p=0,ng=0,i=0;
	    while(ng<ne.size()){
	                arr[i++]=ne.get(ng++);
	    }
	    while(p<po.size()){
	        arr[i++]=po.get(p++);
	    }
	    return arr;
	}*/
	
	//2.Better Level
	/*public static int[] rearangElements(int[] arr,int n){
	    int[] ans=new int[n];
	    int p=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]<0)
	            ans[p++]=arr[i];
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]>=0)
	            ans[p++]=arr[i];
	    }
	    return ans;
	}*/
	
	//3.Optimal Level
	public static int[] rearangElements(int[] arr,int n){
	    int p1=0,p2=arr.length-1;
	    while(p1<p2){
	        if(arr[p1]<0 && arr[p2]<0){
	            p1++;
	        }
	        else{
	            int temp=arr[p1];
	            arr[p1]=arr[p2];
	            arr[p2]=temp;
	            p1++;
	            p2--;
	        }
	    }
	    return arr;
	}

}
