package model;

//clases son publicas
public class Wallet {
    //constantes son publicas y por convención en mayusculas
    public static final int CAPACIDAD_MAXIMA = 1000000;
    
    
    //atributo son privados
    private int saldo;
    private boolean tieneLimite;

    //METODO CONSTRUCTOR O FUNCION
    //PARA CREAR LOS OBJETOS
    public Wallet() {
        super();
        saldo  = 0;
        tieneLimite = true;
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
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String takeMoney(int value){
        if (saldo < value){
            return "Saldo insuficiente";
        }
        saldo -= value;
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String breakLimite(){
        if(!tieneLimite){
            return "Tu cuenta no tien límites!";
        }
        if (saldo >= 10000){
            saldo -= 10000;
            setTieneLimite(false);
            return "Has roto los limites!";
        }
        return "No tiene saldo suficiente :(";
    }


}
