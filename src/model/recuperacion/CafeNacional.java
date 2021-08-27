package model.recuperacion;

public class CafeNacional extends Cafe{
    //Constantes
    public static final boolean TOSTADO = false;

    //Atributos
    private boolean tostado;
    
    //Constructores
    public CafeNacional(){
        super(PRECIO_BASE,PESO_BASE,CALIDAD_C_BASE);
        this.tostado = TOSTADO;
    }

    public CafeNacional(Double precioBase, Integer peso){ 
        super(precioBase, peso, CALIDAD_C_BASE);
        this.tostado = TOSTADO;
    }
    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado){ 
        super(precioBase, peso, calidadC);
        this.tostado = tostado;
    } 
    // Métodos 

    public double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if (tostado == true){
            adicion += 50;
        }
        
        return adicion;
    }
}
