package model.reto2;

public class PCDesktop extends Computador { 
    /** * Constantes */ 
    public static final int CAMERA = 80000;
    public static final int KEYBOARD = 160000;

    /** * Atributos */ 
    private int camera;
    private int keyboard;

    /** * Constructores */ 
    /** * Constructor 
    * <p> 
    * inicializa los atributos asingandole a cada uno la constante correspondiente 
    */ 
    public PCDesktop (){
        super();
        this.camera = CAMERA;
        this.keyboard = KEYBOARD;
    }
    /** 
    * Constructor de la clase PCDesktop que usa un parametro 
    * <p> 
    * El atributo keyboard se inicializa usando la constante KEYBOARD
    * 
    * @param camera 
    */ 
    public PCDesktop (int camera){
        super();
        this.camera = camera;
        this.keyboard = KEYBOARD;
    }
    /** 
    * Constructor de la clase PC que usa tres parametros
    * @param camera 
    * @param keyboard 
    */ 
    public PCDesktop (int camera, int keyboard){
        super();
        this.camera = camera;
        this.keyboard = keyboard;
    }
    /** 
    * Metodo sobrecargado desde la clase padre (PC) 
    * <p> 
    * 
    * @return super.calcularPrecio() + camera + keyboard; 
    */ 
    @Override public double calcularPrecio() { 
        return super.calcularPrecio() + camera + keyboard;
    } 
} 