import java.util.Scanner;
import java.lang.Math;
public class Solution4 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        int allow;
        
        if (grade == 'A'){
            allow = 1700;
        }else if (grade == 'B'){
            allow = 1500;
        }else {
            allow = 1300;
        }
		double totalSalary = ((basic + (0.20 * basic)+(0.50 * basic)+allow)-(0.11*basic));
        double ts = Math.round(totalSalary);
        int s = (int)(ts);
        System.out.print(s);
    }
}