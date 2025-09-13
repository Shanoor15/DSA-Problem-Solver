import java.util.*;

public class PascalTrianglePickOneElement {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 1 }, 
				{ 1, 1 }, 
				{ 1, 2, 1 }, 
				{ 1, 3, 3, 1 }, 
				{ 1, 4, 6, 4, 1 }, 
				{ 1, 5, 10, 10, 5, 1 },
				{ 1, 6, 15, 20, 15, 6, 1 } 
				};
		int r = 7, ele = 5;
		long result = funNCR(arr, r - 1, ele - 1);
		System.out.println(result);
	}

	public static long funNCR(int[][] arr, int r, int ele) {
		long res = 1;
		for (int i = 0; i < ele; i++) {
			res = res * (r - i);
			res = res / (i + 1);
		}
		return res;
	}

}
