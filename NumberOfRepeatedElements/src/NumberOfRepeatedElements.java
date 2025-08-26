import java.util.*;
public class NumberOfRepeatedElements {
	public static void main(String[] args) {
		int[] arr={2,2,3,3,1,2,2};
		int n=arr.length;
		HashMap<Integer,Integer> result=numberOfRepeatedEle(arr,n);
		System.out.println("Sum Of Two Numbers::"+result);
	}
	//1.Brute Level
		/*public static HashMap<Integer,Integer> numberOfRepeatedEle(int[] arr,int n){
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        if(map.containsKey(arr[i])) continue;
		        int cnt=0;
		        for(int j=i;j<n;j++){
		            if(arr[i]==arr[j]){
		                cnt++;
		            }
		        }
		        map.put(arr[i],cnt);
		    }
		    return map;
		}*/
		
		//2.Better Level
		public static HashMap<Integer,Integer> numberOfRepeatedEle(int[] arr,int n){
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		    }
		    return map;
		}

}
