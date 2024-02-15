package controladores;

import ejercicio.Ejercicio3;
import java.util.Scanner;

public class Controlador_EJ3 {

    Ejercicio3 obj = new Ejercicio3();

    public void tamanio() {
        Scanner num = new Scanner(System.in);
        boolean ban = false;
        int n = 0;
        do {
            System.out.print("Ingrese el tamanio del array = ");
            n = num.nextInt();
            if (n > 0) {
                obj.setN(n);
                ban = true;
            } else {
                System.out.println("Debe ser mayor que cero");
                ban = false;
            }
        } while (ban == false);
    }

    public void llenar() {
        Scanner num = new Scanner(System.in);
        int[] numm = new int[obj.getN()];

        for (int i = 0; i < obj.getN(); i++) {
            System.out.print("[" + i + "] = ");
            numm[i] = num.nextInt();
        }
        obj.setNum(numm);

    }

    public String secuencia() {
        int[] numm = obj.getNum();
        int tamA = 1, tamS = 0, iniA = 0, iniS = 0, dato;
        String msg = "";
        for (int i = 1; i < numm.length; i++) {
            if (numm[i] > numm[i - 1]) {
                tamA++;
                if (tamA > tamS) {
                    iniS = iniA;
                    tamS = tamA;
                }
            } else {
                iniA = 0;
                tamA = 1;
            }
        }

        if (tamS == 0) {
            return "No se encontro ninguna secuencia.";
        }

        return "Tamano de la secuencia: " + tamS + " Numero incial: " + iniS;

    }

    public void menu() {
        tamanio();
        llenar();
        System.out.println(secuencia());
    }
}
