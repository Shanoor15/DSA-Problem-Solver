
public class MajorityElement {
	public static void main(String[] args) {
		int[] arr={2,2,3,3,1,2,2};
		int n=arr.length;
		int result=majorityElement(arr,n);
		System.out.println("Sum Of Two Numbers::"+result);
	}
	//1.Brute Level
		/*public static int majorityElement(int[] arr,int n){
		    for(int i=0;i<n;i++){
		        int count=0;
		        for(int j=0;j<n;j++){
		            if(arr[i]==arr[j])
		                count++;
		        }
		        if(count>n/2)
		            return arr[i];
		    }
		    return -1;
		}*/
		
		//2.Better Level
		/*public static int majorityElement(int[] arr,int n){
		    HashMap<Integer,Integer> map=new HashMap<>();
		    int max=0;
		    for(int i=0;i<n;i++){
		        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		    }
		    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
		        /*int key=entry.getKey();
		        int value=entry.getValue();
		        if(value>max){
		            max=value;
		        }
		        if(value>n/2)
		            return key;*/
		        /*if(entry.getValue()>n/2)
		            return entry.getKey();
		    }
		    return -1;*/
		//}
		
		//3.Optimal Level
		public static int majorityElement(int[] arr,int n){
		    int cnt=0;
		    int ele=-1;
		    // Phase 1: Find a element
		    for(int i=0;i<n;i++){
		        if(cnt==0){
		            ele=arr[i];
		            cnt=1;
		        }
		        if(ele==arr[i]){
		            cnt++;
		        }
		        else{
		            cnt--;
		        }
		    }
		    // Phase 2: Verify if element is actually majority
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==ele) count++;
		    }
		    return (count>n/2?ele:-1);
		}

}
