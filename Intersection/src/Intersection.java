import java.util.*;
public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = {4,9,5}, arr2 = {9,4,9,8,4};
		int[] result=intersect(arr1,arr2);
		System.out.println(Arrays.toString(result));
	}
	/*public static int[] intersect(int[] arr1,int[] arr2){
	    int[] ans=new int[arr1.length];
	    int ind=0;
	    for(int i=0;i<arr1.length;i++){
	        for(int j=0;j<arr2.length;j++){
	            if(arr1[i]==arr2[j]){
	                ans[ind++]=arr1[i];
	                break;
	            }
	        }
	    }
	    return Arrays.copyOf(ans,ind);
	}*/
	
	/*public static int[] intersect(int[] arr1,int[] arr2){
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int[] ans=new int[arr2.length];
	    int ind=0;
	    for(int num:arr1){
	        map.put(num,map.getOrDefault(num,0)+1);
	    }
	    for(int num:arr2){
	        if(map.containsKey(num) && map.get(num)>0){
	            ans[ind++]=num;
	            map.put(num,map.get(num)-1);
	        }
	    }
	    return Arrays.copyOf(ans,ind);
	}*/
	
	public static int[] intersect(int[] arr1,int[] arr2){
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    int n1=arr1.length,n2=arr2.length;
	    int[] ans=new int[n1+n2];
	    int i=0,j=0,ind=0;
	    while(i<n1 && j<n2){
	        if(arr1[i]<arr2[j]) i++;
	        else if(arr1[i]>arr2[j]) j++;
	        else{
	            ans[ind++]=arr1[i];
	            i++;
	            j++;
	        }
	    }
	    return Arrays.copyOf(ans,ind);
	}

}
