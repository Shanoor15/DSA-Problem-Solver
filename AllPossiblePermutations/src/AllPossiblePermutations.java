import java.util.*;
public class AllPossiblePermutations {
	public static void main(String[] args) {
	    int[] arr={1,2,3};
	    int n=arr.length;
	    List<List<Integer>> ans=new ArrayList<>();
	    List<Integer> ds=new ArrayList<>();
	    boolean[] freq=new boolean[n];
	    totalPermutations(arr,ans,ds,freq);
	    for(List<Integer> perm:ans){
	        System.out.println(perm);
	    }
	}
	public static void totalPermutations(int[] arr,List<List<Integer>> ans,List<Integer> ds,boolean[] freq){
	    int n=arr.length;
	    if(ds.size()==n){
	        ans.add(new ArrayList<>(ds));
	        return;
	    }
	    for(int i=0;i<n;i++){
	        if(!freq[i]){
	            freq[i]=true;
	            ds.add(arr[i]);
	            totalPermutations(arr,ans,ds,freq);
	            ds.remove(ds.size()-1);
	            freq[i]=false;
	        }
	    }
	}

}
