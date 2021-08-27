package model.recuperacion;

public class CafeExportacion extends Cafe{
    //Constantes
    public static final int CIF_BASE = 20;
    //Atributos
    private int cif;
    private boolean verde = false;

    //constructores
    public CafeExportacion(){
        super(PRECIO_BASE,PESO_BASE,CALIDAD_C_BASE);
        this.cif = CIF_BASE;
        verde = false;
    }

    public CafeExportacion(Double precioBase, Integer peso){ 
        super(precioBase, peso,CALIDAD_C_BASE);
        this.cif = CIF_BASE;
        verde = false;
    } 
    
    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde){
        super(precioBase, peso, calidadC);
        this.cif = cif;
        this.verde = verde;  
    }

    public double calcularPrecio(){
        double adicion = super.calcularPrecio();
        if (cif > 40){
            adicion += precioBase*0.3;
        }
        if (verde == true){
            adicion += 50;
        }
        return adicion;
    }
}
