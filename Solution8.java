import java.util.Scanner;
public class Solution8 {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int i;
        for(i = 2; i <= n/2; i++){
            if (n%i == 0){
                System.out.print(i +" ");
            }
        }
	}
}