package model;

public class Proyecto { 

        private String proyecto;
        private int tiempo;
        private double monto;
        private double interes;

        public Proyecto()
        {
                proyecto = "Reto 1";
                tiempo = 0;
                monto = 0;
                interes = 0;

        }

        public String darNombreProyecto()
        {
                return proyecto;
        }

        public double calcularInteresSimple()
        {
                double interesSimple = monto * interes * tiempo;
                return interesSimple;
        }

        public double calcularInteresCompuesto()
        {
                double interesCompuesto = monto * (Math.pow(1 + interes, tiempo)- 1);
                return interesCompuesto;
        }

        public String compararProyectos (int pTiempo, double pMonto, double pInteres)
        {
                tiempo = pTiempo;
                monto = pMonto;
                interes = pInteres;
                /* Cálculo de la diferencia entre tipos de tasas */ 

                double respuesta = calcularInteresCompuesto( ) - calcularInteresSimple( ); 
                return "Resultado "+ respuesta;
        }

        public static void main6(String[] args) 
        {
                Proyecto resultadoInversion = new Proyecto(); 
                System.out.println(resultadoInversion.compararProyectos(24,2000000,5));

                Proyecto resultadoInversion2 = new Proyecto(); 
                System.out.println(resultadoInversion2.compararProyectos(1, 1000000, 1));

                Proyecto resultadoInversion3 = new Proyecto(); 
                System.out.println(resultadoInversion3.darNombreProyecto());
        }
}