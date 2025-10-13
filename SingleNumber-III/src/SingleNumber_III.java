import java.util.Arrays;

public class SingleNumber_III {
	public static void main(String[] args) {
		int[] arr={1,2,1,3,2,5};
		int[] res=singleNumber(arr);
		System.out.println(Arrays.toString(res));
	}
	
	//1.Brute Level
	/*public static int[] singleNumber(int[] arr){
	    int[] ans=new int[2];
        int ind=0;
	    for(int i=0;i<arr.length;i++){
	        int sum=0;
	        for(int j=0;j<arr.length;j++){
	            if(arr[i]==arr[j]){
	                sum++;
	            }
	        }
	        if(sum==1){
	           ans[ind++]=arr[i];
	        }
	    }
	    return ans;
	}*/
	
	//2.Brute Level
	/*public static int[] singleNumber(int[] arr){
	    int[] ans=new int[2];
	    int ind=0;
	    Map<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<arr.length;i++){
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	    }
	    for(int num:map.keySet()){
	        if(map.get(num)==1){
	            ans[ind++]=num;
	        }
	    }
	    return ans;
	}*/
	
	//3.Better Level
		public static int[] singleNumber(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[2];
        int n = arr.length, left = 0, ind = 0;

        while (left < n) {
            if (left < n - 1 && arr[left] == arr[left + 1]) {
                left += 2; // skip both duplicates
            } else {
                ans[ind++] = arr[left];
                left++;
            }
        }
        return ans;
    }

}
