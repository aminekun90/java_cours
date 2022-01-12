package preparation_examen;

import java.util.*;

public class Exo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir la taille du tableau T :");
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println("La taille doit etre superieure ou egale à 10");
            return;
        }
        double note_min_reussite = 10;
        double[] T = new double[n];
        double max = 0;
        double somme = 0;
        double moyenne = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Note de l'Eleve numero " + (i + 1) + " :");
            T[i] = sc.nextDouble();
            somme += T[i];
            if (T[i] > max) {
                max = T[i];
            }
        }
        moyenne = somme / n;
        int nbr_reussite = 0;
        int nbr_rattage = 0;
        int nbr_sup_moyenne = 0;
        int nbr_inf_moyenne = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] >= note_min_reussite) {
                nbr_reussite++;
            } else {
                nbr_rattage++;
            }
            if (T[i] > moyenne) {
                nbr_inf_moyenne++;
            } else {
                nbr_sup_moyenne++;
            }
        }

        System.out.println("La moyenne : " + moyenne);
        System.out.println("Le nombre d'eleve ayant rate l'annee : " + nbr_rattage);
        System.out.println("Le nombre d'eleve ayant reussi l'annee : " + nbr_reussite);

        if (nbr_rattage > nbr_reussite) {
            System.out.println("Beaucoup d'eleves on ratté l'année");
        } else if (nbr_rattage < nbr_reussite) {
            System.out.println("Beaucoup d'eleves on reussi cette année");
        } else {
            System.out.println("Autant d'eleves on reussi et ratté l'année");
        }

        System.out.println("Le nombre d'eleve ayant plus que la moyenne : " + nbr_sup_moyenne);
        System.out.println("Le nombre d'eleve ayant moin que la moyenne : " + nbr_inf_moyenne);

        if (nbr_inf_moyenne > nbr_sup_moyenne) {
            System.out.println("Beaucoup d'eleves on eu moin que la moyenne");
        } else if (nbr_inf_moyenne < nbr_sup_moyenne) {
            System.out.println("Beaucoup d'eleves on eu plus que la moyenne");
        } else {
            System.out.println("Autant d'eleves on eu plus et moins que la moyenne");
        }

        double[] A = new double[5];
        double[] B = new double[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double tmp = 0;
                if (T[i] < T[j]) {// Croissant il faut inverser T[i] > T[j]
                    tmp = T[i];
                    T[i] = T[j];
                    T[j] = tmp;
                }
            }
        }
        int k = 0;
        for (int i = 0; i < T.length; i++) {
            if (i > 4) {
                B[k] = T[i];
                k++;
            } else {
                A[i] = T[i];
            }
        }

        // Affichage du tableau :
        System.out.print("T[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println("]");
        System.out.print("A[ ");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");

        System.out.print("B[ ");
        for (int i = 0; i < k; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("]");

        int taille = 0;
        double[] B_ = new double[B.length];
        for (int i = 0; i < B.length; i++) {
            if (B[i] >= 12) {
                B_[taille] = B[i];
                taille++;
            }
        }
        double[] C = new double[n];
        int last_i = 0;
        for (int i = 0; i < n - 5; i++) {
            C[last_i] = A[i];
            last_i++;
        }
        for (int i = 0; i < taille; i++) {
            C[last_i] = B[i];
        }

        System.out.print("C[ ");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("]");
    }
}
