import java.util.Scanner;
public class AlphaPattern {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
        int k = 65;
		for (int i = 1; i <= N; i++){
			for (int j = 1; j <= i; j++){
				System.out.print((char)k);
			}
            k += 1;
			System.out.println();
		}

		
	}

}