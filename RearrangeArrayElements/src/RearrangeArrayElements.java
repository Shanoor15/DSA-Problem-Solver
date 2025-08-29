import java.util.*;
public class RearrangeArrayElements {
	public static void main(String[] args) {
		int[] arr={3,1,-2,-5,2,-4,};
		int n=arr.length;
		int[] result=arrangArray(arr,n);
		System.out.println(Arrays.toString(result));
	}
	//1.Brute Level
	/*public static int[] arrangArray(int[] arr,int n){
	    //ArrayList<Integer> list=new ArrayList<>();
	    List<Integer> ne = new ArrayList<>();
	    List<Integer> po = new ArrayList<>();
	    for(int i=0;i<n;i++){
	        if(arr[i]>=0){
	            po.add(arr[i]);
	        }
	        else{
	            ne.add(arr[i]);
	        }
	    }
	//	    int p=0,ng=0,i=0;
	//	    while(p<po.size() && ng<ne.size()){
	//	        arr[i++]=po.get(p++);
	//	        arr[i++]=ne.get(ng++);
	//	    }
	    int p=0;
	    for(int i=0;i<n/2;i++){
	        arr[2*i]=po.get(i);
	        arr[2*i+1]=ne.get(i);
	    }
	    return arr;
	}*/
	
	//2.Optimal Level
	public static int[] arrangArray(int[] arr,int n){
		int[] ans=new int[n];
		int po=0,neg=1;
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				if(po<n) {
					ans[po]=arr[i];
					po+=2;
				}
			}else {
				if(neg<n) {
					ans[neg]=arr[i];
					neg+=2;
				}
			}
		}
		return ans;
	}

}
