import java.util.*;
public class SortZerosOnesTwos {
	public static void main(String[] args) {
		int[] arr={0,1,2,0,1,2,1,2,0,0,0,1};
		int n=arr.length;
		int[] result=sortingArray(arr,n);
		System.out.println("Sum Of Two Numbers::"+Arrays.toString(result));
	}
	//1.Brute Level
		/*public static int[] sortingArray(int[] arr,int n){
		    for(int i=0;i<n;i++){
		        for(int j=i;j<n;j++){
		            if(arr[i]>arr[j]){
		                int temp=arr[i];
		                arr[i]=arr[j];
		                arr[j]=temp;
		            }
		        }
		    }
		    return arr;
		}*/
		
		//2.Better Level
		/*public static int[] sortingArray(int[] arr,int n){
		    int c0=0,c1=0,c2=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==0)
		            c0++;
		        else if(arr[i]==1)
		            c1++;
		        else
		            c2++;
		    }
		    for(int i=0;i<n;i++){
		        if(i<c0)
		            arr[i]=0;
		        else if(i<c1+c0)
		            arr[i]=1;
		        else
		            arr[i]=2;
		    }
		    return arr;
		}*/
		
		//3.Optimal Level
		public static int[] sortingArray(int[] arr,int n){
		    int low=0,mid=0,high=n-1;
		    while(mid<=high){
		        if(arr[mid]==0){
		            int temp=arr[low];
		            arr[low]=arr[mid];
		            arr[mid]=temp;
		            low++;
		            mid++;
		        }
		        else if(arr[mid]==1) mid++;
		        else if(arr[mid]==2){
		            int temp=arr[high];
		            arr[high]=arr[mid];
		            arr[mid]=temp;
		            high--;
		        }
		    }
		    return arr;
		}

}
