import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumGap {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T != 0){
		    int N = scan.nextInt();
		    int[] arr = new int[N];
		    for (int i = 0; i < N; i ++){
		        arr[i] = scan.nextInt();
		    }
		    Arrays.sort(arr);
		    int maxDiff = 0;
		    int diff  = 0;
		    for (int i = 1; i < N; i ++){
		        diff = arr[i] - arr[i - 1];
		        if (maxDiff < diff){
		            maxDiff = diff;
		        }
		    }
		    System.out.println(maxDiff);
		    T --;
		}
	}
}
