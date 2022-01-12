package preparation_examen;

import java.util.*;

public class Exo5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir la taille des lignes de la matrice T :");
        int n = sc.nextInt();
        System.out.println("Saisir la taille des colonnes de la matrice T :");
        int m = sc.nextInt();
        double[][] T = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("T[" + i + "][" + j + "] = ");
                T[i][j] = sc.nextDouble();
            }
        }

        System.out.println("T = ");
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Saisir un nombre :");
        double x = sc.nextDouble();
        double x_by_2 = x / 2;
        int occ = 0;
        int last_i = -1;
        int last_j = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (T[i][j] == x_by_2 && last_i != i && last_j != j) {
                    occ++;
                    last_i = i;
                    last_j = j;
                }
            }
        }
        System.out.println(x_by_2 + " se trouve " + occ + " fois dans la matrice");
    }
}
