import java.util.Arrays;
import java.util.Scanner;

public class Problema4{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            n = sc.skip("[\r\n]*").nextInt();
            if (n>0) break;
        }

        String[] paraules = new String[n];

        for (int i = 0; i < paraules.length; i++) {
            paraules[i] = sc.skip("[\r\n]*").nextLine();
        }

        Boolean[][] conte = new Boolean[n][n];

        for (int i = 0; i < conte.length; i++) {
            for (int j = 0; j < conte[i].length; j++) {
                conte[i][j] = paraules[i].contains(paraules[j]);
            }
        }

        for (int i = 0; i < conte.length; i++) {
            System.out.println(Arrays.toString(conte[i]));
        }
        sc.close();
    }

}

