package ejercicio2herencia;

import java.util.Scanner;

public class Ejercicio2Herencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoCuenta = 0;
        int numCuenta = 0;
        String nombreCuenta = "";
        double saldoCuenta = 0;
        int opcion = 0;
        double acuerdoCuenta = 0;
        double monto = 0;
        
        do{
            System.out.println("Seleccione qué tipo de cuenta tiene: \n1-Caja de ahorro \n2-Cuenta corriente \nIngrese una opcion correcta.");
            tipoCuenta = sc.nextInt();
        }while(tipoCuenta < 1 || tipoCuenta > 2);
        
        System.out.println("Ingrese el numero de la cuenta");
        numCuenta = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de la cuenta");
        nombreCuenta = sc.nextLine();
        System.out.println("Ingrese el saldo de la cuenta");
        saldoCuenta = sc.nextDouble();
        
        if(tipoCuenta == 1)
        {
            CajaAhorro ca = new CajaAhorro(numCuenta, nombreCuenta, saldoCuenta);
            do{
                System.out.println("MENU: \nSeleccione qué desea hacer: \n1-Depositar \n2-Extraer \nIngrese una opcion correcta.");
                opcion = sc.nextInt();
            }while(opcion < 1 || opcion > 2);
            
            if(opcion == 1 )
                {
                    System.out.println("Ingrese el monto que quiere depositar.");
                    monto = sc.nextInt();
                    ca.Depositar(monto);
                    System.out.println("Depósito realizado correctamente. Su saldo actual es: " + ca.getSaldo());
                }
                else
                {
                    System.out.println("Ingrese el monto que quiere extraer.");
                    monto = sc.nextInt();
                    System.out.println(ca.SaldoSuficiente(monto));
                }
        }
        else{
            do {
                System.out.println("Ingrese el acuerdo del maximo saldo negativo admisible. El numero debe ser ingresado en negativo.");
                acuerdoCuenta = sc.nextDouble();
            } while (acuerdoCuenta > 0);
                
            CuentaCorriente cc = new CuentaCorriente(acuerdoCuenta, numCuenta, nombreCuenta, saldoCuenta);
                
            do{
                System.out.println("MENU: \nSeleccione qué desea hacer: \n1-Depositar \n2-Extraer \nIngrese una opcion correcta.");
                opcion = sc.nextInt();
            }while(opcion < 1 || opcion > 2);
            if(opcion == 1 )
                {
                    System.out.println("Ingrese el monto que quiere depositar.");
                    monto = sc.nextInt();
                    cc.Depositar(monto);
                    System.out.println("Depósito realizado correctamente. Su saldo actual es: " + cc.getSaldo());
                }
                else
                {
                    System.out.println("Ingrese el monto que quiere extraer.");
                    monto = sc.nextInt();
                    System.out.println(cc.EstaAcordado(monto));
                }
        }
    }
}
