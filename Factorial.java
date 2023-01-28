import java.util.*;
public class Factorial {
    public static void fact(int n) {
        if(n<0) {
            System.out.println("Invalid number");
            return;
        }
        
        int f = 1;
        for(int i=n; i>=1; i--) { 
        f = f*i;
        }
        System.out.println(f);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}

