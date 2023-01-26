// Write a program to find x to the power n (i.e. x^n). 
// Take x and n from the user. You need to print the answer.
import java.util.Scanner;
public class Solution9 {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
        int power = 1;
        for(int i=1; i<=n; i++){
            power = power * x;
        }System.out.print(power);
	}
}