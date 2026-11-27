import java.util.Arrays;
import java.util.Scanner;

public class Problema1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            n = sc.skip("[\r\n]*").nextInt();
            if (n>0) break;
        }

        String[] paraules = new String[n];

        for (int i = 0; i < n; i++) {
            paraules[i] = sc.skip("[\r\n]*").nextLine();
        }

        int[] longitudParaules = new int[n];

        for (int i = 0; i < n; i++) {
            longitudParaules[i] = paraules[i].length();
        }


        System.out.printf("%s -> ", Arrays.toString(paraules));
        System.out.printf(Arrays.toString(longitudParaules));

        sc.close();
    }
}
