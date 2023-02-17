import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> number = new ArrayList<>();
		
		int N = scan.nextInt();
		
		for( int i = 0; i< N; i++ ) {
			int K = scan.nextInt();
			String num = Integer.toBinaryString(K);
			for( int j = num.length()-1; j >= 0; j --) {
				if(num.charAt(j)=='1') {
					System.out.print(num.length()-j-1+" ");
				}
			}
		}

	}
}