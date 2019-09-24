import java.util.HashMap;
import java.util.Scanner;


public class SumPairs {
	
	public static int countPairs(int[] input, int K){
		int c = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
        int size = input.length;
        for (int i = 0; i < size; i ++){
            int temp = K - input[i];
            if(hashMap.containsKey(temp)){
                c += hashMap.get(temp);
            }
            if(!hashMap.containsKey(input[i])){
                hashMap.put(input[i], 1 );
            }else{
               hashMap.put(input[i],  hashMap.get(input[i])+1); 
            }
        }
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T != 0){
		    int N = scan.nextInt();
		    int K = scan.nextInt();
		    int[] input = new int[N];
		    for (int i = 0; i < N ; i ++){
		    	input[i] = scan.nextInt();
		    }
		    int count = countPairs(input, K);
		    System.out.println(count);
		    T --;
		}
		scan.close();

	}

}
