import java.util.Scanner;
public class Main {
    public static void crearArbol(Scanner ingreso, Arbol root){
        String hi, hd, p, hi2, hd2, p2, r;
        System.out.println("Ingrese el nombre de la primera hoja izquierda");
        hi = ingreso.nextLine();
        hi = ingreso.nextLine();
        System.out.println("Ingrese el nombre de la primera hoja derecha");
        hd= ingreso.nextLine();
        System.out.println("Ingrese el nombre de la rama izquierda");
        p= ingreso.nextLine();
        System.out.println("Ingrese el nombre de la segunda hoja izquierda");
        hi2= ingreso.nextLine();
        System.out.println("Ingrese el nombre de la segunda hoja derecha");
        hd2= ingreso.nextLine();
        System.out.println("Ingrese el nombre de la rama derecha");
        p2= ingreso.nextLine();
        System.out.println("Ingrese el nombre de la raiz");
        r= ingreso.nextLine();
        root.crearArbol(hi, hd, p, hi2, hd2, p2, r);
    }

    public static void main(String[] args) {
        int op=0;
        Arbol raiz = new Arbol();
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println(" 1) Crear árbol");
            System.out.println(" 2) Recorrer árbol preorden");
            System.out.println(" 3) Salir");
            Scanner teclado = new Scanner(System.in);
            op= teclado.nextInt();
            switch(op){
                case 1:
                    crearArbol(teclado, raiz);
                break;
                case 2:
                    raiz.recorrerPreOrden(raiz.raiz);
                break;
                case 3:
                    System.out.println("Programa cerrado.");
                break;
                default:
                    System.out.println("Opcion invalida");
                break;
            }
        }while(op!=3);
    }
}
