import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		int[] arr={2,6,5,8,11};
		int target=14;
		String result=twoSum(arr,target);
		System.out.println("Sum Of Two Numbers::"+result);
	}
	//1.Brute Level
		/*public static int[] twoSum(int[] arr,int target){
		    for(int i=0;i<arr.length;i++){
		        for(int j=i+1;j<arr.length;j++){
		            if(arr[i]+arr[j]==target){
		                return new int[]{i,j};
		            }
		        }
		    }
		    return new int[]{};
		}*/
		
		/*public static int[] twoSum(int[] arr,int target){
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<arr.length;i++){
		        map.put(arr[i],i);
		    }
		    for(Map.Entry<Integer,Integer> num:map.entrySet()){
		        int key=num.getKey();
		        int rev=target-key;
		        if(map.containsKey(rev))
		            return new int[]{num.getValue(), map.get(rev)};
		    }
		    return new int[]{};
		}*/
		
		//2.Better Level
		/*public static int[] twoSum(int[] arr,int target){
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<arr.length;i++){
		        int rev=target-arr[i];
		        if(map.containsKey(rev)){
		            return new int[]{map.get(rev),i};
		        }
		        map.put(arr[i],i);
		    }
		    return new int[]{};
		}*/
		
		//3.Optimal
		public static String twoSum(int[] arr,int target){
		    int i=0,j=arr.length-1;
		    Arrays.sort(arr);
		    while(i<arr.length && j>=0){
		        int sum=arr[i]+arr[j];
		        if(sum==target)
		            return "Yes";
		        else if(sum<target)
		            i++;
		        else
		            j--;
		    }
		    return "No";
		}
}
