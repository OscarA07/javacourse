package model;

import java.util.ArrayList;

//clases son publicas
public class Wallet {
    //constantes son publicas y por convención en mayusculas
    public static final int CAPACIDAD_MAXIMA = 1000000;
    
    
    //atributo son privados
    private int saldo;
    private boolean tieneLimite;
    private int meta;


    /**
     * Listas
     * array listas
     */


    private ArrayList<Transaction> movimientos;

    //METODO CONSTRUCTOR O FUNCION
    //PARA CREAR LOS OBJETOS
    public Wallet() {
        super();
        saldo  = 0;
        tieneLimite = true;
        meta = 0;
        movimientos = new ArrayList<>();
    }

    //metodos son publicos
    //traer datos con get
    public int getSaldo(){
        return saldo;
    }
    public boolean getTieneLimite(){
        return tieneLimite;
    }

    //los metodos no retornan valor se utiliza void
    public void setTieneLimite(boolean newTieneLimite){
        this.tieneLimite = newTieneLimite;
    }

    //comportamientos 
    public String saveMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite){
            return "No se puede superar el límite " + CAPACIDAD_MAXIMA;
        }
        saldo += value;
        Transaction ingreso = new Transaction(value, "hoy", 1, "Ingreso de Dinero");
        movimientos.add(ingreso);
        if (verificarMeta()){
            System.out.println("Has cumplido la meta");
        }
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String takeMoney(int value){
        if (saldo < value){
            return "Saldo insuficiente";
        }
        saldo -= value;
        Transaction retiro = new Transaction(value, "hoy", 2, "Retiro de Dinero");
        movimientos.add(retiro);
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String breakLimite(){
        if(!tieneLimite){
            return "Tu cuenta no tien limites!";
        }
        if (saldo >= 10000){
            saldo -= 10000;
            setTieneLimite(false);
            Transaction limite = new Transaction(10000, "hoy", 2, "Romper limites");
            movimientos.add(limite);
            return "Has roto los limites!";
        }
        return "No tiene saldo suficiente :(";
    }

    public boolean establecerMeta(int value){
        if(value == 0){
            meta = value;
            return true;
        }
        if (value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)){
            return false;
        }

        meta = value;
        return true;
    }

    public boolean verificarMeta(){
        if (meta == 0  || saldo < meta){
            return false;
        }
        return true;
    }

    //comparar walle entre usuarios
    public String compararCuenta(Wallet otraWallet){
        if(saldo == otraWallet.getSaldo()){
            return "Las cuentas tienen el mismo saldo";
        }
        if (saldo > otraWallet.getSaldo()) {
            return "La primera cuenta es mayor";
        }
        return "La segunda cuenta es mayor";
    }
    
    public void displayMovimientos(){
        for (Transaction movimiento : movimientos) {
            System.out.println(movimiento);                
            }
    }
}

