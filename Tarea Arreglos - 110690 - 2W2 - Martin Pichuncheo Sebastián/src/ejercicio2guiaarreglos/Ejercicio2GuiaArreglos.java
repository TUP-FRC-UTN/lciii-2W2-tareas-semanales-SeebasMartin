package ejercicio2guiaarreglos;

import java.util.Scanner;

public class Ejercicio2GuiaArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantClientes;
        Cliente[] clientes;
        
        System.out.println("Ingrese la cantidad de clientes: ");
        cantClientes = sc.nextInt();
        
        clientes = new Cliente[cantClientes];
        
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Ingrese el numero del cliente " + (i + 1) + ":");
            int nroCliente = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente " + (i + 1) + ":");
            String nombreCliente = sc.nextLine();
            System.out.println("Ingrese la antigüedad del cliente " + (i + 1) + ":");
            int antiguedad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre de la mascota " + (i + 1) + ":");
            String nombreMascota = sc.nextLine();
            System.out.println("Ingrese la edad de la mascota " + (i + 1) + ":");
            int edadMascota = sc.nextInt();
            
            clientes[i] = new Cliente(nroCliente, nombreCliente, antiguedad, nombreMascota, edadMascota);
        }
        
        //EJERCICIO 1:
        System.out.println("Cantidad de clientes: " + cantClientes);
        
        //EJERCICIO 2:
        int sumaEdad = 0;
        double promedioEdad = 0;
        
        for (int i = 0; i < clientes.length; i++) {
            sumaEdad += clientes[i].getEdadMascota();
        }
        
        promedioEdad = (double)sumaEdad / cantClientes;
        
        System.out.println("El promedio de edad de las mascotas es de: " + promedioEdad);
        
        
        //EJERCICIO 3:
        int clientesMayoresA5 = 0;
        for (int i = 0; i < clientes.length; i++) {
            
            if (clientes[i].getAntiguedad() >= 5) {
                clientesMayoresA5 ++;
            }
        }
        
        System.out.println("Hay " + clientesMayoresA5 + " clientes con una antiguedad mayor o igual a 5 años.");
    }
    
}
