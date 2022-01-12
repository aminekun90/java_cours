package preparation_examen;

// Menu 

import java.util.*;

public class Exo1 {
    public static void main(String[] args) {
        System.out.println("Saisir la taille du tableau :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] T = new double[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println("T[" + i + "] = :");
            T[i] = sc.nextDouble();
        }

        // affichage du menu
        System.out.println("==================MENU====================");
        System.out.println("1 - Ajouter");
        System.out.println("2 - Modifier");
        System.out.println("3 - Rechercher tel que T[i] = N * i/2");
        System.out.println("4 - Supprimer");
        System.out.println("5 - Trier");
        System.out.println("==========================================");

        System.out.println("Chosissez une option :");
        int option = sc.nextInt();

        switch (option) {
            case 1:// Ajouter
                System.out.println("Donnez la position :");
                int position = sc.nextInt();
                if (position <= n && position >= 0) {
                    n = n + 1;
                    System.out.println("Donnez le nombre a ajouter :");
                    double x = sc.nextDouble();

                    for (int i = n - 1; i > position; i--) {
                        T[i] = T[i - 1];
                    }
                    T[position] = x;
                } else {
                    System.out.println("La position n'est pas entre 0 et " + n);
                }
                break;
            case 2:// Modifier
                for (int i = 0; i < n; i++) {
                    if (T[i] % 2 == 0) {
                        T[i] = T[i] / 2;
                    } else {
                        T[i] = T[i] / 3;
                    }
                }
                break;
            case 3:// Rechercher T[i] = N * i/2
                System.out.println("Donnez un nombre:");
                double N = sc.nextDouble();
                boolean trouver = false;
                for (int i = 0; i < n; i++) {
                    double calc = N * i / 2;
                    if (T[i] == calc) {
                        System.out.println("Trouvé : T[" + i + "] = " + T[i] + " = " + N + " * " + i + " / " + 2);
                        trouver = true;
                    }
                }
                if (!trouver) {
                    System.out.println("Aucun chiffre trouvé qui satisfait la condition " + N + " * i" + " / " + 2);
                }
                break;
            case 4:// Supprimer
                System.out.println("Saisir un chiffre a supprimer:");
                double n_suppr = sc.nextDouble();
                double[] A = new double[n];
                int k = 0;
                for (int i = 0; i < T.length; i++) {
                    if (T[i] == n_suppr) {
                        n--;
                    } else {
                        A[k] = T[i];
                        k++;
                    }
                }
                for (int i = 0; i < n; i++) {
                    T[i] = A[i];
                }
                break;
            case 5:// Trier
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
                break;
            default:
                System.out.println("L'option n'existe pas!");
                break;
        }
        // Affichage du tableau :
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println("]");
    }
}
