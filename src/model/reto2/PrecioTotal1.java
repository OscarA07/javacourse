package model.reto2;

public class PrecioTotal1 {
    /**
    * Atributos
    */ 
    private int totalPCs;
    private int totalLaptops;
    private int totalDesktops;
    /**lista (vector) de computadores 
    */ 
    private Computador[] computadores;
    /**
    * Constructor de la clase PrecioTotal
    * @param pPCs 
    */ 
    public PrecioTotal1(Computador[] pPCs){
        computadores = pPCs;
    }
    /** 
     *Metodo utilizado para mostrar los totales segun los elementos del inventario 
     */ 
    public void mostrarTotales() { 
        // Inicializacion de los atributos en 0
        totalPCs = 0;
        totalLaptops = 0;
        totalDesktops = 0; 
        /* Recorrido de la lista de computadores para acumular el precio usar instanceof para comparar el tipo de computador */ 
        for (Computador pc : computadores){
            if (pc instanceof PCLaptop) {
                totalLaptops += pc.calcularPrecio();                
            } else if (pc instanceof PCDesktop){
                totalDesktops += pc.calcularPrecio();
            }
        }
        totalPCs = totalLaptops + totalDesktops;
        System.out.println("El precio total de los computadores es de " + totalPCs); 
        System.out.println("La suma del precio de los Laptops es de " + totalLaptops); 
        System.out.println("La suma del precio de los Desktops es de " + totalDesktops);
    } 
} 