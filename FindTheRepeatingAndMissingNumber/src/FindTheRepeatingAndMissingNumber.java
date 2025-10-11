import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheRepeatingAndMissingNumber {
	public static void main(String[] args) {
		int[] arr={4,3,6,2,1,1};
		int n=6;
		int[] res=search(arr,n);
		System.out.println(Arrays.toString(res));
	}
	
	//Using array
	/*public static int[] search(int[] arr,int n){
	    int[] newArr=new int[n];
	    int[] hash=new int[n+1];
	    for(int i=1;i<=n;i++){
	        newArr[i-1]=i;
	    }
	    for(int i=0;i<n;i++){
	        hash[arr[i]]++;
	        //hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
	    }
	    int[] ans=new int[2];
	    int ind=0;
	    for(int i=1;i<=n;i++){
	        if(hash[i]==2)
	            ans[ind++]=i;
	        if(hash[i]==0)
	            ans[ind++]=i;
	    }
	    return ans;
	}*/
	
	//Using HashMap
	public static int[] search(int[] arr,int n){
	    int[] newArr=new int[n];
	    Map<Integer,Integer> map=new HashMap<>();
	    for(int i=1;i<=n;i++){
	        newArr[i-1]=i;
	    }
	    for(int i=0;i<n;i++){
	        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
	    }
	    int[] ans=new int[2];
	    int ind=0;
	    for(int i=1;i<=n;i++){
	        int freq = map.getOrDefault(i, 0);
	        if(freq==2)
	            ans[ind++]=i;
	        if(freq==0)
	            ans[ind++]=i;
	    }
	    return ans;
	}
}
