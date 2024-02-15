package controladores;

import java.util.Scanner;
import ejercicio.Ejercicio2;
import vista.Menu;

public class Controlador_EJ2 {

    Ejercicio2 obj = new Ejercicio2();

    public void cantidad() {
        Scanner entrada = new Scanner(System.in);
        int n;
        boolean bandera = false;

        do {
            System.out.print("Ingrese el tamanio: ");
            n = entrada.nextInt();
            if (n > 0) {
                bandera = true;
                obj.setN(n);
            } else {
                System.out.println("El tamanio debe ser mayor que cero...");
                bandera = false;
            }
        } while (bandera == false);
        
    }

    public void llenarArray() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Llenar el array...");
        String cadena[] = new String[obj.getN()];
        
        for (int i = 0; i < obj.getN(); i++) {
            System.out.println("Ingrese el dato[" + (i + 1) + "}");
            cadena[i] = entrada.nextLine();
        }

        obj.setCadena(cadena);

    }

    public void editar() {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        int inser;
        String cadenaO[] = obj.getCadena();
        String ayuda[] = cadenaO.clone();
        String palabra = "";
        boolean ban = false;
        do {
            System.out.print("Digite la posicion a insertar: ");
            inser = numeros.nextInt();

            if (inser > 0 && inser<=obj.getN()) {
                ban = true;
            } else {
                System.out.println("La cantidad debe ser mayor que [0] y menor que ["+obj.getN()+"]");
                ban = false;
                
            }
        } while (ban == false);

        inser -= 1;
        System.out.print("Ingrese la palabra: ");
        palabra = letras.nextLine();
        ayuda[inser] = palabra;

        for (int i = inser; i < obj.getN() - 1; i++) {
            ayuda[i + 1] = cadenaO[i];
        }

        obj.setCadena(ayuda);
    }

    public void mostrar() {

        String msg = "";
        String cadena[] = new String[obj.getN()];
        cadena = obj.getCadena();
        for (int i = 0; i < obj.getN(); i++) {
            msg += " " + cadena[i] + "\n";
        }
        System.out.println("Resultado: \n" + msg);
    }

    public void menu() {
        System.out.println("EJERCICIO 1:\n");
        cantidad();
        llenarArray();
        Scanner ent1 = new Scanner(System.in);
        int op;

        do {
            System.out.println("--------------------MENU--------------------\n");
            System.out.println("1 - Editar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Salir");

            System.out.print("Ingrese una opcion: ");
            op = ent1.nextInt();

            switch (op) {
                case 1:
                    editar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    System.out.println("Ha salido del ejercicio 2...");
                    Menu mn = new Menu();
                    mn.menu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op > 0 && op < 4);
    }
}
