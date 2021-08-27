package model;
//eredar extends
//Relación de la clase padre a la clase hija

public class Client extends User {
    private Wallet wallet;

    //Incicializarconstructor ctor
    //Relaci´n entre client y wallet
    public Client(String nNombre) {
        super();
        wallet = new Wallet();
        setNombre(nNombre);
    }

    
    public Wallet getWallet() {
        return wallet;
    }
     
}
