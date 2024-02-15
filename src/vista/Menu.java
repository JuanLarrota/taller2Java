package vista;

import java.util.Scanner;
import controladores.Controlador_EJ1;
import controladores.Controlador_EJ2;
import controladores.Controlador_EJ3;
import controladores.Controlador_EJ4;
import controladores.Controlador_EJ5;
import controladores.Controlador_EJ6;
import controladores.Controlador_EJ7;
import controladores.Controlador_EJ8;
import controladores.Controlador_EJ9;
import controladores.Controlador_EJ10;

/**
 *
 * @author JULIAN CUELLAR COD:1006732153
 */
public class Menu {

    Controlador_EJ1 obj1 = new Controlador_EJ1();
    Controlador_EJ2 obj2 = new Controlador_EJ2();
    Controlador_EJ3 obj3 = new Controlador_EJ3();
    Controlador_EJ4 obj4 = new Controlador_EJ4();
    Controlador_EJ5 obj5 = new Controlador_EJ5();
    Controlador_EJ6 obj6 = new Controlador_EJ6();
    Controlador_EJ7 obj7 = new Controlador_EJ7();
    Controlador_EJ8 obj8 = new Controlador_EJ8();
    Controlador_EJ9 obj9 = new Controlador_EJ9();
    Controlador_EJ10 obj10 = new Controlador_EJ10();

    public void menu() {
        Scanner ent = new Scanner(System.in);
        int opcion;
        System.out.println("TALLER 1 - Vectores y Matrices\n"
                + "Autores: ");
        System.out.println("A VER LA PRUEBA");
        
        do {
            System.out.println("--------------------MENU--------------------");
            System.out.println("1  - Ejercicio 1");
            System.out.println("2  - Ejercicio 2");
            System.out.println("3  - Ejercicio 3");
            System.out.println("4  - Ejercicio 4");
            System.out.println("5  - Ejercicio 5");
            System.out.println("6  - Ejercicio 6");
            System.out.println("7  - Ejercicio 7");
            System.out.println("8  - Ejercicio 8");
            System.out.println("9  - Ejercicio 9");
            System.out.println("10 - Ejercicio 10");
            System.out.println("11 - SALIR");

            System.out.print("Ingrese una opcion: ");
            opcion = ent.nextInt();

            switch (opcion) {
                case 1:
                    obj1.menu();
                    break;
                case 2:
                    obj2.menu();
                    break;
                case 3:
                    obj3.menu();
                    break;
                case 4:
                    break;
                case 5:
                    obj5.menu();
                    break;
                case 6:
                    obj6.menu();
                    break;
                case 7:
                    obj7.menu();
                    break;
                case 8:
                    obj8.menu();
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    System.out.println("Gracias...\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valdia...");
                    break;
            }

        } while (opcion > 0 || opcion < 12);
    }
}
