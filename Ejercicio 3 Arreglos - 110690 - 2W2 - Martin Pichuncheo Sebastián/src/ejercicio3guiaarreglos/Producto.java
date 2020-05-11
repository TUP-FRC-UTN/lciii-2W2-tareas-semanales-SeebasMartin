package ejercicio3guiaarreglos;

public class Producto {
    private String descripcion;
    private Material[] materiales;

    public Producto(String descripcion, int cantElementos) {
        this.descripcion = descripcion;
        materiales = new Material[cantElementos];
    }
    
    public void agregarMaterial(Material m)
    {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = m;
            }
            
        }
    }
    
    public double costoTotal(){
        int acumuladorValores = 0;
                
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                acumuladorValores += materiales[i].getValorUnitario();
            }
        }
        
        return acumuladorValores;
    }
    
    public boolean formaParte(int codigo){
        boolean formaParte = false;
        for (int i = 0; i < materiales.length; i++) {
           if (codigo == materiales[i].getCodigo()   && materiales[i] != null) {
                formaParte = true;
            }
        }
        
        return formaParte;
    }
    
    public Material[] valorUnitarioMenor(int parametro)
    {
        Material[] materialmenor = null;
        int contadormenor = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].getValorUnitario() < parametro  && materiales[i] != null) {
                materialmenor = new Material[i];
            }
        }
        
        return materialmenor;
    }
    
    public int[] cantMaterialesXPrecio()
    {
        int primercasillero = 0;
        int segundocasillero = 0;
        int tercercasillero = 0;
        int cuartocasillero = 0;
        int[] casilleros = null;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && 0 < materiales[i].getValorUnitario() && materiales[i].getValorUnitario() <= 10) {
                primercasillero++;
            }
            if (materiales[i] != null && 10 < materiales[i].getValorUnitario() && materiales[i].getValorUnitario() <= 20) {
                segundocasillero++;
            }
            if (materiales[i] != null && 20 < materiales[i].getValorUnitario() && materiales[i].getValorUnitario() <= 30) {
                tercercasillero++;
            }
            if (materiales[i] != null && materiales[i].getValorUnitario() > 30) {
                cuartocasillero++;
            }
        }
        casilleros[0]=primercasillero;
        casilleros[1]=segundocasillero;
        casilleros[2]=tercercasillero;
        casilleros[4]=cuartocasillero;
        return casilleros;
    }
    
}
