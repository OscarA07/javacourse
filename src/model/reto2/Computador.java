package model.reto2;

public class Computador {
        /** * Constantes */ 
    public static final double PRECIO_BASE = 1500000;
    public static final double PRECIO_MOUSE = 60000;
    public static final double PRECIO_HEADPHONE = 110000;
    /** * Atributos */
    private double precioBase;
    private double mouse;
    private double headphone;

     
    /** * Constructores */ 
    /** * Constructor de la clase sin parametros <p> 
    * inicializa los atributos asignandole a cada uno la constante correspondiente */
    public Computador(){
        super();
        this.precioBase = PRECIO_BASE;
        this.mouse = PRECIO_MOUSE;
        this.headphone = PRECIO_HEADPHONE;
    }
    
    /** * Constructor de la clase PC que usa dos parametros <p> 
    * El mouse se inicializa usando la constante PRECIO_MOUSE 
    * @param precioBase 
    * @param headphone 
    */
    public Computador(double precioBase, double headphone){
        super();
        this.precioBase = precioBase;
        this.mouse = PRECIO_MOUSE;
        this.headphone = headphone;
    }
    /** * Constructor de la clase PC que usa tres parametros 
    * @param precioBase 
    * @param headphone 
    * @param mouse 
    */ 
    public Computador(double precioBase, double mouse, double headphone){
        super();
        this.precioBase = precioBase;
        this.mouse = mouse;
        this.headphone = headphone;
    }
    /** * Metodo para calcular el total del precio del PC 
    * @return precioBase + mouse + headphone; 
    */ 
    public double calcularPrecio(){
        return precioBase + mouse + headphone;
    }
}
