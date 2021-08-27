package model.reto2;

// Fin de la solución 
// Esta clase es para las pruebas, no se debe subir como parte de la solución 
public class Add{
    public static void main(String[] args) throws Exception {
        Computador pPCs1[] = new Computador[1]; 
        pPCs1[0] = new Computador(); 
        PrecioTotal1 precioT1 = new PrecioTotal1(pPCs1); 
        precioT1.mostrarTotales();

        Computador pPCs2[] = new Computador[1]; 
        pPCs2[0] = new PCLaptop(); 
        PrecioTotal1 precioT2 = new PrecioTotal1(pPCs2); 
        precioT2.mostrarTotales();

        Computador pcs3[] = new Computador[2]; 
        pcs3[0] = new PCLaptop(); 
        pcs3[1] = new PCDesktop(); 
        PrecioTotal1 precioT3 = new PrecioTotal1(pcs3); 
        precioT3.mostrarTotales();

        Computador pcs4[] = new Computador[6]; 
        pcs4[0] = new PCLaptop(130000); 
        pcs4[1] = new PCDesktop(55000); 
        pcs4[2] = new PCLaptop(106000, 65000); 
        pcs4[3] = new PCDesktop(68000, 180000);
        pcs4[4] = new PCLaptop();
        pcs4[5] = new PCDesktop();
        PrecioTotal1 precioT4 = new PrecioTotal1(pcs4); 
        precioT4.mostrarTotales();
    }
}