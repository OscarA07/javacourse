public class App {

    private String nombre;  //String la clase
    private int edad;       //Objetos de la clase
    private char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;  //estandar de segunda palabra en mayuscula



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //Operaciones matemáticas y tipos de Datos

        //crear variable local 
        String res = "Hola";   //Colocar siempre comillas dobles
        int resultado = 15 + 2;
        int resultado2 = 125 - 32;        
        double resultado3 = 25 / 3;
        float resultado4 = 58 * 21;
        int resultado5 = 21 % 9;

        //operarios unarios
        resultado++;    //resultado = resultado + 1
        resultado--;    //resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;

        //operadores logicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 <= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;
        respuesta = 12 < 5 && 4 > 1;    //unir dos verificaciones Y
        respuesta = 14 < 25 || 1 > 5;   //unir dos verificaciones O

        //operadores bit a bit
        // &
        // ^ exponencial

        //Estructuras de control
        if (respuesta) {
            //bloque de codigo
        }
        if (respuesta) {
            //bloque de codigo
        } else {
            //bloque de codigo
        }

    }
}
