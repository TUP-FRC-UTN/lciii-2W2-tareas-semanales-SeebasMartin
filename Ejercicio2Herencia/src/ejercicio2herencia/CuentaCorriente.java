package ejercicio2herencia;

public class CuentaCorriente extends Cuenta{
    private double acuerdo;

    public CuentaCorriente(double acuerdo, int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }

    public CuentaCorriente() {
    }

    public double getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(double acuerdo) {
        this.acuerdo = acuerdo;
    }
    
    public String EstaAcordado(double monto){
        if (super.getSaldo() - monto > acuerdo) {
            super.Extraer(monto);
            return "Extraccion realizada correctamente. No supera el saldo negativo acordado. \nSu saldo actual es de: $" +super.getSaldo();
        }
        else return "No se puedo realizar la extraccion, supera el saldo negativo acordado.";
    }
}
