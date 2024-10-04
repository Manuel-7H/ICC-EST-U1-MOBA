import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mO= new MetodoOrdenamiento();
        Scanner momo = new Scanner(System.in);
        
        int tamano=0;

        do{

            System.out.println("Ingrese el tamano que sea entero positivo");
            while (!momo.hasNextInt()) {
                System.out.println("te pedi un entero");
                momo.next();
            }
            tamano= momo.nextInt();
            if(tamano<=0){
                System.out.println("el tamaño debe ser entero positivo");

            }
        }while (tamano<0);

            int[]arreglo = new int[tamano];
                
           for (int i = 0; i < tamano; i++) {
            System.out.println("Ingresa el valor para la posición " + (i + 1) + ": ");
            while (!momo.hasNextInt()) {
                System.out.println("Te pedí un entero");
                momo.next();  // Limpiar la entrada no válida
            }
            arreglo[i] = momo.nextInt();
        }

        System.out.println("Arreglo ingresado: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}

