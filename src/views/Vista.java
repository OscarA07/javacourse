package views;

import model.Wallet;

public class Vista {
    public static void main(String[] args) {
        //Objeto  Wallet1 de la clase Wallet
        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet1.saveMoney(200000));
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.breakLimite());
        System.out.println(wallet1.saveMoney(600000));
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet2.getSaldo());
        System.out.println(wallet1.establecerMeta(900000));
        System.out.println(wallet1.establecerMeta(1900000));
        System.out.println(wallet1.saveMoney(1200000));
    }
}
