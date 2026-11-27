import java.util.Arrays;
import java.util.Scanner;

public class Problema5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            n = sc.skip("[\r\n]*").nextInt();
            if (n > 0) break;
        }

        String[][] paraules = new String[n][n];

        for (int i = 0; i < paraules.length; i++) {
            for (int j = 0; j < paraules[i].length; j++) {
                paraules[i][j] = sc.skip("[\r\n]*").nextLine();
            }
        }

        int[][] petita = new int[n][2];

        for (int i = 0; i < paraules.length; i++) {
            String menor = paraules[i][0];

            for (int j = 1; j < paraules[i].length; j++) {
                if (paraules[i][j].compareTo(menor) < 0) {
                    menor = paraules[i][j];
                }
            }

            for (int j = 0; j < paraules[i].length; j++) {
                if (paraules[i][j].equals(menor)){
                    petita[i][0] = i;
                    petita[i][1] = j;
                }
            }
        }

        for (int i = 0; i < petita.length; i++) {
            System.out.println(Arrays.toString(petita[i]));
        }
        sc.close();
    }
}
