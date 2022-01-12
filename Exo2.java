package preparation_examen;

import java.util.*;

public class Exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un reel A : ");
        double A = sc.nextDouble();

        System.out.println("Saisir un réel B : ");
        double B = sc.nextDouble();

        System.out.println("Saisir un reel C : ");
        double C = sc.nextDouble();

        System.out.println("Saisir un caractere L : ");
        char L = sc.next().charAt(0);

        // Très particulière conversion à faire :
        if ((double) (L - '0') == A) {
            A = B + C;
            System.out.println("A = " + A);
        } else if ((double) (L - '0') == B) {
            B = A + C;
            System.out.println("B = " + B);
        } else if ((double) (L - '0') == C) {
            C = A + B;
            System.out.println("C = " + C);
        } else {
            double S = A + B + C;
            System.out.println("S = " + S);
        }
    }
}
