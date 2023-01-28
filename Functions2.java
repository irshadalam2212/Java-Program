import java.util.*;
public class Functions2 {
    public static void evenOdd(int n) {
        if(n%2==0) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOdd(n);
        
    }
}

