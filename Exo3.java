package preparation_examen;

// Difference entre deux tableau
import java.util.Scanner;

public class Exo3 {
    public static boolean existe(int[] list, int nombre) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == nombre) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Saisir la taille du tableau A :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("A[" + i + "] = :");
            A[i] = sc.nextInt();
        }

        System.out.println("Saisir la taille du tableau B :");
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("B[" + i + "] = :");
            B[i] = sc.nextInt();
        }
        int k = 0, j = 0;
        int[] T = new int[n + m];

        for (int i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    break;
                }
                if (!existe(A, B[i]) && !existe(T, B[i])) {
                    T[k] = B[i];
                    k++;
                }
            }

            if (j == m && !existe(B, A[i]) && !existe(T, A[i])) {
                T[k] = A[i];
                k++;
            }

        }

        // Affichage du tableau :
        System.out.print("A = [ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");

        System.out.print("B = [ ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("]");
        // Difference
        System.out.print("T = [ ");
        for (int i = 0; i < k; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println("]");

    }
}
