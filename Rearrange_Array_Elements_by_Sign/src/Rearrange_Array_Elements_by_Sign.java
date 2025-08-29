/*Input:arr = [1,2,-4,-5,3,6]

Output:[1,-4,2,-5,3,6]*/

import java.util.*;
public class Rearrange_Array_Elements_by_Sign {
	public static void main(String[] args) {
		int[] arr={1,2,-4,-5,3,6};
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
	    while(p<po.size() && ng<ne.size()){
	        arr[i++]=po.get(p++);
	        arr[i++]=ne.get(ng++);
	    }
	    while(p<po.size()){
	        arr[i++]=po.get(p++);
	    }
	    while(ng<ne.size()){
	        arr[i++]=ne.get(ng++);
	    }
	    return arr;
	}*/
	
	//2.Optimal Level
	public static int[] rearangElements(int[] arr,int n){
	    int[] ans=new int[n];
	    int po=0,ng=1;
	    for(int i=0;i<n;i++){
	        if(arr[i]>=0){
	            if(po<ans.length){
	                ans[po]=arr[i];
	                po+=2;
	            }else{
	                ans[ng]=arr[i];
	                ng+=2;
	            }
	         }else{
	             if(ng<ans.length){
	                 ans[ng]=arr[i];
	                 ng+=2;
	             }else{
	                 ans[po]=arr[i];
	                 po+=2;
	             }
	         }
	    }
	    return ans;
	}

}
