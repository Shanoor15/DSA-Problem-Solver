
public class RemoveK_Element {
	public static void main(String[] args) {
		int[] arr={0,1,2,2,3,0,4,2};
		//int[] arr={3,2,2,3};
		int k=2;
		int res=removeKelement(arr,k);
		System.out.println(res);
	}
	//1.
	/*public static int removeKelement(int[] arr,int k){
	    ArrayList<Integer> list=new ArrayList<>();
	    for(int num:arr){
	        if(num!=k)
	            list.add(num);
	    }
	    return list.size();
	}*/
	
	//2.Optimal Level
	public static int removeKelement(int[] arr,int k){
	    int left=0,right=0;
	    int n=arr.length;
	    while(left<n && right<n){
	        if(arr[right]!=k){
	            int temp=arr[left];
	            arr[left]=arr[right];
	            arr[right]=temp;
	            left++;
	            right++;
	        }
	        else{
	            right++;
	        }
	    }
	    return left;
	}

}
