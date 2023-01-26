import java.util.Scanner;
public class Solution3 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int fahrenheit;

        while(S <= E) {
            fahrenheit = ((5*(S-32))/9);
            System.out.println(S +" "+ fahrenheit);
            S += W; 
        }
		
	}
}