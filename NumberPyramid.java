import java.util.Scanner;
public class NumberPyramid {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.println("How many rows?");
		int n = s.nextInt();
        
        for(int i=1; i<=n; i++){
            int spaces=n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
	}
}