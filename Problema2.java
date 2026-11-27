import java.util.Arrays;
import java.util.Scanner;

public class Problema2{
    
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

        char caracter = sc.skip("[\r\n]*").nextLine().charAt(0);

        int[] caracterRep = new int[paraules.length];

        for (int i = 0; i < caracterRep.length; i++) {
            int compt = 0;
            for (int j = 0; j < paraules[i].length(); j++) {
                if (paraules[i].charAt(j) == caracter) compt++;
            }
            caracterRep[i] = compt;
        }


        System.out.printf(Arrays.toString(caracterRep));
        sc.close();
    }

}
