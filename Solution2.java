import java.util.Scanner;
public class Solution2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
       if (Character.isUpperCase(c)) {
        System.out.print(1);
       }else if (Character.isLowerCase(c)){
        System.out.print(0);
       }else {
        System.out.print(-1);
       }

        }

    }