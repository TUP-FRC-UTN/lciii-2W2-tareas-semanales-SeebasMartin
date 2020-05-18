package ejercicio2herencia;

public class CajaAhorro extends Cuenta{

    public CajaAhorro(int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
    }

    public CajaAhorro() {
    }
    
    
    public String SaldoSuficiente(double monto){
        String extraccion = "";
        if (super.getSaldo() < monto) {
            extraccion = "No se pudo realizar la extraccion, saldo insuficiente.";
        }
        
        else{
            super.Extraer(monto);
            extraccion = "Extraccion realizada correctamente. \nSu saldo actual es de: $" + super.getSaldo();
        }
        return extraccion;
    }
}
