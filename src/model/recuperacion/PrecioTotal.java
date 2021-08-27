package model.recuperacion;

public class PrecioTotal {
    //Atributos
    private double totalCafe;
    private double totalCafeNacional;
    private double totalCafeExportacion;

    private Cafe[] listacafe;

    //Constructor
    public PrecioTotal(Cafe[] pCafe) { 
    // Código 
        listacafe = pCafe;
    } 
    public void mostrarTotales() { 
    // Código
        totalCafe = 0;
        totalCafeNacional = 0;
        totalCafeExportacion = 0;

        for (Cafe cf : listacafe){
            if (cf instanceof Cafe){
                totalCafe += cf.calcularPrecio();
            }
            if (cf instanceof CafeExportacion){
                totalCafeExportacion += cf.calcularPrecio();
            }
            if (cf instanceof CafeNacional){
                totalCafeNacional += cf.calcularPrecio();
            }
        }
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional); 
        System.out.println("La suma del precio del café tipo exportación es de " + totalCafeExportacion);     
    } 
}
