package model.recuperacion;

public class Cafe {
    //Constantes
    protected final static Double PRECIO_BASE = 100.0;
    protected final static char CALIDAD_C_BASE = 'F';
    protected final static Integer PESO_BASE = 5;

    //Atributos
    protected Double precioBase;
    protected char calidadC;
    protected Integer peso;

    public Cafe(){
        this(PRECIO_BASE,PESO_BASE,CALIDAD_C_BASE);
    }

    public Cafe(double precioBase, int peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.calidadC = CALIDAD_C_BASE;
    }

    public Cafe(double precioBase, int peso, char calidadC){
        this(precioBase, peso);
        comprobarCalidadC(calidadC);
        
    }

    public void comprobarCalidadC(char calidadC){ 
        if(calidadC >= 65 && calidadC < 70){ 
            this.calidadC=calidadC; 
        }else{ 
            this.calidadC=CALIDAD_C_BASE; 
        }
        
    }
     
    public double calcularPrecio(){ 
        // Código 
        Double adicion = 0.0;
        switch (calidadC){
            case 'A' : 
                adicion += 10;
                break; 
            case 'B' : 
                adicion += 8;
                break;
            case 'C' : 
                adicion += 6;
                break;
            case 'D' : 
                adicion += 5;
                break;
            case 'E' : 
                adicion += 3;
                break;
            case 'F' : 
                adicion += 1;
                break;
        }

        if(peso >= 0 && peso < 19){ 
            adicion += 10; 
        }else if(peso >= 20 && peso < 49){ 
            adicion += 50; 
        }else if(peso >=50 && peso < 80){ 
            adicion += 80; 
        }else if(peso > 79){ 
            adicion += 100; 
        }
        return precioBase + adicion; 
    }


}
