package Giorno1.GiocattolaioDiGrottaferrata;

import java.util.List;
import java.util.ArrayList;

public class Inventario {
    private String nomeAdmin;
    private String passwordAdmin;
    private List<Giocattolo> Giocattolo=new ArrayList<>();

    //nel costruttore vanno specificati le credenziali per l'admin
    public Inventario(String nomeAdmin, String passwordAdmin) {
        this.nomeAdmin = nomeAdmin;
        this.passwordAdmin = passwordAdmin;
    }
    
}
