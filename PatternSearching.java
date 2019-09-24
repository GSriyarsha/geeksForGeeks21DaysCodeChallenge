import java.util.Scanner;


public class PatternSearching {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T != 0){
			String input = scan.next();
			String pattern = scan.next();
			int len = input.length();
			int lenSub = pattern.length();
			int flag = 0;
			for (int i = 0; i <= len - lenSub; i ++){
				if (input.substring(i, i + lenSub).equals(pattern)){
					flag = 1;
					System.out.println("found");
					break;
				}
			}
			if (flag != 1){
			    System.out.println("not found");	
			}
			
			T --;
		}
	    scan.close();
	}

}
