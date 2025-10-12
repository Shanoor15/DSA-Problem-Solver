
public class SingleNumber {
	public static void main(String[] args) {
		int[] arr={4,1,2,1,2};
		//int[] arr={2,2,1};
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
	            if(sum==2) break;
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
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }

}
