import java.util.*;
public class CharacterPattern {


	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        
        while( i<= n ){
            int j = 1;
           int  Start = 'A'+i-1;
            while(j<= i){
                System.out.print((char)(Start));
                j++;
               Start++;
            }
            System.out.println();
            i++;
        }
		
	}

}