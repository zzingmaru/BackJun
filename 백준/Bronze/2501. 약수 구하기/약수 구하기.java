import java.util.ArrayList;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			ArrayList<Integer> number = new ArrayList<>();
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			for(int i = 1; i <= N; i++) {
				if( N % i == 0) {
					number.add(i);
				}
			}
			if( K <= number.size()) {
				System.out.println(number.get(K-1));
			}else {
				System.out.println(0);
			}
			
		}
}
