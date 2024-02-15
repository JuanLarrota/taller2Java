package controladores;

import ejercicio.Ejercicio5;
import java.util.Scanner;

public class Controlador_EJ5 {

    Ejercicio5 obj = new Ejercicio5();
    
    public void tamanio() {
        Scanner num = new Scanner(System.in);
        int n = 0;
        boolean ban = false;
        do {
            System.out.print("Ingrese el tamaño del array = ");
            n = num.nextInt();
            if (n > 0 ) {
                ban = true;
                obj.setN(n);
            } else {
                System.out.println("Debe ser mayor que [" + 0 + "]");
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

    public void paresYpares() {
        int[] origen = obj.getNum();

        int conP = 0, conImp = 0;
        for (int i = 0; i < obj.getN(); i++) {
            if (origen[i] % 2 == 0 || origen[i] == 0) {
                conP++;
            } else {
                conImp++;
            }
        }
        int[] pares = new int[conP];
        int[] impares = new int[conImp];
        int cont=0;
        for (int i = 0; i < obj.getN(); i++) {
            if (origen[i] % 2 == 0 || origen[i] == 0) {//pares
                
                pares[cont] = origen[i];
                cont++;
            }
        }
        cont=0;
        for (int i = 0; i < obj.getN(); i++) { 
            if (!(origen[i] % 2 == 0 || origen[i] == 0)) { //impares
               
                impares[cont] = origen[i]; 
                cont++;
            }
        }
        organizar(menorAmayor(pares), menorAmayor(impares));
    }

    public void organizar(int[] pares, int[] impares) {
        int[] origen = new int[obj.getN()];
        int cont = 0;

        for (int i = 0; i < pares.length; i++) {
            origen[i] = pares[i];
        }
        for (int i = pares.length ; i < obj.getN(); i++) {
            origen[i] = impares[cont];
            cont++;
        }

        mostrar(origen);

    }

    public int[] menorAmayor(int[] num) {

        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            int aux = num[i];
            num[i] = num[min];
            num[min] = aux;
        }
        return num;
    }

    public void mostrar(int[] num) {
        String mm = "";

        for (int i = 0; i < num.length; i++) {
            mm += " " + num[i];
        }

        System.out.println("Array ordenado = " + mm);

    }

    public void menu() {
        tamanio();
        llenar();
        paresYpares();

    }
}
