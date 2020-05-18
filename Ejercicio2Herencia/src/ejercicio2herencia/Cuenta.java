package ejercicio2herencia;

public class Cuenta {
    private int numero;
    private String nombre;
    private double saldo;

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Cuenta() {
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(double monto){
        this.saldo = saldo + monto;
    }
    
    public void Extraer(double monto){
        this.saldo = saldo - monto;
    }
}
