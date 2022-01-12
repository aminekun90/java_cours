package preparation_examen;

import java.util.*;

public class Exo4 {
    public static void main(String[] args) {
        System.out.println("Saisir la taille des tableau Ta et Tb :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] Ta = new int[n];
        int[] Tb = new int[n];
        int[] Ts = new int[n];
        int[] Tp = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ta[" + i + "] = :");
            Ta[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Tb[" + i + "] = :");
            Tb[i] = sc.nextInt();
        }

        System.out.print("Elements egaux sont [ ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Ta[i] == Tb[j]) {
                    System.out.print(Ta[i] + " ");
                    break;
                }
            }
        }
        System.out.println("]");

        for (int i = 0; i < n; i++) {

            Ts[i] = Ta[i] + Tb[i];
            Tp[i] = Ta[i] * Tb[i];
        }

        System.out.print("Ta = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(Ta[i] + " ");
        }
        System.out.println("]");

        System.out.print("Tb = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(Tb[i] + " ");
        }
        System.out.println("]");

        System.out.print("Ts = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(Ts[i] + " ");
        }
        System.out.println("]");

        System.out.print("Tp = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(Tp[i] + " ");
        }
        System.out.println("]");
    }
}
