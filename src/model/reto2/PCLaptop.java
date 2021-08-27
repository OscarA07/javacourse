package model.reto2;

public class PCLaptop extends Computador {
    /** * Constantes */ 
    public final static int EXTRA_BATERY = 100000;
    public final static int EXTRA_CHARGER = 80000;  
    /** * Atributos */
    private int extraBatery;
    private int extraCharger;

    /** * Constructores */ 
    /** * Constructor 
     * * <p> 
     * * inicializa los atributos asingandole a cada uno la constante correspondiente 
    */ 
    public PCLaptop(){
        super();
        this.extraBatery = EXTRA_BATERY;
        this.extraCharger = EXTRA_CHARGER;
    }
    /** * Constructor de la clase PCLaptop que usa un parametro 
    * <p> 
    * El atributo extraCharger se inicializa usando la constante EXTRA_CHARGER 
    * 
    * @param extraBatery 
    */ 
    public PCLaptop(int extraBatery){
        super();
        this.extraBatery = extraBatery;
        this.extraCharger = EXTRA_CHARGER;    
    }
    /** * Constructor de la clase PC que usa tres parametros *
    * @param extraBatery 
    * @param extraCharger 
    */ 
    public PCLaptop(int extraBatery, int extraCharger){
        super();
        this.extraBatery = extraBatery;
        this.extraCharger = extraCharger;
    }
    /** 
    * Metodo sobrecargado desde la clase padre (PC) 
    * <p> 
    * 
    * @return super.calcularPrecio() + extraBatery + extraCharger; 
    */ 
    @Override public double calcularPrecio() { 
        return super.calcularPrecio() + extraBatery + extraCharger;

    } 
} 