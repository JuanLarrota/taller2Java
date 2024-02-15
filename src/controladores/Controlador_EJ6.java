package controladores;

import ejercicio.Ejercicio6;
import java.util.Scanner;

public class Controlador_EJ6 {

    Ejercicio6 obj = new Ejercicio6();

    public void tamanio() {
        Scanner numero = new Scanner(System.in);
        boolean ban = false;
        int n, m;
        System.out.println("TAMANIO...");
        do {
            System.out.print("Ingrese el tamanio de la matriz M = ");
            m = numero.nextInt();
            if (m > 0) {
                ban = true;
                obj.setM(m);
            } else {
                System.out.println("Debe ser mayor que [0]");
                ban = false;
            }
        } while (ban == false);

        do {
            System.out.print("Ingrese el tamanio de la matriz N = ");
            n = numero.nextInt();
            if (n > 0) {
                ban = true;
                obj.setN(n);
            } else {
                System.out.println("Debe ser mayor que [0]");
                ban = false;
            }
        } while (ban == false);

    }

    public void llenarMatriz() {
        Scanner numero = new Scanner(System.in);
        int[][] num = new int[obj.getM()][obj.getN()];
        System.out.println("LLENAR MATRIZ...\nIngrese el numero de la posicion ");
        for (int i = 0; i < obj.getM(); i++) {
            for (int j = 0; j < obj.getN(); j++) {
                //como hacer que solo ingrese numeros
                System.out.print("[" + i + "][" + j + "] = ");
                num[i][j] = numero.nextInt();
            }

        }
        obj.setNumeros(num);
    }

    public void posicionNum5() {
        int[][] num = obj.getNumeros();
        String msg = "Posiciones donde el 5 es el penultimo numero...\n";
        for (int i = 0; i < obj.getM(); i++) {
            for (int j = 0; j < obj.getN(); j++) {
                if (num[i][j] > 9 || num[i][j] < -9) {
                    String n = "" + num[i][j]; //pasar el numero a string
                    int cant = n.length(); //para saber la cantidad de numeros
                    //.chatAt(i) para recorrer un string
                    char nn = n.charAt(cant - 2); //para encontrar el penultimo numero
                    if (nn == '5') {
                        msg += "[" + i + "][" + j + "]\n";
                    }
                }
            }
        }

        System.out.println(msg);

    }

    public void menu() {
        tamanio();
        System.out.println("");
        llenarMatriz();
        System.out.println("");
        posicionNum5();
    }
}
