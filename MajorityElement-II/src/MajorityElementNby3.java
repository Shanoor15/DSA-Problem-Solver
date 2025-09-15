import java.util.*;
public class MajorityElementNby3 {
	public static void main(String[] args) {
		//int[] arr={-1,-1,-1};
		int[] arr = {1,1,1,3,3,2,2,2};
		int n=arr.length;
		 List<Integer> result=majorityElement(arr,n);
		System.out.println(result);
	}
	//1.Brute Level
	/*public static List<Integer> majorityElement(int[] arr,int n){
	    List<Integer> ans=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        int cnt=0;
	        for(int j=i;j<n;j++){
	            if(arr[i]==arr[j]){
	                cnt++;
	            }
	        }
	        if(cnt>n/3 && !ans.contains(arr[i])){
	                ans.add(arr[i]);
	            }
	        if(ans.size()==2) break;
	    }
	    return ans;
	}*/
	
	//Better Level TC--->O(2N) & SC--->O(N)
	/*public static int[] majorityElement(int[] arr,int n){
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int[] ans=new int[n/3];
	    for(int i=0;i<n;i++){
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	    }
	    int ind=0;
	    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	        if(entry.getValue()>n/3){
	            ans[ind++]=entry.getKey();
	        }
	    }
	    return ans;
	}*/
	
	//Better Level TC--->O(N) & SC--->O(N)
	/*public static List<Integer> majorityElement(int[] arr,int n){
	    HashMap<Integer,Integer> map=new HashMap<>();
	    List<Integer> ans=new ArrayList<>();
	    int min=(n/3)+1;
	    for(int i=0;i<n;i++){
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1); //TC-->log(N)
	        if(map.get(arr[i])==min){
	            ans.add(arr[i]);
	        }
	        if(ans.size()==2) break;
	    }
	    return ans;
	}*/
	
	//Optimal Level TC--->O(2N) & SC--->O(1)
	public static List<Integer> majorityElement(int[] arr,int n){
	    List<Integer> ans=new ArrayList<>();
	    int cnt1=0,cnt2=0;
	    int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
	    int ind=0,cnt=0;
	    // 1st pass - find potential candidates
	    for(int i=0;i<n;i++){  //TC--->O(N)
	        if(cnt1==0 && arr[i]!=ele2){
	            cnt1=1;
	            ele1=arr[i];
	        }
	        else if(cnt2==0 && arr[i]!=ele1){
	            cnt2=1;
	            ele2=arr[i];
	        }else if(ele1==arr[i]){
	            cnt1++;
	        }else if(ele2==arr[i]){
	            cnt2++;
	        }else{
	            cnt1--;
	            cnt2--;
	        }
	      }
	      // Reset counts for validation
          cnt1 = 0;
          cnt2 = 0;
          // 2nd pass - validate candidates
	      for(int i=0;i<n;i++){  //TC---->O(N)
	          if(ele1==arr[i]) cnt1++;
	          if(ele2==arr[i]) cnt2++;
	      }
	      int min=(n/3)+1;
	      if(cnt1>=min) ans.add(ele1);
	      if(cnt2>=min) ans.add(ele2);
	      return ans;
	    }

}
