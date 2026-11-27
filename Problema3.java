import java.util.Arrays;
import java.util.Scanner;

public class Problema3{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            n = sc.skip("[\r\n]*").nextInt();
            if (n>=0) break;
        }

        String[] paraules = new String[n];

        for (int i = 0; i < paraules.length; i++) {
            paraules[i] = sc.skip("[\r\n]*").nextLine();
        }

        Boolean[] inEnd = new Boolean[paraules.length];

        for (int i = 0; i < inEnd.length; i++) {
            inEnd[i] = paraules[i].endsWith(Character.toString(paraules[i].charAt(0)));
        }

        System.out.printf(Arrays.toString(inEnd));
        sc.close();
    }

}
