package findNumberAppearsOnces;

import java.util.HashMap;
import java.util.Map;

public class FindingNumberAppearsOnces {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,4,4};
		int result=findNumberAppearsOnces(arr);
	    System.out.println(result);
	}
	//Brute Level
	/*public static int findNumberAppearsOnces(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
				else {
					if(count==2) {
						break;
					}
				}
			}
			if(count!=2) {
				return arr[i];
			}
		}
		return -1;
	}*/
//Better Level
	/*public static int findNumberAppearsOnces(int[] arr) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer,Integer> ele:map.entrySet()) {
			if(ele.getValue()!=2)
				return ele.getKey();
		}
		return -1;
	}*/
	
	//Optimal Level
	public static int findNumberAppearsOnces(int[] arr) {
		int result=0;
		for(int num:arr) {
			result^=num;
		}
		return result;
	}
}
