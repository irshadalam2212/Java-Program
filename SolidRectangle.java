import java.util.Scanner;
public class SolidRectangle {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
		int n = s.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}