package controladores;

import ejercicio.Ejercicio8;
import java.util.Scanner;

public class Controlador_EJ8 {

    Ejercicio8 obj = new Ejercicio8();

    public void tamanio() {
        Scanner num = new Scanner(System.in);
        boolean ban = false;
        do {
            System.out.print("Ingrese el tamanio de M = ");
            int m = num.nextInt();
            if (m > 0) {
                ban = false;
                obj.setM(m);
            } else {
                System.out.println("Debe ser mayor que [0]");
                ban = true;
            }
        } while (ban == true);
        do {
            System.out.print("Ingrese el tamanio de N = ");
            int n = num.nextInt();
            if (n > 0) {
                ban = false;
                obj.setN(n);
            } else {
                System.out.println("Debe ser mayor que [0]");
                ban = true;
            }
        } while (ban == true);
    }

    public void llenarMatriz() {
        Scanner num = new Scanner(System.in);
        int[][] matriz = new int[obj.getM()][obj.getN()];

        for (int i = 0; i < obj.getM(); i++) {
            for (int j = 0; j < obj.getN(); j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                matriz[i][j] = num.nextInt();
            }
        }

        obj.setMatriz(matriz);
    }

    public void numMayor(int numero) {
        int cont = 0;
        int[][] matriz = obj.getMatriz();
        
        for (int i = 0; i < obj.getM(); i++) {
            for (int j = 0; j < obj.getN(); j++) {
                if (numero == matriz[i][j]) { //comparar
                    cont++;
                }
            }
        }

        System.out.println("Veces que se repite el numero mayor: " + cont);

    }

    public void matrizOrd() {
        int[][] matriz = obj.getMatriz();

        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println(mayor);
        numMayor(mayor);

    }

    public void menu() {
        tamanio();
        llenarMatriz();
        matrizOrd();

    }
}
