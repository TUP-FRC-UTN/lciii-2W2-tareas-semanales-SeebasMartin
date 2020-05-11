package ejercicio3guiaarreglos;

import java.util.Scanner;

public class Ejercicio3GuiaArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String descripcion = "";
        int cantElementos = 0;
        
        System.out.println("Ingrese una cantidad de productos");
        cantElementos = sc.nextInt();
        for (int i = 0; i < cantElementos; i++) {
            sc.nextLine();
            System.out.println("Ingrese la descripcion del elemento " + (i + 1));
            descripcion = sc.nextLine();
            sc.nextLine();
            
        }
        Producto p = new Producto(descripcion, cantElementos);
        
        //punto 7
        int parametro = 0;
        System.out.println("Ingrese un parametro para verificar si los valores unitarios de cada material son menores al mismo.");
        parametro = sc.nextInt();
        
        
        
    }
    
}
