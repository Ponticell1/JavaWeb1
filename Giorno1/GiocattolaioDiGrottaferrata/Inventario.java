package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.List;
import java.util.ArrayList;

public class Inventario {
    private static Inventario instance = null;
    private final String nomeAdmin;
    private final String passwordAdmin;
    private List<Giocattolo> Giocattolo=new ArrayList<>();

    //private constructor
    private Inventario(String nomeAdmin, String passwordAdmin) {
        this.nomeAdmin = nomeAdmin;
        this.passwordAdmin = passwordAdmin;
    }

    //static method to get the single instance of the class
    public static Inventario getInstance(String nomeAdmin, String passwordAdmin) {
        if (instance == null) {
            instance = new Inventario(nomeAdmin, passwordAdmin);
        }
        return instance;
    }

    public void addGiocattolo(String nomeAdmin,String passwordAdmin,Giocattolo giocattolo){
        if (nomeAdmin==this.nomeAdmin && passwordAdmin==this.passwordAdmin) {
            Giocattolo.add(giocattolo);
        } else {
            System.out.println("Credenziali errate");
        }
    }
    public Giocattolo fetchGiocattolo(String nomeGiocattolo){
        for (Giocattolo giocattolo : Giocattolo) {
            if (giocattolo.getNome().equals(nomeGiocattolo)) {
                return giocattolo;
            }
        }
        return null;
    }
    public void removeGiocattolo(String nomeAdmin, String passwordAdmin, Giocattolo giocattolo) {
        if (nomeAdmin.equals(this.nomeAdmin) && passwordAdmin.equals(this.passwordAdmin)) {
            Giocattolo.remove(giocattolo);
        } else {
            System.out.println("Credenziali errate");
        }
    }
    public boolean isGiocattoloPresent(Giocattolo giocattolo){
        if (Giocattolo.contains(giocattolo)) {
            return true;
        } else {
            return false;
        }
    }
    public void stampaGiocattoli(){
        for (Giocattolo giocattolo : Giocattolo) {
            System.out.println(giocattolo);
        }
    }
}