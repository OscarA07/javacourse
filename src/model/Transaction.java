package model;

public class Transaction {
    private int amount;
    private String fecha;

    /**
     * Tipo de transaccion 1 Ingresa de dinero 2 Retiro de dinero
     */
    private int type;
    private String description;

    /**
     * Método que costruye un objeto de la clase Transaction
     * @param amount valor del movimiento
     * @param fecha fecha en la cual se realiza el movimiento
     * @param type tipo de movimiento, 1 == ingreso, 2 == retiro.
     * @param description descripcion del movimiento
     */ 
    public Transaction(int amount, String fecha, int type, String description) {
        super();
        this.amount = amount;
        this.fecha = fecha;
        this.type = type;
        this.description = description;
    }

    /**
     * Retorna el valor del movimiento
     * @return
     */
    public int getAmount() {
        return amount;
    }
    
    /**
     * Retorna la fecha del movimiento
     * @return
     */
    public String getFecha() {
        return fecha;
    }
    
    /**
     * Retorna el tipo de transacción
     * @return
     */
    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    //metodo para imprimer los datos mejor
    public String toString(){
        return "Monto: $"+ amount+ " Fecha: "+fecha+ " Tipo: "+((type==1)?"Ingreso":"Egreso")+ " Descripción: "+description;
    }

}
