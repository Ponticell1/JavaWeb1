package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.List;
import java.util.ArrayList;

public class Inventario {
    private final String nomeAdmin;
    private final String passwordAdmin;
    private List<Giocattolo> Giocattolo=new ArrayList<>();

    //nel costruttore vanno specificati le credenziali per l'admin
    public Inventario(String nomeAdmin, String passwordAdmin) {
        this.nomeAdmin = nomeAdmin;
        this.passwordAdmin = passwordAdmin;
    }
    
    public void addGiocattolo(String nomeAdmin,String passwordAdmin,Giocattolo giocattolo){
        if (nomeAdmin==this.nomeAdmin && passwordAdmin==this.passwordAdmin) {
            Giocattolo.add(giocattolo);
        } else {
            System.out.println("Credenziali errate");
        }
    }
    public void removeGiocattolo(String nomeAdmin, String passwordAdmin, Giocattolo giocattolo) {
        if (nomeAdmin.equals(this.nomeAdmin) && passwordAdmin.equals(this.passwordAdmin)) {
            Giocattolo.remove(giocattolo);
        } else {
            System.out.println("Credenziali errate");
        }
    }
    public void stampaGiocattoli(){
        for (Giocattolo giocattolo : Giocattolo) {
            System.out.println(giocattolo);
        }
    }
}
