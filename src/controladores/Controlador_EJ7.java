package controladores;

import java.util.Scanner;
import ejercicio.Ejercicio7;

public class Controlador_EJ7 {

    Ejercicio7 obj = new Ejercicio7();

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

    public void llenarMatrizAyB() {
        Scanner num = new Scanner(System.in);
        int[][] numA = new int[obj.getM()][obj.getN()];
        int[][] numB = new int[obj.getM()][obj.getN()];

        System.out.println("LLENAR MATRIAZ A...");
        for (int i = 0; i < obj.getM(); i++) {
            for (int j = 0; j < obj.getN(); j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                numA[i][j] = num.nextInt();
            }
        }
        obj.setMatrizA(numA);
        System.out.println("LLENAR MATRIAZ B...");
        for (int i = 0; i < obj.getM(); i++) {
            for (int j = 0; j < obj.getN(); j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                numB[i][j] = num.nextInt();
            }
        }
        obj.setMatrizB(numB);
        System.out.println("Diagonal A = "+diagonalMatriz(obj.getMatrizA()));
        System.out.println("Diagonal B = "+diagonalMatriz(obj.getMatrizB()));
        if (diagonalMatriz(obj.getMatrizA()) == diagonalMatriz(obj.getMatrizB())) {
            System.out.println("El promedio de la diagonal de la matriz A es igual a la de la matriz B");
        } else {
            System.out.println("Las diagonales de las matrices no son iguales");
        }

    }

    public double diagonalMatriz(int[][] mat) {
        int sum = 0, cont = 0;
        int[][] matriz = mat;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    cont++;
                    sum += matriz[i][j];
                }
            }
        }

        double prom = sum / cont;
        return prom;
    }

    public void menu() {
        tamanio();
        llenarMatrizAyB();
    }
}
