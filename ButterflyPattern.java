import java.util.Scanner;
public class ButterflyPattern {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
		int n = s.nextInt();
       
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*"); 
            }
            // spaces
            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            // 2nd part 
            for(int l=1; l<=i; l++){
                System.out.print('*');
            }
            
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*"); 
            }
            // spaces
            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            // 2nd part 
            for(int l=1; l<=i; l++){
                System.out.print('*');
            }
            
            System.out.println();
        }
    }
}