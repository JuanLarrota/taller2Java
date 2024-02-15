package controladores;

import ejercicio.Serie;
import java.util.Scanner;
import vista.Menu;

public class Controlador_EJ1 {

    Serie eje1 = new Serie();

    public boolean cantidadDatos() {
        Scanner numInt = new Scanner(System.in);
        int N;
        boolean bandera = true;
        System.out.println("Ingrese la cantidad de datos a ingresar.\n"
                + "Debe ser mayor que cero.\n");

        do {
            System.out.print("Cantidad: ");
            N = numInt.nextInt();
            
            if (N > 0) {
                bandera = true;
                eje1.setN(N);
            } else {
                System.out.println("La cantidad debe ser mayor que cero.");
                bandera = false;
            }
            
        } while (bandera == false);

        return bandera;
    }

    public void llenarArray() {
        Scanner numDouble = new Scanner(System.in);
        System.out.println("Llenar Array.");

        double numR[] = new double[eje1.getN()];
        //como hacer para que solo acepte numeros

        for (int i = 0; i < eje1.getN(); i++) {
            System.out.print("Numero [" + (i + 1) + "] = ");
            numR[i] = numDouble.nextDouble();
        }

        eje1.setNumR(numR);
    }

    public double max() {

        double max = 0;
        double num[] = eje1.getNumR();

        for (int i = 0; i < eje1.getN(); i++) {
            if (!(max > num[i])) {
                max = num[i];
            }
        }
        return max;
    }

    public double min() {

        double min1 = 0;
        double num[] = eje1.getNumR();
        
        for (int i = 0; i < eje1.getN(); i++) {
            int min = i;
            for (int j = i + 1; j < eje1.getN(); j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            double aux = num[i];
            num[i] = num[min];
            num[min] = aux;
        }
        
        min1=num[0];
        return min1;
    }

    public double media() {
        double media = 0;
        double suma = 0;
        double num[] = eje1.getNumR();

        for (int i = 0; i < eje1.getN(); i++) {
            suma += num[i];
        }
        media = suma / eje1.getN();
        return media;
    }

    public double varianza() {
        double sum=0,varianza=0,num[]=eje1.getNumR();
        
        for (int i = 0; i < eje1.getN(); i++) {
            sum+=(Math.pow(num[i]-media(), 2))/eje1.getN();
        }
        varianza=sum;
        
        return varianza;
    }

    public double mediana() {
        int coordenada=0, coordenada1=0;
        double num[] = eje1.getNumR(), mediana;
        String msg="";
        //ordenar
        for (int i = 0; i < eje1.getN(); i++) {
            int min = i;
            for (int j = i + 1; j < eje1.getN(); j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            double aux = num[i];
            num[i] = num[min];
            num[min] = aux;
        }
        
        System.out.println("Array ordenado");
        for (int i = 0; i < eje1.getN(); i++) {
           msg+=num[i]+" ";
        }
        if (eje1.getN() % 2 == 0) {
            coordenada = (eje1.getN() / 2)-1;
            coordenada1 = ((eje1.getN() / 2) + 1)-1;
            
            mediana = num[coordenada] + num[coordenada1];
            mediana/=2;
        } else {
            coordenada = ((eje1.getN() + 1) / 2)-1;
            mediana = num[coordenada];
        }

        return mediana;
    }

    public String moda() {
        //datos mas frecuentes
        double num[]=eje1.getNumR(),moda=0, dato;
        int cont1=0, cont2=0;
        
        
        for (int i = 0; i < eje1.getN(); i++) {
            for (int j = 0; j < eje1.getN(); j++) {
                if (num[i]==num[j]) {
                    cont1++;
                    dato=num[i];
                }
            }
            
            if (cont1>cont2) {
                cont2=cont1;
                moda=num[i];
            }
        }
        return ""+moda;
    }

    //menu
    public void menu() {
        System.out.println("EJERCICIO 1:\n");
        cantidadDatos();
        llenarArray();
        Scanner ent1 = new Scanner(System.in);
        int op;

        do {
            System.out.println("--------------------MENU--------------------\n");
            System.out.println("1 - Numero mayor");
            System.out.println("2 - Numero menor");
            System.out.println("3 - Media");
            System.out.println("4 - Varianza");
            System.out.println("5 - Mediana");
            System.out.println("6 - Moda");
            System.out.println("7 - Salir");

            System.out.print("Ingrese una opcion: ");
            op = ent1.nextInt();

            switch (op) {
                case 1:
                    System.out.println("El numero maximo es: " + max());
                    break;
                case 2:
                    System.out.println("El numero minimo es: " + min());
                    break;
                case 3:
                    System.out.println("La media es: " + media());
                    break;
                case 4:
                    System.out.println("La varianza es: " + varianza());
                    break;
                case 5:
                    System.out.println("La mediana es: " + mediana());
                    break;
                case 6:
                    System.out.println("La moda es: " + moda());
                    break;
                case 7:
                    System.out.println("Ha salido del ejercicio 1...");
                    Menu mn=new Menu();
                    mn.menu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op > 0 && op < 8);
    }
}
