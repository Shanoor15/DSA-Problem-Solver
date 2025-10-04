import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
		int[] arr={-1,0,1,2,-1,-4};
		List<List<Integer>> res=threeSum(arr);
		for(List<Integer> num:res){
		    System.out.println(num);
		}
	}
	//1.Brute Level
	/*public static List<List<Integer>> threeSum(int[] arr){
	    Set<List<Integer>> set=new HashSet<>();
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            for(int k=j+1;k<n;k++){
	                if(arr[i]+arr[j]+arr[k]==0){
	                    List<Integer> ans =Arrays.asList(arr[i],arr[j],arr[k]);
	                    Collections.sort(ans); // sort so that [-1,0,1] and [0,-1,1] look the same
	                        set.add(ans);  // actually store it in set
	                }
	            }
	        }
	    }
	    return new ArrayList<>(set); // convert Set to List before returning
	}*/
	
	//2.Better Level
		public static List<List<Integer>> threeSum(int[] arr){
	    Set<List<Integer>> set=new HashSet<>();
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        Set<Integer> setEle=new HashSet<>();
	        for(int j=i+1;j<n;j++){
	            int k=-(arr[i]+arr[j]);
	            if(setEle.contains(k)){
	                List<Integer> ans=Arrays.asList(arr[i],arr[j],k);
	                Collections.sort(ans);
	                set.add(ans);
	            }
	                setEle.add(arr[j]);
	        }
	    }
	    return new ArrayList<>(set);
	}
	
	//3.Optimal Level
	/*public static List<List<Integer>> threeSum(int[] arr){
	    List<List<Integer>> list=new ArrayList<>();
	    int n=arr.length;
	    Arrays.sort(arr);
	    for(int i=0;i<n;i++){
	        if(i>0 && arr[i]==arr[i-1]) continue;
	        int j=i+1,k=n-1;
	        while(j<k){
	            int sum=arr[i]+arr[j]+arr[k];
	            if(sum<0){
	                j++;
	            }
	            else if(sum>0){
	                k--;
	            }
	            else{
	                List<Integer> ans=Arrays.asList(arr[i],arr[j],arr[k]);
	                list.add(ans);
	                j++;
	                k--;
	                while(j<k && arr[j]==arr[j-1]) j++;
	                while(j<k && arr[k]==arr[k+1]) k--;
	            }
	        }
	    }
	    return list;
	}*/

}
