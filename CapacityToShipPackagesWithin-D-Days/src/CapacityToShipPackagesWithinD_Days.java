import java.util.Arrays;

public class CapacityToShipPackagesWithinD_Days {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int days=5;
		int res=shipWithinDays(arr,days);
		System.out.println(res);
	}
	public static int shipWithinDays(int[] arr, int days) {
        int max=Arrays.stream(arr).max().getAsInt();
        int total=Arrays.stream(arr).sum();
        int l=0,n=arr.length;
        for(int cap=max;cap<=total;cap++){
            int daysReq=fun(cap,arr);
            if(daysReq<=days)
                return cap;
        }
        return -1;
    }
    public static int fun(int cap,int[] arr){
        int day=1,load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>cap){
                day++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return day;
    }

}
