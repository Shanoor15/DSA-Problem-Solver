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
	    List<List<Integer>> list=new ArrayList<>();
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
	
	public static List<List<Integer>> threeSum(int[] arr){
	    Set<List<Integer>> set=new HashSet<>();
	    List<List<Integer>> list=new ArrayList<>();
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        Set<Integer> setEle=new HashSet<>();
	        for(int j=i+1;j<n;j++){
	            int k=-(arr[i]+arr[j]);
	            if(setEle.contains(k)){
	                List<Integer> ans=Arrays.asList(arr[i],arr[j],k);
	                Collections.sort(ans);
	                set.add(ans);
	                setEle.add(arr[j]);
	            }else{
	                setEle.add(arr[j]);
	            }
	        }
	    }
	    return new ArrayList<>(set);
	}

}
