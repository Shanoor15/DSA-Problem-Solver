import java.util.HashMap;
import java.util.Map;

public class SingleNumber_II {
	public static void main(String[] args) {
		//int[] arr={2,2,3,2};
		int[] arr={0,1,0,1,0,1,99};
		int res=singleNumber(arr);
		System.out.println(res);
	}
	//1.Brute Level
	/*public static int singleNumber(int[] arr){
	    for(int i=0;i<arr.length;i++){
	        int sum=0;
	        for(int j=0;j<arr.length;j++){
	            if(arr[i]==arr[j]){
	                sum++;
	            }
	        }
	        if(sum==1){
	                return arr[i];
	            }
	}
	return -1;
}*/

    //2.Better Level
	/*public static int singleNumber(int[] arr){
	Map<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++){
	    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	}
	 // Step 2: Find the number with frequency 1
	for (int num : map.keySet()) {//num = 4
	if (map.get(num) == 1) {//4=1
	    return num;
	    }
	}
	return -1;
	}*/
	
	//3.Optimal Level
	public static int singleNumber(int[] arr){
		int one=0,two=0;
		for(int num:arr) {
			one=(one^num)&~two;
			two=(two^num)&~one;
		}
		return one;
	}
}
