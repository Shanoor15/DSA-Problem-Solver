import java.util.*;
public class FourSum {
	public static void main(String[] args) {
		int[] arr={1,0,-1,0,-2,2};
		int target=0;
		List<List<Integer>> res=fourSum(arr,target);
		for(List<Integer> list:res){
		    System.out.println(list);
		}
	}
	//1.Brute Level
	public static List<List<Integer>> fourSum(int[] arr,int target){
	    Set<List<Integer>> set=new HashSet<>();
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            for(int k=j+1;k<n;k++){
	                for(int l=k+1;l<n;l++){
	                    if(arr[i]+arr[j]+arr[k]+arr[l]==target){
	                        List<Integer> ans=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
	                        Collections.sort(ans);// sort so that [-1, 0, 0, 1] and [0,-1,1,0] look the same
	                        set.add(ans);// actually store it in set
	                    }
	                }
	            }
	        }
	    }
	    return new ArrayList<>(set);// convert Set to List before returning
	}

}
