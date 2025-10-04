import java.util.*;
public class FourSum {
	public static void main(String[] args) {
		/*int[] arr={1,0,-1,0,-2,2};
		int target=0;*/
		int[] arr= {2,2,2,2,2};
		int target=8;
		List<List<Integer>> res=fourSum(arr,target);
		for(List<Integer> list:res){
		    System.out.println(list);
		}
	}
	//1.Brute Level
	/*public static List<List<Integer>> fourSum(int[] arr,int target){
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
	}*/

	//2.Better Level
	/*public static List<List<Integer>> fourSum(int[] arr,int target){
	Set<List<Integer>> set=new HashSet<>();
	int n=arr.length;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			Set<Integer> newSet=new HashSet<>();
			for(int k=j+1;k<n;k++) {
				int l=target-(arr[i]+arr[j]+arr[k]);
				if(newSet.contains(l)) {
					List<Integer> ans=Arrays.asList(arr[i],arr[j],arr[k],l);
					Collections.sort(ans);
					set.add(ans);
				}
					newSet.add(arr[k]);
			}
		}
	}
	return new ArrayList<>(set);
	}*/
	
	//3.Optimal Level
	public static List<List<Integer>> fourSum(int[] arr,int target){
		List<List<Integer>> list=new ArrayList<>();
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0; i<n-3;i++) {
			if(i>0 && arr[i]==arr[i-1]) continue;
			for(int j=i+1;j<n-2;j++) {
				if(j>i+1 && arr[j]==arr[j-1]) continue;
				int k=j+1,l=n-1;
				while(k<l) {
					long sum=(long)arr[i]+arr[j]+arr[k]+arr[l];
					if(target==sum) {
						List<Integer> ans=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
						list.add(ans);
						k++;
						l--;
						while(k<l && arr[k]==arr[k-1]) k++;
						while(k<l && arr[l]==arr[l+1]) l--;
					}
					if(sum<target) {
						k++;
					}else{
						l--;
					}
				}
			}
		}
		return list;
	}
}
