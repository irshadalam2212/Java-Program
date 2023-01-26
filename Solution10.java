import java.util.Scanner;
public class Solution10 {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 1; i <= N; i++){
			for (int j = i; j >= 1; j--){
				System.out.print(j);
			}
			System.out.println();
		}

		
	}

}