package test;

import javax.print.event.PrintEvent;

import org.graalvm.compiler.core.common.alloc.Trace;

import model.Client;

public class Test {
    //para arrancar las pruebas
    public static void main5(String[] args) {
        Test iniciarPruebas = new Test();
        iniciarPruebas.escenarioClient();
    }

    //Escenario de pruebas
    public void escenarioClient(){
        Client cliente1 = new Client("Oscar");
        boolean test1 = assetEquals("Esteban", cliente1.getNombre());
        //operador tenario
        //(condition)? responseTrue: responseFalse
        System.out.println((test1)? "Paso la prueba de nombre":"Error el nombre no es igual");
        boolean test2 = assetNotNull(cliente1.getWallet());
        System.out.println((test2)? "La wallet si existe":"La wallet no existe");
        
    }


    public boolean assetEquals(String expect, String received){
        if (expect.equalsIgnoreCase(received)) {
            return true;
        }
        return false;
    }

    public boolean assetNotNull(Object object){
        if (object != null){
            return true;
        }
        return false;
    }

   
}
