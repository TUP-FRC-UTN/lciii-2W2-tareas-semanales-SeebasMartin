package ejercicio2guiaarreglos;

public class Cliente {
    private int nroCliente;
    private String nombreCliente;
    private int antiguedad;
    private String nombreMascota;
    private int edadMascota;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public Cliente(int nroCliente, String nombreCliente, int antiguedad, String nombreMascota, int edadMascota) {
        this.nroCliente = nroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    
    public Cliente(){
        
    }

    @Override
    public String toString() {
        return "Cliente: " + "\nNúmero de cliente: " + nroCliente + "\nNombre de cliente: " + nombreCliente + "\n Antigüedad: " + antiguedad + "\nNombre de la mascota: " + nombreMascota + "\nEdad de la mascota: " + edadMascota;
    }
    
}
